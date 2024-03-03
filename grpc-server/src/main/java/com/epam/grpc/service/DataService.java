package com.epam.grpc.service;

import com.epam.grpc.proto.DataRequest;
import com.epam.grpc.proto.DataResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DataService {

    public DataResponse getData(DataRequest request) {
        return DataResponse.newBuilder()
            .setMessage(responseSelector(request.getMessage()))
            .build();
    }

    private String responseSelector(String message) {
        return switch (message) {
            case ("ping") -> "pong";
            case ("pong") -> "ping";
            default -> "42";
        };
    }

}
