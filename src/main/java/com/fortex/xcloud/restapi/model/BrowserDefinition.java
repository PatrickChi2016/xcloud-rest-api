package com.fortex.xcloud.restapi.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BrowserDefinition {
   // @JSONField(serializeUsing = StringToJsonSerializer.class)
    @JSONField(name = "default")
    private Default Default;
    //@JSONField(serializeUsing = StringToJsonSerializer.class)
    private List<FortexCustom> custom;
}
