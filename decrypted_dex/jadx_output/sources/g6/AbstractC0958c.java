package g6;

import Q2.g;
import com.stub.StubApp;
import java.math.BigInteger;

/* renamed from: g6.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC0958c {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f14228a = StubApp.getString2(17804).toCharArray();

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f14229b = StubApp.getString2(17805).toCharArray();

    /* renamed from: c, reason: collision with root package name */
    public static final BigInteger[] f14230c;

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f14230c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = valueOf;
        int i3 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f14230c;
            if (i3 >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i3] = bigIntegerArr2[i3 - 1].multiply(valueOf);
            i3++;
        }
    }

    public static String a(int i3, int[] iArr) {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i10 = 0; i10 < i3; i10++) {
            bigInteger = bigInteger.add(f14230c[(i3 - i10) - 1].multiply(BigInteger.valueOf(iArr[i10])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw N5.e.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(int[] r16, int[] r17, int r18, Q2.g r19, int r20) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.AbstractC0958c.b(int[], int[], int, Q2.g, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        ((java.lang.StringBuilder) r10.f5711b).append(a(r3, r0));
        r3 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(int[] r8, int r9, Q2.g r10) {
        /*
            r0 = 15
            int[] r0 = new int[r0]
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            r4 = r8[r1]
            if (r9 >= r4) goto L4b
            if (r2 != 0) goto L4b
            int r5 = r9 + 1
            r6 = r8[r9]
            r7 = 1
            if (r5 != r4) goto L15
            r2 = r7
        L15:
            r4 = 900(0x384, float:1.261E-42)
            if (r6 >= r4) goto L1f
            r0[r3] = r6
            int r3 = r3 + 1
        L1d:
            r9 = r5
            goto L32
        L1f:
            if (r6 == r4) goto L31
            r4 = 901(0x385, float:1.263E-42)
            if (r6 == r4) goto L31
            r4 = 927(0x39f, float:1.299E-42)
            if (r6 == r4) goto L31
            r4 = 928(0x3a0, float:1.3E-42)
            if (r6 == r4) goto L31
            switch(r6) {
                case 922: goto L31;
                case 923: goto L31;
                case 924: goto L31;
                default: goto L30;
            }
        L30:
            goto L1d
        L31:
            r2 = r7
        L32:
            int r4 = r3 % 15
            if (r4 == 0) goto L3c
            r4 = 902(0x386, float:1.264E-42)
            if (r6 == r4) goto L3c
            if (r2 == 0) goto L7
        L3c:
            if (r3 <= 0) goto L7
            java.lang.String r3 = a(r3, r0)
            java.lang.Object r4 = r10.f5711b
            java.lang.StringBuilder r4 = (java.lang.StringBuilder) r4
            r4.append(r3)
            r3 = r1
            goto L7
        L4b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.AbstractC0958c.c(int[], int, Q2.g):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0036. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0039. Please report as an issue. */
    public static int d(int[] iArr, int i3, g gVar) {
        int i10 = (iArr[0] - i3) * 2;
        int[] iArr2 = new int[i10];
        int[] iArr3 = new int[i10];
        boolean z2 = false;
        int i11 = 0;
        int i12 = 1;
        while (i3 < iArr[0] && !z2) {
            int i13 = i3 + 1;
            int i14 = iArr[i3];
            if (i14 < 900) {
                iArr2[i11] = i14 / 30;
                iArr2[i11 + 1] = i14 % 30;
                i11 += 2;
            } else if (i14 == 913) {
                iArr2[i11] = 913;
                i3 += 2;
                iArr3[i11] = iArr[i13];
                i11++;
            } else if (i14 != 927) {
                if (i14 != 928) {
                    switch (i14) {
                        case 900:
                            iArr2[i11] = 900;
                            i11++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i14) {
                            }
                    }
                }
                z2 = true;
            } else {
                i12 = b(iArr2, iArr3, i11, gVar, i12);
                i3 += 2;
                gVar.t(iArr[i13]);
                int i15 = iArr[0];
                if (i3 > i15) {
                    throw N5.e.a();
                }
                int i16 = (i15 - i3) * 2;
                iArr2 = new int[i16];
                iArr3 = new int[i16];
                i11 = 0;
            }
            i3 = i13;
        }
        b(iArr2, iArr3, i11, gVar, i12);
        return i3;
    }
}
