/*
 * Copyright (C) 2007-2013 Crafter Software Corporation.
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
package org.craftercms.security.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.craftercms.security.utils.SecurityEnabledAware;

/**
 * Aspect that handles the {@link org.craftercms.security.annotations.RunIfSecurityEnabled} annotation
 *
 * @author Alfonso Vásquez
 */
@Aspect
public class RunIfSecurityEnabledAspect implements SecurityEnabledAware {

    private boolean securityEnabled;

    public void setSecurityEnabled(boolean securityEnabled) {
        this.securityEnabled = securityEnabled;
    }

    @Around("@annotation(org.craftercms.security.annotations.RunIfSecurityEnabled)")
    public Object runIfSecurityEnabled(ProceedingJoinPoint pjp) throws Throwable {
        if (securityEnabled) {
            return pjp.proceed();
        } else {
            return null;
        }
    }

}
