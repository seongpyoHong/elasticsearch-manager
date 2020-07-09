package com.sphong.esmanager.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sphong.esmanager.domain.helm.HelmValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@Component
public class YamlWriter {

    @Qualifier("yamlMapper")
    @Autowired
    private ObjectMapper mapper;

    public void writeYaml(HelmValues helmValues) throws IOException {
         mapper.writeValue(new File("test-output.yaml"),helmValues);
    }
}
