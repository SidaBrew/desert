package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.*;

import java.nio.charset.Charset;
import java.util.List;

/***
 *  Created by shao.guangze on 2019/5/27
 */
@Configuration
public class MyWebMvcConfigurerAdapter extends WebMvcConfigurerAdapter {
    /**
     * 配置静态访问资源
     * @author sida
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        //访问内部的路径
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        //访问外部路径
        //registry.addResourceHandler("/my/**").addResourceLocations("file:D:/my/");
        super.addResourceHandlers(registry);

    }

    /**
     * 以前要访问一个页面需要先创建个Controller控制类，再写方法跳转到页面
     * 在这里配置后就不需要那么麻烦了，直接访问http://localhost:8080/login/loginJsp就跳转到login.htm页面了
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login/loginJsp").setViewName("login");
        registry.addViewController("/hello/helloJsp").setViewName("hello");
        registry.addViewController("/login/index").setViewName("index");
        registry.addViewController("/page/upload").setViewName("upload");
        super.addViewControllers(registry);
    }

    /**
     * 拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry){

        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截 excludePathPatterns("/类路径/接口路径")不需要加项目名；/**代表/a/或/a/b
      //  registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**").excludePathPatterns("/login/**","/hello/*", "/static/**");
        super.addInterceptors(registry);

    }

    @Bean
    public HttpMessageConverter<String> responseBodyConverter() {
        StringHttpMessageConverter converter = new StringHttpMessageConverter(
                Charset.forName("UTF-8"));
        return converter;
    }
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
        converters.add(responseBodyConverter());
    }
    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.favorPathExtension(false);
    }

}
