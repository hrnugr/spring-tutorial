package com.harunugur.annotations.drivers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OracleDriver implements DataBaseDriver{
    protected String url;
    protected String user;
    protected String password;
    protected String driver;
    protected Integer port;

    @Override
    public String getDriverInfo() {
        return "[ Driver: Oracle" +
                ", url: " + url +
                ", port; " + port +
                ", user: " + user +
                ", password: " + password  +
                ", driver: " + driver +
                " ] ";
    }

}
