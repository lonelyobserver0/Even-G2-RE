package Lc;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public long f4404a;

    /* renamed from: b, reason: collision with root package name */
    public long f4405b;

    public e(long j, long j3) {
        this.f4404a = j;
        this.f4405b = j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(long r7, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof Y8.a
            if (r0 == 0) goto L13
            r0 = r9
            Y8.a r0 = (Y8.a) r0
            int r1 = r0.f8835f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8835f = r1
            goto L18
        L13:
            Y8.a r0 = new Y8.a
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f8833d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f8835f
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L35
            long r7 = r0.f8832c
            long r1 = r0.f8831b
            Lc.e r0 = r0.f8830a
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L31
            r4 = r7
            r7 = r1
            goto L59
        L31:
            r9 = move-exception
            r4 = r7
            r7 = r1
            goto L69
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r8 = 275(0x113, float:3.85E-43)
            java.lang.String r8 = com.stub.StubApp.getString2(r8)
            r7.<init>(r8)
            throw r7
        L42:
            kotlin.ResultKt.throwOnFailure(r9)
            long r4 = android.os.SystemClock.elapsedRealtime()
            r0.f8830a = r6     // Catch: java.lang.Throwable -> L67
            r0.f8831b = r7     // Catch: java.lang.Throwable -> L67
            r0.f8832c = r4     // Catch: java.lang.Throwable -> L67
            r0.f8835f = r3     // Catch: java.lang.Throwable -> L67
            java.lang.Object r9 = Qb.S.a(r7, r0)     // Catch: java.lang.Throwable -> L67
            if (r9 != r1) goto L58
            return r1
        L58:
            r0 = r6
        L59:
            r0.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 - r4
            long r7 = r7 - r1
            r0.f4405b = r7
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L67:
            r9 = move-exception
            r0 = r6
        L69:
            r0.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 - r4
            long r7 = r7 - r1
            r0.f4405b = r7
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Lc.e.a(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public e() {
        this.f4404a = -9223372036854775807L;
        this.f4405b = -9223372036854775807L;
    }

    public e(long j, int i3, long j3) {
        this.f4404a = j;
        this.f4405b = j3;
    }
}
