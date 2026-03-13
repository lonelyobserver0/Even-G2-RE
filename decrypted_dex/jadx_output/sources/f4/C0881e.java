package f4;

import a.AbstractC0378a;
import a0.C0379a;
import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import android.os.WorkSource;
import cb.C0585c;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.stub.StubApp;
import i4.AbstractC1047k;
import i4.C1042f;
import i4.C1045i;
import i4.C1046j;
import i4.InterfaceC1044h;
import i4.InterfaceC1048l;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.LongCompanionObject;
import l4.E0;
import q4.AbstractC1520a;
import r0.C1552m;

/* renamed from: f4.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0881e extends Q3.h implements FusedLocationProviderClient {

    /* renamed from: i, reason: collision with root package name */
    public static final Q3.d f13745i;
    public static final Object j;

    /* renamed from: k, reason: collision with root package name */
    public static Object f13746k;

    static {
        C2.i iVar = new C2.i();
        f13745i = new Q3.d(StubApp.getString2(17467), new U3.b(2), iVar);
        j = new Object();
    }

    public final q4.s e(LocationRequest locationRequest, R3.l lVar) {
        c7.f fVar = c7.f.f11014c;
        O0.l lVar2 = new O0.l();
        lVar2.f5145d = this;
        lVar2.f5142a = true;
        lVar2.f5144c = lVar;
        lVar2.f5143b = fVar;
        V6.b bVar = new V6.b(15, lVar2, locationRequest);
        C1552m v2 = E0.v();
        v2.f20170b = bVar;
        v2.f20171c = lVar2;
        v2.f20172d = lVar;
        v2.f20169a = 2436;
        return b(v2.b());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final q4.j flushLocations() {
        Fb.a b2 = Fb.a.b();
        b2.f2347c = C0585c.f11067c;
        b2.f2346b = 2422;
        return d(1, b2.a());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final q4.j getCurrentLocation(int i3, AbstractC1520a abstractC1520a) {
        i4.y.a(i3);
        C1042f c1042f = new C1042f(10000L, 0, i3, LongCompanionObject.MAX_VALUE, false, 0, new WorkSource(null), null);
        if (abstractC1520a != null) {
            S3.D.a(StubApp.getString2(17468), !((q4.n) abstractC1520a).f20062a.isComplete());
        }
        Fb.a b2 = Fb.a.b();
        b2.f2347c = new V6.b(14, c1042f, abstractC1520a);
        b2.f2346b = 2415;
        q4.s d8 = d(0, b2.a());
        if (abstractC1520a == null) {
            return d8;
        }
        q4.k kVar = new q4.k(abstractC1520a);
        d8.continueWith(new C0879c(kVar));
        return kVar.f20051a;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final q4.j getLastLocation() {
        Fb.a b2 = Fb.a.b();
        b2.f2347c = c5.C.f10837c;
        b2.f2346b = 2414;
        return d(0, b2.a());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final q4.j getLocationAvailability() {
        Fb.a b2 = Fb.a.b();
        b2.f2347c = c7.f.f11013b;
        b2.f2346b = 2416;
        return d(0, b2.a());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final q4.j removeDeviceOrientationUpdates(InterfaceC1044h interfaceC1044h) {
        AbstractC0378a.g(null, InterfaceC1044h.class.getSimpleName());
        throw null;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final q4.j removeLocationUpdates(PendingIntent pendingIntent) {
        Fb.a b2 = Fb.a.b();
        b2.f2347c = new C0880d(1, pendingIntent);
        b2.f2346b = 2418;
        return d(1, b2.a());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final q4.j requestDeviceOrientationUpdates(C1045i c1045i, InterfaceC1044h interfaceC1044h, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            S3.D.i(looper, StubApp.getString2(17469));
        }
        AbstractC0378a.e(looper, null, InterfaceC1044h.class.getSimpleName());
        throw null;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final q4.j requestLocationUpdates(LocationRequest locationRequest, PendingIntent pendingIntent) {
        Fb.a b2 = Fb.a.b();
        b2.f2347c = new Y.m(13, pendingIntent, locationRequest);
        b2.f2346b = 2417;
        return d(1, b2.a());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final q4.j setMockLocation(Location location) {
        S3.D.b(location != null);
        Fb.a b2 = Fb.a.b();
        b2.f2347c = new C0379a(location, 5);
        b2.f2346b = 2421;
        return d(1, b2.a());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final q4.j setMockMode(boolean z2) {
        synchronized (j) {
            try {
                if (!z2) {
                    Object obj = f13746k;
                    if (obj != null) {
                        f13746k = null;
                        return c(AbstractC0378a.g(obj, StubApp.getString2("10291")), 2420).continueWith(T4.d.f7179d, c5.C.f10836b);
                    }
                } else if (f13746k == null) {
                    Object obj2 = new Object();
                    f13746k = obj2;
                    C1552m v2 = E0.v();
                    v2.f20170b = c5.C.f10838d;
                    v2.f20171c = c7.f.f11015d;
                    v2.f20172d = AbstractC0378a.e(Looper.getMainLooper(), obj2, StubApp.getString2("10291"));
                    v2.f20169a = 2420;
                    return b(v2.b());
                }
                return a4.f.m(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final q4.j requestDeviceOrientationUpdates(C1045i c1045i, Executor executor, InterfaceC1044h interfaceC1044h) {
        AbstractC0378a.f(null, InterfaceC1044h.class.getSimpleName(), executor);
        throw null;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final q4.j getLastLocation(C1046j c1046j) {
        Fb.a b2 = Fb.a.b();
        b2.f2347c = new C0882f(c1046j, 0);
        b2.f2346b = 2414;
        b2.f2348d = new com.google.android.gms.common.d[]{i4.y.f14830b};
        return d(0, b2.a());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final q4.j removeLocationUpdates(AbstractC1047k abstractC1047k) {
        return c(AbstractC0378a.g(abstractC1047k, AbstractC1047k.class.getSimpleName()), 2418).continueWith(T4.d.f7178c, C0585c.f11066b);
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final q4.j requestLocationUpdates(LocationRequest locationRequest, AbstractC1047k abstractC1047k, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            S3.D.i(looper, StubApp.getString2(17469));
        }
        return e(locationRequest, AbstractC0378a.e(looper, abstractC1047k, AbstractC1047k.class.getSimpleName()));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final q4.j removeLocationUpdates(InterfaceC1048l interfaceC1048l) {
        AbstractC0378a.g(null, InterfaceC1048l.class.getSimpleName());
        throw null;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final q4.j requestLocationUpdates(LocationRequest locationRequest, InterfaceC1048l interfaceC1048l, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            S3.D.i(looper, StubApp.getString2(17469));
        }
        AbstractC0378a.e(looper, null, InterfaceC1048l.class.getSimpleName());
        throw null;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final q4.j requestLocationUpdates(LocationRequest locationRequest, Executor executor, AbstractC1047k abstractC1047k) {
        return e(locationRequest, AbstractC0378a.f(abstractC1047k, AbstractC1047k.class.getSimpleName(), executor));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final q4.j getCurrentLocation(C1042f c1042f, AbstractC1520a abstractC1520a) {
        if (abstractC1520a != null) {
            S3.D.a(StubApp.getString2(17468), !((q4.n) abstractC1520a).f20062a.isComplete());
        }
        Fb.a b2 = Fb.a.b();
        b2.f2347c = new V6.b(14, c1042f, abstractC1520a);
        b2.f2346b = 2415;
        q4.s d8 = d(0, b2.a());
        if (abstractC1520a == null) {
            return d8;
        }
        q4.k kVar = new q4.k(abstractC1520a);
        d8.continueWith(new C0879c(kVar));
        return kVar.f20051a;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final q4.j requestLocationUpdates(LocationRequest locationRequest, Executor executor, InterfaceC1048l interfaceC1048l) {
        AbstractC0378a.f(null, InterfaceC1048l.class.getSimpleName(), executor);
        throw null;
    }
}
