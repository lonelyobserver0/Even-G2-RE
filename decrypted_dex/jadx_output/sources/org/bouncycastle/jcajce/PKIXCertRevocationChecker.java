package org.bouncycastle.jcajce;

import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface PKIXCertRevocationChecker {
    void check(Certificate certificate) throws CertPathValidatorException;

    void initialize(PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters) throws CertPathValidatorException;

    void setParameter(String str, Object obj);
}
