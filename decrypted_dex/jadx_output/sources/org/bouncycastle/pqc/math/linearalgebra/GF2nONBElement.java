package org.bouncycastle.pqc.math.linearalgebra;

import com.stub.StubApp;
import java.math.BigInteger;
import java.security.SecureRandom;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.time.DurationKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.util.Arrays;
import p0.AbstractC1482f;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GF2nONBElement extends GF2nElement {
    private static final int MAXLONG = 64;
    private int mBit;
    private int mLength;
    private long[] mPol;
    private static final long[] mBitmask = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 1073741824, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L, 1099511627776L, 2199023255552L, 4398046511104L, 8796093022208L, 17592186044416L, 35184372088832L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L, 1152921504606846976L, 2305843009213693952L, 4611686018427387904L, Long.MIN_VALUE};
    private static final long[] mMaxmask = {1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647L, BodyPartID.bodyIdMax, 8589934591L, 17179869183L, 34359738367L, 68719476735L, 137438953471L, 274877906943L, 549755813887L, 1099511627775L, 2199023255551L, 4398046511103L, 8796093022207L, 17592186044415L, 35184372088831L, 70368744177663L, 140737488355327L, 281474976710655L, 562949953421311L, 1125899906842623L, 2251799813685247L, 4503599627370495L, 9007199254740991L, 18014398509481983L, 36028797018963967L, 72057594037927935L, 144115188075855871L, 288230376151711743L, 576460752303423487L, 1152921504606846975L, 2305843009213693951L, DurationKt.MAX_MILLIS, LongCompanionObject.MAX_VALUE, -1};
    private static final int[] mIBY64 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};

    public GF2nONBElement(GF2nONBElement gF2nONBElement) {
        GF2nField gF2nField = gF2nONBElement.mField;
        this.mField = gF2nField;
        this.mDegree = gF2nField.getDegree();
        this.mLength = ((GF2nONBField) this.mField).getONBLength();
        this.mBit = ((GF2nONBField) this.mField).getONBBit();
        this.mPol = new long[this.mLength];
        assign(gF2nONBElement.getElement());
    }

    public static GF2nONBElement ONE(GF2nONBField gF2nONBField) {
        int oNBLength = gF2nONBField.getONBLength();
        long[] jArr = new long[oNBLength];
        int i3 = 0;
        while (true) {
            int i10 = oNBLength - 1;
            if (i3 >= i10) {
                jArr[i10] = mMaxmask[gF2nONBField.getONBBit() - 1];
                return new GF2nONBElement(gF2nONBField, jArr);
            }
            jArr[i3] = -1;
            i3++;
        }
    }

    public static GF2nONBElement ZERO(GF2nONBField gF2nONBField) {
        return new GF2nONBElement(gF2nONBField, new long[gF2nONBField.getONBLength()]);
    }

    private void assign(BigInteger bigInteger) {
        assign(bigInteger.toByteArray());
    }

    private long[] getElement() {
        long[] jArr = this.mPol;
        long[] jArr2 = new long[jArr.length];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        return jArr2;
    }

    private long[] getElementReverseOrder() {
        long[] jArr = new long[this.mPol.length];
        int i3 = 0;
        while (true) {
            if (i3 >= this.mDegree) {
                return jArr;
            }
            if (testBit((r2 - i3) - 1)) {
                int i10 = i3 >>> 6;
                jArr[i10] = jArr[i10] | mBitmask[i3 & 63];
            }
            i3++;
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public GFElement add(GFElement gFElement) throws RuntimeException {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.addToThis(gFElement);
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public void addToThis(GFElement gFElement) throws RuntimeException {
        if (!(gFElement instanceof GF2nONBElement)) {
            throw new RuntimeException();
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) gFElement;
        if (!this.mField.equals(gF2nONBElement.mField)) {
            throw new RuntimeException();
        }
        for (int i3 = 0; i3 < this.mLength; i3++) {
            long[] jArr = this.mPol;
            jArr[i3] = jArr[i3] ^ gF2nONBElement.mPol[i3];
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void assignOne() {
        int i3 = 0;
        while (true) {
            int i10 = this.mLength;
            if (i3 >= i10 - 1) {
                this.mPol[i10 - 1] = mMaxmask[this.mBit - 1];
                return;
            } else {
                this.mPol[i3] = -1;
                i3++;
            }
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void assignZero() {
        this.mPol = new long[this.mLength];
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement, org.bouncycastle.pqc.math.linearalgebra.GFElement
    public Object clone() {
        return new GF2nONBElement(this);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof GF2nONBElement)) {
            return false;
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) obj;
        for (int i3 = 0; i3 < this.mLength; i3++) {
            if (this.mPol[i3] != gF2nONBElement.mPol[i3]) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public int hashCode() {
        return Arrays.hashCode(this.mPol);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement increase() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.increaseThis();
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void increaseThis() {
        addToThis(ONE((GF2nONBField) this.mField));
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public GFElement invert() throws ArithmeticException {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.invertThis();
        return gF2nONBElement;
    }

    public void invertThis() throws ArithmeticException {
        if (isZero()) {
            throw new ArithmeticException();
        }
        int i3 = 31;
        boolean z2 = false;
        while (!z2 && i3 >= 0) {
            if (((this.mDegree - 1) & mBitmask[i3]) != 0) {
                z2 = true;
            }
            i3--;
        }
        ZERO((GF2nONBField) this.mField);
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        int i10 = 1;
        while (i3 >= 0) {
            GF2nElement gF2nElement = (GF2nElement) gF2nONBElement.clone();
            for (int i11 = 1; i11 <= i10; i11++) {
                gF2nElement.squareThis();
            }
            gF2nONBElement.multiplyThisBy(gF2nElement);
            i10 <<= 1;
            if (((this.mDegree - 1) & mBitmask[i3]) != 0) {
                gF2nONBElement.squareThis();
                gF2nONBElement.multiplyThisBy(this);
                i10++;
            }
            i3--;
        }
        gF2nONBElement.squareThis();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public boolean isOne() {
        int i3;
        boolean z2 = true;
        int i10 = 0;
        while (true) {
            i3 = this.mLength;
            if (i10 >= i3 - 1 || !z2) {
                break;
            }
            z2 = z2 && this.mPol[i10] == -1;
            i10++;
        }
        if (!z2) {
            return z2;
        }
        if (z2) {
            long j = this.mPol[i3 - 1];
            long[] jArr = mMaxmask;
            int i11 = this.mBit;
            if ((j & jArr[i11 - 1]) == jArr[i11 - 1]) {
                return true;
            }
        }
        return false;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public boolean isZero() {
        boolean z2 = true;
        for (int i3 = 0; i3 < this.mLength && z2; i3++) {
            z2 = z2 && this.mPol[i3] == 0;
        }
        return z2;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public GFElement multiply(GFElement gFElement) throws RuntimeException {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.multiplyThisBy(gFElement);
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public void multiplyThisBy(GFElement gFElement) throws RuntimeException {
        char c10;
        if (!(gFElement instanceof GF2nONBElement)) {
            throw new RuntimeException(StubApp.getString2(34856));
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) gFElement;
        if (!this.mField.equals(gF2nONBElement.mField)) {
            throw new RuntimeException();
        }
        if (equals(gFElement)) {
            squareThis();
            return;
        }
        long[] jArr = this.mPol;
        long[] jArr2 = gF2nONBElement.mPol;
        int i3 = this.mLength;
        long[] jArr3 = new long[i3];
        int[][] iArr = ((GF2nONBField) this.mField).mMult;
        int i10 = i3 - 1;
        char c11 = 1;
        int i11 = this.mBit - 1;
        long[] jArr4 = mBitmask;
        long j = jArr4[63];
        long j3 = jArr4[i11];
        int i12 = 0;
        while (i12 < this.mDegree) {
            int i13 = 0;
            boolean z2 = false;
            while (i13 < this.mDegree) {
                int[] iArr2 = mIBY64;
                int i14 = iArr2[i13];
                int[] iArr3 = iArr[i13];
                int i15 = iArr3[0];
                int i16 = iArr2[i15];
                int i17 = i15 & 63;
                long j10 = jArr[i14];
                long[] jArr5 = mBitmask;
                if ((j10 & jArr5[i13 & 63]) != 0) {
                    if ((jArr2[i16] & jArr5[i17]) != 0) {
                        z2 = !z2;
                    }
                    int i18 = iArr3[c11];
                    if (i18 != -1 && (jArr2[iArr2[i18]] & jArr5[i18 & 63]) != 0) {
                        z2 = !z2;
                    }
                }
                i13++;
                c11 = 1;
            }
            int i19 = mIBY64[i12];
            int i20 = i12 & 63;
            if (z2) {
                jArr3[i19] = jArr3[i19] ^ mBitmask[i20];
            }
            if (this.mLength > 1) {
                boolean z10 = (jArr[i10] & 1) == 1;
                int i21 = i3 - 2;
                int i22 = i21;
                while (i22 >= 0) {
                    long j11 = jArr[i22];
                    boolean z11 = (j11 & 1) != 0;
                    long j12 = j11 >>> 1;
                    jArr[i22] = j12;
                    if (z10) {
                        jArr[i22] = j12 ^ j;
                    }
                    i22--;
                    z10 = z11;
                }
                long j13 = jArr[i10] >>> 1;
                jArr[i10] = j13;
                if (z10) {
                    jArr[i10] = j13 ^ j3;
                }
                boolean z12 = (jArr2[i10] & 1) == 1;
                while (i21 >= 0) {
                    long j14 = jArr2[i21];
                    boolean z13 = (j14 & 1) != 0;
                    long j15 = j14 >>> 1;
                    jArr2[i21] = j15;
                    if (z12) {
                        jArr2[i21] = j15 ^ j;
                    }
                    i21--;
                    z12 = z13;
                }
                long j16 = jArr2[i10] >>> 1;
                jArr2[i10] = j16;
                if (z12) {
                    jArr2[i10] = j16 ^ j3;
                }
                c10 = 1;
            } else {
                long j17 = jArr[0];
                boolean z14 = (j17 & 1) == 1;
                long j18 = j17 >>> 1;
                jArr[0] = j18;
                if (z14) {
                    jArr[0] = j18 ^ j3;
                }
                long j19 = jArr2[0];
                boolean z15 = (j19 & 1) == 1;
                c10 = 1;
                long j20 = j19 >>> 1;
                jArr2[0] = j20;
                if (z15) {
                    jArr2[0] = j20 ^ j3;
                }
            }
            i12++;
            c11 = c10;
        }
        assign(jArr3);
    }

    public void reverseOrder() {
        this.mPol = getElementReverseOrder();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement solveQuadraticEquation() throws RuntimeException {
        int i3;
        if (trace() == 1) {
            throw new RuntimeException();
        }
        long j = mBitmask[63];
        long[] jArr = new long[this.mLength];
        int i10 = 0;
        long j3 = 0;
        while (true) {
            i3 = this.mLength;
            if (i10 >= i3 - 1) {
                break;
            }
            for (int i11 = 1; i11 < 64; i11++) {
                long[] jArr2 = mBitmask;
                long j10 = jArr2[i11];
                long j11 = this.mPol[i10];
                if (((j10 & j11) == 0 || (j3 & jArr2[i11 - 1]) == 0) && ((j11 & j10) != 0 || (jArr2[i11 - 1] & j3) != 0)) {
                    j3 ^= j10;
                }
            }
            jArr[i10] = j3;
            long j12 = j3 & j;
            j3 = ((j12 == 0 || (this.mPol[i10 + 1] & 1) != 1) && !(j12 == 0 && (this.mPol[i10 + 1] & 1) == 0)) ? 1L : 0L;
            i10++;
        }
        int i12 = 63 & this.mDegree;
        long j13 = this.mPol[i3 - 1];
        for (int i13 = 1; i13 < i12; i13++) {
            long[] jArr3 = mBitmask;
            long j14 = jArr3[i13];
            if (((j14 & j13) == 0 || (jArr3[i13 - 1] & j3) == 0) && ((j14 & j13) != 0 || (jArr3[i13 - 1] & j3) != 0)) {
                j3 ^= j14;
            }
        }
        jArr[this.mLength - 1] = j3;
        return new GF2nONBElement((GF2nONBField) this.mField, jArr);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement square() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.squareThis();
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement squareRoot() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.squareRootThis();
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void squareRootThis() {
        long[] element = getElement();
        int i3 = this.mLength - 1;
        int i10 = this.mBit - 1;
        long j = mBitmask[63];
        boolean z2 = (element[0] & 1) != 0;
        int i11 = i3;
        while (i11 >= 0) {
            long j3 = element[i11];
            boolean z10 = (j3 & 1) != 0;
            long j10 = j3 >>> 1;
            element[i11] = j10;
            if (z2) {
                if (i11 == i3) {
                    element[i11] = j10 ^ mBitmask[i10];
                } else {
                    element[i11] = j10 ^ j;
                }
            }
            i11--;
            z2 = z10;
        }
        assign(element);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void squareThis() {
        long[] element = getElement();
        int i3 = this.mLength - 1;
        int i10 = this.mBit;
        int i11 = i10 - 1;
        long[] jArr = mBitmask;
        long j = jArr[63];
        boolean z2 = (element[i3] & jArr[i11]) != 0;
        int i12 = 0;
        while (i12 < i3) {
            long j3 = element[i12];
            boolean z10 = (j3 & j) != 0;
            long j10 = j3 << 1;
            element[i12] = j10;
            if (z2) {
                element[i12] = 1 ^ j10;
            }
            i12++;
            z2 = z10;
        }
        long j11 = element[i3];
        long[] jArr2 = mBitmask;
        boolean z11 = (jArr2[i11] & j11) != 0;
        long j12 = j11 << 1;
        element[i3] = j12;
        if (z2) {
            element[i3] = j12 ^ 1;
        }
        if (z11) {
            element[i3] = jArr2[i10] ^ element[i3];
        }
        assign(element);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public boolean testBit(int i3) {
        return i3 >= 0 && i3 <= this.mDegree && (this.mPol[i3 >>> 6] & mBitmask[i3 & 63]) != 0;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public boolean testRightmostBit() {
        return (this.mPol[this.mLength - 1] & mBitmask[this.mBit - 1]) != 0;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public byte[] toByteArray() {
        int i3 = ((this.mDegree - 1) >> 3) + 1;
        byte[] bArr = new byte[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            int i11 = (i10 & 7) << 3;
            bArr[(i3 - i10) - 1] = (byte) ((this.mPol[i10 >>> 3] & (255 << i11)) >>> i11);
        }
        return bArr;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public BigInteger toFlexiBigInt() {
        return new BigInteger(1, toByteArray());
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public String toString() {
        return toString(16);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public int trace() {
        int i3 = this.mLength - 1;
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            for (int i12 = 0; i12 < 64; i12++) {
                if ((this.mPol[i11] & mBitmask[i12]) != 0) {
                    i10 ^= 1;
                }
            }
        }
        int i13 = this.mBit;
        for (int i14 = 0; i14 < i13; i14++) {
            if ((this.mPol[i3] & mBitmask[i14]) != 0) {
                i10 ^= 1;
            }
        }
        return i10;
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, BigInteger bigInteger) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = new long[this.mLength];
        assign(bigInteger);
    }

    private void assign(byte[] bArr) {
        this.mPol = new long[this.mLength];
        for (int i3 = 0; i3 < bArr.length; i3++) {
            long[] jArr = this.mPol;
            int i10 = i3 >>> 3;
            jArr[i10] = jArr[i10] | ((bArr[(bArr.length - 1) - i3] & 255) << ((i3 & 7) << 3));
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public String toString(int i3) {
        String string2;
        String string22;
        long[] element = getElement();
        int i10 = this.mBit;
        String str = "";
        if (i3 == 2) {
            while (true) {
                i10--;
                string2 = StubApp.getString2(878);
                string22 = StubApp.getString2(824);
                if (i10 < 0) {
                    break;
                }
                str = (element[element.length + (-1)] & (1 << i10)) == 0 ? AbstractC1482f.g(str, string22) : AbstractC1482f.g(str, string2);
            }
            for (int length = element.length - 2; length >= 0; length--) {
                for (int i11 = 63; i11 >= 0; i11--) {
                    str = (element[length] & mBitmask[i11]) == 0 ? AbstractC1482f.g(str, string22) : AbstractC1482f.g(str, string2);
                }
            }
            return str;
        }
        if (i3 == 16) {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            for (int length2 = element.length - 1; length2 >= 0; length2--) {
                StringBuilder b2 = AbstractC1856e.b(str);
                b2.append(cArr[((int) (element[length2] >>> 60)) & 15]);
                StringBuilder b10 = AbstractC1856e.b(b2.toString());
                b10.append(cArr[((int) (element[length2] >>> 56)) & 15]);
                StringBuilder b11 = AbstractC1856e.b(b10.toString());
                b11.append(cArr[((int) (element[length2] >>> 52)) & 15]);
                StringBuilder b12 = AbstractC1856e.b(b11.toString());
                b12.append(cArr[((int) (element[length2] >>> 48)) & 15]);
                StringBuilder b13 = AbstractC1856e.b(b12.toString());
                b13.append(cArr[((int) (element[length2] >>> 44)) & 15]);
                StringBuilder b14 = AbstractC1856e.b(b13.toString());
                b14.append(cArr[((int) (element[length2] >>> 40)) & 15]);
                StringBuilder b15 = AbstractC1856e.b(b14.toString());
                b15.append(cArr[((int) (element[length2] >>> 36)) & 15]);
                StringBuilder b16 = AbstractC1856e.b(b15.toString());
                b16.append(cArr[((int) (element[length2] >>> 32)) & 15]);
                StringBuilder b17 = AbstractC1856e.b(b16.toString());
                b17.append(cArr[((int) (element[length2] >>> 28)) & 15]);
                StringBuilder b18 = AbstractC1856e.b(b17.toString());
                b18.append(cArr[((int) (element[length2] >>> 24)) & 15]);
                StringBuilder b19 = AbstractC1856e.b(b18.toString());
                b19.append(cArr[((int) (element[length2] >>> 20)) & 15]);
                StringBuilder b20 = AbstractC1856e.b(b19.toString());
                b20.append(cArr[((int) (element[length2] >>> 16)) & 15]);
                StringBuilder b21 = AbstractC1856e.b(b20.toString());
                b21.append(cArr[((int) (element[length2] >>> 12)) & 15]);
                StringBuilder b22 = AbstractC1856e.b(b21.toString());
                b22.append(cArr[((int) (element[length2] >>> 8)) & 15]);
                StringBuilder b23 = AbstractC1856e.b(b22.toString());
                b23.append(cArr[((int) (element[length2] >>> 4)) & 15]);
                StringBuilder b24 = AbstractC1856e.b(b23.toString());
                b24.append(cArr[((int) element[length2]) & 15]);
                str = AbstractC1482f.g(b24.toString(), StubApp.getString2(397));
            }
        }
        return str;
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, SecureRandom secureRandom) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        int i3 = this.mLength;
        long[] jArr = new long[i3];
        this.mPol = jArr;
        if (i3 <= 1) {
            jArr[0] = secureRandom.nextLong();
            long[] jArr2 = this.mPol;
            jArr2[0] = jArr2[0] >>> (64 - this.mBit);
        } else {
            for (int i10 = 0; i10 < this.mLength - 1; i10++) {
                this.mPol[i10] = secureRandom.nextLong();
            }
            this.mPol[this.mLength - 1] = secureRandom.nextLong() >>> (64 - this.mBit);
        }
    }

    private void assign(long[] jArr) {
        System.arraycopy(jArr, 0, this.mPol, 0, this.mLength);
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, byte[] bArr) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = new long[this.mLength];
        assign(bArr);
    }

    private GF2nONBElement(GF2nONBField gF2nONBField, long[] jArr) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = jArr;
    }
}
