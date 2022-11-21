package br.com.validator.constraints;

import am.ik.yavi.core.CustomConstraint;

public class notNullStringConstraint implements CustomConstraint<String> {
    @Override
    public String defaultMessageFormat() {
        return "{0} is required!";
    }

    @Override
    public String messageKey() {
        return "string.notNull";
    }

    @Override
    public boolean test(final String s) {
        return s == null;
    }
}