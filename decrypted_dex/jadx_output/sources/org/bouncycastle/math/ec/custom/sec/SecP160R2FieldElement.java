package org.bouncycastle.math.ec.custom.sec;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat160;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecP160R2FieldElement extends ECFieldElement.AbstractFp {

    /* renamed from: Q, reason: collision with root package name */
    public static final BigInteger f19221Q = new BigInteger(1, Hex.decodeStrict(StubApp.getString2(27307)));

    /* renamed from: x, reason: collision with root package name */
    protected int[] f19222x;

    public SecP160R2FieldElement() {
        this.f19222x = Nat160.create();
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] create = Nat160.create();
        SecP160R2Field.add(this.f19222x, ((SecP160R2FieldElement) eCFieldElement).f19222x, create);
        return new SecP160R2FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] create = Nat160.create();
        SecP160R2Field.addOne(this.f19222x, create);
        return new SecP160R2FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] create = Nat160.create();
        SecP160R2Field.inv(((SecP160R2FieldElement) eCFieldElement).f19222x, create);
        SecP160R2Field.multiply(create, this.f19222x, create);
        return new SecP160R2FieldElement(create);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP160R2FieldElement) {
            return Nat160.eq(this.f19222x, ((SecP160R2FieldElement) obj).f19222x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return StubApp.getString2(32955);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return f19221Q.bitLength();
    }

    public int hashCode() {
        return f19221Q.hashCode() ^ Arrays.hashCode(this.f19222x, 0, 5);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] create = Nat160.create();
        SecP160R2Field.inv(this.f19222x, create);
        return new SecP160R2FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return Nat160.isOne(this.f19222x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return Nat160.isZero(this.f19222x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] create = Nat160.create();
        SecP160R2Field.multiply(this.f19222x, ((SecP160R2FieldElement) eCFieldElement).f19222x, create);
        return new SecP160R2FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] create = Nat160.create();
        SecP160R2Field.negate(this.f19222x, create);
        return new SecP160R2FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f19222x;
        if (Nat160.isZero(iArr) || Nat160.isOne(iArr)) {
            return this;
        }
        int[] create = Nat160.create();
        SecP160R2Field.square(iArr, create);
        SecP160R2Field.multiply(create, iArr, create);
        int[] create2 = Nat160.create();
        SecP160R2Field.square(create, create2);
        SecP160R2Field.multiply(create2, iArr, create2);
        int[] create3 = Nat160.create();
        SecP160R2Field.square(create2, create3);
        SecP160R2Field.multiply(create3, iArr, create3);
        int[] create4 = Nat160.create();
        SecP160R2Field.squareN(create3, 3, create4);
        SecP160R2Field.multiply(create4, create2, create4);
        SecP160R2Field.squareN(create4, 7, create3);
        SecP160R2Field.multiply(create3, create4, create3);
        SecP160R2Field.squareN(create3, 3, create4);
        SecP160R2Field.multiply(create4, create2, create4);
        int[] create5 = Nat160.create();
        SecP160R2Field.squareN(create4, 14, create5);
        SecP160R2Field.multiply(create5, create3, create5);
        SecP160R2Field.squareN(create5, 31, create3);
        SecP160R2Field.multiply(create3, create5, create3);
        SecP160R2Field.squareN(create3, 62, create5);
        SecP160R2Field.multiply(create5, create3, create5);
        SecP160R2Field.squareN(create5, 3, create3);
        SecP160R2Field.multiply(create3, create2, create3);
        SecP160R2Field.squareN(create3, 18, create3);
        SecP160R2Field.multiply(create3, create4, create3);
        SecP160R2Field.squareN(create3, 2, create3);
        SecP160R2Field.multiply(create3, iArr, create3);
        SecP160R2Field.squareN(create3, 3, create3);
        SecP160R2Field.multiply(create3, create, create3);
        SecP160R2Field.squareN(create3, 6, create3);
        SecP160R2Field.multiply(create3, create2, create3);
        SecP160R2Field.squareN(create3, 2, create3);
        SecP160R2Field.multiply(create3, iArr, create3);
        SecP160R2Field.square(create3, create);
        if (Nat160.eq(iArr, create)) {
            return new SecP160R2FieldElement(create3);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] create = Nat160.create();
        SecP160R2Field.square(this.f19222x, create);
        return new SecP160R2FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] create = Nat160.create();
        SecP160R2Field.subtract(this.f19222x, ((SecP160R2FieldElement) eCFieldElement).f19222x, create);
        return new SecP160R2FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return Nat160.getBit(this.f19222x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat160.toBigInteger(this.f19222x);
    }

    public SecP160R2FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f19221Q) >= 0) {
            throw new IllegalArgumentException(StubApp.getString2(32954));
        }
        this.f19222x = SecP160R2Field.fromBigInteger(bigInteger);
    }

    public SecP160R2FieldElement(int[] iArr) {
        this.f19222x = iArr;
    }
}
