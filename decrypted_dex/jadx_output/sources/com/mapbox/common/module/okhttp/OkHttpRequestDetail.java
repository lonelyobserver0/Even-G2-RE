package com.mapbox.common.module.okhttp;

import Ac.j;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.module.RequestDetail;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import wc.InterfaceC1887d;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/mapbox/common/module/okhttp/OkHttpRequestDetail;", "Lcom/mapbox/common/module/RequestDetail;", "Lwc/d;", "call", "Lcom/mapbox/common/module/okhttp/CallbackWrapper;", "callback", "<init>", "(Lwc/d;Lcom/mapbox/common/module/okhttp/CallbackWrapper;)V", "", "start", "()V", "Lcom/mapbox/common/HttpRequestError;", "error", "cancel", "(Lcom/mapbox/common/HttpRequestError;)V", "Lwc/d;", "getCall", "()Lwc/d;", "Lcom/mapbox/common/module/okhttp/CallbackWrapper;", "getCallback", "()Lcom/mapbox/common/module/okhttp/CallbackWrapper;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class OkHttpRequestDetail implements RequestDetail {
    private final InterfaceC1887d call;
    private final CallbackWrapper callback;

    public OkHttpRequestDetail(InterfaceC1887d call, CallbackWrapper callback) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.call = call;
        this.callback = callback;
    }

    @Override // com.mapbox.common.module.RequestDetail
    public void cancel(HttpRequestError error) {
        if (error == null) {
            this.callback.cancel();
        } else {
            this.callback.cancel(error);
        }
    }

    public final InterfaceC1887d getCall() {
        return this.call;
    }

    public final CallbackWrapper getCallback() {
        return this.callback;
    }

    @Override // com.mapbox.common.module.RequestDetail
    public void start() {
        ((j) this.call).e(this.callback);
    }
}
