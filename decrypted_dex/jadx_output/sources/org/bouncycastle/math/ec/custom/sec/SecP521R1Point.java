package org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecP521R1Point extends ECPoint.AbstractFp {
    public SecP521R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint add(ECPoint eCPoint) {
        char c10;
        int[] iArr;
        int[] iArr2;
        int i3;
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
        SecP521R1FieldElement secP521R1FieldElement = (SecP521R1FieldElement) this.f19191x;
        SecP521R1FieldElement secP521R1FieldElement2 = (SecP521R1FieldElement) this.f19192y;
        SecP521R1FieldElement secP521R1FieldElement3 = (SecP521R1FieldElement) eCPoint.getXCoord();
        SecP521R1FieldElement secP521R1FieldElement4 = (SecP521R1FieldElement) eCPoint.getYCoord();
        SecP521R1FieldElement secP521R1FieldElement5 = (SecP521R1FieldElement) this.zs[0];
        SecP521R1FieldElement secP521R1FieldElement6 = (SecP521R1FieldElement) eCPoint.getZCoord(0);
        int[] create = Nat.create(33);
        int[] create2 = Nat.create(17);
        int[] create3 = Nat.create(17);
        int[] create4 = Nat.create(17);
        int[] create5 = Nat.create(17);
        boolean isOne = secP521R1FieldElement5.isOne();
        if (isOne) {
            iArr = secP521R1FieldElement3.f19264x;
            iArr2 = secP521R1FieldElement4.f19264x;
            c10 = 0;
        } else {
            c10 = 0;
            SecP521R1Field.square(secP521R1FieldElement5.f19264x, create4, create);
            SecP521R1Field.multiply(create4, secP521R1FieldElement3.f19264x, create3, create);
            SecP521R1Field.multiply(create4, secP521R1FieldElement5.f19264x, create4, create);
            SecP521R1Field.multiply(create4, secP521R1FieldElement4.f19264x, create4, create);
            iArr = create3;
            iArr2 = create4;
        }
        boolean isOne2 = secP521R1FieldElement6.isOne();
        if (isOne2) {
            iArr3 = secP521R1FieldElement.f19264x;
            iArr4 = secP521R1FieldElement2.f19264x;
            i3 = 17;
        } else {
            i3 = 17;
            SecP521R1Field.square(secP521R1FieldElement6.f19264x, create5, create);
            SecP521R1Field.multiply(create5, secP521R1FieldElement.f19264x, create2, create);
            SecP521R1Field.multiply(create5, secP521R1FieldElement6.f19264x, create5, create);
            SecP521R1Field.multiply(create5, secP521R1FieldElement2.f19264x, create5, create);
            iArr3 = create2;
            iArr4 = create5;
        }
        int[] create6 = Nat.create(i3);
        SecP521R1Field.subtract(iArr3, iArr, create6);
        SecP521R1Field.subtract(iArr4, iArr2, create3);
        int i10 = i3;
        if (Nat.isZero(i10, create6)) {
            return Nat.isZero(i10, create3) ? twice() : curve.getInfinity();
        }
        SecP521R1Field.square(create6, create4, create);
        int[] create7 = Nat.create(i10);
        SecP521R1Field.multiply(create4, create6, create7, create);
        SecP521R1Field.multiply(create4, iArr3, create4, create);
        SecP521R1Field.multiply(iArr4, create7, create2, create);
        SecP521R1FieldElement secP521R1FieldElement7 = new SecP521R1FieldElement(create5);
        SecP521R1Field.square(create3, secP521R1FieldElement7.f19264x, create);
        int[] iArr5 = secP521R1FieldElement7.f19264x;
        SecP521R1Field.add(iArr5, create7, iArr5);
        int[] iArr6 = secP521R1FieldElement7.f19264x;
        SecP521R1Field.subtract(iArr6, create4, iArr6);
        int[] iArr7 = secP521R1FieldElement7.f19264x;
        SecP521R1Field.subtract(iArr7, create4, iArr7);
        SecP521R1FieldElement secP521R1FieldElement8 = new SecP521R1FieldElement(create7);
        SecP521R1Field.subtract(create4, secP521R1FieldElement7.f19264x, secP521R1FieldElement8.f19264x);
        SecP521R1Field.multiply(secP521R1FieldElement8.f19264x, create3, create3, create);
        SecP521R1Field.subtract(create3, create2, secP521R1FieldElement8.f19264x);
        SecP521R1FieldElement secP521R1FieldElement9 = new SecP521R1FieldElement(create6);
        if (!isOne) {
            int[] iArr8 = secP521R1FieldElement9.f19264x;
            SecP521R1Field.multiply(iArr8, secP521R1FieldElement5.f19264x, iArr8, create);
        }
        if (!isOne2) {
            int[] iArr9 = secP521R1FieldElement9.f19264x;
            SecP521R1Field.multiply(iArr9, secP521R1FieldElement6.f19264x, iArr9, create);
        }
        ECFieldElement[] eCFieldElementArr = new ECFieldElement[1];
        eCFieldElementArr[c10] = secP521R1FieldElement9;
        return new SecP521R1Point(curve, secP521R1FieldElement7, secP521R1FieldElement8, eCFieldElementArr);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint detach() {
        return new SecP521R1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    public ECFieldElement doubleProductFromSquares(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3, ECFieldElement eCFieldElement4) {
        return eCFieldElement.add(eCFieldElement2).square().subtract(eCFieldElement3).subtract(eCFieldElement4);
    }

    public ECFieldElement eight(ECFieldElement eCFieldElement) {
        return four(two(eCFieldElement));
    }

    public ECFieldElement four(ECFieldElement eCFieldElement) {
        return two(two(eCFieldElement));
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new SecP521R1Point(this.curve, this.f19191x, this.f19192y.negate(), this.zs);
    }

    public ECFieldElement three(ECFieldElement eCFieldElement) {
        return two(eCFieldElement).add(eCFieldElement);
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
        SecP521R1FieldElement secP521R1FieldElement = (SecP521R1FieldElement) this.f19192y;
        if (secP521R1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SecP521R1FieldElement secP521R1FieldElement2 = (SecP521R1FieldElement) this.f19191x;
        SecP521R1FieldElement secP521R1FieldElement3 = (SecP521R1FieldElement) this.zs[0];
        int[] create = Nat.create(33);
        int[] create2 = Nat.create(17);
        int[] create3 = Nat.create(17);
        int[] create4 = Nat.create(17);
        SecP521R1Field.square(secP521R1FieldElement.f19264x, create4, create);
        int[] create5 = Nat.create(17);
        SecP521R1Field.square(create4, create5, create);
        boolean isOne = secP521R1FieldElement3.isOne();
        int[] iArr = secP521R1FieldElement3.f19264x;
        if (!isOne) {
            SecP521R1Field.square(iArr, create3, create);
            iArr = create3;
        }
        SecP521R1Field.subtract(secP521R1FieldElement2.f19264x, iArr, create2);
        SecP521R1Field.add(secP521R1FieldElement2.f19264x, iArr, create3);
        SecP521R1Field.multiply(create3, create2, create3, create);
        Nat.addBothTo(17, create3, create3, create3);
        SecP521R1Field.reduce23(create3);
        SecP521R1Field.multiply(create4, secP521R1FieldElement2.f19264x, create4, create);
        Nat.shiftUpBits(17, create4, 2, 0);
        SecP521R1Field.reduce23(create4);
        Nat.shiftUpBits(17, create5, 3, 0, create2);
        SecP521R1Field.reduce23(create2);
        SecP521R1FieldElement secP521R1FieldElement4 = new SecP521R1FieldElement(create5);
        SecP521R1Field.square(create3, secP521R1FieldElement4.f19264x, create);
        int[] iArr2 = secP521R1FieldElement4.f19264x;
        SecP521R1Field.subtract(iArr2, create4, iArr2);
        int[] iArr3 = secP521R1FieldElement4.f19264x;
        SecP521R1Field.subtract(iArr3, create4, iArr3);
        SecP521R1FieldElement secP521R1FieldElement5 = new SecP521R1FieldElement(create4);
        SecP521R1Field.subtract(create4, secP521R1FieldElement4.f19264x, secP521R1FieldElement5.f19264x);
        int[] iArr4 = secP521R1FieldElement5.f19264x;
        SecP521R1Field.multiply(iArr4, create3, iArr4, create);
        int[] iArr5 = secP521R1FieldElement5.f19264x;
        SecP521R1Field.subtract(iArr5, create2, iArr5);
        SecP521R1FieldElement secP521R1FieldElement6 = new SecP521R1FieldElement(create3);
        SecP521R1Field.twice(secP521R1FieldElement.f19264x, secP521R1FieldElement6.f19264x);
        if (!isOne) {
            int[] iArr6 = secP521R1FieldElement6.f19264x;
            SecP521R1Field.multiply(iArr6, secP521R1FieldElement3.f19264x, iArr6, create);
        }
        return new SecP521R1Point(curve, secP521R1FieldElement4, secP521R1FieldElement5, new ECFieldElement[]{secP521R1FieldElement6});
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint twicePlus(ECPoint eCPoint) {
        return this == eCPoint ? threeTimes() : isInfinity() ? eCPoint : eCPoint.isInfinity() ? twice() : this.f19192y.isZero() ? eCPoint : twice().add(eCPoint);
    }

    public ECFieldElement two(ECFieldElement eCFieldElement) {
        return eCFieldElement.add(eCFieldElement);
    }

    public SecP521R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
