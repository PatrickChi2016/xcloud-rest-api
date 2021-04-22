package com.fortex.xcloud.restapi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TWS {
    private String IP;
    private Integer Port;
    private String SenderID;
    private String Username;
    private String Password;
    private Boolean EnableSSL;
    private Boolean EnableInMsgLog;
    private Boolean EnableOutMsgLog;
    private Integer ReconnectIntvMS;
}
