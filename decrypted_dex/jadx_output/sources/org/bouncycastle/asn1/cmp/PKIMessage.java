package org.bouncycastle.asn1.cmp;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKIMessage extends ASN1Object {
    private final PKIBody body;
    private ASN1Sequence extraCerts;
    private final PKIHeader header;
    private ASN1BitString protection;

    private PKIMessage(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.header = PKIHeader.getInstance(objects.nextElement());
        this.body = PKIBody.getInstance(objects.nextElement());
        while (objects.hasMoreElements()) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects.nextElement();
            if (aSN1TaggedObject.getTagNo() == 0) {
                this.protection = DERBitString.getInstance(aSN1TaggedObject, true);
            } else {
                this.extraCerts = ASN1Sequence.getInstance(aSN1TaggedObject, true);
            }
        }
    }

    private void addOptional(ASN1EncodableVector aSN1EncodableVector, int i3, ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, i3, aSN1Encodable));
        }
    }

    public static PKIMessage getInstance(Object obj) {
        if (obj instanceof PKIMessage) {
            return (PKIMessage) obj;
        }
        if (obj != null) {
            return new PKIMessage(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public PKIBody getBody() {
        return this.body;
    }

    public CMPCertificate[] getExtraCerts() {
        ASN1Sequence aSN1Sequence = this.extraCerts;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        CMPCertificate[] cMPCertificateArr = new CMPCertificate[size];
        for (int i3 = 0; i3 < size; i3++) {
            cMPCertificateArr[i3] = CMPCertificate.getInstance(this.extraCerts.getObjectAt(i3));
        }
        return cMPCertificateArr;
    }

    public PKIHeader getHeader() {
        return this.header;
    }

    public ASN1BitString getProtection() {
        return this.protection;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.header);
        aSN1EncodableVector.add(this.body);
        addOptional(aSN1EncodableVector, 0, this.protection);
        addOptional(aSN1EncodableVector, 1, this.extraCerts);
        return new DERSequence(aSN1EncodableVector);
    }

    public PKIMessage(PKIHeader pKIHeader, PKIBody pKIBody) {
        this(pKIHeader, pKIBody, null, null);
    }

    public PKIMessage(PKIHeader pKIHeader, PKIBody pKIBody, ASN1BitString aSN1BitString) {
        this(pKIHeader, pKIBody, aSN1BitString, null);
    }

    public PKIMessage(PKIHeader pKIHeader, PKIBody pKIBody, ASN1BitString aSN1BitString, CMPCertificate[] cMPCertificateArr) {
        this.header = pKIHeader;
        this.body = pKIBody;
        this.protection = aSN1BitString;
        if (cMPCertificateArr != null) {
            this.extraCerts = new DERSequence(cMPCertificateArr);
        }
    }
}
