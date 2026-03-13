package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Shacal2Engine implements BlockCipher {
    private static final int BLOCK_SIZE = 32;

    /* renamed from: K, reason: collision with root package name */
    private static final int[] f18962K = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    private static final int ROUNDS = 64;
    private boolean forEncryption = false;
    private int[] workingKey = null;

    private void byteBlockToInts(byte[] bArr, int[] iArr, int i3, int i10) {
        while (i10 < 8) {
            int i11 = ((bArr[i3 + 1] & 255) << 16) | ((bArr[i3] & 255) << 24);
            int i12 = i3 + 3;
            int i13 = ((bArr[i3 + 2] & 255) << 8) | i11;
            i3 += 4;
            iArr[i10] = i13 | (bArr[i12] & 255);
            i10++;
        }
    }

    private void bytes2ints(byte[] bArr, int[] iArr, int i3, int i10) {
        while (i10 < bArr.length / 4) {
            int i11 = ((bArr[i3 + 1] & 255) << 16) | ((bArr[i3] & 255) << 24);
            int i12 = i3 + 3;
            int i13 = i11 | ((bArr[i3 + 2] & 255) << 8);
            i3 += 4;
            iArr[i10] = i13 | (bArr[i12] & 255);
            i10++;
        }
    }

    private void decryptBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        int[] iArr = new int[8];
        byteBlockToInts(bArr, iArr, i3, 0);
        for (int i11 = 63; i11 > -1; i11--) {
            int i12 = iArr[0];
            int i13 = iArr[1];
            int i14 = iArr[2];
            int i15 = iArr[3];
            int i16 = (i12 - ((((i13 >>> 2) | (i13 << (-2))) ^ ((i13 >>> 13) | (i13 << (-13)))) ^ ((i13 >>> 22) | (i13 << (-22))))) - (((i13 & i14) ^ (i13 & i15)) ^ (i14 & i15));
            iArr[0] = i13;
            iArr[1] = i14;
            iArr[2] = i15;
            iArr[3] = iArr[4] - i16;
            int i17 = iArr[5];
            iArr[4] = i17;
            int i18 = iArr[6];
            iArr[5] = i18;
            int i19 = iArr[7];
            iArr[6] = i19;
            iArr[7] = (((i16 - f18962K[i11]) - this.workingKey[i11]) - ((((i17 >>> 6) | (i17 << (-6))) ^ ((i17 >>> 11) | (i17 << (-11)))) ^ ((i17 >>> 25) | (i17 << (-25))))) - ((i17 & i18) ^ ((~i17) & i19));
        }
        ints2bytes(iArr, bArr2, i10);
    }

    private void encryptBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        int[] iArr = new int[8];
        byteBlockToInts(bArr, iArr, i3, 0);
        for (int i11 = 0; i11 < 64; i11++) {
            int i12 = iArr[4];
            int i13 = iArr[5];
            int i14 = ~i12;
            int i15 = iArr[6];
            int i16 = ((((i12 >>> 6) | (i12 << (-6))) ^ ((i12 >>> 11) | (i12 << (-11)))) ^ ((i12 >>> 25) | (i12 << (-25)))) + ((i12 & i13) ^ (i14 & i15)) + iArr[7] + f18962K[i11] + this.workingKey[i11];
            iArr[7] = i15;
            iArr[6] = i13;
            iArr[5] = i12;
            iArr[4] = iArr[3] + i16;
            int i17 = iArr[2];
            iArr[3] = i17;
            int i18 = iArr[1];
            iArr[2] = i18;
            int i19 = iArr[0];
            iArr[1] = i19;
            iArr[0] = i16 + ((((i19 >>> 2) | (i19 << (-2))) ^ ((i19 >>> 13) | (i19 << (-13)))) ^ ((i19 >>> 22) | (i19 << (-22)))) + (((i19 & i17) ^ (i19 & i18)) ^ (i18 & i17));
        }
        ints2bytes(iArr, bArr2, i10);
    }

    private void ints2bytes(int[] iArr, byte[] bArr, int i3) {
        for (int i10 : iArr) {
            bArr[i3] = (byte) (i10 >>> 24);
            bArr[i3 + 1] = (byte) (i10 >>> 16);
            int i11 = i3 + 3;
            bArr[i3 + 2] = (byte) (i10 >>> 8);
            i3 += 4;
            bArr[i11] = (byte) i10;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28770);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(StubApp.getString2(28570));
        }
        this.forEncryption = z2;
        this.workingKey = new int[64];
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        setKey(key);
        int length = key.length * 8;
        String algorithmName = getAlgorithmName();
        if (length >= 256) {
            length = 256;
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(algorithmName, length, cipherParameters, Utils.getPurpose(this.forEncryption)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) throws DataLengthException, IllegalStateException {
        if (this.workingKey == null) {
            throw new IllegalStateException(StubApp.getString2(28771));
        }
        if (i3 + 32 > bArr.length) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        if (i10 + 32 > bArr2.length) {
            throw new OutputLengthException(StubApp.getString2(28306));
        }
        if (this.forEncryption) {
            encryptBlock(bArr, i3, bArr2, i10);
            return 32;
        }
        decryptBlock(bArr, i3, bArr2, i10);
        return 32;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    public void setKey(byte[] bArr) {
        if (bArr.length != 0 && bArr.length <= 64) {
            if (bArr.length >= 16 && bArr.length % 8 == 0) {
                bytes2ints(bArr, this.workingKey, 0, 0);
                for (int i3 = 16; i3 < 64; i3++) {
                    int[] iArr = this.workingKey;
                    int i10 = iArr[i3 - 2];
                    int i11 = ((i10 >>> 10) ^ (((i10 >>> 17) | (i10 << (-17))) ^ ((i10 >>> 19) | (i10 << (-19))))) + iArr[i3 - 7];
                    int i12 = iArr[i3 - 15];
                    iArr[i3] = i11 + ((i12 >>> 3) ^ (((i12 >>> 7) | (i12 << (-7))) ^ ((i12 >>> 18) | (i12 << (-18))))) + iArr[i3 - 16];
                }
                return;
            }
        }
        throw new IllegalArgumentException(StubApp.getString2(28772));
    }
}
