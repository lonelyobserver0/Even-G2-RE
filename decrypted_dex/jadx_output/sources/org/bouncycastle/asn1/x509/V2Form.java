package org.bouncycastle.asn1.x509;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class V2Form extends ASN1Object {
    IssuerSerial baseCertificateID;
    GeneralNames issuerName;
    ObjectDigestInfo objectDigestInfo;

    private V2Form(ASN1Sequence aSN1Sequence) {
        int i3;
        if (aSN1Sequence.size() > 3) {
            throw new IllegalArgumentException(a.k(aSN1Sequence, new StringBuilder(StubApp.getString2(26912))));
        }
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1TaggedObject) {
            i3 = 0;
        } else {
            this.issuerName = GeneralNames.getInstance(aSN1Sequence.getObjectAt(0));
            i3 = 1;
        }
        while (i3 != aSN1Sequence.size()) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(i3));
            if (aSN1TaggedObject.getTagNo() == 0) {
                this.baseCertificateID = IssuerSerial.getInstance(aSN1TaggedObject, false);
            } else {
                if (aSN1TaggedObject.getTagNo() != 1) {
                    throw new IllegalArgumentException(a.l(aSN1TaggedObject, new StringBuilder(StubApp.getString2(27122))));
                }
                this.objectDigestInfo = ObjectDigestInfo.getInstance(aSN1TaggedObject, false);
            }
            i3++;
        }
    }

    public static V2Form getInstance(Object obj) {
        if (obj instanceof V2Form) {
            return (V2Form) obj;
        }
        if (obj != null) {
            return new V2Form(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public IssuerSerial getBaseCertificateID() {
        return this.baseCertificateID;
    }

    public GeneralNames getIssuerName() {
        return this.issuerName;
    }

    public ObjectDigestInfo getObjectDigestInfo() {
        return this.objectDigestInfo;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        GeneralNames generalNames = this.issuerName;
        if (generalNames != null) {
            aSN1EncodableVector.add(generalNames);
        }
        IssuerSerial issuerSerial = this.baseCertificateID;
        if (issuerSerial != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, (ASN1Encodable) issuerSerial));
        }
        ObjectDigestInfo objectDigestInfo = this.objectDigestInfo;
        if (objectDigestInfo != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, (ASN1Encodable) objectDigestInfo));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static V2Form getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z2));
    }

    public V2Form(GeneralNames generalNames) {
        this(generalNames, null, null);
    }

    public V2Form(GeneralNames generalNames, IssuerSerial issuerSerial) {
        this(generalNames, issuerSerial, null);
    }

    public V2Form(GeneralNames generalNames, IssuerSerial issuerSerial, ObjectDigestInfo objectDigestInfo) {
        this.issuerName = generalNames;
        this.baseCertificateID = issuerSerial;
        this.objectDigestInfo = objectDigestInfo;
    }

    public V2Form(GeneralNames generalNames, ObjectDigestInfo objectDigestInfo) {
        this(generalNames, null, objectDigestInfo);
    }
}
