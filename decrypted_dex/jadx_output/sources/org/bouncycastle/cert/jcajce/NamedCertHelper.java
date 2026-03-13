package org.bouncycastle.cert.jcajce;

import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class NamedCertHelper extends CertHelper {
    private final String providerName;

    public NamedCertHelper(String str) {
        this.providerName = str;
    }

    @Override // org.bouncycastle.cert.jcajce.CertHelper
    public CertificateFactory createCertificateFactory(String str) throws CertificateException, NoSuchProviderException {
        return CertificateFactory.getInstance(str, this.providerName);
    }
}
