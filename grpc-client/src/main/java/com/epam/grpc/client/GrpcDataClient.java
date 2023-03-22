package com.epam.grpc.client;

import com.epam.grpc.proto.DataRequest;
import com.epam.grpc.proto.DataResponse;
import com.epam.grpc.proto.DataServiceGrpc.DataServiceBlockingStub;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class GrpcDataClient {

    @GrpcClient("grpc-server")
    private DataServiceBlockingStub dataServiceStub;

    public String getData(String message) {
        DataResponse response = dataServiceStub.getData(DataRequest.newBuilder()
            .setMessage(message)
            .build());
        return response.getMessage();
    }

}
