package org.bouncycastle.asn1.bc;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.GeneralName;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ExternalValue extends ASN1Object {
    private final AlgorithmIdentifier hashAlg;
    private final ASN1BitString hashVal;
    private final GeneralName location;

    private ExternalValue(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException(StubApp.getString2(26861));
        }
        this.location = GeneralName.getInstance(aSN1Sequence.getObjectAt(0));
        this.hashAlg = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.hashVal = ASN1BitString.getInstance(aSN1Sequence.getObjectAt(2));
    }

    public static ExternalValue getInstance(Object obj) {
        if (obj instanceof ExternalValue) {
            return (ExternalValue) obj;
        }
        if (obj != null) {
            return new ExternalValue(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public AlgorithmIdentifier getHashAlg() {
        return this.hashAlg;
    }

    public ASN1BitString getHashVal() {
        return this.hashVal;
    }

    public GeneralName getLocation() {
        return this.location;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.location);
        aSN1EncodableVector.add(this.hashAlg);
        aSN1EncodableVector.add(this.hashVal);
        return new DERSequence(aSN1EncodableVector);
    }

    public ExternalValue(GeneralName generalName, AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.location = generalName;
        this.hashAlg = algorithmIdentifier;
        this.hashVal = new DERBitString(bArr);
    }
}
