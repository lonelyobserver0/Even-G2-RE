package org.bouncycastle.crypto.digests;

import com.stub.StubApp;
import java.lang.reflect.Array;
import kotlin.UByte;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.engines.GOST28147Engine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithSBox;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GOST3411Digest implements ExtendedDigest, Memoable {

    /* renamed from: C2, reason: collision with root package name */
    private static final byte[] f18785C2 = {0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};
    private static final int DIGEST_LENGTH = 32;

    /* renamed from: C, reason: collision with root package name */
    private byte[][] f18786C;

    /* renamed from: H, reason: collision with root package name */
    private byte[] f18787H;

    /* renamed from: K, reason: collision with root package name */
    private byte[] f18788K;

    /* renamed from: L, reason: collision with root package name */
    private byte[] f18789L;

    /* renamed from: M, reason: collision with root package name */
    private byte[] f18790M;

    /* renamed from: S, reason: collision with root package name */
    byte[] f18791S;
    private byte[] Sum;

    /* renamed from: U, reason: collision with root package name */
    byte[] f18792U;

    /* renamed from: V, reason: collision with root package name */
    byte[] f18793V;

    /* renamed from: W, reason: collision with root package name */
    byte[] f18794W;

    /* renamed from: a, reason: collision with root package name */
    byte[] f18795a;
    private long byteCount;
    private BlockCipher cipher;
    private final CryptoServicePurpose purpose;
    private byte[] sBox;
    short[] wS;
    short[] w_S;
    private byte[] xBuf;
    private int xBufOff;

    public GOST3411Digest() {
        this(CryptoServicePurpose.ANY);
    }

    private byte[] A(byte[] bArr) {
        for (int i3 = 0; i3 < 8; i3++) {
            this.f18795a[i3] = (byte) (bArr[i3] ^ bArr[i3 + 8]);
        }
        System.arraycopy(bArr, 8, bArr, 0, 24);
        System.arraycopy(this.f18795a, 0, bArr, 24, 8);
        return bArr;
    }

    private void E(byte[] bArr, byte[] bArr2, int i3, byte[] bArr3, int i10) {
        this.cipher.init(true, new KeyParameter(bArr));
        this.cipher.processBlock(bArr3, i10, bArr2, i3);
    }

    private byte[] P(byte[] bArr) {
        for (int i3 = 0; i3 < 8; i3++) {
            byte[] bArr2 = this.f18788K;
            int i10 = i3 * 4;
            bArr2[i10] = bArr[i3];
            bArr2[i10 + 1] = bArr[i3 + 8];
            bArr2[i10 + 2] = bArr[i3 + 16];
            bArr2[i10 + 3] = bArr[i3 + 24];
        }
        return this.f18788K;
    }

    private void cpyBytesToShort(byte[] bArr, short[] sArr) {
        for (int i3 = 0; i3 < bArr.length / 2; i3++) {
            int i10 = i3 * 2;
            sArr[i3] = (short) ((bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] << 8) & 65280));
        }
    }

    private void cpyShortToBytes(short[] sArr, byte[] bArr) {
        for (int i3 = 0; i3 < bArr.length / 2; i3++) {
            int i10 = i3 * 2;
            short s10 = sArr[i3];
            bArr[i10 + 1] = (byte) (s10 >> 8);
            bArr[i10] = (byte) s10;
        }
    }

    private void finish() {
        Pack.longToLittleEndian(this.byteCount * 8, this.f18789L, 0);
        while (this.xBufOff != 0) {
            update((byte) 0);
        }
        processBlock(this.f18789L, 0);
        processBlock(this.Sum, 0);
    }

    private void fw(byte[] bArr) {
        cpyBytesToShort(bArr, this.wS);
        short[] sArr = this.w_S;
        short[] sArr2 = this.wS;
        sArr[15] = (short) (((((sArr2[0] ^ sArr2[1]) ^ sArr2[2]) ^ sArr2[3]) ^ sArr2[12]) ^ sArr2[15]);
        System.arraycopy(sArr2, 1, sArr, 0, 15);
        cpyShortToBytes(this.w_S, bArr);
    }

    private void sumByteArray(byte[] bArr) {
        int i3 = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr2 = this.Sum;
            if (i3 == bArr2.length) {
                return;
            }
            int i11 = (bArr2[i3] & UByte.MAX_VALUE) + (bArr[i3] & UByte.MAX_VALUE) + i10;
            bArr2[i3] = (byte) i11;
            i10 = i11 >>> 8;
            i3++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new GOST3411Digest(this);
    }

    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, 256, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i3) {
        finish();
        byte[] bArr2 = this.f18787H;
        System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return StubApp.getString2(28192);
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    public void processBlock(byte[] bArr, int i3) {
        System.arraycopy(bArr, i3, this.f18790M, 0, 32);
        System.arraycopy(this.f18787H, 0, this.f18792U, 0, 32);
        System.arraycopy(this.f18790M, 0, this.f18793V, 0, 32);
        for (int i10 = 0; i10 < 32; i10++) {
            this.f18794W[i10] = (byte) (this.f18792U[i10] ^ this.f18793V[i10]);
        }
        E(P(this.f18794W), this.f18791S, 0, this.f18787H, 0);
        for (int i11 = 1; i11 < 4; i11++) {
            byte[] A4 = A(this.f18792U);
            for (int i12 = 0; i12 < 32; i12++) {
                this.f18792U[i12] = (byte) (A4[i12] ^ this.f18786C[i11][i12]);
            }
            this.f18793V = A(A(this.f18793V));
            for (int i13 = 0; i13 < 32; i13++) {
                this.f18794W[i13] = (byte) (this.f18792U[i13] ^ this.f18793V[i13]);
            }
            int i14 = i11 * 8;
            E(P(this.f18794W), this.f18791S, i14, this.f18787H, i14);
        }
        for (int i15 = 0; i15 < 12; i15++) {
            fw(this.f18791S);
        }
        for (int i16 = 0; i16 < 32; i16++) {
            byte[] bArr2 = this.f18791S;
            bArr2[i16] = (byte) (bArr2[i16] ^ this.f18790M[i16]);
        }
        fw(this.f18791S);
        for (int i17 = 0; i17 < 32; i17++) {
            byte[] bArr3 = this.f18791S;
            bArr3[i17] = (byte) (this.f18787H[i17] ^ bArr3[i17]);
        }
        for (int i18 = 0; i18 < 61; i18++) {
            fw(this.f18791S);
        }
        byte[] bArr4 = this.f18791S;
        byte[] bArr5 = this.f18787H;
        System.arraycopy(bArr4, 0, bArr5, 0, bArr5.length);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.byteCount = 0L;
        this.xBufOff = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr = this.f18787H;
            if (i3 >= bArr.length) {
                break;
            }
            bArr[i3] = 0;
            i3++;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr2 = this.f18789L;
            if (i10 >= bArr2.length) {
                break;
            }
            bArr2[i10] = 0;
            i10++;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr3 = this.f18790M;
            if (i11 >= bArr3.length) {
                break;
            }
            bArr3[i11] = 0;
            i11++;
        }
        int i12 = 0;
        while (true) {
            byte[] bArr4 = this.f18786C[1];
            if (i12 >= bArr4.length) {
                break;
            }
            bArr4[i12] = 0;
            i12++;
        }
        int i13 = 0;
        while (true) {
            byte[] bArr5 = this.f18786C[3];
            if (i13 >= bArr5.length) {
                break;
            }
            bArr5[i13] = 0;
            i13++;
        }
        int i14 = 0;
        while (true) {
            byte[] bArr6 = this.Sum;
            if (i14 >= bArr6.length) {
                break;
            }
            bArr6[i14] = 0;
            i14++;
        }
        int i15 = 0;
        while (true) {
            byte[] bArr7 = this.xBuf;
            if (i15 >= bArr7.length) {
                byte[] bArr8 = f18785C2;
                System.arraycopy(bArr8, 0, this.f18786C[2], 0, bArr8.length);
                return;
            } else {
                bArr7[i15] = 0;
                i15++;
            }
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b2) {
        byte[] bArr = this.xBuf;
        int i3 = this.xBufOff;
        int i10 = i3 + 1;
        this.xBufOff = i10;
        bArr[i3] = b2;
        if (i10 == bArr.length) {
            sumByteArray(bArr);
            processBlock(this.xBuf, 0);
            this.xBufOff = 0;
        }
        this.byteCount++;
    }

    public GOST3411Digest(CryptoServicePurpose cryptoServicePurpose) {
        this.f18787H = new byte[32];
        this.f18789L = new byte[32];
        this.f18790M = new byte[32];
        this.Sum = new byte[32];
        this.f18786C = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.xBuf = new byte[32];
        this.cipher = new GOST28147Engine();
        this.f18788K = new byte[32];
        this.f18795a = new byte[8];
        this.wS = new short[16];
        this.w_S = new short[16];
        this.f18791S = new byte[32];
        this.f18792U = new byte[32];
        this.f18793V = new byte[32];
        this.f18794W = new byte[32];
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        byte[] sBox = GOST28147Engine.getSBox(StubApp.getString2(28480));
        this.sBox = sBox;
        this.cipher.init(true, new ParametersWithSBox(null, sBox));
        reset();
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        GOST3411Digest gOST3411Digest = (GOST3411Digest) memoable;
        byte[] bArr = gOST3411Digest.sBox;
        this.sBox = bArr;
        this.cipher.init(true, new ParametersWithSBox(null, bArr));
        reset();
        byte[] bArr2 = gOST3411Digest.f18787H;
        System.arraycopy(bArr2, 0, this.f18787H, 0, bArr2.length);
        byte[] bArr3 = gOST3411Digest.f18789L;
        System.arraycopy(bArr3, 0, this.f18789L, 0, bArr3.length);
        byte[] bArr4 = gOST3411Digest.f18790M;
        System.arraycopy(bArr4, 0, this.f18790M, 0, bArr4.length);
        byte[] bArr5 = gOST3411Digest.Sum;
        System.arraycopy(bArr5, 0, this.Sum, 0, bArr5.length);
        byte[] bArr6 = gOST3411Digest.f18786C[1];
        System.arraycopy(bArr6, 0, this.f18786C[1], 0, bArr6.length);
        byte[] bArr7 = gOST3411Digest.f18786C[2];
        System.arraycopy(bArr7, 0, this.f18786C[2], 0, bArr7.length);
        byte[] bArr8 = gOST3411Digest.f18786C[3];
        System.arraycopy(bArr8, 0, this.f18786C[3], 0, bArr8.length);
        byte[] bArr9 = gOST3411Digest.xBuf;
        System.arraycopy(bArr9, 0, this.xBuf, 0, bArr9.length);
        this.xBufOff = gOST3411Digest.xBufOff;
        this.byteCount = gOST3411Digest.byteCount;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i3, int i10) {
        while (this.xBufOff != 0 && i10 > 0) {
            update(bArr[i3]);
            i3++;
            i10--;
        }
        while (true) {
            byte[] bArr2 = this.xBuf;
            if (i10 < bArr2.length) {
                break;
            }
            System.arraycopy(bArr, i3, bArr2, 0, bArr2.length);
            sumByteArray(this.xBuf);
            processBlock(this.xBuf, 0);
            byte[] bArr3 = this.xBuf;
            i3 += bArr3.length;
            i10 -= bArr3.length;
            this.byteCount += bArr3.length;
        }
        while (i10 > 0) {
            update(bArr[i3]);
            i3++;
            i10--;
        }
    }

    public GOST3411Digest(GOST3411Digest gOST3411Digest) {
        this.f18787H = new byte[32];
        this.f18789L = new byte[32];
        this.f18790M = new byte[32];
        this.Sum = new byte[32];
        this.f18786C = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.xBuf = new byte[32];
        this.cipher = new GOST28147Engine();
        this.f18788K = new byte[32];
        this.f18795a = new byte[8];
        this.wS = new short[16];
        this.w_S = new short[16];
        this.f18791S = new byte[32];
        this.f18792U = new byte[32];
        this.f18793V = new byte[32];
        this.f18794W = new byte[32];
        this.purpose = gOST3411Digest.purpose;
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        reset(gOST3411Digest);
    }

    public GOST3411Digest(byte[] bArr) {
        this(bArr, CryptoServicePurpose.ANY);
    }

    public GOST3411Digest(byte[] bArr, CryptoServicePurpose cryptoServicePurpose) {
        this.f18787H = new byte[32];
        this.f18789L = new byte[32];
        this.f18790M = new byte[32];
        this.Sum = new byte[32];
        this.f18786C = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.xBuf = new byte[32];
        this.cipher = new GOST28147Engine();
        this.f18788K = new byte[32];
        this.f18795a = new byte[8];
        this.wS = new short[16];
        this.w_S = new short[16];
        this.f18791S = new byte[32];
        this.f18792U = new byte[32];
        this.f18793V = new byte[32];
        this.f18794W = new byte[32];
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        byte[] clone = Arrays.clone(bArr);
        this.sBox = clone;
        this.cipher.init(true, new ParametersWithSBox(null, clone));
        reset();
    }
}
