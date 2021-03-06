package com.sphong.esmanager.kubernetes.dto.status.state;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ContainerStateType {
    RUNNING("Running"), WAITING("Waiting"), TERMINATED("TERMINATED");
    private final String type;
}
