package sb;

import L0.C0123t;
import T0.AbstractC0311b;
import android.bluetooth.BluetoothDevice;
import android.net.http.SslError;
import android.util.Log;
import android.util.LruCache;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import com.google.android.gms.internal.measurement.D1;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.MemoryMonitorObserver;
import com.mapbox.common.MemoryMonitorState;
import com.mapbox.common.MemoryMonitorStatus;
import com.stub.StubApp;
import f4.C0879c;
import io.flutter.plugin.common.BasicMessageChannel;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m8.C1284e;
import o0.AbstractC1407D;
import o0.C1404A;
import o0.C1428c;
import o0.InterfaceC1410G;
import r0.C1553n;
import r0.InterfaceC1546g;
import r5.C1571d;
import r5.C1572e;
import sa.C1608a;
import tb.InterfaceC1750c;
import v0.C1811f;
import v0.SurfaceHolderCallbackC1827w;
import vb.InterfaceC1845b;
import yb.C1983a;
import z3.C2006b;

/* renamed from: sb.e0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class C1644e0 implements BasicMessageChannel.MessageHandler, InterfaceC1750c, MemoryMonitorObserver, InterfaceC1546g, mc.a, wc.p, s0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20953b;

    public /* synthetic */ C1644e0(Object obj, int i3) {
        this.f20952a = i3;
        this.f20953b = obj;
    }

    @Override // wc.p
    public wc.q a(Ac.j it) {
        wc.q this_asFactory = (wc.q) this.f20953b;
        Intrinsics.checkNotNullParameter(this_asFactory, "$this_asFactory");
        Intrinsics.checkNotNullParameter(it, "it");
        return this_asFactory;
    }

    @Override // tb.InterfaceC1750c
    public boolean b(View view) {
        int i3 = 0;
        while (true) {
            Class[] clsArr = (Class[]) this.f20953b;
            if (i3 >= clsArr.length) {
                return false;
            }
            if (clsArr[i3].isInstance(view)) {
                return true;
            }
            i3++;
        }
    }

    @Override // s0.p
    public void c(long j, C1553n c1553n) {
        AbstractC0311b.f(j, c1553n, (T0.H[]) ((C1608a) this.f20953b).f20821b);
    }

    @Override // mc.a
    public void d(BluetoothDevice bluetoothDevice, int i3) {
        Object obj = this.f20953b;
        switch (this.f20952a) {
            case 14:
                InterfaceC1845b interfaceC1845b = (InterfaceC1845b) obj;
                if (i3 == -100) {
                    interfaceC1845b.i(new C1983a());
                    break;
                } else {
                    if (i3 != -7) {
                        if (i3 == -5) {
                            interfaceC1845b.i(new Db.d());
                            break;
                        } else if (i3 != -4) {
                            if (i3 == -2) {
                                interfaceC1845b.i(new C1983a());
                                break;
                            } else if (i3 != -1) {
                                interfaceC1845b.i(new Db.c(Oc.a.J(i3)));
                                break;
                            }
                        }
                    }
                    interfaceC1845b.i(new C1983a());
                    break;
                }
            default:
                wb.f fVar = (wb.f) obj;
                if (fVar.a() <= 5) {
                    fVar.b(5, StubApp.getString2(23274));
                }
                no.nordicsemi.android.ble.l lVar = new no.nordicsemi.android.ble.l(3);
                lVar.g(fVar.f17932b);
                lVar.a();
                break;
        }
    }

    public D0.g e(C1608a c1608a) {
        C2006b c2006b = (C2006b) this.f20953b;
        String string2 = StubApp.getString2(1063);
        String string22 = StubApp.getString2(2542);
        String concat = string2.concat(string22);
        boolean isLoggable = Log.isLoggable(concat, 4);
        URL url = (URL) c1608a.f20820a;
        if (isLoggable) {
            Log.i(concat, String.format(StubApp.getString2(23275), url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(c2006b.f24042g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(StubApp.getString2(13314));
        httpURLConnection.setRequestProperty(StubApp.getString2(2015), StubApp.getString2(23276));
        String string23 = StubApp.getString2(2413);
        String string24 = StubApp.getString2(20159);
        httpURLConnection.setRequestProperty(string23, string24);
        String string25 = StubApp.getString2(466);
        httpURLConnection.setRequestProperty(string25, StubApp.getString2(3394));
        httpURLConnection.setRequestProperty(StubApp.getString2(23277), string24);
        String str = (String) c1608a.f20822c;
        if (str != null) {
            httpURLConnection.setRequestProperty(StubApp.getString2(23278), str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    C0879c c0879c = c2006b.f24036a;
                    A3.m mVar = (A3.m) c1608a.f20821b;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    C1571d c1571d = (C1571d) c0879c.f13742a;
                    C1572e c1572e = new C1572e(bufferedWriter, c1571d.f20349a, c1571d.f20350b, c1571d.f20351c, c1571d.f20352d);
                    c1572e.g(mVar);
                    c1572e.i();
                    c1572e.f20354b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String concat2 = string2.concat(string22);
                    if (Log.isLoggable(concat2, 4)) {
                        Log.i(concat2, String.format(StubApp.getString2(23279), valueOf));
                    }
                    D1.e(string22, StubApp.getString2(23280), httpURLConnection.getHeaderField(string25));
                    D1.e(string22, StubApp.getString2(23281), httpURLConnection.getHeaderField(string23));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new D0.g(responseCode, new URL(httpURLConnection.getHeaderField(StubApp.getString2(398))), 0L);
                    }
                    if (responseCode != 200) {
                        return new D0.g(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = string24.equals(httpURLConnection.getHeaderField(string23)) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            D0.g gVar = new D0.g(responseCode, null, A3.v.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f213a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return gVar;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (ConnectException e10) {
            e = e10;
            D1.f(string22, StubApp.getString2(23282), e);
            return new D0.g(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            D1.f(string22, StubApp.getString2(23282), e);
            return new D0.g(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            D1.f(string22, "Couldn't encode request, returning with 400", e);
            return new D0.g(400, null, 0L);
        } catch (p5.b e13) {
            e = e13;
            D1.f(string22, "Couldn't encode request, returning with 400", e);
            return new D0.g(400, null, 0L);
        }
    }

    @Override // r0.InterfaceC1546g
    /* renamed from: invoke */
    public void mo0invoke(Object obj) {
        switch (this.f20952a) {
            case 5:
                ((InterfaceC1410G) obj).j((o0.y) this.f20953b);
                break;
            case 6:
                ((InterfaceC1410G) obj).p((C1428c) this.f20953b);
                break;
            case 7:
                ((InterfaceC1410G) obj).x((q0.c) this.f20953b);
                break;
            case 8:
                ((InterfaceC1410G) obj).j(((SurfaceHolderCallbackC1827w) this.f20953b).f21810a.f21828R);
                break;
            case 9:
                ((InterfaceC1410G) obj).w((C1404A) this.f20953b);
                break;
            case 10:
            default:
                w0.h hVar = (w0.h) obj;
                hVar.getClass();
                hVar.f22035v = ((I0.g) this.f20953b).f3074a;
                break;
            case 11:
                w0.h hVar2 = (w0.h) obj;
                int i3 = hVar2.f22037x;
                C1811f c1811f = (C1811f) this.f20953b;
                hVar2.f22037x = i3 + c1811f.f21738g;
                hVar2.f22038y += c1811f.f21736e;
                break;
            case 12:
                ((w0.h) obj).f22027n = (AbstractC1407D) this.f20953b;
                break;
        }
    }

    @Override // com.mapbox.common.MemoryMonitorObserver
    public void onMemoryMonitorAlert(MemoryMonitorStatus status) {
        String string2 = StubApp.getString2(392);
        C1608a c1608a = (C1608a) this.f20953b;
        Intrinsics.checkNotNullParameter(c1608a, string2);
        Intrinsics.checkNotNullParameter(status, "status");
        if (status.getState() == MemoryMonitorState.MEMORY_THRESHOLD_REACHED || status.getState() == MemoryMonitorState.SYSTEM_MEMORY_WARNING_RECEIVED) {
            if (D9.l.a(D9.l.g(), LoggingLevel.DEBUG)) {
                D9.l.d(StubApp.getString2(23283) + status + StubApp.getString2(23284), StubApp.getString2(23285));
            }
            Iterator it = ((CopyOnWriteArrayList) c1608a.f20821b).iterator();
            while (it.hasNext()) {
                C1284e c1284e = (C1284e) it.next();
                switch (c1284e.f17166a) {
                    case 0:
                        m8.r rVar = (m8.r) c1284e.f17167b;
                        Intrinsics.checkNotNullParameter(rVar, string2);
                        rVar.getClass();
                        i8.d dVar = i8.d.f14937a;
                        android.support.v4.media.session.b.i();
                        break;
                    default:
                        x9.t tVar = (x9.t) c1284e.f17167b;
                        Intrinsics.checkNotNullParameter(tVar, string2);
                        tVar.getClass();
                        ((LruCache) r9.r.f20462b.getValue()).trimToSize(0);
                        ((LruCache) r9.r.f20463c.getValue()).trimToSize(0);
                        ((LruCache) tVar.f23078q.getValue()).evictAll();
                        break;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        List listOf;
        List listOf2;
        List listOf3;
        switch (this.f20952a) {
            case 0:
                E0 e02 = (E0) this.f20953b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                int i3 = 0;
                Object obj2 = list.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.net.http.SslError");
                SslError sslError = (SslError) obj2;
                Object obj3 = list.get(1);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.SslErrorType");
                F0 f02 = (F0) obj3;
                try {
                } catch (Throwable exception) {
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    if (exception instanceof C1635a) {
                        C1635a c1635a = exception;
                        listOf = CollectionsKt.listOf(c1635a.f20922a, c1635a.f20923b, c1635a.f20924c);
                    } else {
                        listOf = CollectionsKt.listOf((Object[]) new String[]{exception.getClass().getSimpleName(), exception.toString(), E1.a.m(StubApp.getString2(6769), exception.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception))});
                    }
                }
                switch (f02.ordinal()) {
                    case 0:
                        i3 = 4;
                        listOf = CollectionsKt.listOf(Boolean.valueOf(sslError.hasError(i3)));
                        reply.reply(listOf);
                        return;
                    case 1:
                        i3 = 1;
                        listOf = CollectionsKt.listOf(Boolean.valueOf(sslError.hasError(i3)));
                        reply.reply(listOf);
                        return;
                    case 2:
                        i3 = 2;
                        listOf = CollectionsKt.listOf(Boolean.valueOf(sslError.hasError(i3)));
                        reply.reply(listOf);
                        return;
                    case 3:
                        i3 = 5;
                        listOf = CollectionsKt.listOf(Boolean.valueOf(sslError.hasError(i3)));
                        reply.reply(listOf);
                        return;
                    case 4:
                        listOf = CollectionsKt.listOf(Boolean.valueOf(sslError.hasError(i3)));
                        reply.reply(listOf);
                        return;
                    case 5:
                        i3 = 3;
                        listOf = CollectionsKt.listOf(Boolean.valueOf(sslError.hasError(i3)));
                        reply.reply(listOf);
                        return;
                    case 6:
                        e02.f20955a.getClass();
                        throw new IllegalArgumentException(f02 + StubApp.getString2("23286"));
                    default:
                        i3 = -1;
                        listOf = CollectionsKt.listOf(Boolean.valueOf(sslError.hasError(i3)));
                        reply.reply(listOf);
                        return;
                }
            case 1:
                N0 n02 = (N0) this.f20953b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                WebSettings webSettings = (WebSettings) obj4;
                Object obj5 = list2.get(1);
                Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                try {
                    n02.a(webSettings, ((Boolean) obj5).booleanValue());
                    listOf2 = CollectionsKt.listOf((Object) null);
                } catch (Throwable exception2) {
                    Intrinsics.checkNotNullParameter(exception2, "exception");
                    if (exception2 instanceof C1635a) {
                        C1635a c1635a2 = exception2;
                        listOf2 = CollectionsKt.listOf(c1635a2.f20922a, c1635a2.f20923b, c1635a2.f20924c);
                    } else {
                        listOf2 = CollectionsKt.listOf((Object[]) new String[]{exception2.getClass().getSimpleName(), exception2.toString(), E1.a.m(StubApp.getString2(6769), exception2.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception2))});
                    }
                }
                reply.reply(listOf2);
                return;
            default:
                P0 p02 = (P0) this.f20953b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj6 = ((List) obj).get(0);
                Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((C1637b) p02.f20996a.f650b).a(((Long) obj6).longValue(), WebStorage.getInstance());
                    listOf3 = CollectionsKt.listOf((Object) null);
                } catch (Throwable exception3) {
                    Intrinsics.checkNotNullParameter(exception3, "exception");
                    if (exception3 instanceof C1635a) {
                        C1635a c1635a3 = exception3;
                        listOf3 = CollectionsKt.listOf(c1635a3.f20922a, c1635a3.f20923b, c1635a3.f20924c);
                    } else {
                        listOf3 = CollectionsKt.listOf((Object[]) new String[]{exception3.getClass().getSimpleName(), exception3.toString(), E1.a.m(StubApp.getString2(6769), exception3.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception3))});
                    }
                }
                reply.reply(listOf3);
                return;
        }
    }

    public /* synthetic */ C1644e0(w0.a aVar, C0123t c0123t, I0.g gVar, IOException iOException, boolean z2) {
        this.f20952a = 13;
        this.f20953b = gVar;
    }

    public /* synthetic */ C1644e0(w0.a aVar, Object obj, int i3) {
        this.f20952a = i3;
        this.f20953b = obj;
    }
}
