package org.bouncycastle.pqc.legacy.math.linearalgebra;

import com.stub.StubApp;
import java.security.SecureRandom;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GF2nPolynomialField extends GF2nField {
    private boolean isPentanomial;
    private boolean isTrinomial;

    /* renamed from: pc, reason: collision with root package name */
    private int[] f19558pc;
    GF2Polynomial[] squaringMatrix;

    /* renamed from: tc, reason: collision with root package name */
    private int f19559tc;

    public GF2nPolynomialField(int i3, SecureRandom secureRandom) {
        super(secureRandom);
        this.isTrinomial = false;
        this.isPentanomial = false;
        this.f19558pc = new int[3];
        if (i3 < 3) {
            throw new IllegalArgumentException(StubApp.getString2(34858));
        }
        this.mDegree = i3;
        computeFieldPolynomial();
        computeSquaringMatrix();
        this.fields = new java.util.Vector();
        this.matrices = new java.util.Vector();
    }

    private void computeSquaringMatrix() {
        int i3 = this.mDegree;
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[i3 - 1];
        this.squaringMatrix = new GF2Polynomial[i3];
        int i10 = 0;
        while (true) {
            GF2Polynomial[] gF2PolynomialArr2 = this.squaringMatrix;
            if (i10 >= gF2PolynomialArr2.length) {
                break;
            }
            gF2PolynomialArr2[i10] = new GF2Polynomial(this.mDegree, StubApp.getString2(34812));
            i10++;
        }
        for (int i11 = 0; i11 < this.mDegree - 1; i11++) {
            gF2PolynomialArr[i11] = new GF2Polynomial(1, StubApp.getString2(34813)).shiftLeft(this.mDegree + i11).remainder(this.fieldPolynomial);
        }
        for (int i12 = 1; i12 <= Math.abs(this.mDegree >> 1); i12++) {
            int i13 = 1;
            while (true) {
                int i14 = this.mDegree;
                if (i13 <= i14) {
                    if (gF2PolynomialArr[i14 - (i12 << 1)].testBit(i14 - i13)) {
                        this.squaringMatrix[i13 - 1].setBit(this.mDegree - i12);
                    }
                    i13++;
                }
            }
        }
        int abs = Math.abs(this.mDegree >> 1) + 1;
        while (true) {
            int i15 = this.mDegree;
            if (abs > i15) {
                return;
            }
            this.squaringMatrix[((abs << 1) - i15) - 1].setBit(i15 - abs);
            abs++;
        }
    }

    private boolean testPentanomials() {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree + 1);
        this.fieldPolynomial = gF2Polynomial;
        gF2Polynomial.setBit(0);
        this.fieldPolynomial.setBit(this.mDegree);
        boolean z2 = false;
        int i3 = 1;
        while (i3 <= this.mDegree - 3 && !z2) {
            this.fieldPolynomial.setBit(i3);
            int i10 = i3 + 1;
            int i11 = i10;
            while (i11 <= this.mDegree - 2 && !z2) {
                this.fieldPolynomial.setBit(i11);
                int i12 = i11 + 1;
                for (int i13 = i12; i13 <= this.mDegree - 1 && !z2; i13++) {
                    this.fieldPolynomial.setBit(i13);
                    if (((((this.mDegree & 1) != 0) | ((i3 & 1) != 0) | ((i11 & 1) != 0)) || ((i13 & 1) != 0)) && (z2 = this.fieldPolynomial.isIrreducible())) {
                        this.isPentanomial = true;
                        int[] iArr = this.f19558pc;
                        iArr[0] = i3;
                        iArr[1] = i11;
                        iArr[2] = i13;
                        return z2;
                    }
                    this.fieldPolynomial.resetBit(i13);
                }
                this.fieldPolynomial.resetBit(i11);
                i11 = i12;
            }
            this.fieldPolynomial.resetBit(i3);
            i3 = i10;
        }
        return z2;
    }

    private boolean testRandom() {
        this.fieldPolynomial = new GF2Polynomial(this.mDegree + 1);
        do {
            this.fieldPolynomial.randomize();
            this.fieldPolynomial.setBit(this.mDegree);
            this.fieldPolynomial.setBit(0);
        } while (!this.fieldPolynomial.isIrreducible());
        return true;
    }

    private boolean testTrinomials() {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree + 1);
        this.fieldPolynomial = gF2Polynomial;
        boolean z2 = false;
        gF2Polynomial.setBit(0);
        this.fieldPolynomial.setBit(this.mDegree);
        for (int i3 = 1; i3 < this.mDegree && !z2; i3++) {
            this.fieldPolynomial.setBit(i3);
            boolean isIrreducible = this.fieldPolynomial.isIrreducible();
            if (isIrreducible) {
                this.isTrinomial = true;
                this.f19559tc = i3;
                return isIrreducible;
            }
            this.fieldPolynomial.resetBit(i3);
            z2 = this.fieldPolynomial.isIrreducible();
        }
        return z2;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nField
    public void computeCOBMatrix(GF2nField gF2nField) {
        GF2nElement randomRoot;
        GF2nElement[] gF2nElementArr;
        int i3 = this.mDegree;
        if (i3 != gF2nField.mDegree) {
            throw new IllegalArgumentException(StubApp.getString2(34869));
        }
        boolean z2 = gF2nField instanceof GF2nONBField;
        if (z2) {
            gF2nField.computeCOBMatrix(this);
            return;
        }
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[i3];
        for (int i10 = 0; i10 < this.mDegree; i10++) {
            gF2PolynomialArr[i10] = new GF2Polynomial(this.mDegree);
        }
        do {
            randomRoot = gF2nField.getRandomRoot(this.fieldPolynomial);
        } while (randomRoot.isZero());
        if (randomRoot instanceof GF2nONBElement) {
            int i11 = this.mDegree;
            gF2nElementArr = new GF2nONBElement[i11];
            gF2nElementArr[i11 - 1] = GF2nONBElement.ONE((GF2nONBField) gF2nField);
        } else {
            int i12 = this.mDegree;
            gF2nElementArr = new GF2nPolynomialElement[i12];
            gF2nElementArr[i12 - 1] = GF2nPolynomialElement.ONE((GF2nPolynomialField) gF2nField);
        }
        int i13 = this.mDegree;
        gF2nElementArr[i13 - 2] = randomRoot;
        for (int i14 = i13 - 3; i14 >= 0; i14--) {
            gF2nElementArr[i14] = (GF2nElement) gF2nElementArr[i14 + 1].multiply(randomRoot);
        }
        if (z2) {
            for (int i15 = 0; i15 < this.mDegree; i15++) {
                int i16 = 0;
                while (true) {
                    if (i16 < this.mDegree) {
                        if (gF2nElementArr[i15].testBit((r4 - i16) - 1)) {
                            int i17 = this.mDegree;
                            gF2PolynomialArr[(i17 - i16) - 1].setBit((i17 - i15) - 1);
                        }
                        i16++;
                    }
                }
            }
        } else {
            for (int i18 = 0; i18 < this.mDegree; i18++) {
                for (int i19 = 0; i19 < this.mDegree; i19++) {
                    if (gF2nElementArr[i18].testBit(i19)) {
                        int i20 = this.mDegree;
                        gF2PolynomialArr[(i20 - i19) - 1].setBit((i20 - i18) - 1);
                    }
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
        if (testTrinomials() || testPentanomials()) {
            return;
        }
        testRandom();
    }

    public void computeFieldPolynomial2() {
        if (testTrinomials() || testPentanomials()) {
            return;
        }
        testRandom();
    }

    public int[] getPc() throws RuntimeException {
        if (!this.isPentanomial) {
            throw new RuntimeException();
        }
        int[] iArr = new int[3];
        System.arraycopy(this.f19558pc, 0, iArr, 0, 3);
        return iArr;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nField
    public GF2nElement getRandomRoot(GF2Polynomial gF2Polynomial) {
        GF2nPolynomial gcd;
        int degree;
        int degree2;
        GF2nPolynomial gF2nPolynomial = new GF2nPolynomial(gF2Polynomial, this);
        while (gF2nPolynomial.getDegree() > 1) {
            while (true) {
                GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this, this.random);
                GF2nPolynomial gF2nPolynomial2 = new GF2nPolynomial(2, GF2nPolynomialElement.ZERO(this));
                gF2nPolynomial2.set(1, gF2nPolynomialElement);
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

    public GF2Polynomial getSquaringVector(int i3) {
        return new GF2Polynomial(this.squaringMatrix[i3]);
    }

    public int getTc() throws RuntimeException {
        if (this.isTrinomial) {
            return this.f19559tc;
        }
        throw new RuntimeException();
    }

    public boolean isPentanomial() {
        return this.isPentanomial;
    }

    public boolean isTrinomial() {
        return this.isTrinomial;
    }

    public GF2nPolynomialField(int i3, SecureRandom secureRandom, GF2Polynomial gF2Polynomial) throws RuntimeException {
        super(secureRandom);
        this.isTrinomial = false;
        this.isPentanomial = false;
        this.f19558pc = new int[3];
        if (i3 < 3) {
            throw new IllegalArgumentException(StubApp.getString2(34868));
        }
        if (gF2Polynomial.getLength() != i3 + 1) {
            throw new RuntimeException();
        }
        if (!gF2Polynomial.isIrreducible()) {
            throw new RuntimeException();
        }
        this.mDegree = i3;
        this.fieldPolynomial = gF2Polynomial;
        computeSquaringMatrix();
        int i10 = 2;
        for (int i11 = 1; i11 < this.fieldPolynomial.getLength() - 1; i11++) {
            if (this.fieldPolynomial.testBit(i11)) {
                int i12 = i10 + 1;
                if (i12 == 3) {
                    this.f19559tc = i11;
                }
                if (i12 <= 5) {
                    this.f19558pc[i10 - 2] = i11;
                }
                i10 = i12;
            }
        }
        if (i10 == 3) {
            this.isTrinomial = true;
        }
        if (i10 == 5) {
            this.isPentanomial = true;
        }
        this.fields = new java.util.Vector();
        this.matrices = new java.util.Vector();
    }

    public GF2nPolynomialField(int i3, SecureRandom secureRandom, boolean z2) {
        super(secureRandom);
        this.isTrinomial = false;
        this.isPentanomial = false;
        this.f19558pc = new int[3];
        if (i3 < 3) {
            throw new IllegalArgumentException(StubApp.getString2(34858));
        }
        this.mDegree = i3;
        if (z2) {
            computeFieldPolynomial();
        } else {
            computeFieldPolynomial2();
        }
        computeSquaringMatrix();
        this.fields = new java.util.Vector();
        this.matrices = new java.util.Vector();
    }
}
