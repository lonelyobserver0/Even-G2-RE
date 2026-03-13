package org.bouncycastle.est;

import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.util.Store;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class EnrollmentResponse {
    private final long notBefore;
    private final PrivateKeyInfo privateKeyInfo;
    private final ESTRequest requestToRetry;
    private final Source source;
    private final Store<X509CertificateHolder> store;

    public EnrollmentResponse(Store<X509CertificateHolder> store, long j, ESTRequest eSTRequest, Source source) {
        this.store = store;
        this.notBefore = j;
        this.requestToRetry = eSTRequest;
        this.source = source;
        this.privateKeyInfo = null;
    }

    public boolean canRetry() {
        return this.notBefore < System.currentTimeMillis();
    }

    public long getNotBefore() {
        return this.notBefore;
    }

    public PrivateKeyInfo getPrivateKeyInfo() {
        return this.privateKeyInfo;
    }

    public ESTRequest getRequestToRetry() {
        return this.requestToRetry;
    }

    public Object getSession() {
        return this.source.getSession();
    }

    public Source getSource() {
        return this.source;
    }

    public Store<X509CertificateHolder> getStore() {
        return this.store;
    }

    public boolean isCompleted() {
        return this.requestToRetry == null;
    }

    public EnrollmentResponse(Store<X509CertificateHolder> store, long j, ESTRequest eSTRequest, Source source, PrivateKeyInfo privateKeyInfo) {
        this.store = store;
        this.notBefore = j;
        this.requestToRetry = eSTRequest;
        this.source = source;
        this.privateKeyInfo = privateKeyInfo;
    }
}
