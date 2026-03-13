package C2;

import Xa.AbstractActivityC0364d;
import a.AbstractC0378a;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.stub.StubApp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.LongCompanionObject;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k implements j, LocationListener {

    /* renamed from: a, reason: collision with root package name */
    public final LocationManager f1078a;

    /* renamed from: b, reason: collision with root package name */
    public final q f1079b;

    /* renamed from: c, reason: collision with root package name */
    public final m f1080c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f1081d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1082e = false;

    /* renamed from: f, reason: collision with root package name */
    public Location f1083f;

    /* renamed from: g, reason: collision with root package name */
    public String f1084g;

    /* renamed from: h, reason: collision with root package name */
    public r f1085h;

    /* renamed from: i, reason: collision with root package name */
    public B2.a f1086i;

    public k(Context context, m mVar) {
        this.f1078a = (LocationManager) context.getSystemService(StubApp.getString2(662));
        this.f1080c = mVar;
        this.f1081d = context;
        this.f1079b = new q(context, mVar);
    }

    public static boolean g(Location location, Location location2) {
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z2 = time > 120000;
        boolean z10 = time < -120000;
        boolean z11 = time > 0;
        if (z2) {
            return true;
        }
        if (z10) {
            return false;
        }
        float accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z12 = accuracy > 0.0f;
        boolean z13 = accuracy < 0.0f;
        boolean z14 = accuracy > 200.0f;
        boolean equals = location.getProvider() != null ? location.getProvider().equals(location2.getProvider()) : false;
        if (z13) {
            return true;
        }
        if (!z11 || z12) {
            return z11 && !z14 && equals;
        }
        return true;
    }

    @Override // C2.j
    public final void b(b bVar) {
        if (this.f1078a == null) {
            bVar.f1047a.success(Boolean.FALSE);
        } else {
            bVar.f1047a.success(Boolean.valueOf(j.a(this.f1081d)));
        }
    }

    @Override // C2.j
    public final boolean c(int i3, int i10) {
        return false;
    }

    @Override // C2.j
    public final void d() {
        LocationManager locationManager;
        this.f1082e = false;
        q qVar = this.f1079b;
        if (qVar.f1097c != null && (locationManager = qVar.f1096b) != null) {
            locationManager.removeNmeaListener(qVar.f1098d);
            locationManager.unregisterGnssStatusCallback(qVar.f1099e);
            qVar.j = false;
        }
        this.f1078a.removeUpdates(this);
    }

    @Override // C2.j
    public final void e(AbstractActivityC0364d abstractActivityC0364d, r rVar, B2.a aVar) {
        long j;
        float f10;
        long j3;
        int i3;
        String string2;
        int i10;
        if (!j.a(this.f1081d)) {
            aVar.b(3);
            return;
        }
        this.f1085h = rVar;
        this.f1086i = aVar;
        int i11 = 5;
        m mVar = this.f1080c;
        if (mVar != null) {
            float f11 = mVar.f1088b;
            int i12 = mVar.f1087a;
            long j10 = i12 == 1 ? LongCompanionObject.MAX_VALUE : mVar.f1089c;
            int c10 = AbstractC1856e.c(i12);
            if (c10 == 0 || c10 == 1) {
                j = LongCompanionObject.MAX_VALUE;
                i10 = 104;
            } else {
                j = LongCompanionObject.MAX_VALUE;
                i10 = (c10 == 3 || c10 == 4 || c10 == 5) ? 100 : 102;
            }
            f10 = f11;
            long j11 = j10;
            i3 = i10;
            i11 = i12;
            j3 = j11;
        } else {
            j = LongCompanionObject.MAX_VALUE;
            f10 = 0.0f;
            j3 = 0;
            i3 = 102;
        }
        List<String> providers = this.f1078a.getProviders(true);
        if (i11 == 1) {
            string2 = StubApp.getString2(1094);
        } else {
            string2 = StubApp.getString2(1095);
            if (!providers.contains(string2) || Build.VERSION.SDK_INT < 31) {
                string2 = StubApp.getString2(540);
                if (!providers.contains(string2)) {
                    string2 = StubApp.getString2(1096);
                    if (!providers.contains(string2)) {
                        string2 = !providers.isEmpty() ? providers.get(0) : null;
                    }
                }
            }
        }
        this.f1084g = string2;
        if (string2 == null) {
            aVar.b(3);
            return;
        }
        M.d.c(j3, StubApp.getString2(1097));
        String string22 = StubApp.getString2(1098);
        if (f10 < 0.0f) {
            throw new IllegalArgumentException(String.format(Locale.US, StubApp.getString2(1105), string22, Float.valueOf(0.0f), Float.valueOf(Float.MAX_VALUE)));
        }
        if (f10 > Float.MAX_VALUE) {
            throw new IllegalArgumentException(String.format(Locale.US, StubApp.getString2(1104), string22, Float.valueOf(0.0f), Float.valueOf(Float.MAX_VALUE)));
        }
        M.d.c(j3, StubApp.getString2(1099));
        boolean z2 = i3 == 104 || i3 == 102 || i3 == 100;
        Object[] objArr = {Integer.valueOf(i3)};
        if (!z2) {
            throw new IllegalArgumentException(String.format(StubApp.getString2(1103), objArr));
        }
        if (!((j3 == j && j3 == -1) ? false : true)) {
            throw new IllegalStateException(StubApp.getString2(1102));
        }
        I.c cVar = new I.c(j3, i3, Math.min(j3, j3), f10);
        this.f1082e = true;
        this.f1079b.b();
        String str = this.f1084g;
        Looper mainLooper = Looper.getMainLooper();
        int i13 = I.b.f3017a;
        int i14 = Build.VERSION.SDK_INT;
        LocationManager locationManager = this.f1078a;
        if (i14 >= 31) {
            I.a.b(locationManager, str, I.a.c(cVar), new Ab.e(new Handler(mainLooper), 1), this);
            return;
        }
        try {
            if (AbstractC0378a.f9229a == null) {
                AbstractC0378a.f9229a = Class.forName(StubApp.getString2("1100"));
            }
            if (AbstractC0378a.f9230b == null) {
                Method declaredMethod = LocationManager.class.getDeclaredMethod(StubApp.getString2("1101"), AbstractC0378a.f9229a, LocationListener.class, Looper.class);
                AbstractC0378a.f9230b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            LocationRequest a3 = cVar.a(str);
            if (a3 != null) {
                AbstractC0378a.f9230b.invoke(locationManager, a3, this, mainLooper);
                return;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
        }
        locationManager.requestLocationUpdates(str, cVar.f3019b, cVar.f3021d, this, mainLooper);
    }

    @Override // C2.j
    public final void f(A2.g gVar, A2.g gVar2) {
        LocationManager locationManager = this.f1078a;
        Iterator<String> it = locationManager.getProviders(true).iterator();
        Location location = null;
        while (it.hasNext()) {
            Location lastKnownLocation = locationManager.getLastKnownLocation(it.next());
            if (lastKnownLocation != null && g(lastKnownLocation, location)) {
                location = lastKnownLocation;
            }
        }
        gVar.a(location);
    }

    @Override // android.location.LocationListener
    public final void onFlushComplete(int i3) {
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(List list) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            onLocationChanged((Location) list.get(i3));
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        if (str.equals(this.f1084g)) {
            if (this.f1082e) {
                this.f1078a.removeUpdates(this);
            }
            B2.a aVar = this.f1086i;
            if (aVar != null) {
                aVar.b(3);
            }
            this.f1084g = null;
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i3, Bundle bundle) {
        if (i3 != 2 && i3 == 0) {
            onProviderDisabled(str);
        }
    }

    @Override // android.location.LocationListener
    public final synchronized void onLocationChanged(Location location) {
        if (g(location, this.f1083f)) {
            this.f1083f = location;
            if (this.f1085h != null) {
                this.f1079b.a(location);
                this.f1085h.a(this.f1083f);
            }
        }
    }
}
