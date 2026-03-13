package org.bouncycastle.cert.jcajce;

import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class DefaultCertHelper extends CertHelper {
    @Override // org.bouncycastle.cert.jcajce.CertHelper
    public CertificateFactory createCertificateFactory(String str) throws CertificateException {
        return CertificateFactory.getInstance(str);
    }
}
