package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import kotlin.UByte;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Grainv1Engine implements StreamCipher {
    private static final int STATE_SIZE = 5;
    private int index = 2;
    private boolean initialised = false;
    private int[] lfsr;
    private int[] nfsr;
    private byte[] out;
    private int output;
    private byte[] workingIV;
    private byte[] workingKey;

    private byte getKeyStream() {
        if (this.index > 1) {
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
        int i11 = (i3 >>> 1) | (i10 << 15);
        int i12 = (i3 >>> 2) | (i10 << 14);
        int i13 = (i3 >>> 4) | (i10 << 12);
        int i14 = (i3 >>> 10) | (i10 << 6);
        int i15 = iArr[2];
        int i16 = (i10 >>> 15) | (i15 << 1);
        int i17 = iArr[3];
        int i18 = (i15 >>> 11) | (i17 << 5);
        int i19 = iArr[4];
        int i20 = (i17 >>> 8) | (i19 << 8);
        int i21 = (i19 << 1) | (i17 >>> 15);
        int[] iArr2 = this.lfsr;
        int i22 = iArr2[0] >>> 3;
        int i23 = iArr2[1];
        int i24 = i22 | (i23 << 13);
        int i25 = iArr2[2];
        int i26 = (i23 >>> 9) | (i25 << 7);
        int i27 = (iArr2[3] << 2) | (i25 >>> 14);
        int i28 = iArr2[4];
        int i29 = i27 & i28;
        int i30 = ((((i26 ^ i21) ^ (i24 & i28)) ^ i29) ^ (i28 & i21)) ^ ((i24 & i26) & i27);
        int i31 = i24 & i27;
        return (((((((((i21 & i29) ^ (((i31 & i21) ^ ((i28 & i31) ^ i30)) ^ ((i26 & i27) & i21))) ^ i11) ^ i12) ^ i13) ^ i14) ^ i16) ^ i18) ^ i20) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
    }

    private int getOutputLFSR() {
        int[] iArr = this.lfsr;
        int i3 = iArr[0];
        int i10 = iArr[1];
        int i11 = (i3 >>> 13) | (i10 << 3);
        int i12 = iArr[2];
        int i13 = (i10 >>> 7) | (i12 << 9);
        int i14 = iArr[3];
        int i15 = (i12 >>> 6) | (i14 << 10);
        int i16 = iArr[4];
        int i17 = (i14 >>> 3) | (i16 << 13);
        return (((i16 << 2) | (i14 >>> 14)) ^ ((((i3 ^ i11) ^ i13) ^ i15) ^ i17)) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
    }

    private int getOutputNFSR() {
        int[] iArr = this.nfsr;
        int i3 = iArr[0];
        int i10 = iArr[1];
        int i11 = (i3 >>> 9) | (i10 << 7);
        int i12 = (i3 >>> 14) | (i10 << 2);
        int i13 = (i3 >>> 15) | (i10 << 1);
        int i14 = iArr[2];
        int i15 = (i10 >>> 5) | (i14 << 11);
        int i16 = (i10 >>> 12) | (i14 << 4);
        int i17 = iArr[3];
        int i18 = (i14 >>> 1) | (i17 << 15);
        int i19 = (i14 >>> 5) | (i17 << 11);
        int i20 = (i14 >>> 13) | (i17 << 3);
        int i21 = iArr[4];
        int i22 = (i17 >>> 4) | (i21 << 12);
        int i23 = (i17 >>> 12) | (i21 << 4);
        int i24 = (i17 >>> 14) | (i21 << 2);
        int i25 = (i21 << 1) | (i17 >>> 15);
        int i26 = i25 & i23;
        int i27 = (((i3 ^ (((((((((i24 ^ i23) ^ i22) ^ i20) ^ i19) ^ i18) ^ i16) ^ i15) ^ i12) ^ i11)) ^ i26) ^ (i19 & i18)) ^ (i13 & i11);
        int i28 = i23 & i22;
        int i29 = i18 & i16 & i15;
        return (((((((((i25 & i20) & i16) & i11) ^ ((i27 ^ (i28 & i20)) ^ i29)) ^ ((i28 & i19) & i18)) ^ ((i26 & i15) & i13)) ^ (((i26 & i22) & i20) & i19)) ^ ((i29 & i13) & i11)) ^ (((((i22 & i20) & i19) & i18) & i16) & i15)) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
    }

    private void initGrain() {
        for (int i3 = 0; i3 < 10; i3++) {
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
        this.nfsr = shift(this.nfsr, getOutputNFSR() ^ this.lfsr[0]);
        this.lfsr = shift(this.lfsr, getOutputLFSR());
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        bArr2[8] = -1;
        bArr2[9] = -1;
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
            int i11 = i10 + 1;
            iArr[i3] = ((bArr3[i10] & UByte.MAX_VALUE) | (bArr3[i11] << 8)) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
            int[] iArr2 = this.lfsr;
            byte[] bArr4 = this.workingIV;
            iArr2[i3] = ((bArr4[i10] & UByte.MAX_VALUE) | (bArr4[i11] << 8)) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
            i10 += 2;
            i3++;
        }
    }

    private int[] shift(int[] iArr, int i3) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = iArr[4];
        iArr[4] = i3;
        return iArr;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28655);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException(StubApp.getString2(28659));
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv == null || iv.length != 8) {
            throw new IllegalArgumentException(StubApp.getString2(28658));
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException(StubApp.getString2(28657));
        }
        byte[] key = ((KeyParameter) parametersWithIV.getParameters()).getKey();
        if (key.length != 10) {
            throw new IllegalArgumentException(StubApp.getString2(28656));
        }
        byte[] bArr = new byte[key.length];
        this.workingIV = bArr;
        this.workingKey = new byte[key.length];
        this.lfsr = new int[5];
        this.nfsr = new int[5];
        this.out = new byte[2];
        System.arraycopy(iv, 0, bArr, 0, iv.length);
        System.arraycopy(key, 0, this.workingKey, 0, key.length);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 80, cipherParameters, Utils.getPurpose(z2)));
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
        this.index = 2;
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
