package com.fortex.xcloud.restapi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SecurityCheck {
    private Boolean AllowRESTReqFromDiffIP;
    private Integer BlockUserAfterContinuousLoginFailureCnt;
    private Integer ContinuousLoginFailureUserBlockingTimeMin;
    private String[] CrossOriginResourceSharing;



}
