package A2;

import C2.n;
import Xa.AbstractActivityC0364d;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.baseflow.geolocator.GeolocatorLocationService;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class d implements InterfaceC0825b, eb.a {

    /* renamed from: a, reason: collision with root package name */
    public final D2.a f84a;

    /* renamed from: b, reason: collision with root package name */
    public final C2.h f85b;

    /* renamed from: c, reason: collision with root package name */
    public final C2.i f86c;

    /* renamed from: d, reason: collision with root package name */
    public GeolocatorLocationService f87d;

    /* renamed from: e, reason: collision with root package name */
    public h f88e;

    /* renamed from: f, reason: collision with root package name */
    public i f89f;

    /* renamed from: g, reason: collision with root package name */
    public final c f90g = new c(this, 0);

    /* renamed from: h, reason: collision with root package name */
    public e f91h;
    public eb.b j;

    public d() {
        D2.a aVar;
        C2.h hVar;
        C2.i iVar;
        synchronized (D2.a.class) {
            try {
                if (D2.a.f1268d == null) {
                    D2.a.f1268d = new D2.a();
                }
                aVar = D2.a.f1268d;
            } finally {
            }
        }
        this.f84a = aVar;
        synchronized (C2.h.class) {
            try {
                if (C2.h.f1073b == null) {
                    C2.h.f1073b = new C2.h();
                }
                hVar = C2.h.f1073b;
            } finally {
            }
        }
        this.f85b = hVar;
        synchronized (C2.i.class) {
            try {
                if (C2.i.f1075a == null) {
                    C2.i.f1075a = new C2.i();
                }
                iVar = C2.i.f1075a;
            } finally {
            }
        }
        this.f86c = iVar;
    }

    @Override // eb.a
    public final void onAttachedToActivity(eb.b bVar) {
        this.j = bVar;
        if (bVar != null) {
            ((Ya.d) bVar).a(this.f85b);
            ((Ya.d) this.j).b(this.f84a);
        }
        h hVar = this.f88e;
        if (hVar != null) {
            hVar.f107f = ((Ya.d) bVar).f8882a;
        }
        i iVar = this.f89f;
        if (iVar != null) {
            AbstractActivityC0364d abstractActivityC0364d = ((Ya.d) bVar).f8882a;
            if (abstractActivityC0364d == null && iVar.f115g != null && iVar.f110b != null) {
                iVar.b();
            }
            iVar.f112d = abstractActivityC0364d;
        }
        GeolocatorLocationService geolocatorLocationService = this.f87d;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.f11093e = ((Ya.d) this.j).f8882a;
        }
    }

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a c0824a) {
        n nVar;
        D2.a aVar = this.f84a;
        C2.h hVar = this.f85b;
        h hVar2 = new h(aVar, hVar, this.f86c);
        this.f88e = hVar2;
        Context context = c0824a.f13553a;
        if (hVar2.f108g != null) {
            String string2 = StubApp.getString2(92);
            String string22 = StubApp.getString2(93);
            Log.w(string22, string2);
            MethodChannel methodChannel = hVar2.f108g;
            if (methodChannel == null) {
                Log.d(string22, StubApp.getString2(94));
            } else {
                methodChannel.setMethodCallHandler(null);
                hVar2.f108g = null;
            }
        }
        BinaryMessenger binaryMessenger = c0824a.f13554b;
        MethodChannel methodChannel2 = new MethodChannel(binaryMessenger, StubApp.getString2(95));
        hVar2.f108g = methodChannel2;
        methodChannel2.setMethodCallHandler(hVar2);
        hVar2.f106e = context;
        i iVar = new i(aVar, hVar);
        this.f89f = iVar;
        EventChannel eventChannel = iVar.f110b;
        String string23 = StubApp.getString2(96);
        if (eventChannel != null) {
            Log.w(StubApp.getString2(90), string23);
            iVar.b();
        }
        EventChannel eventChannel2 = new EventChannel(binaryMessenger, StubApp.getString2(97));
        iVar.f110b = eventChannel2;
        eventChannel2.setStreamHandler(iVar);
        Context context2 = c0824a.f13553a;
        iVar.f111c = context2;
        e eVar = new e();
        this.f91h = eVar;
        eVar.f93b = context2;
        if (eVar.f92a != null) {
            Log.w(StubApp.getString2(98), string23);
            if (eVar.f92a != null) {
                Context context3 = eVar.f93b;
                if (context3 != null && (nVar = eVar.f94c) != null) {
                    context3.unregisterReceiver(nVar);
                }
                eVar.f92a.setStreamHandler(null);
                eVar.f92a = null;
            }
        }
        EventChannel eventChannel3 = new EventChannel(binaryMessenger, StubApp.getString2(99));
        eVar.f92a = eventChannel3;
        eventChannel3.setStreamHandler(eVar);
        eVar.f93b = context2;
        context2.bindService(new Intent(context2, (Class<?>) GeolocatorLocationService.class), this.f90g, 1);
    }

    @Override // eb.a
    public final void onDetachedFromActivity() {
        eb.b bVar = this.j;
        if (bVar != null) {
            ((Ya.d) bVar).c(this.f85b);
            ((Ya.d) this.j).f8884c.remove(this.f84a);
        }
        h hVar = this.f88e;
        if (hVar != null) {
            hVar.f107f = null;
        }
        i iVar = this.f89f;
        if (iVar != null) {
            if (iVar.f115g != null && iVar.f110b != null) {
                iVar.b();
            }
            iVar.f112d = null;
        }
        GeolocatorLocationService geolocatorLocationService = this.f87d;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.f11093e = null;
        }
        if (this.j != null) {
            this.j = null;
        }
    }

    @Override // eb.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a c0824a) {
        Context context = c0824a.f13553a;
        GeolocatorLocationService geolocatorLocationService = this.f87d;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.f11091c--;
            Log.d(StubApp.getString2(90), StubApp.getString2(100) + geolocatorLocationService.f11091c);
        }
        context.unbindService(this.f90g);
        h hVar = this.f88e;
        if (hVar != null) {
            MethodChannel methodChannel = hVar.f108g;
            if (methodChannel == null) {
                Log.d(StubApp.getString2(93), StubApp.getString2(94));
            } else {
                methodChannel.setMethodCallHandler(null);
                hVar.f108g = null;
            }
            this.f88e.f107f = null;
            this.f88e = null;
        }
        i iVar = this.f89f;
        if (iVar != null) {
            iVar.b();
            this.f89f.f113e = null;
            this.f89f = null;
        }
        e eVar = this.f91h;
        if (eVar != null) {
            eVar.f93b = null;
            if (eVar.f92a != null) {
                eVar.f92a.setStreamHandler(null);
                eVar.f92a = null;
            }
            this.f91h = null;
        }
        GeolocatorLocationService geolocatorLocationService2 = this.f87d;
        if (geolocatorLocationService2 != null) {
            geolocatorLocationService2.f11093e = null;
        }
    }

    @Override // eb.a
    public final void onReattachedToActivityForConfigChanges(eb.b bVar) {
        onAttachedToActivity(bVar);
    }
}
