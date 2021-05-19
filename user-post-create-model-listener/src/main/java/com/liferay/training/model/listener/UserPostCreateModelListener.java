package com.liferay.training.model.listener;

import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.training.monitor.service.EventService;
import com.liferay.training.registration.model.User_;

import java.util.Date;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author ces-user
 */
@Component(
	immediate = true,
	property = {
		// TODO enter required service properties
	},
	service = ModelListener.class
)
public class UserPostCreateModelListener extends BaseModelListener<User_> {

	// TODO enter required service methods
	@Override
	public void onAfterCreate(User_ model) throws ModelListenerException {
		// TODO Auto-generated method stub
		
		System.out.println("Create");
		
		long userId = model.getUserId();
		String userName = model.getUserName();
		Date eventDate=model.getCreateDate();
		String eventType = "Registration";
		String ipAddress = "0.0.0.0";
		
		try {
			_eventService.addEvent(userId, userName, eventDate, eventType, ipAddress, null);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Reference
    protected EventService _eventService;
}