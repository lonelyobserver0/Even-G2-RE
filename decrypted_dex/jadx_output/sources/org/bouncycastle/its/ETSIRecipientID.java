package org.bouncycastle.its;

import org.bouncycastle.oer.its.ieee1609dot2.PKRecipientInfo;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId8;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Selector;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ETSIRecipientID implements Selector<ETSIRecipientInfo> {
    private final HashedId8 id;

    public ETSIRecipientID(HashedId8 hashedId8) {
        this.id = hashedId8;
    }

    @Override // org.bouncycastle.util.Selector
    public Object clone() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            HashedId8 hashedId8 = this.id;
            HashedId8 hashedId82 = ((ETSIRecipientID) obj).id;
            if (hashedId8 != null) {
                return hashedId8.equals(hashedId82);
            }
            if (hashedId82 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        HashedId8 hashedId8 = this.id;
        if (hashedId8 != null) {
            return hashedId8.hashCode();
        }
        return 0;
    }

    public ETSIRecipientID(byte[] bArr) {
        this(new HashedId8(bArr));
    }

    @Override // org.bouncycastle.util.Selector
    public boolean match(ETSIRecipientInfo eTSIRecipientInfo) {
        if (eTSIRecipientInfo.getRecipientInfo().getChoice() == 2) {
            return Arrays.areEqual(PKRecipientInfo.getInstance(eTSIRecipientInfo.getRecipientInfo().getRecipientInfo()).getRecipientId().getHashBytes(), this.id.getHashBytes());
        }
        return false;
    }
}
