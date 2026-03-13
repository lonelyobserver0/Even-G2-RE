package com.mapbox.common.module.cronet;

import Kc.C0101h;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.HttpRequestErrorType;
import com.mapbox.common.NetworkUsageMetricsMeter;
import com.mapbox.common.ResponseReadStream;
import com.mapbox.common.b;
import com.mapbox.common.http_backend.RequestObserver;
import com.mapbox.common.http_backend.ResponseData;
import com.stub.StubApp;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001?B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\n\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001e\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010 \u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b \u0010!J-\u0010$\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J#\u0010&\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b&\u0010!J-\u0010)\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J#\u0010+\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b+\u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R(\u0010\n\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082D¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001e\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0013088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lcom/mapbox/common/module/cronet/UrlCallback;", "Lorg/chromium/net/UrlRequest$Callback;", "", "id", "Lcom/mapbox/common/http_backend/RequestObserver;", "observer", "Lkotlin/Function1;", "Lcom/mapbox/common/module/RequestId;", "", "Lcom/mapbox/common/module/RequestFinishedCallback;", "onRequestFinished", "<init>", "(JLcom/mapbox/common/http_backend/RequestObserver;Lkotlin/jvm/functions/Function1;)V", "Lorg/chromium/net/UrlRequest;", "request", "Lkotlin/Function0;", "callback", "runCallback", "(Lorg/chromium/net/UrlRequest;Lkotlin/jvm/functions/Function0;)V", "Lcom/mapbox/common/HttpRequestError;", "reason", "setCancelReason", "(Lcom/mapbox/common/HttpRequestError;)V", "Lcom/mapbox/common/module/cronet/UrlCallback$StatusCallback;", "getStatus", "(Lcom/mapbox/common/module/cronet/UrlCallback$StatusCallback;)V", "Lorg/chromium/net/UrlResponseInfo;", "info", "", "newLocationUrl", "onRedirectReceived", "(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;Ljava/lang/String;)V", "onResponseStarted", "(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;)V", "Ljava/nio/ByteBuffer;", "byteBuffer", "onReadCompleted", "(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;Ljava/nio/ByteBuffer;)V", "onSucceeded", "Lorg/chromium/net/CronetException;", "exception", "onFailed", "(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;Lorg/chromium/net/CronetException;)V", "onCanceled", "J", "Lcom/mapbox/common/http_backend/RequestObserver;", "Lkotlin/jvm/functions/Function1;", "", "chunkSize", "I", "", "failed", "Z", "LKc/h;", "intermediateBuffer", "LKc/h;", "Ljava/util/concurrent/atomic/AtomicReference;", "cancelReason", "Ljava/util/concurrent/atomic/AtomicReference;", "statusCallback", "Lcom/mapbox/common/module/cronet/UrlCallback$StatusCallback;", "notifyObserverOnData", "Lkotlin/jvm/functions/Function0;", "StatusCallback", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class UrlCallback extends UrlRequest.Callback {
    private AtomicReference<HttpRequestError> cancelReason;
    private final int chunkSize;
    private boolean failed;
    private final long id;
    private final C0101h intermediateBuffer;
    private final Function0<Unit> notifyObserverOnData;
    private final RequestObserver observer;
    private final Function1<Long, Unit> onRequestFinished;
    private StatusCallback statusCallback;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/mapbox/common/module/cronet/UrlCallback$StatusCallback;", "", "onDone", "", "onRead", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface StatusCallback {
        void onDone();

        void onRead();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UrlCallback(long j, RequestObserver observer, Function1<? super Long, Unit> onRequestFinished) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        Intrinsics.checkNotNullParameter(onRequestFinished, "onRequestFinished");
        this.id = j;
        this.observer = observer;
        this.onRequestFinished = onRequestFinished;
        this.chunkSize = PKIFailureInfo.notAuthorized;
        this.intermediateBuffer = new C0101h();
        this.cancelReason = new AtomicReference<>(null);
        this.notifyObserverOnData = new Function0<Unit>() { // from class: com.mapbox.common.module.cronet.UrlCallback$notifyObserverOnData$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                RequestObserver requestObserver;
                long j3;
                requestObserver = UrlCallback.this.observer;
                j3 = UrlCallback.this.id;
                requestObserver.onData(j3);
            }
        };
    }

    private final void runCallback(UrlRequest request, Function0<Unit> callback) {
        try {
            if (this.failed) {
                return;
            }
            callback.invoke();
        } catch (Exception e10) {
            if (request != null ? request.isDone() : false) {
                return;
            }
            setCancelReason(new HttpRequestError(HttpRequestErrorType.OTHER_ERROR, E1.a.i(StubApp.getString2(13775), e10)));
            if (request != null) {
                request.cancel();
            }
        }
    }

    public final void getStatus(StatusCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.statusCallback = callback;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onCanceled(UrlRequest request, UrlResponseInfo info) {
        final HttpRequestError httpRequestError = this.cancelReason.get();
        if (httpRequestError == null) {
            httpRequestError = new HttpRequestError(HttpRequestErrorType.REQUEST_CANCELLED, StubApp.getString2(1937));
        }
        runCallback(request, new Function0<Unit>() { // from class: com.mapbox.common.module.cronet.UrlCallback$onCanceled$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                RequestObserver requestObserver;
                long j;
                UrlCallback.this.failed = true;
                requestObserver = UrlCallback.this.observer;
                j = UrlCallback.this.id;
                requestObserver.onFailed(j, httpRequestError);
            }
        });
        StatusCallback statusCallback = this.statusCallback;
        if (statusCallback != null) {
            statusCallback.onDone();
        }
        this.onRequestFinished.invoke(Long.valueOf(this.id));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r0 == null) goto L17;
     */
    @Override // org.chromium.net.UrlRequest.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onFailed(org.chromium.net.UrlRequest r4, org.chromium.net.UrlResponseInfo r5, org.chromium.net.CronetException r6) {
        /*
            r3 = this;
            com.mapbox.common.HttpRequestErrorType r5 = com.mapbox.common.HttpRequestErrorType.OTHER_ERROR
            boolean r0 = r6 instanceof org.chromium.net.NetworkException
            if (r0 == 0) goto L1d
            com.mapbox.common.HttpRequestErrorType r0 = com.mapbox.common.HttpRequestErrorType.CONNECTION_ERROR
            r1 = r6
            org.chromium.net.NetworkException r1 = (org.chromium.net.NetworkException) r1
            int r1 = r1.getErrorCode()
            r2 = 4
            if (r1 == r2) goto L1b
            r2 = 6
            if (r1 == r2) goto L1b
            r2 = 11
            if (r1 == r2) goto L1d
            r5 = r0
            goto L1d
        L1b:
            com.mapbox.common.HttpRequestErrorType r5 = com.mapbox.common.HttpRequestErrorType.REQUEST_TIMED_OUT
        L1d:
            if (r6 == 0) goto L3a
            java.lang.String r0 = r6.getMessage()
            if (r0 != 0) goto L38
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getSimpleName()
            r0 = 13776(0x35d0, float:1.9304E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            java.lang.String r0 = r0.concat(r6)
        L38:
            if (r0 != 0) goto L41
        L3a:
            r0 = 13777(0x35d1, float:1.9306E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
        L41:
            com.mapbox.common.HttpRequestError r6 = new com.mapbox.common.HttpRequestError
            r1 = 13778(0x35d2, float:1.9307E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            java.lang.String r0 = r1.concat(r0)
            r6.<init>(r5, r0)
            com.mapbox.common.module.cronet.UrlCallback$onFailed$1 r5 = new com.mapbox.common.module.cronet.UrlCallback$onFailed$1
            r5.<init>()
            r3.runCallback(r4, r5)
            com.mapbox.common.module.cronet.UrlCallback$StatusCallback r4 = r3.statusCallback
            if (r4 == 0) goto L60
            r4.onDone()
        L60:
            kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> r4 = r3.onRequestFinished
            long r5 = r3.id
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4.invoke(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.common.module.cronet.UrlCallback.onFailed(org.chromium.net.UrlRequest, org.chromium.net.UrlResponseInfo, org.chromium.net.CronetException):void");
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onReadCompleted(UrlRequest request, UrlResponseInfo info, ByteBuffer byteBuffer) {
        int i3;
        int write;
        Intrinsics.checkNotNull(byteBuffer);
        byteBuffer.flip();
        try {
            synchronized (this) {
                i3 = 0;
                do {
                    write = this.intermediateBuffer.write(byteBuffer);
                    i3 += write;
                } while (write > 0);
                Unit unit = Unit.INSTANCE;
            }
            byteBuffer.clear();
            Intrinsics.checkNotNull(request);
            request.read(byteBuffer);
            if (i3 > 0) {
                StatusCallback statusCallback = this.statusCallback;
                if (statusCallback != null) {
                    statusCallback.onRead();
                }
                runCallback(request, this.notifyObserverOnData);
            }
        } catch (IOException e10) {
            setCancelReason(new HttpRequestError(HttpRequestErrorType.OTHER_ERROR, b.h(StubApp.getString2(13779), e10)));
            if (request != null) {
                request.cancel();
            }
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onRedirectReceived(UrlRequest request, UrlResponseInfo info, String newLocationUrl) {
        if (request != null) {
            request.followRedirect();
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onResponseStarted(UrlRequest request, final UrlResponseInfo info) {
        if (request == null || info == null) {
            if (request != null) {
                request.cancel();
                return;
            }
            return;
        }
        Map<String, List<String>> allHeaders = info.getAllHeaders();
        Intrinsics.checkNotNullExpressionValue(allHeaders, "info.allHeaders");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, List<String>> entry : allHeaders.entrySet()) {
            if (entry.getValue().size() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "it.key");
            String lowerCase = ((String) key).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            linkedHashMap2.put(lowerCase, entry2.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap2.size()));
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(entry3.getKey(), (String) ((List) entry3.getValue()).get(0));
        }
        final HashMap hashMap = new HashMap(linkedHashMap3);
        NetworkUsageMetricsMeter.onHttpCodeReceived(info.getHttpStatusCode());
        runCallback(request, new Function0<Unit>() { // from class: com.mapbox.common.module.cronet.UrlCallback$onResponseStarted$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                RequestObserver requestObserver;
                long j;
                C0101h c0101h;
                requestObserver = UrlCallback.this.observer;
                j = UrlCallback.this.id;
                HashMap<String, String> hashMap2 = hashMap;
                int httpStatusCode = info.getHttpStatusCode();
                c0101h = UrlCallback.this.intermediateBuffer;
                requestObserver.onResponse(j, new ResponseData(hashMap2, httpStatusCode, new ResponseReadStream(c0101h)));
            }
        });
        request.read(ByteBuffer.allocateDirect(this.chunkSize));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onSucceeded(UrlRequest request, UrlResponseInfo info) {
        runCallback(request, new Function0<Unit>() { // from class: com.mapbox.common.module.cronet.UrlCallback$onSucceeded$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                RequestObserver requestObserver;
                long j;
                requestObserver = UrlCallback.this.observer;
                j = UrlCallback.this.id;
                requestObserver.onSucceeded(j);
            }
        });
        StatusCallback statusCallback = this.statusCallback;
        if (statusCallback != null) {
            statusCallback.onDone();
        }
        this.onRequestFinished.invoke(Long.valueOf(this.id));
    }

    public final void setCancelReason(HttpRequestError reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.cancelReason.set(reason);
    }
}
