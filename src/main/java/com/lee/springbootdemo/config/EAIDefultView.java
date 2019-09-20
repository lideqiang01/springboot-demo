/*
package com.lee.springbootdemo.config;

import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

*/
/**
 * @author Administrator
 * @title: EAIDefultView
 * @projectName springboot-demo
 * @description: TODO
 * @date 2019/9/20 0020下午 14:41
 *//*

public class EAIDefultView extends WebMvcConfigurerAdapter {
    private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
           "classpath:/resources/",
            "classpath:/static/"};

    */
/**
     * 默认根路径访问页面
     *//*

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("redirect:/welcome.html");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }

    */
/**
     * 静态资源路径
     *//*

    @Override    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        if (!registry.hasMappingForPattern("/**")) {
            registry.addResourceHandler("/**").addResourceLocations(
                    CLASSPATH_RESOURCE_LOCATIONS);
        }
    }

}
*/
