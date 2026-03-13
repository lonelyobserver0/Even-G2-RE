package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.etsi103097.EtsiTs103097DataSignedAndEncryptedUnicast;
import org.bouncycastle.oer.its.ieee1609dot2.Ieee1609Dot2Content;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class AuthorizationValidationRequestMessage extends EtsiTs103097DataSignedAndEncryptedUnicast {
    public AuthorizationValidationRequestMessage(ASN1Sequence aSN1Sequence) {
        super(aSN1Sequence);
    }

    public static AuthorizationValidationRequestMessage getInstance(Object obj) {
        if (obj instanceof AuthorizationValidationRequestMessage) {
            return (AuthorizationValidationRequestMessage) obj;
        }
        if (obj != null) {
            return new AuthorizationValidationRequestMessage(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public AuthorizationValidationRequestMessage(Ieee1609Dot2Content ieee1609Dot2Content) {
        super(ieee1609Dot2Content);
    }
}
