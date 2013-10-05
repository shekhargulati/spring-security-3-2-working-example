package com.springapp.mvc;

import org.springframework.core.annotation.Order;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * Created with IntelliJ IDEA.
 * User: shekhargulati
 * Date: 06/10/13
 * Time: 12:48 AM
 * To change this template use File | Settings | File Templates.
 */
@Order(2)
public class WebMvcSecurityApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

    public WebMvcSecurityApplicationInitializer() {
        super(WebSecurityConfig.class);
    }

}
