package com.sphong.esmanager.helm.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class StatefulSetConfig {
    private Integer replicaCount;
    private String heapSize;
    private String additionalJavaOpts;
    private String storage;
    private ResourceConfig resources;
}
