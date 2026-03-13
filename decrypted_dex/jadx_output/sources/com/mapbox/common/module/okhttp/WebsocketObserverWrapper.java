package com.mapbox.common.module.okhttp;

import Kc.C0101h;
import Kc.C0104k;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.HttpRequestErrorType;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.ResponseReadStream;
import com.mapbox.common.ResultCallback;
import com.mapbox.common.experimental.wss_backend.RequestObserver;
import com.mapbox.common.experimental.wss_backend.ResponseData;
import com.mapbox.common.experimental.wss_backend.WsOpCode;
import com.stub.StubApp;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import wc.C1881F;
import wc.I;
import wc.J;
import wc.s;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000 ;2\u00020\u0001:\u0001;B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fj\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u001bJ)\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010#\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\rH\u0016¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0017\u00100\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\"\u00105\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;", "Lwc/J;", "Lcom/mapbox/common/experimental/wss_backend/RequestObserver;", "requestObserver", "", "id", "", "verbose", "<init>", "(Lcom/mapbox/common/experimental/wss_backend/RequestObserver;JZ)V", "Lwc/F;", "response", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "generateOutputHeaders", "(Lwc/F;)Ljava/util/HashMap;", "Lwc/I;", "webSocket", "", "onOpen", "(Lwc/I;Lwc/F;)V", "LKc/k;", "bytes", "onMessage", "(Lwc/I;LKc/k;)V", "text", "(Lwc/I;Ljava/lang/String;)V", "", "t", "onFailure", "(Lwc/I;Ljava/lang/Throwable;Lwc/F;)V", "", "code", "reason", "onClosed", "(Lwc/I;ILjava/lang/String;)V", "Lcom/mapbox/common/experimental/wss_backend/RequestObserver;", "getRequestObserver", "()Lcom/mapbox/common/experimental/wss_backend/RequestObserver;", "J", "Z", "Lwc/I;", "getWebSocket", "()Lwc/I;", "setWebSocket", "(Lwc/I;)V", "LKc/h;", "buffer", "LKc/h;", "getBuffer", "()LKc/h;", "Lcom/mapbox/common/ResultCallback;", "onClosedCallback", "Lcom/mapbox/common/ResultCallback;", "getOnClosedCallback", "()Lcom/mapbox/common/ResultCallback;", "setOnClosedCallback", "(Lcom/mapbox/common/ResultCallback;)V", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class WebsocketObserverWrapper extends J {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int websocketClosedNormalCode = 1000;
    private final C0101h buffer;
    private final long id;
    public ResultCallback onClosedCallback;
    private final RequestObserver requestObserver;
    private final boolean verbose;
    public I webSocket;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper$Companion;", "", "()V", "websocketClosedNormalCode", "", "getWebsocketClosedNormalCode", "()I", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getWebsocketClosedNormalCode() {
            return WebsocketObserverWrapper.websocketClosedNormalCode;
        }

        private Companion() {
        }
    }

    public WebsocketObserverWrapper(RequestObserver requestObserver, long j, boolean z2) {
        Intrinsics.checkNotNullParameter(requestObserver, "requestObserver");
        this.requestObserver = requestObserver;
        this.id = j;
        this.verbose = z2;
        this.buffer = new C0101h();
    }

    private final HashMap<String, String> generateOutputHeaders(C1881F response) {
        HashMap<String, String> hashMap = new HashMap<>();
        s sVar = response.f22330f;
        int size = sVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            String lowerCase = sVar.b(i3).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            hashMap.put(lowerCase, sVar.d(i3));
        }
        return hashMap;
    }

    public final C0101h getBuffer() {
        return this.buffer;
    }

    public final ResultCallback getOnClosedCallback() {
        ResultCallback resultCallback = this.onClosedCallback;
        if (resultCallback != null) {
            return resultCallback;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onClosedCallback");
        return null;
    }

    public final RequestObserver getRequestObserver() {
        return this.requestObserver;
    }

    public final I getWebSocket() {
        I i3 = this.webSocket;
        if (i3 != null) {
            return i3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("webSocket");
        return null;
    }

    @Override // wc.J
    public void onClosed(I webSocket, int code, String reason) {
        String string2 = StubApp.getString2(13790);
        String string22 = StubApp.getString2(13791);
        String string23 = StubApp.getString2(13792);
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(reason, "reason");
        try {
            if (this.verbose) {
                MapboxCommonLogger.INSTANCE.logD$common_release(string2, string23 + code + StubApp.getString2("13793") + reason);
            }
            if (this.onClosedCallback != null) {
                if (code == websocketClosedNormalCode) {
                    getOnClosedCallback().run(true);
                    return;
                } else {
                    getOnClosedCallback().run(false);
                    return;
                }
            }
            this.requestObserver.onFailed(this.id, new HttpRequestError(HttpRequestErrorType.OTHER_ERROR, string22 + code + ' ' + reason), null);
        } catch (Throwable unused) {
            if (this.verbose) {
                MapboxCommonLogger.INSTANCE.logD$common_release(string2, StubApp.getString2(13794));
            }
        }
    }

    @Override // wc.J
    public void onFailure(I webSocket, Throwable t3, C1881F response) {
        String message;
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(t3, "t");
        if (this.verbose) {
            MapboxCommonLogger.INSTANCE.logD$common_release(StubApp.getString2(13790), StubApp.getString2(13795) + response + StubApp.getString2(81) + t3);
        }
        HttpRequestErrorType httpRequestErrorType = HttpRequestErrorType.OTHER_ERROR;
        if ((response == null || (message = response.f22327c) == null) && (message = t3.getMessage()) == null) {
            message = StubApp.getString2(440);
        }
        this.requestObserver.onFailed(this.id, new HttpRequestError(httpRequestErrorType, message), response != null ? Integer.valueOf(response.f22328d) : null);
    }

    @Override // wc.J
    public void onMessage(I webSocket, C0104k bytes) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.verbose) {
            MapboxCommonLogger.INSTANCE.logD$common_release(StubApp.getString2(13790), StubApp.getString2(13796) + bytes);
        }
        this.buffer.N(bytes);
        this.requestObserver.onData(this.id, WsOpCode.BINARY, true);
    }

    @Override // wc.J
    public void onOpen(I webSocket, C1881F response) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(response, "response");
        int i3 = response.f22328d;
        String string2 = StubApp.getString2(13790);
        if (i3 == 101) {
            if (this.verbose) {
                MapboxCommonLogger.INSTANCE.logD$common_release(string2, StubApp.getString2(13798));
            }
            this.requestObserver.onSwitchingProtocols(this.id);
        }
        HashMap<String, String> generateOutputHeaders = generateOutputHeaders(response);
        ResponseReadStream responseReadStream = new ResponseReadStream(this.buffer);
        int i10 = response.f22328d;
        ResponseData responseData = new ResponseData(generateOutputHeaders, i10, responseReadStream);
        if (this.verbose) {
            MapboxCommonLogger.INSTANCE.logD$common_release(string2, StubApp.getString2(13799) + i10 + '}');
        }
        this.requestObserver.onResponse(this.id, responseData);
    }

    public final void setOnClosedCallback(ResultCallback resultCallback) {
        Intrinsics.checkNotNullParameter(resultCallback, "<set-?>");
        this.onClosedCallback = resultCallback;
    }

    public final void setWebSocket(I i3) {
        Intrinsics.checkNotNullParameter(i3, "<set-?>");
        this.webSocket = i3;
    }

    @Override // wc.J
    public void onMessage(I webSocket, String text) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(text, "text");
        if (this.verbose) {
            MapboxCommonLogger.INSTANCE.logD$common_release(StubApp.getString2(13790), StubApp.getString2(13797) + text);
        }
        C0101h c0101h = this.buffer;
        byte[] bytes = text.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        c0101h.O(bytes);
        this.requestObserver.onData(this.id, WsOpCode.TEXT, true);
    }

    public /* synthetic */ WebsocketObserverWrapper(RequestObserver requestObserver, long j, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(requestObserver, j, (i3 & 4) != 0 ? false : z2);
    }
}
