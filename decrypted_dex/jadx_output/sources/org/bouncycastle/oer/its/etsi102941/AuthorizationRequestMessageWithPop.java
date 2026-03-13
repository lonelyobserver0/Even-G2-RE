package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.etsi103097.EtsiTs103097DataEncryptedUnicast;
import org.bouncycastle.oer.its.ieee1609dot2.Ieee1609Dot2Content;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class AuthorizationRequestMessageWithPop extends EtsiTs103097DataEncryptedUnicast {
    public AuthorizationRequestMessageWithPop(ASN1Sequence aSN1Sequence) {
        super(aSN1Sequence);
    }

    public static AuthorizationRequestMessageWithPop getInstance(Object obj) {
        if (obj instanceof AuthorizationRequestMessageWithPop) {
            return (AuthorizationRequestMessageWithPop) obj;
        }
        if (obj != null) {
            return new AuthorizationRequestMessageWithPop(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public AuthorizationRequestMessageWithPop(Ieee1609Dot2Content ieee1609Dot2Content) {
        super(ieee1609Dot2Content);
    }
}
