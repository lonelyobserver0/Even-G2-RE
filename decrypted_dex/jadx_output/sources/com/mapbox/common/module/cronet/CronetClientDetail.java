package com.mapbox.common.module.cronet;

import Kc.C0101h;
import com.google.android.gms.internal.measurement.L1;
import com.mapbox.common.HttpMethod;
import com.mapbox.common.ReadStream;
import com.mapbox.common.Scheduler;
import com.mapbox.common.SchedulerExecutorDispatcherKt;
import com.mapbox.common.SchedulerFactory;
import com.mapbox.common.ThreadServiceType;
import com.mapbox.common.http_backend.Request;
import com.mapbox.common.http_backend.RequestObserver;
import com.mapbox.common.module.HttpClientDetail;
import com.mapbox.common.module.RequestDetail;
import com.stub.StubApp;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J@\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u001a\u0010\u0011\u001a\u0016\u0012\b\u0012\u00060\rj\u0002`\u000e\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u0014H\u0016JH\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u001a\u0010\u0011\u001a\u0016\u0012\b\u0012\u00060\rj\u0002`\u000e\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u0014H\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/mapbox/common/module/cronet/CronetClientDetail;", "Lcom/mapbox/common/module/HttpClientDetail;", "fallback", "(Lcom/mapbox/common/module/HttpClientDetail;)V", "cronetEngine", "Lcom/mapbox/common/module/cronet/LazyEngine;", "executor", "Ljava/util/concurrent/Executor;", "buildRequest", "Lcom/mapbox/common/module/RequestDetail;", "request", "Lcom/mapbox/common/http_backend/Request;", "id", "", "Lcom/mapbox/common/module/RequestId;", "requestObserver", "Lcom/mapbox/common/http_backend/RequestObserver;", "onRequestFinished", "Lkotlin/Function1;", "", "Lcom/mapbox/common/module/RequestFinishedCallback;", "buildRequestWithEngine", "Lcom/mapbox/common/module/cronet/CronetRequestDetail;", "engine", "Lorg/chromium/net/CronetEngine;", "setMaxRequestsPerHost", "max", "", "supportsKeepCompression", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CronetClientDetail implements HttpClientDetail {
    private final LazyEngine cronetEngine;
    private final Executor executor;
    private final HttpClientDetail fallback;

    public CronetClientDetail(HttpClientDetail fallback) {
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        this.fallback = fallback;
        Scheduler threadPool = SchedulerFactory.threadPool();
        Intrinsics.checkNotNullExpressionValue(threadPool, "threadPool()");
        this.executor = SchedulerExecutorDispatcherKt.asExecutor(threadPool);
        this.cronetEngine = new LazyEngine(getExecutor());
    }

    private final CronetRequestDetail buildRequestWithEngine(CronetEngine engine, Request request, long id, RequestObserver requestObserver, Function1<? super Long, Unit> onRequestFinished) {
        ReadStream body;
        C0101h okioBuffer;
        Scheduler createSequenced = SchedulerFactory.createSequenced(ThreadServiceType.DEFAULT);
        Intrinsics.checkNotNullExpressionValue(createSequenced, "createSequenced(ThreadServiceType.DEFAULT)");
        Executor asExecutor = SchedulerExecutorDispatcherKt.asExecutor(createSequenced);
        UrlCallback urlCallback = new UrlCallback(id, requestObserver, onRequestFinished);
        UrlRequest.Builder newUrlRequestBuilder = engine.newUrlRequestBuilder(request.getUrl(), urlCallback, asExecutor);
        HashMap<String, String> headers = request.getHeaders();
        Intrinsics.checkNotNullExpressionValue(headers, "request.headers");
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            newUrlRequestBuilder.addHeader(entry.getKey(), entry.getValue());
        }
        String httpMethod = request.getMethod().toString();
        Intrinsics.checkNotNullExpressionValue(httpMethod, "request.method.toString()");
        String upperCase = httpMethod.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        newUrlRequestBuilder.setHttpMethod(upperCase);
        if (request.getMethod() == HttpMethod.POST && (body = request.getBody()) != null) {
            if (!headers.containsKey(StubApp.getString2(8450))) {
                String string2 = StubApp.getString2(466);
                if (!headers.containsKey(string2)) {
                    newUrlRequestBuilder.addHeader(string2, StubApp.getString2(1267));
                }
            }
            okioBuffer = CronetClientDetailKt.toOkioBuffer(body);
            byte[] A4 = okioBuffer.A(okioBuffer.f3819b);
            newUrlRequestBuilder.setUploadDataProvider(L1.l(0, A4.length, A4), asExecutor);
        }
        UrlRequest build = newUrlRequestBuilder.build();
        Intrinsics.checkNotNullExpressionValue(build, "requestBuilder.build()");
        return new CronetRequestDetail(build, urlCallback, request.getTimeout(), createSequenced);
    }

    @Override // com.mapbox.common.module.HttpClientDetail
    public RequestDetail buildRequest(Request request, long id, RequestObserver requestObserver, Function1<? super Long, Unit> onRequestFinished) {
        CronetRequestDetail buildRequestWithEngine;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(requestObserver, "requestObserver");
        Intrinsics.checkNotNullParameter(onRequestFinished, "onRequestFinished");
        CronetEngine engine = this.cronetEngine.getEngine();
        return (engine == null || (buildRequestWithEngine = buildRequestWithEngine(engine, request, id, requestObserver, onRequestFinished)) == null) ? this.fallback.buildRequest(request, id, requestObserver, onRequestFinished) : buildRequestWithEngine;
    }

    @Override // com.mapbox.common.module.HttpClientDetail
    /* renamed from: executor, reason: from getter */
    public Executor getExecutor() {
        return this.executor;
    }

    @Override // com.mapbox.common.module.HttpClientDetail
    public void setMaxRequestsPerHost(byte max) {
        this.fallback.setMaxRequestsPerHost(max);
    }

    @Override // com.mapbox.common.module.HttpClientDetail
    public boolean supportsKeepCompression() {
        return false;
    }
}
