package cmo.aobai.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.sql.DataSource;

//@Configuration
//@EnableSwagger2
public class DruidConfig {

//    @Bean
//    public ServletRegistrationBean druidServlet(){
//        ServletRegistrationBean servletRegistrationBean=
//                new ServletRegistrationBean( new StatViewServlet(), "/druid/*" );
//        servletRegistrationBean.addInitParameter("loginUsername", "root");//用户名
//        servletRegistrationBean.addInitParameter("loginPassword", "root");//密码
//        servletRegistrationBean.addInitParameter("resetEnable", "false");//是否可以重置数据源
//        return servletRegistrationBean;
//    }
//
//
//    @Bean
//    public FilterRegistrationBean filterRegistrationBean(){
//        FilterRegistrationBean filterRegistrationBean=new
//                FilterRegistrationBean();
//        filterRegistrationBean.setFilter(new WebStatFilter());
//        filterRegistrationBean.addUrlPatterns("/*");
//        filterRegistrationBean.addInitParameter("exclusions",
//                "*.js,*.gif,*.jpg,*.css,/druid/*");
//        return filterRegistrationBean;
//    }
//
//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource druidDataSource(){
//        return new DruidDataSource();
//    }

}
