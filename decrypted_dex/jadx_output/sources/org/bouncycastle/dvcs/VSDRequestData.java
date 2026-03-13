package org.bouncycastle.dvcs;

import com.stub.StubApp;
import org.bouncycastle.asn1.dvcs.Data;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.CMSSignedData;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class VSDRequestData extends DVCSRequestData {
    private CMSSignedData doc;

    public VSDRequestData(Data data) throws DVCSConstructionException {
        super(data);
        initDocument();
    }

    private void initDocument() throws DVCSConstructionException {
        if (this.doc == null) {
            if (this.data.getMessage() == null) {
                throw new DVCSConstructionException(StubApp.getString2(29419));
            }
            try {
                this.doc = new CMSSignedData(this.data.getMessage().getOctets());
            } catch (CMSException e10) {
                throw new DVCSConstructionException(StubApp.getString2(29418), e10);
            }
        }
    }

    public byte[] getMessage() {
        return this.data.getMessage().getOctets();
    }

    public CMSSignedData getParsedMessage() {
        return this.doc;
    }
}
