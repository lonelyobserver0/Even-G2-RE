package org.bouncycastle.crypto.agreement;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.RawAgreement;
import org.bouncycastle.crypto.params.X25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.X25519PublicKeyParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class X25519Agreement implements RawAgreement {
    private X25519PrivateKeyParameters privateKey;

    @Override // org.bouncycastle.crypto.RawAgreement
    public void calculateAgreement(CipherParameters cipherParameters, byte[] bArr, int i3) {
        this.privateKey.generateSecret((X25519PublicKeyParameters) cipherParameters, bArr, i3);
    }

    @Override // org.bouncycastle.crypto.RawAgreement
    public int getAgreementSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.RawAgreement
    public void init(CipherParameters cipherParameters) {
        X25519PrivateKeyParameters x25519PrivateKeyParameters = (X25519PrivateKeyParameters) cipherParameters;
        this.privateKey = x25519PrivateKeyParameters;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(StubApp.getString2(28389), x25519PrivateKeyParameters));
    }
}
