package org.bouncycastle.math.ec;

import com.stub.StubApp;
import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class WNafUtil {
    private static final int MAX_WIDTH = 16;
    public static final String PRECOMP_NAME = StubApp.getString2(32937);
    private static final int[] DEFAULT_WINDOW_SIZE_CUTOFFS = {13, 41, 121, 337, 897, 2305};
    private static final byte[] EMPTY_BYTES = new byte[0];
    private static final int[] EMPTY_INTS = new int[0];
    private static final ECPoint[] EMPTY_POINTS = new ECPoint[0];

    public static void configureBasepoint(ECPoint eCPoint) {
        ECCurve curve = eCPoint.getCurve();
        if (curve == null) {
            return;
        }
        BigInteger order = curve.getOrder();
        final int min = Math.min(16, getWindowSize(order == null ? curve.getFieldSize() + 1 : order.bitLength()) + 3);
        curve.precompute(eCPoint, StubApp.getString2(32937), new PreCompCallback() { // from class: org.bouncycastle.math.ec.WNafUtil.1
            @Override // org.bouncycastle.math.ec.PreCompCallback
            public PreCompInfo precompute(PreCompInfo preCompInfo) {
                WNafPreCompInfo wNafPreCompInfo = preCompInfo instanceof WNafPreCompInfo ? (WNafPreCompInfo) preCompInfo : null;
                if (wNafPreCompInfo != null && wNafPreCompInfo.getConfWidth() == min) {
                    wNafPreCompInfo.setPromotionCountdown(0);
                    return wNafPreCompInfo;
                }
                WNafPreCompInfo wNafPreCompInfo2 = new WNafPreCompInfo();
                wNafPreCompInfo2.setPromotionCountdown(0);
                wNafPreCompInfo2.setConfWidth(min);
                if (wNafPreCompInfo != null) {
                    wNafPreCompInfo2.setPreComp(wNafPreCompInfo.getPreComp());
                    wNafPreCompInfo2.setPreCompNeg(wNafPreCompInfo.getPreCompNeg());
                    wNafPreCompInfo2.setTwice(wNafPreCompInfo.getTwice());
                    wNafPreCompInfo2.setWidth(wNafPreCompInfo.getWidth());
                }
                return wNafPreCompInfo2;
            }
        });
    }

    public static int[] generateCompactNaf(BigInteger bigInteger) {
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException(StubApp.getString2(32938));
        }
        if (bigInteger.signum() == 0) {
            return EMPTY_INTS;
        }
        BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
        int bitLength = add.bitLength();
        int i3 = bitLength >> 1;
        int[] iArr = new int[i3];
        BigInteger xor = add.xor(bigInteger);
        int i10 = bitLength - 1;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i12 < i10) {
            if (xor.testBit(i12)) {
                iArr[i11] = i13 | ((bigInteger.testBit(i12) ? -1 : 1) << 16);
                i12++;
                i13 = 1;
                i11++;
            } else {
                i13++;
            }
            i12++;
        }
        int i14 = i11 + 1;
        iArr[i11] = 65536 | i13;
        return i3 > i14 ? trim(iArr, i14) : iArr;
    }

    public static int[] generateCompactWindowNaf(int i3, BigInteger bigInteger) {
        if (i3 == 2) {
            return generateCompactNaf(bigInteger);
        }
        if (i3 < 2 || i3 > 16) {
            throw new IllegalArgumentException(StubApp.getString2(32939));
        }
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException(StubApp.getString2(32938));
        }
        if (bigInteger.signum() == 0) {
            return EMPTY_INTS;
        }
        int bitLength = (bigInteger.bitLength() / i3) + 1;
        int[] iArr = new int[bitLength];
        int i10 = 1 << i3;
        int i11 = i10 - 1;
        int i12 = i10 >>> 1;
        int i13 = 0;
        int i14 = 0;
        boolean z2 = false;
        while (i13 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i13) == z2) {
                i13++;
            } else {
                bigInteger = bigInteger.shiftRight(i13);
                int intValue = bigInteger.intValue() & i11;
                if (z2) {
                    intValue++;
                }
                z2 = (intValue & i12) != 0;
                if (z2) {
                    intValue -= i10;
                }
                if (i14 > 0) {
                    i13--;
                }
                iArr[i14] = i13 | (intValue << 16);
                i13 = i3;
                i14++;
            }
        }
        return bitLength > i14 ? trim(iArr, i14) : iArr;
    }

    public static byte[] generateJSF(BigInteger bigInteger, BigInteger bigInteger2) {
        int max = Math.max(bigInteger.bitLength(), bigInteger2.bitLength()) + 1;
        byte[] bArr = new byte[max];
        BigInteger bigInteger3 = bigInteger;
        BigInteger bigInteger4 = bigInteger2;
        int i3 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if ((i3 | i10) == 0 && bigInteger3.bitLength() <= i11 && bigInteger4.bitLength() <= i11) {
                break;
            }
            int intValue = (bigInteger3.intValue() >>> i11) + i3;
            int i13 = intValue & 7;
            int intValue2 = (bigInteger4.intValue() >>> i11) + i10;
            int i14 = intValue2 & 7;
            int i15 = intValue & 1;
            if (i15 != 0) {
                i15 -= intValue & 2;
                if (i13 + i15 == 4 && (intValue2 & 3) == 2) {
                    i15 = -i15;
                }
            }
            int i16 = intValue2 & 1;
            if (i16 != 0) {
                i16 -= intValue2 & 2;
                if (i14 + i16 == 4 && (intValue & 3) == 2) {
                    i16 = -i16;
                }
            }
            if ((i3 << 1) == i15 + 1) {
                i3 ^= 1;
            }
            if ((i10 << 1) == i16 + 1) {
                i10 ^= 1;
            }
            i11++;
            if (i11 == 30) {
                bigInteger3 = bigInteger3.shiftRight(30);
                bigInteger4 = bigInteger4.shiftRight(30);
                i11 = 0;
            }
            bArr[i12] = (byte) ((i16 & 15) | (i15 << 4));
            i12++;
        }
        return max > i12 ? trim(bArr, i12) : bArr;
    }

    public static byte[] generateNaf(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return EMPTY_BYTES;
        }
        BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
        int bitLength = add.bitLength();
        int i3 = bitLength - 1;
        byte[] bArr = new byte[i3];
        BigInteger xor = add.xor(bigInteger);
        int i10 = 1;
        while (i10 < i3) {
            if (xor.testBit(i10)) {
                bArr[i10 - 1] = (byte) (bigInteger.testBit(i10) ? -1 : 1);
                i10++;
            }
            i10++;
        }
        bArr[bitLength - 2] = 1;
        return bArr;
    }

    public static byte[] generateWindowNaf(int i3, BigInteger bigInteger) {
        if (i3 == 2) {
            return generateNaf(bigInteger);
        }
        if (i3 < 2 || i3 > 8) {
            throw new IllegalArgumentException(StubApp.getString2(32940));
        }
        if (bigInteger.signum() == 0) {
            return EMPTY_BYTES;
        }
        int bitLength = bigInteger.bitLength() + 1;
        byte[] bArr = new byte[bitLength];
        int i10 = 1 << i3;
        int i11 = i10 - 1;
        int i12 = i10 >>> 1;
        int i13 = 0;
        int i14 = 0;
        boolean z2 = false;
        while (i13 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i13) == z2) {
                i13++;
            } else {
                bigInteger = bigInteger.shiftRight(i13);
                int intValue = bigInteger.intValue() & i11;
                if (z2) {
                    intValue++;
                }
                z2 = (intValue & i12) != 0;
                if (z2) {
                    intValue -= i10;
                }
                if (i14 > 0) {
                    i13--;
                }
                int i15 = i14 + i13;
                bArr[i15] = (byte) intValue;
                i14 = i15 + 1;
                i13 = i3;
            }
        }
        return bitLength > i14 ? trim(bArr, i14) : bArr;
    }

    public static int getNafWeight(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return 0;
        }
        return bigInteger.shiftLeft(1).add(bigInteger).xor(bigInteger).bitCount();
    }

    public static WNafPreCompInfo getWNafPreCompInfo(ECPoint eCPoint) {
        return getWNafPreCompInfo(eCPoint.getCurve().getPreCompInfo(eCPoint, StubApp.getString2(32937)));
    }

    public static int getWindowSize(int i3) {
        return getWindowSize(i3, DEFAULT_WINDOW_SIZE_CUTOFFS, 16);
    }

    public static WNafPreCompInfo precompute(final ECPoint eCPoint, final int i3, final boolean z2) {
        final ECCurve curve = eCPoint.getCurve();
        return (WNafPreCompInfo) curve.precompute(eCPoint, StubApp.getString2(32937), new PreCompCallback() { // from class: org.bouncycastle.math.ec.WNafUtil.2
            private boolean checkExisting(WNafPreCompInfo wNafPreCompInfo, int i10, int i11, boolean z10) {
                if (wNafPreCompInfo == null || wNafPreCompInfo.getWidth() < Math.max(wNafPreCompInfo.getConfWidth(), i10) || !checkTable(wNafPreCompInfo.getPreComp(), i11)) {
                    return false;
                }
                return !z10 || checkTable(wNafPreCompInfo.getPreCompNeg(), i11);
            }

            private boolean checkTable(ECPoint[] eCPointArr, int i10) {
                return eCPointArr != null && eCPointArr.length >= i10;
            }

            /* JADX WARN: Removed duplicated region for block: B:43:0x00f2 A[LOOP:0: B:42:0x00f0->B:43:0x00f2, LOOP_END] */
            @Override // org.bouncycastle.math.ec.PreCompCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public org.bouncycastle.math.ec.PreCompInfo precompute(org.bouncycastle.math.ec.PreCompInfo r14) {
                /*
                    Method dump skipped, instructions count: 301
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.math.ec.WNafUtil.AnonymousClass2.precompute(org.bouncycastle.math.ec.PreCompInfo):org.bouncycastle.math.ec.PreCompInfo");
            }
        });
    }

    public static WNafPreCompInfo precomputeWithPointMap(ECPoint eCPoint, final ECPointMap eCPointMap, final WNafPreCompInfo wNafPreCompInfo, final boolean z2) {
        return (WNafPreCompInfo) eCPoint.getCurve().precompute(eCPoint, StubApp.getString2(32937), new PreCompCallback() { // from class: org.bouncycastle.math.ec.WNafUtil.3
            private boolean checkExisting(WNafPreCompInfo wNafPreCompInfo2, int i3, int i10, boolean z10) {
                if (wNafPreCompInfo2 == null || wNafPreCompInfo2.getWidth() < i3 || !checkTable(wNafPreCompInfo2.getPreComp(), i10)) {
                    return false;
                }
                return !z10 || checkTable(wNafPreCompInfo2.getPreCompNeg(), i10);
            }

            private boolean checkTable(ECPoint[] eCPointArr, int i3) {
                return eCPointArr != null && eCPointArr.length >= i3;
            }

            @Override // org.bouncycastle.math.ec.PreCompCallback
            public PreCompInfo precompute(PreCompInfo preCompInfo) {
                WNafPreCompInfo wNafPreCompInfo2 = preCompInfo instanceof WNafPreCompInfo ? (WNafPreCompInfo) preCompInfo : null;
                int width = WNafPreCompInfo.this.getWidth();
                if (checkExisting(wNafPreCompInfo2, width, WNafPreCompInfo.this.getPreComp().length, z2)) {
                    wNafPreCompInfo2.decrementPromotionCountdown();
                    return wNafPreCompInfo2;
                }
                WNafPreCompInfo wNafPreCompInfo3 = new WNafPreCompInfo();
                wNafPreCompInfo3.setPromotionCountdown(WNafPreCompInfo.this.getPromotionCountdown());
                ECPoint twice = WNafPreCompInfo.this.getTwice();
                if (twice != null) {
                    wNafPreCompInfo3.setTwice(eCPointMap.map(twice));
                }
                ECPoint[] preComp = WNafPreCompInfo.this.getPreComp();
                int length = preComp.length;
                ECPoint[] eCPointArr = new ECPoint[length];
                for (int i3 = 0; i3 < preComp.length; i3++) {
                    eCPointArr[i3] = eCPointMap.map(preComp[i3]);
                }
                wNafPreCompInfo3.setPreComp(eCPointArr);
                wNafPreCompInfo3.setWidth(width);
                if (z2) {
                    ECPoint[] eCPointArr2 = new ECPoint[length];
                    for (int i10 = 0; i10 < length; i10++) {
                        eCPointArr2[i10] = eCPointArr[i10].negate();
                    }
                    wNafPreCompInfo3.setPreCompNeg(eCPointArr2);
                }
                return wNafPreCompInfo3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ECPoint[] resizeTable(ECPoint[] eCPointArr, int i3) {
        ECPoint[] eCPointArr2 = new ECPoint[i3];
        System.arraycopy(eCPointArr, 0, eCPointArr2, 0, eCPointArr.length);
        return eCPointArr2;
    }

    private static byte[] trim(byte[] bArr, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, 0, bArr2, 0, i3);
        return bArr2;
    }

    public static WNafPreCompInfo getWNafPreCompInfo(PreCompInfo preCompInfo) {
        if (preCompInfo instanceof WNafPreCompInfo) {
            return (WNafPreCompInfo) preCompInfo;
        }
        return null;
    }

    public static int getWindowSize(int i3, int i10) {
        return getWindowSize(i3, DEFAULT_WINDOW_SIZE_CUTOFFS, i10);
    }

    private static int[] trim(int[] iArr, int i3) {
        int[] iArr2 = new int[i3];
        System.arraycopy(iArr, 0, iArr2, 0, i3);
        return iArr2;
    }

    public static int getWindowSize(int i3, int[] iArr) {
        return getWindowSize(i3, iArr, 16);
    }

    public static int getWindowSize(int i3, int[] iArr, int i10) {
        int i11 = 0;
        while (i11 < iArr.length && i3 >= iArr[i11]) {
            i11++;
        }
        return Math.max(2, Math.min(i10, i11 + 2));
    }
}
