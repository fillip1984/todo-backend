package org.home.productivity.todo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import lombok.extern.slf4j.Slf4j;

/**
 * Spring Web Mvc config
 */
@Configuration
@Slf4j
// WARNING: Do not add @EnableWebMvc as it will break serving html from
// controllers and also swagger
// See: https://github.com/springdoc/springdoc-openapi/issues/236
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        log.warn(
                "CORS has been enabled for local development with React at port 3000. THIS CORS CONFIGURATION SHOULD NOT GO TO QA OR PROD ENVIRONMENT");
        // See: https://www.baeldung.com/spring-cors
        // @formatter:off
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000")
                .allowedMethods("*")
                .allowedHeaders("*")
                .exposedHeaders("Content-Type", "Content-Disposition", "Pragma");
        // @formatter:on
    }

}
