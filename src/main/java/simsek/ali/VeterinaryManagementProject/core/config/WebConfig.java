package simsek.ali.VeterinaryManagementProject.core.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Value("*")
    private String vetAppHost;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("https://illustrious-sprite-fc0fa6.netlify.app/")
                .allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}
