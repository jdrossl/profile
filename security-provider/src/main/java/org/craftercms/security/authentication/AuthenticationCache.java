/*
 * Copyright (C) 2007-2014 Crafter Software Corporation.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.craftercms.security.authentication;

/**
 * Cache for {@link org.craftercms.security.authentication.Authentication} objects.
 *
 * @author avasquez
 */
public interface AuthenticationCache {

    /**
     * Returns the cached authentication for the given ticket.
     */
    Authentication getAuthentication(String ticket);

    /**
     * Puts the specified authentication in the cache.
     */
    void putAuthentication(Authentication authentication);

    /**
     * Removes the authentication associated to the given ticket from the cache.
     */
    void removeAuthentication(String ticket);

}
