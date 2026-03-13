package org.bouncycastle.cert.selector;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class MSOutlookKeyIdCalculator {

    public static abstract class GeneralDigest {
        private static final int BYTE_LENGTH = 64;
        private long byteCount;
        private byte[] xBuf;
        private int xBufOff;

        public GeneralDigest() {
            this.xBuf = new byte[4];
            this.xBufOff = 0;
        }

        public void copyIn(GeneralDigest generalDigest) {
            byte[] bArr = generalDigest.xBuf;
            System.arraycopy(bArr, 0, this.xBuf, 0, bArr.length);
            this.xBufOff = generalDigest.xBufOff;
            this.byteCount = generalDigest.byteCount;
        }

        public void finish() {
            long j = this.byteCount << 3;
            byte b2 = ByteCompanionObject.MIN_VALUE;
            while (true) {
                update(b2);
                if (this.xBufOff == 0) {
                    processLength(j);
                    processBlock();
                    return;
                }
                b2 = 0;
            }
        }

        public abstract void processBlock();

        public abstract void processLength(long j);

        public abstract void processWord(byte[] bArr, int i3);

        public void reset() {
            this.byteCount = 0L;
            this.xBufOff = 0;
            int i3 = 0;
            while (true) {
                byte[] bArr = this.xBuf;
                if (i3 >= bArr.length) {
                    return;
                }
                bArr[i3] = 0;
                i3++;
            }
        }

        public void update(byte b2) {
            byte[] bArr = this.xBuf;
            int i3 = this.xBufOff;
            int i10 = i3 + 1;
            this.xBufOff = i10;
            bArr[i3] = b2;
            if (i10 == bArr.length) {
                processWord(bArr, 0);
                this.xBufOff = 0;
            }
            this.byteCount++;
        }

        public GeneralDigest(GeneralDigest generalDigest) {
            this.xBuf = new byte[generalDigest.xBuf.length];
            copyIn(generalDigest);
        }

        public void update(byte[] bArr, int i3, int i10) {
            while (this.xBufOff != 0 && i10 > 0) {
                update(bArr[i3]);
                i3++;
                i10--;
            }
            while (i10 > this.xBuf.length) {
                processWord(bArr, i3);
                byte[] bArr2 = this.xBuf;
                i3 += bArr2.length;
                i10 -= bArr2.length;
                this.byteCount += bArr2.length;
            }
            while (i10 > 0) {
                update(bArr[i3]);
                i3++;
                i10--;
            }
        }
    }

    public static class SHA1Digest extends GeneralDigest {
        private static final int DIGEST_LENGTH = 20;

        /* renamed from: Y1, reason: collision with root package name */
        private static final int f18724Y1 = 1518500249;

        /* renamed from: Y2, reason: collision with root package name */
        private static final int f18725Y2 = 1859775393;

        /* renamed from: Y3, reason: collision with root package name */
        private static final int f18726Y3 = -1894007588;

        /* renamed from: Y4, reason: collision with root package name */
        private static final int f18727Y4 = -899497514;

        /* renamed from: H1, reason: collision with root package name */
        private int f18728H1;
        private int H2;

        /* renamed from: H3, reason: collision with root package name */
        private int f18729H3;

        /* renamed from: H4, reason: collision with root package name */
        private int f18730H4;

        /* renamed from: H5, reason: collision with root package name */
        private int f18731H5;

        /* renamed from: X, reason: collision with root package name */
        private int[] f18732X = new int[80];
        private int xOff;

        public SHA1Digest() {
            reset();
        }

        private int f(int i3, int i10, int i11) {
            return ((~i3) & i11) | (i10 & i3);
        }

        private int g(int i3, int i10, int i11) {
            return (i3 & (i10 | i11)) | (i10 & i11);
        }

        private int h(int i3, int i10, int i11) {
            return (i3 ^ i10) ^ i11;
        }

        public int doFinal(byte[] bArr, int i3) {
            finish();
            Pack.intToBigEndian(this.f18728H1, bArr, i3);
            Pack.intToBigEndian(this.H2, bArr, i3 + 4);
            Pack.intToBigEndian(this.f18729H3, bArr, i3 + 8);
            Pack.intToBigEndian(this.f18730H4, bArr, i3 + 12);
            Pack.intToBigEndian(this.f18731H5, bArr, i3 + 16);
            reset();
            return 20;
        }

        public String getAlgorithmName() {
            return StubApp.getString2(5778);
        }

        public int getDigestSize() {
            return 20;
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        public void processBlock() {
            for (int i3 = 16; i3 < 80; i3++) {
                int[] iArr = this.f18732X;
                int i10 = ((iArr[i3 - 3] ^ iArr[i3 - 8]) ^ iArr[i3 - 14]) ^ iArr[i3 - 16];
                iArr[i3] = (i10 >>> 31) | (i10 << 1);
            }
            int i11 = this.f18728H1;
            int i12 = this.H2;
            int i13 = this.f18729H3;
            int i14 = this.f18730H4;
            int i15 = this.f18731H5;
            int i16 = 0;
            for (int i17 = 0; i17 < 4; i17++) {
                int C10 = u.C(((i11 << 5) | (i11 >>> 27)) + f(i12, i13, i14), this.f18732X[i16], f18724Y1, i15);
                int i18 = (i12 >>> 2) | (i12 << 30);
                int C11 = u.C(((C10 << 5) | (C10 >>> 27)) + f(i11, i18, i13), this.f18732X[i16 + 1], f18724Y1, i14);
                int i19 = (i11 >>> 2) | (i11 << 30);
                int C12 = u.C(((C11 << 5) | (C11 >>> 27)) + f(C10, i19, i18), this.f18732X[i16 + 2], f18724Y1, i13);
                i15 = (C10 >>> 2) | (C10 << 30);
                int i20 = i16 + 4;
                i12 = u.C(((C12 << 5) | (C12 >>> 27)) + f(C11, i15, i19), this.f18732X[i16 + 3], f18724Y1, i18);
                i14 = (C11 >>> 2) | (C11 << 30);
                i16 += 5;
                i11 = u.C(((i12 << 5) | (i12 >>> 27)) + f(C12, i14, i15), this.f18732X[i20], f18724Y1, i19);
                i13 = (C12 >>> 2) | (C12 << 30);
            }
            for (int i21 = 0; i21 < 4; i21++) {
                int C13 = u.C(((i11 << 5) | (i11 >>> 27)) + h(i12, i13, i14), this.f18732X[i16], f18725Y2, i15);
                int i22 = (i12 >>> 2) | (i12 << 30);
                int C14 = u.C(((C13 << 5) | (C13 >>> 27)) + h(i11, i22, i13), this.f18732X[i16 + 1], f18725Y2, i14);
                int i23 = (i11 >>> 2) | (i11 << 30);
                int C15 = u.C(((C14 << 5) | (C14 >>> 27)) + h(C13, i23, i22), this.f18732X[i16 + 2], f18725Y2, i13);
                i15 = (C13 >>> 2) | (C13 << 30);
                int i24 = i16 + 4;
                i12 = u.C(((C15 << 5) | (C15 >>> 27)) + h(C14, i15, i23), this.f18732X[i16 + 3], f18725Y2, i22);
                i14 = (C14 >>> 2) | (C14 << 30);
                i16 += 5;
                i11 = u.C(((i12 << 5) | (i12 >>> 27)) + h(C15, i14, i15), this.f18732X[i24], f18725Y2, i23);
                i13 = (C15 >>> 2) | (C15 << 30);
            }
            for (int i25 = 0; i25 < 4; i25++) {
                int C16 = u.C(((i11 << 5) | (i11 >>> 27)) + g(i12, i13, i14), this.f18732X[i16], f18726Y3, i15);
                int i26 = (i12 >>> 2) | (i12 << 30);
                int C17 = u.C(((C16 << 5) | (C16 >>> 27)) + g(i11, i26, i13), this.f18732X[i16 + 1], f18726Y3, i14);
                int i27 = (i11 >>> 2) | (i11 << 30);
                int C18 = u.C(((C17 << 5) | (C17 >>> 27)) + g(C16, i27, i26), this.f18732X[i16 + 2], f18726Y3, i13);
                i15 = (C16 >>> 2) | (C16 << 30);
                int i28 = i16 + 4;
                i12 = u.C(((C18 << 5) | (C18 >>> 27)) + g(C17, i15, i27), this.f18732X[i16 + 3], f18726Y3, i26);
                i14 = (C17 >>> 2) | (C17 << 30);
                i16 += 5;
                i11 = u.C(((i12 << 5) | (i12 >>> 27)) + g(C18, i14, i15), this.f18732X[i28], f18726Y3, i27);
                i13 = (C18 >>> 2) | (C18 << 30);
            }
            for (int i29 = 0; i29 <= 3; i29++) {
                int C19 = u.C(((i11 << 5) | (i11 >>> 27)) + h(i12, i13, i14), this.f18732X[i16], f18727Y4, i15);
                int i30 = (i12 >>> 2) | (i12 << 30);
                int C20 = u.C(((C19 << 5) | (C19 >>> 27)) + h(i11, i30, i13), this.f18732X[i16 + 1], f18727Y4, i14);
                int i31 = (i11 >>> 2) | (i11 << 30);
                int C21 = u.C(((C20 << 5) | (C20 >>> 27)) + h(C19, i31, i30), this.f18732X[i16 + 2], f18727Y4, i13);
                i15 = (C19 >>> 2) | (C19 << 30);
                int i32 = i16 + 4;
                i12 = u.C(((C21 << 5) | (C21 >>> 27)) + h(C20, i15, i31), this.f18732X[i16 + 3], f18727Y4, i30);
                i14 = (C20 >>> 2) | (C20 << 30);
                i16 += 5;
                i11 = u.C(((i12 << 5) | (i12 >>> 27)) + h(C21, i14, i15), this.f18732X[i32], f18727Y4, i31);
                i13 = (C21 >>> 2) | (C21 << 30);
            }
            this.f18728H1 += i11;
            this.H2 += i12;
            this.f18729H3 += i13;
            this.f18730H4 += i14;
            this.f18731H5 += i15;
            this.xOff = 0;
            for (int i33 = 0; i33 < 16; i33++) {
                this.f18732X[i33] = 0;
            }
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        public void processLength(long j) {
            if (this.xOff > 14) {
                processBlock();
            }
            int[] iArr = this.f18732X;
            iArr[14] = (int) (j >>> 32);
            iArr[15] = (int) j;
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        public void processWord(byte[] bArr, int i3) {
            int i10 = (bArr[i3 + 3] & UByte.MAX_VALUE) | (bArr[i3] << 24) | ((bArr[i3 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i3 + 2] & UByte.MAX_VALUE) << 8);
            int[] iArr = this.f18732X;
            int i11 = this.xOff;
            iArr[i11] = i10;
            int i12 = i11 + 1;
            this.xOff = i12;
            if (i12 == 16) {
                processBlock();
            }
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        public void reset() {
            super.reset();
            this.f18728H1 = 1732584193;
            this.H2 = -271733879;
            this.f18729H3 = -1732584194;
            this.f18730H4 = 271733878;
            this.f18731H5 = -1009589776;
            this.xOff = 0;
            int i3 = 0;
            while (true) {
                int[] iArr = this.f18732X;
                if (i3 == iArr.length) {
                    return;
                }
                iArr[i3] = 0;
                i3++;
            }
        }
    }

    public static byte[] calculateKeyId(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        SHA1Digest sHA1Digest = new SHA1Digest();
        byte[] bArr = new byte[sHA1Digest.getDigestSize()];
        try {
            byte[] encoded = subjectPublicKeyInfo.getEncoded(StubApp.getString2("26791"));
            sHA1Digest.update(encoded, 0, encoded.length);
            sHA1Digest.doFinal(bArr, 0);
            return bArr;
        } catch (IOException unused) {
            return new byte[0];
        }
    }
}
