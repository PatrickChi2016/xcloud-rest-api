package com.fortex.xcloud.restapi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuoteServer {
    private MarketData MarketData;
    private ZeroMQ ZeroMQ;
    private String QuoteSource;

}
