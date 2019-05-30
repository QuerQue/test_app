
package com.pik.contact.demo;

import com.pik.contact.domain.Contact;
import com.pik.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;


@Service
@Profile("demo")
public class DemoContacts {

    private ContactService contactService;

    @Autowired
    public DemoContacts(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostConstruct
    public void createDefaultContacts() {
        contactService.saveContact(new Contact("Aleksandra", "Aleksandra Jeden", "Project Manager", "ajeden@company.com", "123 456 7890", "ajeden90"));
        contactService.saveContact(new Contact("Tomasz", "Tomasz Cztery", "Business Analyst", "tomasz@company.com", "123 456 7891", "tjeden91"));
        contactService.saveContact(new Contact("Konrad", "Konrad Dwa", "Software Architect", "kdwa@company.com", "123 456 7892", "kdwa92"));
        contactService.saveContact(new Contact("Natalia", "Natalia Trzy", "Software Engineer", "ntrzy@company.com", "123 456 7893", "ntrzy93"));
        contactService.saveContact(new Contact("Jan", "Jan Piec", "Senior Software engineer", "jpiec@company.com", "123 567 8944", "jpiec94"));
        contactService.saveContact(new Contact("Piotr", "Piotr Szesc", "Quality Analyst", "pszesc@company.com", "123 456 7895", "pszesc95"));
        contactService.saveContact(new Contact("Tomasz", "Tomasz Cztery", "Business Analyst", "tomasz@company.com", "123 456 7891", "tjeden91"));
        contactService.saveContact(new Contact("Natalia", "Natalia Trzy", "Software Engineer", "ntrzy@company.com", "123 456 7893", "ntrzy93"));
        contactService.saveContact(new Contact("Aleksandra", "Aleksandra Jeden", "Project Manager", "ajeden@company.com", "123 456 7890", "ajeden90"));
        contactService.saveContact(new Contact("Jan", "Jan Piec", "Senior Software engineer", "jpiec@company.com", "123 567 8944", "jpiec94"));
        contactService.saveContact(new Contact("Piotr", "Piotr Szesc", "Quality Analyst", "pszesc@company.com", "123 456 7895", "pszesc95"));
        contactService.saveContact(new Contact("Konrad", "Konrad Dwa", "Software Architect", "kdwa@company.com", "123 456 7892", "kdwa92"));
    }
}
