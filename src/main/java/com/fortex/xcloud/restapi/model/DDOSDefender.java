package com.fortex.xcloud.restapi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DDOSDefender {
    private Integer IpLockupThreshold;
    private Integer IpLockupDurationSec;
    private Integer InitMsgTimeoutSec;
    private Integer MaxPendingConn;
    private Integer MaxPendingConnOfBadIP;
    private Integer MaxPendingConnOfSingleIP;
}
