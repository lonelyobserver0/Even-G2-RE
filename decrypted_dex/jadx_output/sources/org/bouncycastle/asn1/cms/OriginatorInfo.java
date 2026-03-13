package org.bouncycastle.asn1.cms;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class OriginatorInfo extends ASN1Object {
    private ASN1Set certs;
    private ASN1Set crls;

    private OriginatorInfo(ASN1Sequence aSN1Sequence) {
        int size = aSN1Sequence.size();
        if (size != 0) {
            if (size != 1) {
                if (size != 2) {
                    throw new IllegalArgumentException(StubApp.getString2(26922));
                }
                this.certs = ASN1Set.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(0), false);
                this.crls = ASN1Set.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(1), false);
                return;
            }
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Sequence.getObjectAt(0);
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                this.certs = ASN1Set.getInstance(aSN1TaggedObject, false);
            } else {
                if (tagNo != 1) {
                    throw new IllegalArgumentException(a.l(aSN1TaggedObject, new StringBuilder(StubApp.getString2(26923))));
                }
                this.crls = ASN1Set.getInstance(aSN1TaggedObject, false);
            }
        }
    }

    public static OriginatorInfo getInstance(Object obj) {
        if (obj instanceof OriginatorInfo) {
            return (OriginatorInfo) obj;
        }
        if (obj != null) {
            return new OriginatorInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1Set getCRLs() {
        return this.crls;
    }

    public ASN1Set getCertificates() {
        return this.certs;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        ASN1Set aSN1Set = this.certs;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, (ASN1Encodable) aSN1Set));
        }
        ASN1Set aSN1Set2 = this.crls;
        if (aSN1Set2 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, (ASN1Encodable) aSN1Set2));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static OriginatorInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z2));
    }

    public OriginatorInfo(ASN1Set aSN1Set, ASN1Set aSN1Set2) {
        this.certs = aSN1Set;
        this.crls = aSN1Set2;
    }
}
