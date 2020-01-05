/*package com.cbs.web.config;

import org.apache.commons.lang3.CharEncoding;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;

@Configuration
public class ThymeleafConfiguration {
	
	@Bean
    public ITemplateResolver webTemplateResolver() {
        ClassLoaderTemplateResolver webTemplateResolver = new ClassLoaderTemplateResolver();
        webTemplateResolver.setPrefix("templates/");
        webTemplateResolver.setSuffix(".html");
        webTemplateResolver.setTemplateMode("HTML5");
        webTemplateResolver.setCharacterEncoding(CharEncoding.UTF_8);
        webTemplateResolver.setOrder(1);
        return webTemplateResolver;
    }
 
  
}
*/