package org.bouncycastle.asn1.esf;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class OcspResponsesID extends ASN1Object {
    private OcspIdentifier ocspIdentifier;
    private OtherHash ocspRepHash;

    private OcspResponsesID(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 1 || aSN1Sequence.size() > 2) {
            throw new IllegalArgumentException(a.k(aSN1Sequence, new StringBuilder(StubApp.getString2(26912))));
        }
        this.ocspIdentifier = OcspIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            this.ocspRepHash = OtherHash.getInstance(aSN1Sequence.getObjectAt(1));
        }
    }

    public static OcspResponsesID getInstance(Object obj) {
        if (obj instanceof OcspResponsesID) {
            return (OcspResponsesID) obj;
        }
        if (obj != null) {
            return new OcspResponsesID(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public OcspIdentifier getOcspIdentifier() {
        return this.ocspIdentifier;
    }

    public OtherHash getOcspRepHash() {
        return this.ocspRepHash;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.ocspIdentifier);
        OtherHash otherHash = this.ocspRepHash;
        if (otherHash != null) {
            aSN1EncodableVector.add(otherHash);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public OcspResponsesID(OcspIdentifier ocspIdentifier) {
        this(ocspIdentifier, null);
    }

    public OcspResponsesID(OcspIdentifier ocspIdentifier, OtherHash otherHash) {
        this.ocspIdentifier = ocspIdentifier;
        this.ocspRepHash = otherHash;
    }
}
