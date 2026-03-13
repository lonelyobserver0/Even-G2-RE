package org.bouncycastle.pkix.jcajce;

import com.stub.StubApp;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.bouncycastle.jcajce.PKIXCRLStoreSelector;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.StoreException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
abstract class PKIXCRLUtil {
    public static Set findCRLs(PKIXCRLStoreSelector pKIXCRLStoreSelector, Date date, List list, List list2) throws AnnotatedException {
        HashSet hashSet = new HashSet();
        try {
            findCRLs(hashSet, pKIXCRLStoreSelector, list2);
            findCRLs(hashSet, pKIXCRLStoreSelector, list);
            HashSet hashSet2 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                X509CRL x509crl = (X509CRL) it.next();
                Date nextUpdate = x509crl.getNextUpdate();
                if (nextUpdate == null || nextUpdate.after(date)) {
                    X509Certificate certificateChecking = pKIXCRLStoreSelector.getCertificateChecking();
                    if (certificateChecking == null || x509crl.getThisUpdate().before(certificateChecking.getNotAfter())) {
                        hashSet2.add(x509crl);
                    }
                }
            }
            return hashSet2;
        } catch (AnnotatedException e10) {
            throw new AnnotatedException(StubApp.getString2(32705), e10);
        }
    }

    private static void findCRLs(HashSet hashSet, PKIXCRLStoreSelector pKIXCRLStoreSelector, List list) throws AnnotatedException {
        AnnotatedException annotatedException;
        AnnotatedException annotatedException2 = null;
        boolean z2 = false;
        for (Object obj : list) {
            boolean z10 = obj instanceof Store;
            String string2 = StubApp.getString2(32706);
            if (z10) {
                try {
                    hashSet.addAll(((Store) obj).getMatches(pKIXCRLStoreSelector));
                } catch (StoreException e10) {
                    annotatedException = new AnnotatedException(string2, e10);
                    annotatedException2 = annotatedException;
                }
            } else {
                try {
                    hashSet.addAll(PKIXCRLStoreSelector.getCRLs(pKIXCRLStoreSelector, (CertStore) obj));
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
