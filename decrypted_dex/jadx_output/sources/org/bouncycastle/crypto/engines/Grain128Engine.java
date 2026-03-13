package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import kotlin.UByte;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.math.ec.Tnaf;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Grain128Engine implements StreamCipher {
    private static final int STATE_SIZE = 4;
    private int index = 4;
    private boolean initialised = false;
    private int[] lfsr;
    private int[] nfsr;
    private byte[] out;
    private int output;
    private byte[] workingIV;
    private byte[] workingKey;

    private byte getKeyStream() {
        if (this.index > 3) {
            oneRound();
            this.index = 0;
        }
        byte[] bArr = this.out;
        int i3 = this.index;
        this.index = i3 + 1;
        return bArr[i3];
    }

    private int getOutput() {
        int[] iArr = this.nfsr;
        int i3 = iArr[0];
        int i10 = iArr[1];
        int i11 = (i3 >>> 2) | (i10 << 30);
        int i12 = (i3 >>> 12) | (i10 << 20);
        int i13 = (i3 >>> 15) | (i10 << 17);
        int i14 = iArr[2];
        int i15 = (i10 >>> 4) | (i14 << 28);
        int i16 = (i10 >>> 13) | (i14 << 19);
        int i17 = iArr[3];
        int i18 = (i14 >>> 9) | (i17 << 23);
        int i19 = (i14 >>> 25) | (i17 << 7);
        int i20 = (i17 << 1) | (i14 >>> 31);
        int[] iArr2 = this.lfsr;
        int i21 = iArr2[0];
        int i22 = iArr2[1];
        int i23 = (i21 >>> 8) | (i22 << 24);
        int i24 = (i21 >>> 13) | (i22 << 19);
        int i25 = (i21 >>> 20) | (i22 << 12);
        int i26 = iArr2[2];
        int i27 = iArr2[3];
        int i28 = i24 & i25;
        return ((((((((((i20 & i12) & ((i27 << 1) | (i26 >>> 31))) ^ (((i28 ^ (i12 & i23)) ^ (i20 & ((i22 >>> 10) | (i26 << 22)))) ^ (((i22 >>> 28) | (i26 << 4)) & ((i26 >>> 15) | (i27 << 17))))) ^ ((i26 >>> 29) | (i27 << 3))) ^ i11) ^ i13) ^ i15) ^ i16) ^ i14) ^ i18) ^ i19;
    }

    private int getOutputLFSR() {
        int[] iArr = this.lfsr;
        int i3 = iArr[0];
        int i10 = iArr[1];
        int i11 = (i3 >>> 7) | (i10 << 25);
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = (i12 >>> 6) | (i13 << 26);
        return i13 ^ ((((i3 ^ i11) ^ ((i10 >>> 6) | (i12 << 26))) ^ i14) ^ ((i12 >>> 17) | (i13 << 15)));
    }

    private int getOutputNFSR() {
        int[] iArr = this.nfsr;
        int i3 = iArr[0];
        int i10 = iArr[1];
        int i11 = (i3 >>> 3) | (i10 << 29);
        int i12 = (i3 >>> 11) | (i10 << 21);
        int i13 = (i3 >>> 13) | (i10 << 19);
        int i14 = (i3 >>> 17) | (i10 << 15);
        int i15 = (i3 >>> 18) | (i10 << 14);
        int i16 = (i3 >>> 26) | (i10 << 6);
        int i17 = (i3 >>> 27) | (i10 << 5);
        int i18 = iArr[2];
        int i19 = (i10 >>> 8) | (i18 << 24);
        int i20 = (i10 >>> 16) | (i18 << 16);
        int i21 = (i10 >>> 24) | (i18 << 8);
        int i22 = (i10 >>> 27) | (i18 << 5);
        int i23 = (i10 >>> 29) | (i18 << 3);
        int i24 = iArr[3];
        return (((((((i24 ^ (((i3 ^ i16) ^ i21) ^ ((i18 >>> 27) | (i24 << 5)))) ^ (i11 & ((i18 >>> 3) | (i24 << 29)))) ^ (i12 & i13)) ^ (i14 & i15)) ^ (i17 & i22)) ^ (i19 & i20)) ^ (i23 & ((i18 >>> 1) | (i24 << 31)))) ^ (((i18 >>> 4) | (i24 << 28)) & ((i18 >>> 20) | (i24 << 12)));
    }

    private void initGrain() {
        for (int i3 = 0; i3 < 8; i3++) {
            this.output = getOutput();
            this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) ^ this.output);
            this.lfsr = shift(this.lfsr, getOutputLFSR() ^ this.output);
        }
        this.initialised = true;
    }

    private void oneRound() {
        int output = getOutput();
        this.output = output;
        byte[] bArr = this.out;
        bArr[0] = (byte) output;
        bArr[1] = (byte) (output >> 8);
        bArr[2] = (byte) (output >> 16);
        bArr[3] = (byte) (output >> 24);
        this.nfsr = shift(this.nfsr, getOutputNFSR() ^ this.lfsr[0]);
        this.lfsr = shift(this.lfsr, getOutputLFSR());
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        bArr2[12] = -1;
        bArr2[13] = -1;
        bArr2[14] = -1;
        bArr2[15] = -1;
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
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = i3;
        return iArr;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28650);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException(StubApp.getString2(28654));
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv == null || iv.length != 12) {
            throw new IllegalArgumentException(StubApp.getString2(28653));
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException(StubApp.getString2(28652));
        }
        byte[] key = ((KeyParameter) parametersWithIV.getParameters()).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException(StubApp.getString2(28651));
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z2)));
        byte[] bArr = new byte[key.length];
        this.workingIV = bArr;
        this.workingKey = new byte[key.length];
        this.lfsr = new int[4];
        this.nfsr = new int[4];
        this.out = new byte[4];
        System.arraycopy(iv, 0, bArr, 0, iv.length);
        System.arraycopy(key, 0, this.workingKey, 0, key.length);
        reset();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws DataLengthException {
        if (!this.initialised) {
            throw new IllegalStateException(getAlgorithmName() + StubApp.getString2(28567));
        }
        if (i3 + i10 > bArr.length) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        if (i11 + i10 > bArr2.length) {
            throw new OutputLengthException(StubApp.getString2(28306));
        }
        for (int i12 = 0; i12 < i10; i12++) {
            bArr2[i11 + i12] = (byte) (bArr[i3 + i12] ^ getKeyStream());
        }
        return i10;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        this.index = 4;
        setKey(this.workingKey, this.workingIV);
        initGrain();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b2) {
        if (this.initialised) {
            return (byte) (b2 ^ getKeyStream());
        }
        throw new IllegalStateException(getAlgorithmName() + StubApp.getString2(28567));
    }
}
