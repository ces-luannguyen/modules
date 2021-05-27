package com.liferay.training.registration.internal.security.permission.resource.definition;

import com.liferay.exportimport.kernel.staging.permission.StagingPermission;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermissionLogic;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.StagedModelPermissionLogic;
import com.liferay.portal.kernel.security.permission.resource.definition.ModelResourcePermissionDefinition;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.workflow.permission.WorkflowPermission;
import com.liferay.training.registration.constants.RegistrationConstants;
import com.liferay.training.registration.model.User_;
import com.liferay.training.registration.service.User_LocalService;

import java.util.function.Consumer;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author liferay
 */
@Component(
    immediate = true, 
    service = ModelResourcePermissionDefinition.class
)
public class User_ModelResourcePermissionDefinition
    implements ModelResourcePermissionDefinition<User_> {

    @Override
    public User_ getModel(long userId)
        throws PortalException {

        return _userLocalService.getUser_(userId);
    }

    @Override
    public Class<User_> getModelClass() {

        return User_.class;
    }

    @Override
    public PortletResourcePermission getPortletResourcePermission() {

        return _portletResourcePermission;
    }

    @Override
    public long getPrimaryKey(User_ user) {

        return user.getUserId();
    }

    @Override
    public void registerModelResourcePermissionLogics(
        ModelResourcePermission<User_> modelResourcePermission,
        Consumer<ModelResourcePermissionLogic<User_>> modelResourcePermissionLogicConsumer) {

        modelResourcePermissionLogicConsumer.accept(
            new StagedModelPermissionLogic<>(
                _stagingPermission,
                "com_liferay_training_search_web_AmfSearchPortlet",
                User_::getUserId));

        // Only enable if you use (optional) workflow support

        //    modelResourcePermissionLogicConsumer.accept(
        //        new WorkflowedModelPermissionLogic<>(
        //            _workflowPermission, modelResourcePermission,
        //            _groupLocalService, User_::getUser_Id));
    }

    @Reference
    private User_LocalService _userLocalService;

    @Reference
    private GroupLocalService _groupLocalService;

    @Reference(target = "(resource.name=" + RegistrationConstants.RESOURCE_NAME + ")")
    private PortletResourcePermission _portletResourcePermission;

    @Reference
    private StagingPermission _stagingPermission;

    @Reference
    private WorkflowPermission _workflowPermission;
}
