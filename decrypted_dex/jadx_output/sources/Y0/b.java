package Y0;

import T0.C0315f;
import T0.C0316g;
import T0.InterfaceC0317h;
import T0.InterfaceC0319j;
import T0.l;
import T0.s;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final C0315f f8711a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0319j f8712b;

    /* renamed from: c, reason: collision with root package name */
    public C0316g f8713c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8714d;

    public b(InterfaceC0317h interfaceC0317h, InterfaceC0319j interfaceC0319j, long j, long j3, long j10, long j11, long j12, int i3) {
        this.f8712b = interfaceC0319j;
        this.f8714d = i3;
        this.f8711a = new C0315f(interfaceC0317h, j, j3, j10, j11, j12);
    }

    public static int a(int i3, byte[] bArr) {
        return (bArr[i3 + 3] & UByte.MAX_VALUE) | ((bArr[i3] & UByte.MAX_VALUE) << 24) | ((bArr[i3 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i3 + 2] & UByte.MAX_VALUE) << 8);
    }

    public static int c(l lVar, long j, s sVar) {
        if (j == lVar.f7030d) {
            return 0;
        }
        sVar.f7043a = j;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
    
        return c(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(T0.l r28, T0.s r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
        L6:
            T0.g r3 = r0.f8713c
            r0.AbstractC1550k.h(r3)
            long r4 = r3.f7014f
            long r6 = r3.f7015g
            long r8 = r3.f7016h
            long r6 = r6 - r4
            int r10 = r0.f8714d
            long r10 = (long) r10
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r7 = 0
            T0.j r10 = r0.f8712b
            if (r6 > 0) goto L26
            r0.f8713c = r7
            r10.e()
            int r1 = c(r1, r4, r2)
            return r1
        L26:
            long r4 = r1.f7030d
            long r4 = r8 - r4
            r11 = 0
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 < 0) goto Lc7
            r13 = 262144(0x40000, double:1.295163E-318)
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 > 0) goto Lc7
            int r4 = (int) r4
            r1.u(r4)
            r4 = 0
            r1.f7032f = r4
            long r4 = r3.f7010b
            T0.i r4 = r10.b(r1, r4)
            r5 = -3
            int r6 = r4.f7018a
            if (r6 == r5) goto Lbd
            r5 = -2
            long r8 = r4.f7019b
            r15 = r11
            long r11 = r4.f7020c
            if (r6 == r5) goto L9c
            r4 = -1
            if (r6 == r4) goto L7d
            if (r6 != 0) goto L70
            long r3 = r1.f7030d
            long r3 = r11 - r3
            int r5 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r5 < 0) goto L66
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 > 0) goto L66
            int r3 = (int) r3
            r1.u(r3)
        L66:
            r0.f8713c = r7
            r10.e()
            int r1 = c(r1, r11, r2)
            return r1
        L70:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r2 = 7494(0x1d46, float:1.0501E-41)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            r1.<init>(r2)
            throw r1
        L7d:
            r3.f7013e = r8
            r3.f7015g = r11
            long r4 = r3.f7012d
            long r6 = r3.f7014f
            long r13 = r3.f7011c
            r17 = r4
            long r4 = r3.f7010b
            r15 = r4
            r21 = r6
            r19 = r8
            r23 = r11
            r25 = r13
            long r4 = T0.C0316g.a(r15, r17, r19, r21, r23, r25)
            r3.f7016h = r4
            goto L6
        L9c:
            r4 = r8
            r6 = r11
            r3.f7012d = r4
            r3.f7014f = r6
            long r8 = r3.f7013e
            long r10 = r3.f7015g
            long r12 = r3.f7011c
            long r14 = r3.f7010b
            r17 = r4
            r21 = r6
            r19 = r8
            r23 = r10
            r25 = r12
            r15 = r14
            long r4 = T0.C0316g.a(r15, r17, r19, r21, r23, r25)
            r3.f7016h = r4
            goto L6
        Lbd:
            r0.f8713c = r7
            r10.e()
            int r1 = c(r1, r8, r2)
            return r1
        Lc7:
            int r1 = c(r1, r8, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.b.b(T0.l, T0.s):int");
    }

    public final void d(long j) {
        C0316g c0316g = this.f8713c;
        if (c0316g == null || c0316g.f7009a != j) {
            C0315f c0315f = this.f8711a;
            this.f8713c = new C0316g(j, c0315f.f7003a.a(j), c0315f.f7005c, c0315f.f7006d, c0315f.f7007e, c0315f.f7008f);
        }
    }
}
