package org.bouncycastle.dvcs;

import com.stub.StubApp;
import org.bouncycastle.asn1.dvcs.Data;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CPDRequestData extends DVCSRequestData {
    public CPDRequestData(Data data) throws DVCSConstructionException {
        super(data);
        initMessage();
    }

    private void initMessage() throws DVCSConstructionException {
        if (this.data.getMessage() == null) {
            throw new DVCSConstructionException(StubApp.getString2(29407));
        }
    }

    public byte[] getMessage() {
        return this.data.getMessage().getOctets();
    }
}
