package org.bouncycastle.crypto.digests;

import com.stub.StubApp;
import i2.u;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SHA1Digest extends GeneralDigest implements EncodableDigest {
    private static final int DIGEST_LENGTH = 20;

    /* renamed from: Y1, reason: collision with root package name */
    private static final int f18851Y1 = 1518500249;

    /* renamed from: Y2, reason: collision with root package name */
    private static final int f18852Y2 = 1859775393;

    /* renamed from: Y3, reason: collision with root package name */
    private static final int f18853Y3 = -1894007588;

    /* renamed from: Y4, reason: collision with root package name */
    private static final int f18854Y4 = -899497514;

    /* renamed from: H1, reason: collision with root package name */
    private int f18855H1;
    private int H2;

    /* renamed from: H3, reason: collision with root package name */
    private int f18856H3;

    /* renamed from: H4, reason: collision with root package name */
    private int f18857H4;

    /* renamed from: H5, reason: collision with root package name */
    private int f18858H5;

    /* renamed from: X, reason: collision with root package name */
    private int[] f18859X;
    private int xOff;

    public SHA1Digest() {
        this(CryptoServicePurpose.ANY);
    }

    private void copyIn(SHA1Digest sHA1Digest) {
        this.f18855H1 = sHA1Digest.f18855H1;
        this.H2 = sHA1Digest.H2;
        this.f18856H3 = sHA1Digest.f18856H3;
        this.f18857H4 = sHA1Digest.f18857H4;
        this.f18858H5 = sHA1Digest.f18858H5;
        int[] iArr = sHA1Digest.f18859X;
        System.arraycopy(iArr, 0, this.f18859X, 0, iArr.length);
        this.xOff = sHA1Digest.xOff;
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

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA1Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, 128, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i3) {
        finish();
        Pack.intToBigEndian(this.f18855H1, bArr, i3);
        Pack.intToBigEndian(this.H2, bArr, i3 + 4);
        Pack.intToBigEndian(this.f18856H3, bArr, i3 + 8);
        Pack.intToBigEndian(this.f18857H4, bArr, i3 + 12);
        Pack.intToBigEndian(this.f18858H5, bArr, i3 + 16);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return StubApp.getString2(5778);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        int i3 = this.xOff * 4;
        byte[] bArr = new byte[i3 + 41];
        super.populateState(bArr);
        Pack.intToBigEndian(this.f18855H1, bArr, 16);
        Pack.intToBigEndian(this.H2, bArr, 20);
        Pack.intToBigEndian(this.f18856H3, bArr, 24);
        Pack.intToBigEndian(this.f18857H4, bArr, 28);
        Pack.intToBigEndian(this.f18858H5, bArr, 32);
        Pack.intToBigEndian(this.xOff, bArr, 36);
        for (int i10 = 0; i10 != this.xOff; i10++) {
            Pack.intToBigEndian(this.f18859X[i10], bArr, (i10 * 4) + 40);
        }
        bArr[i3 + 40] = (byte) this.purpose.ordinal();
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        for (int i3 = 16; i3 < 80; i3++) {
            int[] iArr = this.f18859X;
            int i10 = ((iArr[i3 - 3] ^ iArr[i3 - 8]) ^ iArr[i3 - 14]) ^ iArr[i3 - 16];
            iArr[i3] = (i10 >>> 31) | (i10 << 1);
        }
        int i11 = this.f18855H1;
        int i12 = this.H2;
        int i13 = this.f18856H3;
        int i14 = this.f18857H4;
        int i15 = this.f18858H5;
        int i16 = 0;
        for (int i17 = 0; i17 < 4; i17++) {
            int C10 = u.C(((i11 << 5) | (i11 >>> 27)) + f(i12, i13, i14), this.f18859X[i16], f18851Y1, i15);
            int i18 = (i12 >>> 2) | (i12 << 30);
            int C11 = u.C(((C10 << 5) | (C10 >>> 27)) + f(i11, i18, i13), this.f18859X[i16 + 1], f18851Y1, i14);
            int i19 = (i11 >>> 2) | (i11 << 30);
            int C12 = u.C(((C11 << 5) | (C11 >>> 27)) + f(C10, i19, i18), this.f18859X[i16 + 2], f18851Y1, i13);
            i15 = (C10 >>> 2) | (C10 << 30);
            int i20 = i16 + 4;
            i12 = u.C(((C12 << 5) | (C12 >>> 27)) + f(C11, i15, i19), this.f18859X[i16 + 3], f18851Y1, i18);
            i14 = (C11 >>> 2) | (C11 << 30);
            i16 += 5;
            i11 = u.C(((i12 << 5) | (i12 >>> 27)) + f(C12, i14, i15), this.f18859X[i20], f18851Y1, i19);
            i13 = (C12 >>> 2) | (C12 << 30);
        }
        for (int i21 = 0; i21 < 4; i21++) {
            int C13 = u.C(((i11 << 5) | (i11 >>> 27)) + h(i12, i13, i14), this.f18859X[i16], f18852Y2, i15);
            int i22 = (i12 >>> 2) | (i12 << 30);
            int C14 = u.C(((C13 << 5) | (C13 >>> 27)) + h(i11, i22, i13), this.f18859X[i16 + 1], f18852Y2, i14);
            int i23 = (i11 >>> 2) | (i11 << 30);
            int C15 = u.C(((C14 << 5) | (C14 >>> 27)) + h(C13, i23, i22), this.f18859X[i16 + 2], f18852Y2, i13);
            i15 = (C13 >>> 2) | (C13 << 30);
            int i24 = i16 + 4;
            i12 = u.C(((C15 << 5) | (C15 >>> 27)) + h(C14, i15, i23), this.f18859X[i16 + 3], f18852Y2, i22);
            i14 = (C14 >>> 2) | (C14 << 30);
            i16 += 5;
            i11 = u.C(((i12 << 5) | (i12 >>> 27)) + h(C15, i14, i15), this.f18859X[i24], f18852Y2, i23);
            i13 = (C15 >>> 2) | (C15 << 30);
        }
        for (int i25 = 0; i25 < 4; i25++) {
            int C16 = u.C(((i11 << 5) | (i11 >>> 27)) + g(i12, i13, i14), this.f18859X[i16], f18853Y3, i15);
            int i26 = (i12 >>> 2) | (i12 << 30);
            int C17 = u.C(((C16 << 5) | (C16 >>> 27)) + g(i11, i26, i13), this.f18859X[i16 + 1], f18853Y3, i14);
            int i27 = (i11 >>> 2) | (i11 << 30);
            int C18 = u.C(((C17 << 5) | (C17 >>> 27)) + g(C16, i27, i26), this.f18859X[i16 + 2], f18853Y3, i13);
            i15 = (C16 >>> 2) | (C16 << 30);
            int i28 = i16 + 4;
            i12 = u.C(((C18 << 5) | (C18 >>> 27)) + g(C17, i15, i27), this.f18859X[i16 + 3], f18853Y3, i26);
            i14 = (C17 >>> 2) | (C17 << 30);
            i16 += 5;
            i11 = u.C(((i12 << 5) | (i12 >>> 27)) + g(C18, i14, i15), this.f18859X[i28], f18853Y3, i27);
            i13 = (C18 >>> 2) | (C18 << 30);
        }
        for (int i29 = 0; i29 <= 3; i29++) {
            int C19 = u.C(((i11 << 5) | (i11 >>> 27)) + h(i12, i13, i14), this.f18859X[i16], f18854Y4, i15);
            int i30 = (i12 >>> 2) | (i12 << 30);
            int C20 = u.C(((C19 << 5) | (C19 >>> 27)) + h(i11, i30, i13), this.f18859X[i16 + 1], f18854Y4, i14);
            int i31 = (i11 >>> 2) | (i11 << 30);
            int C21 = u.C(((C20 << 5) | (C20 >>> 27)) + h(C19, i31, i30), this.f18859X[i16 + 2], f18854Y4, i13);
            i15 = (C19 >>> 2) | (C19 << 30);
            int i32 = i16 + 4;
            i12 = u.C(((C21 << 5) | (C21 >>> 27)) + h(C20, i15, i31), this.f18859X[i16 + 3], f18854Y4, i30);
            i14 = (C20 >>> 2) | (C20 << 30);
            i16 += 5;
            i11 = u.C(((i12 << 5) | (i12 >>> 27)) + h(C21, i14, i15), this.f18859X[i32], f18854Y4, i31);
            i13 = (C21 >>> 2) | (C21 << 30);
        }
        this.f18855H1 += i11;
        this.H2 += i12;
        this.f18856H3 += i13;
        this.f18857H4 += i14;
        this.f18858H5 += i15;
        this.xOff = 0;
        for (int i33 = 0; i33 < 16; i33++) {
            this.f18859X[i33] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.f18859X;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i3) {
        this.f18859X[this.xOff] = Pack.bigEndianToInt(bArr, i3);
        int i10 = this.xOff + 1;
        this.xOff = i10;
        if (i10 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f18855H1 = 1732584193;
        this.H2 = -271733879;
        this.f18856H3 = -1732584194;
        this.f18857H4 = 271733878;
        this.f18858H5 = -1009589776;
        this.xOff = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.f18859X;
            if (i3 == iArr.length) {
                return;
            }
            iArr[i3] = 0;
            i3++;
        }
    }

    public SHA1Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        this.f18859X = new int[80];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        reset();
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SHA1Digest sHA1Digest = (SHA1Digest) memoable;
        super.copyIn((GeneralDigest) sHA1Digest);
        copyIn(sHA1Digest);
    }

    public SHA1Digest(SHA1Digest sHA1Digest) {
        super(sHA1Digest);
        this.f18859X = new int[80];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        copyIn(sHA1Digest);
    }

    public SHA1Digest(byte[] bArr) {
        super(bArr);
        this.f18859X = new int[80];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        this.f18855H1 = Pack.bigEndianToInt(bArr, 16);
        this.H2 = Pack.bigEndianToInt(bArr, 20);
        this.f18856H3 = Pack.bigEndianToInt(bArr, 24);
        this.f18857H4 = Pack.bigEndianToInt(bArr, 28);
        this.f18858H5 = Pack.bigEndianToInt(bArr, 32);
        this.xOff = Pack.bigEndianToInt(bArr, 36);
        for (int i3 = 0; i3 != this.xOff; i3++) {
            this.f18859X[i3] = Pack.bigEndianToInt(bArr, (i3 * 4) + 40);
        }
    }
}
