package test.bruski.emailtemplate.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class EmailTemplate {
    private @Id @GeneratedValue Long id;

    String title;
    String subject;
    String details;

    EmailTemplate() {}


    public EmailTemplate(String title, String subject, String details) {
        this.title = title;
        this.subject = subject;
        this.details = details;

    }
}
