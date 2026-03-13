package com.mapbox.common.module.okhttp;

import Ac.j;
import B3.s;
import Jc.f;
import Kc.C0104k;
import com.mapbox.bindgen.Value;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.HttpRequestErrorType;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.ResultCallback;
import com.mapbox.common.SettingsService;
import com.mapbox.common.SettingsServiceFactory;
import com.mapbox.common.SettingsServiceStorageType;
import com.mapbox.common.experimental.wss_backend.Data;
import com.mapbox.common.experimental.wss_backend.Request;
import com.mapbox.common.experimental.wss_backend.RequestObserver;
import com.mapbox.common.experimental.wss_backend.Service;
import com.mapbox.common.module.NetworkIdGenerator;
import com.stub.StubApp;
import f4.C0879c;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import l4.E0;
import sb.C1644e0;
import u5.d;
import wc.I;
import wc.q;
import wc.w;
import wc.x;
import wc.z;
import xc.b;
import zc.c;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020!0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010&\u001a\n %*\u0004\u0018\u00010$0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/mapbox/common/module/okhttp/WssBackend;", "Lcom/mapbox/common/experimental/wss_backend/Service;", "<init>", "()V", "", "pingTimeout", "", "setPingTimeout", "(J)V", "connectTimeout", "setConnectionTimeout", "Lcom/mapbox/common/experimental/wss_backend/Request;", "request", "Lcom/mapbox/common/experimental/wss_backend/RequestObserver;", "observer", "connect", "(Lcom/mapbox/common/experimental/wss_backend/Request;Lcom/mapbox/common/experimental/wss_backend/RequestObserver;)J", "id", "Lcom/mapbox/common/ResultCallback;", "callback", "cancelConnection", "(JLcom/mapbox/common/ResultCallback;)V", "Lcom/mapbox/common/experimental/wss_backend/Data;", "data", "write", "(JLcom/mapbox/common/experimental/wss_backend/Data;)V", "pingTimeoutMs", "J", "connectTimeoutMs", "Lwc/x;", "wssClient", "Lwc/x;", "", "Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;", "socketMap", "Ljava/util/Map;", "Lcom/mapbox/common/SettingsService;", "kotlin.jvm.PlatformType", "settings", "Lcom/mapbox/common/SettingsService;", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class WssBackend implements Service {
    private final SettingsService settings;
    private Map<Long, WebsocketObserverWrapper> socketMap;
    private x wssClient;
    public static final String TAG = StubApp.getString2(13790);
    public static final String verboseSettingName = StubApp.getString2(13800);
    private long pingTimeoutMs = 20000;
    private long connectTimeoutMs = 10000;

    public WssBackend() {
        w wVar = new w();
        TimeUnit unit = TimeUnit.SECONDS;
        wVar.a(10L, unit);
        Intrinsics.checkNotNullParameter(unit, "unit");
        wVar.f22455y = b.b(StubApp.getString2(9748), 20L, unit);
        this.wssClient = new x(wVar);
        this.socketMap = new LinkedHashMap();
        this.settings = SettingsServiceFactory.getInstance(SettingsServiceStorageType.NON_PERSISTENT);
    }

    @Override // com.mapbox.common.experimental.wss_backend.Service
    public void cancelConnection(long id, ResultCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        boolean areEqual = Intrinsics.areEqual(this.settings.get(StubApp.getString2(13800), new Value(false)).getValue(), new Value(true));
        String string2 = StubApp.getString2(13801);
        String string22 = StubApp.getString2(13790);
        if (areEqual) {
            MapboxCommonLogger.INSTANCE.logD$common_release(string22, string2 + id);
        }
        if (this.socketMap.containsKey(Long.valueOf(id))) {
            if (areEqual) {
                MapboxCommonLogger.INSTANCE.logD$common_release(string22, string2 + id + StubApp.getString2(13802));
            }
            WebsocketObserverWrapper websocketObserverWrapper = this.socketMap.get(Long.valueOf(id));
            Intrinsics.checkNotNull(websocketObserverWrapper);
            websocketObserverWrapper.setOnClosedCallback(callback);
            WebsocketObserverWrapper websocketObserverWrapper2 = this.socketMap.get(Long.valueOf(id));
            Intrinsics.checkNotNull(websocketObserverWrapper2);
            ((f) websocketObserverWrapper2.getWebSocket()).b(WebsocketObserverWrapper.INSTANCE.getWebsocketClosedNormalCode(), StubApp.getString2(13803));
            this.socketMap.remove(Long.valueOf(id));
            return;
        }
        if (areEqual) {
            MapboxCommonLogger.INSTANCE.logD$common_release(string22, string2 + id + StubApp.getString2(13804));
        }
        try {
            callback.run(false);
        } catch (Throwable unused) {
            if (areEqual) {
                MapboxCommonLogger.INSTANCE.logD$common_release(string22, string2 + id + StubApp.getString2(13805));
            }
        }
    }

    @Override // com.mapbox.common.experimental.wss_backend.Service
    public long connect(Request request, RequestObserver observer) {
        String string2 = StubApp.getString2(13806);
        Intrinsics.checkNotNullParameter(request, string2);
        Intrinsics.checkNotNullParameter(observer, "observer");
        long newId = NetworkIdGenerator.INSTANCE.newId();
        s sVar = new s(14);
        sVar.n(StubApp.getString2(595), null);
        String url = request.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "request.url");
        sVar.u(url);
        HashMap<String, String> headers = request.getHeaders();
        Intrinsics.checkNotNullExpressionValue(headers, "request.headers");
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            String name = entry.getKey();
            String value = entry.getValue();
            Intrinsics.checkNotNull(name);
            Intrinsics.checkNotNull(value);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            C0879c c0879c = (C0879c) sVar.f652d;
            c0879c.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            android.support.v4.media.session.b.f(name);
            android.support.v4.media.session.b.g(value, name);
            c0879c.k(name, value);
        }
        boolean areEqual = Intrinsics.areEqual(this.settings.get(StubApp.getString2(13800), new Value(false)).getValue(), new Value(true));
        WebsocketObserverWrapper listener = new WebsocketObserverWrapper(observer, newId, areEqual);
        z c10 = sVar.c();
        x okHttpClient = this.wssClient;
        okHttpClient.getClass();
        Intrinsics.checkNotNullParameter(c10, string2);
        Intrinsics.checkNotNullParameter(listener, "listener");
        c cVar = c.f24147h;
        Random random = new Random();
        int i3 = okHttpClient.f22460B;
        f fVar = new f(cVar, c10, listener, random, i3, okHttpClient.f22461C);
        Intrinsics.checkNotNullParameter(okHttpClient, "client");
        String string22 = StubApp.getString2(13807);
        if (c10.a(string22) != null) {
            fVar.c(new ProtocolException(StubApp.getString2(13808)), null);
        } else {
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            w wVar = new w();
            wVar.f22432a = okHttpClient.f22463a;
            wVar.f22433b = okHttpClient.f22464b;
            CollectionsKt__MutableCollectionsKt.addAll(wVar.f22434c, okHttpClient.f22465c);
            CollectionsKt__MutableCollectionsKt.addAll(wVar.f22435d, okHttpClient.f22466d);
            wVar.f22436e = okHttpClient.f22467e;
            wVar.f22437f = okHttpClient.f22468f;
            wVar.f22438g = okHttpClient.f22469g;
            wVar.f22439h = okHttpClient.f22470h;
            wVar.f22440i = okHttpClient.j;
            wVar.j = okHttpClient.f22471k;
            wVar.f22441k = okHttpClient.f22472l;
            wVar.f22442l = okHttpClient.f22473m;
            wVar.f22443m = okHttpClient.f22474n;
            wVar.f22444n = okHttpClient.f22475p;
            wVar.f22445o = okHttpClient.f22476q;
            wVar.f22446p = okHttpClient.f22477r;
            wVar.f22447q = okHttpClient.f22478s;
            wVar.f22448r = okHttpClient.f22479t;
            wVar.f22449s = okHttpClient.f22480v;
            wVar.f22450t = okHttpClient.f22481w;
            wVar.f22451u = okHttpClient.f22482x;
            wVar.f22452v = okHttpClient.f22483y;
            wVar.f22453w = okHttpClient.f22484z;
            wVar.f22454x = okHttpClient.f22459A;
            wVar.f22455y = i3;
            wVar.f22456z = okHttpClient.f22461C;
            wVar.f22431A = okHttpClient.f22462D;
            q eventListener = q.NONE;
            Intrinsics.checkNotNullParameter(eventListener, "eventListener");
            Intrinsics.checkNotNullParameter(eventListener, "<this>");
            C1644e0 c1644e0 = new C1644e0(eventListener, 17);
            Intrinsics.checkNotNullParameter(c1644e0, "<set-?>");
            wVar.f22436e = c1644e0;
            wVar.b(f.f3485w);
            x xVar = new x(wVar);
            s b2 = c10.b();
            String string23 = StubApp.getString2(13809);
            b2.l(string23, StubApp.getString2(13810));
            b2.l(StubApp.getString2(2411), string23);
            b2.l(StubApp.getString2(13811), fVar.f3491f);
            b2.l(StubApp.getString2(13812), StubApp.getString2(1722));
            b2.l(string22, StubApp.getString2(13813));
            z c11 = b2.c();
            j jVar = new j(xVar, c11, true);
            fVar.f3492g = jVar;
            Intrinsics.checkNotNull(jVar);
            jVar.e(new E0(12, fVar, c11));
        }
        listener.setWebSocket(fVar);
        this.socketMap.put(Long.valueOf(newId), listener);
        if (areEqual) {
            MapboxCommonLogger.INSTANCE.logD$common_release(StubApp.getString2(13790), StubApp.getString2(13814) + newId + StubApp.getString2(13815) + c10);
        }
        return newId;
    }

    public final void setConnectionTimeout(long connectTimeout) {
        this.connectTimeoutMs = connectTimeout;
        w wVar = new w();
        long j = this.connectTimeoutMs;
        TimeUnit unit = TimeUnit.MILLISECONDS;
        wVar.a(j, unit);
        long j3 = this.pingTimeoutMs;
        Intrinsics.checkNotNullParameter(unit, "unit");
        wVar.f22455y = b.b(StubApp.getString2(9748), j3, unit);
        this.wssClient = new x(wVar);
    }

    @Override // com.mapbox.common.experimental.wss_backend.Service
    public void setPingTimeout(long pingTimeout) {
        this.pingTimeoutMs = pingTimeout;
        w wVar = new w();
        long j = this.connectTimeoutMs;
        TimeUnit unit = TimeUnit.MILLISECONDS;
        wVar.a(j, unit);
        long j3 = this.pingTimeoutMs;
        Intrinsics.checkNotNullParameter(unit, "unit");
        wVar.f22455y = b.b(StubApp.getString2(9748), j3, unit);
        this.wssClient = new x(wVar);
    }

    @Override // com.mapbox.common.experimental.wss_backend.Service
    public void write(long id, Data data) {
        I webSocket;
        RequestObserver requestObserver;
        I webSocket2;
        Intrinsics.checkNotNullParameter(data, "data");
        boolean z2 = false;
        boolean areEqual = Intrinsics.areEqual(this.settings.get(StubApp.getString2(13800), new Value(false)).getValue(), new Value(true));
        String string2 = StubApp.getString2(13816);
        String string22 = StubApp.getString2(13790);
        if (areEqual) {
            MapboxCommonLogger.INSTANCE.logD$common_release(string22, string2 + id);
        }
        if (data.isByteArray()) {
            WebsocketObserverWrapper websocketObserverWrapper = this.socketMap.get(Long.valueOf(id));
            if (websocketObserverWrapper != null && (webSocket2 = websocketObserverWrapper.getWebSocket()) != null) {
                C0104k c0104k = C0104k.f3820d;
                ByteBuffer wrap = ByteBuffer.wrap(data.getByteArray());
                Intrinsics.checkNotNullExpressionValue(wrap, "wrap(data.byteArray)");
                Intrinsics.checkNotNullParameter(wrap, "<this>");
                byte[] bArr = new byte[wrap.remaining()];
                wrap.get(bArr);
                C0104k bytes = new C0104k(bArr);
                Intrinsics.checkNotNullParameter(bytes, "bytes");
                z2 = ((f) webSocket2).g(2, bytes);
            }
        } else {
            WebsocketObserverWrapper websocketObserverWrapper2 = this.socketMap.get(Long.valueOf(id));
            if (websocketObserverWrapper2 != null && (webSocket = websocketObserverWrapper2.getWebSocket()) != null) {
                String text = data.getString();
                Intrinsics.checkNotNullExpressionValue(text, "data.string");
                Intrinsics.checkNotNullParameter(text, "text");
                C0104k c0104k2 = C0104k.f3820d;
                z2 = ((f) webSocket).g(1, d.r(text));
            }
        }
        if (z2) {
            return;
        }
        if (areEqual) {
            MapboxCommonLogger.INSTANCE.logD$common_release(string22, string2 + id + StubApp.getString2(13817));
        }
        HttpRequestError httpRequestError = new HttpRequestError(HttpRequestErrorType.OTHER_ERROR, StubApp.getString2(13818));
        WebsocketObserverWrapper websocketObserverWrapper3 = this.socketMap.get(Long.valueOf(id));
        if (websocketObserverWrapper3 == null || (requestObserver = websocketObserverWrapper3.getRequestObserver()) == null) {
            return;
        }
        requestObserver.onFailed(id, httpRequestError, null);
    }
}
