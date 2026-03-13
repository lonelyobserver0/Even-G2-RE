package org.bouncycastle.crypto.digests;

import com.stub.StubApp;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SHA256Digest extends GeneralDigest implements EncodableDigest {
    private static final int DIGEST_LENGTH = 32;

    /* renamed from: K, reason: collision with root package name */
    static final int[] f18869K = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* renamed from: H1, reason: collision with root package name */
    private int f18870H1;
    private int H2;

    /* renamed from: H3, reason: collision with root package name */
    private int f18871H3;

    /* renamed from: H4, reason: collision with root package name */
    private int f18872H4;

    /* renamed from: H5, reason: collision with root package name */
    private int f18873H5;

    /* renamed from: H6, reason: collision with root package name */
    private int f18874H6;

    /* renamed from: H7, reason: collision with root package name */
    private int f18875H7;

    /* renamed from: H8, reason: collision with root package name */
    private int f18876H8;

    /* renamed from: X, reason: collision with root package name */
    private int[] f18877X;
    private int xOff;

    public SHA256Digest() {
        this(CryptoServicePurpose.ANY);
    }

    private static int Ch(int i3, int i10, int i11) {
        return ((~i3) & i11) ^ (i10 & i3);
    }

    private static int Maj(int i3, int i10, int i11) {
        return ((i3 ^ i10) & i11) | (i3 & i10);
    }

    private static int Sum0(int i3) {
        return ((i3 << 10) | (i3 >>> 22)) ^ (((i3 >>> 2) | (i3 << 30)) ^ ((i3 >>> 13) | (i3 << 19)));
    }

    private static int Sum1(int i3) {
        return ((i3 << 7) | (i3 >>> 25)) ^ (((i3 >>> 6) | (i3 << 26)) ^ ((i3 >>> 11) | (i3 << 21)));
    }

    private static int Theta0(int i3) {
        return (i3 >>> 3) ^ (((i3 >>> 7) | (i3 << 25)) ^ ((i3 >>> 18) | (i3 << 14)));
    }

    private static int Theta1(int i3) {
        return (i3 >>> 10) ^ (((i3 >>> 17) | (i3 << 15)) ^ ((i3 >>> 19) | (i3 << 13)));
    }

    private void copyIn(SHA256Digest sHA256Digest) {
        super.copyIn((GeneralDigest) sHA256Digest);
        this.f18870H1 = sHA256Digest.f18870H1;
        this.H2 = sHA256Digest.H2;
        this.f18871H3 = sHA256Digest.f18871H3;
        this.f18872H4 = sHA256Digest.f18872H4;
        this.f18873H5 = sHA256Digest.f18873H5;
        this.f18874H6 = sHA256Digest.f18874H6;
        this.f18875H7 = sHA256Digest.f18875H7;
        this.f18876H8 = sHA256Digest.f18876H8;
        int[] iArr = sHA256Digest.f18877X;
        System.arraycopy(iArr, 0, this.f18877X, 0, iArr.length);
        this.xOff = sHA256Digest.xOff;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA256Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, 256, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i3) {
        finish();
        Pack.intToBigEndian(this.f18870H1, bArr, i3);
        Pack.intToBigEndian(this.H2, bArr, i3 + 4);
        Pack.intToBigEndian(this.f18871H3, bArr, i3 + 8);
        Pack.intToBigEndian(this.f18872H4, bArr, i3 + 12);
        Pack.intToBigEndian(this.f18873H5, bArr, i3 + 16);
        Pack.intToBigEndian(this.f18874H6, bArr, i3 + 20);
        Pack.intToBigEndian(this.f18875H7, bArr, i3 + 24);
        Pack.intToBigEndian(this.f18876H8, bArr, i3 + 28);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return StubApp.getString2(1488);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        int i3 = this.xOff * 4;
        byte[] bArr = new byte[i3 + 53];
        super.populateState(bArr);
        Pack.intToBigEndian(this.f18870H1, bArr, 16);
        Pack.intToBigEndian(this.H2, bArr, 20);
        Pack.intToBigEndian(this.f18871H3, bArr, 24);
        Pack.intToBigEndian(this.f18872H4, bArr, 28);
        Pack.intToBigEndian(this.f18873H5, bArr, 32);
        Pack.intToBigEndian(this.f18874H6, bArr, 36);
        Pack.intToBigEndian(this.f18875H7, bArr, 40);
        Pack.intToBigEndian(this.f18876H8, bArr, 44);
        Pack.intToBigEndian(this.xOff, bArr, 48);
        for (int i10 = 0; i10 != this.xOff; i10++) {
            Pack.intToBigEndian(this.f18877X[i10], bArr, (i10 * 4) + 52);
        }
        bArr[i3 + 52] = (byte) this.purpose.ordinal();
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        for (int i3 = 16; i3 <= 63; i3++) {
            int[] iArr = this.f18877X;
            int Theta1 = Theta1(iArr[i3 - 2]);
            int[] iArr2 = this.f18877X;
            iArr[i3] = Theta1 + iArr2[i3 - 7] + Theta0(iArr2[i3 - 15]) + this.f18877X[i3 - 16];
        }
        int i10 = this.f18870H1;
        int i11 = this.H2;
        int i12 = this.f18871H3;
        int i13 = this.f18872H4;
        int i14 = this.f18873H5;
        int i15 = this.f18874H6;
        int i16 = this.f18875H7;
        int i17 = this.f18876H8;
        int i18 = 0;
        for (int i19 = 0; i19 < 8; i19++) {
            int Sum1 = Sum1(i14) + Ch(i14, i15, i16);
            int[] iArr3 = f18869K;
            int i20 = Sum1 + iArr3[i18] + this.f18877X[i18] + i17;
            int i21 = i13 + i20;
            int Sum0 = Sum0(i10) + Maj(i10, i11, i12) + i20;
            int i22 = i18 + 1;
            int Sum12 = Sum1(i21) + Ch(i21, i14, i15) + iArr3[i22] + this.f18877X[i22] + i16;
            int i23 = i12 + Sum12;
            int Sum02 = Sum0(Sum0) + Maj(Sum0, i10, i11) + Sum12;
            int i24 = i18 + 2;
            int Sum13 = Sum1(i23) + Ch(i23, i21, i14) + iArr3[i24] + this.f18877X[i24] + i15;
            int i25 = i11 + Sum13;
            int Sum03 = Sum0(Sum02) + Maj(Sum02, Sum0, i10) + Sum13;
            int i26 = i18 + 3;
            int Sum14 = Sum1(i25) + Ch(i25, i23, i21) + iArr3[i26] + this.f18877X[i26] + i14;
            int i27 = i10 + Sum14;
            int Sum04 = Sum0(Sum03) + Maj(Sum03, Sum02, Sum0) + Sum14;
            int i28 = i18 + 4;
            int Sum15 = Sum1(i27) + Ch(i27, i25, i23) + iArr3[i28] + this.f18877X[i28] + i21;
            i17 = Sum0 + Sum15;
            i13 = Sum0(Sum04) + Maj(Sum04, Sum03, Sum02) + Sum15;
            int i29 = i18 + 5;
            int Sum16 = Sum1(i17) + Ch(i17, i27, i25) + iArr3[i29] + this.f18877X[i29] + i23;
            i16 = Sum02 + Sum16;
            i12 = Sum0(i13) + Maj(i13, Sum04, Sum03) + Sum16;
            int i30 = i18 + 6;
            int Sum17 = Sum1(i16) + Ch(i16, i17, i27) + iArr3[i30] + this.f18877X[i30] + i25;
            i15 = Sum03 + Sum17;
            i11 = Sum0(i12) + Maj(i12, i13, Sum04) + Sum17;
            int i31 = i18 + 7;
            int Sum18 = Sum1(i15) + Ch(i15, i16, i17) + iArr3[i31] + this.f18877X[i31] + i27;
            i14 = Sum04 + Sum18;
            i10 = Sum0(i11) + Maj(i11, i12, i13) + Sum18;
            i18 += 8;
        }
        this.f18870H1 += i10;
        this.H2 += i11;
        this.f18871H3 += i12;
        this.f18872H4 += i13;
        this.f18873H5 += i14;
        this.f18874H6 += i15;
        this.f18875H7 += i16;
        this.f18876H8 += i17;
        this.xOff = 0;
        for (int i32 = 0; i32 < 16; i32++) {
            this.f18877X[i32] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.f18877X;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i3) {
        this.f18877X[this.xOff] = Pack.bigEndianToInt(bArr, i3);
        int i10 = this.xOff + 1;
        this.xOff = i10;
        if (i10 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f18870H1 = 1779033703;
        this.H2 = -1150833019;
        this.f18871H3 = 1013904242;
        this.f18872H4 = -1521486534;
        this.f18873H5 = 1359893119;
        this.f18874H6 = -1694144372;
        this.f18875H7 = 528734635;
        this.f18876H8 = 1541459225;
        this.xOff = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.f18877X;
            if (i3 == iArr.length) {
                return;
            }
            iArr[i3] = 0;
            i3++;
        }
    }

    public SHA256Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        this.f18877X = new int[64];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        reset();
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((SHA256Digest) memoable);
    }

    public SHA256Digest(SHA256Digest sHA256Digest) {
        super(sHA256Digest);
        this.f18877X = new int[64];
        copyIn(sHA256Digest);
    }

    public SHA256Digest(byte[] bArr) {
        super(bArr);
        this.f18877X = new int[64];
        this.f18870H1 = Pack.bigEndianToInt(bArr, 16);
        this.H2 = Pack.bigEndianToInt(bArr, 20);
        this.f18871H3 = Pack.bigEndianToInt(bArr, 24);
        this.f18872H4 = Pack.bigEndianToInt(bArr, 28);
        this.f18873H5 = Pack.bigEndianToInt(bArr, 32);
        this.f18874H6 = Pack.bigEndianToInt(bArr, 36);
        this.f18875H7 = Pack.bigEndianToInt(bArr, 40);
        this.f18876H8 = Pack.bigEndianToInt(bArr, 44);
        this.xOff = Pack.bigEndianToInt(bArr, 48);
        for (int i3 = 0; i3 != this.xOff; i3++) {
            this.f18877X[i3] = Pack.bigEndianToInt(bArr, (i3 * 4) + 52);
        }
    }
}
