package org.bouncycastle.jce;

import java.security.cert.CertStoreParameters;
import java.util.Collection;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class MultiCertStoreParameters implements CertStoreParameters {
    private Collection certStores;
    private boolean searchAllStores;

    public MultiCertStoreParameters(Collection collection) {
        this(collection, true);
    }

    @Override // java.security.cert.CertStoreParameters
    public Object clone() {
        return this;
    }

    public Collection getCertStores() {
        return this.certStores;
    }

    public boolean getSearchAllStores() {
        return this.searchAllStores;
    }

    public MultiCertStoreParameters(Collection collection, boolean z2) {
        this.certStores = collection;
        this.searchAllStores = z2;
    }
}
