package br.com.validator;

import am.ik.yavi.core.ConstraintViolations;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class ValidatorApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(ValidatorApplication.class, args);
    }

    @Override
    public void run(final String... args) {
        RegistrationRequest registrationRequest = new RegistrationRequest();
        registrationRequest.setTaxId("");
        registrationRequest.setName("");
        registrationRequest.setBirthday(new Date(2000, 01, 01));

        ConstraintViolations violations = RegistrationRequestValidator.rules().validate(registrationRequest);

        if (!violations.isValid()) violations.forEach(x -> System.out.println(x.message()));
    }
}