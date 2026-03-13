package org.bouncycastle.asn1.x509;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class AccessDescription extends ASN1Object {
    public static final ASN1ObjectIdentifier id_ad_caIssuers = new ASN1ObjectIdentifier(StubApp.getString2(27708));
    public static final ASN1ObjectIdentifier id_ad_ocsp = new ASN1ObjectIdentifier(StubApp.getString2(27709));
    GeneralName accessLocation;
    ASN1ObjectIdentifier accessMethod;

    public AccessDescription(ASN1ObjectIdentifier aSN1ObjectIdentifier, GeneralName generalName) {
        this.accessMethod = aSN1ObjectIdentifier;
        this.accessLocation = generalName;
    }

    public static AccessDescription getInstance(Object obj) {
        if (obj instanceof AccessDescription) {
            return (AccessDescription) obj;
        }
        if (obj != null) {
            return new AccessDescription(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GeneralName getAccessLocation() {
        return this.accessLocation;
    }

    public ASN1ObjectIdentifier getAccessMethod() {
        return this.accessMethod;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.accessMethod);
        aSN1EncodableVector.add(this.accessLocation);
        return new DERSequence(aSN1EncodableVector);
    }

    public String toString() {
        return StubApp.getString2(27711) + this.accessMethod.getId() + StubApp.getString2(74);
    }

    private AccessDescription(ASN1Sequence aSN1Sequence) {
        this.accessMethod = null;
        this.accessLocation = null;
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(StubApp.getString2(27710));
        }
        this.accessMethod = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.accessLocation = GeneralName.getInstance(aSN1Sequence.getObjectAt(1));
    }
}
