package org.bouncycastle.crypto.digests;

import com.stub.StubApp;
import i2.u;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RIPEMD128Digest extends GeneralDigest {
    private static final int DIGEST_LENGTH = 16;

    /* renamed from: H0, reason: collision with root package name */
    private int f18824H0;

    /* renamed from: H1, reason: collision with root package name */
    private int f18825H1;
    private int H2;

    /* renamed from: H3, reason: collision with root package name */
    private int f18826H3;

    /* renamed from: X, reason: collision with root package name */
    private int[] f18827X;
    private int xOff;

    public RIPEMD128Digest() {
        this(CryptoServicePurpose.ANY);
    }

    private int F1(int i3, int i10, int i11, int i12, int i13, int i14) {
        return RL(i3 + f1(i10, i11, i12) + i13, i14);
    }

    private int F2(int i3, int i10, int i11, int i12, int i13, int i14) {
        return RL(u.C(i3, f2(i10, i11, i12), i13, 1518500249), i14);
    }

    private int F3(int i3, int i10, int i11, int i12, int i13, int i14) {
        return RL(u.C(i3, f3(i10, i11, i12), i13, 1859775393), i14);
    }

    private int F4(int i3, int i10, int i11, int i12, int i13, int i14) {
        return RL(u.C(i3, f4(i10, i11, i12), i13, -1894007588), i14);
    }

    private int FF1(int i3, int i10, int i11, int i12, int i13, int i14) {
        return RL(i3 + f1(i10, i11, i12) + i13, i14);
    }

    private int FF2(int i3, int i10, int i11, int i12, int i13, int i14) {
        return RL(u.C(i3, f2(i10, i11, i12), i13, 1836072691), i14);
    }

    private int FF3(int i3, int i10, int i11, int i12, int i13, int i14) {
        return RL(u.C(i3, f3(i10, i11, i12), i13, 1548603684), i14);
    }

    private int FF4(int i3, int i10, int i11, int i12, int i13, int i14) {
        return RL(u.C(i3, f4(i10, i11, i12), i13, 1352829926), i14);
    }

    private int RL(int i3, int i10) {
        return (i3 >>> (32 - i10)) | (i3 << i10);
    }

    private void copyIn(RIPEMD128Digest rIPEMD128Digest) {
        super.copyIn((GeneralDigest) rIPEMD128Digest);
        this.f18824H0 = rIPEMD128Digest.f18824H0;
        this.f18825H1 = rIPEMD128Digest.f18825H1;
        this.H2 = rIPEMD128Digest.H2;
        this.f18826H3 = rIPEMD128Digest.f18826H3;
        int[] iArr = rIPEMD128Digest.f18827X;
        System.arraycopy(iArr, 0, this.f18827X, 0, iArr.length);
        this.xOff = rIPEMD128Digest.xOff;
    }

    private int f1(int i3, int i10, int i11) {
        return (i3 ^ i10) ^ i11;
    }

    private int f2(int i3, int i10, int i11) {
        return ((~i3) & i11) | (i10 & i3);
    }

    private int f3(int i3, int i10, int i11) {
        return (i3 | (~i10)) ^ i11;
    }

    private int f4(int i3, int i10, int i11) {
        return (i3 & i11) | (i10 & (~i11));
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new RIPEMD128Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i3) {
        finish();
        Pack.intToLittleEndian(this.f18824H0, bArr, i3);
        Pack.intToLittleEndian(this.f18825H1, bArr, i3 + 4);
        Pack.intToLittleEndian(this.H2, bArr, i3 + 8);
        Pack.intToLittleEndian(this.f18826H3, bArr, i3 + 12);
        reset();
        return 16;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return StubApp.getString2(28185);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int i3 = this.f18824H0;
        int i10 = this.f18825H1;
        int i11 = this.H2;
        int i12 = this.f18826H3;
        int F12 = F1(i3, i10, i11, i12, this.f18827X[0], 11);
        int F13 = F1(i12, F12, i10, i11, this.f18827X[1], 14);
        int F14 = F1(i11, F13, F12, i10, this.f18827X[2], 15);
        int F15 = F1(i10, F14, F13, F12, this.f18827X[3], 12);
        int F16 = F1(F12, F15, F14, F13, this.f18827X[4], 5);
        int F17 = F1(F13, F16, F15, F14, this.f18827X[5], 8);
        int F18 = F1(F14, F17, F16, F15, this.f18827X[6], 7);
        int F19 = F1(F15, F18, F17, F16, this.f18827X[7], 9);
        int F110 = F1(F16, F19, F18, F17, this.f18827X[8], 11);
        int F111 = F1(F17, F110, F19, F18, this.f18827X[9], 13);
        int F112 = F1(F18, F111, F110, F19, this.f18827X[10], 14);
        int F113 = F1(F19, F112, F111, F110, this.f18827X[11], 15);
        int F114 = F1(F110, F113, F112, F111, this.f18827X[12], 6);
        int F115 = F1(F111, F114, F113, F112, this.f18827X[13], 7);
        int F116 = F1(F112, F115, F114, F113, this.f18827X[14], 9);
        int F117 = F1(F113, F116, F115, F114, this.f18827X[15], 8);
        int F22 = F2(F114, F117, F116, F115, this.f18827X[7], 7);
        int F23 = F2(F115, F22, F117, F116, this.f18827X[4], 6);
        int F24 = F2(F116, F23, F22, F117, this.f18827X[13], 8);
        int F25 = F2(F117, F24, F23, F22, this.f18827X[1], 13);
        int F26 = F2(F22, F25, F24, F23, this.f18827X[10], 11);
        int F27 = F2(F23, F26, F25, F24, this.f18827X[6], 9);
        int F28 = F2(F24, F27, F26, F25, this.f18827X[15], 7);
        int F29 = F2(F25, F28, F27, F26, this.f18827X[3], 15);
        int F210 = F2(F26, F29, F28, F27, this.f18827X[12], 7);
        int F211 = F2(F27, F210, F29, F28, this.f18827X[0], 12);
        int F212 = F2(F28, F211, F210, F29, this.f18827X[9], 15);
        int F213 = F2(F29, F212, F211, F210, this.f18827X[5], 9);
        int F214 = F2(F210, F213, F212, F211, this.f18827X[2], 11);
        int F215 = F2(F211, F214, F213, F212, this.f18827X[14], 7);
        int F216 = F2(F212, F215, F214, F213, this.f18827X[11], 13);
        int F217 = F2(F213, F216, F215, F214, this.f18827X[8], 12);
        int F3 = F3(F214, F217, F216, F215, this.f18827X[3], 11);
        int F32 = F3(F215, F3, F217, F216, this.f18827X[10], 13);
        int F33 = F3(F216, F32, F3, F217, this.f18827X[14], 6);
        int F34 = F3(F217, F33, F32, F3, this.f18827X[4], 7);
        int F35 = F3(F3, F34, F33, F32, this.f18827X[9], 14);
        int F36 = F3(F32, F35, F34, F33, this.f18827X[15], 9);
        int F37 = F3(F33, F36, F35, F34, this.f18827X[8], 13);
        int F38 = F3(F34, F37, F36, F35, this.f18827X[1], 15);
        int F39 = F3(F35, F38, F37, F36, this.f18827X[2], 14);
        int F310 = F3(F36, F39, F38, F37, this.f18827X[7], 8);
        int F311 = F3(F37, F310, F39, F38, this.f18827X[0], 13);
        int F312 = F3(F38, F311, F310, F39, this.f18827X[6], 6);
        int F313 = F3(F39, F312, F311, F310, this.f18827X[13], 5);
        int F314 = F3(F310, F313, F312, F311, this.f18827X[11], 12);
        int F315 = F3(F311, F314, F313, F312, this.f18827X[5], 7);
        int F316 = F3(F312, F315, F314, F313, this.f18827X[12], 5);
        int F42 = F4(F313, F316, F315, F314, this.f18827X[1], 11);
        int F43 = F4(F314, F42, F316, F315, this.f18827X[9], 12);
        int F44 = F4(F315, F43, F42, F316, this.f18827X[11], 14);
        int F45 = F4(F316, F44, F43, F42, this.f18827X[10], 15);
        int F46 = F4(F42, F45, F44, F43, this.f18827X[0], 14);
        int F47 = F4(F43, F46, F45, F44, this.f18827X[8], 15);
        int F48 = F4(F44, F47, F46, F45, this.f18827X[12], 9);
        int F49 = F4(F45, F48, F47, F46, this.f18827X[4], 8);
        int F410 = F4(F46, F49, F48, F47, this.f18827X[13], 9);
        int F411 = F4(F47, F410, F49, F48, this.f18827X[3], 14);
        int F412 = F4(F48, F411, F410, F49, this.f18827X[7], 5);
        int F413 = F4(F49, F412, F411, F410, this.f18827X[15], 6);
        int F414 = F4(F410, F413, F412, F411, this.f18827X[14], 8);
        int F415 = F4(F411, F414, F413, F412, this.f18827X[5], 6);
        int F416 = F4(F412, F415, F414, F413, this.f18827X[6], 5);
        int F417 = F4(F413, F416, F415, F414, this.f18827X[2], 12);
        int FF4 = FF4(i3, i10, i11, i12, this.f18827X[5], 8);
        int FF42 = FF4(i12, FF4, i10, i11, this.f18827X[14], 9);
        int FF43 = FF4(i11, FF42, FF4, i10, this.f18827X[7], 9);
        int FF44 = FF4(i10, FF43, FF42, FF4, this.f18827X[0], 11);
        int FF45 = FF4(FF4, FF44, FF43, FF42, this.f18827X[9], 13);
        int FF46 = FF4(FF42, FF45, FF44, FF43, this.f18827X[2], 15);
        int FF47 = FF4(FF43, FF46, FF45, FF44, this.f18827X[11], 15);
        int FF48 = FF4(FF44, FF47, FF46, FF45, this.f18827X[4], 5);
        int FF49 = FF4(FF45, FF48, FF47, FF46, this.f18827X[13], 7);
        int FF410 = FF4(FF46, FF49, FF48, FF47, this.f18827X[6], 7);
        int FF411 = FF4(FF47, FF410, FF49, FF48, this.f18827X[15], 8);
        int FF412 = FF4(FF48, FF411, FF410, FF49, this.f18827X[8], 11);
        int FF413 = FF4(FF49, FF412, FF411, FF410, this.f18827X[1], 14);
        int FF414 = FF4(FF410, FF413, FF412, FF411, this.f18827X[10], 14);
        int FF415 = FF4(FF411, FF414, FF413, FF412, this.f18827X[3], 12);
        int FF416 = FF4(FF412, FF415, FF414, FF413, this.f18827X[12], 6);
        int FF3 = FF3(FF413, FF416, FF415, FF414, this.f18827X[6], 9);
        int FF32 = FF3(FF414, FF3, FF416, FF415, this.f18827X[11], 13);
        int FF33 = FF3(FF415, FF32, FF3, FF416, this.f18827X[3], 15);
        int FF34 = FF3(FF416, FF33, FF32, FF3, this.f18827X[7], 7);
        int FF35 = FF3(FF3, FF34, FF33, FF32, this.f18827X[0], 12);
        int FF36 = FF3(FF32, FF35, FF34, FF33, this.f18827X[13], 8);
        int FF37 = FF3(FF33, FF36, FF35, FF34, this.f18827X[5], 9);
        int FF38 = FF3(FF34, FF37, FF36, FF35, this.f18827X[10], 11);
        int FF39 = FF3(FF35, FF38, FF37, FF36, this.f18827X[14], 7);
        int FF310 = FF3(FF36, FF39, FF38, FF37, this.f18827X[15], 7);
        int FF311 = FF3(FF37, FF310, FF39, FF38, this.f18827X[8], 12);
        int FF312 = FF3(FF38, FF311, FF310, FF39, this.f18827X[12], 7);
        int FF313 = FF3(FF39, FF312, FF311, FF310, this.f18827X[4], 6);
        int FF314 = FF3(FF310, FF313, FF312, FF311, this.f18827X[9], 15);
        int FF315 = FF3(FF311, FF314, FF313, FF312, this.f18827X[1], 13);
        int FF316 = FF3(FF312, FF315, FF314, FF313, this.f18827X[2], 11);
        int FF2 = FF2(FF313, FF316, FF315, FF314, this.f18827X[15], 9);
        int FF22 = FF2(FF314, FF2, FF316, FF315, this.f18827X[5], 7);
        int FF23 = FF2(FF315, FF22, FF2, FF316, this.f18827X[1], 15);
        int FF24 = FF2(FF316, FF23, FF22, FF2, this.f18827X[3], 11);
        int FF25 = FF2(FF2, FF24, FF23, FF22, this.f18827X[7], 8);
        int FF26 = FF2(FF22, FF25, FF24, FF23, this.f18827X[14], 6);
        int FF27 = FF2(FF23, FF26, FF25, FF24, this.f18827X[6], 6);
        int FF28 = FF2(FF24, FF27, FF26, FF25, this.f18827X[9], 14);
        int FF29 = FF2(FF25, FF28, FF27, FF26, this.f18827X[11], 12);
        int FF210 = FF2(FF26, FF29, FF28, FF27, this.f18827X[8], 13);
        int FF211 = FF2(FF27, FF210, FF29, FF28, this.f18827X[12], 5);
        int FF212 = FF2(FF28, FF211, FF210, FF29, this.f18827X[2], 14);
        int FF213 = FF2(FF29, FF212, FF211, FF210, this.f18827X[10], 13);
        int FF214 = FF2(FF210, FF213, FF212, FF211, this.f18827X[0], 13);
        int FF215 = FF2(FF211, FF214, FF213, FF212, this.f18827X[4], 7);
        int FF216 = FF2(FF212, FF215, FF214, FF213, this.f18827X[13], 5);
        int FF1 = FF1(FF213, FF216, FF215, FF214, this.f18827X[8], 15);
        int FF12 = FF1(FF214, FF1, FF216, FF215, this.f18827X[6], 5);
        int FF13 = FF1(FF215, FF12, FF1, FF216, this.f18827X[4], 8);
        int FF14 = FF1(FF216, FF13, FF12, FF1, this.f18827X[1], 11);
        int FF15 = FF1(FF1, FF14, FF13, FF12, this.f18827X[3], 14);
        int FF16 = FF1(FF12, FF15, FF14, FF13, this.f18827X[11], 14);
        int FF17 = FF1(FF13, FF16, FF15, FF14, this.f18827X[15], 6);
        int FF18 = FF1(FF14, FF17, FF16, FF15, this.f18827X[0], 14);
        int FF19 = FF1(FF15, FF18, FF17, FF16, this.f18827X[5], 6);
        int FF110 = FF1(FF16, FF19, FF18, FF17, this.f18827X[12], 9);
        int FF111 = FF1(FF17, FF110, FF19, FF18, this.f18827X[2], 12);
        int FF112 = FF1(FF18, FF111, FF110, FF19, this.f18827X[13], 9);
        int FF113 = FF1(FF19, FF112, FF111, FF110, this.f18827X[9], 12);
        int FF114 = FF1(FF110, FF113, FF112, FF111, this.f18827X[7], 5);
        int FF115 = FF1(FF111, FF114, FF113, FF112, this.f18827X[10], 15);
        int FF116 = FF1(FF112, FF115, FF114, FF113, this.f18827X[14], 8);
        int i13 = F416 + this.f18825H1 + FF114;
        this.f18825H1 = this.H2 + F415 + FF113;
        this.H2 = this.f18826H3 + F414 + FF116;
        this.f18826H3 = this.f18824H0 + F417 + FF115;
        this.f18824H0 = i13;
        this.xOff = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.f18827X;
            if (i14 == iArr.length) {
                return;
            }
            iArr[i14] = 0;
            i14++;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.f18827X;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i3) {
        int[] iArr = this.f18827X;
        int i10 = this.xOff;
        this.xOff = i10 + 1;
        iArr[i10] = Pack.littleEndianToInt(bArr, i3);
        if (this.xOff == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f18824H0 = 1732584193;
        this.f18825H1 = -271733879;
        this.H2 = -1732584194;
        this.f18826H3 = 271733878;
        this.xOff = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.f18827X;
            if (i3 == iArr.length) {
                return;
            }
            iArr[i3] = 0;
            i3++;
        }
    }

    public RIPEMD128Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        this.f18827X = new int[16];
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, 128, cryptoServicePurpose));
        reset();
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((RIPEMD128Digest) memoable);
    }

    public RIPEMD128Digest(RIPEMD128Digest rIPEMD128Digest) {
        super(rIPEMD128Digest.purpose);
        this.f18827X = new int[16];
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, 128, this.purpose));
        copyIn(rIPEMD128Digest);
    }
}
