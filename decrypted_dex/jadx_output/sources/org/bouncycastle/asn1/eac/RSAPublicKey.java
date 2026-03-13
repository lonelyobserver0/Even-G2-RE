package org.bouncycastle.asn1.eac;

import com.stub.StubApp;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RSAPublicKey extends PublicKeyDataObject {
    private static int exponentValid = 2;
    private static int modulusValid = 1;
    private BigInteger exponent;
    private BigInteger modulus;
    private ASN1ObjectIdentifier usage;
    private int valid = 0;

    public RSAPublicKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, BigInteger bigInteger, BigInteger bigInteger2) {
        this.usage = aSN1ObjectIdentifier;
        this.modulus = bigInteger;
        this.exponent = bigInteger2;
    }

    private void setExponent(UnsignedInteger unsignedInteger) {
        int i3 = this.valid;
        int i10 = exponentValid;
        if ((i3 & i10) != 0) {
            throw new IllegalArgumentException(StubApp.getString2(27098));
        }
        this.valid = i3 | i10;
        this.exponent = unsignedInteger.getValue();
    }

    private void setModulus(UnsignedInteger unsignedInteger) {
        int i3 = this.valid;
        int i10 = modulusValid;
        if ((i3 & i10) != 0) {
            throw new IllegalArgumentException(StubApp.getString2(27099));
        }
        this.valid = i3 | i10;
        this.modulus = unsignedInteger.getValue();
    }

    public BigInteger getModulus() {
        return this.modulus;
    }

    public BigInteger getPublicExponent() {
        return this.exponent;
    }

    @Override // org.bouncycastle.asn1.eac.PublicKeyDataObject
    public ASN1ObjectIdentifier getUsage() {
        return this.usage;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.usage);
        aSN1EncodableVector.add(new UnsignedInteger(1, getModulus()));
        aSN1EncodableVector.add(new UnsignedInteger(2, getPublicExponent()));
        return new DERSequence(aSN1EncodableVector);
    }

    public RSAPublicKey(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.usage = ASN1ObjectIdentifier.getInstance(objects.nextElement());
        while (objects.hasMoreElements()) {
            UnsignedInteger unsignedInteger = UnsignedInteger.getInstance(objects.nextElement());
            int tagNo = unsignedInteger.getTagNo();
            if (tagNo == 1) {
                setModulus(unsignedInteger);
            } else {
                if (tagNo != 2) {
                    throw new IllegalArgumentException(StubApp.getString2(27095) + unsignedInteger.getTagNo() + StubApp.getString2(27096));
                }
                setExponent(unsignedInteger);
            }
        }
        if (this.valid != 3) {
            throw new IllegalArgumentException(StubApp.getString2(27097));
        }
    }
}
