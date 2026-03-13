package l4;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.stub.StubApp;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: l4.l1, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1195l1 extends A1 {

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f16507d;

    /* renamed from: e, reason: collision with root package name */
    public final C1161a0 f16508e;

    /* renamed from: f, reason: collision with root package name */
    public final C1161a0 f16509f;

    /* renamed from: g, reason: collision with root package name */
    public final C1161a0 f16510g;

    /* renamed from: h, reason: collision with root package name */
    public final C1161a0 f16511h;
    public final C1161a0 j;

    /* renamed from: k, reason: collision with root package name */
    public final C1161a0 f16512k;

    public C1195l1(F1 f12) {
        super(f12);
        this.f16507d = new HashMap();
        C1164b0 c1164b0 = ((C1200n0) this.f4728a).f16540e;
        C1200n0.j(c1164b0);
        this.f16508e = new C1161a0(c1164b0, StubApp.getString2(20537), 0L);
        C1164b0 c1164b02 = ((C1200n0) this.f4728a).f16540e;
        C1200n0.j(c1164b02);
        this.f16509f = new C1161a0(c1164b02, StubApp.getString2(20538), 0L);
        C1164b0 c1164b03 = ((C1200n0) this.f4728a).f16540e;
        C1200n0.j(c1164b03);
        this.f16510g = new C1161a0(c1164b03, StubApp.getString2(20539), 0L);
        C1164b0 c1164b04 = ((C1200n0) this.f4728a).f16540e;
        C1200n0.j(c1164b04);
        this.f16511h = new C1161a0(c1164b04, StubApp.getString2(20540), 0L);
        C1164b0 c1164b05 = ((C1200n0) this.f4728a).f16540e;
        C1200n0.j(c1164b05);
        this.j = new C1161a0(c1164b05, StubApp.getString2(20541), 0L);
        C1164b0 c1164b06 = ((C1200n0) this.f4728a).f16540e;
        C1200n0.j(c1164b06);
        this.f16512k = new C1161a0(c1164b06, StubApp.getString2(20542), 0L);
    }

    @Override // l4.A1
    public final void n() {
    }

    public final Pair o(String str) {
        C1192k1 c1192k1;
        J1.t tVar;
        k();
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        c1200n0.f16545l.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.f16507d;
        C1192k1 c1192k12 = (C1192k1) hashMap.get(str);
        if (c1192k12 != null && elapsedRealtime < c1192k12.f16500c) {
            return new Pair(c1192k12.f16498a, Boolean.valueOf(c1192k12.f16499b));
        }
        C1147C c1147c = AbstractC1148D.f15975b;
        C1178g c1178g = c1200n0.f16539d;
        long r8 = c1178g.r(str, c1147c) + elapsedRealtime;
        try {
            try {
                tVar = M3.a.a(c1200n0.f16536a);
            } catch (PackageManager.NameNotFoundException unused) {
                if (c1192k12 != null && elapsedRealtime < c1192k12.f16500c + c1178g.r(str, AbstractC1148D.f15978c)) {
                    return new Pair(c1192k12.f16498a, Boolean.valueOf(c1192k12.f16499b));
                }
                tVar = null;
            }
        } catch (Exception e10) {
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.f16248n.c(e10, StubApp.getString2(19607));
            c1192k1 = new C1192k1(r8, "", false);
        }
        if (tVar == null) {
            return new Pair(StubApp.getString2("2168"), Boolean.FALSE);
        }
        String str2 = tVar.f3378b;
        boolean z2 = tVar.f3379c;
        c1192k1 = str2 != null ? new C1192k1(r8, str2, z2) : new C1192k1(r8, "", z2);
        hashMap.put(str, c1192k1);
        return new Pair(c1192k1.f16498a, Boolean.valueOf(c1192k1.f16499b));
    }

    public final String p(String str, boolean z2) {
        k();
        String string2 = z2 ? (String) o(str).first : StubApp.getString2(2168);
        MessageDigest B7 = K1.B();
        if (B7 == null) {
            return null;
        }
        return String.format(Locale.US, StubApp.getString2(20543), new BigInteger(1, B7.digest(string2.getBytes())));
    }
}
