package org.bouncycastle.cert.jcajce;

import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
abstract class CertHelper {
    public abstract CertificateFactory createCertificateFactory(String str) throws CertificateException, NoSuchProviderException;

    public CertificateFactory getCertificateFactory(String str) throws NoSuchProviderException, CertificateException {
        return createCertificateFactory(str);
    }
}
