package com.epam.grpc.server;

import com.epam.grpc.proto.DataRequest;
import com.epam.grpc.proto.DataResponse;
import com.epam.grpc.proto.DataServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
@RequiredArgsConstructor
public class GrpcDataServer extends DataServiceGrpc.DataServiceImplBase {

    private final DataService dataService;

    @Override
    public void getData(DataRequest request, StreamObserver<DataResponse> responseObserver) {
        responseObserver.onNext(dataService.getData(request));
        responseObserver.onCompleted();
    }

}
