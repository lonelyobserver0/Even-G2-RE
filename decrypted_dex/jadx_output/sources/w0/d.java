package w0;

import L0.B;
import o0.AbstractC1416M;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f21998a;

    /* renamed from: b, reason: collision with root package name */
    public int f21999b;

    /* renamed from: c, reason: collision with root package name */
    public long f22000c;

    /* renamed from: d, reason: collision with root package name */
    public final B f22001d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22002e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22003f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f22004g;

    public d(e eVar, String str, int i3, B b2) {
        this.f22004g = eVar;
        this.f21998a = str;
        this.f21999b = i3;
        this.f22000c = b2 == null ? -1L : b2.f3884d;
        if (b2 == null || !b2.b()) {
            return;
        }
        this.f22001d = b2;
    }

    public final boolean a(a aVar) {
        B b2 = aVar.f21982d;
        if (b2 == null) {
            return this.f21999b != aVar.f21981c;
        }
        long j = this.f22000c;
        if (j == -1) {
            return false;
        }
        if (b2.f3884d > j) {
            return true;
        }
        B b10 = this.f22001d;
        if (b10 == null) {
            return false;
        }
        AbstractC1416M abstractC1416M = aVar.f21980b;
        int b11 = abstractC1416M.b(b2.f3881a);
        int b12 = abstractC1416M.b(b10.f3881a);
        if (b2.f3884d < b10.f3884d || b11 < b12) {
            return false;
        }
        if (b11 > b12) {
            return true;
        }
        boolean b13 = b2.b();
        int i3 = b10.f3882b;
        if (!b13) {
            int i10 = b2.f3885e;
            return i10 == -1 || i10 > i3;
        }
        int i11 = b2.f3882b;
        if (i11 > i3) {
            return true;
        }
        if (i11 == i3) {
            return b2.f3883c > b10.f3883c;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.o()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(o0.AbstractC1416M r7, o0.AbstractC1416M r8) {
        /*
            r6 = this;
            int r0 = r6.f21999b
            int r1 = r7.o()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L13
            int r7 = r8.o()
            if (r0 >= r7) goto L11
            goto L38
        L11:
            r0 = r3
            goto L38
        L13:
            w0.e r1 = r6.f22004g
            o0.L r4 = r1.f22007a
            r7.n(r0, r4)
            o0.L r0 = r1.f22007a
            int r4 = r0.f18063n
        L1e:
            int r5 = r0.f18064o
            if (r4 > r5) goto L11
            java.lang.Object r5 = r7.l(r4)
            int r5 = r8.b(r5)
            if (r5 == r3) goto L35
            o0.K r7 = r1.f22008b
            o0.K r7 = r8.f(r5, r7, r2)
            int r0 = r7.f18044c
            goto L38
        L35:
            int r4 = r4 + 1
            goto L1e
        L38:
            r6.f21999b = r0
            if (r0 != r3) goto L3d
            goto L4c
        L3d:
            L0.B r7 = r6.f22001d
            if (r7 != 0) goto L42
            goto L4a
        L42:
            java.lang.Object r7 = r7.f3881a
            int r7 = r8.b(r7)
            if (r7 == r3) goto L4c
        L4a:
            r7 = 1
            return r7
        L4c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.d.b(o0.M, o0.M):boolean");
    }
}
