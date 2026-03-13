package org.bouncycastle.pqc.legacy.math.linearalgebra;

import java.lang.reflect.Array;
import java.security.SecureRandom;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class GoppaCode {

    public static class MaMaPe {

        /* renamed from: h, reason: collision with root package name */
        private GF2Matrix f19560h;

        /* renamed from: p, reason: collision with root package name */
        private Permutation f19561p;

        /* renamed from: s, reason: collision with root package name */
        private GF2Matrix f19562s;

        public MaMaPe(GF2Matrix gF2Matrix, GF2Matrix gF2Matrix2, Permutation permutation) {
            this.f19562s = gF2Matrix;
            this.f19560h = gF2Matrix2;
            this.f19561p = permutation;
        }

        public GF2Matrix getFirstMatrix() {
            return this.f19562s;
        }

        public Permutation getPermutation() {
            return this.f19561p;
        }

        public GF2Matrix getSecondMatrix() {
            return this.f19560h;
        }
    }

    public static class MatrixSet {

        /* renamed from: g, reason: collision with root package name */
        private GF2Matrix f19563g;
        private int[] setJ;

        public MatrixSet(GF2Matrix gF2Matrix, int[] iArr) {
            this.f19563g = gF2Matrix;
            this.setJ = iArr;
        }

        public GF2Matrix getG() {
            return this.f19563g;
        }

        public int[] getSetJ() {
            return this.setJ;
        }
    }

    private GoppaCode() {
    }

    public static MaMaPe computeSystematicForm(GF2Matrix gF2Matrix, SecureRandom secureRandom) {
        GF2Matrix gF2Matrix2;
        boolean z2;
        int numColumns = gF2Matrix.getNumColumns();
        GF2Matrix gF2Matrix3 = null;
        while (true) {
            Permutation permutation = new Permutation(numColumns, secureRandom);
            GF2Matrix gF2Matrix4 = (GF2Matrix) gF2Matrix.rightMultiply(permutation);
            GF2Matrix leftSubMatrix = gF2Matrix4.getLeftSubMatrix();
            try {
                gF2Matrix2 = (GF2Matrix) leftSubMatrix.computeInverse();
                z2 = true;
            } catch (ArithmeticException unused) {
                gF2Matrix2 = gF2Matrix3;
                z2 = false;
            }
            if (z2) {
                return new MaMaPe(leftSubMatrix, ((GF2Matrix) gF2Matrix2.rightMultiply(gF2Matrix4)).getRightSubMatrix(), permutation);
            }
            gF2Matrix3 = gF2Matrix2;
        }
    }

    public static GF2Matrix createCanonicalCheckMatrix(GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM) {
        int degree = gF2mField.getDegree();
        int i3 = 1;
        int i10 = 1 << degree;
        int degree2 = polynomialGF2mSmallM.getDegree();
        int i11 = 0;
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, degree2, i10);
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) cls, degree2, i10);
        for (int i12 = 0; i12 < i10; i12++) {
            iArr2[0][i12] = gF2mField.inverse(polynomialGF2mSmallM.evaluateAt(i12));
        }
        for (int i13 = 1; i13 < degree2; i13++) {
            for (int i14 = 0; i14 < i10; i14++) {
                iArr2[i13][i14] = gF2mField.mult(iArr2[i13 - 1][i14], i14);
            }
        }
        for (int i15 = 0; i15 < degree2; i15++) {
            for (int i16 = i11; i16 < i10; i16++) {
                int i17 = i11;
                while (i17 <= i15) {
                    int[] iArr3 = iArr[i15];
                    iArr3[i16] = gF2mField.add(iArr3[i16], gF2mField.mult(iArr2[i17][i16], polynomialGF2mSmallM.getCoefficient((degree2 + i17) - i15)));
                    i17++;
                    i3 = i3;
                    i11 = i11;
                }
            }
        }
        int i18 = i3;
        int i19 = i11;
        int[] iArr4 = new int[2];
        iArr4[i18] = (i10 + 31) >>> 5;
        iArr4[i19] = degree2 * degree;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, iArr4);
        for (int i20 = i19; i20 < i10; i20++) {
            int i21 = i20 >>> 5;
            int i22 = i18 << (i20 & 31);
            for (int i23 = i19; i23 < degree2; i23++) {
                int i24 = iArr[i23][i20];
                for (int i25 = i19; i25 < degree; i25++) {
                    if (((i24 >>> i25) & 1) != 0) {
                        int[] iArr6 = iArr5[(((i23 + 1) * degree) - i25) - 1];
                        iArr6[i21] = iArr6[i21] ^ i22;
                    }
                }
            }
        }
        return new GF2Matrix(i10, iArr5);
    }

    public static GF2Vector syndromeDecode(GF2Vector gF2Vector, GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM, PolynomialGF2mSmallM[] polynomialGF2mSmallMArr) {
        int degree = 1 << gF2mField.getDegree();
        GF2Vector gF2Vector2 = new GF2Vector(degree);
        if (!gF2Vector.isZero()) {
            PolynomialGF2mSmallM[] modPolynomialToFracton = new PolynomialGF2mSmallM(gF2Vector.toExtensionFieldVector(gF2mField)).modInverse(polynomialGF2mSmallM).addMonomial(1).modSquareRootMatrix(polynomialGF2mSmallMArr).modPolynomialToFracton(polynomialGF2mSmallM);
            PolynomialGF2mSmallM polynomialGF2mSmallM2 = modPolynomialToFracton[0];
            PolynomialGF2mSmallM multiply = polynomialGF2mSmallM2.multiply(polynomialGF2mSmallM2);
            PolynomialGF2mSmallM polynomialGF2mSmallM3 = modPolynomialToFracton[1];
            PolynomialGF2mSmallM add = multiply.add(polynomialGF2mSmallM3.multiply(polynomialGF2mSmallM3).multWithMonomial(1));
            PolynomialGF2mSmallM multWithElement = add.multWithElement(gF2mField.inverse(add.getHeadCoefficient()));
            for (int i3 = 0; i3 < degree; i3++) {
                if (multWithElement.evaluateAt(i3) == 0) {
                    gF2Vector2.setBit(i3);
                }
            }
        }
        return gF2Vector2;
    }
}
