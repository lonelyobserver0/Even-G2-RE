package org.bouncycastle.its;

import org.bouncycastle.oer.its.ieee1609dot2.PKRecipientInfo;
import org.bouncycastle.oer.its.ieee1609dot2.RecipientInfo;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId8;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ETSIRecipientInfoBuilder {
    private final ETSIKeyWrapper keyWrapper;
    private final byte[] recipientID;

    public ETSIRecipientInfoBuilder(ETSIKeyWrapper eTSIKeyWrapper, byte[] bArr) {
        this.keyWrapper = eTSIKeyWrapper;
        this.recipientID = bArr;
    }

    public RecipientInfo build(byte[] bArr) {
        try {
            return RecipientInfo.certRecipInfo(PKRecipientInfo.builder().setRecipientId(new HashedId8(this.recipientID)).setEncKey(this.keyWrapper.wrap(bArr)).createPKRecipientInfo());
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }
}
