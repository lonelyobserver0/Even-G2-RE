package org.bouncycastle.pqc.crypto.sike;

import com.stub.StubApp;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.EncapsulatedSecretExtractor;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SIKEKEMExtractor implements EncapsulatedSecretExtractor {
    private SIKEEngine engine;
    private SIKEKeyParameters key;

    public SIKEKEMExtractor(SIKEPrivateKeyParameters sIKEPrivateKeyParameters) {
        System.err.println(StubApp.getString2(34171));
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(StubApp.getString2(34172), 0, sIKEPrivateKeyParameters, CryptoServicePurpose.DECRYPTION));
        this.key = sIKEPrivateKeyParameters;
        initCipher(sIKEPrivateKeyParameters.getParameters());
    }

    private void initCipher(SIKEParameters sIKEParameters) {
        this.engine = sIKEParameters.getEngine();
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public byte[] extractSecret(byte[] bArr) {
        return extractSecret(bArr, this.engine.getDefaultSessionKeySize());
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public int getEncapsulationLength() {
        return this.engine.getCipherTextSize();
    }

    public byte[] extractSecret(byte[] bArr, int i3) {
        System.err.println(StubApp.getString2(34171));
        byte[] bArr2 = new byte[i3 / 8];
        this.engine.crypto_kem_dec(bArr2, bArr, ((SIKEPrivateKeyParameters) this.key).getPrivateKey());
        return bArr2;
    }
}
