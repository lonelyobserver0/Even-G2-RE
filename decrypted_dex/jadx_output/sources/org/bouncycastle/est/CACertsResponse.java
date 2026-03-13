package org.bouncycastle.est;

import com.stub.StubApp;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.util.Store;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CACertsResponse {
    private Store<X509CRLHolder> crlHolderStore;
    private final ESTRequest requestToRetry;
    private final Source session;
    private final Store<X509CertificateHolder> store;
    private final boolean trusted;

    public CACertsResponse(Store<X509CertificateHolder> store, Store<X509CRLHolder> store2, ESTRequest eSTRequest, Source source, boolean z2) {
        this.store = store;
        this.requestToRetry = eSTRequest;
        this.session = source;
        this.trusted = z2;
        this.crlHolderStore = store2;
    }

    public Store<X509CertificateHolder> getCertificateStore() {
        Store<X509CertificateHolder> store = this.store;
        if (store != null) {
            return store;
        }
        throw new IllegalStateException(StubApp.getString2(29439));
    }

    public Store<X509CRLHolder> getCrlStore() {
        Store<X509CRLHolder> store = this.crlHolderStore;
        if (store != null) {
            return store;
        }
        throw new IllegalStateException(StubApp.getString2(29440));
    }

    public ESTRequest getRequestToRetry() {
        return this.requestToRetry;
    }

    public Object getSession() {
        return this.session.getSession();
    }

    public boolean hasCRLs() {
        return this.crlHolderStore != null;
    }

    public boolean hasCertificates() {
        return this.store != null;
    }

    public boolean isTrusted() {
        return this.trusted;
    }
}
