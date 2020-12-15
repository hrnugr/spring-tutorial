package com.harunugur.exceptions;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ApiError {

    private int statusCode;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd hh:mm:ss")
    private Date timestamp;
    private String message;
    private String description;

    public ApiError(int statusCode, Date timestamp, String message, String description) {
        this.statusCode = statusCode;
        this.timestamp = timestamp;
        this.message = message;
        this.description = description;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
