package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.MaxBytesExceededException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.SkippingStreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Salsa20Engine implements SkippingStreamCipher {
    public static final int DEFAULT_ROUNDS = 20;
    private static final int STATE_SIZE = 16;
    private static final int[] TAU_SIGMA = Pack.littleEndianToInt(Strings.toByteArray(StubApp.getString2(28754)), 0, 8);
    protected static final byte[] sigma = Strings.toByteArray(StubApp.getString2(28755));
    protected static final byte[] tau = Strings.toByteArray(StubApp.getString2(28756));
    private int cW0;
    private int cW1;
    private int cW2;
    protected int[] engineState;
    private int index;
    private boolean initialised;
    private byte[] keyStream;
    protected int rounds;

    /* renamed from: x, reason: collision with root package name */
    protected int[] f18961x;

    public Salsa20Engine() {
        this(20);
    }

    private boolean limitExceeded() {
        int i3 = this.cW0 + 1;
        this.cW0 = i3;
        if (i3 == 0) {
            int i10 = this.cW1 + 1;
            this.cW1 = i10;
            if (i10 == 0) {
                int i11 = this.cW2 + 1;
                this.cW2 = i11;
                if ((i11 & 32) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private void resetLimitCounter() {
        this.cW0 = 0;
        this.cW1 = 0;
        this.cW2 = 0;
    }

    public static void salsaCore(int i3, int[] iArr, int[] iArr2) {
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i3 % 2 != 0) {
            throw new IllegalArgumentException(StubApp.getString2(28577));
        }
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        char c10 = 3;
        int i13 = iArr[3];
        char c11 = 4;
        int i14 = iArr[4];
        char c12 = 5;
        int i15 = iArr[5];
        char c13 = 6;
        int i16 = iArr[6];
        int i17 = 7;
        int i18 = iArr[7];
        int i19 = iArr[8];
        int i20 = 9;
        int i21 = iArr[9];
        int i22 = iArr[10];
        int i23 = iArr[11];
        int i24 = iArr[12];
        int i25 = 13;
        int i26 = iArr[13];
        int i27 = iArr[14];
        int i28 = iArr[15];
        int i29 = i27;
        int i30 = i26;
        int i31 = i24;
        int i32 = i23;
        int i33 = i22;
        int i34 = i21;
        int i35 = i19;
        int i36 = i18;
        int i37 = i16;
        int i38 = i15;
        int i39 = i14;
        int i40 = i13;
        int i41 = i12;
        int i42 = i11;
        int i43 = i10;
        int i44 = i3;
        while (true) {
            char c14 = c10;
            if (i44 <= 0) {
                char c15 = c11;
                char c16 = c12;
                char c17 = c13;
                iArr2[0] = i43 + iArr[0];
                iArr2[1] = i42 + iArr[1];
                iArr2[2] = i41 + iArr[2];
                iArr2[c14] = i40 + iArr[c14];
                iArr2[c15] = i39 + iArr[c15];
                iArr2[c16] = i38 + iArr[c16];
                iArr2[c17] = i37 + iArr[c17];
                iArr2[7] = i36 + iArr[7];
                iArr2[8] = i35 + iArr[8];
                iArr2[9] = i34 + iArr[9];
                iArr2[10] = i33 + iArr[10];
                iArr2[11] = i32 + iArr[11];
                iArr2[12] = i31 + iArr[12];
                iArr2[13] = i30 + iArr[13];
                iArr2[14] = i29 + iArr[14];
                iArr2[15] = i28 + iArr[15];
                return;
            }
            int rotateLeft = Integers.rotateLeft(i43 + i31, i17) ^ i39;
            int rotateLeft2 = i35 ^ Integers.rotateLeft(rotateLeft + i43, i20);
            char c18 = c11;
            int rotateLeft3 = i31 ^ Integers.rotateLeft(rotateLeft2 + rotateLeft, i25);
            char c19 = c12;
            char c20 = c13;
            int rotateLeft4 = i43 ^ Integers.rotateLeft(rotateLeft3 + rotateLeft2, 18);
            int rotateLeft5 = i34 ^ Integers.rotateLeft(i38 + i42, i17);
            int rotateLeft6 = i30 ^ Integers.rotateLeft(rotateLeft5 + i38, i20);
            int rotateLeft7 = Integers.rotateLeft(rotateLeft6 + rotateLeft5, i25) ^ i42;
            int rotateLeft8 = Integers.rotateLeft(rotateLeft7 + rotateLeft6, 18) ^ i38;
            int rotateLeft9 = i29 ^ Integers.rotateLeft(i33 + i37, 7);
            int rotateLeft10 = i41 ^ Integers.rotateLeft(rotateLeft9 + i33, 9);
            int rotateLeft11 = i37 ^ Integers.rotateLeft(rotateLeft10 + rotateLeft9, 13);
            int rotateLeft12 = i33 ^ Integers.rotateLeft(rotateLeft11 + rotateLeft10, 18);
            int rotateLeft13 = i40 ^ Integers.rotateLeft(i28 + i32, 7);
            int rotateLeft14 = i36 ^ Integers.rotateLeft(rotateLeft13 + i28, 9);
            int rotateLeft15 = i32 ^ Integers.rotateLeft(rotateLeft14 + rotateLeft13, 13);
            int rotateLeft16 = i28 ^ Integers.rotateLeft(rotateLeft15 + rotateLeft14, 18);
            int rotateLeft17 = rotateLeft7 ^ Integers.rotateLeft(rotateLeft4 + rotateLeft13, 7);
            int rotateLeft18 = Integers.rotateLeft(rotateLeft17 + rotateLeft4, 9) ^ rotateLeft10;
            int rotateLeft19 = rotateLeft13 ^ Integers.rotateLeft(rotateLeft18 + rotateLeft17, 13);
            i43 = rotateLeft4 ^ Integers.rotateLeft(rotateLeft19 + rotateLeft18, 18);
            int rotateLeft20 = Integers.rotateLeft(rotateLeft8 + rotateLeft, 7) ^ rotateLeft11;
            int rotateLeft21 = Integers.rotateLeft(rotateLeft20 + rotateLeft8, 9) ^ rotateLeft14;
            int rotateLeft22 = rotateLeft ^ Integers.rotateLeft(rotateLeft21 + rotateLeft20, 13);
            i38 = rotateLeft8 ^ Integers.rotateLeft(rotateLeft22 + rotateLeft21, 18);
            i32 = rotateLeft15 ^ Integers.rotateLeft(rotateLeft12 + rotateLeft5, 7);
            int rotateLeft23 = Integers.rotateLeft(i32 + rotateLeft12, 9) ^ rotateLeft2;
            int rotateLeft24 = Integers.rotateLeft(rotateLeft23 + i32, 13) ^ rotateLeft5;
            i33 = rotateLeft12 ^ Integers.rotateLeft(rotateLeft24 + rotateLeft23, 18);
            i31 = rotateLeft3 ^ Integers.rotateLeft(rotateLeft16 + rotateLeft9, 7);
            i30 = rotateLeft6 ^ Integers.rotateLeft(i31 + rotateLeft16, 9);
            i29 = rotateLeft9 ^ Integers.rotateLeft(i30 + i31, 13);
            i28 = rotateLeft16 ^ Integers.rotateLeft(i29 + i30, 18);
            i44 -= 2;
            i35 = rotateLeft23;
            i42 = rotateLeft17;
            i37 = rotateLeft20;
            i39 = rotateLeft22;
            i36 = rotateLeft21;
            i34 = rotateLeft24;
            c10 = c14;
            c11 = c18;
            c12 = c19;
            c13 = c20;
            i17 = 7;
            i41 = rotateLeft18;
            i40 = rotateLeft19;
            i20 = 9;
            i25 = 13;
        }
    }

    public void advanceCounter() {
        int[] iArr = this.engineState;
        int i3 = iArr[8] + 1;
        iArr[8] = i3;
        if (i3 == 0) {
            iArr[9] = iArr[9] + 1;
        }
    }

    public void generateKeyStream(byte[] bArr) {
        salsaCore(this.rounds, this.engineState, this.f18961x);
        Pack.intToLittleEndian(this.f18961x, bArr, 0);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        if (this.rounds == 20) {
            return StubApp.getString2(28759);
        }
        return StubApp.getString2(28758) + this.rounds;
    }

    public long getCounter() {
        int[] iArr = this.engineState;
        return (iArr[9] << 32) | (iArr[8] & BodyPartID.bodyIdMax);
    }

    public int getNonceSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long getPosition() {
        return (getCounter() * 64) + this.index;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException(getAlgorithmName() + StubApp.getString2(28764));
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv == null || iv.length != getNonceSize()) {
            throw new IllegalArgumentException(getAlgorithmName() + StubApp.getString2(28762) + getNonceSize() + StubApp.getString2(28763));
        }
        CipherParameters parameters = parametersWithIV.getParameters();
        if (parameters == null) {
            if (!this.initialised) {
                throw new IllegalStateException(getAlgorithmName() + StubApp.getString2(28760));
            }
            setKey(null, iv);
        } else {
            if (!(parameters instanceof KeyParameter)) {
                throw new IllegalArgumentException(getAlgorithmName() + StubApp.getString2(28761));
            }
            byte[] key = ((KeyParameter) parameters).getKey();
            setKey(key, iv);
            CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), key.length * 8, cipherParameters, Utils.getPurpose(z2)));
        }
        reset();
        this.initialised = true;
    }

    public void packTauOrSigma(int i3, int[] iArr, int i10) {
        int i11 = (i3 - 16) / 4;
        int[] iArr2 = TAU_SIGMA;
        iArr[i10] = iArr2[i11];
        iArr[i10 + 1] = iArr2[i11 + 1];
        iArr[i10 + 2] = iArr2[i11 + 2];
        iArr[i10 + 3] = iArr2[i11 + 3];
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) {
        if (!this.initialised) {
            throw new IllegalStateException(getAlgorithmName() + StubApp.getString2(28567));
        }
        if (i3 + i10 > bArr.length) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        if (i11 + i10 > bArr2.length) {
            throw new OutputLengthException(StubApp.getString2(28306));
        }
        if (limitExceeded(i10)) {
            throw new MaxBytesExceededException(StubApp.getString2(28765));
        }
        for (int i12 = 0; i12 < i10; i12++) {
            byte[] bArr3 = this.keyStream;
            int i13 = this.index;
            bArr2[i12 + i11] = (byte) (bArr3[i13] ^ bArr[i12 + i3]);
            int i14 = (i13 + 1) & 63;
            this.index = i14;
            if (i14 == 0) {
                advanceCounter();
                generateKeyStream(this.keyStream);
            }
        }
        return i10;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        this.index = 0;
        resetLimitCounter();
        resetCounter();
        generateKeyStream(this.keyStream);
    }

    public void resetCounter() {
        int[] iArr = this.engineState;
        iArr[9] = 0;
        iArr[8] = 0;
    }

    public void retreatCounter() {
        int[] iArr = this.engineState;
        int i3 = iArr[8];
        if (i3 == 0 && iArr[9] == 0) {
            throw new IllegalStateException(StubApp.getString2(28575));
        }
        int i10 = i3 - 1;
        iArr[8] = i10;
        if (i10 == -1) {
            iArr[9] = iArr[9] - 1;
        }
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b2) {
        if (limitExceeded()) {
            throw new MaxBytesExceededException(StubApp.getString2(28766));
        }
        byte[] bArr = this.keyStream;
        int i3 = this.index;
        byte b10 = (byte) (b2 ^ bArr[i3]);
        int i10 = (i3 + 1) & 63;
        this.index = i10;
        if (i10 == 0) {
            advanceCounter();
            generateKeyStream(this.keyStream);
        }
        return b10;
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long seekTo(long j) {
        reset();
        return skip(j);
    }

    public void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + StubApp.getString2(28579));
            }
            int length = (bArr.length - 16) / 4;
            int[] iArr = this.engineState;
            int[] iArr2 = TAU_SIGMA;
            iArr[0] = iArr2[length];
            iArr[5] = iArr2[length + 1];
            iArr[10] = iArr2[length + 2];
            iArr[15] = iArr2[length + 3];
            Pack.littleEndianToInt(bArr, 0, iArr, 1, 4);
            Pack.littleEndianToInt(bArr, bArr.length - 16, this.engineState, 11, 4);
        }
        Pack.littleEndianToInt(bArr2, 0, this.engineState, 6, 2);
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long skip(long j) {
        long j3;
        if (j >= 0) {
            if (j >= 64) {
                long j10 = j / 64;
                advanceCounter(j10);
                j3 = j - (j10 * 64);
            } else {
                j3 = j;
            }
            int i3 = this.index;
            int i10 = (((int) j3) + i3) & 63;
            this.index = i10;
            if (i10 < i3) {
                advanceCounter();
            }
        } else {
            long j11 = -j;
            if (j11 >= 64) {
                long j12 = j11 / 64;
                retreatCounter(j12);
                j11 -= j12 * 64;
            }
            for (long j13 = 0; j13 < j11; j13++) {
                if (this.index == 0) {
                    retreatCounter();
                }
                this.index = (this.index - 1) & 63;
            }
        }
        generateKeyStream(this.keyStream);
        return j;
    }

    public Salsa20Engine(int i3) {
        this.index = 0;
        this.engineState = new int[16];
        this.f18961x = new int[16];
        this.keyStream = new byte[64];
        this.initialised = false;
        if (i3 <= 0 || (i3 & 1) != 0) {
            throw new IllegalArgumentException(StubApp.getString2(28757));
        }
        this.rounds = i3;
    }

    private boolean limitExceeded(int i3) {
        int i10 = this.cW0 + i3;
        this.cW0 = i10;
        if (i10 < i3 && i10 >= 0) {
            int i11 = this.cW1 + 1;
            this.cW1 = i11;
            if (i11 == 0) {
                int i12 = this.cW2 + 1;
                this.cW2 = i12;
                if ((i12 & 32) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public void advanceCounter(long j) {
        int i3 = (int) (j >>> 32);
        int i10 = (int) j;
        if (i3 > 0) {
            int[] iArr = this.engineState;
            iArr[9] = iArr[9] + i3;
        }
        int[] iArr2 = this.engineState;
        int i11 = iArr2[8];
        int i12 = i10 + i11;
        iArr2[8] = i12;
        if (i11 == 0 || i12 >= i11) {
            return;
        }
        iArr2[9] = iArr2[9] + 1;
    }

    public void retreatCounter(long j) {
        int i3 = (int) (j >>> 32);
        int i10 = (int) j;
        String string2 = StubApp.getString2(28575);
        if (i3 != 0) {
            int[] iArr = this.engineState;
            int i11 = iArr[9];
            if ((i11 & BodyPartID.bodyIdMax) < (i3 & BodyPartID.bodyIdMax)) {
                throw new IllegalStateException(string2);
            }
            iArr[9] = i11 - i3;
        }
        int[] iArr2 = this.engineState;
        int i12 = iArr2[8];
        if ((i12 & BodyPartID.bodyIdMax) >= (BodyPartID.bodyIdMax & i10)) {
            iArr2[8] = i12 - i10;
            return;
        }
        int i13 = iArr2[9];
        if (i13 == 0) {
            throw new IllegalStateException(string2);
        }
        iArr2[9] = i13 - 1;
        iArr2[8] = i12 - i10;
    }
}
