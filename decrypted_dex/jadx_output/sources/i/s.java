package i;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import ba.AbstractC0534b;
import com.stub.StubApp;
import java.util.Calendar;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class s extends AbstractC0534b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14627c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f14628d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f14629e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, a5.c cVar) {
        super(vVar);
        this.f14628d = vVar;
        this.f14629e = cVar;
    }

    @Override // ba.AbstractC0534b
    public final IntentFilter e() {
        switch (this.f14627c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(StubApp.getString2(18398));
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction(StubApp.getString2(18395));
                intentFilter2.addAction(StubApp.getString2(18396));
                intentFilter2.addAction(StubApp.getString2(18397));
                return intentFilter2;
        }
    }

    @Override // ba.AbstractC0534b
    public final int g() {
        Location location;
        boolean z2;
        long j;
        Location location2;
        switch (this.f14627c) {
            case 0:
                return o.a((PowerManager) this.f14629e) ? 2 : 1;
            default:
                a5.c cVar = (a5.c) this.f14629e;
                E e10 = (E) cVar.f9284d;
                if (e10.f14517b > System.currentTimeMillis()) {
                    z2 = e10.f14516a;
                } else {
                    Context context = (Context) cVar.f9282b;
                    int b2 = D.a.b(context, StubApp.getString2(141));
                    String string2 = StubApp.getString2(18399);
                    String string22 = StubApp.getString2(18400);
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) cVar.f9283c;
                    if (b2 == 0) {
                        String string23 = StubApp.getString2(1096);
                        try {
                        } catch (Exception e11) {
                            Log.d(string22, string2, e11);
                        }
                        if (locationManager.isProviderEnabled(string23)) {
                            location2 = locationManager.getLastKnownLocation(string23);
                            location = location2;
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (D.a.b(context, StubApp.getString2(140)) == 0) {
                        String string24 = StubApp.getString2(540);
                        try {
                            if (locationManager.isProviderEnabled(string24)) {
                                location3 = locationManager.getLastKnownLocation(string24);
                            }
                        } catch (Exception e12) {
                            Log.d(string22, string2, e12);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (D.f14512d == null) {
                            D.f14512d = new D();
                        }
                        D d8 = D.f14512d;
                        d8.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        d8.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        z2 = d8.f14515c == 1;
                        long j3 = d8.f14514b;
                        long j10 = d8.f14513a;
                        d8.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
                        long j11 = d8.f14514b;
                        if (j3 == -1 || j10 == -1) {
                            j = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis <= j10) {
                                j11 = currentTimeMillis > j3 ? j10 : j3;
                            }
                            j = j11 + 60000;
                        }
                        e10.f14516a = z2;
                        e10.f14517b = j;
                    } else {
                        Log.i(string22, StubApp.getString2(18401));
                        int i3 = Calendar.getInstance().get(11);
                        if (i3 < 6 || i3 >= 22) {
                            z2 = true;
                        }
                    }
                }
                return z2 ? 2 : 1;
        }
    }

    @Override // ba.AbstractC0534b
    public final void i() {
        switch (this.f14627c) {
            case 0:
                this.f14628d.m(true, true);
                break;
            default:
                this.f14628d.m(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, Context context) {
        super(vVar);
        this.f14628d = vVar;
        this.f14629e = (PowerManager) StubApp.getOrigApplicationContext(context.getApplicationContext()).getSystemService(StubApp.getString2(1358));
    }
}
