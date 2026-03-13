package G3;

import B3.i;
import B3.j;
import B3.s;
import C2.e;
import C3.f;
import I3.h;
import S3.D;
import T0.C0313d;
import a0.C0379a;
import android.media.AudioTrack;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.internal.measurement.C0657o0;
import com.google.android.gms.internal.measurement.X;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.maps.GeoJSONSourceData;
import com.mapbox.maps.MapLoadingError;
import com.mapbox.maps.MapLoadingErrorType;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleManager;
import com.stub.StubApp;
import i5.C1059c;
import ib.C1069c;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.logging.Logger;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import q4.k;
import sb.C1645f;
import sb.C1674t0;
import sb.V0;
import sb.W0;
import y3.g;
import z3.C2006b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2377a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2378b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2379c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2381e;

    public /* synthetic */ a(int i3, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f2377a = i3;
        this.f2378b = obj;
        this.f2379c = obj2;
        this.f2380d = obj3;
        this.f2381e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        Expected<String, None> expected;
        String error;
        String e10;
        BufferedWriter bufferedWriter;
        int i3 = 3;
        int i10 = 23;
        int i11 = 11;
        String str = null;
        r4 = null;
        r4 = null;
        BufferedWriter bufferedWriter2 = null;
        switch (this.f2377a) {
            case 0:
                j jVar = (j) this.f2379c;
                String str2 = jVar.f628a;
                g gVar = (g) this.f2380d;
                i iVar = (i) this.f2381e;
                b bVar = (b) this.f2378b;
                bVar.getClass();
                Logger logger = b.f2382f;
                String string2 = StubApp.getString2(2241);
                try {
                    f a3 = bVar.f2385c.a(str2);
                    if (a3 == null) {
                        String str3 = string2 + str2 + StubApp.getString2("2242");
                        logger.warning(str3);
                        gVar.c(new IllegalArgumentException(str3));
                    } else {
                        ((h) bVar.f2387e).p(new e(bVar, jVar, ((C2006b) a3).a(iVar), i3));
                        gVar.c(null);
                    }
                    return;
                } catch (Exception e11) {
                    logger.warning(StubApp.getString2(2243) + e11.getMessage());
                    gVar.c(e11);
                    return;
                }
            case 1:
                MapboxStyleManager style = (MapboxStyleManager) this.f2378b;
                Intrinsics.checkNotNullParameter(style, "$style");
                U6.c this$0 = (U6.c) this.f2379c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String dataId = (String) this.f2380d;
                Intrinsics.checkNotNullParameter(dataId, "$dataId");
                GeoJSONSourceData data = (GeoJSONSourceData) this.f2381e;
                Intrinsics.checkNotNullParameter(data, "$data");
                try {
                    expected = style.setStyleGeoJSONSourceData(this$0.f7217a, dataId, data);
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                    expected = null;
                }
                if ((expected == null || !expected.isError()) && th == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StubApp.getString2(2238), dataId);
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(2239));
                if (expected != null && (error = expected.getError()) != null) {
                    str = error;
                } else if (th != null) {
                    str = th.getMessage();
                }
                sb2.append(str);
                jSONObject.put(StubApp.getString2(1905), sb2.toString());
                String jSONObject2 = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "JSONObject().apply {\n   …\")\n          }.toString()");
                Date date = new Date();
                MapboxLogger.logE(StubApp.getString2(2240), jSONObject2);
                ((Handler) this$0.f7472i.getValue()).post(new a(2, style, jSONObject2, this$0, date));
                return;
            case 2:
                MapboxStyleManager style2 = (MapboxStyleManager) this.f2378b;
                Intrinsics.checkNotNullParameter(style2, "$style");
                String errorJsonString = (String) this.f2379c;
                Intrinsics.checkNotNullParameter(errorJsonString, "$errorJsonString");
                U6.c this$02 = (U6.c) this.f2380d;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Date errorTime = (Date) this.f2381e;
                Intrinsics.checkNotNullParameter(errorTime, "$errorTime");
                style2.getMapLoadingErrorDelegate().sendMapLoadingError(new MapLoadingError(MapLoadingErrorType.SOURCE, errorJsonString, this$02.f7217a, null, errorTime));
                return;
            case 3:
                C1059c c1059c = (C1059c) this.f2378b;
                String str4 = (String) ((AtomicMarkableReference) c1059c.f14848g).getReference();
                String str5 = (String) this.f2379c;
                e5.h hVar = (e5.h) c1059c.f14843b;
                if (str4 != null) {
                    hVar.i(str5, (String) ((AtomicMarkableReference) c1059c.f14848g).getReference());
                }
                Map map = (Map) this.f2380d;
                if (!map.isEmpty()) {
                    hVar.h(str5, map, false);
                }
                List list = (List) this.f2381e;
                if (list.isEmpty()) {
                    return;
                }
                String string22 = StubApp.getString2(2234);
                File k3 = hVar.f13617a.k(str5, StubApp.getString2(2235));
                try {
                    if (list.isEmpty()) {
                        e5.h.g(k3, StubApp.getString2(2236) + str5);
                        return;
                    }
                    try {
                        e10 = e5.h.e(list);
                        bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(k3), e5.h.f13616b));
                    } catch (Exception e12) {
                        e = e12;
                    }
                    try {
                        bufferedWriter.write(e10);
                        bufferedWriter.flush();
                        c5.f.b(bufferedWriter, string22);
                    } catch (Exception e13) {
                        e = e13;
                        bufferedWriter2 = bufferedWriter;
                        Log.w(StubApp.getString2("280"), StubApp.getString2("2237"), e);
                        e5.h.f(k3);
                        c5.f.b(bufferedWriter2, string22);
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedWriter2 = bufferedWriter;
                        c5.f.b(bufferedWriter2, string22);
                        throw th;
                    }
                    return;
                } catch (Throwable th4) {
                    th = th4;
                }
            case 4:
                hb.i iVar2 = (hb.i) this.f2378b;
                String str6 = (String) this.f2379c;
                String str7 = (String) this.f2380d;
                k kVar = (k) this.f2381e;
                try {
                    FirebaseAnalytics firebaseAnalytics = iVar2.f14495a;
                    if (firebaseAnalytics == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("analytics");
                        firebaseAnalytics = null;
                    }
                    C0657o0 c0657o0 = firebaseAnalytics.f12042a;
                    c0657o0.getClass();
                    c0657o0.a(new X(c0657o0, (String) null, str6, (Object) str7, false));
                    kVar.b(null);
                    return;
                } catch (Exception e14) {
                    kVar.a(e14);
                    return;
                }
            case 5:
                ib.e eVar = (ib.e) this.f2379c;
                k kVar2 = (k) this.f2381e;
                HashMap hashMap = C1069c.f14975c;
                C1069c c1069c = (C1069c) this.f2378b;
                c1069c.getClass();
                try {
                    String str8 = eVar.f14981a;
                    D.f(str8, StubApp.getString2("2232"));
                    String str9 = eVar.f14982b;
                    D.f(str9, StubApp.getString2("2233"));
                    R4.j jVar2 = new R4.j(str9, str8, eVar.f14986f, eVar.f14989i, eVar.f14983c, eVar.f14987g, eVar.f14984d);
                    try {
                        Looper.prepare();
                    } catch (Exception unused) {
                    }
                    String str10 = eVar.f14985e;
                    String str11 = (String) this.f2380d;
                    if (str10 != null) {
                        C1069c.f14975c.put(str11, str10);
                    }
                    R4.h i12 = R4.h.i(jVar2, c1069c.f14976a, str11);
                    k kVar3 = new k();
                    FlutterFirebasePlugin.cachedThreadPool.execute(new Ab.c(c1069c, i12, kVar3, 12));
                    kVar2.b((ib.f) a4.f.b(kVar3.f20051a));
                    return;
                } catch (Exception e15) {
                    kVar2.a(e15);
                    return;
                }
            case 6:
                C1645f callback = new C1645f(i11);
                V0 pigeon_instanceArg = (V0) this.f2378b;
                W0 w02 = pigeon_instanceArg.f20913a;
                WebView viewArg = (WebView) this.f2379c;
                Message dontResendArg = (Message) this.f2380d;
                Message resendArg = (Message) this.f2381e;
                w02.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(viewArg, "viewArg");
                Intrinsics.checkNotNullParameter(dontResendArg, "dontResendArg");
                Intrinsics.checkNotNullParameter(resendArg, "resendArg");
                Intrinsics.checkNotNullParameter(callback, "callback");
                s sVar = w02.f21007a;
                sVar.getClass();
                new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(2231), sVar.i()).send(CollectionsKt.listOf(pigeon_instanceArg, viewArg, dontResendArg, resendArg), new com.mapbox.common.location.a(18, callback));
                return;
            case 7:
                C1645f callback2 = new C1645f(i11);
                V0 pigeon_instanceArg2 = (V0) this.f2378b;
                W0 w03 = pigeon_instanceArg2.f20913a;
                WebView viewArg2 = (WebView) this.f2379c;
                SslErrorHandler handlerArg = (SslErrorHandler) this.f2380d;
                SslError errorArg = (SslError) this.f2381e;
                w03.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg2, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(viewArg2, "viewArg");
                Intrinsics.checkNotNullParameter(handlerArg, "handlerArg");
                Intrinsics.checkNotNullParameter(errorArg, "errorArg");
                Intrinsics.checkNotNullParameter(callback2, "callback");
                s sVar2 = w03.f21007a;
                sVar2.getClass();
                new BasicMessageChannel((BinaryMessenger) sVar2.f651c, StubApp.getString2(2230), sVar2.i()).send(CollectionsKt.listOf(pigeon_instanceArg2, viewArg2, handlerArg, errorArg), new com.mapbox.common.location.a(19, callback2));
                return;
            case 8:
                C1645f callback3 = new C1645f(i11);
                V0 pigeon_instanceArg3 = (V0) this.f2378b;
                W0 w04 = pigeon_instanceArg3.f20913a;
                w04.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg3, "pigeon_instanceArg");
                WebView webViewArg = (WebView) this.f2379c;
                Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
                WebResourceRequest requestArg = (WebResourceRequest) this.f2380d;
                Intrinsics.checkNotNullParameter(requestArg, "requestArg");
                WebResourceError errorArg2 = (WebResourceError) this.f2381e;
                Intrinsics.checkNotNullParameter(errorArg2, "errorArg");
                Intrinsics.checkNotNullParameter(callback3, "callback");
                s sVar3 = w04.f21007a;
                sVar3.getClass();
                new BasicMessageChannel((BinaryMessenger) sVar3.f651c, StubApp.getString2(2229), sVar3.i()).send(CollectionsKt.listOf(pigeon_instanceArg3, webViewArg, requestArg, errorArg2), new C1674t0(callback3, i3));
                return;
            case 9:
                C1645f callback4 = new C1645f(i11);
                V0 pigeon_instanceArg4 = (V0) this.f2378b;
                W0 w05 = pigeon_instanceArg4.f20913a;
                WebView webViewArg2 = (WebView) this.f2379c;
                WebResourceRequest requestArg2 = (WebResourceRequest) this.f2380d;
                WebResourceResponse responseArg = (WebResourceResponse) this.f2381e;
                w05.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg4, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(webViewArg2, "webViewArg");
                Intrinsics.checkNotNullParameter(requestArg2, "requestArg");
                Intrinsics.checkNotNullParameter(responseArg, "responseArg");
                Intrinsics.checkNotNullParameter(callback4, "callback");
                s sVar4 = w05.f21007a;
                sVar4.getClass();
                new BasicMessageChannel((BinaryMessenger) sVar4.f651c, StubApp.getString2(2228), sVar4.i()).send(CollectionsKt.listOf(pigeon_instanceArg4, webViewArg2, requestArg2, responseArg), new com.mapbox.common.location.a(8, callback4));
                return;
            default:
                AudioTrack audioTrack = (AudioTrack) this.f2378b;
                C0379a c0379a = (C0379a) this.f2379c;
                Handler handler = (Handler) this.f2380d;
                C0313d c0313d = (C0313d) this.f2381e;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (c0379a != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new com.even.translate.a(i10, c0379a, c0313d));
                    }
                    synchronized (x0.s.f22730j0) {
                        try {
                            int i13 = x0.s.f22732l0 - 1;
                            x0.s.f22732l0 = i13;
                            if (i13 == 0) {
                                x0.s.f22731k0.shutdown();
                                x0.s.f22731k0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th5) {
                    if (c0379a != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new com.even.translate.a(i10, c0379a, c0313d));
                    }
                    synchronized (x0.s.f22730j0) {
                        try {
                            int i14 = x0.s.f22732l0 - 1;
                            x0.s.f22732l0 = i14;
                            if (i14 == 0) {
                                x0.s.f22731k0.shutdown();
                                x0.s.f22731k0 = null;
                            }
                            throw th5;
                        } finally {
                        }
                    }
                }
        }
    }
}
