package com.gree.hzapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.util.unit.DataSize;

import javax.servlet.MultipartConfigElement;

@SpringBootApplication
public class HzapiApplication {
    public static void main(String[] args) {

        SpringApplication.run(HzapiApplication.class, args);
    }

    /*SpringBoot默认限制上传文件大小不能超过1MB*/

    @Bean
    public MultipartConfigElement multipartConfigElement() {//java代码来配置bean
        MultipartConfigFactory factory = new MultipartConfigFactory();
        /*factory.setMaxFileSize:设置单个文件的大小。
        factory.setMaxRequestSize:设置总上传的数据大小*/
        factory.setMaxFileSize(DataSize.ofMegabytes(20));
        factory.setMaxRequestSize(DataSize.ofMegabytes(30));
        return factory.createMultipartConfig();
    }

}
