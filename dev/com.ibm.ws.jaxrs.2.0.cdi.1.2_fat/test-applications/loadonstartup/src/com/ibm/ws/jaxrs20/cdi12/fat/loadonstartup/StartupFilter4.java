/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.jaxrs20.cdi12.fat.loadonstartup;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;

@ApplicationScoped
public class StartupFilter4 implements ContainerRequestFilter {

    @Inject
    private StartupBean4 bean;

    @PostConstruct
    public void init() {
        System.out.println("StartupFilter4.PostConstruct.init: bean = " + bean);
    }

    public void filter(ContainerRequestContext requestContext) throws IOException {
        bean.run();
     }
}
