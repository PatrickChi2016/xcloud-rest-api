package com.fortex.xcloud.restapi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MarketData {
    private String IP;
    private String Port;
    private String SenderID;
    private String Username;
    private String Password;
    private Boolean EnableSSL;
    private Boolean EnableInMsgLog;
    private Boolean EnableOutMsgLog;
    private Integer ReconnectIntvMS;
}
