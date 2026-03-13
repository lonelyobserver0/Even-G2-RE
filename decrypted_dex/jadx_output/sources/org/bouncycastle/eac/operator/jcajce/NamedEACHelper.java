package org.bouncycastle.eac.operator.jcajce;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class NamedEACHelper extends EACHelper {
    private final String providerName;

    public NamedEACHelper(String str) {
        this.providerName = str;
    }

    @Override // org.bouncycastle.eac.operator.jcajce.EACHelper
    public Signature createSignature(String str) throws NoSuchProviderException, NoSuchAlgorithmException {
        return Signature.getInstance(str, this.providerName);
    }
}
