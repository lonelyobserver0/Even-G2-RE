package org.bouncycastle.math.ec.custom.sec;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat192;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecP192K1FieldElement extends ECFieldElement.AbstractFp {

    /* renamed from: Q, reason: collision with root package name */
    public static final BigInteger f19226Q = new BigInteger(1, Hex.decodeStrict(StubApp.getString2(27328)));

    /* renamed from: x, reason: collision with root package name */
    protected int[] f19227x;

    public SecP192K1FieldElement() {
        this.f19227x = Nat192.create();
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] create = Nat192.create();
        SecP192K1Field.add(this.f19227x, ((SecP192K1FieldElement) eCFieldElement).f19227x, create);
        return new SecP192K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] create = Nat192.create();
        SecP192K1Field.addOne(this.f19227x, create);
        return new SecP192K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] create = Nat192.create();
        SecP192K1Field.inv(((SecP192K1FieldElement) eCFieldElement).f19227x, create);
        SecP192K1Field.multiply(create, this.f19227x, create);
        return new SecP192K1FieldElement(create);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP192K1FieldElement) {
            return Nat192.eq(this.f19227x, ((SecP192K1FieldElement) obj).f19227x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return StubApp.getString2(32957);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return f19226Q.bitLength();
    }

    public int hashCode() {
        return f19226Q.hashCode() ^ Arrays.hashCode(this.f19227x, 0, 6);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] create = Nat192.create();
        SecP192K1Field.inv(this.f19227x, create);
        return new SecP192K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return Nat192.isOne(this.f19227x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return Nat192.isZero(this.f19227x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] create = Nat192.create();
        SecP192K1Field.multiply(this.f19227x, ((SecP192K1FieldElement) eCFieldElement).f19227x, create);
        return new SecP192K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] create = Nat192.create();
        SecP192K1Field.negate(this.f19227x, create);
        return new SecP192K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f19227x;
        if (Nat192.isZero(iArr) || Nat192.isOne(iArr)) {
            return this;
        }
        int[] create = Nat192.create();
        SecP192K1Field.square(iArr, create);
        SecP192K1Field.multiply(create, iArr, create);
        int[] create2 = Nat192.create();
        SecP192K1Field.square(create, create2);
        SecP192K1Field.multiply(create2, iArr, create2);
        int[] create3 = Nat192.create();
        SecP192K1Field.squareN(create2, 3, create3);
        SecP192K1Field.multiply(create3, create2, create3);
        SecP192K1Field.squareN(create3, 2, create3);
        SecP192K1Field.multiply(create3, create, create3);
        SecP192K1Field.squareN(create3, 8, create);
        SecP192K1Field.multiply(create, create3, create);
        SecP192K1Field.squareN(create, 3, create3);
        SecP192K1Field.multiply(create3, create2, create3);
        int[] create4 = Nat192.create();
        SecP192K1Field.squareN(create3, 16, create4);
        SecP192K1Field.multiply(create4, create, create4);
        SecP192K1Field.squareN(create4, 35, create);
        SecP192K1Field.multiply(create, create4, create);
        SecP192K1Field.squareN(create, 70, create4);
        SecP192K1Field.multiply(create4, create, create4);
        SecP192K1Field.squareN(create4, 19, create);
        SecP192K1Field.multiply(create, create3, create);
        SecP192K1Field.squareN(create, 20, create);
        SecP192K1Field.multiply(create, create3, create);
        SecP192K1Field.squareN(create, 4, create);
        SecP192K1Field.multiply(create, create2, create);
        SecP192K1Field.squareN(create, 6, create);
        SecP192K1Field.multiply(create, create2, create);
        SecP192K1Field.square(create, create);
        SecP192K1Field.square(create, create2);
        if (Nat192.eq(iArr, create2)) {
            return new SecP192K1FieldElement(create);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] create = Nat192.create();
        SecP192K1Field.square(this.f19227x, create);
        return new SecP192K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] create = Nat192.create();
        SecP192K1Field.subtract(this.f19227x, ((SecP192K1FieldElement) eCFieldElement).f19227x, create);
        return new SecP192K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return Nat192.getBit(this.f19227x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat192.toBigInteger(this.f19227x);
    }

    public SecP192K1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f19226Q) >= 0) {
            throw new IllegalArgumentException(StubApp.getString2(32956));
        }
        this.f19227x = SecP192K1Field.fromBigInteger(bigInteger);
    }

    public SecP192K1FieldElement(int[] iArr) {
        this.f19227x = iArr;
    }
}
