package com.liferay.training.monitor.internal.security.permission.resource.definition;

import com.liferay.exportimport.kernel.staging.permission.StagingPermission;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermissionLogic;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.StagedModelPermissionLogic;
import com.liferay.portal.kernel.security.permission.resource.definition.ModelResourcePermissionDefinition;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.workflow.permission.WorkflowPermission;
import com.liferay.training.monitor.constants.MonitorConstants;
import com.liferay.training.monitor.model.Event;
import com.liferay.training.monitor.service.EventLocalService;

import java.util.function.Consumer;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author liferay
 */
@Component(immediate = true, service = ModelResourcePermissionDefinition.class)
public class EventModelResourcePermissionDefinition
	implements ModelResourcePermissionDefinition<Event> {

	@Override
	public Event getModel(long eventId) throws PortalException {
		return _eventLocalService.getEvent(eventId);
	}

	@Override
	public Class<Event> getModelClass() {
		return Event.class;
	}

	@Override
	public PortletResourcePermission getPortletResourcePermission() {
		return _portletResourcePermission;
	}

	@Override
	public long getPrimaryKey(Event event) {
		return event.getEventId();
	}

	@Override
	public void registerModelResourcePermissionLogics(
		ModelResourcePermission<Event> modelResourcePermission,
		Consumer<ModelResourcePermissionLogic<Event>>
			modelResourcePermissionLogicConsumer) {

		modelResourcePermissionLogicConsumer.accept(
			new StagedModelPermissionLogic<>(
				_stagingPermission,
				"com_liferay_training_monitor_web_AmfEventMonitorPortlet",
				Event::getEventId));

		// Only enable if you use (optional) workflow support

		//    modelResourcePermissionLogicConsumer.accept(
		//        new WorkflowedModelPermissionLogic<>(
		//            _workflowPermission, modelResourcePermission,
		//            _groupLocalService, Event::getEventId));

	}

	@Reference
	private EventLocalService _eventLocalService;

	@Reference
	private GroupLocalService _groupLocalService;

	@Reference(
		target = "(resource.name=" + MonitorConstants.RESOURCE_NAME + ")"
	)
	private PortletResourcePermission _portletResourcePermission;

	@Reference
	private StagingPermission _stagingPermission;

	@Reference
	private WorkflowPermission _workflowPermission;

}