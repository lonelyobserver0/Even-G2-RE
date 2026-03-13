package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PublicVerificationKey extends ASN1Object implements ASN1Choice {
    public static final int ecdsaBrainpoolP256r1 = 1;
    public static final int ecdsaBrainpoolP384r1 = 2;
    public static final int ecdsaNistP256 = 0;
    private final int choice;
    private final ASN1Encodable publicVerificationKey;

    public static class Builder {
        private int choice;
        private ASN1Encodable curvePoint;

        public PublicVerificationKey createPublicVerificationKey() {
            return new PublicVerificationKey(this.choice, this.curvePoint);
        }

        public Builder ecdsaBrainpoolP256r1(EccP256CurvePoint eccP256CurvePoint) {
            this.curvePoint = eccP256CurvePoint;
            return this;
        }

        public Builder ecdsaBrainpoolP384r1(EccP384CurvePoint eccP384CurvePoint) {
            this.curvePoint = eccP384CurvePoint;
            return this;
        }

        public Builder ecdsaNistP256(EccP256CurvePoint eccP256CurvePoint) {
            this.curvePoint = eccP256CurvePoint;
            return this;
        }

        public Builder extension(byte[] bArr) {
            this.curvePoint = new DEROctetString(bArr);
            return this;
        }

        public Builder setChoice(int i3) {
            this.choice = i3;
            return this;
        }

        public Builder setCurvePoint(EccCurvePoint eccCurvePoint) {
            this.curvePoint = eccCurvePoint;
            return this;
        }
    }

    public PublicVerificationKey(int i3, ASN1Encodable aSN1Encodable) {
        this.choice = i3;
        this.publicVerificationKey = aSN1Encodable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublicVerificationKey ecdsaBrainpoolP256r1(EccP256CurvePoint eccP256CurvePoint) {
        return new PublicVerificationKey(1, eccP256CurvePoint);
    }

    public static PublicVerificationKey ecdsaBrainpoolP384r1(EccP384CurvePoint eccP384CurvePoint) {
        return new PublicVerificationKey(2, eccP384CurvePoint);
    }

    public static PublicVerificationKey ecdsaNistP256(EccP256CurvePoint eccP256CurvePoint) {
        return new PublicVerificationKey(0, eccP256CurvePoint);
    }

    public static PublicVerificationKey getInstance(Object obj) {
        if (obj instanceof PublicVerificationKey) {
            return (PublicVerificationKey) obj;
        }
        if (obj != null) {
            return new PublicVerificationKey(ASN1TaggedObject.getInstance(obj));
        }
        return null;
    }

    public int getChoice() {
        return this.choice;
    }

    public ASN1Encodable getPublicVerificationKey() {
        return this.publicVerificationKey;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(this.choice, this.publicVerificationKey);
    }

    private PublicVerificationKey(ASN1TaggedObject aSN1TaggedObject) {
        int tagNo = aSN1TaggedObject.getTagNo();
        this.choice = tagNo;
        if (tagNo == 0 || tagNo == 1) {
            this.publicVerificationKey = EccP256CurvePoint.getInstance(aSN1TaggedObject.getObject());
        } else {
            if (tagNo != 2) {
                throw new IllegalArgumentException(a.l(aSN1TaggedObject, new StringBuilder(StubApp.getString2(33172))));
            }
            this.publicVerificationKey = EccP384CurvePoint.getInstance(aSN1TaggedObject.getObject());
        }
    }
}
