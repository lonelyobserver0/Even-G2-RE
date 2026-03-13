package org.bouncycastle.crypto.digests;

import android.R;
import com.stub.StubApp;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Longs;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Blake2bDigest implements ExtendedDigest {
    private static final int BLOCK_LENGTH_BYTES = 128;
    private byte[] buffer;
    private int bufferPos;
    private long[] chainValue;
    private int digestLength;

    /* renamed from: f0, reason: collision with root package name */
    private long f18775f0;
    private long[] internalState;
    private byte[] key;
    private int keyLength;
    private byte[] personalization;
    private final CryptoServicePurpose purpose;
    private byte[] salt;

    /* renamed from: t0, reason: collision with root package name */
    private long f18776t0;

    /* renamed from: t1, reason: collision with root package name */
    private long f18777t1;
    private static final long[] blake2b_IV = {7640891576956012808L, -4942790177534073029L, 4354685564936845355L, -6534734903238641935L, 5840696475078001361L, -7276294671716946913L, 2270897969802886507L, 6620516959819538809L};
    private static final byte[][] blake2b_sigma = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, 13, 10, 14, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, 12, 11, 14, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, 14, 1, 11, 12, 6, 8, 3, 13}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, 14, 1, 9}, new byte[]{12, 5, 1, 15, 14, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{13, 11, 7, 14, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, 14, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, 14, 3, 12, 13, 0}, new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}};
    private static int ROUNDS = 12;

    public Blake2bDigest() {
        this(512, CryptoServicePurpose.ANY);
    }

    private void G(long j, long j3, int i3, int i10, int i11, int i12) {
        long[] jArr = this.internalState;
        long j10 = jArr[i3] + jArr[i10] + j;
        jArr[i3] = j10;
        jArr[i12] = Longs.rotateRight(jArr[i12] ^ j10, 32);
        long[] jArr2 = this.internalState;
        long j11 = jArr2[i11] + jArr2[i12];
        jArr2[i11] = j11;
        jArr2[i10] = Longs.rotateRight(j11 ^ jArr2[i10], 24);
        long[] jArr3 = this.internalState;
        long j12 = jArr3[i3] + jArr3[i10] + j3;
        jArr3[i3] = j12;
        jArr3[i12] = Longs.rotateRight(jArr3[i12] ^ j12, 16);
        long[] jArr4 = this.internalState;
        long j13 = jArr4[i11] + jArr4[i12];
        jArr4[i11] = j13;
        jArr4[i10] = Longs.rotateRight(j13 ^ jArr4[i10], 63);
    }

    private void compress(byte[] bArr, int i3) {
        initializeInternalState();
        long[] jArr = new long[16];
        Pack.littleEndianToLong(bArr, i3, jArr);
        int i10 = 0;
        for (int i11 = 0; i11 < ROUNDS; i11++) {
            byte[][] bArr2 = blake2b_sigma;
            byte[] bArr3 = bArr2[i11];
            G(jArr[bArr3[0]], jArr[bArr3[1]], 0, 4, 8, 12);
            byte[] bArr4 = bArr2[i11];
            G(jArr[bArr4[2]], jArr[bArr4[3]], 1, 5, 9, 13);
            byte[] bArr5 = bArr2[i11];
            G(jArr[bArr5[4]], jArr[bArr5[5]], 2, 6, 10, 14);
            byte[] bArr6 = bArr2[i11];
            G(jArr[bArr6[6]], jArr[bArr6[7]], 3, 7, 11, 15);
            byte[] bArr7 = bArr2[i11];
            G(jArr[bArr7[8]], jArr[bArr7[9]], 0, 5, 10, 15);
            byte[] bArr8 = bArr2[i11];
            G(jArr[bArr8[10]], jArr[bArr8[11]], 1, 6, 11, 12);
            byte[] bArr9 = bArr2[i11];
            G(jArr[bArr9[12]], jArr[bArr9[13]], 2, 7, 8, 13);
            byte[] bArr10 = bArr2[i11];
            G(jArr[bArr10[14]], jArr[bArr10[15]], 3, 4, 9, 14);
        }
        while (true) {
            long[] jArr2 = this.chainValue;
            if (i10 >= jArr2.length) {
                return;
            }
            long j = jArr2[i10];
            long[] jArr3 = this.internalState;
            jArr2[i10] = (j ^ jArr3[i10]) ^ jArr3[i10 + 8];
            i10++;
        }
    }

    private void init() {
        if (this.chainValue == null) {
            long[] jArr = {r2[0] ^ ((this.digestLength | (this.keyLength << 8)) | R.attr.theme), r2[1], r2[2], r2[3], r5, r2[5], 0, 0};
            this.chainValue = jArr;
            long[] jArr2 = blake2b_IV;
            long j = jArr2[4];
            byte[] bArr = this.salt;
            if (bArr != null) {
                jArr[4] = j ^ Pack.littleEndianToLong(bArr, 0);
                long[] jArr3 = this.chainValue;
                jArr3[5] = jArr3[5] ^ Pack.littleEndianToLong(this.salt, 8);
            }
            long[] jArr4 = this.chainValue;
            long j3 = jArr2[6];
            jArr4[6] = j3;
            jArr4[7] = jArr2[7];
            byte[] bArr2 = this.personalization;
            if (bArr2 != null) {
                jArr4[6] = Pack.littleEndianToLong(bArr2, 0) ^ j3;
                long[] jArr5 = this.chainValue;
                jArr5[7] = jArr5[7] ^ Pack.littleEndianToLong(this.personalization, 8);
            }
        }
    }

    private void initializeInternalState() {
        long[] jArr = this.chainValue;
        System.arraycopy(jArr, 0, this.internalState, 0, jArr.length);
        long[] jArr2 = blake2b_IV;
        System.arraycopy(jArr2, 0, this.internalState, this.chainValue.length, 4);
        long[] jArr3 = this.internalState;
        jArr3[12] = this.f18776t0 ^ jArr2[4];
        jArr3[13] = this.f18777t1 ^ jArr2[5];
        jArr3[14] = this.f18775f0 ^ jArr2[6];
        jArr3[15] = jArr2[7];
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
        this.f18775f0 = -1L;
        long j = this.f18776t0;
        int i10 = this.bufferPos;
        long j3 = j + i10;
        this.f18776t0 = j3;
        if (i10 > 0 && j3 == 0) {
            this.f18777t1++;
        }
        compress(this.buffer, 0);
        Arrays.fill(this.buffer, (byte) 0);
        Arrays.fill(this.internalState, 0L);
        int i11 = this.digestLength;
        int i12 = i11 >>> 3;
        int i13 = i11 & 7;
        Pack.longToLittleEndian(this.chainValue, 0, i12, bArr, i3);
        if (i13 > 0) {
            byte[] bArr2 = new byte[8];
            Pack.longToLittleEndian(this.chainValue[i12], bArr2, 0);
            System.arraycopy(bArr2, 0, bArr, (i3 + this.digestLength) - i13, i13);
        }
        Arrays.fill(this.chainValue, 0L);
        reset();
        return this.digestLength;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return StubApp.getString2(28462);
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 128;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.digestLength;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.bufferPos = 0;
        this.f18775f0 = 0L;
        this.f18776t0 = 0L;
        this.f18777t1 = 0L;
        this.chainValue = null;
        Arrays.fill(this.buffer, (byte) 0);
        byte[] bArr = this.key;
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.buffer, 0, bArr.length);
            this.bufferPos = 128;
        }
        init();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b2) {
        int i3 = this.bufferPos;
        if (128 - i3 != 0) {
            this.buffer[i3] = b2;
            this.bufferPos = i3 + 1;
            return;
        }
        long j = this.f18776t0 + 128;
        this.f18776t0 = j;
        if (j == 0) {
            this.f18777t1++;
        }
        compress(this.buffer, 0);
        Arrays.fill(this.buffer, (byte) 0);
        this.buffer[0] = b2;
        this.bufferPos = 1;
    }

    public Blake2bDigest(int i3) {
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
            i11 = 128 - i12;
            if (i11 >= i10) {
                System.arraycopy(bArr, i3, this.buffer, i12, i10);
                this.bufferPos += i10;
            }
            System.arraycopy(bArr, i3, this.buffer, i12, i11);
            long j = this.f18776t0 + 128;
            this.f18776t0 = j;
            if (j == 0) {
                this.f18777t1++;
            }
            compress(this.buffer, 0);
            this.bufferPos = 0;
            Arrays.fill(this.buffer, (byte) 0);
        } else {
            i11 = 0;
        }
        int i13 = i10 + i3;
        int i14 = i13 - 128;
        int i15 = i3 + i11;
        while (i15 < i14) {
            long j3 = this.f18776t0 + 128;
            this.f18776t0 = j3;
            if (j3 == 0) {
                this.f18777t1++;
            }
            compress(bArr, i15);
            i15 += 128;
        }
        i10 = i13 - i15;
        System.arraycopy(bArr, i15, this.buffer, 0, i10);
        this.bufferPos += i10;
    }

    public Blake2bDigest(int i3, CryptoServicePurpose cryptoServicePurpose) {
        this.digestLength = 64;
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.buffer = null;
        this.bufferPos = 0;
        this.internalState = new long[16];
        this.chainValue = null;
        this.f18776t0 = 0L;
        this.f18777t1 = 0L;
        this.f18775f0 = 0L;
        this.purpose = cryptoServicePurpose;
        if (i3 < 8 || i3 > 512 || i3 % 8 != 0) {
            throw new IllegalArgumentException(StubApp.getString2(28457));
        }
        this.buffer = new byte[128];
        this.keyLength = 0;
        this.digestLength = i3 / 8;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, i3, cryptoServicePurpose));
        init();
    }

    public Blake2bDigest(Blake2bDigest blake2bDigest) {
        this.digestLength = 64;
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.buffer = null;
        this.bufferPos = 0;
        this.internalState = new long[16];
        this.chainValue = null;
        this.f18776t0 = 0L;
        this.f18777t1 = 0L;
        this.f18775f0 = 0L;
        this.bufferPos = blake2bDigest.bufferPos;
        this.buffer = Arrays.clone(blake2bDigest.buffer);
        this.keyLength = blake2bDigest.keyLength;
        this.key = Arrays.clone(blake2bDigest.key);
        this.digestLength = blake2bDigest.digestLength;
        this.chainValue = Arrays.clone(blake2bDigest.chainValue);
        this.personalization = Arrays.clone(blake2bDigest.personalization);
        this.salt = Arrays.clone(blake2bDigest.salt);
        this.f18776t0 = blake2bDigest.f18776t0;
        this.f18777t1 = blake2bDigest.f18777t1;
        this.f18775f0 = blake2bDigest.f18775f0;
        this.purpose = blake2bDigest.purpose;
    }

    public Blake2bDigest(byte[] bArr) {
        this(bArr, CryptoServicePurpose.ANY);
    }

    public Blake2bDigest(byte[] bArr, int i3, byte[] bArr2, byte[] bArr3) {
        this(bArr, i3, bArr2, bArr3, CryptoServicePurpose.ANY);
    }

    public Blake2bDigest(byte[] bArr, int i3, byte[] bArr2, byte[] bArr3, CryptoServicePurpose cryptoServicePurpose) {
        this.digestLength = 64;
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.bufferPos = 0;
        this.internalState = new long[16];
        this.chainValue = null;
        this.f18776t0 = 0L;
        this.f18777t1 = 0L;
        this.f18775f0 = 0L;
        this.purpose = cryptoServicePurpose;
        this.buffer = new byte[128];
        if (i3 < 1 || i3 > 64) {
            throw new IllegalArgumentException(StubApp.getString2(28461));
        }
        this.digestLength = i3;
        if (bArr2 != null) {
            if (bArr2.length != 16) {
                throw new IllegalArgumentException(StubApp.getString2(28458));
            }
            byte[] bArr4 = new byte[16];
            this.salt = bArr4;
            System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
        }
        if (bArr3 != null) {
            if (bArr3.length != 16) {
                throw new IllegalArgumentException(StubApp.getString2(28459));
            }
            byte[] bArr5 = new byte[16];
            this.personalization = bArr5;
            System.arraycopy(bArr3, 0, bArr5, 0, bArr3.length);
        }
        if (bArr != null) {
            byte[] bArr6 = new byte[bArr.length];
            this.key = bArr6;
            System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
            if (bArr.length > 64) {
                throw new IllegalArgumentException(StubApp.getString2(28460));
            }
            this.keyLength = bArr.length;
            System.arraycopy(bArr, 0, this.buffer, 0, bArr.length);
            this.bufferPos = 128;
        }
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, i3 * 8, cryptoServicePurpose));
        init();
    }

    public Blake2bDigest(byte[] bArr, CryptoServicePurpose cryptoServicePurpose) {
        this.digestLength = 64;
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.bufferPos = 0;
        this.internalState = new long[16];
        this.chainValue = null;
        this.f18776t0 = 0L;
        this.f18777t1 = 0L;
        this.f18775f0 = 0L;
        this.buffer = new byte[128];
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            this.key = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            if (bArr.length > 64) {
                throw new IllegalArgumentException(StubApp.getString2(28460));
            }
            this.keyLength = bArr.length;
            System.arraycopy(bArr, 0, this.buffer, 0, bArr.length);
            this.bufferPos = 128;
        }
        this.purpose = cryptoServicePurpose;
        this.digestLength = 64;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, 64 * 8, cryptoServicePurpose));
        init();
    }
}
