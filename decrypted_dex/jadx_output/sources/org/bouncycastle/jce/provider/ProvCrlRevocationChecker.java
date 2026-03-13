package org.bouncycastle.jce.provider;

import com.stub.StubApp;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Date;
import org.bouncycastle.jcajce.PKIXCertRevocationChecker;
import org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters;
import org.bouncycastle.jcajce.util.JcaJceHelper;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class ProvCrlRevocationChecker implements PKIXCertRevocationChecker {
    private Date currentDate = null;
    private final JcaJceHelper helper;
    private PKIXCertRevocationCheckerParameters params;

    public ProvCrlRevocationChecker(JcaJceHelper jcaJceHelper) {
        this.helper = jcaJceHelper;
    }

    @Override // org.bouncycastle.jcajce.PKIXCertRevocationChecker
    public void check(Certificate certificate) throws CertPathValidatorException {
        try {
            PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters = this.params;
            RFC3280CertPathUtilities.checkCRLs(pKIXCertRevocationCheckerParameters, pKIXCertRevocationCheckerParameters.getParamsPKIX(), this.currentDate, this.params.getValidDate(), (X509Certificate) certificate, this.params.getSigningCert(), this.params.getWorkingPublicKey(), this.params.getCertPath().getCertificates(), this.helper);
        } catch (AnnotatedException e10) {
            throw new CertPathValidatorException(e10.getMessage(), e10.getCause() != null ? e10.getCause() : e10, this.params.getCertPath(), this.params.getIndex());
        }
    }

    public void init(boolean z2) throws CertPathValidatorException {
        if (z2) {
            throw new CertPathValidatorException(StubApp.getString2(32720));
        }
        this.params = null;
        this.currentDate = new Date();
    }

    @Override // org.bouncycastle.jcajce.PKIXCertRevocationChecker
    public void initialize(PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters) {
        this.params = pKIXCertRevocationCheckerParameters;
        this.currentDate = new Date();
    }

    @Override // org.bouncycastle.jcajce.PKIXCertRevocationChecker
    public void setParameter(String str, Object obj) {
    }
}
