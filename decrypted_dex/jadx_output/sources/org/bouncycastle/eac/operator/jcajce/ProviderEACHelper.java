package org.bouncycastle.eac.operator.jcajce;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class ProviderEACHelper extends EACHelper {
    private final Provider provider;

    public ProviderEACHelper(Provider provider) {
        this.provider = provider;
    }

    @Override // org.bouncycastle.eac.operator.jcajce.EACHelper
    public Signature createSignature(String str) throws NoSuchAlgorithmException {
        return Signature.getInstance(str, this.provider);
    }
}
