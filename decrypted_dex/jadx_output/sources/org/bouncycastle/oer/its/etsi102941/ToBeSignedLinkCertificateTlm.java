package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ieee1609dot2.HashedData;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Time32;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ToBeSignedLinkCertificateTlm extends ToBeSignedLinkCertificate {
    public ToBeSignedLinkCertificateTlm(ASN1Sequence aSN1Sequence) {
        super(aSN1Sequence);
    }

    public static ToBeSignedLinkCertificateTlm getInstance(Object obj) {
        if (obj instanceof ToBeSignedLinkCertificateTlm) {
            return (ToBeSignedLinkCertificateTlm) obj;
        }
        if (obj instanceof ToBeSignedLinkCertificate) {
            return new ToBeSignedLinkCertificateTlm((ToBeSignedLinkCertificate) obj);
        }
        if (obj != null) {
            return new ToBeSignedLinkCertificateTlm(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private ToBeSignedLinkCertificateTlm(ToBeSignedLinkCertificate toBeSignedLinkCertificate) {
        super(toBeSignedLinkCertificate.getExpiryTime(), toBeSignedLinkCertificate.getCertificateHash());
    }

    public ToBeSignedLinkCertificateTlm(Time32 time32, HashedData hashedData) {
        super(time32, hashedData);
    }
}
