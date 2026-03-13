package org.bouncycastle.crypto;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class AsymmetricCipherKeyPair {
    private AsymmetricKeyParameter privateParam;
    private AsymmetricKeyParameter publicParam;

    public AsymmetricCipherKeyPair(CipherParameters cipherParameters, CipherParameters cipherParameters2) {
        this.publicParam = (AsymmetricKeyParameter) cipherParameters;
        this.privateParam = (AsymmetricKeyParameter) cipherParameters2;
    }

    public AsymmetricKeyParameter getPrivate() {
        return this.privateParam;
    }

    public AsymmetricKeyParameter getPublic() {
        return this.publicParam;
    }

    public AsymmetricCipherKeyPair(AsymmetricKeyParameter asymmetricKeyParameter, AsymmetricKeyParameter asymmetricKeyParameter2) {
        this.publicParam = asymmetricKeyParameter;
        this.privateParam = asymmetricKeyParameter2;
    }
}
