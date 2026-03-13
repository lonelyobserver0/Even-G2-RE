package com.mapbox.common.module;

import com.mapbox.common.http_backend.Request;
import com.mapbox.common.http_backend.RequestObserver;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0000\b`\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\t\u001a\u00020\n2\u001a\u0010\u000b\u001a\u0016\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0015H&¨\u0006\u0016"}, d2 = {"Lcom/mapbox/common/module/HttpClientDetail;", "", "buildRequest", "Lcom/mapbox/common/module/RequestDetail;", "request", "Lcom/mapbox/common/http_backend/Request;", "id", "", "Lcom/mapbox/common/module/RequestId;", "requestObserver", "Lcom/mapbox/common/http_backend/RequestObserver;", "onRequestFinished", "Lkotlin/Function1;", "", "Lcom/mapbox/common/module/RequestFinishedCallback;", "executor", "Ljava/util/concurrent/Executor;", "setMaxRequestsPerHost", "max", "", "supportsKeepCompression", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface HttpClientDetail {
    RequestDetail buildRequest(Request request, long id, RequestObserver requestObserver, Function1<? super Long, Unit> onRequestFinished);

    Executor executor();

    void setMaxRequestsPerHost(byte max);

    boolean supportsKeepCompression();
}
