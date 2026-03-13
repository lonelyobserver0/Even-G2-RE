package org.bouncycastle.asn1.x509;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class AttributeCertificateInfo extends ASN1Object {
    private AttCertValidityPeriod attrCertValidityPeriod;
    private ASN1Sequence attributes;
    private Extensions extensions;
    private Holder holder;
    private AttCertIssuer issuer;
    private ASN1BitString issuerUniqueID;
    private ASN1Integer serialNumber;
    private AlgorithmIdentifier signature;
    private ASN1Integer version;

    private AttributeCertificateInfo(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 6 || aSN1Sequence.size() > 9) {
            throw new IllegalArgumentException(a.k(aSN1Sequence, new StringBuilder(StubApp.getString2(26912))));
        }
        int i3 = 0;
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1Integer) {
            this.version = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
            i3 = 1;
        } else {
            this.version = new ASN1Integer(0L);
        }
        this.holder = Holder.getInstance(aSN1Sequence.getObjectAt(i3));
        this.issuer = AttCertIssuer.getInstance(aSN1Sequence.getObjectAt(i3 + 1));
        this.signature = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i3 + 2));
        this.serialNumber = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i3 + 3));
        this.attrCertValidityPeriod = AttCertValidityPeriod.getInstance(aSN1Sequence.getObjectAt(i3 + 4));
        this.attributes = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(i3 + 5));
        for (int i10 = i3 + 6; i10 < aSN1Sequence.size(); i10++) {
            ASN1Encodable objectAt = aSN1Sequence.getObjectAt(i10);
            if (objectAt instanceof ASN1BitString) {
                this.issuerUniqueID = ASN1BitString.getInstance(aSN1Sequence.getObjectAt(i10));
            } else if ((objectAt instanceof ASN1Sequence) || (objectAt instanceof Extensions)) {
                this.extensions = Extensions.getInstance(aSN1Sequence.getObjectAt(i10));
            }
        }
    }

    public static AttributeCertificateInfo getInstance(Object obj) {
        if (obj instanceof AttributeCertificateInfo) {
            return (AttributeCertificateInfo) obj;
        }
        if (obj != null) {
            return new AttributeCertificateInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public AttCertValidityPeriod getAttrCertValidityPeriod() {
        return this.attrCertValidityPeriod;
    }

    public ASN1Sequence getAttributes() {
        return this.attributes;
    }

    public Extensions getExtensions() {
        return this.extensions;
    }

    public Holder getHolder() {
        return this.holder;
    }

    public AttCertIssuer getIssuer() {
        return this.issuer;
    }

    public ASN1BitString getIssuerUniqueID() {
        return this.issuerUniqueID;
    }

    public ASN1Integer getSerialNumber() {
        return this.serialNumber;
    }

    public AlgorithmIdentifier getSignature() {
        return this.signature;
    }

    public ASN1Integer getVersion() {
        return this.version;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(9);
        if (!this.version.hasValue(0)) {
            aSN1EncodableVector.add(this.version);
        }
        aSN1EncodableVector.add(this.holder);
        aSN1EncodableVector.add(this.issuer);
        aSN1EncodableVector.add(this.signature);
        aSN1EncodableVector.add(this.serialNumber);
        aSN1EncodableVector.add(this.attrCertValidityPeriod);
        aSN1EncodableVector.add(this.attributes);
        ASN1BitString aSN1BitString = this.issuerUniqueID;
        if (aSN1BitString != null) {
            aSN1EncodableVector.add(aSN1BitString);
        }
        Extensions extensions = this.extensions;
        if (extensions != null) {
            aSN1EncodableVector.add(extensions);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static AttributeCertificateInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z2));
    }
}
