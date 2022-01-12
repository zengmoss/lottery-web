package com.mama100.lotteryweb.util;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.util.List;

public abstract class JacksonUtil {
	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
	static {
		OBJECT_MAPPER.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		OBJECT_MAPPER.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
		OBJECT_MAPPER.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
		OBJECT_MAPPER.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
	}

	public static <T> T from(String content, Class<T> valueType){
		try {
			return OBJECT_MAPPER.readValue(content, valueType);
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public static <T> List<T> fromForList(String content, Class<T> valueType){
		try {
			return OBJECT_MAPPER.readValue(content,
					OBJECT_MAPPER.getTypeFactory().constructParametricType(List.class, valueType));
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public static <T> String to(T value){
		try {
			return OBJECT_MAPPER.writeValueAsString(value);
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}
}
