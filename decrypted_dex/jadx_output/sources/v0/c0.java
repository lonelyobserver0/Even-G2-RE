package v0;

import kotlin.jvm.internal.LongCompanionObject;
import r0.AbstractC1550k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f21705c;

    /* renamed from: a, reason: collision with root package name */
    public final long f21706a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21707b;

    static {
        c0 c0Var = new c0(0L, 0L);
        new c0(LongCompanionObject.MAX_VALUE, LongCompanionObject.MAX_VALUE);
        new c0(LongCompanionObject.MAX_VALUE, 0L);
        new c0(0L, LongCompanionObject.MAX_VALUE);
        f21705c = c0Var;
    }

    public c0(long j, long j3) {
        AbstractC1550k.c(j >= 0);
        AbstractC1550k.c(j3 >= 0);
        this.f21706a = j;
        this.f21707b = j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(long r12, long r14, long r16) {
        /*
            r11 = this;
            long r0 = r11.f21706a
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            long r5 = r11.f21707b
            if (r4 != 0) goto Lf
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 != 0) goto Lf
            return r12
        Lf:
            int r4 = r0.AbstractC1560u.f20190a
            long r7 = r12 - r0
            long r0 = r0 ^ r12
            long r9 = r12 ^ r7
            long r0 = r0 & r9
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L1d
            r7 = -9223372036854775808
        L1d:
            long r0 = r12 + r5
            long r9 = r12 ^ r0
            long r4 = r5 ^ r0
            long r4 = r4 & r9
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L2d
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L2d:
            int r2 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L39
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 > 0) goto L39
            r2 = r4
            goto L3a
        L39:
            r2 = r3
        L3a:
            int r5 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r5 > 0) goto L43
            int r0 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r0 > 0) goto L43
            r3 = r4
        L43:
            if (r2 == 0) goto L58
            if (r3 == 0) goto L58
            long r0 = r14 - r12
            long r0 = java.lang.Math.abs(r0)
            long r12 = r16 - r12
            long r12 = java.lang.Math.abs(r12)
            int r12 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r12 > 0) goto L5d
            goto L5a
        L58:
            if (r2 == 0) goto L5b
        L5a:
            return r14
        L5b:
            if (r3 == 0) goto L5e
        L5d:
            return r16
        L5e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.c0.a(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (this.f21706a == c0Var.f21706a && this.f21707b == c0Var.f21707b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f21706a) * 31) + ((int) this.f21707b);
    }
}
