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
import org.bouncycastle.math.raw.Nat224;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecP224R1Curve extends ECCurve.AbstractFp {
    private static final int SECP224R1_DEFAULT_COORDS = 2;
    protected SecP224R1Point infinity;

    /* renamed from: q, reason: collision with root package name */
    public static final BigInteger f19239q = SecP224R1FieldElement.f19243Q;
    private static final ECFieldElement[] SECP224R1_AFFINE_ZS = {new SecP224R1FieldElement(ECConstants.ONE)};

    public SecP224R1Curve() {
        super(f19239q);
        this.infinity = new SecP224R1Point(this, null, null);
        this.f19179a = fromBigInteger(new BigInteger(1, Hex.decodeStrict(StubApp.getString2(27185))));
        this.f19180b = fromBigInteger(new BigInteger(1, Hex.decodeStrict(StubApp.getString2(27186))));
        this.order = new BigInteger(1, Hex.decodeStrict(StubApp.getString2(27187)));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecP224R1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i3, final int i10) {
        final int[] iArr = new int[i10 * 14];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            ECPoint eCPoint = eCPointArr[i3 + i12];
            Nat224.copy(((SecP224R1FieldElement) eCPoint.getRawXCoord()).f19244x, 0, iArr, i11);
            Nat224.copy(((SecP224R1FieldElement) eCPoint.getRawYCoord()).f19244x, 0, iArr, i11 + 7);
            i11 += 14;
        }
        return new AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.custom.sec.SecP224R1Curve.1
            private ECPoint createPoint(int[] iArr2, int[] iArr3) {
                return SecP224R1Curve.this.createRawPoint(new SecP224R1FieldElement(iArr2), new SecP224R1FieldElement(iArr3), SecP224R1Curve.SECP224R1_AFFINE_ZS);
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i10;
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookup(int i13) {
                int[] create = Nat224.create();
                int[] create2 = Nat224.create();
                int i14 = 0;
                for (int i15 = 0; i15 < i10; i15++) {
                    int i16 = ((i15 ^ i13) - 1) >> 31;
                    for (int i17 = 0; i17 < 7; i17++) {
                        int i18 = create[i17];
                        int[] iArr2 = iArr;
                        create[i17] = i18 ^ (iArr2[i14 + i17] & i16);
                        create2[i17] = create2[i17] ^ (iArr2[(i14 + 7) + i17] & i16);
                    }
                    i14 += 14;
                }
                return createPoint(create, create2);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookupVar(int i13) {
                int[] create = Nat224.create();
                int[] create2 = Nat224.create();
                int i14 = i13 * 14;
                for (int i15 = 0; i15 < 7; i15++) {
                    int[] iArr2 = iArr;
                    create[i15] = iArr2[i14 + i15];
                    create2[i15] = iArr2[7 + i14 + i15];
                }
                return createPoint(create, create2);
            }
        };
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecP224R1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP224R1FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return f19239q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f19239q;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.ec.ECCurve
    public ECFieldElement randomFieldElement(SecureRandom secureRandom) {
        int[] create = Nat224.create();
        SecP224R1Field.random(secureRandom, create);
        return new SecP224R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.ec.ECCurve
    public ECFieldElement randomFieldElementMult(SecureRandom secureRandom) {
        int[] create = Nat224.create();
        SecP224R1Field.randomMult(secureRandom, create);
        return new SecP224R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i3) {
        return i3 == 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecP224R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
