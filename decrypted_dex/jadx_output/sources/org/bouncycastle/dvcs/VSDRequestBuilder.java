package org.bouncycastle.dvcs;

import com.stub.StubApp;
import java.io.IOException;
import java.util.Date;
import org.bouncycastle.asn1.dvcs.DVCSRequestInformationBuilder;
import org.bouncycastle.asn1.dvcs.DVCSTime;
import org.bouncycastle.asn1.dvcs.Data;
import org.bouncycastle.asn1.dvcs.ServiceType;
import org.bouncycastle.cms.CMSSignedData;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class VSDRequestBuilder extends DVCSRequestBuilder {
    public VSDRequestBuilder() {
        super(new DVCSRequestInformationBuilder(ServiceType.VSD));
    }

    public DVCSRequest build(CMSSignedData cMSSignedData) throws DVCSException {
        try {
            return createDVCRequest(new Data(cMSSignedData.getEncoded()));
        } catch (IOException e10) {
            throw new DVCSException(StubApp.getString2(29417), e10);
        }
    }

    public void setRequestTime(Date date) {
        this.requestInformationBuilder.setRequestTime(new DVCSTime(date));
    }
}
