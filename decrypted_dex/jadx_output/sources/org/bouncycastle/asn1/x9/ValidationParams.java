package org.bouncycastle.asn1.x9;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ValidationParams extends ASN1Object {
    private ASN1Integer pgenCounter;
    private ASN1BitString seed;

    private ValidationParams(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(a.k(aSN1Sequence, new StringBuilder(StubApp.getString2(26912))));
        }
        this.seed = ASN1BitString.getInstance(aSN1Sequence.getObjectAt(0));
        this.pgenCounter = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static ValidationParams getInstance(Object obj) {
        if (obj instanceof ValidationParams) {
            return (ValidationParams) obj;
        }
        if (obj != null) {
            return new ValidationParams(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getPgenCounter() {
        return this.pgenCounter.getPositiveValue();
    }

    public byte[] getSeed() {
        return this.seed.getBytes();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.seed);
        aSN1EncodableVector.add(this.pgenCounter);
        return new DERSequence(aSN1EncodableVector);
    }

    public static ValidationParams getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z2));
    }

    public ValidationParams(DERBitString dERBitString, ASN1Integer aSN1Integer) {
        if (dERBitString == null) {
            throw new IllegalArgumentException(StubApp.getString2(27873));
        }
        if (aSN1Integer == null) {
            throw new IllegalArgumentException(StubApp.getString2(27872));
        }
        this.seed = dERBitString;
        this.pgenCounter = aSN1Integer;
    }

    public ValidationParams(byte[] bArr, int i3) {
        if (bArr == null) {
            throw new IllegalArgumentException(StubApp.getString2(27873));
        }
        this.seed = new DERBitString(bArr);
        this.pgenCounter = new ASN1Integer(i3);
    }
}
