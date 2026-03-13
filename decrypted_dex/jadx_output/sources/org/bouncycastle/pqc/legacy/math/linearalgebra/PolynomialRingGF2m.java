package org.bouncycastle.pqc.legacy.math.linearalgebra;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PolynomialRingGF2m {
    private GF2mField field;

    /* renamed from: p, reason: collision with root package name */
    private PolynomialGF2mSmallM f19564p;
    protected PolynomialGF2mSmallM[] sqMatrix;
    protected PolynomialGF2mSmallM[] sqRootMatrix;

    public PolynomialRingGF2m(GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM) {
        this.field = gF2mField;
        this.f19564p = polynomialGF2mSmallM;
        computeSquaringMatrix();
        computeSquareRootMatrix();
    }

    private void computeSquareRootMatrix() {
        int coefficient;
        int degree = this.f19564p.getDegree();
        PolynomialGF2mSmallM[] polynomialGF2mSmallMArr = new PolynomialGF2mSmallM[degree];
        int i3 = degree - 1;
        for (int i10 = i3; i10 >= 0; i10--) {
            polynomialGF2mSmallMArr[i10] = new PolynomialGF2mSmallM(this.sqMatrix[i10]);
        }
        this.sqRootMatrix = new PolynomialGF2mSmallM[degree];
        while (i3 >= 0) {
            this.sqRootMatrix[i3] = new PolynomialGF2mSmallM(this.field, i3);
            i3--;
        }
        for (int i11 = 0; i11 < degree; i11++) {
            if (polynomialGF2mSmallMArr[i11].getCoefficient(i11) == 0) {
                int i12 = i11 + 1;
                boolean z2 = false;
                while (i12 < degree) {
                    if (polynomialGF2mSmallMArr[i12].getCoefficient(i11) != 0) {
                        swapColumns(polynomialGF2mSmallMArr, i11, i12);
                        swapColumns(this.sqRootMatrix, i11, i12);
                        i12 = degree;
                        z2 = true;
                    }
                    i12++;
                }
                if (!z2) {
                    throw new ArithmeticException(StubApp.getString2(34886));
                }
            }
            int inverse = this.field.inverse(polynomialGF2mSmallMArr[i11].getCoefficient(i11));
            polynomialGF2mSmallMArr[i11].multThisWithElement(inverse);
            this.sqRootMatrix[i11].multThisWithElement(inverse);
            for (int i13 = 0; i13 < degree; i13++) {
                if (i13 != i11 && (coefficient = polynomialGF2mSmallMArr[i13].getCoefficient(i11)) != 0) {
                    PolynomialGF2mSmallM multWithElement = polynomialGF2mSmallMArr[i11].multWithElement(coefficient);
                    PolynomialGF2mSmallM multWithElement2 = this.sqRootMatrix[i11].multWithElement(coefficient);
                    polynomialGF2mSmallMArr[i13].addToThis(multWithElement);
                    this.sqRootMatrix[i13].addToThis(multWithElement2);
                }
            }
        }
    }

    private void computeSquaringMatrix() {
        int i3;
        int degree = this.f19564p.getDegree();
        this.sqMatrix = new PolynomialGF2mSmallM[degree];
        int i10 = 0;
        while (true) {
            i3 = degree >> 1;
            if (i10 >= i3) {
                break;
            }
            int i11 = i10 << 1;
            int[] iArr = new int[i11 + 1];
            iArr[i11] = 1;
            this.sqMatrix[i10] = new PolynomialGF2mSmallM(this.field, iArr);
            i10++;
        }
        while (i3 < degree) {
            int i12 = i3 << 1;
            int[] iArr2 = new int[i12 + 1];
            iArr2[i12] = 1;
            this.sqMatrix[i3] = new PolynomialGF2mSmallM(this.field, iArr2).mod(this.f19564p);
            i3++;
        }
    }

    private static void swapColumns(PolynomialGF2mSmallM[] polynomialGF2mSmallMArr, int i3, int i10) {
        PolynomialGF2mSmallM polynomialGF2mSmallM = polynomialGF2mSmallMArr[i3];
        polynomialGF2mSmallMArr[i3] = polynomialGF2mSmallMArr[i10];
        polynomialGF2mSmallMArr[i10] = polynomialGF2mSmallM;
    }

    public PolynomialGF2mSmallM[] getSquareRootMatrix() {
        return this.sqRootMatrix;
    }

    public PolynomialGF2mSmallM[] getSquaringMatrix() {
        return this.sqMatrix;
    }
}
