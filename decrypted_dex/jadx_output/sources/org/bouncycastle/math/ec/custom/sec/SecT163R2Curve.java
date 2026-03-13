package org.bouncycastle.math.ec.custom.sec;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.math.ec.AbstractECLookupTable;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat192;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecT163R2Curve extends ECCurve.AbstractF2m {
    private static final ECFieldElement[] SECT163R2_AFFINE_ZS = {new SecT163FieldElement(ECConstants.ONE)};
    private static final int SECT163R2_DEFAULT_COORDS = 6;
    protected SecT163R2Point infinity;

    public SecT163R2Curve() {
        super(163, 3, 6, 7);
        this.infinity = new SecT163R2Point(this, null, null);
        this.f19179a = fromBigInteger(BigInteger.valueOf(1L));
        this.f19180b = fromBigInteger(new BigInteger(1, Hex.decodeStrict(StubApp.getString2(27251))));
        this.order = new BigInteger(1, Hex.decodeStrict(StubApp.getString2(27252)));
        this.cofactor = BigInteger.valueOf(2L);
        this.coord = 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecT163R2Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i3, final int i10) {
        final long[] jArr = new long[i10 * 6];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            ECPoint eCPoint = eCPointArr[i3 + i12];
            Nat192.copy64(((SecT163FieldElement) eCPoint.getRawXCoord()).f19267x, 0, jArr, i11);
            Nat192.copy64(((SecT163FieldElement) eCPoint.getRawYCoord()).f19267x, 0, jArr, i11 + 3);
            i11 += 6;
        }
        return new AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.custom.sec.SecT163R2Curve.1
            private ECPoint createPoint(long[] jArr2, long[] jArr3) {
                return SecT163R2Curve.this.createRawPoint(new SecT163FieldElement(jArr2), new SecT163FieldElement(jArr3), SecT163R2Curve.SECT163R2_AFFINE_ZS);
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i10;
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookup(int i13) {
                long[] create64 = Nat192.create64();
                long[] create642 = Nat192.create64();
                int i14 = 0;
                for (int i15 = 0; i15 < i10; i15++) {
                    long j = ((i15 ^ i13) - 1) >> 31;
                    for (int i16 = 0; i16 < 3; i16++) {
                        long j3 = create64[i16];
                        long[] jArr2 = jArr;
                        create64[i16] = j3 ^ (jArr2[i14 + i16] & j);
                        create642[i16] = create642[i16] ^ (jArr2[(i14 + 3) + i16] & j);
                    }
                    i14 += 6;
                }
                return createPoint(create64, create642);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookupVar(int i13) {
                long[] create64 = Nat192.create64();
                long[] create642 = Nat192.create64();
                int i14 = i13 * 6;
                for (int i15 = 0; i15 < 3; i15++) {
                    long[] jArr2 = jArr;
                    create64[i15] = jArr2[i14 + i15];
                    create642[i15] = jArr2[3 + i14 + i15];
                }
                return createPoint(create64, create642);
            }
        };
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecT163R2Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT163FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return 163;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public int getK1() {
        return 3;
    }

    public int getK2() {
        return 6;
    }

    public int getK3() {
        return 7;
    }

    public int getM() {
        return 163;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractF2m
    public boolean isKoblitz() {
        return false;
    }

    public boolean isTrinomial() {
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i3) {
        return i3 == 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecT163R2Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
