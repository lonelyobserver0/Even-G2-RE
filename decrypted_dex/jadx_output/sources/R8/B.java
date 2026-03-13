package R8;

import Qb.L;
import android.content.SharedPreferences;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import l4.C1164b0;
import l4.C1200n0;
import l4.F1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public long f6251a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6252b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6253c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6254d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6255e;

    public /* synthetic */ B(F1 f12) {
        Objects.requireNonNull(f12);
        this.f6255e = f12;
    }

    public void a() {
        C0249g c0249g;
        if (((C0249g) this.f6254d) != null || (c0249g = (C0249g) this.f6255e) == null) {
            return;
        }
        Intrinsics.checkNotNull(c0249g);
        this.f6254d = c0249g;
        this.f6255e = null;
        c0249g.f6294b.invoke();
        L.j((Vb.f) this.f6253c, null, new A(this, c0249g, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r2 < java.lang.Math.max(0, ((java.lang.Integer) l4.AbstractC1148D.j.a(null)).intValue())) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (r2 >= java.lang.Math.max(0, ((java.lang.Integer) l4.AbstractC1148D.j.a(null)).intValue())) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(long r11, com.google.android.gms.internal.measurement.C0613f1 r13) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f6254d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto Ld
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f6254d = r0
        Ld:
            java.lang.Object r0 = r10.f6253c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L1a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f6253c = r0
        L1a:
            java.lang.Object r0 = r10.f6254d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L45
            java.lang.Object r0 = r10.f6254d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.measurement.f1 r0 = (com.google.android.gms.internal.measurement.C0613f1) r0
            long r2 = r0.u()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r6 = 60
            long r2 = r2 / r6
            long r2 = r2 / r6
            long r8 = r13.u()
            long r8 = r8 / r4
            long r8 = r8 / r6
            long r8 = r8 / r6
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto Lcc
        L45:
            long r2 = r10.f6251a
            int r0 = r13.k()
            long r4 = (long) r0
            long r2 = r2 + r4
            java.lang.Object r0 = r10.f6255e
            l4.F1 r0 = (l4.F1) r0
            l4.g r4 = r0.d0()
            l4.C r5 = l4.AbstractC1148D.f15986e1
            r6 = 0
            boolean r4 = r4.u(r6, r5)
            if (r4 == 0) goto L81
            java.lang.Object r4 = r10.f6254d
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L9a
            r0.d0()
            l4.C r4 = l4.AbstractC1148D.j
            java.lang.Object r4 = r4.a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = java.lang.Math.max(r1, r4)
            long r4 = (long) r4
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 >= 0) goto Lcc
            goto L9a
        L81:
            r0.d0()
            l4.C r4 = l4.AbstractC1148D.j
            java.lang.Object r4 = r4.a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = java.lang.Math.max(r1, r4)
            long r4 = (long) r4
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L9a
            goto Lcc
        L9a:
            r10.f6251a = r2
            java.lang.Object r2 = r10.f6254d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r13)
            java.lang.Object r13 = r10.f6253c
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r13.add(r11)
            java.lang.Object r11 = r10.f6254d
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r11 = r11.size()
            r0.d0()
            l4.C r12 = l4.AbstractC1148D.f16000k
            java.lang.Object r12 = r12.a(r6)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r13 = 1
            int r12 = java.lang.Math.max(r13, r12)
            if (r11 < r12) goto Lcd
        Lcc:
            return r1
        Lcd:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: R8.B.b(long, com.google.android.gms.internal.measurement.f1):boolean");
    }

    public void c() {
        C1164b0 c1164b0 = (C1164b0) this.f6255e;
        c1164b0.k();
        ((C1200n0) c1164b0.f4728a).f16545l.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = c1164b0.o().edit();
        edit.remove((String) this.f6253c);
        edit.remove((String) this.f6254d);
        edit.putLong((String) this.f6252b, currentTimeMillis);
        edit.apply();
    }
}
