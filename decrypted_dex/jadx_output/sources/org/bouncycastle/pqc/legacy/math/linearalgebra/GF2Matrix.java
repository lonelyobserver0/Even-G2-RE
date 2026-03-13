package org.bouncycastle.pqc.legacy.math.linearalgebra;

import com.stub.StubApp;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import kotlin.UByte;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GF2Matrix extends Matrix {
    private int length;
    private int[][] matrix;

    public GF2Matrix(int i3, char c10) {
        this(i3, c10, new SecureRandom());
    }

    private static void addToRow(int[] iArr, int[] iArr2, int i3) {
        for (int length = iArr2.length - 1; length >= i3; length--) {
            iArr2[length] = iArr[length] ^ iArr2[length];
        }
    }

    private void assignRandomLowerTriangularMatrix(int i3, SecureRandom secureRandom) {
        this.numRows = i3;
        this.numColumns = i3;
        int i10 = (i3 + 31) >>> 5;
        this.length = i10;
        this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i3, i10);
        for (int i11 = 0; i11 < this.numRows; i11++) {
            int i12 = i11 >>> 5;
            int i13 = i11 & 31;
            int i14 = 31 - i13;
            int i15 = 1 << i13;
            for (int i16 = 0; i16 < i12; i16++) {
                this.matrix[i11][i16] = secureRandom.nextInt();
            }
            this.matrix[i11][i12] = i15 | (secureRandom.nextInt() >>> i14);
            while (true) {
                i12++;
                if (i12 < this.length) {
                    this.matrix[i11][i12] = 0;
                }
            }
        }
    }

    private void assignRandomRegularMatrix(int i3, SecureRandom secureRandom) {
        this.numRows = i3;
        this.numColumns = i3;
        int i10 = (i3 + 31) >>> 5;
        this.length = i10;
        this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i3, i10);
        GF2Matrix gF2Matrix = (GF2Matrix) new GF2Matrix(i3, 'L', secureRandom).rightMultiply(new GF2Matrix(i3, 'U', secureRandom));
        int[] vector = new Permutation(i3, secureRandom).getVector();
        for (int i11 = 0; i11 < i3; i11++) {
            System.arraycopy(gF2Matrix.matrix[i11], 0, this.matrix[vector[i11]], 0, this.length);
        }
    }

    private void assignRandomUpperTriangularMatrix(int i3, SecureRandom secureRandom) {
        int i10;
        this.numRows = i3;
        this.numColumns = i3;
        int i11 = (i3 + 31) >>> 5;
        this.length = i11;
        this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i3, i11);
        int i12 = i3 & 31;
        int i13 = i12 == 0 ? -1 : (1 << i12) - 1;
        for (int i14 = 0; i14 < this.numRows; i14++) {
            int i15 = i14 >>> 5;
            int i16 = i14 & 31;
            for (int i17 = 0; i17 < i15; i17++) {
                this.matrix[i14][i17] = 0;
            }
            this.matrix[i14][i15] = (secureRandom.nextInt() | 1) << i16;
            while (true) {
                i15++;
                i10 = this.length;
                if (i15 < i10) {
                    this.matrix[i14][i15] = secureRandom.nextInt();
                }
            }
            int[] iArr = this.matrix[i14];
            int i18 = i10 - 1;
            iArr[i18] = iArr[i18] & i13;
        }
    }

    private void assignUnitMatrix(int i3) {
        this.numRows = i3;
        this.numColumns = i3;
        int i10 = (i3 + 31) >>> 5;
        this.length = i10;
        int[] iArr = {i3, i10};
        this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iArr);
        for (int i11 = 0; i11 < this.numRows; i11++) {
            for (int i12 = 0; i12 < this.length; i12++) {
                this.matrix[i11][i12] = 0;
            }
        }
        for (int i13 = 0; i13 < this.numRows; i13++) {
            this.matrix[i13][i13 >>> 5] = 1 << (i13 & 31);
        }
    }

    private void assignZeroMatrix(int i3, int i10) {
        this.numRows = i3;
        this.numColumns = i10;
        int i11 = (i10 + 31) >>> 5;
        this.length = i11;
        this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i3, i11);
        for (int i12 = 0; i12 < this.numRows; i12++) {
            for (int i13 = 0; i13 < this.length; i13++) {
                this.matrix[i12][i13] = 0;
            }
        }
    }

    public static GF2Matrix[] createRandomRegularMatrixAndItsInverse(int i3, SecureRandom secureRandom) {
        int i10 = (i3 + 31) >> 5;
        GF2Matrix gF2Matrix = new GF2Matrix(i3, 'L', secureRandom);
        GF2Matrix gF2Matrix2 = new GF2Matrix(i3, 'U', secureRandom);
        GF2Matrix gF2Matrix3 = (GF2Matrix) gF2Matrix.rightMultiply(gF2Matrix2);
        Permutation permutation = new Permutation(i3, secureRandom);
        int[] vector = permutation.getVector();
        int i11 = 1;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i3, i10);
        for (int i12 = 0; i12 < i3; i12++) {
            System.arraycopy(gF2Matrix3.matrix[vector[i12]], 0, iArr[i12], 0, i10);
        }
        GF2Matrix gF2Matrix4 = new GF2Matrix(i3, iArr);
        GF2Matrix gF2Matrix5 = new GF2Matrix(i3, 'I');
        int i13 = 0;
        while (i13 < i3) {
            int i14 = i13 >>> 5;
            int i15 = i11 << (i13 & 31);
            int i16 = i13 + 1;
            int i17 = i16;
            while (i17 < i3) {
                if ((gF2Matrix.matrix[i17][i14] & i15) != 0) {
                    int i18 = 0;
                    while (i18 <= i14) {
                        int i19 = i11;
                        int[][] iArr2 = gF2Matrix5.matrix;
                        int[] iArr3 = iArr2[i17];
                        iArr3[i18] = iArr3[i18] ^ iArr2[i13][i18];
                        i18++;
                        i11 = i19;
                    }
                }
                i17++;
                i11 = i11;
            }
            i13 = i16;
        }
        int i20 = i11;
        GF2Matrix gF2Matrix6 = new GF2Matrix(i3, 'I');
        for (int i21 = i3 - 1; i21 >= 0; i21--) {
            int i22 = i21 >>> 5;
            int i23 = i20 << (i21 & 31);
            for (int i24 = i21 - 1; i24 >= 0; i24--) {
                if ((gF2Matrix2.matrix[i24][i22] & i23) != 0) {
                    for (int i25 = i22; i25 < i10; i25++) {
                        int[][] iArr4 = gF2Matrix6.matrix;
                        int[] iArr5 = iArr4[i24];
                        iArr5[i25] = iArr4[i21][i25] ^ iArr5[i25];
                    }
                }
            }
        }
        return new GF2Matrix[]{gF2Matrix4, (GF2Matrix) gF2Matrix6.rightMultiply(gF2Matrix5.rightMultiply(permutation))};
    }

    private static void swapRows(int[][] iArr, int i3, int i10) {
        int[] iArr2 = iArr[i3];
        iArr[i3] = iArr[i10];
        iArr[i10] = iArr2;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix
    public Matrix computeInverse() {
        int i3 = this.numRows;
        int i10 = this.numColumns;
        String string2 = StubApp.getString2(34807);
        if (i3 != i10) {
            throw new ArithmeticException(string2);
        }
        int[] iArr = {i3, this.length};
        Class cls = Integer.TYPE;
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) cls, iArr);
        for (int i11 = this.numRows - 1; i11 >= 0; i11--) {
            iArr2[i11] = IntUtils.clone(this.matrix[i11]);
        }
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) cls, this.numRows, this.length);
        for (int i12 = this.numRows - 1; i12 >= 0; i12--) {
            iArr3[i12][i12 >> 5] = 1 << (i12 & 31);
        }
        for (int i13 = 0; i13 < this.numRows; i13++) {
            int i14 = i13 >> 5;
            int i15 = 1 << (i13 & 31);
            if ((iArr2[i13][i14] & i15) == 0) {
                int i16 = i13 + 1;
                boolean z2 = false;
                while (i16 < this.numRows) {
                    if ((iArr2[i16][i14] & i15) != 0) {
                        swapRows(iArr2, i13, i16);
                        swapRows(iArr3, i13, i16);
                        i16 = this.numRows;
                        z2 = true;
                    }
                    i16++;
                }
                if (!z2) {
                    throw new ArithmeticException(string2);
                }
            }
            for (int i17 = this.numRows - 1; i17 >= 0; i17--) {
                if (i17 != i13) {
                    int[] iArr4 = iArr2[i17];
                    if ((iArr4[i14] & i15) != 0) {
                        addToRow(iArr2[i13], iArr4, i14);
                        addToRow(iArr3[i13], iArr3[i17], 0);
                    }
                }
            }
        }
        return new GF2Matrix(this.numColumns, iArr3);
    }

    public Matrix computeTranspose() {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.numColumns, (this.numRows + 31) >>> 5);
        int i3 = 0;
        while (true) {
            int i10 = this.numRows;
            if (i3 >= i10) {
                return new GF2Matrix(i10, iArr);
            }
            for (int i11 = 0; i11 < this.numColumns; i11++) {
                int i12 = i3 >>> 5;
                int i13 = i3 & 31;
                if (((this.matrix[i3][i11 >>> 5] >>> (i11 & 31)) & 1) == 1) {
                    int[] iArr2 = iArr[i11];
                    iArr2[i12] = (1 << i13) | iArr2[i12];
                }
            }
            i3++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GF2Matrix)) {
            return false;
        }
        GF2Matrix gF2Matrix = (GF2Matrix) obj;
        if (this.numRows != gF2Matrix.numRows || this.numColumns != gF2Matrix.numColumns || this.length != gF2Matrix.length) {
            return false;
        }
        for (int i3 = 0; i3 < this.numRows; i3++) {
            if (!IntUtils.equals(this.matrix[i3], gF2Matrix.matrix[i3])) {
                return false;
            }
        }
        return true;
    }

    public GF2Matrix extendLeftCompactForm() {
        int i3 = this.numColumns;
        int i10 = this.numRows;
        GF2Matrix gF2Matrix = new GF2Matrix(i10, i3 + i10);
        int i11 = this.numRows;
        int i12 = (i11 - 1) + this.numColumns;
        int i13 = i11 - 1;
        while (i13 >= 0) {
            System.arraycopy(this.matrix[i13], 0, gF2Matrix.matrix[i13], 0, this.length);
            int[] iArr = gF2Matrix.matrix[i13];
            int i14 = i12 >> 5;
            iArr[i14] = iArr[i14] | (1 << (i12 & 31));
            i13--;
            i12--;
        }
        return gF2Matrix;
    }

    public GF2Matrix extendRightCompactForm() {
        int i3;
        int i10 = this.numRows;
        GF2Matrix gF2Matrix = new GF2Matrix(i10, this.numColumns + i10);
        int i11 = this.numRows;
        int i12 = i11 >> 5;
        int i13 = i11 & 31;
        for (int i14 = i11 - 1; i14 >= 0; i14--) {
            int[] iArr = gF2Matrix.matrix[i14];
            int i15 = i14 >> 5;
            iArr[i15] = iArr[i15] | (1 << (i14 & 31));
            int i16 = 0;
            if (i13 != 0) {
                int i17 = i12;
                while (true) {
                    i3 = this.length;
                    if (i16 >= i3 - 1) {
                        break;
                    }
                    int i18 = this.matrix[i14][i16];
                    int[] iArr2 = gF2Matrix.matrix[i14];
                    int i19 = i17 + 1;
                    iArr2[i17] = iArr2[i17] | (i18 << i13);
                    iArr2[i19] = iArr2[i19] | (i18 >>> (32 - i13));
                    i16++;
                    i17 = i19;
                }
                int i20 = this.matrix[i14][i3 - 1];
                int[] iArr3 = gF2Matrix.matrix[i14];
                int i21 = i17 + 1;
                iArr3[i17] = iArr3[i17] | (i20 << i13);
                if (i21 < gF2Matrix.length) {
                    iArr3[i21] = iArr3[i21] | (i20 >>> (32 - i13));
                }
            } else {
                System.arraycopy(this.matrix[i14], 0, iArr, i12, this.length);
            }
        }
        return gF2Matrix;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix
    public byte[] getEncoded() {
        int i3 = (this.numColumns + 7) >>> 3;
        int i10 = this.numRows;
        int i11 = 8;
        byte[] bArr = new byte[(i3 * i10) + 8];
        LittleEndianConversions.I2OSP(i10, bArr, 0);
        LittleEndianConversions.I2OSP(this.numColumns, bArr, 4);
        int i12 = this.numColumns;
        int i13 = i12 >>> 5;
        int i14 = i12 & 31;
        for (int i15 = 0; i15 < this.numRows; i15++) {
            int i16 = 0;
            while (i16 < i13) {
                LittleEndianConversions.I2OSP(this.matrix[i15][i16], bArr, i11);
                i16++;
                i11 += 4;
            }
            int i17 = 0;
            while (i17 < i14) {
                bArr[i11] = (byte) ((this.matrix[i15][i13] >>> i17) & 255);
                i17 += 8;
                i11++;
            }
        }
        return bArr;
    }

    public double getHammingWeight() {
        int i3 = this.numColumns & 31;
        int i10 = this.length;
        if (i3 != 0) {
            i10--;
        }
        double d8 = 0.0d;
        double d10 = 0.0d;
        for (int i11 = 0; i11 < this.numRows; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = this.matrix[i11][i12];
                for (int i14 = 0; i14 < 32; i14++) {
                    d8 += (i13 >>> i14) & 1;
                    d10 += 1.0d;
                }
            }
            int i15 = this.matrix[i11][this.length - 1];
            for (int i16 = 0; i16 < i3; i16++) {
                d8 += (i15 >>> i16) & 1;
                d10 += 1.0d;
            }
        }
        return d8 / d10;
    }

    public int[][] getIntArray() {
        return this.matrix;
    }

    public GF2Matrix getLeftSubMatrix() {
        int i3 = this.numColumns;
        int i10 = this.numRows;
        if (i3 <= i10) {
            throw new ArithmeticException(StubApp.getString2(34808));
        }
        int i11 = (i10 + 31) >> 5;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, i11);
        int i12 = this.numRows;
        int i13 = (1 << (i12 & 31)) - 1;
        if (i13 == 0) {
            i13 = -1;
        }
        for (int i14 = i12 - 1; i14 >= 0; i14--) {
            System.arraycopy(this.matrix[i14], 0, iArr[i14], 0, i11);
            int[] iArr2 = iArr[i14];
            int i15 = i11 - 1;
            iArr2[i15] = iArr2[i15] & i13;
        }
        return new GF2Matrix(this.numRows, iArr);
    }

    public int getLength() {
        return this.length;
    }

    public GF2Matrix getRightSubMatrix() {
        int i3;
        int i10 = this.numColumns;
        int i11 = this.numRows;
        if (i10 <= i11) {
            throw new ArithmeticException(StubApp.getString2(34808));
        }
        int i12 = i11 >> 5;
        int i13 = i11 & 31;
        GF2Matrix gF2Matrix = new GF2Matrix(i11, i10 - i11);
        for (int i14 = this.numRows - 1; i14 >= 0; i14--) {
            int i15 = 0;
            if (i13 != 0) {
                int i16 = i12;
                while (true) {
                    i3 = gF2Matrix.length;
                    if (i15 >= i3 - 1) {
                        break;
                    }
                    int[] iArr = gF2Matrix.matrix[i14];
                    int[] iArr2 = this.matrix[i14];
                    int i17 = i16 + 1;
                    iArr[i15] = (iArr2[i16] >>> i13) | (iArr2[i17] << (32 - i13));
                    i15++;
                    i16 = i17;
                }
                int[] iArr3 = gF2Matrix.matrix[i14];
                int[] iArr4 = this.matrix[i14];
                int i18 = i16 + 1;
                iArr3[i3 - 1] = iArr4[i16] >>> i13;
                if (i18 < this.length) {
                    int i19 = i3 - 1;
                    iArr3[i19] = iArr3[i19] | (iArr4[i18] << (32 - i13));
                }
            } else {
                System.arraycopy(this.matrix[i14], i12, gF2Matrix.matrix[i14], 0, gF2Matrix.length);
            }
        }
        return gF2Matrix;
    }

    public int[] getRow(int i3) {
        return this.matrix[i3];
    }

    public int hashCode() {
        int i3 = (((this.numRows * 31) + this.numColumns) * 31) + this.length;
        for (int i10 = 0; i10 < this.numRows; i10++) {
            i3 = (i3 * 31) + Arrays.hashCode(this.matrix[i10]);
        }
        return i3;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix
    public boolean isZero() {
        for (int i3 = 0; i3 < this.numRows; i3++) {
            for (int i10 = 0; i10 < this.length; i10++) {
                if (this.matrix[i3][i10] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public Matrix leftMultiply(Permutation permutation) {
        int[] vector = permutation.getVector();
        int length = vector.length;
        int i3 = this.numRows;
        if (length != i3) {
            throw new ArithmeticException(StubApp.getString2(34809));
        }
        int[][] iArr = new int[i3][];
        for (int i10 = i3 - 1; i10 >= 0; i10--) {
            iArr[i10] = IntUtils.clone(this.matrix[vector[i10]]);
        }
        return new GF2Matrix(this.numRows, iArr);
    }

    public Vector leftMultiplyLeftCompactForm(Vector vector) {
        if (!(vector instanceof GF2Vector)) {
            throw new ArithmeticException(StubApp.getString2(34810));
        }
        if (vector.length != this.numRows) {
            throw new ArithmeticException(StubApp.getString2(34809));
        }
        int[] vecArray = ((GF2Vector) vector).getVecArray();
        int i3 = this.numRows;
        int[] iArr = new int[((this.numColumns + i3) + 31) >>> 5];
        int i10 = i3 >>> 5;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = 1;
            do {
                if ((vecArray[i12] & i13) != 0) {
                    for (int i14 = 0; i14 < this.length; i14++) {
                        iArr[i14] = iArr[i14] ^ this.matrix[i11][i14];
                    }
                    int i15 = this.numColumns;
                    int i16 = (i15 + i11) >>> 5;
                    iArr[i16] = (1 << ((i15 + i11) & 31)) | iArr[i16];
                }
                i11++;
                i13 <<= 1;
            } while (i13 != 0);
        }
        int i17 = 1 << (this.numRows & 31);
        for (int i18 = 1; i18 != i17; i18 <<= 1) {
            if ((vecArray[i10] & i18) != 0) {
                for (int i19 = 0; i19 < this.length; i19++) {
                    iArr[i19] = iArr[i19] ^ this.matrix[i11][i19];
                }
                int i20 = this.numColumns;
                int i21 = (i20 + i11) >>> 5;
                iArr[i21] = (1 << ((i20 + i11) & 31)) | iArr[i21];
            }
            i11++;
        }
        return new GF2Vector(iArr, this.numRows + this.numColumns);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix
    public Matrix rightMultiply(Matrix matrix) {
        if (!(matrix instanceof GF2Matrix)) {
            throw new ArithmeticException(StubApp.getString2(34811));
        }
        if (matrix.numRows != this.numColumns) {
            throw new ArithmeticException(StubApp.getString2(34809));
        }
        GF2Matrix gF2Matrix = (GF2Matrix) matrix;
        GF2Matrix gF2Matrix2 = new GF2Matrix(this.numRows, matrix.numColumns);
        int i3 = this.numColumns & 31;
        int i10 = this.length;
        if (i3 != 0) {
            i10--;
        }
        for (int i11 = 0; i11 < this.numRows; i11++) {
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = this.matrix[i11][i13];
                for (int i15 = 0; i15 < 32; i15++) {
                    if (((1 << i15) & i14) != 0) {
                        for (int i16 = 0; i16 < gF2Matrix.length; i16++) {
                            int[] iArr = gF2Matrix2.matrix[i11];
                            iArr[i16] = iArr[i16] ^ gF2Matrix.matrix[i12][i16];
                        }
                    }
                    i12++;
                }
            }
            int i17 = this.matrix[i11][this.length - 1];
            for (int i18 = 0; i18 < i3; i18++) {
                if (((1 << i18) & i17) != 0) {
                    for (int i19 = 0; i19 < gF2Matrix.length; i19++) {
                        int[] iArr2 = gF2Matrix2.matrix[i11];
                        iArr2[i19] = iArr2[i19] ^ gF2Matrix.matrix[i12][i19];
                    }
                }
                i12++;
            }
        }
        return gF2Matrix2;
    }

    public Vector rightMultiplyRightCompactForm(Vector vector) {
        int i3;
        if (!(vector instanceof GF2Vector)) {
            throw new ArithmeticException(StubApp.getString2(34810));
        }
        if (vector.length != this.numColumns + this.numRows) {
            throw new ArithmeticException(StubApp.getString2(34809));
        }
        int[] vecArray = ((GF2Vector) vector).getVecArray();
        int i10 = this.numRows;
        int[] iArr = new int[(i10 + 31) >>> 5];
        int i11 = i10 >> 5;
        int i12 = i10 & 31;
        int i13 = 0;
        while (true) {
            int i14 = this.numRows;
            if (i13 >= i14) {
                return new GF2Vector(iArr, i14);
            }
            int i15 = i13 >> 5;
            int i16 = i13 & 31;
            int i17 = (vecArray[i15] >>> i16) & 1;
            int i18 = i11;
            int i19 = 0;
            if (i12 != 0) {
                while (true) {
                    i3 = this.length;
                    if (i19 >= i3 - 1) {
                        break;
                    }
                    int i20 = i18 + 1;
                    i17 ^= ((vecArray[i18] >>> i12) | (vecArray[i20] << (32 - i12))) & this.matrix[i13][i19];
                    i19++;
                    i18 = i20;
                }
                int i21 = i18 + 1;
                int i22 = vecArray[i18] >>> i12;
                if (i21 < vecArray.length) {
                    i22 |= vecArray[i21] << (32 - i12);
                }
                i17 ^= this.matrix[i13][i3 - 1] & i22;
            } else {
                while (i19 < this.length) {
                    i17 ^= vecArray[i18] & this.matrix[i13][i19];
                    i19++;
                    i18++;
                }
            }
            int i23 = 0;
            for (int i24 = 0; i24 < 32; i24++) {
                i23 ^= i17 & 1;
                i17 >>>= 1;
            }
            if (i23 == 1) {
                iArr[i15] = iArr[i15] | (1 << i16);
            }
            i13++;
        }
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix
    public String toString() {
        int i3 = this.numColumns & 31;
        int i10 = this.length;
        if (i3 != 0) {
            i10--;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < this.numRows; i11++) {
            stringBuffer.append(i11 + StubApp.getString2(994));
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = this.matrix[i11][i12];
                for (int i14 = 0; i14 < 32; i14++) {
                    if (((i13 >>> i14) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
            }
            int i15 = this.matrix[i11][this.length - 1];
            for (int i16 = 0; i16 < i3; i16++) {
                if (((i15 >>> i16) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }

    public GF2Matrix(int i3, char c10, SecureRandom secureRandom) {
        if (i3 <= 0) {
            throw new ArithmeticException(StubApp.getString2(34803));
        }
        if (c10 == 'I') {
            assignUnitMatrix(i3);
            return;
        }
        if (c10 == 'L') {
            assignRandomLowerTriangularMatrix(i3, secureRandom);
            return;
        }
        if (c10 == 'R') {
            assignRandomRegularMatrix(i3, secureRandom);
        } else if (c10 == 'U') {
            assignRandomUpperTriangularMatrix(i3, secureRandom);
        } else {
            if (c10 != 'Z') {
                throw new ArithmeticException(StubApp.getString2(34802));
            }
            assignZeroMatrix(i3, i3);
        }
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix
    public Vector leftMultiply(Vector vector) {
        if (!(vector instanceof GF2Vector)) {
            throw new ArithmeticException(StubApp.getString2(34810));
        }
        if (vector.length != this.numRows) {
            throw new ArithmeticException(StubApp.getString2(34809));
        }
        int[] vecArray = ((GF2Vector) vector).getVecArray();
        int[] iArr = new int[this.length];
        int i3 = this.numRows;
        int i10 = i3 >> 5;
        int i11 = 1 << (i3 & 31);
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = 1;
            do {
                if ((vecArray[i13] & i14) != 0) {
                    for (int i15 = 0; i15 < this.length; i15++) {
                        iArr[i15] = iArr[i15] ^ this.matrix[i12][i15];
                    }
                }
                i12++;
                i14 <<= 1;
            } while (i14 != 0);
        }
        for (int i16 = 1; i16 != i11; i16 <<= 1) {
            if ((vecArray[i10] & i16) != 0) {
                for (int i17 = 0; i17 < this.length; i17++) {
                    iArr[i17] = iArr[i17] ^ this.matrix[i12][i17];
                }
            }
            i12++;
        }
        return new GF2Vector(iArr, this.numColumns);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix
    public Matrix rightMultiply(Permutation permutation) {
        int[] vector = permutation.getVector();
        int length = vector.length;
        int i3 = this.numColumns;
        if (length != i3) {
            throw new ArithmeticException(StubApp.getString2(34809));
        }
        GF2Matrix gF2Matrix = new GF2Matrix(this.numRows, i3);
        for (int i10 = this.numColumns - 1; i10 >= 0; i10--) {
            int i11 = i10 >>> 5;
            int i12 = i10 & 31;
            int i13 = vector[i10];
            int i14 = i13 >>> 5;
            int i15 = i13 & 31;
            for (int i16 = this.numRows - 1; i16 >= 0; i16--) {
                int[] iArr = gF2Matrix.matrix[i16];
                iArr[i11] = iArr[i11] | (((this.matrix[i16][i14] >>> i15) & 1) << i12);
            }
        }
        return gF2Matrix;
    }

    private GF2Matrix(int i3, int i10) {
        if (i10 <= 0 || i3 <= 0) {
            throw new ArithmeticException(StubApp.getString2(34804));
        }
        assignZeroMatrix(i3, i10);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix
    public Vector rightMultiply(Vector vector) {
        if (!(vector instanceof GF2Vector)) {
            throw new ArithmeticException(StubApp.getString2(34810));
        }
        if (vector.length != this.numColumns) {
            throw new ArithmeticException(StubApp.getString2(34809));
        }
        int[] vecArray = ((GF2Vector) vector).getVecArray();
        int[] iArr = new int[(this.numRows + 31) >>> 5];
        int i3 = 0;
        while (true) {
            int i10 = this.numRows;
            if (i3 >= i10) {
                return new GF2Vector(iArr, i10);
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.length; i12++) {
                i11 ^= this.matrix[i3][i12] & vecArray[i12];
            }
            int i13 = 0;
            for (int i14 = 0; i14 < 32; i14++) {
                i13 ^= (i11 >>> i14) & 1;
            }
            if (i13 == 1) {
                int i15 = i3 >>> 5;
                iArr[i15] = iArr[i15] | (1 << (i3 & 31));
            }
            i3++;
        }
    }

    public GF2Matrix(int i3, int[][] iArr) {
        int[] iArr2 = iArr[0];
        if (iArr2.length != ((i3 + 31) >> 5)) {
            throw new ArithmeticException(StubApp.getString2(34805));
        }
        this.numColumns = i3;
        this.numRows = iArr.length;
        this.length = iArr2.length;
        int i10 = i3 & 31;
        int i11 = i10 == 0 ? -1 : (1 << i10) - 1;
        for (int i12 = 0; i12 < this.numRows; i12++) {
            int[] iArr3 = iArr[i12];
            int i13 = this.length - 1;
            iArr3[i13] = iArr3[i13] & i11;
        }
        this.matrix = iArr;
    }

    public GF2Matrix(GF2Matrix gF2Matrix) {
        this.numColumns = gF2Matrix.getNumColumns();
        this.numRows = gF2Matrix.getNumRows();
        this.length = gF2Matrix.length;
        this.matrix = new int[gF2Matrix.matrix.length][];
        int i3 = 0;
        while (true) {
            int[][] iArr = this.matrix;
            if (i3 >= iArr.length) {
                return;
            }
            iArr[i3] = IntUtils.clone(gF2Matrix.matrix[i3]);
            i3++;
        }
    }

    public GF2Matrix(byte[] bArr) {
        int length = bArr.length;
        String string2 = StubApp.getString2(34806);
        if (length < 9) {
            throw new ArithmeticException(string2);
        }
        this.numRows = LittleEndianConversions.OS2IP(bArr, 0);
        int OS2IP = LittleEndianConversions.OS2IP(bArr, 4);
        this.numColumns = OS2IP;
        int i3 = this.numRows;
        int i10 = ((OS2IP + 7) >>> 3) * i3;
        if (i3 > 0) {
            int i11 = 8;
            if (i10 == bArr.length - 8) {
                int i12 = (OS2IP + 31) >>> 5;
                this.length = i12;
                this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i3, i12);
                int i13 = this.numColumns;
                int i14 = i13 >> 5;
                int i15 = i13 & 31;
                for (int i16 = 0; i16 < this.numRows; i16++) {
                    int i17 = 0;
                    while (i17 < i14) {
                        this.matrix[i16][i17] = LittleEndianConversions.OS2IP(bArr, i11);
                        i17++;
                        i11 += 4;
                    }
                    int i18 = 0;
                    while (i18 < i15) {
                        int[] iArr = this.matrix[i16];
                        iArr[i14] = ((bArr[i11] & UByte.MAX_VALUE) << i18) ^ iArr[i14];
                        i18 += 8;
                        i11++;
                    }
                }
                return;
            }
        }
        throw new ArithmeticException(string2);
    }
}
