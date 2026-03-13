package l4;

import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class F0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f16043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P0 f16044b;

    public F0(P0 p02, boolean z2) {
        this.f16043a = z2;
        Objects.requireNonNull(p02);
        this.f16044b = p02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r3 != r4) goto L19;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            l4.P0 r0 = r9.f16044b
            java.lang.Object r1 = r0.f4728a
            l4.n0 r1 = (l4.C1200n0) r1
            boolean r2 = r1.d()
            java.lang.Boolean r3 = r1.f16530B
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L1a
            java.lang.Boolean r3 = r1.f16530B
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L1a
            r3 = r5
            goto L1b
        L1a:
            r3 = r4
        L1b:
            boolean r6 = r9.f16043a
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            r1.f16530B = r7
            if (r3 != r6) goto L3a
            l4.T r3 = r1.f16541f
            l4.C1200n0.l(r3)
            Ac.b r3 = r3.f16249p
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            r8 = 19672(0x4cd8, float:2.7566E-41)
            java.lang.String r8 = com.stub.StubApp.getString2(r8)
            r3.c(r7, r8)
        L3a:
            boolean r3 = r1.d()
            if (r3 == r2) goto L53
            boolean r3 = r1.d()
            java.lang.Boolean r7 = r1.f16530B
            if (r7 == 0) goto L51
            java.lang.Boolean r7 = r1.f16530B
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L51
            r4 = r5
        L51:
            if (r3 == r4) goto L6c
        L53:
            l4.T r1 = r1.f16541f
            l4.C1200n0.l(r1)
            Ac.b r1 = r1.f16246l
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r4 = 19673(0x4cd9, float:2.7568E-41)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            r1.d(r4, r3, r2)
        L6c:
            r0.B()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.F0.run():void");
    }
}
