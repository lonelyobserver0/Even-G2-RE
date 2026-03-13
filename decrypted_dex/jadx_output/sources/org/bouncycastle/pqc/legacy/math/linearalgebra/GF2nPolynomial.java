package org.bouncycastle.pqc.legacy.math.linearalgebra;

import com.stub.StubApp;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GF2nPolynomial {
    private GF2nElement[] coeff;
    private int size;

    private GF2nPolynomial(int i3) {
        this.size = i3;
        this.coeff = new GF2nElement[i3];
    }

    public final GF2nPolynomial add(GF2nPolynomial gF2nPolynomial) {
        int i3 = 0;
        if (size() >= gF2nPolynomial.size()) {
            GF2nPolynomial gF2nPolynomial2 = new GF2nPolynomial(size());
            while (i3 < gF2nPolynomial.size()) {
                gF2nPolynomial2.coeff[i3] = (GF2nElement) this.coeff[i3].add(gF2nPolynomial.coeff[i3]);
                i3++;
            }
            while (i3 < size()) {
                gF2nPolynomial2.coeff[i3] = this.coeff[i3];
                i3++;
            }
            return gF2nPolynomial2;
        }
        GF2nPolynomial gF2nPolynomial3 = new GF2nPolynomial(gF2nPolynomial.size());
        while (i3 < size()) {
            gF2nPolynomial3.coeff[i3] = (GF2nElement) this.coeff[i3].add(gF2nPolynomial.coeff[i3]);
            i3++;
        }
        while (i3 < gF2nPolynomial.size()) {
            gF2nPolynomial3.coeff[i3] = gF2nPolynomial.coeff[i3];
            i3++;
        }
        return gF2nPolynomial3;
    }

    public final void assignZeroToElements() {
        for (int i3 = 0; i3 < this.size; i3++) {
            this.coeff[i3].assignZero();
        }
    }

    public final GF2nElement at(int i3) {
        return this.coeff[i3];
    }

    public final GF2nPolynomial[] divide(GF2nPolynomial gF2nPolynomial) {
        GF2nPolynomial gF2nPolynomial2;
        GF2nPolynomial[] gF2nPolynomialArr = new GF2nPolynomial[2];
        GF2nPolynomial gF2nPolynomial3 = new GF2nPolynomial(this);
        gF2nPolynomial3.shrink();
        int degree = gF2nPolynomial.getDegree();
        GF2nElement gF2nElement = (GF2nElement) gF2nPolynomial.coeff[degree].invert();
        if (gF2nPolynomial3.getDegree() < degree) {
            GF2nPolynomial gF2nPolynomial4 = new GF2nPolynomial(this);
            gF2nPolynomialArr[0] = gF2nPolynomial4;
            gF2nPolynomial4.assignZeroToElements();
            gF2nPolynomialArr[0].shrink();
            gF2nPolynomial2 = new GF2nPolynomial(this);
            gF2nPolynomialArr[1] = gF2nPolynomial2;
        } else {
            GF2nPolynomial gF2nPolynomial5 = new GF2nPolynomial(this);
            gF2nPolynomialArr[0] = gF2nPolynomial5;
            gF2nPolynomial5.assignZeroToElements();
            while (true) {
                int degree2 = gF2nPolynomial3.getDegree() - degree;
                if (degree2 < 0) {
                    break;
                }
                GF2nElement gF2nElement2 = (GF2nElement) gF2nPolynomial3.coeff[gF2nPolynomial3.getDegree()].multiply(gF2nElement);
                GF2nPolynomial scalarMultiply = gF2nPolynomial.scalarMultiply(gF2nElement2);
                scalarMultiply.shiftThisLeft(degree2);
                gF2nPolynomial3 = gF2nPolynomial3.add(scalarMultiply);
                gF2nPolynomial3.shrink();
                gF2nPolynomialArr[0].coeff[degree2] = (GF2nElement) gF2nElement2.clone();
            }
            gF2nPolynomialArr[1] = gF2nPolynomial3;
            gF2nPolynomial2 = gF2nPolynomialArr[0];
        }
        gF2nPolynomial2.shrink();
        return gF2nPolynomialArr;
    }

    public final void enlarge(int i3) {
        int i10 = this.size;
        if (i3 <= i10) {
            return;
        }
        GF2nElement[] gF2nElementArr = new GF2nElement[i3];
        System.arraycopy(this.coeff, 0, gF2nElementArr, 0, i10);
        GF2nField field = this.coeff[0].getField();
        GF2nElement gF2nElement = this.coeff[0];
        if (gF2nElement instanceof GF2nPolynomialElement) {
            for (int i11 = this.size; i11 < i3; i11++) {
                gF2nElementArr[i11] = GF2nPolynomialElement.ZERO((GF2nPolynomialField) field);
            }
        } else if (gF2nElement instanceof GF2nONBElement) {
            for (int i12 = this.size; i12 < i3; i12++) {
                gF2nElementArr[i12] = GF2nONBElement.ZERO((GF2nONBField) field);
            }
        }
        this.size = i3;
        this.coeff = gF2nElementArr;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof GF2nPolynomial)) {
            return false;
        }
        GF2nPolynomial gF2nPolynomial = (GF2nPolynomial) obj;
        if (getDegree() != gF2nPolynomial.getDegree()) {
            return false;
        }
        for (int i3 = 0; i3 < this.size; i3++) {
            if (!this.coeff[i3].equals(gF2nPolynomial.coeff[i3])) {
                return false;
            }
        }
        return true;
    }

    public final GF2nPolynomial gcd(GF2nPolynomial gF2nPolynomial) {
        GF2nPolynomial gF2nPolynomial2 = new GF2nPolynomial(this);
        GF2nPolynomial gF2nPolynomial3 = new GF2nPolynomial(gF2nPolynomial);
        gF2nPolynomial2.shrink();
        gF2nPolynomial3.shrink();
        GF2nPolynomial gF2nPolynomial4 = gF2nPolynomial2;
        GF2nPolynomial gF2nPolynomial5 = gF2nPolynomial3;
        while (!gF2nPolynomial5.isZero()) {
            GF2nPolynomial gF2nPolynomial6 = gF2nPolynomial5;
            gF2nPolynomial5 = gF2nPolynomial4.remainder(gF2nPolynomial5);
            gF2nPolynomial4 = gF2nPolynomial6;
        }
        return gF2nPolynomial4.scalarMultiply((GF2nElement) gF2nPolynomial4.coeff[gF2nPolynomial4.getDegree()].invert());
    }

    public final int getDegree() {
        for (int i3 = this.size - 1; i3 >= 0; i3--) {
            if (!this.coeff[i3].isZero()) {
                return i3;
            }
        }
        return -1;
    }

    public int hashCode() {
        return (getDegree() * 7) + Arrays.hashCode(this.coeff);
    }

    public final boolean isZero() {
        for (int i3 = 0; i3 < this.size; i3++) {
            GF2nElement gF2nElement = this.coeff[i3];
            if (gF2nElement != null && !gF2nElement.isZero()) {
                return false;
            }
        }
        return true;
    }

    public final GF2nPolynomial multiply(GF2nPolynomial gF2nPolynomial) {
        if (size() != gF2nPolynomial.size()) {
            throw new IllegalArgumentException(StubApp.getString2(34864));
        }
        GF2nPolynomial gF2nPolynomial2 = new GF2nPolynomial((r0 << 1) - 1);
        for (int i3 = 0; i3 < size(); i3++) {
            for (int i10 = 0; i10 < gF2nPolynomial.size(); i10++) {
                GF2nElement[] gF2nElementArr = gF2nPolynomial2.coeff;
                int i11 = i3 + i10;
                GF2nElement gF2nElement = gF2nElementArr[i11];
                if (gF2nElement == null) {
                    gF2nElementArr[i11] = (GF2nElement) this.coeff[i3].multiply(gF2nPolynomial.coeff[i10]);
                } else {
                    gF2nElementArr[i11] = (GF2nElement) gF2nElement.add(this.coeff[i3].multiply(gF2nPolynomial.coeff[i10]));
                }
            }
        }
        return gF2nPolynomial2;
    }

    public final GF2nPolynomial multiplyAndReduce(GF2nPolynomial gF2nPolynomial, GF2nPolynomial gF2nPolynomial2) {
        return multiply(gF2nPolynomial).reduce(gF2nPolynomial2);
    }

    public final GF2nPolynomial quotient(GF2nPolynomial gF2nPolynomial) throws RuntimeException, ArithmeticException {
        return divide(gF2nPolynomial)[0];
    }

    public final GF2nPolynomial reduce(GF2nPolynomial gF2nPolynomial) throws RuntimeException, ArithmeticException {
        return remainder(gF2nPolynomial);
    }

    public final GF2nPolynomial remainder(GF2nPolynomial gF2nPolynomial) throws RuntimeException, ArithmeticException {
        return divide(gF2nPolynomial)[1];
    }

    public final GF2nPolynomial scalarMultiply(GF2nElement gF2nElement) {
        GF2nPolynomial gF2nPolynomial = new GF2nPolynomial(size());
        for (int i3 = 0; i3 < size(); i3++) {
            gF2nPolynomial.coeff[i3] = (GF2nElement) this.coeff[i3].multiply(gF2nElement);
        }
        return gF2nPolynomial;
    }

    public final void set(int i3, GF2nElement gF2nElement) {
        if (!(gF2nElement instanceof GF2nPolynomialElement) && !(gF2nElement instanceof GF2nONBElement)) {
            throw new IllegalArgumentException(StubApp.getString2(34865));
        }
        this.coeff[i3] = (GF2nElement) gF2nElement.clone();
    }

    public final GF2nPolynomial shiftLeft(int i3) {
        if (i3 <= 0) {
            return new GF2nPolynomial(this);
        }
        GF2nPolynomial gF2nPolynomial = new GF2nPolynomial(this.size + i3, this.coeff[0]);
        gF2nPolynomial.assignZeroToElements();
        for (int i10 = 0; i10 < this.size; i10++) {
            gF2nPolynomial.coeff[i10 + i3] = this.coeff[i10];
        }
        return gF2nPolynomial;
    }

    public final void shiftThisLeft(int i3) {
        if (i3 > 0) {
            int i10 = this.size;
            GF2nField field = this.coeff[0].getField();
            enlarge(this.size + i3);
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                GF2nElement[] gF2nElementArr = this.coeff;
                gF2nElementArr[i11 + i3] = gF2nElementArr[i11];
            }
            GF2nElement gF2nElement = this.coeff[0];
            if (gF2nElement instanceof GF2nPolynomialElement) {
                for (int i12 = i3 - 1; i12 >= 0; i12--) {
                    this.coeff[i12] = GF2nPolynomialElement.ZERO((GF2nPolynomialField) field);
                }
                return;
            }
            if (gF2nElement instanceof GF2nONBElement) {
                for (int i13 = i3 - 1; i13 >= 0; i13--) {
                    this.coeff[i13] = GF2nONBElement.ZERO((GF2nONBField) field);
                }
            }
        }
    }

    public final void shrink() {
        int i3 = this.size;
        do {
            i3--;
            if (!this.coeff[i3].isZero()) {
                break;
            }
        } while (i3 > 0);
        int i10 = i3 + 1;
        if (i10 < this.size) {
            GF2nElement[] gF2nElementArr = new GF2nElement[i10];
            System.arraycopy(this.coeff, 0, gF2nElementArr, 0, i10);
            this.coeff = gF2nElementArr;
            this.size = i10;
        }
    }

    public final int size() {
        return this.size;
    }

    public GF2nPolynomial(int i3, GF2nElement gF2nElement) {
        this.size = i3;
        this.coeff = new GF2nElement[i3];
        for (int i10 = 0; i10 < this.size; i10++) {
            this.coeff[i10] = (GF2nElement) gF2nElement.clone();
        }
    }

    public GF2nPolynomial(GF2Polynomial gF2Polynomial, GF2nField gF2nField) {
        int degree = gF2nField.getDegree() + 1;
        this.size = degree;
        this.coeff = new GF2nElement[degree];
        int i3 = 0;
        if (gF2nField instanceof GF2nONBField) {
            while (i3 < this.size) {
                if (gF2Polynomial.testBit(i3)) {
                    this.coeff[i3] = GF2nONBElement.ONE((GF2nONBField) gF2nField);
                } else {
                    this.coeff[i3] = GF2nONBElement.ZERO((GF2nONBField) gF2nField);
                }
                i3++;
            }
            return;
        }
        if (!(gF2nField instanceof GF2nPolynomialField)) {
            throw new IllegalArgumentException(StubApp.getString2(34863));
        }
        while (i3 < this.size) {
            if (gF2Polynomial.testBit(i3)) {
                this.coeff[i3] = GF2nPolynomialElement.ONE((GF2nPolynomialField) gF2nField);
            } else {
                this.coeff[i3] = GF2nPolynomialElement.ZERO((GF2nPolynomialField) gF2nField);
            }
            i3++;
        }
    }

    public GF2nPolynomial(GF2nPolynomial gF2nPolynomial) {
        int i3 = gF2nPolynomial.size;
        this.coeff = new GF2nElement[i3];
        this.size = i3;
        for (int i10 = 0; i10 < this.size; i10++) {
            this.coeff[i10] = (GF2nElement) gF2nPolynomial.coeff[i10].clone();
        }
    }
}
