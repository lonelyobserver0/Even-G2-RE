package org.bouncycastle.asn1.crmf;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class POPOSigningKey extends ASN1Object {
    private AlgorithmIdentifier algorithmIdentifier;
    private POPOSigningKeyInput poposkInput;
    private ASN1BitString signature;

    private POPOSigningKey(ASN1Sequence aSN1Sequence) {
        int i3 = 0;
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Sequence.getObjectAt(0);
            if (aSN1TaggedObject.getTagNo() != 0) {
                throw new IllegalArgumentException(a.l(aSN1TaggedObject, new StringBuilder(StubApp.getString2(26944))));
            }
            this.poposkInput = POPOSigningKeyInput.getInstance(aSN1TaggedObject.getObject());
            i3 = 1;
        }
        this.algorithmIdentifier = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i3));
        this.signature = ASN1BitString.getInstance(aSN1Sequence.getObjectAt(i3 + 1));
    }

    public static POPOSigningKey getInstance(Object obj) {
        if (obj instanceof POPOSigningKey) {
            return (POPOSigningKey) obj;
        }
        if (obj != null) {
            return new POPOSigningKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.algorithmIdentifier;
    }

    public POPOSigningKeyInput getPoposkInput() {
        return this.poposkInput;
    }

    public ASN1BitString getSignature() {
        return this.signature;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        POPOSigningKeyInput pOPOSigningKeyInput = this.poposkInput;
        if (pOPOSigningKeyInput != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, (ASN1Encodable) pOPOSigningKeyInput));
        }
        aSN1EncodableVector.add(this.algorithmIdentifier);
        aSN1EncodableVector.add(this.signature);
        return new DERSequence(aSN1EncodableVector);
    }

    public static POPOSigningKey getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z2));
    }

    public POPOSigningKey(POPOSigningKeyInput pOPOSigningKeyInput, AlgorithmIdentifier algorithmIdentifier, ASN1BitString aSN1BitString) {
        this.poposkInput = pOPOSigningKeyInput;
        this.algorithmIdentifier = algorithmIdentifier;
        this.signature = aSN1BitString;
    }
}
