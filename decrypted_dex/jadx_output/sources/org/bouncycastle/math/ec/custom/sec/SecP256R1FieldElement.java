package org.bouncycastle.math.ec.custom.sec;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecP256R1FieldElement extends ECFieldElement.AbstractFp {

    /* renamed from: Q, reason: collision with root package name */
    public static final BigInteger f19254Q = new BigInteger(1, Hex.decodeStrict(StubApp.getString2(27200)));

    /* renamed from: x, reason: collision with root package name */
    protected int[] f19255x;

    public SecP256R1FieldElement() {
        this.f19255x = Nat256.create();
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] create = Nat256.create();
        SecP256R1Field.add(this.f19255x, ((SecP256R1FieldElement) eCFieldElement).f19255x, create);
        return new SecP256R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] create = Nat256.create();
        SecP256R1Field.addOne(this.f19255x, create);
        return new SecP256R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] create = Nat256.create();
        SecP256R1Field.inv(((SecP256R1FieldElement) eCFieldElement).f19255x, create);
        SecP256R1Field.multiply(create, this.f19255x, create);
        return new SecP256R1FieldElement(create);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP256R1FieldElement) {
            return Nat256.eq(this.f19255x, ((SecP256R1FieldElement) obj).f19255x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return StubApp.getString2(32967);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return f19254Q.bitLength();
    }

    public int hashCode() {
        return f19254Q.hashCode() ^ Arrays.hashCode(this.f19255x, 0, 8);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] create = Nat256.create();
        SecP256R1Field.inv(this.f19255x, create);
        return new SecP256R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return Nat256.isOne(this.f19255x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return Nat256.isZero(this.f19255x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] create = Nat256.create();
        SecP256R1Field.multiply(this.f19255x, ((SecP256R1FieldElement) eCFieldElement).f19255x, create);
        return new SecP256R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] create = Nat256.create();
        SecP256R1Field.negate(this.f19255x, create);
        return new SecP256R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f19255x;
        if (Nat256.isZero(iArr) || Nat256.isOne(iArr)) {
            return this;
        }
        int[] createExt = Nat256.createExt();
        int[] create = Nat256.create();
        int[] create2 = Nat256.create();
        SecP256R1Field.square(iArr, create, createExt);
        SecP256R1Field.multiply(create, iArr, create, createExt);
        SecP256R1Field.squareN(create, 2, create2, createExt);
        SecP256R1Field.multiply(create2, create, create2, createExt);
        SecP256R1Field.squareN(create2, 4, create, createExt);
        SecP256R1Field.multiply(create, create2, create, createExt);
        SecP256R1Field.squareN(create, 8, create2, createExt);
        SecP256R1Field.multiply(create2, create, create2, createExt);
        SecP256R1Field.squareN(create2, 16, create, createExt);
        SecP256R1Field.multiply(create, create2, create, createExt);
        SecP256R1Field.squareN(create, 32, create, createExt);
        SecP256R1Field.multiply(create, iArr, create, createExt);
        SecP256R1Field.squareN(create, 96, create, createExt);
        SecP256R1Field.multiply(create, iArr, create, createExt);
        SecP256R1Field.squareN(create, 94, create, createExt);
        SecP256R1Field.square(create, create2, createExt);
        if (Nat256.eq(iArr, create2)) {
            return new SecP256R1FieldElement(create);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] create = Nat256.create();
        SecP256R1Field.square(this.f19255x, create);
        return new SecP256R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] create = Nat256.create();
        SecP256R1Field.subtract(this.f19255x, ((SecP256R1FieldElement) eCFieldElement).f19255x, create);
        return new SecP256R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return Nat256.getBit(this.f19255x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat256.toBigInteger(this.f19255x);
    }

    public SecP256R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f19254Q) >= 0) {
            throw new IllegalArgumentException(StubApp.getString2(32966));
        }
        this.f19255x = SecP256R1Field.fromBigInteger(bigInteger);
    }

    public SecP256R1FieldElement(int[] iArr) {
        this.f19255x = iArr;
    }
}
