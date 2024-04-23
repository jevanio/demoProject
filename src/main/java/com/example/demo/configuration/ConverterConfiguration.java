package com.example.demo.configuration;

import com.google.cloud.spring.data.datastore.core.convert.DatastoreCustomConversions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

import static com.example.demo.configuration.DemoCustomConverter.JSON_NODE_STRING_CONVERTER;
import static com.example.demo.configuration.DemoCustomConverter.STRING_JSON_NODE_CONVERTER;

@Configuration
public class ConverterConfiguration {
    @Bean
    public DatastoreCustomConversions datastoreCustomConversions() {
        return new DatastoreCustomConversions(
                Arrays.asList(
                        STRING_JSON_NODE_CONVERTER,
                        JSON_NODE_STRING_CONVERTER
                )
        );
    }
}
