package org.bouncycastle.pqc.legacy.crypto.qtesla;

import com.stub.StubApp;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class QTESLASigner implements MessageSigner {
    private QTESLAPrivateKeyParameters privateKey;
    private QTESLAPublicKeyParameters publicKey;
    private SecureRandom secureRandom;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        byte[] bArr2 = new byte[QTESLASecurityCategory.getSignatureSize(this.privateKey.getSecurityCategory())];
        int securityCategory = this.privateKey.getSecurityCategory();
        if (securityCategory == 5) {
            QTesla1p.generateSignature(bArr2, bArr, 0, bArr.length, this.privateKey.getSecret(), this.secureRandom);
            return bArr2;
        }
        if (securityCategory == 6) {
            QTesla3p.generateSignature(bArr2, bArr, 0, bArr.length, this.privateKey.getSecret(), this.secureRandom);
            return bArr2;
        }
        throw new IllegalArgumentException(StubApp.getString2(34237) + this.privateKey.getSecurityCategory());
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z2, CipherParameters cipherParameters) {
        int securityCategory;
        if (z2) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.secureRandom = parametersWithRandom.getRandom();
                this.privateKey = (QTESLAPrivateKeyParameters) parametersWithRandom.getParameters();
            } else {
                this.secureRandom = CryptoServicesRegistrar.getSecureRandom();
                this.privateKey = (QTESLAPrivateKeyParameters) cipherParameters;
            }
            this.publicKey = null;
            securityCategory = this.privateKey.getSecurityCategory();
        } else {
            this.privateKey = null;
            QTESLAPublicKeyParameters qTESLAPublicKeyParameters = (QTESLAPublicKeyParameters) cipherParameters;
            this.publicKey = qTESLAPublicKeyParameters;
            securityCategory = qTESLAPublicKeyParameters.getSecurityCategory();
        }
        QTESLASecurityCategory.validate(securityCategory);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        int verifying;
        int securityCategory = this.publicKey.getSecurityCategory();
        if (securityCategory == 5) {
            verifying = QTesla1p.verifying(bArr, bArr2, 0, bArr2.length, this.publicKey.getPublicData());
        } else {
            if (securityCategory != 6) {
                throw new IllegalArgumentException(StubApp.getString2(34237) + this.publicKey.getSecurityCategory());
            }
            verifying = QTesla3p.verifying(bArr, bArr2, 0, bArr2.length, this.publicKey.getPublicData());
        }
        return verifying == 0;
    }
}
