package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.etsi102941.basetypes.Version;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Time32;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.UINT8;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class FillCtl extends CtlFormat {
    public FillCtl(ASN1Sequence aSN1Sequence) {
        super(aSN1Sequence);
    }

    public static FillCtl getInstance(Object obj) {
        if (obj instanceof FillCtl) {
            return (FillCtl) obj;
        }
        if (obj != null) {
            return new FillCtl(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public FillCtl(Version version, Time32 time32, ASN1Boolean aSN1Boolean, UINT8 uint8, SequenceOfCtlCommand sequenceOfCtlCommand) {
        super(version, time32, aSN1Boolean, uint8, sequenceOfCtlCommand);
    }
}
