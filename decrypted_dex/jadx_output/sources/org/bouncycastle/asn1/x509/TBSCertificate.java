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
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.util.Properties;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class TBSCertificate extends ASN1Object {
    Time endDate;
    Extensions extensions;
    X500Name issuer;
    ASN1BitString issuerUniqueId;
    ASN1Sequence seq;
    ASN1Integer serialNumber;
    AlgorithmIdentifier signature;
    Time startDate;
    X500Name subject;
    SubjectPublicKeyInfo subjectPublicKeyInfo;
    ASN1BitString subjectUniqueId;
    ASN1Integer version;

    private TBSCertificate(ASN1Sequence aSN1Sequence) {
        int i3;
        boolean z2;
        boolean z10;
        this.seq = aSN1Sequence;
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1TaggedObject) {
            this.version = ASN1Integer.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(0), true);
            i3 = 0;
        } else {
            this.version = new ASN1Integer(0L);
            i3 = -1;
        }
        if (this.version.hasValue(0)) {
            z10 = false;
            z2 = true;
        } else if (this.version.hasValue(1)) {
            z2 = false;
            z10 = true;
        } else {
            if (!this.version.hasValue(2)) {
                throw new IllegalArgumentException(StubApp.getString2(27848));
            }
            z2 = false;
            z10 = false;
        }
        this.serialNumber = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i3 + 1));
        this.signature = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i3 + 2));
        this.issuer = X500Name.getInstance(aSN1Sequence.getObjectAt(i3 + 3));
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(i3 + 4);
        this.startDate = Time.getInstance(aSN1Sequence2.getObjectAt(0));
        this.endDate = Time.getInstance(aSN1Sequence2.getObjectAt(1));
        this.subject = X500Name.getInstance(aSN1Sequence.getObjectAt(i3 + 5));
        int i10 = i3 + 6;
        this.subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(aSN1Sequence.getObjectAt(i10));
        int size = (aSN1Sequence.size() - i10) - 1;
        if (size != 0 && z2) {
            throw new IllegalArgumentException(StubApp.getString2(27846));
        }
        while (size > 0) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Sequence.getObjectAt(i10 + size);
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 1) {
                this.issuerUniqueId = DERBitString.getInstance(aSN1TaggedObject, false);
            } else if (tagNo == 2) {
                this.subjectUniqueId = DERBitString.getInstance(aSN1TaggedObject, false);
            } else {
                if (tagNo != 3) {
                    throw new IllegalArgumentException(a.l(aSN1TaggedObject, new StringBuilder(StubApp.getString2(27738))));
                }
                if (z10) {
                    throw new IllegalArgumentException(StubApp.getString2(27847));
                }
                this.extensions = Extensions.getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, true));
            }
            size--;
        }
    }

    public static TBSCertificate getInstance(Object obj) {
        if (obj instanceof TBSCertificate) {
            return (TBSCertificate) obj;
        }
        if (obj != null) {
            return new TBSCertificate(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Time getEndDate() {
        return this.endDate;
    }

    public Extensions getExtensions() {
        return this.extensions;
    }

    public X500Name getIssuer() {
        return this.issuer;
    }

    public ASN1BitString getIssuerUniqueId() {
        return this.issuerUniqueId;
    }

    public ASN1Integer getSerialNumber() {
        return this.serialNumber;
    }

    public AlgorithmIdentifier getSignature() {
        return this.signature;
    }

    public Time getStartDate() {
        return this.startDate;
    }

    public X500Name getSubject() {
        return this.subject;
    }

    public SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return this.subjectPublicKeyInfo;
    }

    public ASN1BitString getSubjectUniqueId() {
        return this.subjectUniqueId;
    }

    public ASN1Integer getVersion() {
        return this.version;
    }

    public int getVersionNumber() {
        return this.version.intValueExact() + 1;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        String string2 = StubApp.getString2(27849);
        if (Properties.getPropertyValue(string2) != null && !Properties.isOverrideSet(string2)) {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            if (!this.version.hasValue(0)) {
                aSN1EncodableVector.add(new DERTaggedObject(true, 0, (ASN1Encodable) this.version));
            }
            aSN1EncodableVector.add(this.serialNumber);
            aSN1EncodableVector.add(this.signature);
            aSN1EncodableVector.add(this.issuer);
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(2);
            aSN1EncodableVector2.add(this.startDate);
            aSN1EncodableVector2.add(this.endDate);
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
            ASN1Encodable aSN1Encodable = this.subject;
            if (aSN1Encodable == null) {
                aSN1Encodable = new DERSequence();
            }
            aSN1EncodableVector.add(aSN1Encodable);
            aSN1EncodableVector.add(this.subjectPublicKeyInfo);
            ASN1BitString aSN1BitString = this.issuerUniqueId;
            if (aSN1BitString != null) {
                aSN1EncodableVector.add(new DERTaggedObject(false, 1, (ASN1Encodable) aSN1BitString));
            }
            ASN1BitString aSN1BitString2 = this.subjectUniqueId;
            if (aSN1BitString2 != null) {
                aSN1EncodableVector.add(new DERTaggedObject(false, 2, (ASN1Encodable) aSN1BitString2));
            }
            Extensions extensions = this.extensions;
            if (extensions != null) {
                aSN1EncodableVector.add(new DERTaggedObject(true, 3, (ASN1Encodable) extensions));
            }
            return new DERSequence(aSN1EncodableVector);
        }
        return this.seq;
    }

    public static TBSCertificate getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z2));
    }
}
