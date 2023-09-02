package awse.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MvcConfig.class}; // 스프링 MVC 설정 클래스
    }
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}