package A2;

import C2.j;
import Xa.AbstractActivityC0364d;
import android.content.Context;
import android.util.Log;
import com.baseflow.geolocator.GeolocatorLocationService;
import com.stub.StubApp;
import io.flutter.plugin.common.EventChannel;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i implements EventChannel.StreamHandler {

    /* renamed from: a, reason: collision with root package name */
    public final D2.a f109a;

    /* renamed from: b, reason: collision with root package name */
    public EventChannel f110b;

    /* renamed from: c, reason: collision with root package name */
    public Context f111c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractActivityC0364d f112d;

    /* renamed from: e, reason: collision with root package name */
    public GeolocatorLocationService f113e;

    /* renamed from: f, reason: collision with root package name */
    public final C2.h f114f;

    /* renamed from: g, reason: collision with root package name */
    public j f115g;

    public i(D2.a aVar, C2.h hVar) {
        this.f109a = aVar;
        this.f114f = hVar;
    }

    public final void a(boolean z2) {
        C2.h hVar;
        C2.h hVar2;
        String string2 = StubApp.getString2(90);
        Log.e(string2, StubApp.getString2(145));
        GeolocatorLocationService geolocatorLocationService = this.f113e;
        if (geolocatorLocationService == null || (!z2 ? geolocatorLocationService.f11091c == 0 : geolocatorLocationService.f11092d == 1)) {
            Log.e(string2, StubApp.getString2(148));
        } else {
            geolocatorLocationService.f11092d--;
            Log.d(string2, StubApp.getString2(146));
            j jVar = geolocatorLocationService.f11095g;
            if (jVar != null && (hVar2 = geolocatorLocationService.f11094f) != null) {
                hVar2.f1074a.remove(jVar);
                jVar.d();
            }
            GeolocatorLocationService geolocatorLocationService2 = this.f113e;
            if (geolocatorLocationService2.f11090b) {
                Log.d(string2, StubApp.getString2(147));
                geolocatorLocationService2.stopForeground(1);
                geolocatorLocationService2.b();
                geolocatorLocationService2.f11090b = false;
                geolocatorLocationService2.f11097k = null;
            }
        }
        j jVar2 = this.f115g;
        if (jVar2 == null || (hVar = this.f114f) == null) {
            return;
        }
        hVar.f1074a.remove(jVar2);
        jVar2.d();
        this.f115g = null;
    }

    public final void b() {
        if (this.f110b == null) {
            Log.d(StubApp.getString2(90), StubApp.getString2(94));
            return;
        }
        a(false);
        this.f110b.setStreamHandler(null);
        this.f110b = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        a(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e A[Catch: b -> 0x0210, TRY_LEAVE, TryCatch #0 {b -> 0x0210, blocks: (B:3:0x0006, B:9:0x001e), top: B:2:0x0006 }] */
    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onListen(java.lang.Object r23, io.flutter.plugin.common.EventChannel.EventSink r24) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.i.onListen(java.lang.Object, io.flutter.plugin.common.EventChannel$EventSink):void");
    }
}
