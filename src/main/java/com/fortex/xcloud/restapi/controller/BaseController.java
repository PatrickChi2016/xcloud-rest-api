package com.fortex.xcloud.restapi.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fortex.xcloud.restapi.model.Config;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

@Slf4j
public class BaseController {
    @Value("${json.path}")
    private String jsonPath;
    protected Config readObject() throws IOException {
        return JSON.parseObject(new String(Files.readAllBytes(Paths.get(jsonPath))), Config.class);
    }

    protected void writeObject(Config config) throws IOException {
        Files.write(Paths.get(jsonPath), JSON.toJSONString(config, SerializerFeature.PrettyFormat).getBytes(StandardCharsets.UTF_8));
    }
}
