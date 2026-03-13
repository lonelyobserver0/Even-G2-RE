package com.mapbox.common.module.okhttp;

import Ac.j;
import B3.s;
import android.support.v4.media.session.b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mapbox.common.HttpMethod;
import com.mapbox.common.ReadStream;
import com.mapbox.common.http_backend.Request;
import com.mapbox.common.http_backend.RequestObserver;
import com.mapbox.common.module.HttpClientDetail;
import com.mapbox.common.module.RequestDetail;
import com.stub.StubApp;
import f4.C0879c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wc.AbstractC1879D;
import wc.C1877B;
import wc.C1878C;
import wc.x;
import wc.z;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J@\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\f\u001a\u00020\r2\u001a\u0010\u000e\u001a\u0016\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020\u00100\u000fj\u0002`\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/mapbox/common/module/okhttp/OkHttpClientDetail;", "Lcom/mapbox/common/module/HttpClientDetail;", "()V", "httpClient", "Lcom/mapbox/common/module/okhttp/LazyClient;", "buildRequest", "Lcom/mapbox/common/module/RequestDetail;", "request", "Lcom/mapbox/common/http_backend/Request;", "id", "", "Lcom/mapbox/common/module/RequestId;", "requestObserver", "Lcom/mapbox/common/http_backend/RequestObserver;", "onRequestFinished", "Lkotlin/Function1;", "", "Lcom/mapbox/common/module/RequestFinishedCallback;", "executor", "Ljava/util/concurrent/Executor;", "setMaxRequestsPerHost", "max", "", "supportsKeepCompression", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class OkHttpClientDetail implements HttpClientDetail {
    private final LazyClient httpClient = new LazyClient(null, false);

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HttpMethod.values().length];
            try {
                iArr[HttpMethod.HEAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HttpMethod.GET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HttpMethod.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.mapbox.common.module.HttpClientDetail
    public RequestDetail buildRequest(Request request, long id, RequestObserver requestObserver, Function1<? super Long, Unit> onRequestFinished) {
        String string2;
        String string22;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(requestObserver, "requestObserver");
        Intrinsics.checkNotNullParameter(onRequestFinished, "onRequestFinished");
        s sVar = new s(14);
        String url = request.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "request.url");
        sVar.u(url);
        String lowerCase = url.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        Intrinsics.checkNotNullParameter(Object.class, StubApp.getString2(660));
        if (lowerCase == null) {
            ((Map) sVar.f654f).remove(Object.class);
        } else {
            if (((Map) sVar.f654f).isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Intrinsics.checkNotNullParameter(linkedHashMap, "<set-?>");
                sVar.f654f = linkedHashMap;
            }
            Map map = (Map) sVar.f654f;
            Object cast = Object.class.cast(lowerCase);
            Intrinsics.checkNotNull(cast);
            map.put(Object.class, cast);
        }
        HashMap<String, String> headers = request.getHeaders();
        Intrinsics.checkNotNullExpressionValue(headers, "request.headers");
        Iterator<Map.Entry<String, String>> it = headers.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            string2 = StubApp.getString2(ModuleDescriptor.MODULE_VERSION);
            string22 = StubApp.getString2(1061);
            if (!hasNext) {
                break;
            }
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            Intrinsics.checkNotNullExpressionValue(key, "key");
            Intrinsics.checkNotNullExpressionValue(value, string22);
            Intrinsics.checkNotNullParameter(key, string2);
            Intrinsics.checkNotNullParameter(value, string22);
            C0879c c0879c = (C0879c) sVar.f652d;
            c0879c.getClass();
            Intrinsics.checkNotNullParameter(key, string2);
            Intrinsics.checkNotNullParameter(value, string22);
            b.f(key);
            b.g(value, key);
            c0879c.k(key, value);
        }
        if ((request.getFlags() & 1) != 0) {
            Intrinsics.checkNotNullParameter("Accept-Encoding", string2);
            Intrinsics.checkNotNullParameter("gzip, deflate", string22);
            C0879c c0879c2 = (C0879c) sVar.f652d;
            c0879c2.getClass();
            Intrinsics.checkNotNullParameter("Accept-Encoding", string2);
            Intrinsics.checkNotNullParameter("gzip, deflate", string22);
            b.f("Accept-Encoding");
            b.g("gzip, deflate", "Accept-Encoding");
            c0879c2.k("Accept-Encoding", "gzip, deflate");
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[request.getMethod().ordinal()];
        if (i3 == 1) {
            sVar.n(StubApp.getString2(13312), null);
        } else if (i3 == 2) {
            sVar.n(StubApp.getString2(595), null);
        } else if (i3 == 3) {
            ReadStream body = request.getBody();
            String string23 = StubApp.getString2(13314);
            String string24 = StubApp.getString2(9806);
            if (body == null) {
                C1877B c10 = C1878C.c(AbstractC1879D.Companion, new byte[0], null, 0, 7);
                Intrinsics.checkNotNullParameter(c10, string24);
                sVar.n(string23, c10);
            } else {
                StreamingRequestBody streamingRequestBody = new StreamingRequestBody(body, null);
                Intrinsics.checkNotNullParameter(streamingRequestBody, string24);
                sVar.n(string23, streamingRequestBody);
            }
        }
        z request2 = sVar.c();
        x xVar = this.httpClient.get();
        xVar.getClass();
        Intrinsics.checkNotNullParameter(request2, "request");
        j jVar = new j(xVar, request2, false);
        jVar.f339f.g(request.getTimeout(), TimeUnit.SECONDS);
        return new OkHttpRequestDetail(jVar, new CallbackWrapper(this, id, jVar, new HttpCallback(id, requestObserver, onRequestFinished), onRequestFinished));
    }

    @Override // com.mapbox.common.module.HttpClientDetail
    /* renamed from: executor */
    public Executor getExecutor() {
        return this.httpClient.get().f22463a.e();
    }

    @Override // com.mapbox.common.module.HttpClientDetail
    public void setMaxRequestsPerHost(byte max) {
        this.httpClient.setMaxRequestsPerHost(max);
    }

    @Override // com.mapbox.common.module.HttpClientDetail
    public boolean supportsKeepCompression() {
        return true;
    }
}
