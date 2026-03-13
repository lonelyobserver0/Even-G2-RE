package org.bouncycastle.pkix.jcajce;

import java.security.cert.CertPathValidatorException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class CRLNotFoundException extends CertPathValidatorException {
    public CRLNotFoundException(String str) {
        super(str);
    }

    public CRLNotFoundException(String str, Throwable th) {
        super(str, th);
    }
}
