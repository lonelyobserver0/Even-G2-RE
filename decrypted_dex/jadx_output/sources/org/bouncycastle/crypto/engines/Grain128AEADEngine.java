package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.math.ec.Tnaf;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Grain128AEADEngine implements AEADCipher {
    private static final int STATE_SIZE = 4;
    private int[] authAcc;
    private int[] authSr;
    private int[] lfsr;
    private byte[] mac;
    private int[] nfsr;
    private int output;
    private byte[] workingIV;
    private byte[] workingKey;
    private boolean initialised = false;
    private boolean isEven = true;
    private boolean aadFinished = false;
    private ErasableOutputStream aadData = new ErasableOutputStream();

    public static final class ErasableOutputStream extends ByteArrayOutputStream {
        public void erase() {
            Arrays.fill(((ByteArrayOutputStream) this).buf, (byte) 0);
            reset();
        }

        public byte[] getBuf() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    private void accumulate() {
        int[] iArr = this.authAcc;
        int i3 = iArr[0];
        int[] iArr2 = this.authSr;
        iArr[0] = i3 ^ iArr2[0];
        iArr[1] = iArr[1] ^ iArr2[1];
    }

    private void authShift(int i3) {
        int[] iArr = this.authSr;
        int i10 = iArr[0] >>> 1;
        int i11 = iArr[1];
        iArr[0] = i10 | (i11 << 31);
        iArr[1] = (i3 << 31) | (i11 >>> 1);
    }

    private void doProcessAADBytes(byte[] bArr, int i3, int i10) {
        int i11;
        byte[] bArr2;
        if (i10 < 128) {
            bArr2 = new byte[i10 + 1];
            bArr2[0] = (byte) reverseByte(i10);
            i11 = 0;
        } else {
            int len_length = len_length(i10);
            byte[] bArr3 = new byte[len_length + 1 + i10];
            bArr3[0] = (byte) reverseByte(len_length | 128);
            int i12 = i10;
            int i13 = 0;
            while (i13 < len_length) {
                i13++;
                bArr3[i13] = (byte) reverseByte(i12 & 255);
                i12 >>>= 8;
            }
            i11 = len_length;
            bArr2 = bArr3;
        }
        for (int i14 = 0; i14 < i10; i14++) {
            bArr2[1 + i11 + i14] = (byte) reverseByte(bArr[i3 + i14]);
        }
        int i15 = 0;
        for (int i16 = 0; i16 < bArr2.length; i16++) {
            for (int i17 = 0; i17 < 16; i17++) {
                this.output = getOutput();
                this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) & 1);
                this.lfsr = shift(this.lfsr, getOutputLFSR() & 1);
                if ((i17 & 1) == 1) {
                    if (((byte) (bArr2[i15 >> 3] & (1 << (7 - (i15 & 7))))) != 0) {
                        accumulate();
                    }
                    authShift(this.output);
                    i15++;
                }
            }
        }
    }

    private byte[] getKeyStream(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) {
        byte[] bArr3 = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr3[i12] = (byte) reverseByte(bArr[i3 + i12]);
        }
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < i10; i16++) {
            byte b2 = 0;
            for (int i17 = 0; i17 < 16; i17++) {
                this.output = getOutput();
                this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) & 1);
                this.lfsr = shift(this.lfsr, getOutputLFSR() & 1);
                if (this.isEven) {
                    b2 = (byte) (b2 | ((((bArr3[i13 >> 3] >>> (7 - (i13 & 7))) & 1) ^ this.output) << (i15 & 7)));
                    i13++;
                    i15++;
                    this.isEven = false;
                } else {
                    if ((bArr3[i14 >> 3] & (1 << (7 - (i14 & 7)))) != 0) {
                        accumulate();
                    }
                    authShift(this.output);
                    i14++;
                    this.isEven = true;
                }
            }
            bArr2[i11 + i16] = b2;
        }
        return bArr2;
    }

    private int getOutput() {
        int[] iArr = this.nfsr;
        int i3 = iArr[0];
        int i10 = i3 >>> 12;
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = i12 >>> 9;
        int i14 = i12 >>> 25;
        int i15 = i12 >>> 31;
        int[] iArr2 = this.lfsr;
        int i16 = iArr2[0];
        int i17 = iArr2[1];
        int i18 = iArr2[2];
        int i19 = (i16 >>> 20) & (i16 >>> 13);
        return (((i12 ^ (((((((((i19 ^ ((i16 >>> 8) & i10)) ^ (i15 & (i17 >>> 10))) ^ ((i17 >>> 28) & (i18 >>> 15))) ^ ((i10 & i15) & (i18 >>> 30))) ^ (i18 >>> 29)) ^ (i3 >>> 2)) ^ (i3 >>> 15)) ^ (i11 >>> 4)) ^ (i11 >>> 13))) ^ i13) ^ i14) & 1;
    }

    private int getOutputLFSR() {
        int[] iArr = this.lfsr;
        int i3 = iArr[0];
        int i10 = iArr[1] >>> 6;
        int i11 = iArr[2];
        return (iArr[3] ^ ((((i3 ^ (i3 >>> 7)) ^ i10) ^ (i11 >>> 6)) ^ (i11 >>> 17))) & 1;
    }

    private int getOutputNFSR() {
        int[] iArr = this.nfsr;
        int i3 = iArr[0];
        int i10 = i3 >>> 25;
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = ((i3 >>> 26) ^ i3) ^ (i11 >>> 24);
        return (((((((((((iArr[3] ^ (i13 ^ (i12 >>> 27))) ^ ((i3 & i12) >>> 3)) ^ ((i3 >>> 11) & (i3 >>> 13))) ^ ((i3 >>> 17) & (i3 >>> 18))) ^ ((i3 & i11) >>> 27)) ^ ((i11 >>> 8) & (i11 >>> 16))) ^ ((i11 >>> 29) & (i12 >>> 1))) ^ ((i12 >>> 4) & (i12 >>> 20))) ^ (((i3 >>> 22) & (i3 >>> 24)) & i10)) ^ (((i12 >>> 6) & (i12 >>> 14)) & (i12 >>> 18))) ^ ((((i12 >>> 24) & (i12 >>> 28)) & (i12 >>> 29)) & (i12 >>> 31))) & 1;
    }

    private void initGrain() {
        for (int i3 = 0; i3 < 320; i3++) {
            this.output = getOutput();
            this.nfsr = shift(this.nfsr, ((getOutputNFSR() ^ this.lfsr[0]) ^ this.output) & 1);
            this.lfsr = shift(this.lfsr, 1 & (getOutputLFSR() ^ this.output));
        }
        for (int i10 = 0; i10 < 8; i10++) {
            for (int i11 = 0; i11 < 8; i11++) {
                this.output = getOutput();
                this.nfsr = shift(this.nfsr, (((getOutputNFSR() ^ this.lfsr[0]) ^ this.output) ^ (this.workingKey[i10] >> i11)) & 1);
                this.lfsr = shift(this.lfsr, ((getOutputLFSR() ^ this.output) ^ (this.workingKey[i10 + 8] >> i11)) & 1);
            }
        }
        for (int i12 = 0; i12 < 2; i12++) {
            for (int i13 = 0; i13 < 32; i13++) {
                this.output = getOutput();
                this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) & 1);
                this.lfsr = shift(this.lfsr, getOutputLFSR() & 1);
                int[] iArr = this.authAcc;
                iArr[i12] = iArr[i12] | (this.output << i13);
            }
        }
        for (int i14 = 0; i14 < 2; i14++) {
            for (int i15 = 0; i15 < 32; i15++) {
                this.output = getOutput();
                this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) & 1);
                this.lfsr = shift(this.lfsr, getOutputLFSR() & 1);
                int[] iArr2 = this.authSr;
                iArr2[i14] = iArr2[i14] | (this.output << i15);
            }
        }
        this.initialised = true;
    }

    private int len_length(int i3) {
        if ((i3 & 255) == i3) {
            return 1;
        }
        if ((65535 & i3) == i3) {
            return 2;
        }
        return (16777215 & i3) == i3 ? 3 : 4;
    }

    private int reverseByte(int i3) {
        int i10 = ((i3 & 170) >>> 1) | ((i3 & 85) << 1);
        int i11 = ((i10 & 204) >>> 2) | ((i10 & 51) << 2);
        return (((i11 & 240) >>> 4) | ((i11 & 15) << 4)) & 255;
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        bArr2[12] = -1;
        bArr2[13] = -1;
        bArr2[14] = -1;
        bArr2[15] = ByteCompanionObject.MAX_VALUE;
        this.workingKey = bArr;
        this.workingIV = bArr2;
        int i3 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.nfsr;
            if (i3 >= iArr.length) {
                return;
            }
            byte[] bArr3 = this.workingKey;
            int i11 = i10 + 3;
            int i12 = i10 + 2;
            int i13 = i10 + 1;
            iArr[i3] = (bArr3[i10] & UByte.MAX_VALUE) | (bArr3[i11] << 24) | ((bArr3[i12] << Tnaf.POW_2_WIDTH) & 16711680) | ((bArr3[i13] << 8) & 65280);
            int[] iArr2 = this.lfsr;
            byte[] bArr4 = this.workingIV;
            iArr2[i3] = (bArr4[i10] & UByte.MAX_VALUE) | (bArr4[i11] << 24) | ((bArr4[i12] << Tnaf.POW_2_WIDTH) & 16711680) | ((bArr4[i13] << 8) & 65280);
            i10 += 4;
            i3++;
        }
    }

    private int[] shift(int[] iArr, int i3) {
        int i10 = iArr[0] >>> 1;
        int i11 = iArr[1];
        iArr[0] = i10 | (i11 << 31);
        int i12 = i11 >>> 1;
        int i13 = iArr[2];
        iArr[1] = i12 | (i13 << 31);
        int i14 = iArr[3];
        iArr[2] = (i13 >>> 1) | (i14 << 31);
        iArr[3] = (i3 << 31) | (i14 >>> 1);
        return iArr;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i3) throws IllegalStateException, InvalidCipherTextException {
        if (!this.aadFinished) {
            doProcessAADBytes(this.aadData.getBuf(), 0, this.aadData.size());
            this.aadFinished = true;
        }
        this.mac = new byte[8];
        this.output = getOutput();
        this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) & 1);
        this.lfsr = shift(this.lfsr, 1 & getOutputLFSR());
        accumulate();
        int i10 = 0;
        for (int i11 = 0; i11 < 2; i11++) {
            int i12 = 0;
            while (i12 < 4) {
                this.mac[i10] = (byte) ((this.authAcc[i11] >>> (i12 << 3)) & 255);
                i12++;
                i10++;
            }
        }
        byte[] bArr2 = this.mac;
        System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
        try {
            return this.mac.length;
        } finally {
            reset();
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28644);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return this.mac;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i3) {
        return i3 + 8;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i3) {
        return i3;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException(StubApp.getString2(28648));
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv == null || iv.length != 12) {
            throw new IllegalArgumentException(StubApp.getString2(28647));
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException(StubApp.getString2(28646));
        }
        byte[] key = ((KeyParameter) parametersWithIV.getParameters()).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException(StubApp.getString2(28645));
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z2)));
        byte[] bArr = new byte[16];
        this.workingIV = bArr;
        this.workingKey = new byte[16];
        this.lfsr = new int[4];
        this.nfsr = new int[4];
        this.authAcc = new int[2];
        this.authSr = new int[2];
        System.arraycopy(iv, 0, bArr, 0, iv.length);
        System.arraycopy(key, 0, this.workingKey, 0, key.length);
        reset();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b2) {
        if (this.aadFinished) {
            throw new IllegalStateException(StubApp.getString2(28649));
        }
        this.aadData.write(b2);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i3, int i10) {
        if (this.aadFinished) {
            throw new IllegalStateException(StubApp.getString2(28649));
        }
        this.aadData.write(bArr, i3, i10);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b2, byte[] bArr, int i3) throws DataLengthException {
        return processBytes(new byte[]{b2}, 0, 1, bArr, i3);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws DataLengthException {
        if (!this.initialised) {
            throw new IllegalStateException(getAlgorithmName() + StubApp.getString2(28567));
        }
        if (!this.aadFinished) {
            doProcessAADBytes(this.aadData.getBuf(), 0, this.aadData.size());
            this.aadFinished = true;
        }
        if (i3 + i10 > bArr.length) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        if (i11 + i10 > bArr2.length) {
            throw new OutputLengthException(StubApp.getString2(28306));
        }
        getKeyStream(bArr, i3, i10, bArr2, i11);
        return i10;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        this.isEven = true;
        this.mac = null;
        this.aadData.reset();
        this.aadFinished = false;
        setKey(this.workingKey, this.workingIV);
        initGrain();
    }
}
