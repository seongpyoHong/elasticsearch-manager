package com.sphong.esmanager.cluster.controller;

import com.sphong.esmanager.kubernetes.dto.ClusterRequestDto;
import com.sphong.esmanager.common.SessionUsers;
import com.sphong.esmanager.cluster.service.ClusterService;
import com.sphong.esmanager.cluster.service.ClusterAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ClusterController {

    @Autowired
    private SessionUsers sessionUsers;
    @Autowired
    private ClusterService clusterService;
    @Autowired
    private ClusterAuthService clusterAuthService;

    @PostMapping("/set-cluster")
    public String setClusterConfig(@RequestBody ClusterRequestDto requestDto) throws IOException, InterruptedException {
        sessionUsers.setClusterName(requestDto.getClusterName());
        sessionUsers.setNodeRegion(requestDto.getNodeRegion());
        requestDto.setProjectId(sessionUsers.getProjectName());
        return clusterService.setClusterConfig(requestDto);
    }

    @PostMapping("/create-cluster")
    public String createCluster() throws IOException, InterruptedException {
        return clusterService.createCluster();
    }

    @PostMapping("/delete-cluster")
    public String deleteCluster() throws IOException, InterruptedException {
        return clusterService.deleteCluster();
    }

    @PostMapping("/get-cluster-auth")
    public String getAuth() throws IOException, InterruptedException {
        return clusterAuthService.getcloudAuth(sessionUsers.getProjectName(),
                sessionUsers.getClusterName(),
                sessionUsers.getNodeRegion());
    }
}
