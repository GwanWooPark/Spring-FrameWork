package com.mvc.update.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.*;

public class WebConfig implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        // ApplicationConfig
        AnnotationConfigWebApplicationContext applicationConfig = new AnnotationConfigWebApplicationContext();
        applicationConfig.register(ApplicationConfig.class);

        // listener
        servletContext.addListener(new ContextLoaderListener(applicationConfig));

        // DispatcherConfig
        AnnotationConfigWebApplicationContext dispatcherConfig = new AnnotationConfigWebApplicationContext();
        dispatcherConfig.register(DispatcherConfig.class);

        ServletRegistration.Dynamic dispatcherServlet = servletContext.addServlet("dispatcherServlet", new DispatcherServlet(dispatcherConfig));
        dispatcherServlet.setLoadOnStartup(1);
        dispatcherServlet.addMapping("*.do");

        // filter
        FilterRegistration.Dynamic filterRegistration = servletContext.addFilter("encodingFilter", new CharacterEncodingFilter("UTF-8", true));
        filterRegistration.addMappingForUrlPatterns(null, true, "/*");

    }
}