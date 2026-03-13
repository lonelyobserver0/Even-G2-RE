package org.bouncycastle.dvcs;

import org.bouncycastle.asn1.dvcs.TargetEtcChain;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class TargetChain {
    private final TargetEtcChain certs;

    public TargetChain(TargetEtcChain targetEtcChain) {
        this.certs = targetEtcChain;
    }

    public TargetEtcChain toASN1Structure() {
        return this.certs;
    }
}
