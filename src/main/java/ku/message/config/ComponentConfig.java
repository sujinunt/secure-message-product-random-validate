package ku.message.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.modelmapper.ModelMapper;

@Configuration
public class ComponentConfig {

   @Bean
   public RestTemplate restTemplate(RestTemplateBuilder builder) {
       return builder.build();
   }
   
   @Bean
   public ModelMapper modelMapper() {
       return new ModelMapper();
   }

}
