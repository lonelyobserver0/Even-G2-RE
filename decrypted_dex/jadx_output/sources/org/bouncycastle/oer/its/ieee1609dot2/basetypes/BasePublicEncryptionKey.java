package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BasePublicEncryptionKey extends ASN1Object implements ASN1Choice {
    public static final int eciesBrainpoolP256r1 = 1;
    public static final int eciesNistP256 = 0;
    private final ASN1Encodable basePublicEncryptionKey;
    private final int choice;

    public static class Builder {
        private int choice;
        private ASN1Encodable value;

        public BasePublicEncryptionKey createBasePublicEncryptionKey() {
            return new BasePublicEncryptionKey(this.choice, this.value);
        }

        public Builder setChoice(int i3) {
            this.choice = i3;
            return this;
        }

        public Builder setValue(EccCurvePoint eccCurvePoint) {
            this.value = eccCurvePoint;
            return this;
        }
    }

    public BasePublicEncryptionKey(int i3, ASN1Encodable aSN1Encodable) {
        this.choice = i3;
        this.basePublicEncryptionKey = aSN1Encodable;
    }

    public static BasePublicEncryptionKey eciesBrainpoolP256r1(EccP256CurvePoint eccP256CurvePoint) {
        return new BasePublicEncryptionKey(1, eccP256CurvePoint);
    }

    public static BasePublicEncryptionKey eciesNistP256(EccP256CurvePoint eccP256CurvePoint) {
        return new BasePublicEncryptionKey(0, eccP256CurvePoint);
    }

    public static BasePublicEncryptionKey getInstance(Object obj) {
        if (obj instanceof BasePublicEncryptionKey) {
            return (BasePublicEncryptionKey) obj;
        }
        if (obj != null) {
            return new BasePublicEncryptionKey(ASN1TaggedObject.getInstance(obj));
        }
        return null;
    }

    public ASN1Encodable getBasePublicEncryptionKey() {
        return this.basePublicEncryptionKey;
    }

    public int getChoice() {
        return this.choice;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(this.choice, this.basePublicEncryptionKey);
    }

    private BasePublicEncryptionKey(ASN1TaggedObject aSN1TaggedObject) {
        int tagNo = aSN1TaggedObject.getTagNo();
        this.choice = tagNo;
        if (tagNo != 0 && tagNo != 1) {
            throw new IllegalArgumentException(a.l(aSN1TaggedObject, new StringBuilder(StubApp.getString2(33172))));
        }
        this.basePublicEncryptionKey = EccP256CurvePoint.getInstance(aSN1TaggedObject.getObject());
    }
}
