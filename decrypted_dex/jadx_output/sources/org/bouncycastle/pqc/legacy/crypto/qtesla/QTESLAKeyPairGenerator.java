package org.bouncycastle.pqc.legacy.crypto.qtesla;

import com.stub.StubApp;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class QTESLAKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private SecureRandom secureRandom;
    private int securityCategory;

    private byte[] allocatePrivate(int i3) {
        return new byte[QTESLASecurityCategory.getPrivateSize(i3)];
    }

    private byte[] allocatePublic(int i3) {
        return new byte[QTESLASecurityCategory.getPublicSize(i3)];
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        byte[] allocatePrivate = allocatePrivate(this.securityCategory);
        byte[] allocatePublic = allocatePublic(this.securityCategory);
        int i3 = this.securityCategory;
        if (i3 == 5) {
            QTesla1p.generateKeyPair(allocatePublic, allocatePrivate, this.secureRandom);
        } else {
            if (i3 != 6) {
                throw new IllegalArgumentException(StubApp.getString2(34237) + this.securityCategory);
            }
            QTesla3p.generateKeyPair(allocatePublic, allocatePrivate, this.secureRandom);
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new QTESLAPublicKeyParameters(this.securityCategory, allocatePublic), (AsymmetricKeyParameter) new QTESLAPrivateKeyParameters(this.securityCategory, allocatePrivate));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        QTESLAKeyGenerationParameters qTESLAKeyGenerationParameters = (QTESLAKeyGenerationParameters) keyGenerationParameters;
        this.secureRandom = qTESLAKeyGenerationParameters.getRandom();
        this.securityCategory = qTESLAKeyGenerationParameters.getSecurityCategory();
    }
}
