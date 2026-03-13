package v0;

import android.os.Bundle;
import o0.AbstractC1407D;
import o0.C1438m;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* renamed from: v0.l, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1817l extends AbstractC1407D {

    /* renamed from: c, reason: collision with root package name */
    public final int f21774c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21775d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21776e;

    /* renamed from: f, reason: collision with root package name */
    public final C1438m f21777f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21778g;

    /* renamed from: h, reason: collision with root package name */
    public final L0.B f21779h;
    public final boolean j;

    static {
        i2.u.A(1001, 1002, 1003, 1004, 1005);
        AbstractC1560u.E(1006);
    }

    public C1817l(int i3, Exception exc, int i10) {
        this(i3, exc, i10, null, -1, null, 4, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1817l(String str, Throwable th, int i3, int i10, String str2, int i11, C1438m c1438m, int i12, L0.B b2, long j, boolean z2) {
        super(str, th, i3, j);
        Bundle bundle = Bundle.EMPTY;
        AbstractC1550k.c(!z2 || i10 == 1);
        AbstractC1550k.c(th != null || i10 == 3);
        this.f21774c = i10;
        this.f21775d = str2;
        this.f21776e = i11;
        this.f21777f = c1438m;
        this.f21778g = i12;
        this.f21779h = b2;
        this.j = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1817l(int r14, java.lang.Exception r15, int r16, java.lang.String r17, int r18, o0.C1438m r19, int r20, boolean r21) {
        /*
            r13 = this;
            r8 = r20
            if (r14 == 0) goto L96
            r0 = 3
            r1 = 1
            if (r14 == r1) goto L21
            if (r14 == r0) goto L19
            r0 = 23640(0x5c58, float:3.3127E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
        L11:
            r5 = r17
            r6 = r18
            r7 = r19
            goto La3
        L19:
            r0 = 23641(0x5c59, float:3.3128E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            goto L11
        L21:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r17
            r2.append(r5)
            r3 = 23642(0x5c5a, float:3.313E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r2.append(r3)
            r6 = r18
            r2.append(r6)
            r3 = 14651(0x393b, float:2.053E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r2.append(r3)
            r7 = r19
            r2.append(r7)
            r3 = 23643(0x5c5b, float:3.3131E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r2.append(r3)
            int r3 = r0.AbstractC1560u.f20190a
            if (r8 == 0) goto L87
            if (r8 == r1) goto L7f
            r1 = 2
            if (r8 == r1) goto L77
            if (r8 == r0) goto L6f
            r0 = 4
            if (r8 != r0) goto L69
            r0 = 821(0x335, float:1.15E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            goto L8e
        L69:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r14.<init>()
            throw r14
        L6f:
            r0 = 23644(0x5c5c, float:3.3132E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            goto L8e
        L77:
            r0 = 23645(0x5c5d, float:3.3134E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            goto L8e
        L7f:
            r0 = 23646(0x5c5e, float:3.3135E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            goto L8e
        L87:
            r0 = 4608(0x1200, float:6.457E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
        L8e:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto La3
        L96:
            r5 = r17
            r6 = r18
            r7 = r19
            r0 = 23647(0x5c5f, float:3.3137E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
        La3:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Lb5
            r1 = 23648(0x5c60, float:3.3138E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            java.lang.String r0 = p0.AbstractC1482f.g(r0, r1)
        Lb5:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r4 = r14
            r2 = r15
            r3 = r16
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.C1817l.<init>(int, java.lang.Exception, int, java.lang.String, int, o0.m, int, boolean):void");
    }
}
