package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.X509Extensions;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SingleResponse extends ASN1Object {
    private CertID certID;
    private CertStatus certStatus;
    private ASN1GeneralizedTime nextUpdate;
    private Extensions singleExtensions;
    private ASN1GeneralizedTime thisUpdate;

    private SingleResponse(ASN1Sequence aSN1Sequence) {
        this.certID = CertID.getInstance(aSN1Sequence.getObjectAt(0));
        this.certStatus = CertStatus.getInstance(aSN1Sequence.getObjectAt(1));
        this.thisUpdate = ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(2));
        if (aSN1Sequence.size() > 4) {
            this.nextUpdate = ASN1GeneralizedTime.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(3), true);
            this.singleExtensions = Extensions.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(4), true);
        } else if (aSN1Sequence.size() > 3) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Sequence.getObjectAt(3);
            if (aSN1TaggedObject.getTagNo() == 0) {
                this.nextUpdate = ASN1GeneralizedTime.getInstance(aSN1TaggedObject, true);
            } else {
                this.singleExtensions = Extensions.getInstance(aSN1TaggedObject, true);
            }
        }
    }

    public static SingleResponse getInstance(Object obj) {
        if (obj instanceof SingleResponse) {
            return (SingleResponse) obj;
        }
        if (obj != null) {
            return new SingleResponse(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CertID getCertID() {
        return this.certID;
    }

    public CertStatus getCertStatus() {
        return this.certStatus;
    }

    public ASN1GeneralizedTime getNextUpdate() {
        return this.nextUpdate;
    }

    public Extensions getSingleExtensions() {
        return this.singleExtensions;
    }

    public ASN1GeneralizedTime getThisUpdate() {
        return this.thisUpdate;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(5);
        aSN1EncodableVector.add(this.certID);
        aSN1EncodableVector.add(this.certStatus);
        aSN1EncodableVector.add(this.thisUpdate);
        ASN1GeneralizedTime aSN1GeneralizedTime = this.nextUpdate;
        if (aSN1GeneralizedTime != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, (ASN1Encodable) aSN1GeneralizedTime));
        }
        Extensions extensions = this.singleExtensions;
        if (extensions != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, (ASN1Encodable) extensions));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public SingleResponse(CertID certID, CertStatus certStatus, ASN1GeneralizedTime aSN1GeneralizedTime, ASN1GeneralizedTime aSN1GeneralizedTime2, Extensions extensions) {
        this.certID = certID;
        this.certStatus = certStatus;
        this.thisUpdate = aSN1GeneralizedTime;
        this.nextUpdate = aSN1GeneralizedTime2;
        this.singleExtensions = extensions;
    }

    public static SingleResponse getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z2));
    }

    public SingleResponse(CertID certID, CertStatus certStatus, ASN1GeneralizedTime aSN1GeneralizedTime, ASN1GeneralizedTime aSN1GeneralizedTime2, X509Extensions x509Extensions) {
        this(certID, certStatus, aSN1GeneralizedTime, aSN1GeneralizedTime2, Extensions.getInstance(x509Extensions));
    }
}
