package com.mapbox.common.module.okhttp;

import Kc.C0101h;
import Kc.InterfaceC0103j;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.ResponseReadStream;
import com.mapbox.common.http_backend.RequestObserver;
import com.mapbox.common.http_backend.ResponseData;
import com.mapbox.common.module.okhttp.CallbackWrapper;
import da.F;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wc.C1881F;
import wc.InterfaceC1887d;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\n\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R(\u0010\n\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/mapbox/common/module/okhttp/HttpCallback;", "Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;", "", "id", "Lcom/mapbox/common/http_backend/RequestObserver;", "observer", "Lkotlin/Function1;", "Lcom/mapbox/common/module/RequestId;", "", "Lcom/mapbox/common/module/RequestFinishedCallback;", "onRequestFinished", "<init>", "(JLcom/mapbox/common/http_backend/RequestObserver;Lkotlin/jvm/functions/Function1;)V", "Lcom/mapbox/common/HttpRequestError;", "error", "onFailure", "(Lcom/mapbox/common/HttpRequestError;)V", "Lwc/d;", "call", "Lwc/F;", "response", "onResponse", "(Lwc/d;Lwc/F;)V", "J", "Lcom/mapbox/common/http_backend/RequestObserver;", "Lkotlin/jvm/functions/Function1;", "chunkSize", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class HttpCallback implements CallbackWrapper.RequestCallback {
    private final long chunkSize;
    private final long id;
    private final RequestObserver observer;
    private final Function1<Long, Unit> onRequestFinished;

    /* JADX WARN: Multi-variable type inference failed */
    public HttpCallback(long j, RequestObserver observer, Function1<? super Long, Unit> onRequestFinished) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        Intrinsics.checkNotNullParameter(onRequestFinished, "onRequestFinished");
        this.id = j;
        this.observer = observer;
        this.onRequestFinished = onRequestFinished;
        this.chunkSize = 65536L;
    }

    @Override // com.mapbox.common.module.okhttp.CallbackWrapper.RequestCallback
    public void onFailure(HttpRequestError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.observer.onFailed(this.id, error);
    }

    @Override // com.mapbox.common.module.okhttp.CallbackWrapper.RequestCallback
    public void onResponse(InterfaceC1887d call, C1881F response) {
        HashMap generateOutputHeaders;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            C0101h c0101h = new C0101h();
            generateOutputHeaders = HttpCallbackKt.generateOutputHeaders(response);
            this.observer.onResponse(this.id, new ResponseData(generateOutputHeaders, response.f22328d, new ResponseReadStream(c0101h)));
            F f10 = response.f22331g;
            if (f10 != null) {
                try {
                    InterfaceC0103j I10 = f10.I();
                    boolean z2 = false;
                    while (!z2) {
                        long j = 0;
                        while (true) {
                            try {
                                long n10 = I10.n(this.chunkSize - j, c0101h);
                                if (n10 == -1) {
                                    z2 = true;
                                    break;
                                }
                                j += n10;
                                if (n10 != 8192 || j >= this.chunkSize) {
                                    break;
                                }
                            } finally {
                            }
                        }
                        if (j > 0) {
                            this.observer.onData(this.id);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(I10, null);
                    CloseableKt.closeFinally(f10, null);
                } finally {
                }
            }
            this.observer.onSucceeded(this.id);
        } finally {
            this.onRequestFinished.invoke(Long.valueOf(this.id));
        }
    }
}
