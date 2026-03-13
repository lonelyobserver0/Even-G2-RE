package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DESedeEngine extends DESBase implements BlockCipher {
    protected static final int BLOCK_SIZE = 8;
    private boolean forEncryption;
    private int[] workingKey1 = null;
    private int[] workingKey2 = null;
    private int[] workingKey3 = null;

    public DESedeEngine() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), bitsOfSecurity()));
    }

    private int bitsOfSecurity() {
        int[] iArr = this.workingKey1;
        return (iArr == null || iArr != this.workingKey3) ? 112 : 80;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28590);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.g(StubApp.getString2(28592), cipherParameters));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 24 && key.length != 16) {
            throw new IllegalArgumentException(StubApp.getString2(28591));
        }
        this.forEncryption = z2;
        byte[] bArr = new byte[8];
        System.arraycopy(key, 0, bArr, 0, 8);
        this.workingKey1 = generateWorkingKey(z2, bArr);
        byte[] bArr2 = new byte[8];
        System.arraycopy(key, 8, bArr2, 0, 8);
        this.workingKey2 = generateWorkingKey(!z2, bArr2);
        if (key.length == 24) {
            byte[] bArr3 = new byte[8];
            System.arraycopy(key, 16, bArr3, 0, 8);
            this.workingKey3 = generateWorkingKey(z2, bArr3);
        } else {
            this.workingKey3 = this.workingKey1;
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), bitsOfSecurity(), cipherParameters, Utils.getPurpose(this.forEncryption)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        int[] iArr = this.workingKey1;
        if (iArr == null) {
            throw new IllegalStateException(StubApp.getString2(28593));
        }
        if (i3 + 8 > bArr.length) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        if (i10 + 8 > bArr2.length) {
            throw new OutputLengthException(StubApp.getString2(28306));
        }
        byte[] bArr3 = new byte[8];
        if (this.forEncryption) {
            desFunc(iArr, bArr, i3, bArr3, 0);
            desFunc(this.workingKey2, bArr3, 0, bArr3, 0);
            desFunc(this.workingKey3, bArr3, 0, bArr2, i10);
        } else {
            desFunc(this.workingKey3, bArr, i3, bArr3, 0);
            desFunc(this.workingKey2, bArr3, 0, bArr3, 0);
            desFunc(this.workingKey1, bArr3, 0, bArr2, i10);
        }
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
