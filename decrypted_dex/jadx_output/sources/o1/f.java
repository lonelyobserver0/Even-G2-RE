package o1;

import T0.l;
import com.stub.StubApp;
import java.io.EOFException;
import o0.C1406C;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f18330a;

    /* renamed from: b, reason: collision with root package name */
    public long f18331b;

    /* renamed from: c, reason: collision with root package name */
    public int f18332c;

    /* renamed from: d, reason: collision with root package name */
    public int f18333d;

    /* renamed from: e, reason: collision with root package name */
    public int f18334e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f18335f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    public final C1553n f18336g = new C1553n(255);

    public final boolean a(l lVar, boolean z2) {
        boolean z10;
        boolean z11;
        this.f18330a = 0;
        this.f18331b = 0L;
        this.f18332c = 0;
        this.f18333d = 0;
        this.f18334e = 0;
        C1553n c1553n = this.f18336g;
        c1553n.D(27);
        try {
            z10 = lVar.i(c1553n.f20176a, 0, 27, z2);
        } catch (EOFException e10) {
            if (!z2) {
                throw e10;
            }
            z10 = false;
        }
        if (z10 && c1553n.w() == 1332176723) {
            if (c1553n.u() == 0) {
                this.f18330a = c1553n.u();
                this.f18331b = c1553n.k();
                c1553n.l();
                c1553n.l();
                c1553n.l();
                int u2 = c1553n.u();
                this.f18332c = u2;
                this.f18333d = u2 + 27;
                c1553n.D(u2);
                try {
                    z11 = lVar.i(c1553n.f20176a, 0, this.f18332c, z2);
                } catch (EOFException e11) {
                    if (!z2) {
                        throw e11;
                    }
                    z11 = false;
                }
                if (z11) {
                    for (int i3 = 0; i3 < this.f18332c; i3++) {
                        int u10 = c1553n.u();
                        this.f18335f[i3] = u10;
                        this.f18334e += u10;
                    }
                    return true;
                }
            } else if (!z2) {
                throw C1406C.c(StubApp.getString2(21602));
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        if (r11 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r10.f7030d >= r11) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r10.k(1) == (-1)) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(T0.l r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f7030d
            long r2 = r10.l()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            r0.AbstractC1550k.c(r0)
            r0.n r0 = r9.f18336g
            r3 = 4
            r0.D(r3)
        L18:
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 == 0) goto L27
            long r5 = r10.f7030d
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 >= 0) goto L46
        L27:
            byte[] r5 = r0.f20176a
            boolean r5 = r10.i(r5, r1, r3, r2)     // Catch: java.io.EOFException -> L2e
            goto L2f
        L2e:
            r5 = r1
        L2f:
            if (r5 == 0) goto L46
            r0.G(r1)
            long r4 = r0.w()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L42
            r10.f7032f = r1
            return r2
        L42:
            r10.u(r2)
            goto L18
        L46:
            if (r4 == 0) goto L4e
            long r5 = r10.f7030d
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 >= 0) goto L56
        L4e:
            int r0 = r10.k(r2)
            r3 = -1
            if (r0 == r3) goto L56
            goto L46
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.f.b(T0.l, long):boolean");
    }
}
