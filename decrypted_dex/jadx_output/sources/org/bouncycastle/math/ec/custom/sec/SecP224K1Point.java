package org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat224;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecP224K1Point extends ECPoint.AbstractFp {
    public SecP224K1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint add(ECPoint eCPoint) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return this;
        }
        if (this == eCPoint) {
            return twice();
        }
        ECCurve curve = getCurve();
        SecP224K1FieldElement secP224K1FieldElement = (SecP224K1FieldElement) this.f19191x;
        SecP224K1FieldElement secP224K1FieldElement2 = (SecP224K1FieldElement) this.f19192y;
        SecP224K1FieldElement secP224K1FieldElement3 = (SecP224K1FieldElement) eCPoint.getXCoord();
        SecP224K1FieldElement secP224K1FieldElement4 = (SecP224K1FieldElement) eCPoint.getYCoord();
        SecP224K1FieldElement secP224K1FieldElement5 = (SecP224K1FieldElement) this.zs[0];
        SecP224K1FieldElement secP224K1FieldElement6 = (SecP224K1FieldElement) eCPoint.getZCoord(0);
        int[] createExt = Nat224.createExt();
        int[] create = Nat224.create();
        int[] create2 = Nat224.create();
        int[] create3 = Nat224.create();
        boolean isOne = secP224K1FieldElement5.isOne();
        if (isOne) {
            iArr = secP224K1FieldElement3.f19238x;
            iArr2 = secP224K1FieldElement4.f19238x;
        } else {
            SecP224K1Field.square(secP224K1FieldElement5.f19238x, create2);
            SecP224K1Field.multiply(create2, secP224K1FieldElement3.f19238x, create);
            SecP224K1Field.multiply(create2, secP224K1FieldElement5.f19238x, create2);
            SecP224K1Field.multiply(create2, secP224K1FieldElement4.f19238x, create2);
            iArr = create;
            iArr2 = create2;
        }
        boolean isOne2 = secP224K1FieldElement6.isOne();
        if (isOne2) {
            iArr3 = secP224K1FieldElement.f19238x;
            iArr4 = secP224K1FieldElement2.f19238x;
        } else {
            SecP224K1Field.square(secP224K1FieldElement6.f19238x, create3);
            SecP224K1Field.multiply(create3, secP224K1FieldElement.f19238x, createExt);
            SecP224K1Field.multiply(create3, secP224K1FieldElement6.f19238x, create3);
            SecP224K1Field.multiply(create3, secP224K1FieldElement2.f19238x, create3);
            iArr3 = createExt;
            iArr4 = create3;
        }
        int[] create4 = Nat224.create();
        SecP224K1Field.subtract(iArr3, iArr, create4);
        SecP224K1Field.subtract(iArr4, iArr2, create);
        if (Nat224.isZero(create4)) {
            return Nat224.isZero(create) ? twice() : curve.getInfinity();
        }
        SecP224K1Field.square(create4, create2);
        int[] create5 = Nat224.create();
        SecP224K1Field.multiply(create2, create4, create5);
        SecP224K1Field.multiply(create2, iArr3, create2);
        SecP224K1Field.negate(create5, create5);
        Nat224.mul(iArr4, create5, createExt);
        SecP224K1Field.reduce32(Nat224.addBothTo(create2, create2, create5), create5);
        SecP224K1FieldElement secP224K1FieldElement7 = new SecP224K1FieldElement(create3);
        SecP224K1Field.square(create, secP224K1FieldElement7.f19238x);
        int[] iArr5 = secP224K1FieldElement7.f19238x;
        SecP224K1Field.subtract(iArr5, create5, iArr5);
        SecP224K1FieldElement secP224K1FieldElement8 = new SecP224K1FieldElement(create5);
        SecP224K1Field.subtract(create2, secP224K1FieldElement7.f19238x, secP224K1FieldElement8.f19238x);
        SecP224K1Field.multiplyAddToExt(secP224K1FieldElement8.f19238x, create, createExt);
        SecP224K1Field.reduce(createExt, secP224K1FieldElement8.f19238x);
        SecP224K1FieldElement secP224K1FieldElement9 = new SecP224K1FieldElement(create4);
        if (!isOne) {
            int[] iArr6 = secP224K1FieldElement9.f19238x;
            SecP224K1Field.multiply(iArr6, secP224K1FieldElement5.f19238x, iArr6);
        }
        if (!isOne2) {
            int[] iArr7 = secP224K1FieldElement9.f19238x;
            SecP224K1Field.multiply(iArr7, secP224K1FieldElement6.f19238x, iArr7);
        }
        return new SecP224K1Point(curve, secP224K1FieldElement7, secP224K1FieldElement8, new ECFieldElement[]{secP224K1FieldElement9});
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint detach() {
        return new SecP224K1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new SecP224K1Point(this.curve, this.f19191x, this.f19192y.negate(), this.zs);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint threeTimes() {
        return (isInfinity() || this.f19192y.isZero()) ? this : twice().add(this);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint twice() {
        if (isInfinity()) {
            return this;
        }
        ECCurve curve = getCurve();
        SecP224K1FieldElement secP224K1FieldElement = (SecP224K1FieldElement) this.f19192y;
        if (secP224K1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SecP224K1FieldElement secP224K1FieldElement2 = (SecP224K1FieldElement) this.f19191x;
        SecP224K1FieldElement secP224K1FieldElement3 = (SecP224K1FieldElement) this.zs[0];
        int[] create = Nat224.create();
        SecP224K1Field.square(secP224K1FieldElement.f19238x, create);
        int[] create2 = Nat224.create();
        SecP224K1Field.square(create, create2);
        int[] create3 = Nat224.create();
        SecP224K1Field.square(secP224K1FieldElement2.f19238x, create3);
        SecP224K1Field.reduce32(Nat224.addBothTo(create3, create3, create3), create3);
        SecP224K1Field.multiply(create, secP224K1FieldElement2.f19238x, create);
        SecP224K1Field.reduce32(Nat.shiftUpBits(7, create, 2, 0), create);
        int[] create4 = Nat224.create();
        SecP224K1Field.reduce32(Nat.shiftUpBits(7, create2, 3, 0, create4), create4);
        SecP224K1FieldElement secP224K1FieldElement4 = new SecP224K1FieldElement(create2);
        SecP224K1Field.square(create3, secP224K1FieldElement4.f19238x);
        int[] iArr = secP224K1FieldElement4.f19238x;
        SecP224K1Field.subtract(iArr, create, iArr);
        int[] iArr2 = secP224K1FieldElement4.f19238x;
        SecP224K1Field.subtract(iArr2, create, iArr2);
        SecP224K1FieldElement secP224K1FieldElement5 = new SecP224K1FieldElement(create);
        SecP224K1Field.subtract(create, secP224K1FieldElement4.f19238x, secP224K1FieldElement5.f19238x);
        int[] iArr3 = secP224K1FieldElement5.f19238x;
        SecP224K1Field.multiply(iArr3, create3, iArr3);
        int[] iArr4 = secP224K1FieldElement5.f19238x;
        SecP224K1Field.subtract(iArr4, create4, iArr4);
        SecP224K1FieldElement secP224K1FieldElement6 = new SecP224K1FieldElement(create3);
        SecP224K1Field.twice(secP224K1FieldElement.f19238x, secP224K1FieldElement6.f19238x);
        if (!secP224K1FieldElement3.isOne()) {
            int[] iArr5 = secP224K1FieldElement6.f19238x;
            SecP224K1Field.multiply(iArr5, secP224K1FieldElement3.f19238x, iArr5);
        }
        return new SecP224K1Point(curve, secP224K1FieldElement4, secP224K1FieldElement5, new ECFieldElement[]{secP224K1FieldElement6});
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint twicePlus(ECPoint eCPoint) {
        return this == eCPoint ? threeTimes() : isInfinity() ? eCPoint : eCPoint.isInfinity() ? twice() : this.f19192y.isZero() ? eCPoint : twice().add(eCPoint);
    }

    public SecP224K1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
