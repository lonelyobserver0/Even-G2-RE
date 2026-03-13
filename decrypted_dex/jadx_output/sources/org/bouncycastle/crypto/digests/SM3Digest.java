package org.bouncycastle.crypto.digests;

import com.stub.StubApp;
import i2.u;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SM3Digest extends GeneralDigest {
    private static final int BLOCK_SIZE = 16;
    private static final int DIGEST_LENGTH = 32;

    /* renamed from: T, reason: collision with root package name */
    private static final int[] f18878T = new int[64];

    /* renamed from: V, reason: collision with root package name */
    private int[] f18879V;

    /* renamed from: W, reason: collision with root package name */
    private int[] f18880W;
    private int[] inwords;
    private int xOff;

    static {
        int i3;
        int i10 = 0;
        while (true) {
            if (i10 >= 16) {
                break;
            }
            f18878T[i10] = (2043430169 >>> (32 - i10)) | (2043430169 << i10);
            i10++;
        }
        for (i3 = 16; i3 < 64; i3++) {
            int i11 = i3 % 32;
            f18878T[i3] = (2055708042 >>> (32 - i11)) | (2055708042 << i11);
        }
    }

    public SM3Digest() {
        this(CryptoServicePurpose.ANY);
    }

    private int FF0(int i3, int i10, int i11) {
        return (i3 ^ i10) ^ i11;
    }

    private int FF1(int i3, int i10, int i11) {
        return (i3 & (i10 | i11)) | (i10 & i11);
    }

    private int GG0(int i3, int i10, int i11) {
        return (i3 ^ i10) ^ i11;
    }

    private int GG1(int i3, int i10, int i11) {
        return ((~i3) & i11) | (i10 & i3);
    }

    private int P0(int i3) {
        return (i3 ^ ((i3 << 9) | (i3 >>> 23))) ^ ((i3 << 17) | (i3 >>> 15));
    }

    private int P1(int i3) {
        return (i3 ^ ((i3 << 15) | (i3 >>> 17))) ^ ((i3 << 23) | (i3 >>> 9));
    }

    private void copyIn(SM3Digest sM3Digest) {
        int[] iArr = sM3Digest.f18879V;
        int[] iArr2 = this.f18879V;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = sM3Digest.inwords;
        int[] iArr4 = this.inwords;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.xOff = sM3Digest.xOff;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SM3Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, 256, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i3) {
        finish();
        Pack.intToBigEndian(this.f18879V, bArr, i3);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return StubApp.getString2(28189);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int i3;
        int i10 = 0;
        while (true) {
            i3 = 16;
            if (i10 >= 16) {
                break;
            }
            this.f18880W[i10] = this.inwords[i10];
            i10++;
        }
        for (int i11 = 16; i11 < 68; i11++) {
            int[] iArr = this.f18880W;
            int i12 = iArr[i11 - 3];
            int i13 = iArr[i11 - 13];
            iArr[i11] = (P1(((i12 >>> 17) | (i12 << 15)) ^ (iArr[i11 - 16] ^ iArr[i11 - 9])) ^ ((i13 >>> 25) | (i13 << 7))) ^ this.f18880W[i11 - 6];
        }
        int[] iArr2 = this.f18879V;
        int i14 = iArr2[0];
        int i15 = iArr2[1];
        int i16 = iArr2[2];
        char c10 = 3;
        int i17 = iArr2[3];
        char c11 = 4;
        int i18 = iArr2[4];
        char c12 = 5;
        int i19 = iArr2[5];
        char c13 = 6;
        int i20 = iArr2[6];
        int i21 = iArr2[7];
        int i22 = i20;
        int i23 = 0;
        while (i23 < i3) {
            int i24 = (i14 << 12) | (i14 >>> 20);
            int i25 = i24 + i18 + f18878T[i23];
            int i26 = (i25 << 7) | (i25 >>> 25);
            char c14 = c10;
            int i27 = i26 ^ i24;
            char c15 = c11;
            int[] iArr3 = this.f18880W;
            char c16 = c12;
            int i28 = iArr3[i23];
            int C10 = u.C(FF0(i14, i15, i16), i17, i27, iArr3[i23 + 4] ^ i28);
            int C11 = u.C(GG0(i18, i19, i22), i21, i26, i28);
            int i29 = (i15 << 9) | (i15 >>> 23);
            int i30 = (i19 << 19) | (i19 >>> 13);
            i23++;
            i17 = i16;
            i19 = i18;
            c11 = c15;
            c12 = c16;
            c13 = c13;
            i18 = P0(C11);
            i16 = i29;
            i21 = i22;
            i22 = i30;
            i3 = 16;
            i15 = i14;
            i14 = C10;
            c10 = c14;
        }
        char c17 = c10;
        char c18 = c11;
        char c19 = c12;
        char c20 = c13;
        int i31 = i21;
        int i32 = i22;
        int i33 = i14;
        int i34 = 16;
        while (i34 < 64) {
            int i35 = (i33 << 12) | (i33 >>> 20);
            int i36 = i35 + i18 + f18878T[i34];
            int i37 = (i36 >>> 25) | (i36 << 7);
            int[] iArr4 = this.f18880W;
            int i38 = iArr4[i34];
            int C12 = u.C(FF1(i33, i15, i16), i17, i35 ^ i37, iArr4[i34 + 4] ^ i38);
            int C13 = u.C(GG1(i18, i19, i32), i31, i37, i38);
            int i39 = (i19 << 19) | (i19 >>> 13);
            i34++;
            i17 = i16;
            i19 = i18;
            i18 = P0(C13);
            i16 = (i15 >>> 23) | (i15 << 9);
            i31 = i32;
            i15 = i33;
            i33 = C12;
            i32 = i39;
        }
        int[] iArr5 = this.f18879V;
        iArr5[0] = i33 ^ iArr5[0];
        iArr5[1] = iArr5[1] ^ i15;
        iArr5[2] = iArr5[2] ^ i16;
        iArr5[c17] = iArr5[c17] ^ i17;
        iArr5[c18] = iArr5[c18] ^ i18;
        iArr5[c19] = iArr5[c19] ^ i19;
        iArr5[c20] = i32 ^ iArr5[c20];
        iArr5[7] = iArr5[7] ^ i31;
        this.xOff = 0;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j) {
        int i3 = this.xOff;
        if (i3 > 14) {
            this.inwords[i3] = 0;
            this.xOff = i3 + 1;
            processBlock();
        }
        while (true) {
            int i10 = this.xOff;
            if (i10 >= 14) {
                int[] iArr = this.inwords;
                int i11 = i10 + 1;
                this.xOff = i11;
                iArr[i10] = (int) (j >>> 32);
                this.xOff = i10 + 2;
                iArr[i11] = (int) j;
                return;
            }
            this.inwords[i10] = 0;
            this.xOff = i10 + 1;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i3) {
        int[] iArr = this.inwords;
        int i10 = this.xOff;
        this.xOff = i10 + 1;
        iArr[i10] = Pack.bigEndianToInt(bArr, i3);
        if (this.xOff >= 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        int[] iArr = this.f18879V;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.xOff = 0;
    }

    public SM3Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        this.f18879V = new int[8];
        this.inwords = new int[16];
        this.f18880W = new int[68];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        reset();
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SM3Digest sM3Digest = (SM3Digest) memoable;
        super.copyIn((GeneralDigest) sM3Digest);
        copyIn(sM3Digest);
    }

    public SM3Digest(SM3Digest sM3Digest) {
        super(sM3Digest);
        this.f18879V = new int[8];
        this.inwords = new int[16];
        this.f18880W = new int[68];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        copyIn(sM3Digest);
    }
}
