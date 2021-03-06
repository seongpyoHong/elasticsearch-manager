package com.sphong.esmanager.kubernetes.dto.metadata;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class PodMetadataResponseDto {
    private String name;
    private String namespace;
    private String component;
    private String creationTime;

    @Builder
    public PodMetadataResponseDto(String name, String namespace, String component, String creationTime) {
        this.name = name;
        this.namespace = namespace;
        this.component = component;
        this.creationTime = creationTime;
    }
}