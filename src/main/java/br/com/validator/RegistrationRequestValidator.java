package br.com.validator;

import am.ik.yavi.builder.ValidatorBuilder;
import am.ik.yavi.core.Validator;
import br.com.validator.constraints.dateNotNullConstraint;
import br.com.validator.constraints.nameJohnConstraint;
import br.com.validator.constraints.notNullStringConstraint;

public class RegistrationRequestValidator {
    public static Validator<RegistrationRequest> rules() {
        return ValidatorBuilder.<RegistrationRequest>of()
                // .constraint(RegistrationRequest::getTaxId, "TaxId", c -> c.notNull().notEmpty())

                // I know there is a native "notNull" (above) ... just an example
                // This custom predicate works only the object is not null otherwise it is not even called.
                .constraint(RegistrationRequest::getTaxId, "TaxId", o -> o.predicate(new notNullStringConstraint()))

                .constraint(RegistrationRequest::getName, "Name", o -> o.predicate(new nameJohnConstraint()))

                // Uncomment this line
                //.constraint(RegistrationRequest::getBirthday, "Birthday", o -> o.predicate(new dateNotNullConstraint()))

                .failFast(false).build();
    }
}