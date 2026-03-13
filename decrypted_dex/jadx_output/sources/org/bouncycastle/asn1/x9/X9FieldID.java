package org.bouncycastle.asn1.x9;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class X9FieldID extends ASN1Object implements X9ObjectIdentifiers {
    private ASN1ObjectIdentifier id;
    private ASN1Primitive parameters;

    public X9FieldID(int i3, int i10) {
        this(i3, i10, 0, 0);
    }

    public static X9FieldID getInstance(Object obj) {
        if (obj instanceof X9FieldID) {
            return (X9FieldID) obj;
        }
        if (obj != null) {
            return new X9FieldID(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1ObjectIdentifier getIdentifier() {
        return this.id;
    }

    public ASN1Primitive getParameters() {
        return this.parameters;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.id);
        aSN1EncodableVector.add(this.parameters);
        return new DERSequence(aSN1EncodableVector);
    }

    public X9FieldID(int i3, int i10, int i11, int i12) {
        this.id = X9ObjectIdentifiers.characteristic_two_field;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(new ASN1Integer(i3));
        String string2 = StubApp.getString2(28003);
        if (i11 == 0) {
            if (i12 != 0) {
                throw new IllegalArgumentException(string2);
            }
            aSN1EncodableVector.add(X9ObjectIdentifiers.tpBasis);
            aSN1EncodableVector.add(new ASN1Integer(i10));
        } else {
            if (i11 <= i10 || i12 <= i11) {
                throw new IllegalArgumentException(string2);
            }
            aSN1EncodableVector.add(X9ObjectIdentifiers.ppBasis);
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(3);
            aSN1EncodableVector2.add(new ASN1Integer(i10));
            aSN1EncodableVector2.add(new ASN1Integer(i11));
            aSN1EncodableVector2.add(new ASN1Integer(i12));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        }
        this.parameters = new DERSequence(aSN1EncodableVector);
    }

    public X9FieldID(BigInteger bigInteger) {
        this.id = X9ObjectIdentifiers.prime_field;
        this.parameters = new ASN1Integer(bigInteger);
    }

    private X9FieldID(ASN1Sequence aSN1Sequence) {
        this.id = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.parameters = aSN1Sequence.getObjectAt(1).toASN1Primitive();
    }
}
