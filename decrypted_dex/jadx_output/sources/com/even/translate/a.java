package com.even.translate;

import B3.j;
import B3.s;
import B3.t;
import J1.A;
import L0.B;
import N5.m;
import N5.n;
import P0.f;
import R4.h;
import T0.C0313d;
import T5.c;
import a0.C0379a;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Log;
import androidx.recyclerview.widget.C0466t;
import com.journeyapps.barcodescanner.CaptureActivity;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BatteryMonitorObserver;
import com.mapbox.common.LifecycleMonitorAndroid;
import com.mapbox.common.LifecycleState;
import com.mapbox.common.LifecycleUtils;
import com.mapbox.common.MovementInfo;
import com.mapbox.common.MovementModeObserver;
import com.mapbox.common.battery.AndroidBatteryMonitor;
import com.mapbox.common.movement.AndroidMovementMonitor;
import com.mapbox.maps.renderer.MapboxRenderThread;
import com.mapbox.maps.renderer.RenderEvent;
import com.mapbox.maps.renderer.RendererError;
import com.mapbox.maps.renderer.RendererSetupErrorListener;
import com.mapbox.maps.renderer.egl.EGLCore;
import com.stub.StubApp;
import d.g;
import d.l;
import d.z;
import d0.C0782l;
import d0.a0;
import e0.AbstractC0833f;
import f4.C0879c;
import i.AbstractActivityC1027h;
import ib.C1069c;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import j5.b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m6.C1274b;
import m6.r;
import no.nordicsemi.android.ble.q;
import no.nordicsemi.android.ble.w;
import o0.AbstractC1416M;
import o0.C1414K;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import q4.k;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1552m;
import sb.C1627Q;
import sb.C1645f;
import sb.C1681x;
import sb.C1683y;
import t6.C1736c;
import t6.C1737d;
import t6.EnumC1738e;
import tc.v;
import uc.C1787a;
import v0.C1802E;
import v0.C1803F;
import v0.C1811f;
import v0.C1817l;
import v0.C1829y;
import v0.C1830z;
import v0.SurfaceHolderCallbackC1827w;
import v0.W;
import v0.Z;
import w6.InterfaceC1866a;
import x0.e;
import y3.d;
import y6.C1972a;
import z6.C2011a;
import z6.C2012b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11139b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11140c;

    public /* synthetic */ a(int i3, Object obj, Object obj2) {
        this.f11138a = i3;
        this.f11139b = obj;
        this.f11140c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        int i3 = 3;
        String str = null;
        int i10 = 2;
        int i11 = 0;
        boolean z10 = true;
        z10 = true;
        switch (this.f11138a) {
            case 0:
                TranslatePlugin.handleStopTranslation$lambda$3$lambda$2((MethodChannel.Result) this.f11139b, (Exception) this.f11140c);
                return;
            case 1:
                LifecycleMonitorAndroid.notifyObservers$lambda$8$lambda$6$lambda$5((Map.Entry) this.f11139b, (LifecycleState) this.f11140c);
                return;
            case 2:
                LifecycleUtils.getLifecycleState$lambda$24$lambda$20$lambda$19$lambda$18((Function1) this.f11139b, (LifecycleState) this.f11140c);
                return;
            case 3:
                AndroidBatteryMonitor.notifyObservers$lambda$2$lambda$1((BatteryMonitorObserver) this.f11139b, (Expected) this.f11140c);
                return;
            case 4:
                AndroidMovementMonitor.notifyObservers$lambda$2$lambda$1((MovementModeObserver) this.f11139b, (MovementInfo) this.f11140c);
                return;
            case 5:
                MapboxRenderThread.postNonRenderEvent$lambda$23((MapboxRenderThread) this.f11139b, (RenderEvent) this.f11140c);
                return;
            case 6:
                EGLCore.notifyListeners$lambda$5((HashSet) this.f11139b, (RendererError) this.f11140c);
                return;
            case 7:
                EGLCore.addRendererStateListener$lambda$3((LinkedList) this.f11139b, (RendererSetupErrorListener) this.f11140c);
                return;
            case 8:
                AbstractActivityC1027h abstractActivityC1027h = (AbstractActivityC1027h) this.f11139b;
                z zVar = (z) this.f11140c;
                int i12 = l.f13075v;
                abstractActivityC1027h.f13076a.a(new g(zVar, abstractActivityC1027h));
                return;
            case 9:
                String string2 = StubApp.getString2(392);
                C0782l c0782l = (C0782l) this.f11139b;
                Intrinsics.checkNotNullParameter(c0782l, string2);
                String string22 = StubApp.getString2(10104);
                a0 a0Var = (a0) this.f11140c;
                Intrinsics.checkNotNullParameter(a0Var, string22);
                c0782l.a(a0Var);
                return;
            case 10:
                String string23 = StubApp.getString2(10101);
                AbstractC0833f abstractC0833f = (AbstractC0833f) this.f11140c;
                Intrinsics.checkNotNullParameter(abstractC0833f, string23);
                Log.e(StubApp.getString2(10103), StubApp.getString2(10102) + ((String) this.f11139b), abstractC0833f);
                throw abstractC0833f;
            case 11:
                Runnable runnable = (Runnable) this.f11140c;
                A a3 = (A) this.f11139b;
                a3.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    a3.a();
                }
            case 12:
                String str2 = (String) this.f11139b;
                k kVar = (k) this.f11140c;
                HashMap hashMap = C1069c.f14975c;
                try {
                    try {
                        h.f(str2).b();
                    } catch (IllegalStateException unused) {
                    }
                    kVar.b(null);
                    return;
                } catch (Exception e10) {
                    kVar.a(e10);
                    return;
                }
            case 13:
                b bVar = (b) this.f11139b;
                bVar.getClass();
                try {
                    t.a().f659d.a(((j) bVar.f15337h.f651c).b(d.f23508c), 1);
                } catch (Exception unused2) {
                }
                ((CountDownLatch) this.f11140c).countDown();
                return;
            case 14:
                FlutterFirebaseMessagingBackgroundService.j.a((Intent) this.f11139b, (CountDownLatch) this.f11140c);
                return;
            case 15:
                m6.h hVar = (m6.h) ((C0879c) this.f11139b).f13742a;
                boolean z11 = hVar.f17097d;
                C1274b c1274b = (C1274b) this.f11140c;
                CaptureActivity captureActivity = hVar.f17094a;
                if (z11) {
                    r rVar = c1274b.f17059b;
                    c cVar = rVar.f17122a;
                    Rect rect = new Rect(0, 0, cVar.f7188b, cVar.f7189c);
                    YuvImage yuvImage = new YuvImage(cVar.f7187a, rVar.f17123b, cVar.f7188b, cVar.f7189c, null);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = 2;
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
                    int i13 = rVar.f17124c;
                    if (i13 != 0) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(i13);
                        decodeByteArray = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
                    }
                    try {
                        File createTempFile = File.createTempFile(StubApp.getString2("10090"), StubApp.getString2("6772"), captureActivity.getCacheDir());
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        decodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        fileOutputStream.close();
                        str = createTempFile.getAbsolutePath();
                    } catch (IOException e11) {
                        Log.w(StubApp.getString2(4933), StubApp.getString2(10091) + e11);
                    }
                }
                Intent intent = new Intent(StubApp.getString2(10092));
                intent.addFlags(PKIFailureInfo.signerNotTrusted);
                intent.putExtra(StubApp.getString2(10093), c1274b.f17058a.f4908a);
                m mVar = c1274b.f17058a;
                intent.putExtra(StubApp.getString2(10094), mVar.f4911d.toString());
                byte[] bArr = mVar.f4909b;
                if (bArr != null && bArr.length > 0) {
                    intent.putExtra(StubApp.getString2(10095), bArr);
                }
                EnumMap enumMap = mVar.f4912e;
                if (enumMap != null) {
                    n nVar = n.j;
                    if (enumMap.containsKey(nVar)) {
                        intent.putExtra(StubApp.getString2(10096), enumMap.get(nVar).toString());
                    }
                    Number number = (Number) enumMap.get(n.f4913a);
                    if (number != null) {
                        intent.putExtra(StubApp.getString2(10097), number.intValue());
                    }
                    String str3 = (String) enumMap.get(n.f4915c);
                    if (str3 != null) {
                        intent.putExtra(StubApp.getString2(10098), str3);
                    }
                    Iterable iterable = (Iterable) enumMap.get(n.f4914b);
                    if (iterable != null) {
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            intent.putExtra(StubApp.getString2(10099) + i11, (byte[]) it.next());
                            i11++;
                        }
                    }
                }
                if (str != null) {
                    intent.putExtra(StubApp.getString2(10100), str);
                }
                captureActivity.setResult(-1, intent);
                hVar.a();
                return;
            case 16:
                no.nordicsemi.android.ble.t tVar = (no.nordicsemi.android.ble.t) this.f11139b;
                tVar.f17979o = null;
                if (tVar.f17977m) {
                    return;
                }
                no.nordicsemi.android.ble.b bVar2 = (no.nordicsemi.android.ble.b) tVar.f17966a;
                if (5 >= bVar2.f17911h.a()) {
                    bVar2.f17911h.b(5, StubApp.getString2(10089));
                }
                q qVar = bVar2.f17900D;
                boolean z12 = qVar instanceof no.nordicsemi.android.ble.t;
                BluetoothDevice bluetoothDevice = (BluetoothDevice) this.f11140c;
                if (z12) {
                    qVar.b(bluetoothDevice, -5);
                }
                w wVar = bVar2.f17904H;
                if (wVar != null) {
                    wVar.b(bluetoothDevice, -5);
                    bVar2.f17904H = null;
                }
                tVar.b(bluetoothDevice, -5);
                int i14 = tVar.f17969d;
                if (i14 == 2) {
                    bVar2.f17899C = null;
                    bVar2.L();
                    return;
                } else if (i14 == 3) {
                    bVar2.E();
                    return;
                } else {
                    q qVar2 = bVar2.f17900D;
                    bVar2.V(qVar2 == null || qVar2.f17977m);
                    return;
                }
            case 17:
                ((f) this.f11140c).a(((C1552m) this.f11139b).f());
                return;
            case 18:
                C1645f callback = new C1645f(9);
                C1681x pigeon_instanceArg = (C1681x) this.f11139b;
                C1683y c1683y = pigeon_instanceArg.f21004b;
                Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
                String messageArg = (String) this.f11140c;
                Intrinsics.checkNotNullParameter(messageArg, "messageArg");
                Intrinsics.checkNotNullParameter(callback, "callback");
                s sVar = c1683y.f20915a;
                sVar.getClass();
                new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(10088), sVar.i()).send(CollectionsKt.listOf(pigeon_instanceArg, messageArg), new C1627Q(callback, i3));
                return;
            case 19:
                EventChannel.EventSink eventSink = ((C1787a) this.f11139b).f21486u.f21940a;
                if (eventSink != null) {
                    eventSink.success(((v) this.f11140c).a());
                    return;
                }
                return;
            case 20:
                C1830z c1830z = (C1830z) this.f11139b;
                C0466t c0466t = (C0466t) this.f11140c;
                int i15 = c1830z.f21821G - c0466t.f10298c;
                c1830z.f21821G = i15;
                if (c0466t.f10299d) {
                    c1830z.f21822H = c0466t.f10300e;
                    c1830z.f21823I = true;
                }
                if (i15 == 0) {
                    AbstractC1416M abstractC1416M = ((W) c0466t.f10301f).f21658a;
                    if (!c1830z.f21861v0.f21658a.p() && abstractC1416M.p()) {
                        c1830z.f21863w0 = -1;
                        c1830z.f21865x0 = 0L;
                    }
                    if (!abstractC1416M.p()) {
                        List asList = Arrays.asList(((v0.a0) abstractC1416M).f21696h);
                        AbstractC1550k.g(asList.size() == c1830z.f21851q.size());
                        for (int i16 = 0; i16 < asList.size(); i16++) {
                            ((C1829y) c1830z.f21851q.get(i16)).f21814b = (AbstractC1416M) asList.get(i16);
                        }
                    }
                    long j = -9223372036854775807L;
                    if (c1830z.f21823I) {
                        if (((W) c0466t.f10301f).f21659b.equals(c1830z.f21861v0.f21659b) && ((W) c0466t.f10301f).f21661d == c1830z.f21861v0.f21675s) {
                            z10 = false;
                        }
                        if (z10) {
                            if (abstractC1416M.p() || ((W) c0466t.f10301f).f21659b.b()) {
                                j = ((W) c0466t.f10301f).f21661d;
                            } else {
                                W w10 = (W) c0466t.f10301f;
                                B b2 = w10.f21659b;
                                long j3 = w10.f21661d;
                                Object obj = b2.f3881a;
                                C1414K c1414k = c1830z.f21849p;
                                abstractC1416M.g(obj, c1414k);
                                j = j3 + c1414k.f18046e;
                            }
                        }
                        z2 = z10;
                    } else {
                        z2 = false;
                    }
                    long j10 = j;
                    c1830z.f21823I = false;
                    c1830z.J((W) c0466t.f10301f, 1, z2, c1830z.f21822H, j10, -1);
                    return;
                }
                return;
            case 21:
                Z z13 = (Z) this.f11140c;
                ((C1802E) this.f11139b).getClass();
                try {
                    synchronized (z13) {
                    }
                    try {
                        z13.f21677a.d(z13.f21680d, z13.f21681e);
                        return;
                    } finally {
                        z13.b(true);
                    }
                } catch (C1817l e12) {
                    AbstractC1550k.l(StubApp.getString2(10086), StubApp.getString2(10087), e12);
                    throw new RuntimeException(e12);
                }
            case 22:
                C1803F c1803f = (C1803F) this.f11139b;
                C1811f c1811f = (C1811f) this.f11140c;
                c1803f.getClass();
                synchronized (c1811f) {
                }
                SurfaceHolderCallbackC1827w surfaceHolderCallbackC1827w = (SurfaceHolderCallbackC1827w) c1803f.f21582b;
                int i17 = AbstractC1560u.f20190a;
                w0.c cVar2 = surfaceHolderCallbackC1827w.f21810a.f21857t;
                cVar2.J(cVar2.F((B) cVar2.f21992d.f6300e), 1013, new w0.b(z10 ? 1 : 0));
                return;
            case 23:
                C0313d c0313d = (C0313d) this.f11140c;
                C1803F c1803f2 = ((x0.v) ((C0379a) this.f11139b).f9233b).f22794X0;
                Handler handler = (Handler) c1803f2.f21581a;
                if (handler != null) {
                    handler.post(new e(c1803f2, c0313d, i10));
                    return;
                }
                return;
            case 24:
                wb.e this_onFailure = (wb.e) this.f11139b;
                Intrinsics.checkNotNullParameter(this_onFailure, "$this_onFailure");
                Exception e13 = (Exception) this.f11140c;
                Intrinsics.checkNotNullParameter(e13, "$e");
                this_onFailure.a(e13);
                return;
            case 25:
                E9.k kVar2 = (E9.k) this.f11139b;
                C1972a c1972a = (C1972a) kVar2.f2082c;
                CountDownLatch countDownLatch = (CountDownLatch) this.f11140c;
                try {
                    try {
                        hc.b g10 = kVar2.g();
                        C1737d c1737d = (C1737d) kVar2.f2081b;
                        Pair z14 = g10.z(c1737d, kVar2);
                        InterfaceC1866a interfaceC1866a = (InterfaceC1866a) z14.component1();
                        C1736c c1736c = new C1736c(c1737d, (MediaFormat) z14.component2());
                        kVar2.f2083d = c1736c;
                        Intrinsics.checkNotNull(c1736c);
                        c1736c.f21181a.startRecording();
                        kVar2.f2084e = interfaceC1866a;
                        Intrinsics.checkNotNull(interfaceC1866a);
                        interfaceC1866a.b();
                        kVar2.f();
                        countDownLatch.countDown();
                        while (kVar2.b()) {
                            if ((((InterfaceC1866a) kVar2.f2084e) != null && ((AtomicBoolean) kVar2.f2086g).get()) == true) {
                                c1972a.f23523a.a(EnumC1738e.f21204b);
                                ((Semaphore) kVar2.f2087h).acquire();
                            } else {
                                C1736c c1736c2 = (C1736c) kVar2.f2083d;
                                Intrinsics.checkNotNull(c1736c2);
                                byte[] a9 = c1736c2.a();
                                if (a9.length != 0) {
                                    InterfaceC1866a interfaceC1866a2 = (InterfaceC1866a) kVar2.f2084e;
                                    Intrinsics.checkNotNull(interfaceC1866a2);
                                    interfaceC1866a2.a(a9);
                                }
                            }
                        }
                    } catch (Exception e14) {
                        c1972a.h(e14);
                    }
                    countDownLatch.countDown();
                    kVar2.h();
                    return;
                } catch (Throwable th) {
                    countDownLatch.countDown();
                    kVar2.h();
                    throw th;
                }
            case 26:
                EventChannel.EventSink eventSink2 = ((C2011a) this.f11139b).f24125a;
                if (eventSink2 != null) {
                    eventSink2.success((byte[]) this.f11140c);
                    return;
                }
                return;
            case 27:
                EventChannel.EventSink eventSink3 = ((C2012b) this.f11139b).f24127a;
                if (eventSink3 != null) {
                    eventSink3.success(Integer.valueOf(((EnumC1738e) this.f11140c).f21209a));
                    return;
                }
                return;
            default:
                EventChannel.EventSink eventSink4 = ((C2012b) this.f11139b).f24127a;
                if (eventSink4 != null) {
                    Exception exc = (Exception) this.f11140c;
                    eventSink4.error(StubApp.getString2(10085), exc.getMessage(), exc);
                    return;
                }
                return;
        }
    }
}
