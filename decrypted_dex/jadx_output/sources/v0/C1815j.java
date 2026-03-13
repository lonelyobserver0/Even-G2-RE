package v0;

import com.stub.StubApp;
import java.util.HashMap;
import java.util.Iterator;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* renamed from: v0.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1815j {

    /* renamed from: a, reason: collision with root package name */
    public final P0.e f21763a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21764b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21765c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21766d;

    /* renamed from: e, reason: collision with root package name */
    public final long f21767e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21768f;

    /* renamed from: g, reason: collision with root package name */
    public final long f21769g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f21770h;

    /* renamed from: i, reason: collision with root package name */
    public long f21771i;

    public C1815j() {
        P0.e eVar = new P0.e();
        String string2 = StubApp.getString2(23632);
        String string22 = StubApp.getString2(824);
        a(string2, 2500, 0, string22);
        String string23 = StubApp.getString2(23633);
        a(string23, 5000, 0, string22);
        String string24 = StubApp.getString2(23634);
        a(string24, 50000, 2500, string2);
        a(string24, 50000, 5000, string23);
        a(StubApp.getString2(23635), 50000, 50000, string24);
        a(StubApp.getString2(23636), 0, 0, string22);
        this.f21763a = eVar;
        long j = 50000;
        this.f21764b = AbstractC1560u.J(j);
        this.f21765c = AbstractC1560u.J(j);
        this.f21766d = AbstractC1560u.J(2500);
        this.f21767e = AbstractC1560u.J(5000);
        this.f21768f = -1;
        this.f21769g = AbstractC1560u.J(0);
        this.f21770h = new HashMap();
        this.f21771i = -1L;
    }

    public static void a(String str, int i3, int i10, String str2) {
        AbstractC1550k.b(str + StubApp.getString2(23637) + str2, i3 >= i10);
    }

    public final int b() {
        Iterator it = this.f21770h.values().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            i3 += ((C1814i) it.next()).f21762b;
        }
        return i3;
    }

    public final boolean c(C1804G c1804g) {
        int i3;
        C1814i c1814i = (C1814i) this.f21770h.get(c1804g.f21583a);
        c1814i.getClass();
        P0.e eVar = this.f21763a;
        synchronized (eVar) {
            i3 = eVar.f5388d * eVar.f5386b;
        }
        boolean z2 = i3 >= b();
        float f10 = c1804g.f21585c;
        long j = this.f21765c;
        long j3 = this.f21764b;
        if (f10 > 1.0f) {
            j3 = Math.min(AbstractC1560u.w(f10, j3), j);
        }
        long max = Math.max(j3, 500000L);
        long j10 = c1804g.f21584b;
        if (j10 < max) {
            c1814i.f21761a = !z2;
            if (z2 && j10 < 500000) {
                AbstractC1550k.w(StubApp.getString2(23638), StubApp.getString2(23639));
            }
        } else if (j10 >= j || z2) {
            c1814i.f21761a = false;
        }
        return c1814i.f21761a;
    }

    public final void d() {
        if (!this.f21770h.isEmpty()) {
            this.f21763a.a(b());
            return;
        }
        P0.e eVar = this.f21763a;
        synchronized (eVar) {
            if (eVar.f5385a) {
                eVar.a(0);
            }
        }
    }
}
