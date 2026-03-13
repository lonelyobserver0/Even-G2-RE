package org.bouncycastle.cert.jcajce;

import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.cert.CertificateException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.cert.X509CertificateHolder;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JcaX509CertificateConverter {
    private CertHelper helper;

    public static class ExCertificateException extends CertificateException {
        private Throwable cause;

        public ExCertificateException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    public static class ExCertificateParsingException extends CertificateParsingException {
        private Throwable cause;

        public ExCertificateParsingException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    public JcaX509CertificateConverter() {
        this.helper = new DefaultCertHelper();
        this.helper = new DefaultCertHelper();
    }

    public X509Certificate getCertificate(X509CertificateHolder x509CertificateHolder) throws CertificateException {
        try {
            return (X509Certificate) this.helper.getCertificateFactory(StubApp.getString2("19963")).generateCertificate(new ByteArrayInputStream(x509CertificateHolder.getEncoded()));
        } catch (IOException e10) {
            throw new ExCertificateParsingException(u.q(e10, new StringBuilder(StubApp.getString2(28094))), e10);
        } catch (NoSuchProviderException e11) {
            throw new ExCertificateException(StubApp.getString2(28093) + e11.getMessage(), e11);
        }
    }

    public JcaX509CertificateConverter setProvider(String str) {
        this.helper = new NamedCertHelper(str);
        return this;
    }

    public JcaX509CertificateConverter setProvider(Provider provider) {
        this.helper = new ProviderCertHelper(provider);
        return this;
    }
}
