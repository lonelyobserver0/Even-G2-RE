package L5;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final o f4234a;

    /* renamed from: b, reason: collision with root package name */
    public final o f4235b;

    public j(o localOverrideSettings, o remoteSettings) {
        Intrinsics.checkNotNullParameter(localOverrideSettings, "localOverrideSettings");
        Intrinsics.checkNotNullParameter(remoteSettings, "remoteSettings");
        this.f4234a = localOverrideSettings;
        this.f4235b = remoteSettings;
    }

    public final double a() {
        Double c10 = this.f4234a.c();
        if (c10 != null) {
            double doubleValue = c10.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        Double c11 = this.f4235b.c();
        if (c11 != null) {
            double doubleValue2 = c11.doubleValue();
            if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                return doubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (r6.d(r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof L5.i
            if (r0 == 0) goto L13
            r0 = r6
            L5.i r0 = (L5.i) r0
            int r1 = r0.f4233d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4233d = r1
            goto L18
        L13:
            L5.i r0 = new L5.i
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f4231b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f4233d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L39
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r6)
            goto L5e
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r6.<init>(r0)
            throw r6
        L39:
            L5.j r2 = r0.f4230a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L50
        L3f:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.f4230a = r5
            r0.f4233d = r4
            L5.o r6 = r5.f4234a
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L4f
            goto L5d
        L4f:
            r2 = r5
        L50:
            L5.o r6 = r2.f4235b
            r2 = 0
            r0.f4230a = r2
            r0.f4233d = r3
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L5e
        L5d:
            return r1
        L5e:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: L5.j.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
