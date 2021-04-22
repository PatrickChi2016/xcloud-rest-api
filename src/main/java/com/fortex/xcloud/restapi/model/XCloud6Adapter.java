package com.fortex.xcloud.restapi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class XCloud6Adapter {
    private String IP;
    private Integer Port;
    private String Username;
    private String Password;
    private Boolean EnableSSL;
    private Boolean EnableInMsgLog;
    private Boolean EnableOutMsgLog;
    private Integer ReconnectIntvMS;
}
