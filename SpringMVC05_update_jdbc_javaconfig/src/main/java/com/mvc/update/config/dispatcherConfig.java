package com.mvc.update.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.mvc.update")
// = <mvc:annotation-driven />
public class dispatcherConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
        // = <mvc:resources mapping="/resources/**" location="/resources/" />

    }

    @Bean
    public InternalResourceViewResolver viewResolver() {

        String prefix = "/WEB-INF/views/";
        String suffix = ".jsp";

        InternalResourceViewResolver resolver = new InternalResourceViewResolver();

        resolver.setPrefix(prefix);
        resolver.setSuffix(suffix);

        return resolver;

        /*
           <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
              <property name="prefix" value="/WEB-INF/views/" />
              <property name="suffix" value=".jsp" />
          </bean>
         */
    }

}
