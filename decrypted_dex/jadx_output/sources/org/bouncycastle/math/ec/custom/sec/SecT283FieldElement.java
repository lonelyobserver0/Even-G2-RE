package org.bouncycastle.math.ec.custom.sec;

import com.stub.StubApp;
import java.math.BigInteger;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat320;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecT283FieldElement extends ECFieldElement.AbstractF2m {

    /* renamed from: x, reason: collision with root package name */
    protected long[] f19271x;

    public SecT283FieldElement() {
        this.f19271x = Nat320.create64();
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        long[] create64 = Nat320.create64();
        SecT283Field.add(this.f19271x, ((SecT283FieldElement) eCFieldElement).f19271x, create64);
        return new SecT283FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        long[] create64 = Nat320.create64();
        SecT283Field.addOne(this.f19271x, create64);
        return new SecT283FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        return multiply(eCFieldElement.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecT283FieldElement) {
            return Nat320.eq64(this.f19271x, ((SecT283FieldElement) obj).f19271x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return StubApp.getString2(32985);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return DfuBaseService.NOTIFICATION_ID;
    }

    public int getK1() {
        return 5;
    }

    public int getK2() {
        return 7;
    }

    public int getK3() {
        return 12;
    }

    public int getM() {
        return DfuBaseService.NOTIFICATION_ID;
    }

    public int getRepresentation() {
        return 3;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement.AbstractF2m
    public ECFieldElement halfTrace() {
        long[] create64 = Nat320.create64();
        SecT283Field.halfTrace(this.f19271x, create64);
        return new SecT283FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement.AbstractF2m
    public boolean hasFastTrace() {
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f19271x, 0, 5) ^ 2831275;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        long[] create64 = Nat320.create64();
        SecT283Field.invert(this.f19271x, create64);
        return new SecT283FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return Nat320.isOne64(this.f19271x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return Nat320.isZero64(this.f19271x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        long[] create64 = Nat320.create64();
        SecT283Field.multiply(this.f19271x, ((SecT283FieldElement) eCFieldElement).f19271x, create64);
        return new SecT283FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        long[] jArr = this.f19271x;
        long[] jArr2 = ((SecT283FieldElement) eCFieldElement).f19271x;
        long[] jArr3 = ((SecT283FieldElement) eCFieldElement2).f19271x;
        long[] jArr4 = ((SecT283FieldElement) eCFieldElement3).f19271x;
        long[] create64 = Nat.create64(9);
        SecT283Field.multiplyAddToExt(jArr, jArr2, create64);
        SecT283Field.multiplyAddToExt(jArr3, jArr4, create64);
        long[] create642 = Nat320.create64();
        SecT283Field.reduce(create64, create642);
        return new SecT283FieldElement(create642);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        return this;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        long[] create64 = Nat320.create64();
        SecT283Field.sqrt(this.f19271x, create64);
        return new SecT283FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        long[] create64 = Nat320.create64();
        SecT283Field.square(this.f19271x, create64);
        return new SecT283FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return squarePlusProduct(eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        long[] jArr = this.f19271x;
        long[] jArr2 = ((SecT283FieldElement) eCFieldElement).f19271x;
        long[] jArr3 = ((SecT283FieldElement) eCFieldElement2).f19271x;
        long[] create64 = Nat.create64(9);
        SecT283Field.squareAddToExt(jArr, create64);
        SecT283Field.multiplyAddToExt(jArr2, jArr3, create64);
        long[] create642 = Nat320.create64();
        SecT283Field.reduce(create64, create642);
        return new SecT283FieldElement(create642);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePow(int i3) {
        if (i3 < 1) {
            return this;
        }
        long[] create64 = Nat320.create64();
        SecT283Field.squareN(this.f19271x, i3, create64);
        return new SecT283FieldElement(create64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        return add(eCFieldElement);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return (this.f19271x[0] & 1) != 0;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat320.toBigInteger64(this.f19271x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement.AbstractF2m
    public int trace() {
        return SecT283Field.trace(this.f19271x);
    }

    public SecT283FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            throw new IllegalArgumentException(StubApp.getString2(32984));
        }
        this.f19271x = SecT283Field.fromBigInteger(bigInteger);
    }

    public SecT283FieldElement(long[] jArr) {
        this.f19271x = jArr;
    }
}
