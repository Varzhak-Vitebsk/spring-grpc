package com.epam.grpc.controller;

import com.epam.grpc.client.GrpcDataClient;
import lombok.RequiredArgsConstructor;
import org.checkerframework.common.reflection.qual.GetMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GrpcClientController {

    private final GrpcDataClient grpcClientService;

    @RequestMapping("/data")
    @GetMethod
    public String getData(@RequestParam String message) {
        return grpcClientService.getData(message);
    }

}
