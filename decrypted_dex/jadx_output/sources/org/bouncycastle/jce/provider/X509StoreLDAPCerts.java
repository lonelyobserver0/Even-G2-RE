package org.bouncycastle.jce.provider;

import Xa.h;
import com.stub.StubApp;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import org.bouncycastle.jce.X509LDAPCertStoreParameters;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.StoreException;
import org.bouncycastle.x509.X509CertPairStoreSelector;
import org.bouncycastle.x509.X509CertStoreSelector;
import org.bouncycastle.x509.X509CertificatePair;
import org.bouncycastle.x509.X509StoreParameters;
import org.bouncycastle.x509.X509StoreSpi;
import org.bouncycastle.x509.util.LDAPStoreHelper;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class X509StoreLDAPCerts extends X509StoreSpi {
    private LDAPStoreHelper helper;

    private Collection getCertificatesFromCrossCertificatePairs(X509CertStoreSelector x509CertStoreSelector) throws StoreException {
        HashSet hashSet = new HashSet();
        X509CertPairStoreSelector x509CertPairStoreSelector = new X509CertPairStoreSelector();
        x509CertPairStoreSelector.setForwardSelector(x509CertStoreSelector);
        x509CertPairStoreSelector.setReverseSelector(new X509CertStoreSelector());
        HashSet hashSet2 = new HashSet(this.helper.getCrossCertificatePairs(x509CertPairStoreSelector));
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            X509CertificatePair x509CertificatePair = (X509CertificatePair) it.next();
            if (x509CertificatePair.getForward() != null) {
                hashSet3.add(x509CertificatePair.getForward());
            }
            if (x509CertificatePair.getReverse() != null) {
                hashSet4.add(x509CertificatePair.getReverse());
            }
        }
        hashSet.addAll(hashSet3);
        hashSet.addAll(hashSet4);
        return hashSet;
    }

    @Override // org.bouncycastle.x509.X509StoreSpi
    public Collection engineGetMatches(Selector selector) throws StoreException {
        Collection userCertificates;
        if (!(selector instanceof X509CertStoreSelector)) {
            return Collections.EMPTY_SET;
        }
        X509CertStoreSelector x509CertStoreSelector = (X509CertStoreSelector) selector;
        HashSet hashSet = new HashSet();
        if (x509CertStoreSelector.getBasicConstraints() <= 0) {
            if (x509CertStoreSelector.getBasicConstraints() == -2) {
                userCertificates = this.helper.getUserCertificates(x509CertStoreSelector);
                hashSet.addAll(userCertificates);
                return hashSet;
            }
            hashSet.addAll(this.helper.getUserCertificates(x509CertStoreSelector));
        }
        hashSet.addAll(this.helper.getCACertificates(x509CertStoreSelector));
        userCertificates = getCertificatesFromCrossCertificatePairs(x509CertStoreSelector);
        hashSet.addAll(userCertificates);
        return hashSet;
    }

    @Override // org.bouncycastle.x509.X509StoreSpi
    public void engineInit(X509StoreParameters x509StoreParameters) {
        if (!(x509StoreParameters instanceof X509LDAPCertStoreParameters)) {
            throw new IllegalArgumentException(h.k(X509LDAPCertStoreParameters.class, new StringBuilder(StubApp.getString2(32876)), StubApp.getString2(1)));
        }
        this.helper = new LDAPStoreHelper((X509LDAPCertStoreParameters) x509StoreParameters);
    }
}
