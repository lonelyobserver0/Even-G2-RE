package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import kotlin.UByte;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RC4Engine implements StreamCipher {
    private static final int STATE_LENGTH = 256;
    private boolean forEncryption;
    private byte[] engineState = null;

    /* renamed from: x, reason: collision with root package name */
    private int f18953x = 0;

    /* renamed from: y, reason: collision with root package name */
    private int f18954y = 0;
    private byte[] workingKey = null;

    public RC4Engine() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 20));
    }

    private void setKey(byte[] bArr) {
        this.workingKey = bArr;
        this.f18953x = 0;
        this.f18954y = 0;
        if (this.engineState == null) {
            this.engineState = new byte[256];
        }
        for (int i3 = 0; i3 < 256; i3++) {
            this.engineState[i3] = (byte) i3;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            int i13 = bArr[i10] & UByte.MAX_VALUE;
            byte[] bArr2 = this.engineState;
            byte b2 = bArr2[i12];
            i11 = (i13 + b2 + i11) & 255;
            bArr2[i12] = bArr2[i11];
            bArr2[i11] = b2;
            i10 = (i10 + 1) % bArr.length;
        }
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28260);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.g(StubApp.getString2(28716), cipherParameters));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        this.workingKey = key;
        this.forEncryption = z2;
        setKey(key);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 20, cipherParameters, Utils.getPurpose(z2)));
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
            int i13 = (this.f18953x + 1) & 255;
            this.f18953x = i13;
            byte[] bArr3 = this.engineState;
            byte b2 = bArr3[i13];
            int i14 = (this.f18954y + b2) & 255;
            this.f18954y = i14;
            bArr3[i13] = bArr3[i14];
            bArr3[i14] = b2;
            bArr2[i12 + i11] = (byte) (bArr3[(bArr3[i13] + b2) & 255] ^ bArr[i12 + i3]);
        }
        return i10;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        setKey(this.workingKey);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b2) {
        int i3 = (this.f18953x + 1) & 255;
        this.f18953x = i3;
        byte[] bArr = this.engineState;
        byte b10 = bArr[i3];
        int i10 = (this.f18954y + b10) & 255;
        this.f18954y = i10;
        bArr[i3] = bArr[i10];
        bArr[i10] = b10;
        return (byte) (b2 ^ bArr[(bArr[i3] + b10) & 255]);
    }
}
