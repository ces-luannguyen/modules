package com.liferay.training.login.events.post;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.UserService;
import com.liferay.training.monitor.service.EventService;

import java.util.Date;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author ces-user
 */
@Component(
	immediate = true,
	property = {"key=login.events.post"
		// TODO enter required service properties
	},
	service = LifecycleAction.class
)
public class PostLoginEventListener implements LifecycleAction {

	// TODO enter required service methods
	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) 
			throws ActionException {
		

		System.out.println("Login");


		try {
			User user = userService.getCurrentUser();
			
			long userId = user.getUserId();
			String userName = user.getScreenName();
			Date eventDate = user.getLoginDate();
			String eventType = "Login";
			String ipAddress = user.getLastLoginIP();
			
			_eventService.addEvent(userId, userName, eventDate, eventType, ipAddress, null);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

				
			
	}
	
	@Reference
	protected UserService userService;
	@Reference
	protected EventService _eventService;
}
