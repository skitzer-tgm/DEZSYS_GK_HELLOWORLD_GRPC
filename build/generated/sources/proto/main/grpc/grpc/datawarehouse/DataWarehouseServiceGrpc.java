package grpc.datawarehouse;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: hello.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataWarehouseServiceGrpc {

  private DataWarehouseServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "DataWarehouseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.datawarehouse.WarehouseRequest,
      grpc.datawarehouse.WarehouseData> getGetWarehouseDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getWarehouseData",
      requestType = grpc.datawarehouse.WarehouseRequest.class,
      responseType = grpc.datawarehouse.WarehouseData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.datawarehouse.WarehouseRequest,
      grpc.datawarehouse.WarehouseData> getGetWarehouseDataMethod() {
    io.grpc.MethodDescriptor<grpc.datawarehouse.WarehouseRequest, grpc.datawarehouse.WarehouseData> getGetWarehouseDataMethod;
    if ((getGetWarehouseDataMethod = DataWarehouseServiceGrpc.getGetWarehouseDataMethod) == null) {
      synchronized (DataWarehouseServiceGrpc.class) {
        if ((getGetWarehouseDataMethod = DataWarehouseServiceGrpc.getGetWarehouseDataMethod) == null) {
          DataWarehouseServiceGrpc.getGetWarehouseDataMethod = getGetWarehouseDataMethod =
              io.grpc.MethodDescriptor.<grpc.datawarehouse.WarehouseRequest, grpc.datawarehouse.WarehouseData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getWarehouseData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.datawarehouse.WarehouseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.datawarehouse.WarehouseData.getDefaultInstance()))
              .setSchemaDescriptor(new DataWarehouseServiceMethodDescriptorSupplier("getWarehouseData"))
              .build();
        }
      }
    }
    return getGetWarehouseDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataWarehouseServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataWarehouseServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataWarehouseServiceStub>() {
        @java.lang.Override
        public DataWarehouseServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataWarehouseServiceStub(channel, callOptions);
        }
      };
    return DataWarehouseServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static DataWarehouseServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataWarehouseServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataWarehouseServiceBlockingV2Stub>() {
        @java.lang.Override
        public DataWarehouseServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataWarehouseServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return DataWarehouseServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataWarehouseServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataWarehouseServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataWarehouseServiceBlockingStub>() {
        @java.lang.Override
        public DataWarehouseServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataWarehouseServiceBlockingStub(channel, callOptions);
        }
      };
    return DataWarehouseServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataWarehouseServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataWarehouseServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataWarehouseServiceFutureStub>() {
        @java.lang.Override
        public DataWarehouseServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataWarehouseServiceFutureStub(channel, callOptions);
        }
      };
    return DataWarehouseServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getWarehouseData(grpc.datawarehouse.WarehouseRequest request,
        io.grpc.stub.StreamObserver<grpc.datawarehouse.WarehouseData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWarehouseDataMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DataWarehouseService.
   */
  public static abstract class DataWarehouseServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DataWarehouseServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DataWarehouseService.
   */
  public static final class DataWarehouseServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DataWarehouseServiceStub> {
    private DataWarehouseServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataWarehouseServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataWarehouseServiceStub(channel, callOptions);
    }

    /**
     */
    public void getWarehouseData(grpc.datawarehouse.WarehouseRequest request,
        io.grpc.stub.StreamObserver<grpc.datawarehouse.WarehouseData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWarehouseDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DataWarehouseService.
   */
  public static final class DataWarehouseServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<DataWarehouseServiceBlockingV2Stub> {
    private DataWarehouseServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataWarehouseServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataWarehouseServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public grpc.datawarehouse.WarehouseData getWarehouseData(grpc.datawarehouse.WarehouseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWarehouseDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service DataWarehouseService.
   */
  public static final class DataWarehouseServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DataWarehouseServiceBlockingStub> {
    private DataWarehouseServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataWarehouseServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataWarehouseServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.datawarehouse.WarehouseData getWarehouseData(grpc.datawarehouse.WarehouseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWarehouseDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DataWarehouseService.
   */
  public static final class DataWarehouseServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DataWarehouseServiceFutureStub> {
    private DataWarehouseServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataWarehouseServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataWarehouseServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.datawarehouse.WarehouseData> getWarehouseData(
        grpc.datawarehouse.WarehouseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWarehouseDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_WAREHOUSE_DATA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_WAREHOUSE_DATA:
          serviceImpl.getWarehouseData((grpc.datawarehouse.WarehouseRequest) request,
              (io.grpc.stub.StreamObserver<grpc.datawarehouse.WarehouseData>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetWarehouseDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpc.datawarehouse.WarehouseRequest,
              grpc.datawarehouse.WarehouseData>(
                service, METHODID_GET_WAREHOUSE_DATA)))
        .build();
  }

  private static abstract class DataWarehouseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataWarehouseServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.datawarehouse.Hello.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataWarehouseService");
    }
  }

  private static final class DataWarehouseServiceFileDescriptorSupplier
      extends DataWarehouseServiceBaseDescriptorSupplier {
    DataWarehouseServiceFileDescriptorSupplier() {}
  }

  private static final class DataWarehouseServiceMethodDescriptorSupplier
      extends DataWarehouseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DataWarehouseServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DataWarehouseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataWarehouseServiceFileDescriptorSupplier())
              .addMethod(getGetWarehouseDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
