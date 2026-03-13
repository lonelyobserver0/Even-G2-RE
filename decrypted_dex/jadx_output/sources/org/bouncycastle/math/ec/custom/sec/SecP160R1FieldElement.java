package org.bouncycastle.math.ec.custom.sec;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat160;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecP160R1FieldElement extends ECFieldElement.AbstractFp {

    /* renamed from: Q, reason: collision with root package name */
    public static final BigInteger f19216Q = new BigInteger(1, Hex.decodeStrict(StubApp.getString2(27317)));

    /* renamed from: x, reason: collision with root package name */
    protected int[] f19217x;

    public SecP160R1FieldElement() {
        this.f19217x = Nat160.create();
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] create = Nat160.create();
        SecP160R1Field.add(this.f19217x, ((SecP160R1FieldElement) eCFieldElement).f19217x, create);
        return new SecP160R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] create = Nat160.create();
        SecP160R1Field.addOne(this.f19217x, create);
        return new SecP160R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] create = Nat160.create();
        SecP160R1Field.inv(((SecP160R1FieldElement) eCFieldElement).f19217x, create);
        SecP160R1Field.multiply(create, this.f19217x, create);
        return new SecP160R1FieldElement(create);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP160R1FieldElement) {
            return Nat160.eq(this.f19217x, ((SecP160R1FieldElement) obj).f19217x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return StubApp.getString2(32953);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return f19216Q.bitLength();
    }

    public int hashCode() {
        return f19216Q.hashCode() ^ Arrays.hashCode(this.f19217x, 0, 5);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] create = Nat160.create();
        SecP160R1Field.inv(this.f19217x, create);
        return new SecP160R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return Nat160.isOne(this.f19217x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return Nat160.isZero(this.f19217x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] create = Nat160.create();
        SecP160R1Field.multiply(this.f19217x, ((SecP160R1FieldElement) eCFieldElement).f19217x, create);
        return new SecP160R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] create = Nat160.create();
        SecP160R1Field.negate(this.f19217x, create);
        return new SecP160R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f19217x;
        if (Nat160.isZero(iArr) || Nat160.isOne(iArr)) {
            return this;
        }
        int[] create = Nat160.create();
        SecP160R1Field.square(iArr, create);
        SecP160R1Field.multiply(create, iArr, create);
        int[] create2 = Nat160.create();
        SecP160R1Field.squareN(create, 2, create2);
        SecP160R1Field.multiply(create2, create, create2);
        SecP160R1Field.squareN(create2, 4, create);
        SecP160R1Field.multiply(create, create2, create);
        SecP160R1Field.squareN(create, 8, create2);
        SecP160R1Field.multiply(create2, create, create2);
        SecP160R1Field.squareN(create2, 16, create);
        SecP160R1Field.multiply(create, create2, create);
        SecP160R1Field.squareN(create, 32, create2);
        SecP160R1Field.multiply(create2, create, create2);
        SecP160R1Field.squareN(create2, 64, create);
        SecP160R1Field.multiply(create, create2, create);
        SecP160R1Field.square(create, create2);
        SecP160R1Field.multiply(create2, iArr, create2);
        SecP160R1Field.squareN(create2, 29, create2);
        SecP160R1Field.square(create2, create);
        if (Nat160.eq(iArr, create)) {
            return new SecP160R1FieldElement(create2);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] create = Nat160.create();
        SecP160R1Field.square(this.f19217x, create);
        return new SecP160R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] create = Nat160.create();
        SecP160R1Field.subtract(this.f19217x, ((SecP160R1FieldElement) eCFieldElement).f19217x, create);
        return new SecP160R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return Nat160.getBit(this.f19217x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat160.toBigInteger(this.f19217x);
    }

    public SecP160R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f19216Q) >= 0) {
            throw new IllegalArgumentException(StubApp.getString2(32952));
        }
        this.f19217x = SecP160R1Field.fromBigInteger(bigInteger);
    }

    public SecP160R1FieldElement(int[] iArr) {
        this.f19217x = iArr;
    }
}
