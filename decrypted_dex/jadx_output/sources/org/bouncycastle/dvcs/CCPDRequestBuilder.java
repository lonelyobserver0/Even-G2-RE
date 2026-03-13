package org.bouncycastle.dvcs;

import org.bouncycastle.asn1.dvcs.DVCSRequestInformationBuilder;
import org.bouncycastle.asn1.dvcs.Data;
import org.bouncycastle.asn1.dvcs.ServiceType;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CCPDRequestBuilder extends DVCSRequestBuilder {
    public CCPDRequestBuilder() {
        super(new DVCSRequestInformationBuilder(ServiceType.CCPD));
    }

    public DVCSRequest build(MessageImprint messageImprint) throws DVCSException {
        return createDVCRequest(new Data(messageImprint.toASN1Structure()));
    }
}
