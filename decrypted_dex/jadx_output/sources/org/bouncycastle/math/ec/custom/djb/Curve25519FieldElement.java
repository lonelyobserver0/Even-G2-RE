package org.bouncycastle.math.ec.custom.djb;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Curve25519FieldElement extends ECFieldElement.AbstractFp {

    /* renamed from: x, reason: collision with root package name */
    protected int[] f19200x;

    /* renamed from: Q, reason: collision with root package name */
    public static final BigInteger f19199Q = Nat256.toBigInteger(Curve25519Field.f19197P);
    private static final int[] PRECOMP_POW2 = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};

    public Curve25519FieldElement() {
        this.f19200x = Nat256.create();
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] create = Nat256.create();
        Curve25519Field.add(this.f19200x, ((Curve25519FieldElement) eCFieldElement).f19200x, create);
        return new Curve25519FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] create = Nat256.create();
        Curve25519Field.addOne(this.f19200x, create);
        return new Curve25519FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] create = Nat256.create();
        Curve25519Field.inv(((Curve25519FieldElement) eCFieldElement).f19200x, create);
        Curve25519Field.multiply(create, this.f19200x, create);
        return new Curve25519FieldElement(create);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Curve25519FieldElement) {
            return Nat256.eq(this.f19200x, ((Curve25519FieldElement) obj).f19200x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return StubApp.getString2(32947);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return f19199Q.bitLength();
    }

    public int hashCode() {
        return f19199Q.hashCode() ^ Arrays.hashCode(this.f19200x, 0, 8);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] create = Nat256.create();
        Curve25519Field.inv(this.f19200x, create);
        return new Curve25519FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return Nat256.isOne(this.f19200x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return Nat256.isZero(this.f19200x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] create = Nat256.create();
        Curve25519Field.multiply(this.f19200x, ((Curve25519FieldElement) eCFieldElement).f19200x, create);
        return new Curve25519FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] create = Nat256.create();
        Curve25519Field.negate(this.f19200x, create);
        return new Curve25519FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f19200x;
        if (Nat256.isZero(iArr) || Nat256.isOne(iArr)) {
            return this;
        }
        int[] create = Nat256.create();
        Curve25519Field.square(iArr, create);
        Curve25519Field.multiply(create, iArr, create);
        Curve25519Field.square(create, create);
        Curve25519Field.multiply(create, iArr, create);
        int[] create2 = Nat256.create();
        Curve25519Field.square(create, create2);
        Curve25519Field.multiply(create2, iArr, create2);
        int[] create3 = Nat256.create();
        Curve25519Field.squareN(create2, 3, create3);
        Curve25519Field.multiply(create3, create, create3);
        Curve25519Field.squareN(create3, 4, create);
        Curve25519Field.multiply(create, create2, create);
        Curve25519Field.squareN(create, 4, create3);
        Curve25519Field.multiply(create3, create2, create3);
        Curve25519Field.squareN(create3, 15, create2);
        Curve25519Field.multiply(create2, create3, create2);
        Curve25519Field.squareN(create2, 30, create3);
        Curve25519Field.multiply(create3, create2, create3);
        Curve25519Field.squareN(create3, 60, create2);
        Curve25519Field.multiply(create2, create3, create2);
        Curve25519Field.squareN(create2, 11, create3);
        Curve25519Field.multiply(create3, create, create3);
        Curve25519Field.squareN(create3, 120, create);
        Curve25519Field.multiply(create, create2, create);
        Curve25519Field.square(create, create);
        Curve25519Field.square(create, create2);
        if (Nat256.eq(iArr, create2)) {
            return new Curve25519FieldElement(create);
        }
        Curve25519Field.multiply(create, PRECOMP_POW2, create);
        Curve25519Field.square(create, create2);
        if (Nat256.eq(iArr, create2)) {
            return new Curve25519FieldElement(create);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] create = Nat256.create();
        Curve25519Field.square(this.f19200x, create);
        return new Curve25519FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] create = Nat256.create();
        Curve25519Field.subtract(this.f19200x, ((Curve25519FieldElement) eCFieldElement).f19200x, create);
        return new Curve25519FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return Nat256.getBit(this.f19200x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat256.toBigInteger(this.f19200x);
    }

    public Curve25519FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f19199Q) >= 0) {
            throw new IllegalArgumentException(StubApp.getString2(32946));
        }
        this.f19200x = Curve25519Field.fromBigInteger(bigInteger);
    }

    public Curve25519FieldElement(int[] iArr) {
        this.f19200x = iArr;
    }
}
