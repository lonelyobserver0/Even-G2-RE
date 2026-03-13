package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class q4 extends AbstractC0621h {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11649c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N1 f11651e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(N1 n12, boolean z2, boolean z10) {
        super(StubApp.getString2(11764));
        Objects.requireNonNull(n12);
        this.f11651e = n12;
        this.f11649c = z2;
        this.f11650d = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    @Override // com.google.android.gms.internal.measurement.AbstractC0621h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.InterfaceC0651n e(p2.h r14, java.util.List r15) {
        /*
            r13 = this;
            r0 = 11764(0x2df4, float:1.6485E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r1 = 1
            a4.f.M(r1, r0, r15)
            int r0 = r15.size()
            com.google.android.gms.internal.measurement.r r2 = com.google.android.gms.internal.measurement.InterfaceC0651n.f11619U
            r3 = 0
            com.google.android.gms.internal.measurement.N1 r4 = r13.f11651e
            if (r0 != r1) goto L38
            java.lang.Object r15 = r15.get(r3)
            com.google.android.gms.internal.measurement.n r15 = (com.google.android.gms.internal.measurement.InterfaceC0651n) r15
            java.lang.Object r0 = r14.f19672b
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0680t) r0
            com.google.android.gms.internal.measurement.n r14 = r0.c(r14, r15)
            java.lang.String r7 = r14.b()
            java.util.List r8 = java.util.Collections.EMPTY_LIST
            java.lang.Object r14 = r4.f11315d
            r5 = r14
            Z9.a r5 = (Z9.C0366a) r5
            boolean r9 = r13.f11649c
            boolean r10 = r13.f11650d
            r6 = 3
            r5.H(r6, r7, r8, r9, r10)
            return r2
        L38:
            java.lang.Object r0 = r15.get(r3)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0651n) r0
            java.lang.Object r3 = r14.f19672b
            com.google.android.gms.internal.measurement.t r3 = (com.google.android.gms.internal.measurement.C0680t) r3
            com.google.android.gms.internal.measurement.n r0 = r3.c(r14, r0)
            java.lang.Double r0 = r0.d()
            double r5 = r0.doubleValue()
            int r0 = a4.f.W(r5)
            r3 = 5
            r5 = 2
            if (r0 == r5) goto L66
            r6 = 3
            if (r0 == r6) goto L64
            if (r0 == r3) goto L62
            r7 = 6
            if (r0 == r7) goto L60
        L5e:
            r8 = r6
            goto L68
        L60:
            r8 = r5
            goto L68
        L62:
            r8 = r3
            goto L68
        L64:
            r8 = r1
            goto L68
        L66:
            r6 = 4
            goto L5e
        L68:
            java.lang.Object r0 = r15.get(r1)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0651n) r0
            java.lang.Object r1 = r14.f19672b
            com.google.android.gms.internal.measurement.t r1 = (com.google.android.gms.internal.measurement.C0680t) r1
            com.google.android.gms.internal.measurement.n r0 = r1.c(r14, r0)
            java.lang.String r9 = r0.b()
            int r0 = r15.size()
            if (r0 != r5) goto L8f
            java.util.List r10 = java.util.Collections.EMPTY_LIST
            java.lang.Object r14 = r4.f11315d
            r7 = r14
            Z9.a r7 = (Z9.C0366a) r7
            boolean r11 = r13.f11649c
            boolean r12 = r13.f11650d
            r7.H(r8, r9, r10, r11, r12)
            return r2
        L8f:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L94:
            int r0 = r15.size()
            int r0 = java.lang.Math.min(r0, r3)
            if (r5 >= r0) goto Lb2
            java.lang.Object r0 = r15.get(r5)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0651n) r0
            com.google.android.gms.internal.measurement.n r0 = r1.c(r14, r0)
            java.lang.String r0 = r0.b()
            r10.add(r0)
            int r5 = r5 + 1
            goto L94
        Lb2:
            java.lang.Object r14 = r4.f11315d
            r7 = r14
            Z9.a r7 = (Z9.C0366a) r7
            boolean r11 = r13.f11649c
            boolean r12 = r13.f11650d
            r7.H(r8, r9, r10, r11, r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.q4.e(p2.h, java.util.List):com.google.android.gms.internal.measurement.n");
    }
}
