package org.bouncycastle.math.ec.custom.sec;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecP384R1FieldElement extends ECFieldElement.AbstractFp {

    /* renamed from: Q, reason: collision with root package name */
    public static final BigInteger f19259Q = new BigInteger(1, Hex.decodeStrict(StubApp.getString2(27206)));

    /* renamed from: x, reason: collision with root package name */
    protected int[] f19260x;

    public SecP384R1FieldElement() {
        this.f19260x = Nat.create(12);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] create = Nat.create(12);
        SecP384R1Field.add(this.f19260x, ((SecP384R1FieldElement) eCFieldElement).f19260x, create);
        return new SecP384R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] create = Nat.create(12);
        SecP384R1Field.addOne(this.f19260x, create);
        return new SecP384R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] create = Nat.create(12);
        SecP384R1Field.inv(((SecP384R1FieldElement) eCFieldElement).f19260x, create);
        SecP384R1Field.multiply(create, this.f19260x, create);
        return new SecP384R1FieldElement(create);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP384R1FieldElement) {
            return Nat.eq(12, this.f19260x, ((SecP384R1FieldElement) obj).f19260x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return StubApp.getString2(32969);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return f19259Q.bitLength();
    }

    public int hashCode() {
        return f19259Q.hashCode() ^ Arrays.hashCode(this.f19260x, 0, 12);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] create = Nat.create(12);
        SecP384R1Field.inv(this.f19260x, create);
        return new SecP384R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return Nat.isOne(12, this.f19260x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return Nat.isZero(12, this.f19260x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] create = Nat.create(12);
        SecP384R1Field.multiply(this.f19260x, ((SecP384R1FieldElement) eCFieldElement).f19260x, create);
        return new SecP384R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] create = Nat.create(12);
        SecP384R1Field.negate(this.f19260x, create);
        return new SecP384R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f19260x;
        if (Nat.isZero(12, iArr) || Nat.isOne(12, iArr)) {
            return this;
        }
        int[] create = Nat.create(24);
        int[] create2 = Nat.create(12);
        int[] create3 = Nat.create(12);
        int[] create4 = Nat.create(12);
        int[] create5 = Nat.create(12);
        SecP384R1Field.square(iArr, create2, create);
        SecP384R1Field.multiply(create2, iArr, create2, create);
        SecP384R1Field.squareN(create2, 2, create3, create);
        SecP384R1Field.multiply(create3, create2, create3, create);
        SecP384R1Field.square(create3, create3, create);
        SecP384R1Field.multiply(create3, iArr, create3, create);
        SecP384R1Field.squareN(create3, 5, create4, create);
        SecP384R1Field.multiply(create4, create3, create4, create);
        SecP384R1Field.squareN(create4, 5, create5, create);
        SecP384R1Field.multiply(create5, create3, create5, create);
        SecP384R1Field.squareN(create5, 15, create3, create);
        SecP384R1Field.multiply(create3, create5, create3, create);
        SecP384R1Field.squareN(create3, 2, create4, create);
        SecP384R1Field.multiply(create2, create4, create2, create);
        SecP384R1Field.squareN(create4, 28, create4, create);
        SecP384R1Field.multiply(create3, create4, create3, create);
        SecP384R1Field.squareN(create3, 60, create4, create);
        SecP384R1Field.multiply(create4, create3, create4, create);
        SecP384R1Field.squareN(create4, 120, create3, create);
        SecP384R1Field.multiply(create3, create4, create3, create);
        SecP384R1Field.squareN(create3, 15, create3, create);
        SecP384R1Field.multiply(create3, create5, create3, create);
        SecP384R1Field.squareN(create3, 33, create3, create);
        SecP384R1Field.multiply(create3, create2, create3, create);
        SecP384R1Field.squareN(create3, 64, create3, create);
        SecP384R1Field.multiply(create3, iArr, create3, create);
        SecP384R1Field.squareN(create3, 30, create2, create);
        SecP384R1Field.square(create2, create3, create);
        if (Nat.eq(12, iArr, create3)) {
            return new SecP384R1FieldElement(create2);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] create = Nat.create(12);
        SecP384R1Field.square(this.f19260x, create);
        return new SecP384R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] create = Nat.create(12);
        SecP384R1Field.subtract(this.f19260x, ((SecP384R1FieldElement) eCFieldElement).f19260x, create);
        return new SecP384R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return Nat.getBit(this.f19260x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat.toBigInteger(12, this.f19260x);
    }

    public SecP384R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f19259Q) >= 0) {
            throw new IllegalArgumentException(StubApp.getString2(32968));
        }
        this.f19260x = SecP384R1Field.fromBigInteger(bigInteger);
    }

    public SecP384R1FieldElement(int[] iArr) {
        this.f19260x = iArr;
    }
}
