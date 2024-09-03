package cn.njcit.config;

import cn.njcit.filter.AuthorityFilter;
import cn.njcit.filter.CORSFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig{
    @Bean
    public FilterRegistrationBean corsFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new CORSFilter());
        filterRegistrationBean.addUrlPatterns("*");
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean authFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new AuthorityFilter());
        filterRegistrationBean.addUrlPatterns("/studentManage/*","/courseManage/*","/attendsList/*");
        filterRegistrationBean.setOrder(2);
        return filterRegistrationBean;
    }
}