package org.bouncycastle.crypto.digests;

import com.stub.StubApp;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Blake2sDigest implements ExtendedDigest {
    private static final int BLOCK_LENGTH_BYTES = 64;
    private static final int ROUNDS = 10;
    private static final int[] blake2s_IV = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};
    private static final byte[][] blake2s_sigma = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, 13, 10, 14, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, 12, 11, 14, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, 14, 1, 11, 12, 6, 8, 3, 13}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, 14, 1, 9}, new byte[]{12, 5, 1, 15, 14, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{13, 11, 7, 14, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, 14, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, 14, 3, 12, 13, 0}};
    private byte[] buffer;
    private int bufferPos;
    private int[] chainValue;
    private int depth;
    private int digestLength;

    /* renamed from: f0, reason: collision with root package name */
    private int f18778f0;
    private int fanout;
    private int innerHashLength;
    private int[] internalState;
    private byte[] key;
    private int keyLength;
    private int leafLength;
    private int nodeDepth;
    private long nodeOffset;
    private byte[] personalization;
    private final CryptoServicePurpose purpose;
    private byte[] salt;

    /* renamed from: t0, reason: collision with root package name */
    private int f18779t0;

    /* renamed from: t1, reason: collision with root package name */
    private int f18780t1;

    public Blake2sDigest() {
        this(256, CryptoServicePurpose.ANY);
    }

    private void G(int i3, int i10, int i11, int i12, int i13, int i14) {
        int[] iArr = this.internalState;
        int i15 = iArr[i11] + iArr[i12] + i3;
        iArr[i11] = i15;
        iArr[i14] = rotr32(iArr[i14] ^ i15, 16);
        int[] iArr2 = this.internalState;
        int i16 = iArr2[i13] + iArr2[i14];
        iArr2[i13] = i16;
        iArr2[i12] = rotr32(i16 ^ iArr2[i12], 12);
        int[] iArr3 = this.internalState;
        int i17 = iArr3[i11] + iArr3[i12] + i10;
        iArr3[i11] = i17;
        iArr3[i14] = rotr32(iArr3[i14] ^ i17, 8);
        int[] iArr4 = this.internalState;
        int i18 = iArr4[i13] + iArr4[i14];
        iArr4[i13] = i18;
        iArr4[i12] = rotr32(i18 ^ iArr4[i12], 7);
    }

    private void compress(byte[] bArr, int i3) {
        initializeInternalState();
        int[] iArr = new int[16];
        Pack.littleEndianToInt(bArr, i3, iArr);
        int i10 = 0;
        for (int i11 = 0; i11 < 10; i11++) {
            byte[][] bArr2 = blake2s_sigma;
            byte[] bArr3 = bArr2[i11];
            G(iArr[bArr3[0]], iArr[bArr3[1]], 0, 4, 8, 12);
            byte[] bArr4 = bArr2[i11];
            G(iArr[bArr4[2]], iArr[bArr4[3]], 1, 5, 9, 13);
            byte[] bArr5 = bArr2[i11];
            G(iArr[bArr5[4]], iArr[bArr5[5]], 2, 6, 10, 14);
            byte[] bArr6 = bArr2[i11];
            G(iArr[bArr6[6]], iArr[bArr6[7]], 3, 7, 11, 15);
            byte[] bArr7 = bArr2[i11];
            G(iArr[bArr7[8]], iArr[bArr7[9]], 0, 5, 10, 15);
            byte[] bArr8 = bArr2[i11];
            G(iArr[bArr8[10]], iArr[bArr8[11]], 1, 6, 11, 12);
            byte[] bArr9 = bArr2[i11];
            G(iArr[bArr9[12]], iArr[bArr9[13]], 2, 7, 8, 13);
            byte[] bArr10 = bArr2[i11];
            G(iArr[bArr10[14]], iArr[bArr10[15]], 3, 4, 9, 14);
        }
        while (true) {
            int[] iArr2 = this.chainValue;
            if (i10 >= iArr2.length) {
                return;
            }
            int i12 = iArr2[i10];
            int[] iArr3 = this.internalState;
            iArr2[i10] = (i12 ^ iArr3[i10]) ^ iArr3[i10 + 8];
            i10++;
        }
    }

    private void init(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.buffer = new byte[64];
        if (bArr3 != null && bArr3.length > 0) {
            if (bArr3.length > 32) {
                throw new IllegalArgumentException(StubApp.getString2(28465));
            }
            byte[] bArr4 = new byte[bArr3.length];
            this.key = bArr4;
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            this.keyLength = bArr3.length;
            System.arraycopy(bArr3, 0, this.buffer, 0, bArr3.length);
            this.bufferPos = 64;
        }
        if (this.chainValue == null) {
            this.chainValue = new int[]{r3[0] ^ ((this.digestLength | (this.keyLength << 8)) | ((this.fanout << 16) | (this.depth << 24))), r3[1] ^ this.leafLength, ((int) r4) ^ r3[2], ((r1 | (this.nodeDepth << 16)) | (this.innerHashLength << 24)) ^ r5, r3[4], r3[5], 0, 0};
            int[] iArr = blake2s_IV;
            long j = this.nodeOffset;
            int i3 = (int) (j >> 32);
            int i10 = iArr[3];
            if (bArr != null) {
                if (bArr.length != 8) {
                    throw new IllegalArgumentException(StubApp.getString2(28466));
                }
                byte[] bArr5 = new byte[8];
                this.salt = bArr5;
                System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
                int[] iArr2 = this.chainValue;
                iArr2[4] = iArr2[4] ^ Pack.littleEndianToInt(bArr, 0);
                int[] iArr3 = this.chainValue;
                iArr3[5] = Pack.littleEndianToInt(bArr, 4) ^ iArr3[5];
            }
            int[] iArr4 = this.chainValue;
            iArr4[6] = iArr[6];
            iArr4[7] = iArr[7];
            if (bArr2 != null) {
                if (bArr2.length != 8) {
                    throw new IllegalArgumentException(StubApp.getString2(28467));
                }
                byte[] bArr6 = new byte[8];
                this.personalization = bArr6;
                System.arraycopy(bArr2, 0, bArr6, 0, bArr2.length);
                int[] iArr5 = this.chainValue;
                iArr5[6] = iArr5[6] ^ Pack.littleEndianToInt(bArr2, 0);
                int[] iArr6 = this.chainValue;
                iArr6[7] = Pack.littleEndianToInt(bArr2, 4) ^ iArr6[7];
            }
        }
    }

    private void initializeInternalState() {
        int[] iArr = this.chainValue;
        System.arraycopy(iArr, 0, this.internalState, 0, iArr.length);
        int[] iArr2 = blake2s_IV;
        System.arraycopy(iArr2, 0, this.internalState, this.chainValue.length, 4);
        int[] iArr3 = this.internalState;
        iArr3[12] = this.f18779t0 ^ iArr2[4];
        iArr3[13] = this.f18780t1 ^ iArr2[5];
        iArr3[14] = this.f18778f0 ^ iArr2[6];
        iArr3[15] = iArr2[7];
    }

    private int rotr32(int i3, int i10) {
        return (i3 << (32 - i10)) | (i3 >>> i10);
    }

    public void clearKey() {
        byte[] bArr = this.key;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
            Arrays.fill(this.buffer, (byte) 0);
        }
    }

    public void clearSalt() {
        byte[] bArr = this.salt;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i3) {
        this.f18778f0 = -1;
        int i10 = this.f18779t0;
        int i11 = this.bufferPos;
        int i12 = i10 + i11;
        this.f18779t0 = i12;
        if (i12 < 0 && i11 > (-i12)) {
            this.f18780t1++;
        }
        compress(this.buffer, 0);
        Arrays.fill(this.buffer, (byte) 0);
        Arrays.fill(this.internalState, 0);
        int i13 = this.digestLength;
        int i14 = i13 >>> 2;
        int i15 = i13 & 3;
        Pack.intToLittleEndian(this.chainValue, 0, i14, bArr, i3);
        if (i15 > 0) {
            byte[] bArr2 = new byte[4];
            Pack.intToLittleEndian(this.chainValue[i14], bArr2, 0);
            System.arraycopy(bArr2, 0, bArr, (i3 + this.digestLength) - i15, i15);
        }
        Arrays.fill(this.chainValue, 0);
        reset();
        return this.digestLength;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return StubApp.getString2(28468);
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.digestLength;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.bufferPos = 0;
        this.f18778f0 = 0;
        this.f18779t0 = 0;
        this.f18780t1 = 0;
        this.chainValue = null;
        Arrays.fill(this.buffer, (byte) 0);
        byte[] bArr = this.key;
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.buffer, 0, bArr.length);
            this.bufferPos = 64;
        }
        init(this.salt, this.personalization, this.key);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b2) {
        int i3 = this.bufferPos;
        if (64 - i3 != 0) {
            this.buffer[i3] = b2;
            this.bufferPos = i3 + 1;
            return;
        }
        int i10 = this.f18779t0 + 64;
        this.f18779t0 = i10;
        if (i10 == 0) {
            this.f18780t1++;
        }
        compress(this.buffer, 0);
        Arrays.fill(this.buffer, (byte) 0);
        this.buffer[0] = b2;
        this.bufferPos = 1;
    }

    public Blake2sDigest(int i3) {
        this(i3, CryptoServicePurpose.ANY);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i3, int i10) {
        int i11;
        if (bArr == null || i10 == 0) {
            return;
        }
        int i12 = this.bufferPos;
        if (i12 != 0) {
            i11 = 64 - i12;
            if (i11 >= i10) {
                System.arraycopy(bArr, i3, this.buffer, i12, i10);
                this.bufferPos += i10;
            }
            System.arraycopy(bArr, i3, this.buffer, i12, i11);
            int i13 = this.f18779t0 + 64;
            this.f18779t0 = i13;
            if (i13 == 0) {
                this.f18780t1++;
            }
            compress(this.buffer, 0);
            this.bufferPos = 0;
            Arrays.fill(this.buffer, (byte) 0);
        } else {
            i11 = 0;
        }
        int i14 = i10 + i3;
        int i15 = i14 - 64;
        int i16 = i3 + i11;
        while (i16 < i15) {
            int i17 = this.f18779t0 + 64;
            this.f18779t0 = i17;
            if (i17 == 0) {
                this.f18780t1++;
            }
            compress(bArr, i16);
            i16 += 64;
        }
        i10 = i14 - i16;
        System.arraycopy(bArr, i16, this.buffer, 0, i10);
        this.bufferPos += i10;
    }

    public Blake2sDigest(int i3, int i10, long j) {
        this(i3, i10, j, CryptoServicePurpose.ANY);
    }

    public Blake2sDigest(int i3, int i10, long j, CryptoServicePurpose cryptoServicePurpose) {
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.buffer = null;
        this.bufferPos = 0;
        this.internalState = new int[16];
        this.chainValue = null;
        this.f18779t0 = 0;
        this.f18780t1 = 0;
        this.f18778f0 = 0;
        this.digestLength = i3;
        this.nodeOffset = j;
        this.fanout = 0;
        this.depth = 0;
        this.leafLength = i10;
        this.innerHashLength = i10;
        this.nodeDepth = 0;
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, i3 * 8, cryptoServicePurpose));
        init(null, null, null);
    }

    public Blake2sDigest(int i3, CryptoServicePurpose cryptoServicePurpose) {
        this.digestLength = 32;
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.fanout = 1;
        this.depth = 1;
        this.leafLength = 0;
        this.nodeOffset = 0L;
        this.nodeDepth = 0;
        this.innerHashLength = 0;
        this.buffer = null;
        this.bufferPos = 0;
        this.internalState = new int[16];
        this.chainValue = null;
        this.f18779t0 = 0;
        this.f18780t1 = 0;
        this.f18778f0 = 0;
        if (i3 < 8 || i3 > 256 || i3 % 8 != 0) {
            throw new IllegalArgumentException(StubApp.getString2(28463));
        }
        this.digestLength = i3 / 8;
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, i3, cryptoServicePurpose));
        init(null, null, null);
    }

    public Blake2sDigest(int i3, byte[] bArr, byte[] bArr2, byte[] bArr3, long j, CryptoServicePurpose cryptoServicePurpose) {
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.fanout = 1;
        this.depth = 1;
        this.leafLength = 0;
        this.nodeDepth = 0;
        this.innerHashLength = 0;
        this.buffer = null;
        this.bufferPos = 0;
        this.internalState = new int[16];
        this.chainValue = null;
        this.f18779t0 = 0;
        this.f18780t1 = 0;
        this.f18778f0 = 0;
        this.digestLength = i3;
        this.nodeOffset = j;
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, i3 * 8, cryptoServicePurpose));
        init(bArr2, bArr3, bArr);
    }

    public Blake2sDigest(Blake2sDigest blake2sDigest) {
        this.digestLength = 32;
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.fanout = 1;
        this.depth = 1;
        this.leafLength = 0;
        this.nodeOffset = 0L;
        this.nodeDepth = 0;
        this.innerHashLength = 0;
        this.buffer = null;
        this.bufferPos = 0;
        this.internalState = new int[16];
        this.chainValue = null;
        this.f18779t0 = 0;
        this.f18780t1 = 0;
        this.f18778f0 = 0;
        this.bufferPos = blake2sDigest.bufferPos;
        this.buffer = Arrays.clone(blake2sDigest.buffer);
        this.keyLength = blake2sDigest.keyLength;
        this.key = Arrays.clone(blake2sDigest.key);
        this.digestLength = blake2sDigest.digestLength;
        this.internalState = Arrays.clone(this.internalState);
        this.chainValue = Arrays.clone(blake2sDigest.chainValue);
        this.f18779t0 = blake2sDigest.f18779t0;
        this.f18780t1 = blake2sDigest.f18780t1;
        this.f18778f0 = blake2sDigest.f18778f0;
        this.salt = Arrays.clone(blake2sDigest.salt);
        this.personalization = Arrays.clone(blake2sDigest.personalization);
        this.fanout = blake2sDigest.fanout;
        this.depth = blake2sDigest.depth;
        this.leafLength = blake2sDigest.leafLength;
        this.nodeOffset = blake2sDigest.nodeOffset;
        this.nodeDepth = blake2sDigest.nodeDepth;
        this.innerHashLength = blake2sDigest.innerHashLength;
        this.purpose = blake2sDigest.purpose;
    }

    public Blake2sDigest(byte[] bArr) {
        this(bArr, CryptoServicePurpose.ANY);
    }

    public Blake2sDigest(byte[] bArr, int i3, byte[] bArr2, byte[] bArr3) {
        this(bArr, i3, bArr2, bArr3, CryptoServicePurpose.ANY);
    }

    public Blake2sDigest(byte[] bArr, int i3, byte[] bArr2, byte[] bArr3, CryptoServicePurpose cryptoServicePurpose) {
        this.digestLength = 32;
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.fanout = 1;
        this.depth = 1;
        this.leafLength = 0;
        this.nodeOffset = 0L;
        this.nodeDepth = 0;
        this.innerHashLength = 0;
        this.buffer = null;
        this.bufferPos = 0;
        this.internalState = new int[16];
        this.chainValue = null;
        this.f18779t0 = 0;
        this.f18780t1 = 0;
        this.f18778f0 = 0;
        if (i3 < 1 || i3 > 32) {
            throw new IllegalArgumentException(StubApp.getString2(28464));
        }
        this.digestLength = i3;
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, i3 * 8, cryptoServicePurpose));
        init(bArr2, bArr3, bArr);
    }

    public Blake2sDigest(byte[] bArr, CryptoServicePurpose cryptoServicePurpose) {
        this.digestLength = 32;
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.fanout = 1;
        this.depth = 1;
        this.leafLength = 0;
        this.nodeOffset = 0L;
        this.nodeDepth = 0;
        this.innerHashLength = 0;
        this.buffer = null;
        this.bufferPos = 0;
        this.internalState = new int[16];
        this.chainValue = null;
        this.f18779t0 = 0;
        this.f18780t1 = 0;
        this.f18778f0 = 0;
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, bArr.length * 8, cryptoServicePurpose));
        init(null, null, bArr);
    }
}
