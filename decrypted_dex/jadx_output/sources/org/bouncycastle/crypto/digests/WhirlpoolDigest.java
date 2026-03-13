package org.bouncycastle.crypto.digests;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stub.StubApp;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.math.Primes;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class WhirlpoolDigest implements ExtendedDigest, Memoable {
    private static final int BITCOUNT_ARRAY_SIZE = 32;
    private static final int BYTE_LENGTH = 64;
    private static final int DIGEST_LENGTH_BYTES = 64;
    private static final short[] EIGHT;
    private static final int REDUCTION_POLYNOMIAL = 285;
    private static final int ROUNDS = 10;
    private long[] _K;
    private long[] _L;
    private short[] _bitCount;
    private long[] _block;
    private byte[] _buffer;
    private int _bufferPos;
    private long[] _hash;
    private final long[] _rc;
    private long[] _state;
    private final CryptoServicePurpose purpose;
    private static final int[] SBOX = {24, 35, 198, 232, 135, 184, 1, 79, 54, 166, 210, 245, 121, 111, 145, 82, 96, 188, 155, 142, 163, 12, 123, 53, 29, BERTags.FLAGS, 215, 194, 46, 75, 254, 87, 21, 119, 55, 229, 159, 240, 74, 218, 88, 201, 41, 10, 177, 160, 107, 133, 189, 93, 16, 244, 203, 62, 5, 103, 228, 39, 65, 139, 167, 125, 149, 216, 251, 238, 124, 102, 221, 23, 71, 158, 202, 45, 191, 7, 173, 90, 131, 51, 99, 2, 170, 113, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 25, 73, 217, 242, 227, 91, 136, 154, 38, 50, 176, 233, 15, 213, 128, 190, 205, 52, 72, 255, 122, 144, 95, 32, 104, 26, 174, 180, 84, 147, 34, 100, 241, 115, 18, 64, 8, 195, 236, 219, 161, 141, 61, 151, 0, 207, 43, 118, 130, 214, 27, 181, 175, 106, 80, 69, 243, 48, 239, 63, 85, 162, 234, 101, 186, 47, 192, 222, 28, 253, 77, 146, 117, 6, 138, 178, 230, 14, 31, 98, 212, 168, 150, 249, 197, 37, 89, 132, 114, 57, 76, 94, 120, 56, 140, 209, 165, 226, 97, 179, 33, 156, 30, 67, 199, 252, 4, 81, 153, 109, 13, 250, 223, 126, 36, 59, 171, 206, 17, 143, 78, 183, 235, 60, 129, 148, 247, 185, 19, 44, Primes.SMALL_FACTOR_LIMIT, 231, 110, 196, 3, 86, 68, CertificateBody.profileType, 169, 42, 187, 193, 83, 220, 11, 157, 108, 49, 116, 246, 70, 172, 137, 20, 225, 22, 58, 105, 9, 112, 182, 208, 237, 204, 66, ModuleDescriptor.MODULE_VERSION, 164, 40, 92, 248, 134};

    /* renamed from: C0, reason: collision with root package name */
    private static final long[] f18888C0 = new long[256];

    /* renamed from: C1, reason: collision with root package name */
    private static final long[] f18889C1 = new long[256];

    /* renamed from: C2, reason: collision with root package name */
    private static final long[] f18890C2 = new long[256];

    /* renamed from: C3, reason: collision with root package name */
    private static final long[] f18891C3 = new long[256];

    /* renamed from: C4, reason: collision with root package name */
    private static final long[] f18892C4 = new long[256];

    /* renamed from: C5, reason: collision with root package name */
    private static final long[] f18893C5 = new long[256];

    /* renamed from: C6, reason: collision with root package name */
    private static final long[] f18894C6 = new long[256];

    /* renamed from: C7, reason: collision with root package name */
    private static final long[] f18895C7 = new long[256];

    static {
        short[] sArr = new short[32];
        EIGHT = sArr;
        sArr[31] = 8;
        for (int i3 = 0; i3 < 256; i3++) {
            int i10 = SBOX[i3];
            int mulX = mulX(i10);
            int mulX2 = mulX(mulX);
            int i11 = mulX2 ^ i10;
            int mulX3 = mulX(mulX2);
            int i12 = mulX3 ^ i10;
            f18888C0[i3] = packIntoLong(i10, i10, mulX2, i10, mulX3, i11, mulX, i12);
            f18889C1[i3] = packIntoLong(i12, i10, i10, mulX2, i10, mulX3, i11, mulX);
            f18890C2[i3] = packIntoLong(mulX, i12, i10, i10, mulX2, i10, mulX3, i11);
            f18891C3[i3] = packIntoLong(i11, mulX, i12, i10, i10, mulX2, i10, mulX3);
            f18892C4[i3] = packIntoLong(mulX3, i11, mulX, i12, i10, i10, mulX2, i10);
            f18893C5[i3] = packIntoLong(i10, mulX3, i11, mulX, i12, i10, i10, mulX2);
            f18894C6[i3] = packIntoLong(mulX2, i10, mulX3, i11, mulX, i12, i10, i10);
            f18895C7[i3] = packIntoLong(i10, mulX2, i10, mulX3, i11, mulX, i12, i10);
        }
    }

    public WhirlpoolDigest() {
        this(CryptoServicePurpose.ANY);
    }

    private byte[] copyBitLength() {
        byte[] bArr = new byte[32];
        for (int i3 = 0; i3 < 32; i3++) {
            bArr[i3] = (byte) (this._bitCount[i3] & 255);
        }
        return bArr;
    }

    private void finish() {
        byte[] copyBitLength = copyBitLength();
        byte[] bArr = this._buffer;
        int i3 = this._bufferPos;
        bArr[i3] = (byte) (bArr[i3] | ByteCompanionObject.MIN_VALUE);
        int i10 = i3 + 1;
        this._bufferPos = i10;
        if (i10 == bArr.length) {
            processFilledBuffer(bArr, 0);
        }
        if (this._bufferPos > 32) {
            while (this._bufferPos != 0) {
                update((byte) 0);
            }
        }
        while (this._bufferPos <= 32) {
            update((byte) 0);
        }
        System.arraycopy(copyBitLength, 0, this._buffer, 32, copyBitLength.length);
        processFilledBuffer(this._buffer, 0);
    }

    private void increment() {
        int i3 = 0;
        for (int length = this._bitCount.length - 1; length >= 0; length--) {
            short[] sArr = this._bitCount;
            int i10 = (sArr[length] & 255) + EIGHT[length] + i3;
            i3 = i10 >>> 8;
            sArr[length] = (short) (i10 & 255);
        }
    }

    private static int mulX(int i3) {
        return ((-(i3 >>> 7)) & REDUCTION_POLYNOMIAL) ^ (i3 << 1);
    }

    private static long packIntoLong(int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return (((((((i10 << 48) ^ (i3 << 56)) ^ (i11 << 40)) ^ (i12 << 32)) ^ (i13 << 24)) ^ (i14 << 16)) ^ (i15 << 8)) ^ i16;
    }

    private void processFilledBuffer(byte[] bArr, int i3) {
        Pack.bigEndianToLong(this._buffer, 0, this._block);
        processBlock();
        this._bufferPos = 0;
        Arrays.fill(this._buffer, (byte) 0);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new WhirlpoolDigest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i3) {
        finish();
        Pack.longToBigEndian(this._hash, bArr, i3);
        reset();
        return getDigestSize();
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return StubApp.getString2(28525);
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 64;
    }

    public void processBlock() {
        char c10;
        char c11;
        for (int i3 = 0; i3 < 8; i3++) {
            long[] jArr = this._state;
            long j = this._block[i3];
            long[] jArr2 = this._K;
            long j3 = this._hash[i3];
            jArr2[i3] = j3;
            jArr[i3] = j ^ j3;
        }
        for (int i10 = 1; i10 <= 10; i10++) {
            int i11 = 0;
            while (true) {
                c10 = ' ';
                c11 = '(';
                if (i11 >= 8) {
                    break;
                }
                long[] jArr3 = this._L;
                jArr3[i11] = 0;
                long[] jArr4 = f18888C0;
                long[] jArr5 = this._K;
                long j10 = jArr4[((int) (jArr5[i11 & 7] >>> 56)) & 255];
                jArr3[i11] = j10;
                long j11 = f18889C1[((int) (jArr5[(i11 - 1) & 7] >>> 48)) & 255] ^ j10;
                jArr3[i11] = j11;
                long j12 = j11 ^ f18890C2[((int) (jArr5[(i11 - 2) & 7] >>> 40)) & 255];
                jArr3[i11] = j12;
                long j13 = j12 ^ f18891C3[((int) (jArr5[(i11 - 3) & 7] >>> 32)) & 255];
                jArr3[i11] = j13;
                long j14 = j13 ^ f18892C4[((int) (jArr5[(i11 - 4) & 7] >>> 24)) & 255];
                jArr3[i11] = j14;
                long j15 = j14 ^ f18893C5[((int) (jArr5[(i11 - 5) & 7] >>> 16)) & 255];
                jArr3[i11] = j15;
                long j16 = j15 ^ f18894C6[((int) (jArr5[(i11 - 6) & 7] >>> 8)) & 255];
                jArr3[i11] = j16;
                jArr3[i11] = j16 ^ f18895C7[((int) jArr5[(i11 - 7) & 7]) & 255];
                i11++;
            }
            long[] jArr6 = this._L;
            long[] jArr7 = this._K;
            System.arraycopy(jArr6, 0, jArr7, 0, jArr7.length);
            long[] jArr8 = this._K;
            jArr8[0] = jArr8[0] ^ this._rc[i10];
            int i12 = 0;
            while (i12 < 8) {
                long[] jArr9 = this._L;
                long j17 = this._K[i12];
                jArr9[i12] = j17;
                long[] jArr10 = f18888C0;
                long[] jArr11 = this._state;
                char c12 = c10;
                char c13 = c11;
                long j18 = jArr10[((int) (jArr11[i12 & 7] >>> 56)) & 255] ^ j17;
                jArr9[i12] = j18;
                long j19 = j18 ^ f18889C1[((int) (jArr11[(i12 - 1) & 7] >>> 48)) & 255];
                jArr9[i12] = j19;
                long j20 = j19 ^ f18890C2[((int) (jArr11[(i12 - 2) & 7] >>> c13)) & 255];
                jArr9[i12] = j20;
                long j21 = j20 ^ f18891C3[((int) (jArr11[(i12 - 3) & 7] >>> c12)) & 255];
                jArr9[i12] = j21;
                long j22 = j21 ^ f18892C4[((int) (jArr11[(i12 - 4) & 7] >>> 24)) & 255];
                jArr9[i12] = j22;
                long j23 = j22 ^ f18893C5[((int) (jArr11[(i12 - 5) & 7] >>> 16)) & 255];
                jArr9[i12] = j23;
                long j24 = j23 ^ f18894C6[((int) (jArr11[(i12 - 6) & 7] >>> 8)) & 255];
                jArr9[i12] = j24;
                jArr9[i12] = j24 ^ f18895C7[((int) jArr11[(i12 - 7) & 7]) & 255];
                i12++;
                c11 = c13;
                c10 = c12;
            }
            long[] jArr12 = this._L;
            long[] jArr13 = this._state;
            System.arraycopy(jArr12, 0, jArr13, 0, jArr13.length);
        }
        for (int i13 = 0; i13 < 8; i13++) {
            long[] jArr14 = this._hash;
            jArr14[i13] = jArr14[i13] ^ (this._state[i13] ^ this._block[i13]);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this._bufferPos = 0;
        Arrays.fill(this._bitCount, (short) 0);
        Arrays.fill(this._buffer, (byte) 0);
        Arrays.fill(this._hash, 0L);
        Arrays.fill(this._K, 0L);
        Arrays.fill(this._L, 0L);
        Arrays.fill(this._block, 0L);
        Arrays.fill(this._state, 0L);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b2) {
        byte[] bArr = this._buffer;
        int i3 = this._bufferPos;
        bArr[i3] = b2;
        int i10 = i3 + 1;
        this._bufferPos = i10;
        if (i10 == bArr.length) {
            processFilledBuffer(bArr, 0);
        }
        increment();
    }

    public WhirlpoolDigest(CryptoServicePurpose cryptoServicePurpose) {
        long[] jArr = new long[11];
        this._rc = jArr;
        this._buffer = new byte[64];
        this._bufferPos = 0;
        this._bitCount = new short[32];
        this._hash = new long[8];
        this._K = new long[8];
        this._L = new long[8];
        this._block = new long[8];
        this._state = new long[8];
        jArr[0] = 0;
        for (int i3 = 1; i3 <= 10; i3++) {
            int i10 = (i3 - 1) * 8;
            this._rc[i3] = (((((((f18888C0[i10] & (-72057594037927936L)) ^ (f18889C1[i10 + 1] & 71776119061217280L)) ^ (f18890C2[i10 + 2] & 280375465082880L)) ^ (f18891C3[i10 + 3] & 1095216660480L)) ^ (f18892C4[i10 + 4] & 4278190080L)) ^ (f18893C5[i10 + 5] & 16711680)) ^ (f18894C6[i10 + 6] & 65280)) ^ (f18895C7[i10 + 7] & 255);
        }
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, getDigestSize(), cryptoServicePurpose));
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        WhirlpoolDigest whirlpoolDigest = (WhirlpoolDigest) memoable;
        long[] jArr = whirlpoolDigest._rc;
        long[] jArr2 = this._rc;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        byte[] bArr = whirlpoolDigest._buffer;
        byte[] bArr2 = this._buffer;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this._bufferPos = whirlpoolDigest._bufferPos;
        short[] sArr = whirlpoolDigest._bitCount;
        short[] sArr2 = this._bitCount;
        System.arraycopy(sArr, 0, sArr2, 0, sArr2.length);
        long[] jArr3 = whirlpoolDigest._hash;
        long[] jArr4 = this._hash;
        System.arraycopy(jArr3, 0, jArr4, 0, jArr4.length);
        long[] jArr5 = whirlpoolDigest._K;
        long[] jArr6 = this._K;
        System.arraycopy(jArr5, 0, jArr6, 0, jArr6.length);
        long[] jArr7 = whirlpoolDigest._L;
        long[] jArr8 = this._L;
        System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
        long[] jArr9 = whirlpoolDigest._block;
        long[] jArr10 = this._block;
        System.arraycopy(jArr9, 0, jArr10, 0, jArr10.length);
        long[] jArr11 = whirlpoolDigest._state;
        long[] jArr12 = this._state;
        System.arraycopy(jArr11, 0, jArr12, 0, jArr12.length);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i3, int i10) {
        while (i10 > 0) {
            update(bArr[i3]);
            i3++;
            i10--;
        }
    }

    public WhirlpoolDigest(WhirlpoolDigest whirlpoolDigest) {
        this._rc = new long[11];
        this._buffer = new byte[64];
        this._bufferPos = 0;
        this._bitCount = new short[32];
        this._hash = new long[8];
        this._K = new long[8];
        this._L = new long[8];
        this._block = new long[8];
        this._state = new long[8];
        CryptoServicePurpose cryptoServicePurpose = whirlpoolDigest.purpose;
        this.purpose = cryptoServicePurpose;
        reset(whirlpoolDigest);
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, getDigestSize(), cryptoServicePurpose));
    }
}
