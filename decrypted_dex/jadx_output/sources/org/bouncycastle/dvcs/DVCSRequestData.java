package org.bouncycastle.dvcs;

import org.bouncycastle.asn1.dvcs.Data;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class DVCSRequestData {
    protected Data data;

    public DVCSRequestData(Data data) {
        this.data = data;
    }

    public Data toASN1Structure() {
        return this.data;
    }
}
