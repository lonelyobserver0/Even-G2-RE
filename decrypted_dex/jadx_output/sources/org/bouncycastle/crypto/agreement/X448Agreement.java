package org.bouncycastle.crypto.agreement;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.RawAgreement;
import org.bouncycastle.crypto.params.X448PrivateKeyParameters;
import org.bouncycastle.crypto.params.X448PublicKeyParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class X448Agreement implements RawAgreement {
    private X448PrivateKeyParameters privateKey;

    @Override // org.bouncycastle.crypto.RawAgreement
    public void calculateAgreement(CipherParameters cipherParameters, byte[] bArr, int i3) {
        this.privateKey.generateSecret((X448PublicKeyParameters) cipherParameters, bArr, i3);
    }

    @Override // org.bouncycastle.crypto.RawAgreement
    public int getAgreementSize() {
        return 56;
    }

    @Override // org.bouncycastle.crypto.RawAgreement
    public void init(CipherParameters cipherParameters) {
        X448PrivateKeyParameters x448PrivateKeyParameters = (X448PrivateKeyParameters) cipherParameters;
        this.privateKey = x448PrivateKeyParameters;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(StubApp.getString2(28390), x448PrivateKeyParameters));
    }
}
