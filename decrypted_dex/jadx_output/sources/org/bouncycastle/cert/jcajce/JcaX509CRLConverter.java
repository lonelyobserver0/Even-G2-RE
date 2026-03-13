package org.bouncycastle.cert.jcajce;

import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.cert.CRLException;
import java.security.cert.CertificateException;
import java.security.cert.X509CRL;
import org.bouncycastle.cert.X509CRLHolder;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JcaX509CRLConverter {
    private CertHelper helper;

    public static class ExCRLException extends CRLException {
        private Throwable cause;

        public ExCRLException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    public JcaX509CRLConverter() {
        this.helper = new DefaultCertHelper();
        this.helper = new DefaultCertHelper();
    }

    public X509CRL getCRL(X509CRLHolder x509CRLHolder) throws CRLException {
        try {
            return (X509CRL) this.helper.getCertificateFactory(StubApp.getString2("19963")).generateCRL(new ByteArrayInputStream(x509CRLHolder.getEncoded()));
        } catch (IOException e10) {
            throw new ExCRLException(u.q(e10, new StringBuilder(StubApp.getString2(28094))), e10);
        } catch (NoSuchProviderException e11) {
            throw new ExCRLException(StubApp.getString2(28093) + e11.getMessage(), e11);
        } catch (CertificateException e12) {
            throw new ExCRLException(StubApp.getString2(28092) + e12.getMessage(), e12);
        }
    }

    public JcaX509CRLConverter setProvider(String str) {
        this.helper = new NamedCertHelper(str);
        return this;
    }

    public JcaX509CRLConverter setProvider(Provider provider) {
        this.helper = new ProviderCertHelper(provider);
        return this;
    }
}
