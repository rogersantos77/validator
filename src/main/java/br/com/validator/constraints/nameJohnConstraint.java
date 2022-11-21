package br.com.validator.constraints;

import am.ik.yavi.core.CustomConstraint;

public class nameJohnConstraint implements CustomConstraint<String> {
    @Override
    public String defaultMessageFormat() {
        return "{0} must contains John word";
    }

    @Override
    public String messageKey() {
        return "string.john";
    }

    @Override
    public boolean test(final String s) {
        return s.contains("John");
    }
}