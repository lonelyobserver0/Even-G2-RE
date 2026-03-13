package org.bouncycastle.cert.path;

import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.cert.X509CertificateHolder;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class CertPathUtils {
    public static Set getCriticalExtensionsOIDs(X509CertificateHolder[] x509CertificateHolderArr) {
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 != x509CertificateHolderArr.length; i3++) {
            hashSet.addAll(x509CertificateHolderArr[i3].getCriticalExtensionOIDs());
        }
        return hashSet;
    }
}
