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
import org.bouncycastle.math.raw.Nat128;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecP128R1Curve extends ECCurve.AbstractFp {
    private static final int SECP128R1_DEFAULT_COORDS = 2;
    protected SecP128R1Point infinity;

    /* renamed from: q, reason: collision with root package name */
    public static final BigInteger f19206q = SecP128R1FieldElement.f19209Q;
    private static final ECFieldElement[] SECP128R1_AFFINE_ZS = {new SecP128R1FieldElement(ECConstants.ONE)};

    public SecP128R1Curve() {
        super(f19206q);
        this.infinity = new SecP128R1Point(this, null, null);
        this.f19179a = fromBigInteger(new BigInteger(1, Hex.decodeStrict(StubApp.getString2(27297))));
        this.f19180b = fromBigInteger(new BigInteger(1, Hex.decodeStrict(StubApp.getString2(27298))));
        this.order = new BigInteger(1, Hex.decodeStrict(StubApp.getString2(27299)));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecP128R1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i3, final int i10) {
        final int[] iArr = new int[i10 * 8];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            ECPoint eCPoint = eCPointArr[i3 + i12];
            Nat128.copy(((SecP128R1FieldElement) eCPoint.getRawXCoord()).f19210x, 0, iArr, i11);
            Nat128.copy(((SecP128R1FieldElement) eCPoint.getRawYCoord()).f19210x, 0, iArr, i11 + 4);
            i11 += 8;
        }
        return new AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.custom.sec.SecP128R1Curve.1
            private ECPoint createPoint(int[] iArr2, int[] iArr3) {
                return SecP128R1Curve.this.createRawPoint(new SecP128R1FieldElement(iArr2), new SecP128R1FieldElement(iArr3), SecP128R1Curve.SECP128R1_AFFINE_ZS);
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i10;
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookup(int i13) {
                int[] create = Nat128.create();
                int[] create2 = Nat128.create();
                int i14 = 0;
                for (int i15 = 0; i15 < i10; i15++) {
                    int i16 = ((i15 ^ i13) - 1) >> 31;
                    for (int i17 = 0; i17 < 4; i17++) {
                        int i18 = create[i17];
                        int[] iArr2 = iArr;
                        create[i17] = i18 ^ (iArr2[i14 + i17] & i16);
                        create2[i17] = create2[i17] ^ (iArr2[(i14 + 4) + i17] & i16);
                    }
                    i14 += 8;
                }
                return createPoint(create, create2);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookupVar(int i13) {
                int[] create = Nat128.create();
                int[] create2 = Nat128.create();
                int i14 = i13 * 8;
                for (int i15 = 0; i15 < 4; i15++) {
                    int[] iArr2 = iArr;
                    create[i15] = iArr2[i14 + i15];
                    create2[i15] = iArr2[4 + i14 + i15];
                }
                return createPoint(create, create2);
            }
        };
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecP128R1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP128R1FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return f19206q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f19206q;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.ec.ECCurve
    public ECFieldElement randomFieldElement(SecureRandom secureRandom) {
        int[] create = Nat128.create();
        SecP128R1Field.random(secureRandom, create);
        return new SecP128R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.ec.ECCurve
    public ECFieldElement randomFieldElementMult(SecureRandom secureRandom) {
        int[] create = Nat128.create();
        SecP128R1Field.randomMult(secureRandom, create);
        return new SecP128R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i3) {
        return i3 == 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecP128R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
