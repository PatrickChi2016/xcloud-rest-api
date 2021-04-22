package com.fortex.xcloud.restapi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ZeroMQ {
    private String IP;
    private String Port;
    private Integer ReconnectIVL;
    private Integer ReceiveTimeOut;
    private String ISLog;
}
