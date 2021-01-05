package com.harunugur.resttemplate.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Covid19 {

    public String message;
    public Global global;
    public List<Country> countries;
    public Date date;

}
