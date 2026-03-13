package org.bouncycastle.math.ec.custom.sec;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat192;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecP192R1FieldElement extends ECFieldElement.AbstractFp {

    /* renamed from: Q, reason: collision with root package name */
    public static final BigInteger f19232Q = new BigInteger(1, Hex.decodeStrict(StubApp.getString2(27338)));

    /* renamed from: x, reason: collision with root package name */
    protected int[] f19233x;

    public SecP192R1FieldElement() {
        this.f19233x = Nat192.create();
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] create = Nat192.create();
        SecP192R1Field.add(this.f19233x, ((SecP192R1FieldElement) eCFieldElement).f19233x, create);
        return new SecP192R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] create = Nat192.create();
        SecP192R1Field.addOne(this.f19233x, create);
        return new SecP192R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] create = Nat192.create();
        SecP192R1Field.inv(((SecP192R1FieldElement) eCFieldElement).f19233x, create);
        SecP192R1Field.multiply(create, this.f19233x, create);
        return new SecP192R1FieldElement(create);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP192R1FieldElement) {
            return Nat192.eq(this.f19233x, ((SecP192R1FieldElement) obj).f19233x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return StubApp.getString2(32959);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return f19232Q.bitLength();
    }

    public int hashCode() {
        return f19232Q.hashCode() ^ Arrays.hashCode(this.f19233x, 0, 6);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] create = Nat192.create();
        SecP192R1Field.inv(this.f19233x, create);
        return new SecP192R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return Nat192.isOne(this.f19233x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return Nat192.isZero(this.f19233x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] create = Nat192.create();
        SecP192R1Field.multiply(this.f19233x, ((SecP192R1FieldElement) eCFieldElement).f19233x, create);
        return new SecP192R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] create = Nat192.create();
        SecP192R1Field.negate(this.f19233x, create);
        return new SecP192R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f19233x;
        if (Nat192.isZero(iArr) || Nat192.isOne(iArr)) {
            return this;
        }
        int[] create = Nat192.create();
        int[] create2 = Nat192.create();
        SecP192R1Field.square(iArr, create);
        SecP192R1Field.multiply(create, iArr, create);
        SecP192R1Field.squareN(create, 2, create2);
        SecP192R1Field.multiply(create2, create, create2);
        SecP192R1Field.squareN(create2, 4, create);
        SecP192R1Field.multiply(create, create2, create);
        SecP192R1Field.squareN(create, 8, create2);
        SecP192R1Field.multiply(create2, create, create2);
        SecP192R1Field.squareN(create2, 16, create);
        SecP192R1Field.multiply(create, create2, create);
        SecP192R1Field.squareN(create, 32, create2);
        SecP192R1Field.multiply(create2, create, create2);
        SecP192R1Field.squareN(create2, 64, create);
        SecP192R1Field.multiply(create, create2, create);
        SecP192R1Field.squareN(create, 62, create);
        SecP192R1Field.square(create, create2);
        if (Nat192.eq(iArr, create2)) {
            return new SecP192R1FieldElement(create);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] create = Nat192.create();
        SecP192R1Field.square(this.f19233x, create);
        return new SecP192R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] create = Nat192.create();
        SecP192R1Field.subtract(this.f19233x, ((SecP192R1FieldElement) eCFieldElement).f19233x, create);
        return new SecP192R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return Nat192.getBit(this.f19233x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat192.toBigInteger(this.f19233x);
    }

    public SecP192R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f19232Q) >= 0) {
            throw new IllegalArgumentException(StubApp.getString2(32958));
        }
        this.f19233x = SecP192R1Field.fromBigInteger(bigInteger);
    }

    public SecP192R1FieldElement(int[] iArr) {
        this.f19233x = iArr;
    }
}
