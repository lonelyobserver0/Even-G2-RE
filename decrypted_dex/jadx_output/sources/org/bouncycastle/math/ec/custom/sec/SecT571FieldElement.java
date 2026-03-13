package org.bouncycastle.math.ec.custom.sec;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat576;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecT571FieldElement extends ECFieldElement.AbstractF2m {

    /* renamed from: x, reason: collision with root package name */
    protected long[] f19273x;

    public SecT571FieldElement() {
        this.f19273x = Nat576.create64();
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        long[] create64 = Nat576.create64();
        SecT571Field.add(this.f19273x, ((SecT571FieldElement) eCFieldElement).f19273x, create64);
        return new SecT571FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        long[] create64 = Nat576.create64();
        SecT571Field.addOne(this.f19273x, create64);
        return new SecT571FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        return multiply(eCFieldElement.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecT571FieldElement) {
            return Nat576.eq64(this.f19273x, ((SecT571FieldElement) obj).f19273x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return StubApp.getString2(32989);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return 571;
    }

    public int getK1() {
        return 2;
    }

    public int getK2() {
        return 5;
    }

    public int getK3() {
        return 10;
    }

    public int getM() {
        return 571;
    }

    public int getRepresentation() {
        return 3;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement.AbstractF2m
    public ECFieldElement halfTrace() {
        long[] create64 = Nat576.create64();
        SecT571Field.halfTrace(this.f19273x, create64);
        return new SecT571FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement.AbstractF2m
    public boolean hasFastTrace() {
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f19273x, 0, 9) ^ 5711052;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        long[] create64 = Nat576.create64();
        SecT571Field.invert(this.f19273x, create64);
        return new SecT571FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return Nat576.isOne64(this.f19273x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return Nat576.isZero64(this.f19273x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        long[] create64 = Nat576.create64();
        SecT571Field.multiply(this.f19273x, ((SecT571FieldElement) eCFieldElement).f19273x, create64);
        return new SecT571FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        long[] jArr = this.f19273x;
        long[] jArr2 = ((SecT571FieldElement) eCFieldElement).f19273x;
        long[] jArr3 = ((SecT571FieldElement) eCFieldElement2).f19273x;
        long[] jArr4 = ((SecT571FieldElement) eCFieldElement3).f19273x;
        long[] createExt64 = Nat576.createExt64();
        SecT571Field.multiplyAddToExt(jArr, jArr2, createExt64);
        SecT571Field.multiplyAddToExt(jArr3, jArr4, createExt64);
        long[] create64 = Nat576.create64();
        SecT571Field.reduce(createExt64, create64);
        return new SecT571FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        return this;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        long[] create64 = Nat576.create64();
        SecT571Field.sqrt(this.f19273x, create64);
        return new SecT571FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        long[] create64 = Nat576.create64();
        SecT571Field.square(this.f19273x, create64);
        return new SecT571FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return squarePlusProduct(eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        long[] jArr = this.f19273x;
        long[] jArr2 = ((SecT571FieldElement) eCFieldElement).f19273x;
        long[] jArr3 = ((SecT571FieldElement) eCFieldElement2).f19273x;
        long[] createExt64 = Nat576.createExt64();
        SecT571Field.squareAddToExt(jArr, createExt64);
        SecT571Field.multiplyAddToExt(jArr2, jArr3, createExt64);
        long[] create64 = Nat576.create64();
        SecT571Field.reduce(createExt64, create64);
        return new SecT571FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePow(int i3) {
        if (i3 < 1) {
            return this;
        }
        long[] create64 = Nat576.create64();
        SecT571Field.squareN(this.f19273x, i3, create64);
        return new SecT571FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        return add(eCFieldElement);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return (this.f19273x[0] & 1) != 0;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat576.toBigInteger64(this.f19273x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement.AbstractF2m
    public int trace() {
        return SecT571Field.trace(this.f19273x);
    }

    public SecT571FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            throw new IllegalArgumentException(StubApp.getString2(32988));
        }
        this.f19273x = SecT571Field.fromBigInteger(bigInteger);
    }

    public SecT571FieldElement(long[] jArr) {
        this.f19273x = jArr;
    }
}
