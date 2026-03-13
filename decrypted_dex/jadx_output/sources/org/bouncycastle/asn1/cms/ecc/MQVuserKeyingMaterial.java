package org.bouncycastle.asn1.cms.ecc;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.cms.OriginatorPublicKey;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class MQVuserKeyingMaterial extends ASN1Object {
    private ASN1OctetString addedukm;
    private OriginatorPublicKey ephemeralPublicKey;

    private MQVuserKeyingMaterial(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 1 && aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(StubApp.getString2(26935));
        }
        this.ephemeralPublicKey = OriginatorPublicKey.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            this.addedukm = ASN1OctetString.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(1), true);
        }
    }

    public static MQVuserKeyingMaterial getInstance(Object obj) {
        if (obj instanceof MQVuserKeyingMaterial) {
            return (MQVuserKeyingMaterial) obj;
        }
        if (obj != null) {
            return new MQVuserKeyingMaterial(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1OctetString getAddedukm() {
        return this.addedukm;
    }

    public OriginatorPublicKey getEphemeralPublicKey() {
        return this.ephemeralPublicKey;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.ephemeralPublicKey);
        ASN1OctetString aSN1OctetString = this.addedukm;
        if (aSN1OctetString != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, (ASN1Encodable) aSN1OctetString));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public MQVuserKeyingMaterial(OriginatorPublicKey originatorPublicKey, ASN1OctetString aSN1OctetString) {
        if (originatorPublicKey == null) {
            throw new IllegalArgumentException(StubApp.getString2(26936));
        }
        this.ephemeralPublicKey = originatorPublicKey;
        this.addedukm = aSN1OctetString;
    }

    public static MQVuserKeyingMaterial getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z2));
    }
}
