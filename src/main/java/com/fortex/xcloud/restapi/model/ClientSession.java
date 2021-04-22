package com.fortex.xcloud.restapi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientSession {
    private Integer LoginTimeoutSec;
    private Integer MaxIdleSec;
    private Integer MaxMDDepth;
}
