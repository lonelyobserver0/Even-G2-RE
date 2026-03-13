package org.bouncycastle.pqc.legacy.math.linearalgebra;

import com.stub.StubApp;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Random;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GF2nONBField extends GF2nField {
    private static final int MAXLONG = 64;
    private int mBit;
    private int mLength;
    int[][] mMult;
    private int mType;

    public GF2nONBField(int i3, SecureRandom secureRandom) throws RuntimeException {
        super(secureRandom);
        if (i3 < 3) {
            throw new IllegalArgumentException(StubApp.getString2(34858));
        }
        this.mDegree = i3;
        int i10 = i3 / 64;
        this.mLength = i10;
        int i11 = i3 & 63;
        this.mBit = i11;
        if (i11 == 0) {
            this.mBit = 64;
        } else {
            this.mLength = i10 + 1;
        }
        computeType();
        if (this.mType >= 3) {
            throw new RuntimeException(StubApp.getString2(34857) + this.mType);
        }
        this.mMult = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.mDegree, 2);
        for (int i12 = 0; i12 < this.mDegree; i12++) {
            int[] iArr = this.mMult[i12];
            iArr[0] = -1;
            iArr[1] = -1;
        }
        computeMultMatrix();
        computeFieldPolynomial();
        this.fields = new java.util.Vector();
        this.matrices = new java.util.Vector();
    }

    private void computeMultMatrix() {
        int i3;
        int i10 = this.mType;
        if ((i10 & 7) == 0) {
            throw new RuntimeException(StubApp.getString2(34860));
        }
        int i11 = this.mDegree * i10;
        int i12 = i11 + 1;
        int[] iArr = new int[i12];
        int elementOfOrder = i10 == 1 ? 1 : i10 == 2 ? i11 : elementOfOrder(i10, i12);
        int i13 = 1;
        int i14 = 0;
        while (true) {
            i3 = this.mType;
            if (i14 >= i3) {
                break;
            }
            int i15 = i13;
            for (int i16 = 0; i16 < this.mDegree; i16++) {
                iArr[i15] = i16;
                i15 = (i15 << 1) % i12;
                if (i15 < 0) {
                    i15 += i12;
                }
            }
            i13 = (i13 * elementOfOrder) % i12;
            if (i13 < 0) {
                i13 += i12;
            }
            i14++;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new RuntimeException(StubApp.getString2(34859));
            }
            int i17 = 1;
            while (i17 < i11) {
                int i18 = i17 + 1;
                int[] iArr2 = this.mMult[iArr[i18]];
                int i19 = i12 - i17;
                if (iArr2[0] == -1) {
                    iArr2[0] = iArr[i19];
                } else {
                    iArr2[1] = iArr[i19];
                }
                i17 = i18;
            }
            return;
        }
        int i20 = 1;
        while (i20 < i11) {
            int i21 = i20 + 1;
            int[] iArr3 = this.mMult[iArr[i21]];
            int i22 = i12 - i20;
            if (iArr3[0] == -1) {
                iArr3[0] = iArr[i22];
            } else {
                iArr3[1] = iArr[i22];
            }
            i20 = i21;
        }
        int i23 = this.mDegree >> 1;
        for (int i24 = 1; i24 <= i23; i24++) {
            int[][] iArr4 = this.mMult;
            int i25 = i24 - 1;
            int[] iArr5 = iArr4[i25];
            if (iArr5[0] == -1) {
                iArr5[0] = (i23 + i24) - 1;
            } else {
                iArr5[1] = (i23 + i24) - 1;
            }
            int[] iArr6 = iArr4[(i23 + i24) - 1];
            if (iArr6[0] == -1) {
                iArr6[0] = i25;
            } else {
                iArr6[1] = i25;
            }
        }
    }

    private void computeType() throws RuntimeException {
        if ((this.mDegree & 7) == 0) {
            throw new RuntimeException(StubApp.getString2(34861));
        }
        this.mType = 1;
        int i3 = 0;
        while (i3 != 1) {
            int i10 = (this.mType * this.mDegree) + 1;
            if (IntegerFunctions.isPrime(i10)) {
                int order = IntegerFunctions.order(2, i10);
                int i11 = this.mType;
                int i12 = this.mDegree;
                i3 = IntegerFunctions.gcd((i11 * i12) / order, i12);
            }
            this.mType++;
        }
        int i13 = this.mType - 1;
        this.mType = i13;
        if (i13 == 1) {
            int i14 = (this.mDegree << 1) + 1;
            if (IntegerFunctions.isPrime(i14)) {
                int order2 = IntegerFunctions.order(2, i14);
                int i15 = this.mDegree;
                if (IntegerFunctions.gcd((i15 << 1) / order2, i15) == 1) {
                    this.mType++;
                }
            }
        }
    }

    private int elementOfOrder(int i3, int i10) {
        int order;
        Random random = new Random();
        int i11 = 0;
        while (i11 == 0) {
            int i12 = i10 - 1;
            i11 = random.nextInt() % i12;
            if (i11 < 0) {
                i11 += i12;
            }
        }
        while (true) {
            order = IntegerFunctions.order(i11, i10);
            if (order % i3 == 0 && order != 0) {
                break;
            }
            while (i11 == 0) {
                int i13 = i10 - 1;
                i11 = random.nextInt() % i13;
                if (i11 < 0) {
                    i11 += i13;
                }
            }
        }
        int i14 = i11;
        for (int i15 = 2; i15 <= i3 / order; i15++) {
            i14 *= i11;
        }
        return i14;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nField
    public void computeCOBMatrix(GF2nField gF2nField) {
        GF2nElement randomRoot;
        int i3 = this.mDegree;
        if (i3 != gF2nField.mDegree) {
            throw new IllegalArgumentException(StubApp.getString2(34862));
        }
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[i3];
        for (int i10 = 0; i10 < this.mDegree; i10++) {
            gF2PolynomialArr[i10] = new GF2Polynomial(this.mDegree);
        }
        do {
            randomRoot = gF2nField.getRandomRoot(this.fieldPolynomial);
        } while (randomRoot.isZero());
        GF2nElement[] gF2nElementArr = new GF2nPolynomialElement[this.mDegree];
        gF2nElementArr[0] = (GF2nElement) randomRoot.clone();
        for (int i11 = 1; i11 < this.mDegree; i11++) {
            gF2nElementArr[i11] = gF2nElementArr[i11 - 1].square();
        }
        for (int i12 = 0; i12 < this.mDegree; i12++) {
            for (int i13 = 0; i13 < this.mDegree; i13++) {
                if (gF2nElementArr[i12].testBit(i13)) {
                    int i14 = this.mDegree;
                    gF2PolynomialArr[(i14 - i13) - 1].setBit((i14 - i12) - 1);
                }
            }
        }
        this.fields.addElement(gF2nField);
        this.matrices.addElement(gF2PolynomialArr);
        gF2nField.fields.addElement(this);
        gF2nField.matrices.addElement(invertMatrix(gF2PolynomialArr));
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nField
    public void computeFieldPolynomial() {
        int i3 = this.mType;
        if (i3 == 1) {
            this.fieldPolynomial = new GF2Polynomial(this.mDegree + 1, StubApp.getString2(10228));
            return;
        }
        if (i3 == 2) {
            GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree + 1, StubApp.getString2(34813));
            GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.mDegree + 1, StubApp.getString2(4926));
            gF2Polynomial2.addToThis(gF2Polynomial);
            GF2Polynomial gF2Polynomial3 = gF2Polynomial;
            GF2Polynomial gF2Polynomial4 = gF2Polynomial2;
            int i10 = 1;
            while (i10 < this.mDegree) {
                GF2Polynomial shiftLeft = gF2Polynomial4.shiftLeft();
                shiftLeft.addToThis(gF2Polynomial3);
                i10++;
                gF2Polynomial3 = gF2Polynomial4;
                gF2Polynomial4 = shiftLeft;
            }
            this.fieldPolynomial = gF2Polynomial4;
        }
    }

    public int getONBBit() {
        return this.mBit;
    }

    public int getONBLength() {
        return this.mLength;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nField
    public GF2nElement getRandomRoot(GF2Polynomial gF2Polynomial) {
        GF2nPolynomial gcd;
        int degree;
        int degree2;
        GF2nPolynomial gF2nPolynomial = new GF2nPolynomial(gF2Polynomial, this);
        while (gF2nPolynomial.getDegree() > 1) {
            while (true) {
                GF2nONBElement gF2nONBElement = new GF2nONBElement(this, this.random);
                GF2nPolynomial gF2nPolynomial2 = new GF2nPolynomial(2, GF2nONBElement.ZERO(this));
                gF2nPolynomial2.set(1, gF2nONBElement);
                GF2nPolynomial gF2nPolynomial3 = new GF2nPolynomial(gF2nPolynomial2);
                for (int i3 = 1; i3 <= this.mDegree - 1; i3++) {
                    gF2nPolynomial3 = gF2nPolynomial3.multiplyAndReduce(gF2nPolynomial3, gF2nPolynomial).add(gF2nPolynomial2);
                }
                gcd = gF2nPolynomial3.gcd(gF2nPolynomial);
                degree = gcd.getDegree();
                degree2 = gF2nPolynomial.getDegree();
                if (degree != 0 && degree != degree2) {
                    break;
                }
            }
            gF2nPolynomial = (degree << 1) > degree2 ? gF2nPolynomial.quotient(gcd) : new GF2nPolynomial(gcd);
        }
        return gF2nPolynomial.at(0);
    }

    public int[][] invMatrix(int[][] iArr) {
        int i3 = this.mDegree;
        int[] iArr2 = {i3, i3};
        Class cls = Integer.TYPE;
        int i10 = this.mDegree;
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) cls, i10, i10);
        for (int i11 = 0; i11 < this.mDegree; i11++) {
            iArr3[i11][i11] = 1;
        }
        for (int i12 = 0; i12 < this.mDegree; i12++) {
            int i13 = i12;
            while (true) {
                int i14 = this.mDegree;
                if (i13 < i14) {
                    iArr[(i14 - 1) - i12][i13] = iArr[i12][i12];
                    i13++;
                }
            }
        }
        return null;
    }
}
