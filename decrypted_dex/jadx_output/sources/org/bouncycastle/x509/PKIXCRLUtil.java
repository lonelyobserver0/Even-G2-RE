package org.bouncycastle.x509;

import com.stub.StubApp;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.PKIXParameters;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.util.StoreException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
abstract class PKIXCRLUtil {
    public static Set findCRLs(X509CRLStoreSelector x509CRLStoreSelector, PKIXParameters pKIXParameters) throws AnnotatedException {
        HashSet hashSet = new HashSet();
        try {
            findCRLs(hashSet, x509CRLStoreSelector, pKIXParameters.getCertStores());
            return hashSet;
        } catch (AnnotatedException e10) {
            throw new AnnotatedException(StubApp.getString2(32705), e10);
        }
    }

    private static void findCRLs(HashSet hashSet, X509CRLStoreSelector x509CRLStoreSelector, List list) throws AnnotatedException {
        AnnotatedException annotatedException;
        AnnotatedException annotatedException2 = null;
        boolean z2 = false;
        for (Object obj : list) {
            boolean z10 = obj instanceof X509Store;
            String string2 = StubApp.getString2(32706);
            if (z10) {
                try {
                    hashSet.addAll(((X509Store) obj).getMatches(x509CRLStoreSelector));
                } catch (StoreException e10) {
                    annotatedException = new AnnotatedException(string2, e10);
                    annotatedException2 = annotatedException;
                }
            } else {
                try {
                    hashSet.addAll(((CertStore) obj).getCRLs(x509CRLStoreSelector));
                } catch (CertStoreException e11) {
                    annotatedException = new AnnotatedException(string2, e11);
                    annotatedException2 = annotatedException;
                }
            }
            z2 = true;
        }
        if (!z2 && annotatedException2 != null) {
            throw annotatedException2;
        }
    }
}
