package com.fortex.xcloud.restapi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FortexNewsServer {
    private String ServiceURI;
    private String Username;
    private String Password;
    private Integer NewsCacheHours;
    private Integer CalendarCacheDays;
    private Integer PastCalendarCacheDays;
}
