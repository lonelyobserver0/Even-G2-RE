package C2;

import S3.D;
import Xa.AbstractActivityC0364d;
import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.os.Looper;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import com.stub.StubApp;
import f4.C0881e;
import f4.C0882f;
import i4.AbstractC1050n;
import i4.C1051o;
import i4.y;
import java.security.SecureRandom;
import java.util.ArrayList;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import q4.s;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1065a;

    /* renamed from: b, reason: collision with root package name */
    public final f f1066b;

    /* renamed from: c, reason: collision with root package name */
    public final C0881e f1067c;

    /* renamed from: d, reason: collision with root package name */
    public final q f1068d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1069e;

    /* renamed from: f, reason: collision with root package name */
    public final m f1070f;

    /* renamed from: g, reason: collision with root package name */
    public B2.a f1071g;

    /* renamed from: h, reason: collision with root package name */
    public r f1072h;

    public g(Context context, m mVar) {
        int nextInt;
        this.f1065a = context;
        int i3 = AbstractC1050n.f14794a;
        this.f1067c = new C0881e(context, null, C0881e.f13745i, Q3.b.f5714a, Q3.g.f5719b);
        this.f1070f = mVar;
        this.f1068d = new q(context, mVar);
        synchronized (this) {
            nextInt = new SecureRandom().nextInt(PKIFailureInfo.notAuthorized);
        }
        this.f1069e = nextInt;
        this.f1066b = new f(this, mVar, context);
    }

    public static LocationRequest g(m mVar) {
        float f10;
        long j;
        long j3;
        long j10;
        long j11;
        int i3 = 104;
        int i10 = 102;
        if (Build.VERSION.SDK_INT < 33) {
            LocationRequest d8 = LocationRequest.d();
            if (mVar != null) {
                int c10 = AbstractC1856e.c(mVar.f1087a);
                if (c10 == 0) {
                    i3 = 105;
                } else if (c10 != 1) {
                    i3 = c10 != 2 ? 100 : 102;
                }
                y.a(i3);
                d8.f11784a = i3;
                long j12 = mVar.f1089c;
                d8.g(j12);
                long j13 = j12 / 2;
                D.c(j13 >= 0, StubApp.getString2(1074), Long.valueOf(j13));
                d8.f11786c = j13;
                d8.i(mVar.f1088b);
            }
            return d8;
        }
        boolean z2 = 0 >= 0;
        String string2 = StubApp.getString2(1075);
        D.a(string2, z2);
        if (mVar != null) {
            int c11 = AbstractC1856e.c(mVar.f1087a);
            if (c11 == 0) {
                i3 = 105;
            } else if (c11 != 1) {
                i3 = c11 != 2 ? 100 : 102;
            }
            y.a(i3);
            j10 = mVar.f1089c;
            D.a(string2, j10 >= 0);
            D.a(StubApp.getString2(1076), j10 == -1 || j10 >= 0);
            float f11 = mVar.f1088b;
            D.a(StubApp.getString2(1077), f11 >= 0.0f);
            f10 = f11;
            i10 = i3;
            j = j10;
            j3 = -1;
        } else {
            f10 = 0.0f;
            j = 0;
            j3 = -1;
            j10 = -1;
        }
        if (j10 == j3) {
            j11 = j;
        } else {
            if (i10 != 105) {
                j10 = Math.min(j10, j);
            }
            j11 = j10;
        }
        return new LocationRequest(i10, j, j11, Math.max(0L, j), LongCompanionObject.MAX_VALUE, LongCompanionObject.MAX_VALUE, IntCompanionObject.MAX_VALUE, f10, true, j3 == j3 ? j : j3, 0, 0, false, new WorkSource(null), null);
    }

    @Override // C2.j
    public final void b(b bVar) {
        int i3 = AbstractC1050n.f14794a;
        f4.h hVar = new f4.h(this.f1065a, null, C0881e.f13745i, Q3.b.f5714a, Q3.g.f5719b);
        C1051o c1051o = new C1051o(new ArrayList(), false, false);
        Fb.a b2 = Fb.a.b();
        b2.f2347c = new C0882f(c1051o, 1);
        b2.f2346b = 2426;
        hVar.d(0, b2.a()).addOnCompleteListener(new d(bVar, 0));
    }

    @Override // C2.j
    public final boolean c(int i3, int i10) {
        if (i3 == this.f1069e) {
            if (i10 == -1) {
                m mVar = this.f1070f;
                if (mVar != null && this.f1072h != null && this.f1071g != null) {
                    h(mVar);
                    return true;
                }
            } else {
                B2.a aVar = this.f1071g;
                if (aVar != null) {
                    aVar.b(3);
                }
            }
        }
        return false;
    }

    @Override // C2.j
    public final void d() {
        LocationManager locationManager;
        q qVar = this.f1068d;
        if (qVar.f1097c != null && (locationManager = qVar.f1096b) != null) {
            locationManager.removeNmeaListener(qVar.f1098d);
            locationManager.unregisterGnssStatusCallback(qVar.f1099e);
            qVar.j = false;
        }
        this.f1067c.removeLocationUpdates(this.f1066b);
    }

    @Override // C2.j
    public final void e(AbstractActivityC0364d abstractActivityC0364d, r rVar, B2.a aVar) {
        this.f1072h = rVar;
        this.f1071g = aVar;
        LocationRequest g10 = g(this.f1070f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(g10);
        C1051o c1051o = new C1051o(arrayList, false, false);
        int i3 = AbstractC1050n.f14794a;
        f4.h hVar = new f4.h(this.f1065a, null, C0881e.f13745i, Q3.b.f5714a, Q3.g.f5719b);
        Fb.a b2 = Fb.a.b();
        b2.f2347c = new C0882f(c1051o, 1);
        b2.f2346b = 2426;
        s d8 = hVar.d(0, b2.a());
        d dVar = new d(this, 1);
        d8.getClass();
        d8.addOnSuccessListener(q4.l.f20052a, dVar);
        d8.addOnFailureListener(new e(this, abstractActivityC0364d, aVar, 0));
    }

    @Override // C2.j
    public final void f(A2.g gVar, A2.g gVar2) {
        q4.j lastLocation = this.f1067c.getLastLocation();
        d dVar = new d(gVar, 2);
        s sVar = (s) lastLocation;
        sVar.getClass();
        sVar.addOnSuccessListener(q4.l.f20052a, dVar);
        sVar.addOnFailureListener(new d(gVar2, 3));
    }

    public final void h(m mVar) {
        LocationRequest g10 = g(mVar);
        this.f1068d.b();
        this.f1067c.requestLocationUpdates(g10, this.f1066b, Looper.getMainLooper());
    }
}
