package com.fortex.xcloud.restapi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Startup {
    private String ServiceURI;
    private String WWWRootPath;
    private String Timezone;
    private String[] TimezoneOptions;
    private Boolean CacheStaticFiles;
    private Boolean EnforceKillProcessToExit;
    private String HttpServiceURI;
    private Integer MaxRESTPayloadSize;
    private Integer MaxHttpHeaderSize;
    private Integer CompressionMinSizeByte;
    private String ServerPath;
}
