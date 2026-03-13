package org.bouncycastle.cert.ocsp;

import java.util.Date;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ocsp.ResponseData;
import org.bouncycastle.asn1.ocsp.SingleResponse;
import org.bouncycastle.asn1.x509.Extensions;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RespData {
    private ResponseData data;

    public RespData(ResponseData responseData) {
        this.data = responseData;
    }

    public Date getProducedAt() {
        return OCSPUtils.extractDate(this.data.getProducedAt());
    }

    public RespID getResponderId() {
        return new RespID(this.data.getResponderID());
    }

    public Extensions getResponseExtensions() {
        return this.data.getResponseExtensions();
    }

    public SingleResp[] getResponses() {
        ASN1Sequence responses = this.data.getResponses();
        int size = responses.size();
        SingleResp[] singleRespArr = new SingleResp[size];
        for (int i3 = 0; i3 != size; i3++) {
            singleRespArr[i3] = new SingleResp(SingleResponse.getInstance(responses.getObjectAt(i3)));
        }
        return singleRespArr;
    }

    public int getVersion() {
        return this.data.getVersion().intValueExact() + 1;
    }
}
