package test.bruski.emailtemplate.controller;


import org.springframework.web.bind.annotation.*;
import test.bruski.emailtemplate.exception.EmailTemplateNotFoundException;
import test.bruski.emailtemplate.model.EmailTemplate;
import test.bruski.emailtemplate.repository.EmailTemplateRepository;

import java.util.List;

@RestController
public class EmailTemplateController {

    private final EmailTemplateRepository repository;


    EmailTemplateController(EmailTemplateRepository emailTemplateRepository) {
        this.repository = emailTemplateRepository;
    }

    @PostMapping("/emailtemplates")
    EmailTemplate newEmailTemplate(@RequestBody EmailTemplate newEmailTemplate) {
        return repository.save(newEmailTemplate);
    }

    @GetMapping("/emailtemplates")
    List<EmailTemplate> all() {
        return repository.findAll();
    }

    @GetMapping("/emailtemplates/{id}")
    EmailTemplate one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new EmailTemplateNotFoundException(id));
    }



}
