package com.mapbox.common.module.okhttp;

import Ac.j;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.HttpRequestErrorType;
import com.stub.StubApp;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import javax.net.ssl.SSLException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wc.C1881F;
import wc.InterfaceC1887d;
import wc.InterfaceC1888e;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0001%BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u001a\u0010\u000e\u001a\u0016\u0012\b\u0012\u00060\u0004j\u0002`\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0019\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R(\u0010\u000e\u001a\u0016\u0012\b\u0012\u00060\u0004j\u0002`\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/mapbox/common/module/okhttp/CallbackWrapper;", "Lwc/e;", "Lcom/mapbox/common/module/okhttp/OkHttpClientDetail;", "service", "", "id", "Lwc/d;", "call", "Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;", "callback", "Lkotlin/Function1;", "Lcom/mapbox/common/module/RequestId;", "", "Lcom/mapbox/common/module/RequestFinishedCallback;", "onRequestFinished", "<init>", "(Lcom/mapbox/common/module/okhttp/OkHttpClientDetail;JLwc/d;Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;Lkotlin/jvm/functions/Function1;)V", "Ljava/io/IOException;", "e", "onFailure", "(Lwc/d;Ljava/io/IOException;)V", "Lwc/F;", "response", "onResponse", "(Lwc/d;Lwc/F;)V", "cancel", "()V", "Lcom/mapbox/common/HttpRequestError;", "error", "(Lcom/mapbox/common/HttpRequestError;)V", "Lcom/mapbox/common/module/okhttp/OkHttpClientDetail;", "J", "Lwc/d;", "Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;", "Lkotlin/jvm/functions/Function1;", "requestError", "Lcom/mapbox/common/HttpRequestError;", "RequestCallback", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CallbackWrapper implements InterfaceC1888e {
    private final InterfaceC1887d call;
    private final RequestCallback callback;
    private final long id;
    private final Function1<Long, Unit> onRequestFinished;
    private HttpRequestError requestError;
    private final OkHttpClientDetail service;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;", "", "Lcom/mapbox/common/HttpRequestError;", "error", "", "onFailure", "(Lcom/mapbox/common/HttpRequestError;)V", "Lwc/d;", "call", "Lwc/F;", "response", "onResponse", "(Lwc/d;Lwc/F;)V", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface RequestCallback {
        void onFailure(HttpRequestError error);

        void onResponse(InterfaceC1887d call, C1881F response) throws IOException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CallbackWrapper(OkHttpClientDetail service, long j, InterfaceC1887d call, RequestCallback callback, Function1<? super Long, Unit> onRequestFinished) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(onRequestFinished, "onRequestFinished");
        this.service = service;
        this.id = j;
        this.call = call;
        this.callback = callback;
        this.onRequestFinished = onRequestFinished;
    }

    public final void cancel() {
        this.requestError = new HttpRequestError(HttpRequestErrorType.REQUEST_CANCELLED, StubApp.getString2(1937));
        ((j) this.call).d();
    }

    @Override // wc.InterfaceC1888e
    public void onFailure(InterfaceC1887d call, IOException e10) {
        HttpRequestError httpRequestError;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e10, "e");
        if (!((j) call).f348r || (httpRequestError = this.requestError) == null) {
            HttpRequestErrorType httpRequestErrorType = HttpRequestErrorType.OTHER_ERROR;
            if (e10 instanceof UnknownHostException ? true : e10 instanceof SSLException ? true : e10 instanceof UnknownServiceException ? true : e10 instanceof SocketException ? true : e10 instanceof ProtocolException) {
                httpRequestErrorType = HttpRequestErrorType.CONNECTION_ERROR;
            } else if (e10 instanceof InterruptedIOException) {
                httpRequestErrorType = HttpRequestErrorType.REQUEST_TIMED_OUT;
            }
            this.callback.onFailure(new HttpRequestError(httpRequestErrorType, String.valueOf(e10.getMessage())));
        } else {
            RequestCallback requestCallback = this.callback;
            Intrinsics.checkNotNull(httpRequestError);
            requestCallback.onFailure(httpRequestError);
        }
        this.onRequestFinished.invoke(Long.valueOf(this.id));
    }

    @Override // wc.InterfaceC1888e
    public void onResponse(InterfaceC1887d call, C1881F response) throws IOException {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            this.callback.onResponse(call, response);
        } catch (IOException e10) {
            onFailure(call, e10);
        } catch (Exception e11) {
            this.callback.onFailure(new HttpRequestError(HttpRequestErrorType.OTHER_ERROR, String.valueOf(e11.getMessage())));
        }
    }

    public final void cancel(HttpRequestError error) {
        this.requestError = error;
        ((j) this.call).d();
    }
}
