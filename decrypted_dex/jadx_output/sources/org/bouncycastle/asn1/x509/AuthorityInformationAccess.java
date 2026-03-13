package org.bouncycastle.asn1.x509;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class AuthorityInformationAccess extends ASN1Object {
    private AccessDescription[] descriptions;

    public AuthorityInformationAccess(ASN1ObjectIdentifier aSN1ObjectIdentifier, GeneralName generalName) {
        this(new AccessDescription(aSN1ObjectIdentifier, generalName));
    }

    private static AccessDescription[] copy(AccessDescription[] accessDescriptionArr) {
        AccessDescription[] accessDescriptionArr2 = new AccessDescription[accessDescriptionArr.length];
        System.arraycopy(accessDescriptionArr, 0, accessDescriptionArr2, 0, accessDescriptionArr.length);
        return accessDescriptionArr2;
    }

    public static AuthorityInformationAccess fromExtensions(Extensions extensions) {
        return getInstance(Extensions.getExtensionParsedValue(extensions, Extension.authorityInfoAccess));
    }

    public static AuthorityInformationAccess getInstance(Object obj) {
        if (obj instanceof AuthorityInformationAccess) {
            return (AuthorityInformationAccess) obj;
        }
        if (obj != null) {
            return new AuthorityInformationAccess(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public AccessDescription[] getAccessDescriptions() {
        return copy(this.descriptions);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.descriptions);
    }

    public String toString() {
        return StubApp.getString2(27713) + this.descriptions[0].getAccessMethod().getId() + StubApp.getString2(74);
    }

    private AuthorityInformationAccess(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 1) {
            throw new IllegalArgumentException(StubApp.getString2(27712));
        }
        this.descriptions = new AccessDescription[aSN1Sequence.size()];
        for (int i3 = 0; i3 != aSN1Sequence.size(); i3++) {
            this.descriptions[i3] = AccessDescription.getInstance(aSN1Sequence.getObjectAt(i3));
        }
    }

    public AuthorityInformationAccess(AccessDescription accessDescription) {
        this.descriptions = new AccessDescription[]{accessDescription};
    }

    public AuthorityInformationAccess(AccessDescription[] accessDescriptionArr) {
        this.descriptions = copy(accessDescriptionArr);
    }
}
