package org.bouncycastle.math.ec.custom.sec;

import com.stub.StubApp;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.ec.AbstractECLookupTable;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat192;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecP192K1Curve extends ECCurve.AbstractFp {
    private static final int SECP192K1_DEFAULT_COORDS = 2;
    protected SecP192K1Point infinity;

    /* renamed from: q, reason: collision with root package name */
    public static final BigInteger f19223q = SecP192K1FieldElement.f19226Q;
    private static final ECFieldElement[] SECP192K1_AFFINE_ZS = {new SecP192K1FieldElement(ECConstants.ONE)};

    public SecP192K1Curve() {
        super(f19223q);
        this.infinity = new SecP192K1Point(this, null, null);
        this.f19179a = fromBigInteger(ECConstants.ZERO);
        this.f19180b = fromBigInteger(BigInteger.valueOf(3L));
        this.order = new BigInteger(1, Hex.decodeStrict(StubApp.getString2(27329)));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecP192K1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i3, final int i10) {
        final int[] iArr = new int[i10 * 12];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            ECPoint eCPoint = eCPointArr[i3 + i12];
            Nat192.copy(((SecP192K1FieldElement) eCPoint.getRawXCoord()).f19227x, 0, iArr, i11);
            Nat192.copy(((SecP192K1FieldElement) eCPoint.getRawYCoord()).f19227x, 0, iArr, i11 + 6);
            i11 += 12;
        }
        return new AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.custom.sec.SecP192K1Curve.1
            private ECPoint createPoint(int[] iArr2, int[] iArr3) {
                return SecP192K1Curve.this.createRawPoint(new SecP192K1FieldElement(iArr2), new SecP192K1FieldElement(iArr3), SecP192K1Curve.SECP192K1_AFFINE_ZS);
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i10;
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookup(int i13) {
                int[] create = Nat192.create();
                int[] create2 = Nat192.create();
                int i14 = 0;
                for (int i15 = 0; i15 < i10; i15++) {
                    int i16 = ((i15 ^ i13) - 1) >> 31;
                    for (int i17 = 0; i17 < 6; i17++) {
                        int i18 = create[i17];
                        int[] iArr2 = iArr;
                        create[i17] = i18 ^ (iArr2[i14 + i17] & i16);
                        create2[i17] = create2[i17] ^ (iArr2[(i14 + 6) + i17] & i16);
                    }
                    i14 += 12;
                }
                return createPoint(create, create2);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookupVar(int i13) {
                int[] create = Nat192.create();
                int[] create2 = Nat192.create();
                int i14 = i13 * 12;
                for (int i15 = 0; i15 < 6; i15++) {
                    int[] iArr2 = iArr;
                    create[i15] = iArr2[i14 + i15];
                    create2[i15] = iArr2[6 + i14 + i15];
                }
                return createPoint(create, create2);
            }
        };
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecP192K1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP192K1FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return f19223q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f19223q;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.ec.ECCurve
    public ECFieldElement randomFieldElement(SecureRandom secureRandom) {
        int[] create = Nat192.create();
        SecP192K1Field.random(secureRandom, create);
        return new SecP192K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.ec.ECCurve
    public ECFieldElement randomFieldElementMult(SecureRandom secureRandom) {
        int[] create = Nat192.create();
        SecP192K1Field.randomMult(secureRandom, create);
        return new SecP192K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i3) {
        return i3 == 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecP192K1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
