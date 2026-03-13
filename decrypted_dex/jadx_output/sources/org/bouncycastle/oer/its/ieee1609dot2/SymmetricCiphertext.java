package org.bouncycastle.oer.its.ieee1609dot2;

import com.stub.StubApp;
import i2.u;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SymmetricCiphertext extends ASN1Object implements ASN1Choice {
    public static final int aes128ccm = 0;
    private final int choice;
    private final ASN1Encodable symmetricCiphertext;

    public SymmetricCiphertext(int i3, ASN1Encodable aSN1Encodable) {
        this.choice = i3;
        this.symmetricCiphertext = aSN1Encodable;
    }

    public static SymmetricCiphertext aes128ccm(AesCcmCiphertext aesCcmCiphertext) {
        return new SymmetricCiphertext(0, aesCcmCiphertext);
    }

    public static SymmetricCiphertext getInstance(Object obj) {
        if (obj instanceof SymmetricCiphertext) {
            return (SymmetricCiphertext) obj;
        }
        if (obj != null) {
            return new SymmetricCiphertext(ASN1TaggedObject.getInstance(obj));
        }
        return null;
    }

    public int getChoice() {
        return this.choice;
    }

    public ASN1Encodable getSymmetricCiphertext() {
        return this.symmetricCiphertext;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(this.choice, this.symmetricCiphertext);
    }

    private SymmetricCiphertext(ASN1TaggedObject aSN1TaggedObject) {
        int tagNo = aSN1TaggedObject.getTagNo();
        this.choice = tagNo;
        if (tagNo != 0) {
            throw new IllegalArgumentException(u.p(tagNo, StubApp.getString2(33172)));
        }
        this.symmetricCiphertext = AesCcmCiphertext.getInstance(aSN1TaggedObject.getObject());
    }
}
