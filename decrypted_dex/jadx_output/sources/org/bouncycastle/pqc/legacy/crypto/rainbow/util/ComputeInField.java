package org.bouncycastle.pqc.legacy.crypto.rainbow.util;

import com.stub.StubApp;
import java.lang.reflect.Array;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ComputeInField {

    /* renamed from: A, reason: collision with root package name */
    private short[][] f19555A;

    /* renamed from: x, reason: collision with root package name */
    short[] f19556x;

    private void computeZerosAbove() throws RuntimeException {
        for (int length = this.f19555A.length - 1; length > 0; length--) {
            for (int i3 = length - 1; i3 >= 0; i3--) {
                short[][] sArr = this.f19555A;
                short s10 = sArr[i3][length];
                short invElem = GF2Field.invElem(sArr[length][length]);
                if (invElem == 0) {
                    throw new RuntimeException(StubApp.getString2(34793));
                }
                int i10 = length;
                while (true) {
                    short[][] sArr2 = this.f19555A;
                    if (i10 < sArr2.length * 2) {
                        short multElem = GF2Field.multElem(s10, GF2Field.multElem(sArr2[length][i10], invElem));
                        short[] sArr3 = this.f19555A[i3];
                        sArr3[i10] = GF2Field.addElem(sArr3[i10], multElem);
                        i10++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        r0 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void computeZerosUnder(boolean r10) throws java.lang.RuntimeException {
        /*
            r9 = this;
            if (r10 == 0) goto L8
            short[][] r10 = r9.f19555A
            int r10 = r10.length
            int r10 = r10 * 2
            goto Ld
        L8:
            short[][] r10 = r9.f19555A
            int r10 = r10.length
            int r10 = r10 + 1
        Ld:
            r0 = 0
        Le:
            short[][] r1 = r9.f19555A
            int r1 = r1.length
            int r1 = r1 + (-1)
            if (r0 >= r1) goto L5d
            int r1 = r0 + 1
            r2 = r1
        L18:
            short[][] r3 = r9.f19555A
            int r4 = r3.length
            if (r2 >= r4) goto L5b
            r4 = r3[r2]
            short r4 = r4[r0]
            r3 = r3[r0]
            short r3 = r3[r0]
            short r3 = org.bouncycastle.pqc.legacy.crypto.rainbow.util.GF2Field.invElem(r3)
            if (r3 == 0) goto L4e
            r5 = r0
        L2c:
            if (r5 >= r10) goto L4b
            short[][] r6 = r9.f19555A
            r6 = r6[r0]
            short r6 = r6[r5]
            short r6 = org.bouncycastle.pqc.legacy.crypto.rainbow.util.GF2Field.multElem(r6, r3)
            short r6 = org.bouncycastle.pqc.legacy.crypto.rainbow.util.GF2Field.multElem(r4, r6)
            short[][] r7 = r9.f19555A
            r7 = r7[r2]
            short r8 = r7[r5]
            short r6 = org.bouncycastle.pqc.legacy.crypto.rainbow.util.GF2Field.addElem(r8, r6)
            r7[r5] = r6
            int r5 = r5 + 1
            goto L2c
        L4b:
            int r2 = r2 + 1
            goto L18
        L4e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r0 = 34794(0x87ea, float:4.8757E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r10.<init>(r0)
            throw r10
        L5b:
            r0 = r1
            goto Le
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.legacy.crypto.rainbow.util.ComputeInField.computeZerosUnder(boolean):void");
    }

    private void substitute() throws IllegalStateException {
        short invElem = GF2Field.invElem(this.f19555A[r0.length - 1][r0.length - 1]);
        if (invElem == 0) {
            throw new IllegalStateException(StubApp.getString2(34796));
        }
        short[] sArr = this.f19556x;
        short[][] sArr2 = this.f19555A;
        sArr[sArr2.length - 1] = GF2Field.multElem(sArr2[sArr2.length - 1][sArr2.length], invElem);
        for (int length = this.f19555A.length - 2; length >= 0; length--) {
            short[][] sArr3 = this.f19555A;
            short s10 = sArr3[length][sArr3.length];
            for (int length2 = sArr3.length - 1; length2 > length; length2--) {
                s10 = GF2Field.addElem(s10, GF2Field.multElem(this.f19555A[length][length2], this.f19556x[length2]));
            }
            short invElem2 = GF2Field.invElem(this.f19555A[length][length]);
            if (invElem2 == 0) {
                throw new IllegalStateException(StubApp.getString2(34795));
            }
            this.f19556x[length] = GF2Field.multElem(s10, invElem2);
        }
    }

    public short[][] addSquareMatrix(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length || sArr[0].length != sArr2[0].length) {
            throw new RuntimeException(StubApp.getString2(34797));
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length);
        for (int i3 = 0; i3 < sArr.length; i3++) {
            for (int i10 = 0; i10 < sArr2.length; i10++) {
                sArr3[i3][i10] = GF2Field.addElem(sArr[i3][i10], sArr2[i3][i10]);
            }
        }
        return sArr3;
    }

    public short[] addVect(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            throw new RuntimeException(StubApp.getString2(34798));
        }
        int length = sArr.length;
        short[] sArr3 = new short[length];
        for (int i3 = 0; i3 < length; i3++) {
            sArr3[i3] = GF2Field.addElem(sArr[i3], sArr2[i3]);
        }
        return sArr3;
    }

    public short[][] inverse(short[][] sArr) {
        Class cls = Short.TYPE;
        try {
            int i3 = 0;
            this.f19555A = (short[][]) Array.newInstance((Class<?>) cls, sArr.length, sArr.length * 2);
            if (sArr.length != sArr[0].length) {
                throw new RuntimeException(StubApp.getString2("34799"));
            }
            for (int i10 = 0; i10 < sArr.length; i10++) {
                for (int i11 = 0; i11 < sArr.length; i11++) {
                    this.f19555A[i10][i11] = sArr[i10][i11];
                }
                for (int length = sArr.length; length < sArr.length * 2; length++) {
                    this.f19555A[i10][length] = 0;
                }
                short[][] sArr2 = this.f19555A;
                sArr2[i10][sArr2.length + i10] = 1;
            }
            computeZerosUnder(true);
            int i12 = 0;
            while (true) {
                short[][] sArr3 = this.f19555A;
                if (i12 >= sArr3.length) {
                    break;
                }
                short invElem = GF2Field.invElem(sArr3[i12][i12]);
                int i13 = i12;
                while (true) {
                    short[][] sArr4 = this.f19555A;
                    if (i13 < sArr4.length * 2) {
                        short[] sArr5 = sArr4[i12];
                        sArr5[i13] = GF2Field.multElem(sArr5[i13], invElem);
                        i13++;
                    }
                }
                i12++;
            }
            computeZerosAbove();
            short[][] sArr6 = this.f19555A;
            short[][] sArr7 = (short[][]) Array.newInstance((Class<?>) cls, sArr6.length, sArr6.length);
            while (true) {
                short[][] sArr8 = this.f19555A;
                if (i3 >= sArr8.length) {
                    return sArr7;
                }
                int length2 = sArr8.length;
                while (true) {
                    short[][] sArr9 = this.f19555A;
                    if (length2 < sArr9.length * 2) {
                        sArr7[i3][length2 - sArr9.length] = sArr9[i3][length2];
                        length2++;
                    }
                }
                i3++;
            }
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public short[][] multMatrix(short s10, short[][] sArr) {
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr[0].length);
        for (int i3 = 0; i3 < sArr.length; i3++) {
            for (int i10 = 0; i10 < sArr[0].length; i10++) {
                sArr2[i3][i10] = GF2Field.multElem(s10, sArr[i3][i10]);
            }
        }
        return sArr2;
    }

    public short[] multVect(short s10, short[] sArr) {
        int length = sArr.length;
        short[] sArr2 = new short[length];
        for (int i3 = 0; i3 < length; i3++) {
            sArr2[i3] = GF2Field.multElem(s10, sArr[i3]);
        }
        return sArr2;
    }

    public short[][] multVects(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            throw new RuntimeException(StubApp.getString2(34798));
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2.length);
        for (int i3 = 0; i3 < sArr.length; i3++) {
            for (int i10 = 0; i10 < sArr2.length; i10++) {
                sArr3[i3][i10] = GF2Field.multElem(sArr[i3], sArr2[i10]);
            }
        }
        return sArr3;
    }

    public short[] multiplyMatrix(short[][] sArr, short[] sArr2) throws RuntimeException {
        if (sArr[0].length != sArr2.length) {
            throw new RuntimeException(StubApp.getString2(34798));
        }
        short[] sArr3 = new short[sArr.length];
        for (int i3 = 0; i3 < sArr.length; i3++) {
            for (int i10 = 0; i10 < sArr2.length; i10++) {
                sArr3[i3] = GF2Field.addElem(sArr3[i3], GF2Field.multElem(sArr[i3][i10], sArr2[i10]));
            }
        }
        return sArr3;
    }

    public short[] solveEquation(short[][] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return null;
        }
        try {
            this.f19555A = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length + 1);
            this.f19556x = new short[sArr.length];
            for (int i3 = 0; i3 < sArr.length; i3++) {
                for (int i10 = 0; i10 < sArr[0].length; i10++) {
                    this.f19555A[i3][i10] = sArr[i3][i10];
                }
            }
            for (int i11 = 0; i11 < sArr2.length; i11++) {
                short[] sArr3 = this.f19555A[i11];
                sArr3[sArr2.length] = GF2Field.addElem(sArr2[i11], sArr3[sArr2.length]);
            }
            computeZerosUnder(false);
            substitute();
            return this.f19556x;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public short[][] multiplyMatrix(short[][] sArr, short[][] sArr2) throws RuntimeException {
        if (sArr[0].length != sArr2.length) {
            throw new RuntimeException(StubApp.getString2(34798));
        }
        this.f19555A = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2[0].length);
        for (int i3 = 0; i3 < sArr.length; i3++) {
            for (int i10 = 0; i10 < sArr2.length; i10++) {
                for (int i11 = 0; i11 < sArr2[0].length; i11++) {
                    short multElem = GF2Field.multElem(sArr[i3][i10], sArr2[i10][i11]);
                    short[] sArr3 = this.f19555A[i3];
                    sArr3[i11] = GF2Field.addElem(sArr3[i11], multElem);
                }
            }
        }
        return this.f19555A;
    }
}
