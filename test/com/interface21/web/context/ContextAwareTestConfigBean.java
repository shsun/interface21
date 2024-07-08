/*
 * ContextAwareTestConfigBean.java
 *
 * Created on 15 December 2001, 00:19
 */

package com.interface21.web.context;

import com.interface21.context.*;

/**
 * @author rod
 */
public class ContextAwareTestConfigBean extends TestConfigBean implements ApplicationContextAware {

    private String namespace;

    private ApplicationContext ctx;

    /**
     * Creates new ContextAwareTestConfigBean
     */
    public ContextAwareTestConfigBean() {
    }

    /**
     * Set the ApplicationContext object used by this object
     *
     * @param ctx ApplicationContext object used by this object
     * @throws ApplicationContextException if initialization attempted by this object
     *                                     after it has access to the WebApplicatinContext fails
     */
    public void setApplicationContext(ApplicationContext ctx) throws ApplicationContextException {
        this.ctx = ctx;
    }

    public ApplicationContext getApplicationContext() {
        return ctx;
    }

    public String getNamespace() {
        return namespace;
    }

}
