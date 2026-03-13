package org.bouncycastle.dvcs;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.dvcs.Data;
import org.bouncycastle.asn1.dvcs.TargetEtcChain;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class VPKCRequestData extends DVCSRequestData {
    private List chains;

    public VPKCRequestData(Data data) throws DVCSConstructionException {
        super(data);
        TargetEtcChain[] certs = data.getCerts();
        if (certs == null) {
            throw new DVCSConstructionException(StubApp.getString2(29416));
        }
        this.chains = new ArrayList(certs.length);
        for (int i3 = 0; i3 != certs.length; i3++) {
            this.chains.add(new TargetChain(certs[i3]));
        }
    }

    public List getCerts() {
        return Collections.unmodifiableList(this.chains);
    }
}
