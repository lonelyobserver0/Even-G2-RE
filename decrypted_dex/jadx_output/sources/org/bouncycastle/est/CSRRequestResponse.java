package org.bouncycastle.est;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CSRRequestResponse {
    private final CSRAttributesResponse attributesResponse;
    private final Source source;

    public CSRRequestResponse(CSRAttributesResponse cSRAttributesResponse, Source source) {
        this.attributesResponse = cSRAttributesResponse;
        this.source = source;
    }

    public CSRAttributesResponse getAttributesResponse() {
        CSRAttributesResponse cSRAttributesResponse = this.attributesResponse;
        if (cSRAttributesResponse != null) {
            return cSRAttributesResponse;
        }
        throw new IllegalStateException(StubApp.getString2(29441));
    }

    public Object getSession() {
        return this.source.getSession();
    }

    public Source getSource() {
        return this.source;
    }

    public boolean hasAttributesResponse() {
        return this.attributesResponse != null;
    }
}
