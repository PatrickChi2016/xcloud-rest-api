package com.fortex.xcloud.restapi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Config {
    private Startup Startup;
    private ClientSession ClientSession;
    private HTTPS_SSL HTTPS_SSL;
    private FTSConnections FTSConnections;
    private QuoteServer QuoteServer;
    private SecurityCheck SecurityCheck;
    private FortexNewsServer FortexNewsServer;
    private DDOSDefender DDOSDefender;
    //@JSONField(serializeUsing = StringToJsonSerializer.class)
    private BrowserDefinition BrowserDefinition;
}
