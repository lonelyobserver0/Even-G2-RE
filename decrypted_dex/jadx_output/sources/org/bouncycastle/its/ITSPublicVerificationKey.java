package org.bouncycastle.its;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicVerificationKey;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ITSPublicVerificationKey {
    protected final PublicVerificationKey verificationKey;

    public ITSPublicVerificationKey(PublicVerificationKey publicVerificationKey) {
        this.verificationKey = publicVerificationKey;
    }

    public PublicVerificationKey toASN1Structure() {
        return this.verificationKey;
    }
}
