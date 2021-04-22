package com.fortex.xcloud.restapi;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.fortex.xcloud.restapi.model.Config;
import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;


@SpringBootApplication
public class XcloudRestApiApplication {

    public static void main(String[] args) {
        /*
        try {

            Config config = JSON.parseObject(new String(Files.readAllBytes(Paths.get("D:/config.json"))), Config.class);
            System.out.println(JSON.toJSONString(config, SerializerFeature.PrettyFormat));
            Files.writeString(Paths.get("D:/new_config.json"), JSON.toJSONString(config, SerializerFeature.PrettyFormat));

        } catch (Exception e) {
            e.printStackTrace();
        }

         */
        SpringApplication.run(XcloudRestApiApplication.class, args);
    }

    /*
    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters() {
        //1、定义一个convert转换消息的对象
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        //2、添加fastjson的配置信息
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        //3、在convert中添加配置信息
        fastConverter.setFastJsonConfig(fastJsonConfig);
        //4、将convert添加到converters中
        HttpMessageConverter<?> converter = fastConverter;
        return new HttpMessageConverters(converter);
    }
    */
}
