package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import kotlin.UByte;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class IDEAEngine implements BlockCipher {
    private static final int BASE = 65537;
    protected static final int BLOCK_SIZE = 8;
    private static final int MASK = 65535;
    private boolean forEncryption;
    private int[] workingKey = null;

    public IDEAEngine() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128));
    }

    private int bytesToWord(byte[] bArr, int i3) {
        return ((bArr[i3] << 8) & 65280) + (bArr[i3 + 1] & UByte.MAX_VALUE);
    }

    private int[] expandKey(byte[] bArr) {
        int i3;
        int[] iArr = new int[52];
        int i10 = 0;
        if (bArr.length < 16) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
            bArr = bArr2;
        }
        while (true) {
            if (i10 >= 8) {
                break;
            }
            iArr[i10] = bytesToWord(bArr, i10 * 2);
            i10++;
        }
        for (i3 = 8; i3 < 52; i3++) {
            int i11 = i3 & 7;
            if (i11 < 6) {
                iArr[i3] = (((iArr[i3 - 7] & CertificateBody.profileType) << 9) | (iArr[i3 - 6] >> 7)) & 65535;
            } else if (i11 == 6) {
                iArr[i3] = (((iArr[i3 - 7] & CertificateBody.profileType) << 9) | (iArr[i3 - 14] >> 7)) & 65535;
            } else {
                iArr[i3] = (((iArr[i3 - 15] & CertificateBody.profileType) << 9) | (iArr[i3 - 14] >> 7)) & 65535;
            }
        }
        return iArr;
    }

    private int[] generateWorkingKey(boolean z2, byte[] bArr) {
        return z2 ? expandKey(bArr) : invertKey(expandKey(bArr));
    }

    private void ideaFunc(int[] iArr, byte[] bArr, int i3, byte[] bArr2, int i10) {
        int bytesToWord = bytesToWord(bArr, i3);
        int bytesToWord2 = bytesToWord(bArr, i3 + 2);
        int bytesToWord3 = bytesToWord(bArr, i3 + 4);
        int bytesToWord4 = bytesToWord(bArr, i3 + 6);
        int i11 = 0;
        int i12 = bytesToWord3;
        int i13 = bytesToWord2;
        int i14 = bytesToWord;
        int i15 = 0;
        while (i11 < 8) {
            int mul = mul(i14, iArr[i15]);
            int i16 = (i13 + iArr[i15 + 1]) & 65535;
            int i17 = (i12 + iArr[i15 + 2]) & 65535;
            int mul2 = mul(bytesToWord4, iArr[i15 + 3]);
            int i18 = i15 + 5;
            int mul3 = mul(i17 ^ mul, iArr[i15 + 4]);
            i15 += 6;
            int mul4 = mul(((i16 ^ mul2) + mul3) & 65535, iArr[i18]);
            int i19 = 65535 & (mul3 + mul4);
            i14 = mul ^ mul4;
            bytesToWord4 = mul2 ^ i19;
            int i20 = i17 ^ mul4;
            i11++;
            i12 = i16 ^ i19;
            i13 = i20;
        }
        wordToBytes(mul(i14, iArr[i15]), bArr2, i10);
        wordToBytes(i12 + iArr[i15 + 1], bArr2, i10 + 2);
        wordToBytes(i13 + iArr[i15 + 2], bArr2, i10 + 4);
        wordToBytes(mul(bytesToWord4, iArr[i15 + 3]), bArr2, i10 + 6);
    }

    private int[] invertKey(int[] iArr) {
        int[] iArr2 = new int[52];
        int mulInv = mulInv(iArr[0]);
        int addInv = addInv(iArr[1]);
        int addInv2 = addInv(iArr[2]);
        iArr2[51] = mulInv(iArr[3]);
        iArr2[50] = addInv2;
        iArr2[49] = addInv;
        int i3 = 48;
        iArr2[48] = mulInv;
        int i10 = 4;
        for (int i11 = 1; i11 < 8; i11++) {
            int i12 = iArr[i10];
            iArr2[i3 - 1] = iArr[i10 + 1];
            iArr2[i3 - 2] = i12;
            int mulInv2 = mulInv(iArr[i10 + 2]);
            int addInv3 = addInv(iArr[i10 + 3]);
            int i13 = i10 + 5;
            int addInv4 = addInv(iArr[i10 + 4]);
            i10 += 6;
            iArr2[i3 - 3] = mulInv(iArr[i13]);
            iArr2[i3 - 4] = addInv3;
            iArr2[i3 - 5] = addInv4;
            i3 -= 6;
            iArr2[i3] = mulInv2;
        }
        int i14 = iArr[i10];
        iArr2[i3 - 1] = iArr[i10 + 1];
        iArr2[i3 - 2] = i14;
        int mulInv3 = mulInv(iArr[i10 + 2]);
        int addInv5 = addInv(iArr[i10 + 3]);
        int addInv6 = addInv(iArr[i10 + 4]);
        iArr2[i3 - 3] = mulInv(iArr[i10 + 5]);
        iArr2[i3 - 4] = addInv6;
        iArr2[i3 - 5] = addInv5;
        iArr2[i3 - 6] = mulInv3;
        return iArr2;
    }

    private int mul(int i3, int i10) {
        int i11;
        if (i3 == 0) {
            i11 = BASE - i10;
        } else if (i10 == 0) {
            i11 = BASE - i3;
        } else {
            int i12 = i3 * i10;
            int i13 = i12 & 65535;
            int i14 = i12 >>> 16;
            i11 = (i13 - i14) + (i13 < i14 ? 1 : 0);
        }
        return i11 & 65535;
    }

    private int mulInv(int i3) {
        if (i3 < 2) {
            return i3;
        }
        int i10 = BASE / i3;
        int i11 = BASE % i3;
        int i12 = 1;
        while (i11 != 1) {
            int i13 = i3 / i11;
            i3 %= i11;
            i12 = ((i13 * i10) + i12) & 65535;
            if (i3 == 1) {
                return i12;
            }
            int i14 = i11 / i3;
            i11 %= i3;
            i10 = ((i14 * i12) + i10) & 65535;
        }
        return (1 - i10) & 65535;
    }

    private void wordToBytes(int i3, byte[] bArr, int i10) {
        bArr[i10] = (byte) (i3 >>> 8);
        bArr[i10 + 1] = (byte) i3;
    }

    public int addInv(int i3) {
        return (0 - i3) & 65535;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28667);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.g(StubApp.getString2(28668), cipherParameters));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        this.workingKey = generateWorkingKey(z2, key);
        this.forEncryption = z2;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), key.length * 8, cipherParameters, Utils.getPurpose(z2)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        int[] iArr = this.workingKey;
        if (iArr == null) {
            throw new IllegalStateException(StubApp.getString2(28669));
        }
        if (i3 + 8 > bArr.length) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        if (i10 + 8 > bArr2.length) {
            throw new OutputLengthException(StubApp.getString2(28306));
        }
        ideaFunc(iArr, bArr, i3, bArr2, i10);
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
