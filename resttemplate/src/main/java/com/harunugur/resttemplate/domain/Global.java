package com.harunugur.resttemplate.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonProperty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Global {

    public int newConfirmed;
    public int totalConfirmed;
    public int newDeaths;
    public int totalDeaths;
    public int newRecovered;
    public int totalRecovered;

}
