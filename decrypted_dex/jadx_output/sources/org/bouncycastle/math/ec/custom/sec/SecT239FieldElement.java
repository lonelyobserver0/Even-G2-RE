package org.bouncycastle.math.ec.custom.sec;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecT239FieldElement extends ECFieldElement.AbstractF2m {

    /* renamed from: x, reason: collision with root package name */
    protected long[] f19270x;

    public SecT239FieldElement() {
        this.f19270x = Nat256.create64();
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        long[] create64 = Nat256.create64();
        SecT239Field.add(this.f19270x, ((SecT239FieldElement) eCFieldElement).f19270x, create64);
        return new SecT239FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        long[] create64 = Nat256.create64();
        SecT239Field.addOne(this.f19270x, create64);
        return new SecT239FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        return multiply(eCFieldElement.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecT239FieldElement) {
            return Nat256.eq64(this.f19270x, ((SecT239FieldElement) obj).f19270x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return StubApp.getString2(32983);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return 239;
    }

    public int getK1() {
        return 158;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 239;
    }

    public int getRepresentation() {
        return 2;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement.AbstractF2m
    public ECFieldElement halfTrace() {
        long[] create64 = Nat256.create64();
        SecT239Field.halfTrace(this.f19270x, create64);
        return new SecT239FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement.AbstractF2m
    public boolean hasFastTrace() {
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f19270x, 0, 4) ^ 23900158;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        long[] create64 = Nat256.create64();
        SecT239Field.invert(this.f19270x, create64);
        return new SecT239FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return Nat256.isOne64(this.f19270x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return Nat256.isZero64(this.f19270x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        long[] create64 = Nat256.create64();
        SecT239Field.multiply(this.f19270x, ((SecT239FieldElement) eCFieldElement).f19270x, create64);
        return new SecT239FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        long[] jArr = this.f19270x;
        long[] jArr2 = ((SecT239FieldElement) eCFieldElement).f19270x;
        long[] jArr3 = ((SecT239FieldElement) eCFieldElement2).f19270x;
        long[] jArr4 = ((SecT239FieldElement) eCFieldElement3).f19270x;
        long[] createExt64 = Nat256.createExt64();
        SecT239Field.multiplyAddToExt(jArr, jArr2, createExt64);
        SecT239Field.multiplyAddToExt(jArr3, jArr4, createExt64);
        long[] create64 = Nat256.create64();
        SecT239Field.reduce(createExt64, create64);
        return new SecT239FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        return this;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        long[] create64 = Nat256.create64();
        SecT239Field.sqrt(this.f19270x, create64);
        return new SecT239FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        long[] create64 = Nat256.create64();
        SecT239Field.square(this.f19270x, create64);
        return new SecT239FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return squarePlusProduct(eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        long[] jArr = this.f19270x;
        long[] jArr2 = ((SecT239FieldElement) eCFieldElement).f19270x;
        long[] jArr3 = ((SecT239FieldElement) eCFieldElement2).f19270x;
        long[] createExt64 = Nat256.createExt64();
        SecT239Field.squareAddToExt(jArr, createExt64);
        SecT239Field.multiplyAddToExt(jArr2, jArr3, createExt64);
        long[] create64 = Nat256.create64();
        SecT239Field.reduce(createExt64, create64);
        return new SecT239FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePow(int i3) {
        if (i3 < 1) {
            return this;
        }
        long[] create64 = Nat256.create64();
        SecT239Field.squareN(this.f19270x, i3, create64);
        return new SecT239FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        return add(eCFieldElement);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return (this.f19270x[0] & 1) != 0;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat256.toBigInteger64(this.f19270x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement.AbstractF2m
    public int trace() {
        return SecT239Field.trace(this.f19270x);
    }

    public SecT239FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 239) {
            throw new IllegalArgumentException(StubApp.getString2(32982));
        }
        this.f19270x = SecT239Field.fromBigInteger(bigInteger);
    }

    public SecT239FieldElement(long[] jArr) {
        this.f19270x = jArr;
    }
}
