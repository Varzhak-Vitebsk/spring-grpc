package com.epam.grpc.server;

import com.epam.grpc.proto.DataRequest;
import com.epam.grpc.proto.DataResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DataService {

    public DataResponse getData(DataRequest request) {
        return DataResponse.newBuilder()
            .setMessage("pong")
            .build();
    }

}
