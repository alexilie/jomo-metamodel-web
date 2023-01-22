package com.jomo.eorganism.metamodel.web.exception;

public class DatabaseNotFoundException extends RuntimeException {
    public DatabaseNotFoundException(String exception) {
        super(exception);
    }
}
