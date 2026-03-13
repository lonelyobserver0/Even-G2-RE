package org.bouncycastle.pqc.math.linearalgebra;

import com.stub.StubApp;
import java.security.SecureRandom;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GF2Vector extends Vector {

    /* renamed from: v, reason: collision with root package name */
    private int[] f19565v;

    public GF2Vector(int i3) {
        if (i3 < 0) {
            throw new ArithmeticException(StubApp.getString2(34831));
        }
        this.length = i3;
        this.f19565v = new int[(i3 + 31) >> 5];
    }

    public static GF2Vector OS2VP(int i3, byte[] bArr) {
        if (i3 < 0) {
            throw new ArithmeticException(StubApp.getString2(34833));
        }
        if (bArr.length <= ((i3 + 7) >> 3)) {
            return new GF2Vector(i3, LittleEndianConversions.toIntArray(bArr));
        }
        throw new ArithmeticException(StubApp.getString2(34809));
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public Vector add(Vector vector) {
        if (!(vector instanceof GF2Vector)) {
            throw new ArithmeticException(StubApp.getString2(34810));
        }
        GF2Vector gF2Vector = (GF2Vector) vector;
        if (this.length != gF2Vector.length) {
            throw new ArithmeticException(StubApp.getString2(34809));
        }
        int[] clone = IntUtils.clone(gF2Vector.f19565v);
        for (int length = clone.length - 1; length >= 0; length--) {
            clone[length] = clone[length] ^ this.f19565v[length];
        }
        return new GF2Vector(this.length, clone);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public boolean equals(Object obj) {
        if (!(obj instanceof GF2Vector)) {
            return false;
        }
        GF2Vector gF2Vector = (GF2Vector) obj;
        return this.length == gF2Vector.length && IntUtils.equals(this.f19565v, gF2Vector.f19565v);
    }

    public GF2Vector extractLeftVector(int i3) {
        int i10 = this.length;
        if (i3 > i10) {
            throw new ArithmeticException(StubApp.getString2(34834));
        }
        if (i3 == i10) {
            return new GF2Vector(this);
        }
        GF2Vector gF2Vector = new GF2Vector(i3);
        int i11 = i3 >> 5;
        int i12 = i3 & 31;
        System.arraycopy(this.f19565v, 0, gF2Vector.f19565v, 0, i11);
        if (i12 != 0) {
            gF2Vector.f19565v[i11] = ((1 << i12) - 1) & this.f19565v[i11];
        }
        return gF2Vector;
    }

    public GF2Vector extractRightVector(int i3) {
        int i10;
        int i11 = this.length;
        if (i3 > i11) {
            throw new ArithmeticException(StubApp.getString2(34834));
        }
        if (i3 == i11) {
            return new GF2Vector(this);
        }
        GF2Vector gF2Vector = new GF2Vector(i3);
        int i12 = this.length;
        int i13 = (i12 - i3) >> 5;
        int i14 = (i12 - i3) & 31;
        int i15 = (i3 + 31) >> 5;
        int i16 = 0;
        if (i14 == 0) {
            System.arraycopy(this.f19565v, i13, gF2Vector.f19565v, 0, i15);
            return gF2Vector;
        }
        while (true) {
            i10 = i15 - 1;
            if (i16 >= i10) {
                break;
            }
            int[] iArr = gF2Vector.f19565v;
            int[] iArr2 = this.f19565v;
            int i17 = i13 + 1;
            iArr[i16] = (iArr2[i13] >>> i14) | (iArr2[i17] << (32 - i14));
            i16++;
            i13 = i17;
        }
        int[] iArr3 = gF2Vector.f19565v;
        int[] iArr4 = this.f19565v;
        int i18 = i13 + 1;
        int i19 = iArr4[i13] >>> i14;
        iArr3[i10] = i19;
        if (i18 < iArr4.length) {
            iArr3[i10] = (iArr4[i18] << (32 - i14)) | i19;
        }
        return gF2Vector;
    }

    public GF2Vector extractVector(int[] iArr) {
        int length = iArr.length;
        if (iArr[length - 1] > this.length) {
            throw new ArithmeticException(StubApp.getString2(34835));
        }
        GF2Vector gF2Vector = new GF2Vector(length);
        for (int i3 = 0; i3 < length; i3++) {
            int[] iArr2 = this.f19565v;
            int i10 = iArr[i3];
            if ((iArr2[i10 >> 5] & (1 << (i10 & 31))) != 0) {
                int[] iArr3 = gF2Vector.f19565v;
                int i11 = i3 >> 5;
                iArr3[i11] = (1 << (i3 & 31)) | iArr3[i11];
            }
        }
        return gF2Vector;
    }

    public int getBit(int i3) {
        if (i3 >= this.length) {
            throw new IndexOutOfBoundsException();
        }
        int i10 = i3 >> 5;
        int i11 = i3 & 31;
        return (this.f19565v[i10] & (1 << i11)) >>> i11;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public byte[] getEncoded() {
        return LittleEndianConversions.toByteArray(this.f19565v, (this.length + 7) >> 3);
    }

    public int getHammingWeight() {
        int i3 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f19565v;
            if (i3 >= iArr.length) {
                return i10;
            }
            int i11 = iArr[i3];
            for (int i12 = 0; i12 < 32; i12++) {
                if ((i11 & 1) != 0) {
                    i10++;
                }
                i11 >>>= 1;
            }
            i3++;
        }
    }

    public int[] getVecArray() {
        return this.f19565v;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public int hashCode() {
        return Arrays.hashCode(this.f19565v) + (this.length * 31);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public boolean isZero() {
        for (int length = this.f19565v.length - 1; length >= 0; length--) {
            if (this.f19565v[length] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public Vector multiply(Permutation permutation) {
        int[] vector = permutation.getVector();
        int i3 = this.length;
        if (i3 != vector.length) {
            throw new ArithmeticException(StubApp.getString2(34809));
        }
        GF2Vector gF2Vector = new GF2Vector(i3);
        for (int i10 = 0; i10 < vector.length; i10++) {
            int[] iArr = this.f19565v;
            int i11 = vector[i10];
            if ((iArr[i11 >> 5] & (1 << (i11 & 31))) != 0) {
                int[] iArr2 = gF2Vector.f19565v;
                int i12 = i10 >> 5;
                iArr2[i12] = (1 << (i10 & 31)) | iArr2[i12];
            }
        }
        return gF2Vector;
    }

    public void setBit(int i3) {
        if (i3 >= this.length) {
            throw new IndexOutOfBoundsException();
        }
        int[] iArr = this.f19565v;
        int i10 = i3 >> 5;
        iArr[i10] = (1 << (i3 & 31)) | iArr[i10];
    }

    public GF2mVector toExtensionFieldVector(GF2mField gF2mField) {
        int degree = gF2mField.getDegree();
        int i3 = this.length;
        if (i3 % degree != 0) {
            throw new ArithmeticException(StubApp.getString2(34836));
        }
        int i10 = i3 / degree;
        int[] iArr = new int[i10];
        int i11 = 0;
        for (int i12 = i10 - 1; i12 >= 0; i12--) {
            for (int degree2 = gF2mField.getDegree() - 1; degree2 >= 0; degree2--) {
                if (((this.f19565v[i11 >>> 5] >>> (i11 & 31)) & 1) == 1) {
                    iArr[i12] = iArr[i12] ^ (1 << degree2);
                }
                i11++;
            }
        }
        return new GF2mVector(gF2mField, iArr);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < this.length; i3++) {
            if (i3 != 0 && (i3 & 31) == 0) {
                stringBuffer.append(' ');
            }
            stringBuffer.append((this.f19565v[i3 >> 5] & (1 << (i3 & 31))) == 0 ? '0' : '1');
        }
        return stringBuffer.toString();
    }

    public GF2Vector(int i3, int i10, SecureRandom secureRandom) {
        if (i10 > i3) {
            throw new ArithmeticException(StubApp.getString2(34832));
        }
        this.length = i3;
        this.f19565v = new int[(i3 + 31) >> 5];
        int[] iArr = new int[i3];
        for (int i11 = 0; i11 < i3; i11++) {
            iArr[i11] = i11;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int nextInt = RandUtils.nextInt(secureRandom, i3);
            setBit(iArr[nextInt]);
            i3--;
            iArr[nextInt] = iArr[i3];
        }
    }

    public GF2Vector(int i3, SecureRandom secureRandom) {
        this.length = i3;
        int i10 = (i3 + 31) >> 5;
        this.f19565v = new int[i10];
        int i11 = i10 - 1;
        for (int i12 = i11; i12 >= 0; i12--) {
            this.f19565v[i12] = secureRandom.nextInt();
        }
        int i13 = i3 & 31;
        if (i13 != 0) {
            int[] iArr = this.f19565v;
            iArr[i11] = ((1 << i13) - 1) & iArr[i11];
        }
    }

    public GF2Vector(int i3, int[] iArr) {
        if (i3 < 0) {
            throw new ArithmeticException(StubApp.getString2(34833));
        }
        this.length = i3;
        int i10 = (i3 + 31) >> 5;
        if (iArr.length != i10) {
            throw new ArithmeticException(StubApp.getString2(34809));
        }
        int[] clone = IntUtils.clone(iArr);
        this.f19565v = clone;
        int i11 = i3 & 31;
        if (i11 != 0) {
            int i12 = i10 - 1;
            clone[i12] = ((1 << i11) - 1) & clone[i12];
        }
    }

    public GF2Vector(GF2Vector gF2Vector) {
        this.length = gF2Vector.length;
        this.f19565v = IntUtils.clone(gF2Vector.f19565v);
    }

    public GF2Vector(int[] iArr, int i3) {
        this.f19565v = iArr;
        this.length = i3;
    }
}
