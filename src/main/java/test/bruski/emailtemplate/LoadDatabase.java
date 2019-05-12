package test.bruski.emailtemplate;

import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import test.bruski.emailtemplate.model.EmailTemplate;
import test.bruski.emailtemplate.repository.EmailTemplateRepository;

@Configuration
@Slf4j
class LoadDatabase {

  private static final Logger LOGGER = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(EmailTemplateRepository repository) {
    return args -> {
      LOGGER.info("Preloading " + repository.save(new EmailTemplate("Bilbo Baggins", "burglar", "blah")));
      LOGGER.info("Preloading " + repository.save(new EmailTemplate("Frodo Baggins", "thief", "blahblah")));
    };
  }
}