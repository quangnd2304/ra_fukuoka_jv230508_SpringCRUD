package com.ra.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//Cài đặt đây là lớp cấu hình của ứng dụng
@Configuration
//Cấu hình bật webmvc lên
@EnableWebMvc
//Cấu hình khởi tạo các bean trong package
@ComponentScan(basePackages = {"com.ra.controller","com.ra.model","com.ra.repositoryImp","com.ra.serviceImp"})
public class AppConfig implements WebMvcConfigurer {
    //Cấu hình ViewResolver là 1 bean trỏ vào thư mục chứa các trang jsp
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        //Cấu hình thư mục chứa các view (jsp)
        resolver.setPrefix("/views/");
        //Cấu hình phần mở rộng của view
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
