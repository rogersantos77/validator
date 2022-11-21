package br.com.validator.constraints;

import am.ik.yavi.core.CustomConstraint;

import java.util.Date;

public class dateNotNullConstraint implements CustomConstraint<Date> {
    @Override
    public String defaultMessageFormat() {
        return "{0} must not be null";
    }

    @Override
    public String messageKey() {
        return "date.notNull";
    }

    @Override
    public boolean test(final Date s) {
        return s == null;
    }
}