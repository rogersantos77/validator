package br.com.validator;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class RegistrationRequest {
    private String taxId;
    private String name;
    private Date Birthday;
}