package org.craftercms.security.utils.tenant;

/**
 * Utility interface that can be implemented to resolve the tenants usable by the application.
 *
 * @author avasquez
 */
public interface TenantsResolver {

    /**
     * Returns the tenants the application can use.
     *
     * @return the current tenants
     */
    String[] getTenants();

}
