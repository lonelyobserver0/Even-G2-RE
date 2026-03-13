package org.bouncycastle.math.ec.custom.sec;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecP521R1FieldElement extends ECFieldElement.AbstractFp {

    /* renamed from: Q, reason: collision with root package name */
    public static final BigInteger f19263Q = new BigInteger(1, Hex.decodeStrict(StubApp.getString2(27212)));

    /* renamed from: x, reason: collision with root package name */
    protected int[] f19264x;

    public SecP521R1FieldElement() {
        this.f19264x = Nat.create(17);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] create = Nat.create(17);
        SecP521R1Field.add(this.f19264x, ((SecP521R1FieldElement) eCFieldElement).f19264x, create);
        return new SecP521R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] create = Nat.create(17);
        SecP521R1Field.addOne(this.f19264x, create);
        return new SecP521R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] create = Nat.create(17);
        SecP521R1Field.inv(((SecP521R1FieldElement) eCFieldElement).f19264x, create);
        SecP521R1Field.multiply(create, this.f19264x, create);
        return new SecP521R1FieldElement(create);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP521R1FieldElement) {
            return Nat.eq(17, this.f19264x, ((SecP521R1FieldElement) obj).f19264x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return StubApp.getString2(32971);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return f19263Q.bitLength();
    }

    public int hashCode() {
        return f19263Q.hashCode() ^ Arrays.hashCode(this.f19264x, 0, 17);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] create = Nat.create(17);
        SecP521R1Field.inv(this.f19264x, create);
        return new SecP521R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return Nat.isOne(17, this.f19264x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return Nat.isZero(17, this.f19264x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] create = Nat.create(17);
        SecP521R1Field.multiply(this.f19264x, ((SecP521R1FieldElement) eCFieldElement).f19264x, create);
        return new SecP521R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] create = Nat.create(17);
        SecP521R1Field.negate(this.f19264x, create);
        return new SecP521R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f19264x;
        if (Nat.isZero(17, iArr) || Nat.isOne(17, iArr)) {
            return this;
        }
        int[] create = Nat.create(33);
        int[] create2 = Nat.create(17);
        int[] create3 = Nat.create(17);
        SecP521R1Field.squareN(iArr, 519, create2, create);
        SecP521R1Field.square(create2, create3, create);
        if (Nat.eq(17, iArr, create3)) {
            return new SecP521R1FieldElement(create2);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] create = Nat.create(17);
        SecP521R1Field.square(this.f19264x, create);
        return new SecP521R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] create = Nat.create(17);
        SecP521R1Field.subtract(this.f19264x, ((SecP521R1FieldElement) eCFieldElement).f19264x, create);
        return new SecP521R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return Nat.getBit(this.f19264x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat.toBigInteger(17, this.f19264x);
    }

    public SecP521R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f19263Q) >= 0) {
            throw new IllegalArgumentException(StubApp.getString2(32970));
        }
        this.f19264x = SecP521R1Field.fromBigInteger(bigInteger);
    }

    public SecP521R1FieldElement(int[] iArr) {
        this.f19264x = iArr;
    }
}
