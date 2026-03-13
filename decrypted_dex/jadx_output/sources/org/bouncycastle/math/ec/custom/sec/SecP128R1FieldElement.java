package org.bouncycastle.math.ec.custom.sec;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat128;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecP128R1FieldElement extends ECFieldElement.AbstractFp {

    /* renamed from: Q, reason: collision with root package name */
    public static final BigInteger f19209Q = new BigInteger(1, Hex.decodeStrict(StubApp.getString2(27296)));

    /* renamed from: x, reason: collision with root package name */
    protected int[] f19210x;

    public SecP128R1FieldElement() {
        this.f19210x = Nat128.create();
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] create = Nat128.create();
        SecP128R1Field.add(this.f19210x, ((SecP128R1FieldElement) eCFieldElement).f19210x, create);
        return new SecP128R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] create = Nat128.create();
        SecP128R1Field.addOne(this.f19210x, create);
        return new SecP128R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] create = Nat128.create();
        SecP128R1Field.inv(((SecP128R1FieldElement) eCFieldElement).f19210x, create);
        SecP128R1Field.multiply(create, this.f19210x, create);
        return new SecP128R1FieldElement(create);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP128R1FieldElement) {
            return Nat128.eq(this.f19210x, ((SecP128R1FieldElement) obj).f19210x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return StubApp.getString2(32951);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return f19209Q.bitLength();
    }

    public int hashCode() {
        return f19209Q.hashCode() ^ Arrays.hashCode(this.f19210x, 0, 4);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] create = Nat128.create();
        SecP128R1Field.inv(this.f19210x, create);
        return new SecP128R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return Nat128.isOne(this.f19210x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return Nat128.isZero(this.f19210x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] create = Nat128.create();
        SecP128R1Field.multiply(this.f19210x, ((SecP128R1FieldElement) eCFieldElement).f19210x, create);
        return new SecP128R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] create = Nat128.create();
        SecP128R1Field.negate(this.f19210x, create);
        return new SecP128R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f19210x;
        if (Nat128.isZero(iArr) || Nat128.isOne(iArr)) {
            return this;
        }
        int[] create = Nat128.create();
        SecP128R1Field.square(iArr, create);
        SecP128R1Field.multiply(create, iArr, create);
        int[] create2 = Nat128.create();
        SecP128R1Field.squareN(create, 2, create2);
        SecP128R1Field.multiply(create2, create, create2);
        int[] create3 = Nat128.create();
        SecP128R1Field.squareN(create2, 4, create3);
        SecP128R1Field.multiply(create3, create2, create3);
        SecP128R1Field.squareN(create3, 2, create2);
        SecP128R1Field.multiply(create2, create, create2);
        SecP128R1Field.squareN(create2, 10, create);
        SecP128R1Field.multiply(create, create2, create);
        SecP128R1Field.squareN(create, 10, create3);
        SecP128R1Field.multiply(create3, create2, create3);
        SecP128R1Field.square(create3, create2);
        SecP128R1Field.multiply(create2, iArr, create2);
        SecP128R1Field.squareN(create2, 95, create2);
        SecP128R1Field.square(create2, create3);
        if (Nat128.eq(iArr, create3)) {
            return new SecP128R1FieldElement(create2);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] create = Nat128.create();
        SecP128R1Field.square(this.f19210x, create);
        return new SecP128R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] create = Nat128.create();
        SecP128R1Field.subtract(this.f19210x, ((SecP128R1FieldElement) eCFieldElement).f19210x, create);
        return new SecP128R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return Nat128.getBit(this.f19210x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat128.toBigInteger(this.f19210x);
    }

    public SecP128R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f19209Q) >= 0) {
            throw new IllegalArgumentException(StubApp.getString2(32950));
        }
        this.f19210x = SecP128R1Field.fromBigInteger(bigInteger);
    }

    public SecP128R1FieldElement(int[] iArr) {
        this.f19210x = iArr;
    }
}
