package com.harunugur.resttemplate.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Country {

    public String country;
    public String countryCode;
    public String slug;
    public int newConfirmed;
    public int totalConfirmed;
    public int newDeaths;
    public int totalDeaths;
    public int newRecovered;
    public int totalRecovered;
    public Date date;
    public Premium premium;

}
