package org.springframework.roo.addon.layers.service.addon;

import org.springframework.roo.classpath.details.ClassOrInterfaceTypeDetails;

public interface ServiceLayerTemplateService {
    public void addServiceToXmlConfiguration(
            ClassOrInterfaceTypeDetails serviceInterface,
            ClassOrInterfaceTypeDetails serviceClass);

    public void removeServiceFromXmlConfiguration(
            ClassOrInterfaceTypeDetails serviceInterface);
}
