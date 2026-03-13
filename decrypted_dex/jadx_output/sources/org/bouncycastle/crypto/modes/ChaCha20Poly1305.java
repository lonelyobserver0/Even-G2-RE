package org.bouncycastle.crypto.modes;

import com.stub.StubApp;
import i2.u;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.engines.ChaCha7539Engine;
import org.bouncycastle.crypto.macs.Poly1305;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ChaCha20Poly1305 implements AEADCipher {
    private static final long AAD_LIMIT = -1;
    private static final int BUF_SIZE = 64;
    private static final long DATA_LIMIT = 274877906880L;
    private static final int KEY_SIZE = 32;
    private static final int MAC_SIZE = 16;
    private static final int NONCE_SIZE = 12;
    private static final byte[] ZEROES = new byte[15];
    private long aadCount;
    private final byte[] buf;
    private int bufPos;
    private final ChaCha7539Engine chacha20;
    private long dataCount;
    private byte[] initialAAD;
    private final byte[] key;
    private final byte[] mac;
    private final byte[] nonce;
    private final Mac poly1305;
    private int state;

    public static final class State {
        static final int DEC_AAD = 6;
        static final int DEC_DATA = 7;
        static final int DEC_FINAL = 8;
        static final int DEC_INIT = 5;
        static final int ENC_AAD = 2;
        static final int ENC_DATA = 3;
        static final int ENC_FINAL = 4;
        static final int ENC_INIT = 1;
        static final int UNINITIALIZED = 0;

        private State() {
        }
    }

    public ChaCha20Poly1305() {
        this(new Poly1305());
    }

    private void checkAAD() {
        int i3 = this.state;
        if (i3 == 1) {
            this.state = 2;
            return;
        }
        if (i3 != 2) {
            if (i3 == 4) {
                throw new IllegalStateException(StubApp.getString2(29082));
            }
            if (i3 == 5) {
                this.state = 6;
            } else if (i3 != 6) {
                throw new IllegalStateException();
            }
        }
    }

    private void checkData() {
        int i3;
        switch (this.state) {
            case 1:
            case 2:
                i3 = 3;
                break;
            case 3:
            case 7:
                return;
            case 4:
                throw new IllegalStateException(StubApp.getString2(29082));
            case 5:
            case 6:
                i3 = 7;
                break;
            default:
                throw new IllegalStateException();
        }
        finishAAD(i3);
    }

    private void finishAAD(int i3) {
        padMAC(this.aadCount);
        this.state = i3;
    }

    private void finishData(int i3) {
        padMAC(this.dataCount);
        byte[] bArr = new byte[16];
        Pack.longToLittleEndian(this.aadCount, bArr, 0);
        Pack.longToLittleEndian(this.dataCount, bArr, 8);
        this.poly1305.update(bArr, 0, 16);
        this.poly1305.doFinal(this.mac, 0);
        this.state = i3;
    }

    private long incrementCount(long j, int i3, long j3) {
        long j10 = i3;
        if (j - Long.MIN_VALUE <= (j3 - j10) - Long.MIN_VALUE) {
            return j + j10;
        }
        throw new IllegalStateException(StubApp.getString2(29083));
    }

    private void initMAC() {
        byte[] bArr = new byte[64];
        try {
            this.chacha20.processBytes(bArr, 0, 64, bArr, 0);
            this.poly1305.init(new KeyParameter(bArr, 0, 32));
        } finally {
            Arrays.clear(bArr);
        }
    }

    private void padMAC(long j) {
        int i3 = ((int) j) & 15;
        if (i3 != 0) {
            this.poly1305.update(ZEROES, 0, 16 - i3);
        }
    }

    private void processData(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) {
        if (i11 > bArr2.length - i10) {
            throw new OutputLengthException(StubApp.getString2(28608));
        }
        this.chacha20.processBytes(bArr, i3, i10, bArr2, i11);
        this.dataCount = incrementCount(this.dataCount, i10, DATA_LIMIT);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i3) throws IllegalStateException, InvalidCipherTextException {
        int i10;
        int i11;
        if (bArr == null) {
            throw new NullPointerException(StubApp.getString2(29086));
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(29085));
        }
        checkData();
        Arrays.clear(this.mac);
        int i12 = this.state;
        String string2 = StubApp.getString2(28608);
        if (i12 == 3) {
            int i13 = this.bufPos;
            int i14 = i13 + 16;
            if (i3 > bArr.length - i14) {
                throw new OutputLengthException(string2);
            }
            if (i13 > 0) {
                processData(this.buf, 0, i13, bArr, i3);
                this.poly1305.update(bArr, i3, this.bufPos);
            }
            finishData(4);
            System.arraycopy(this.mac, 0, bArr, this.bufPos + i3, 16);
            i10 = i14;
        } else {
            if (i12 != 7) {
                throw new IllegalStateException();
            }
            int i15 = this.bufPos;
            if (i15 < 16) {
                throw new InvalidCipherTextException(StubApp.getString2(29074));
            }
            int i16 = i15 - 16;
            if (i3 > bArr.length - i16) {
                throw new OutputLengthException(string2);
            }
            if (i16 > 0) {
                this.poly1305.update(this.buf, 0, i16);
                i11 = i16;
                processData(this.buf, 0, i11, bArr, i3);
            } else {
                i11 = i16;
            }
            finishData(8);
            if (!Arrays.constantTimeAreEqual(16, this.mac, 0, this.buf, i11)) {
                throw new InvalidCipherTextException(StubApp.getString2(29084));
            }
            i10 = i11;
        }
        reset(false, true);
        return i10;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return StubApp.getString2(29087);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return Arrays.clone(this.mac);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i3) {
        int max = Math.max(0, i3) + this.bufPos;
        int i10 = this.state;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return max + 16;
        }
        if (i10 == 5 || i10 == 6 || i10 == 7) {
            return Math.max(0, max - 16);
        }
        throw new IllegalStateException();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i3) {
        int max = Math.max(0, i3) + this.bufPos;
        int i10 = this.state;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            if (i10 != 5 && i10 != 6 && i10 != 7) {
                throw new IllegalStateException();
            }
            max = Math.max(0, max - 16);
        }
        return max - (max % 64);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        ParametersWithIV parametersWithIV;
        KeyParameter keyParameter;
        byte[] iv;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            int macSize = aEADParameters.getMacSize();
            if (128 != macSize) {
                throw new IllegalArgumentException(u.p(macSize, StubApp.getString2(29088)));
            }
            keyParameter = aEADParameters.getKey();
            iv = aEADParameters.getNonce();
            parametersWithIV = new ParametersWithIV(keyParameter, iv);
            this.initialAAD = aEADParameters.getAssociatedText();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException(StubApp.getString2(29093));
            }
            parametersWithIV = (ParametersWithIV) cipherParameters;
            keyParameter = (KeyParameter) parametersWithIV.getParameters();
            iv = parametersWithIV.getIV();
            this.initialAAD = null;
        }
        if (keyParameter == null) {
            if (this.state == 0) {
                throw new IllegalArgumentException(StubApp.getString2(29089));
            }
        } else if (32 != keyParameter.getKey().length) {
            throw new IllegalArgumentException(StubApp.getString2(29092));
        }
        if (iv == null || 12 != iv.length) {
            throw new IllegalArgumentException(StubApp.getString2(29091));
        }
        if (this.state != 0 && z2 && Arrays.areEqual(this.nonce, iv) && (keyParameter == null || Arrays.areEqual(this.key, keyParameter.getKey()))) {
            throw new IllegalArgumentException(StubApp.getString2(29090));
        }
        if (keyParameter != null) {
            System.arraycopy(keyParameter.getKey(), 0, this.key, 0, 32);
        }
        System.arraycopy(iv, 0, this.nonce, 0, 12);
        this.chacha20.init(true, parametersWithIV);
        this.state = z2 ? 1 : 5;
        reset(true, false);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b2) {
        checkAAD();
        this.aadCount = incrementCount(this.aadCount, 1, -1L);
        this.poly1305.update(b2);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i3, int i10) {
        if (bArr == null) {
            throw new NullPointerException(StubApp.getString2(29096));
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(29095));
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(29094));
        }
        if (i3 > bArr.length - i10) {
            throw new DataLengthException(StubApp.getString2(28609));
        }
        checkAAD();
        if (i10 > 0) {
            this.aadCount = incrementCount(this.aadCount, i10, -1L);
            this.poly1305.update(bArr, i3, i10);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b2, byte[] bArr, int i3) throws DataLengthException {
        checkData();
        int i10 = this.state;
        if (i10 == 3) {
            byte[] bArr2 = this.buf;
            int i11 = this.bufPos;
            bArr2[i11] = b2;
            int i12 = i11 + 1;
            this.bufPos = i12;
            if (i12 != 64) {
                return 0;
            }
            processData(bArr2, 0, 64, bArr, i3);
            this.poly1305.update(bArr, i3, 64);
            this.bufPos = 0;
            return 64;
        }
        if (i10 != 7) {
            throw new IllegalStateException();
        }
        byte[] bArr3 = this.buf;
        int i13 = this.bufPos;
        bArr3[i13] = b2;
        int i14 = i13 + 1;
        this.bufPos = i14;
        if (i14 != bArr3.length) {
            return 0;
        }
        this.poly1305.update(bArr3, 0, 64);
        processData(this.buf, 0, 64, bArr, i3);
        byte[] bArr4 = this.buf;
        System.arraycopy(bArr4, 64, bArr4, 0, 16);
        this.bufPos = 16;
        return 64;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws DataLengthException {
        int i12;
        int i13;
        if (bArr == null) {
            throw new NullPointerException(StubApp.getString2(29096));
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(29095));
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(29094));
        }
        if (i3 > bArr.length - i10) {
            throw new DataLengthException(StubApp.getString2(28609));
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(29085));
        }
        checkData();
        int i14 = this.state;
        if (i14 != 3) {
            if (i14 != 7) {
                throw new IllegalStateException();
            }
            int i15 = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                byte[] bArr3 = this.buf;
                int i17 = this.bufPos;
                bArr3[i17] = bArr[i3 + i16];
                int i18 = i17 + 1;
                this.bufPos = i18;
                if (i18 == bArr3.length) {
                    this.poly1305.update(bArr3, 0, 64);
                    processData(this.buf, 0, 64, bArr2, i11 + i15);
                    byte[] bArr4 = this.buf;
                    System.arraycopy(bArr4, 64, bArr4, 0, 16);
                    this.bufPos = 16;
                    i15 += 64;
                }
            }
            return i15;
        }
        if (this.bufPos != 0) {
            while (i10 > 0) {
                i10--;
                byte[] bArr5 = this.buf;
                int i19 = this.bufPos;
                int i20 = i3 + 1;
                bArr5[i19] = bArr[i3];
                int i21 = i19 + 1;
                this.bufPos = i21;
                if (i21 == 64) {
                    processData(bArr5, 0, 64, bArr2, i11);
                    this.poly1305.update(bArr2, i11, 64);
                    this.bufPos = 0;
                    i13 = 64;
                    i12 = i20;
                    break;
                }
                i3 = i20;
            }
        }
        i12 = i3;
        i13 = 0;
        while (i10 >= 64) {
            int i22 = i11 + i13;
            processData(bArr, i12, 64, bArr2, i22);
            this.poly1305.update(bArr2, i22, 64);
            i12 += 64;
            i10 -= 64;
            i13 += 64;
        }
        if (i10 > 0) {
            System.arraycopy(bArr, i12, this.buf, 0, i10);
            this.bufPos = i10;
        }
        return i13;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true, true);
    }

    public ChaCha20Poly1305(Mac mac) {
        this.key = new byte[32];
        this.nonce = new byte[12];
        this.buf = new byte[80];
        this.mac = new byte[16];
        this.state = 0;
        if (mac == null) {
            throw new NullPointerException(StubApp.getString2(29081));
        }
        if (16 != mac.getMacSize()) {
            throw new IllegalArgumentException(StubApp.getString2(29080));
        }
        this.chacha20 = new ChaCha7539Engine();
        this.poly1305 = mac;
    }

    private void reset(boolean z2, boolean z10) {
        Arrays.clear(this.buf);
        if (z2) {
            Arrays.clear(this.mac);
        }
        this.aadCount = 0L;
        this.dataCount = 0L;
        this.bufPos = 0;
        switch (this.state) {
            case 1:
            case 5:
                break;
            case 2:
            case 3:
            case 4:
                this.state = 4;
                return;
            case 6:
            case 7:
            case 8:
                this.state = 5;
                break;
            default:
                throw new IllegalStateException();
        }
        if (z10) {
            this.chacha20.reset();
        }
        initMAC();
        byte[] bArr = this.initialAAD;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }
}
