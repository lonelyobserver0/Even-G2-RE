package org.bouncycastle.jce.provider;

import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class RecoverableCertPathValidatorException extends CertPathValidatorException {
    public RecoverableCertPathValidatorException(String str, Throwable th, CertPath certPath, int i3) {
        super(str, th, certPath, i3);
    }
}
