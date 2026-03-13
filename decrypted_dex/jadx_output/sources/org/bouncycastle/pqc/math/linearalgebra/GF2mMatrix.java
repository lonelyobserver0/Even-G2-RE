package org.bouncycastle.pqc.math.linearalgebra;

import com.stub.StubApp;
import java.lang.reflect.Array;
import kotlin.UByte;
import p0.AbstractC1482f;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GF2mMatrix extends Matrix {
    protected GF2mField field;
    protected int[][] matrix;

    public GF2mMatrix(GF2mField gF2mField, byte[] bArr) {
        this.field = gF2mField;
        int i3 = 8;
        int i10 = 1;
        while (gF2mField.getDegree() > i3) {
            i10++;
            i3 += 8;
        }
        int length = bArr.length;
        String string2 = StubApp.getString2(34846);
        if (length < 5) {
            throw new IllegalArgumentException(string2);
        }
        int i11 = ((((bArr[3] & UByte.MAX_VALUE) << 24) ^ ((bArr[2] & UByte.MAX_VALUE) << 16)) ^ ((bArr[1] & UByte.MAX_VALUE) << 8)) ^ (bArr[0] & UByte.MAX_VALUE);
        this.numRows = i11;
        int i12 = i10 * i11;
        if (i11 > 0) {
            int i13 = 4;
            if ((bArr.length - 4) % i12 == 0) {
                int length2 = (bArr.length - 4) / i12;
                this.numColumns = length2;
                this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i11, length2);
                for (int i14 = 0; i14 < this.numRows; i14++) {
                    for (int i15 = 0; i15 < this.numColumns; i15++) {
                        int i16 = 0;
                        while (i16 < i3) {
                            int[] iArr = this.matrix[i14];
                            iArr[i15] = iArr[i15] ^ ((bArr[i13] & UByte.MAX_VALUE) << i16);
                            i16 += 8;
                            i13++;
                        }
                        if (!this.field.isElementOfThisField(this.matrix[i14][i15])) {
                            throw new IllegalArgumentException(string2);
                        }
                    }
                }
                return;
            }
        }
        throw new IllegalArgumentException(string2);
    }

    private void addToRow(int[] iArr, int[] iArr2) {
        for (int length = iArr2.length - 1; length >= 0; length--) {
            iArr2[length] = this.field.add(iArr[length], iArr2[length]);
        }
    }

    private int[] multRowWithElement(int[] iArr, int i3) {
        int[] iArr2 = new int[iArr.length];
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr2[length] = this.field.mult(iArr[length], i3);
        }
        return iArr2;
    }

    private void multRowWithElementThis(int[] iArr, int i3) {
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr[length] = this.field.mult(iArr[length], i3);
        }
    }

    private static void swapColumns(int[][] iArr, int i3, int i10) {
        int[] iArr2 = iArr[i3];
        iArr[i3] = iArr[i10];
        iArr[i10] = iArr2;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Matrix computeInverse() {
        int i3;
        int i10 = this.numRows;
        int i11 = this.numColumns;
        String string2 = StubApp.getString2(34807);
        if (i10 != i11) {
            throw new ArithmeticException(string2);
        }
        int[] iArr = {i10, i10};
        Class cls = Integer.TYPE;
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) cls, iArr);
        for (int i12 = this.numRows - 1; i12 >= 0; i12--) {
            iArr2[i12] = IntUtils.clone(this.matrix[i12]);
        }
        int i13 = this.numRows;
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) cls, i13, i13);
        for (int i14 = this.numRows - 1; i14 >= 0; i14--) {
            iArr3[i14][i14] = 1;
        }
        for (int i15 = 0; i15 < this.numRows; i15++) {
            if (iArr2[i15][i15] == 0) {
                int i16 = i15 + 1;
                boolean z2 = false;
                while (i16 < this.numRows) {
                    if (iArr2[i16][i15] != 0) {
                        swapColumns(iArr2, i15, i16);
                        swapColumns(iArr3, i15, i16);
                        i16 = this.numRows;
                        z2 = true;
                    }
                    i16++;
                }
                if (!z2) {
                    throw new ArithmeticException(string2);
                }
            }
            int inverse = this.field.inverse(iArr2[i15][i15]);
            multRowWithElementThis(iArr2[i15], inverse);
            multRowWithElementThis(iArr3[i15], inverse);
            for (int i17 = 0; i17 < this.numRows; i17++) {
                if (i17 != i15 && (i3 = iArr2[i17][i15]) != 0) {
                    int[] multRowWithElement = multRowWithElement(iArr2[i15], i3);
                    int[] multRowWithElement2 = multRowWithElement(iArr3[i15], i3);
                    addToRow(multRowWithElement, iArr2[i17]);
                    addToRow(multRowWithElement2, iArr3[i17]);
                }
            }
        }
        return new GF2mMatrix(this.field, iArr3);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof GF2mMatrix)) {
            GF2mMatrix gF2mMatrix = (GF2mMatrix) obj;
            if (this.field.equals(gF2mMatrix.field)) {
                int i3 = gF2mMatrix.numRows;
                int i10 = this.numColumns;
                if (i3 == i10 && gF2mMatrix.numColumns == i10) {
                    for (int i11 = 0; i11 < this.numRows; i11++) {
                        for (int i12 = 0; i12 < this.numColumns; i12++) {
                            if (this.matrix[i11][i12] != gF2mMatrix.matrix[i11][i12]) {
                                return false;
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public byte[] getEncoded() {
        int i3 = 8;
        int i10 = 1;
        while (this.field.getDegree() > i3) {
            i10++;
            i3 += 8;
        }
        int i11 = this.numRows;
        int i12 = this.numColumns * i11 * i10;
        int i13 = 4;
        byte[] bArr = new byte[i12 + 4];
        bArr[0] = (byte) (i11 & 255);
        bArr[1] = (byte) ((i11 >>> 8) & 255);
        bArr[2] = (byte) ((i11 >>> 16) & 255);
        bArr[3] = (byte) ((i11 >>> 24) & 255);
        for (int i14 = 0; i14 < this.numRows; i14++) {
            for (int i15 = 0; i15 < this.numColumns; i15++) {
                int i16 = 0;
                while (i16 < i3) {
                    bArr[i13] = (byte) (this.matrix[i14][i15] >>> i16);
                    i16 += 8;
                    i13++;
                }
            }
        }
        return bArr;
    }

    public int hashCode() {
        int hashCode = (((this.field.hashCode() * 31) + this.numRows) * 31) + this.numColumns;
        for (int i3 = 0; i3 < this.numRows; i3++) {
            for (int i10 = 0; i10 < this.numColumns; i10++) {
                hashCode = (hashCode * 31) + this.matrix[i3][i10];
            }
        }
        return hashCode;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public boolean isZero() {
        for (int i3 = 0; i3 < this.numRows; i3++) {
            for (int i10 = 0; i10 < this.numColumns; i10++) {
                if (this.matrix[i3][i10] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Vector leftMultiply(Vector vector) {
        throw new RuntimeException(StubApp.getString2(34847));
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Matrix rightMultiply(Matrix matrix) {
        throw new RuntimeException(StubApp.getString2(34847));
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public String toString() {
        String str = this.numRows + StubApp.getString2(24089) + this.numColumns + StubApp.getString2(34848) + this.field.toString() + StubApp.getString2(33987);
        for (int i3 = 0; i3 < this.numRows; i3++) {
            for (int i10 = 0; i10 < this.numColumns; i10++) {
                StringBuilder b2 = AbstractC1856e.b(str);
                b2.append(this.field.elementToStr(this.matrix[i3][i10]));
                b2.append(StubApp.getString2(8801));
                str = b2.toString();
            }
            str = AbstractC1482f.g(str, StubApp.getString2(3692));
        }
        return str;
    }

    public GF2mMatrix(GF2mField gF2mField, int[][] iArr) {
        this.field = gF2mField;
        this.matrix = iArr;
        this.numRows = iArr.length;
        this.numColumns = iArr[0].length;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Matrix rightMultiply(Permutation permutation) {
        throw new RuntimeException(StubApp.getString2(34847));
    }

    public GF2mMatrix(GF2mMatrix gF2mMatrix) {
        int i3 = gF2mMatrix.numRows;
        this.numRows = i3;
        this.numColumns = gF2mMatrix.numColumns;
        this.field = gF2mMatrix.field;
        this.matrix = new int[i3][];
        for (int i10 = 0; i10 < this.numRows; i10++) {
            this.matrix[i10] = IntUtils.clone(gF2mMatrix.matrix[i10]);
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Vector rightMultiply(Vector vector) {
        throw new RuntimeException(StubApp.getString2(34847));
    }
}
