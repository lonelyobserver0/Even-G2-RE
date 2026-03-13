package org.bouncycastle.jcajce;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.X509CertSelector;
import java.util.Collection;
import org.bouncycastle.util.Selector;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKIXCertStoreSelector<T extends Certificate> implements Selector<T> {
    private final CertSelector baseSelector;

    /* renamed from: org.bouncycastle.jcajce.PKIXCertStoreSelector$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {
        private final CertSelector baseSelector;

        public Builder(CertSelector certSelector) {
            this.baseSelector = (CertSelector) certSelector.clone();
        }

        public PKIXCertStoreSelector<? extends Certificate> build() {
            return new PKIXCertStoreSelector<>(this.baseSelector, null);
        }
    }

    public static class SelectorClone extends X509CertSelector {
        private final PKIXCertStoreSelector selector;

        public SelectorClone(PKIXCertStoreSelector pKIXCertStoreSelector) {
            this.selector = pKIXCertStoreSelector;
            if (pKIXCertStoreSelector.baseSelector instanceof X509CertSelector) {
                X509CertSelector x509CertSelector = (X509CertSelector) pKIXCertStoreSelector.baseSelector;
                setAuthorityKeyIdentifier(x509CertSelector.getAuthorityKeyIdentifier());
                setBasicConstraints(x509CertSelector.getBasicConstraints());
                setCertificate(x509CertSelector.getCertificate());
                setCertificateValid(x509CertSelector.getCertificateValid());
                setKeyUsage(x509CertSelector.getKeyUsage());
                setMatchAllSubjectAltNames(x509CertSelector.getMatchAllSubjectAltNames());
                setPrivateKeyValid(x509CertSelector.getPrivateKeyValid());
                setSerialNumber(x509CertSelector.getSerialNumber());
                setSubjectKeyIdentifier(x509CertSelector.getSubjectKeyIdentifier());
                setSubjectPublicKey(x509CertSelector.getSubjectPublicKey());
                try {
                    setExtendedKeyUsage(x509CertSelector.getExtendedKeyUsage());
                    setIssuer(x509CertSelector.getIssuerAsBytes());
                    setNameConstraints(x509CertSelector.getNameConstraints());
                    setPathToNames(x509CertSelector.getPathToNames());
                    setPolicy(x509CertSelector.getPolicy());
                    setSubject(x509CertSelector.getSubjectAsBytes());
                    setSubjectAlternativeNames(x509CertSelector.getSubjectAlternativeNames());
                    setSubjectPublicKeyAlgID(x509CertSelector.getSubjectPublicKeyAlgID());
                } catch (IOException e10) {
                    throw new IllegalStateException(u.q(e10, new StringBuilder(StubApp.getString2(29644))), e10);
                }
            }
        }

        @Override // java.security.cert.X509CertSelector, java.security.cert.CertSelector
        public boolean match(Certificate certificate) {
            PKIXCertStoreSelector pKIXCertStoreSelector = this.selector;
            return pKIXCertStoreSelector == null ? certificate != null : pKIXCertStoreSelector.match(certificate);
        }
    }

    private PKIXCertStoreSelector(CertSelector certSelector) {
        this.baseSelector = certSelector;
    }

    public static Collection<? extends Certificate> getCertificates(PKIXCertStoreSelector pKIXCertStoreSelector, CertStore certStore) throws CertStoreException {
        return certStore.getCertificates(new SelectorClone(pKIXCertStoreSelector));
    }

    @Override // org.bouncycastle.util.Selector
    public Object clone() {
        return new PKIXCertStoreSelector(this.baseSelector);
    }

    public Certificate getCertificate() {
        CertSelector certSelector = this.baseSelector;
        if (certSelector instanceof X509CertSelector) {
            return ((X509CertSelector) certSelector).getCertificate();
        }
        return null;
    }

    public /* synthetic */ PKIXCertStoreSelector(CertSelector certSelector, AnonymousClass1 anonymousClass1) {
        this(certSelector);
    }

    @Override // org.bouncycastle.util.Selector
    public boolean match(Certificate certificate) {
        return this.baseSelector.match(certificate);
    }
}
