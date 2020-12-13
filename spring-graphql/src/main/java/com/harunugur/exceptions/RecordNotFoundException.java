package com.harunugur.exceptions;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

import java.util.List;
import java.util.Map;

public class RecordNotFoundException extends RuntimeException implements GraphQLError {

    private String message;

    public RecordNotFoundException(String message) {
        super(message);
        this.message = message;
    }

    public RecordNotFoundException(String message, String message1) {
        super(message);
        this.message = message1;
    }

    public RecordNotFoundException(String message, Throwable cause, String message1) {
        super(message, cause);
        this.message = message1;
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.DataFetchingException;
    }
}
