package X2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b3.C0498N;
import com.mapbox.common.location.Location;
import com.stub.StubApp;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class v implements B {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f8329b;

    public v(w wVar) {
        this.f8329b = wVar;
    }

    public static final void a(final long j, final long j3, final long j10, final w wVar, final z zVar) {
        String string2 = StubApp.getString2(7111);
        f fVar = wVar.j;
        String string22 = StubApp.getString2(390);
        if (fVar != null) {
            R2.c.b(string22, StubApp.getString2(7112) + j10);
            Result.Companion companion = Result.INSTANCE;
            zVar.invoke(Result.m39boximpl(Result.m40constructorimpl(wVar.j)));
            return;
        }
        n nVar = wVar.f8334e;
        C0498N c0498n = nVar != null ? nVar.f8311d : null;
        if (c0498n != null) {
            try {
                Location location = c0498n.f10574g;
                if (location != null) {
                    f fVar2 = new f(new e(location.getLatitude(), location.getLongitude()), Long.valueOf(location.getTimestamp()), location.getAltitude(), location.getHorizontalAccuracy(), location.getVerticalAccuracy(), location.getSpeed(), location.getSpeedAccuracy(), location.getBearing(), location.getBearingAccuracy(), location.getFloor());
                    wVar.j = fVar2;
                    R2.c.b(string22, string2 + j10);
                    zVar.invoke(Result.m39boximpl(Result.m40constructorimpl(fVar2)));
                    return;
                }
            } catch (Exception e10) {
                R2.c.f(string22, StubApp.getString2(7113) + e10.getMessage());
            }
        }
        if (j10 > 0) {
            StringBuilder m4 = AbstractC1482f.m(j, StubApp.getString2(7114), StubApp.getString2(7115));
            m4.append(j10 - 1);
            R2.c.b(string22, m4.toString());
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: X2.s
                @Override // java.lang.Runnable
                public final void run() {
                    v.a(j, j3, j10 - 1, wVar, zVar);
                }
            }, j);
            return;
        }
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(7116));
        sb2.append(j3);
        String string23 = StubApp.getString2(7117);
        sb2.append(string23);
        R2.c.c(string22, sb2.toString());
        Result.Companion companion2 = Result.INSTANCE;
        zVar.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new Exception(StubApp.getString2(7118) + j3 + string23)))));
    }

    public final boolean b() {
        C0498N c0498n;
        w wVar = this.f8329b;
        String string2 = StubApp.getString2(7119);
        String string22 = StubApp.getString2(390);
        R2.c.e(string22, string2);
        n nVar = wVar.f8334e;
        boolean z2 = (nVar == null || (c0498n = nVar.f8311d) == null) ? false : c0498n.f10589r;
        boolean z10 = !z2;
        R2.c.e(string22, StubApp.getString2(7120) + z2 + StubApp.getString2(7121) + z10);
        return z10;
    }

    public final void c(String languageIdentifier) {
        C0498N c0498n;
        Intrinsics.checkNotNullParameter(languageIdentifier, "languageIdentifier");
        w wVar = this.f8329b;
        R2.c.e(StubApp.getString2(390), StubApp.getString2(7122) + languageIdentifier);
        wVar.f8341n = languageIdentifier;
        n nVar = wVar.f8334e;
        if (nVar == null || (c0498n = nVar.f8311d) == null) {
            return;
        }
        c0498n.H(languageIdentifier);
    }

    public final void d(boolean z2) {
        C0498N c0498n;
        R2.c.e(StubApp.getString2(390), StubApp.getString2(7123) + z2);
        n nVar = this.f8329b.f8334e;
        if (nVar == null || (c0498n = nVar.f8311d) == null) {
            return;
        }
        boolean z10 = !z2;
        String str = StubApp.getString2(7124) + z10 + StubApp.getString2(7125) + (c0498n.f10582n == null);
        String string2 = StubApp.getString2(103);
        R2.c.b(string2, str);
        c0498n.f10589r = z10;
        C0498N.f10533R0 = Boolean.valueOf(z10);
        R2.c.b(string2, StubApp.getString2(7128) + z10 + StubApp.getString2(7129) + (!z2 ? StubApp.getString2(7126) : StubApp.getString2(7127)) + StubApp.getString2(74));
        if (z2) {
            R2.c.b(string2, StubApp.getString2(7131));
            E9.k kVar = c0498n.f10582n;
            if (kVar != null) {
                kVar.i(new F9.e(1.0f));
                return;
            }
            return;
        }
        R2.c.b(string2, StubApp.getString2(7130));
        E9.k kVar2 = c0498n.f10582n;
        if (kVar2 != null) {
            kVar2.i(new F9.e(0.0f));
        }
    }

    public final void e(Function1 callback) {
        C0498N c0498n;
        Intrinsics.checkNotNullParameter(callback, "callback");
        n nVar = this.f8329b.f8334e;
        if (nVar != null && (c0498n = nVar.f8311d) != null) {
            c0498n.y();
        }
        Message obtain = Message.obtain();
        Boolean bool = Boolean.TRUE;
        obtain.obj = MapsKt.mapOf(TuplesKt.to(StubApp.getString2(7132), bool), TuplesKt.to(StubApp.getString2(2024), Boolean.FALSE), TuplesKt.to(StubApp.getString2(2025), null), TuplesKt.to(StubApp.getString2(2026), null), TuplesKt.to(StubApp.getString2(2027), null), TuplesKt.to(StubApp.getString2(2028), null), TuplesKt.to(StubApp.getString2(2029), null), TuplesKt.to(StubApp.getString2(2030), null), TuplesKt.to(StubApp.getString2(2031), null), TuplesKt.to(StubApp.getString2(2032), null), TuplesKt.to(StubApp.getString2(2033), null));
        Z2.a aVar = Z2.b.f8972b;
        if (aVar != null) {
            aVar.sendMessage(obtain);
        }
        callback.invoke(Result.m39boximpl(Result.m40constructorimpl(bool)));
    }

    public final void f(j travelMode) {
        C0498N c0498n;
        Intrinsics.checkNotNullParameter(travelMode, "mode");
        n nVar = this.f8329b.f8334e;
        if (nVar == null || (c0498n = nVar.f8311d) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(travelMode, "travelMode");
        R2.c.e(StubApp.getString2(103), StubApp.getString2(7133) + travelMode);
        c0498n.f10596v = travelMode;
        if (c0498n.f10598w == null) {
            return;
        }
        List list = c0498n.h0;
        Intrinsics.checkNotNull(list);
        c0498n.G(list, travelMode, null);
    }
}
