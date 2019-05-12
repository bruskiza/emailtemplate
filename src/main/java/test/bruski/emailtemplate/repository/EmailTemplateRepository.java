package test.bruski.emailtemplate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.bruski.emailtemplate.model.EmailTemplate;

public interface EmailTemplateRepository extends JpaRepository<EmailTemplate, Long> {
}
