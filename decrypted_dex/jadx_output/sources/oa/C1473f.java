package oa;

import com.stub.StubApp;
import java.math.BigDecimal;
import p0.AbstractC1482f;

/* renamed from: oa.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1473f extends l {

    /* renamed from: a, reason: collision with root package name */
    public BigDecimal f18406a;

    /* renamed from: b, reason: collision with root package name */
    public String f18407b;

    public C1473f(float f10) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(f10));
        this.f18406a = bigDecimal;
        this.f18407b = I(bigDecimal.toPlainString());
    }

    public static String I(String str) {
        if (str.indexOf(46) > -1) {
            String string2 = StubApp.getString2(3984);
            if (!str.endsWith(string2)) {
                while (str.endsWith(StubApp.getString2(824)) && !str.endsWith(string2)) {
                    str = str.substring(0, str.length() - 1);
                }
            }
        }
        return str;
    }

    @Override // oa.l
    public final int F() {
        return this.f18406a.intValue();
    }

    @Override // oa.l
    public final long G() {
        return this.f18406a.longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (java.lang.Math.abs(r1) < 1.1754943508222875E-38d) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H() {
        /*
            r8 = this;
            java.math.BigDecimal r0 = r8.f18406a
            float r0 = r0.floatValue()
            java.math.BigDecimal r1 = r8.f18406a
            double r1 = r1.doubleValue()
            r3 = -8388608(0xffffffffff800000, float:-Infinity)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r4 = 2139095040(0x7f800000, float:Infinity)
            r5 = 1
            if (r3 == 0) goto L30
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 != 0) goto L1a
            goto L30
        L1a:
            r3 = 0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L4a
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L4a
            double r1 = java.lang.Math.abs(r1)
            r3 = 4039728865751334912(0x3810000000000000, double:1.1754943508222875E-38)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L4a
            goto L4b
        L30:
            double r1 = java.lang.Math.abs(r1)
            r6 = 5183643170566569984(0x47efffffe0000000, double:3.4028234663852886E38)
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 <= 0) goto L4a
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L43
            r0 = r5
            goto L44
        L43:
            r0 = -1
        L44:
            float r0 = (float) r0
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float r0 = r0 * r1
            goto L4b
        L4a:
            r5 = 0
        L4b:
            if (r5 == 0) goto L5e
            double r0 = (double) r0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            r8.f18406a = r0
            java.lang.String r0 = r0.toPlainString()
            java.lang.String r0 = I(r0)
            r8.f18407b = r0
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.C1473f.H():void");
    }

    @Override // oa.l
    public final float a() {
        return this.f18406a.floatValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1473f) && Float.floatToIntBits(((C1473f) obj).f18406a.floatValue()) == Float.floatToIntBits(this.f18406a.floatValue());
    }

    public final int hashCode() {
        return this.f18406a.hashCode();
    }

    public final String toString() {
        return AbstractC1482f.k(new StringBuilder(StubApp.getString2(21630)), this.f18407b, StubApp.getString2(265));
    }
}
