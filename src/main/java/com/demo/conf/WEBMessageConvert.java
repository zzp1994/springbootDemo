package com.demo.conf;

import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;



@Configuration
public class WEBMessageConvert{
	
	
	 public HttpMessageConverters customConverters() {
	        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
	        FastJsonConfig fastJsonConfig = new FastJsonConfig();
	        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
	        fastConverter.setFastJsonConfig(fastJsonConfig);
	        return new HttpMessageConverters((HttpMessageConverter<?>) fastConverter);
	    }
	
	
	
}