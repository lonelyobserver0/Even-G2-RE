package org.bouncycastle.dvcs;

import com.stub.StubApp;
import org.bouncycastle.asn1.dvcs.Data;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CCPDRequestData extends DVCSRequestData {
    public CCPDRequestData(Data data) throws DVCSConstructionException {
        super(data);
        initDigest();
    }

    private void initDigest() throws DVCSConstructionException {
        if (this.data.getMessageImprint() == null) {
            throw new DVCSConstructionException(StubApp.getString2(29406));
        }
    }

    public MessageImprint getMessageImprint() {
        return new MessageImprint(this.data.getMessageImprint());
    }
}
