package J1;

import android.database.Cursor;
import com.stub.StubApp;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class u extends s {

    /* renamed from: c, reason: collision with root package name */
    public d f3380c;

    /* renamed from: d, reason: collision with root package name */
    public final s f3381d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3382e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3383f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(d configuration, s delegate, String identityHash, String legacyHash) {
        super(delegate.f3376b, 1);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(identityHash, "identityHash");
        Intrinsics.checkNotNullParameter(legacyHash, "legacyHash");
        this.f3380c = configuration;
        this.f3381d = delegate;
        this.f3382e = identityHash;
        this.f3383f = legacyHash;
    }

    @Override // J1.s
    public final void l(P1.c db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        super.l(db2);
    }

    @Override // J1.s
    public final void m(P1.c db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(db2, "db");
        Cursor F3 = db2.F(StubApp.getString2(2954));
        try {
            boolean z2 = false;
            if (F3.moveToFirst()) {
                if (F3.getInt(0) == 0) {
                    z2 = true;
                }
            }
            CloseableKt.closeFinally(F3, null);
            s sVar = this.f3381d;
            sVar.b(db2);
            if (!z2) {
                t r8 = sVar.r(db2);
                if (!r8.f3379c) {
                    throw new IllegalStateException(StubApp.getString2(2955) + r8.f3378b);
                }
            }
            s(db2);
            sVar.m(db2);
        } finally {
        }
    }

    @Override // J1.s
    public final void n(P1.c db2, int i3, int i10) {
        Intrinsics.checkNotNullParameter(db2, "db");
        q(db2, i3, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    @Override // J1.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(P1.c r7) {
        /*
            r6 = this;
            java.lang.String r0 = "db"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 2956(0xb8c, float:4.142E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            android.database.Cursor r0 = r7.F(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L25
            r2 = 0
            if (r1 == 0) goto L28
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L28
            r1 = 1
            goto L29
        L25:
            r7 = move-exception
            goto Lae
        L28:
            r1 = r2
        L29:
            r3 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r3)
            J1.s r0 = r6.f3381d
            if (r1 == 0) goto L82
            O1.a r1 = new O1.a
            r4 = 2957(0xb8d, float:4.144E-42)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            r5 = 0
            r1.<init>(r4, r5)
            android.database.Cursor r1 = r7.C(r1)
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L4f
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L4d
            goto L50
        L4d:
            r7 = move-exception
            goto L7c
        L4f:
            r2 = r3
        L50:
            kotlin.io.CloseableKt.closeFinally(r1, r3)
            java.lang.String r1 = r6.f3382e
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r4 != 0) goto L8d
            java.lang.String r4 = r6.f3383f
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r2)
            if (r4 == 0) goto L64
            goto L8d
        L64:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r0 = 2958(0xb8e, float:4.145E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r3 = 2959(0xb8f, float:4.146E-42)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            java.lang.String r0 = p0.AbstractC1482f.i(r0, r1, r3, r2)
            r7.<init>(r0)
            throw r7
        L7c:
            throw r7     // Catch: java.lang.Throwable -> L7d
        L7d:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r1, r7)
            throw r0
        L82:
            J1.t r1 = r0.r(r7)
            boolean r2 = r1.f3379c
            if (r2 == 0) goto L93
            r6.s(r7)
        L8d:
            r0.o(r7)
            r6.f3380c = r3
            return
        L93:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r2 = 2955(0xb8b, float:4.141E-42)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            r0.<init>(r2)
            java.lang.String r1 = r1.f3378b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        Lae:
            throw r7     // Catch: java.lang.Throwable -> Laf
        Laf:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r7)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.u.o(P1.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x008d A[EDGE_INSN: B:61:0x008d->B:44:0x008d BREAK  A[LOOP:1: B:23:0x0025->B:45:?], SYNTHETIC] */
    @Override // J1.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(P1.c r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.u.q(P1.c, int, int):void");
    }

    public final void s(P1.c cVar) {
        cVar.k(StubApp.getString2(2964));
        String hash = this.f3382e;
        Intrinsics.checkNotNullParameter(hash, "hash");
        cVar.k(StubApp.getString2(2965) + hash + StubApp.getString2(2142));
    }
}
