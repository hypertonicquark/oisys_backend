package cn.njcit.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Value("${userImageRoot}")
    String userImageRoot; // 注入头像图片根目录路径

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/face/**").addResourceLocations("file:/" + userImageRoot);//头像图片映射
    }

}
