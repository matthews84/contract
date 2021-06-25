package com.whxisoft.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class FastJsonConfiguration {
    /**
     * 1.创建 FastJson 的消息转换器
     * 2.添加 FastJson 的配置信息
     * 3.在 FastJson 的消息转换器中添加配置信息
     * 4.把 FastJson 的消息转换器添加到 SpringBoot 中
     */
    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters() {
        // 1.创建 FastJson 的消息转换器
        FastJsonHttpMessageConverter fastJsonConverter = new FastJsonHttpMessageConverter();
        // 2.添加 FastJson 的配置信息
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(
                // 格式化输出
                SerializerFeature.PrettyFormat,
                // 防止循环引用
                SerializerFeature.DisableCircularReferenceDetect,
                // 空集合返回[],不返回null
                SerializerFeature.WriteNullListAsEmpty,
                // 空字符串返回"",不返回null
                SerializerFeature.WriteNullStringAsEmpty,
                // 输出值为null的字段
                SerializerFeature.WriteMapNullValue
        );

        // 处理中文乱码问题
        List<MediaType> mediaTypes = new ArrayList<>();
        mediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
        fastJsonConverter.setSupportedMediaTypes(mediaTypes);

        // 3.在 FastJson 的消息转换器中添加配置信息
        fastJsonConverter.setFastJsonConfig(fastJsonConfig);

        // 4.把 FastJson 的消息转换器添加到 SpringBoot 中
        return new HttpMessageConverters(fastJsonConverter);
    }
}