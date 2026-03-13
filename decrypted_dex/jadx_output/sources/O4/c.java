package O4;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5206a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d8) {
        if (hc.b.O(d8)) {
            return d8 == 0.0d || 52 - Long.numberOfTrailingZeros(hc.b.H(d8)) <= Math.getExponent(d8);
        }
        return false;
    }

    public static boolean b(double d8) {
        if (d8 > 0.0d && hc.b.O(d8)) {
            long H2 = hc.b.H(d8);
            if ((H2 & (H2 - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(double r6) {
        /*
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            r1 = 0
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L12
            boolean r1 = hc.b.O(r6)
            if (r1 == 0) goto L12
            r1 = r3
            goto L13
        L12:
            r1 = r2
        L13:
            r4 = 4400(0x1130, float:6.166E-42)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            hc.b.h(r4, r1)
            int r1 = java.lang.Math.getExponent(r6)
            int r4 = java.lang.Math.getExponent(r6)
            r5 = -1022(0xfffffffffffffc02, float:NaN)
            if (r4 < r5) goto L84
            int[] r4 = O4.b.f5205a
            int r0 = r0.ordinal()
            r0 = r4[r0]
            switch(r0) {
                case 1: goto L6d;
                case 2: goto L73;
                case 3: goto L66;
                case 4: goto L5e;
                case 5: goto L54;
                case 6: goto L3a;
                case 7: goto L3a;
                case 8: goto L3a;
                default: goto L34;
            }
        L34:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L3a:
            long r6 = java.lang.Double.doubleToRawLongBits(r6)
            r4 = 4503599627370495(0xfffffffffffff, double:2.225073858507201E-308)
            long r6 = r6 & r4
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r6 = r6 | r4
            double r6 = java.lang.Double.longBitsToDouble(r6)
            double r6 = r6 * r6
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 <= 0) goto L73
            r2 = r3
            goto L73
        L54:
            if (r1 < 0) goto L57
            r2 = r3
        L57:
            boolean r6 = b(r6)
        L5b:
            r6 = r6 ^ r3
            r2 = r2 & r6
            goto L73
        L5e:
            if (r1 >= 0) goto L61
            r2 = r3
        L61:
            boolean r6 = b(r6)
            goto L5b
        L66:
            boolean r6 = b(r6)
            r2 = r6 ^ 1
            goto L73
        L6d:
            boolean r6 = b(r6)
            if (r6 == 0) goto L77
        L73:
            if (r2 == 0) goto L76
            int r1 = r1 + r3
        L76:
            return r1
        L77:
            java.lang.ArithmeticException r6 = new java.lang.ArithmeticException
            r7 = 4401(0x1131, float:6.167E-42)
            java.lang.String r7 = com.stub.StubApp.getString2(r7)
            r6.<init>(r7)
            throw r6
        L84:
            r0 = 4841369599423283200(0x4330000000000000, double:4.503599627370496E15)
            double r6 = r6 * r0
            int r6 = c(r6)
            int r6 = r6 + (-52)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.c.c(double):int");
    }
}
