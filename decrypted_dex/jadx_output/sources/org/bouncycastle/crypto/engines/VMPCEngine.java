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

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class VMPCEngine implements StreamCipher {
    protected byte[] workingIV;
    protected byte[] workingKey;

    /* renamed from: n, reason: collision with root package name */
    protected byte f18967n = 0;

    /* renamed from: P, reason: collision with root package name */
    protected byte[] f18966P = null;

    /* renamed from: s, reason: collision with root package name */
    protected byte f18968s = 0;

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28791);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException(StubApp.getString2(28794));
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException(StubApp.getString2(28793));
        }
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        byte[] iv = parametersWithIV.getIV();
        this.workingIV = iv;
        if (iv == null || iv.length < 1 || iv.length > 768) {
            throw new IllegalArgumentException(StubApp.getString2(28792));
        }
        byte[] key = keyParameter.getKey();
        this.workingKey = key;
        initKey(key, this.workingIV);
        String algorithmName = getAlgorithmName();
        byte[] bArr = this.workingKey;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(algorithmName, bArr.length >= 32 ? 256 : bArr.length * 8, cipherParameters, Utils.getPurpose(z2)));
    }

    public void initKey(byte[] bArr, byte[] bArr2) {
        this.f18968s = (byte) 0;
        this.f18966P = new byte[256];
        for (int i3 = 0; i3 < 256; i3++) {
            this.f18966P[i3] = (byte) i3;
        }
        for (int i10 = 0; i10 < 768; i10++) {
            byte[] bArr3 = this.f18966P;
            byte b2 = this.f18968s;
            int i11 = i10 & 255;
            byte b10 = bArr3[i11];
            byte b11 = bArr3[(b2 + b10 + bArr[i10 % bArr.length]) & 255];
            this.f18968s = b11;
            bArr3[i11] = bArr3[b11 & UByte.MAX_VALUE];
            bArr3[b11 & UByte.MAX_VALUE] = b10;
        }
        for (int i12 = 0; i12 < 768; i12++) {
            byte[] bArr4 = this.f18966P;
            byte b12 = this.f18968s;
            int i13 = i12 & 255;
            byte b13 = bArr4[i13];
            byte b14 = bArr4[(b12 + b13 + bArr2[i12 % bArr2.length]) & 255];
            this.f18968s = b14;
            bArr4[i13] = bArr4[b14 & UByte.MAX_VALUE];
            bArr4[b14 & UByte.MAX_VALUE] = b13;
        }
        this.f18967n = (byte) 0;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) {
        if (i3 + i10 > bArr.length) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        if (i11 + i10 > bArr2.length) {
            throw new OutputLengthException(StubApp.getString2(28306));
        }
        for (int i12 = 0; i12 < i10; i12++) {
            byte[] bArr3 = this.f18966P;
            byte b2 = this.f18968s;
            byte b10 = this.f18967n;
            byte b11 = bArr3[(b2 + bArr3[b10 & UByte.MAX_VALUE]) & 255];
            this.f18968s = b11;
            byte b12 = bArr3[(bArr3[bArr3[b11 & UByte.MAX_VALUE] & UByte.MAX_VALUE] + 1) & 255];
            byte b13 = bArr3[b10 & UByte.MAX_VALUE];
            bArr3[b10 & UByte.MAX_VALUE] = bArr3[b11 & UByte.MAX_VALUE];
            bArr3[b11 & UByte.MAX_VALUE] = b13;
            this.f18967n = (byte) ((b10 + 1) & 255);
            bArr2[i12 + i11] = (byte) (bArr[i12 + i3] ^ b12);
        }
        return i10;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        initKey(this.workingKey, this.workingIV);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b2) {
        byte[] bArr = this.f18966P;
        byte b10 = this.f18968s;
        byte b11 = this.f18967n;
        byte b12 = bArr[(b10 + bArr[b11 & UByte.MAX_VALUE]) & 255];
        this.f18968s = b12;
        byte b13 = bArr[(bArr[bArr[b12 & UByte.MAX_VALUE] & UByte.MAX_VALUE] + 1) & 255];
        byte b14 = bArr[b11 & UByte.MAX_VALUE];
        bArr[b11 & UByte.MAX_VALUE] = bArr[b12 & UByte.MAX_VALUE];
        bArr[b12 & UByte.MAX_VALUE] = b14;
        this.f18967n = (byte) ((b11 + 1) & 255);
        return (byte) (b2 ^ b13);
    }
}
