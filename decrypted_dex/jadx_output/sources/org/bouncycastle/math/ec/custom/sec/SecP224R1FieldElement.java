package org.bouncycastle.math.ec.custom.sec;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat224;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecP224R1FieldElement extends ECFieldElement.AbstractFp {

    /* renamed from: Q, reason: collision with root package name */
    public static final BigInteger f19243Q = new BigInteger(1, Hex.decodeStrict(StubApp.getString2(27184)));

    /* renamed from: x, reason: collision with root package name */
    protected int[] f19244x;

    public SecP224R1FieldElement() {
        this.f19244x = Nat224.create();
    }

    private static void RM(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7) {
        SecP224R1Field.multiply(iArr5, iArr3, iArr7);
        SecP224R1Field.multiply(iArr7, iArr, iArr7);
        SecP224R1Field.multiply(iArr4, iArr2, iArr6);
        SecP224R1Field.add(iArr6, iArr7, iArr6);
        SecP224R1Field.multiply(iArr4, iArr3, iArr7);
        Nat224.copy(iArr6, iArr4);
        SecP224R1Field.multiply(iArr5, iArr2, iArr5);
        SecP224R1Field.add(iArr5, iArr7, iArr5);
        SecP224R1Field.square(iArr5, iArr6);
        SecP224R1Field.multiply(iArr6, iArr, iArr6);
    }

    private static void RP(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        Nat224.copy(iArr, iArr4);
        int[] create = Nat224.create();
        int[] create2 = Nat224.create();
        for (int i3 = 0; i3 < 7; i3++) {
            Nat224.copy(iArr2, create);
            Nat224.copy(iArr3, create2);
            int i10 = 1 << i3;
            while (true) {
                i10--;
                if (i10 >= 0) {
                    RS(iArr2, iArr3, iArr4, iArr5);
                }
            }
            RM(iArr, create, create2, iArr2, iArr3, iArr4, iArr5);
        }
    }

    private static void RS(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        SecP224R1Field.multiply(iArr2, iArr, iArr2);
        SecP224R1Field.twice(iArr2, iArr2);
        SecP224R1Field.square(iArr, iArr4);
        SecP224R1Field.add(iArr3, iArr4, iArr);
        SecP224R1Field.multiply(iArr3, iArr4, iArr3);
        SecP224R1Field.reduce32(Nat.shiftUpBits(7, iArr3, 2, 0), iArr3);
    }

    private static boolean isSquare(int[] iArr) {
        int[] create = Nat224.create();
        int[] create2 = Nat224.create();
        Nat224.copy(iArr, create);
        for (int i3 = 0; i3 < 7; i3++) {
            Nat224.copy(create, create2);
            SecP224R1Field.squareN(create, 1 << i3, create);
            SecP224R1Field.multiply(create, create2, create);
        }
        SecP224R1Field.squareN(create, 95, create);
        return Nat224.isOne(create);
    }

    private static boolean trySqrt(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] create = Nat224.create();
        Nat224.copy(iArr2, create);
        int[] create2 = Nat224.create();
        create2[0] = 1;
        int[] create3 = Nat224.create();
        RP(iArr, create, create2, create3, iArr3);
        int[] create4 = Nat224.create();
        int[] create5 = Nat224.create();
        for (int i3 = 1; i3 < 96; i3++) {
            Nat224.copy(create, create4);
            Nat224.copy(create2, create5);
            RS(create, create2, create3, iArr3);
            if (Nat224.isZero(create)) {
                SecP224R1Field.inv(create5, iArr3);
                SecP224R1Field.multiply(iArr3, create4, iArr3);
                return true;
            }
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] create = Nat224.create();
        SecP224R1Field.add(this.f19244x, ((SecP224R1FieldElement) eCFieldElement).f19244x, create);
        return new SecP224R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] create = Nat224.create();
        SecP224R1Field.addOne(this.f19244x, create);
        return new SecP224R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] create = Nat224.create();
        SecP224R1Field.inv(((SecP224R1FieldElement) eCFieldElement).f19244x, create);
        SecP224R1Field.multiply(create, this.f19244x, create);
        return new SecP224R1FieldElement(create);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP224R1FieldElement) {
            return Nat224.eq(this.f19244x, ((SecP224R1FieldElement) obj).f19244x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return StubApp.getString2(32963);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return f19243Q.bitLength();
    }

    public int hashCode() {
        return f19243Q.hashCode() ^ Arrays.hashCode(this.f19244x, 0, 7);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] create = Nat224.create();
        SecP224R1Field.inv(this.f19244x, create);
        return new SecP224R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return Nat224.isOne(this.f19244x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return Nat224.isZero(this.f19244x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] create = Nat224.create();
        SecP224R1Field.multiply(this.f19244x, ((SecP224R1FieldElement) eCFieldElement).f19244x, create);
        return new SecP224R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] create = Nat224.create();
        SecP224R1Field.negate(this.f19244x, create);
        return new SecP224R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f19244x;
        if (Nat224.isZero(iArr) || Nat224.isOne(iArr)) {
            return this;
        }
        int[] create = Nat224.create();
        SecP224R1Field.negate(iArr, create);
        int[] random = Mod.random(SecP224R1Field.f19241P);
        int[] create2 = Nat224.create();
        if (!isSquare(iArr)) {
            return null;
        }
        while (!trySqrt(create, random, create2)) {
            SecP224R1Field.addOne(random, random);
        }
        SecP224R1Field.square(create2, random);
        if (Nat224.eq(iArr, random)) {
            return new SecP224R1FieldElement(create2);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] create = Nat224.create();
        SecP224R1Field.square(this.f19244x, create);
        return new SecP224R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] create = Nat224.create();
        SecP224R1Field.subtract(this.f19244x, ((SecP224R1FieldElement) eCFieldElement).f19244x, create);
        return new SecP224R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return Nat224.getBit(this.f19244x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat224.toBigInteger(this.f19244x);
    }

    public SecP224R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f19243Q) >= 0) {
            throw new IllegalArgumentException(StubApp.getString2(32962));
        }
        this.f19244x = SecP224R1Field.fromBigInteger(bigInteger);
    }

    public SecP224R1FieldElement(int[] iArr) {
        this.f19244x = iArr;
    }
}
