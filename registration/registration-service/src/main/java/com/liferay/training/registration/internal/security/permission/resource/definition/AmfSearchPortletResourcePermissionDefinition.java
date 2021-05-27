package com.liferay.training.registration.internal.security.permission.resource.definition;

import com.liferay.exportimport.kernel.staging.permission.StagingPermission;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermissionLogic;
import com.liferay.portal.kernel.security.permission.resource.StagedPortletPermissionLogic;
import com.liferay.portal.kernel.security.permission.resource.definition.PortletResourcePermissionDefinition;
import com.liferay.training.registration.constants.RegistrationConstants;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author liferay
 */
@Component(
    immediate = true, 
    service = PortletResourcePermissionDefinition.class
)
public class AmfSearchPortletResourcePermissionDefinition
    implements PortletResourcePermissionDefinition {

    @Override
    public PortletResourcePermissionLogic[] getPortletResourcePermissionLogics() {

        return new PortletResourcePermissionLogic[] {
            new StagedPortletPermissionLogic(
                _stagingPermission,
                "com_liferay_training_search_web_AmfSearchPortlet")
        };
    }

    @Override
    public String getResourceName() {

        return RegistrationConstants.RESOURCE_NAME;
    }

    @Reference
    private StagingPermission _stagingPermission;

}
