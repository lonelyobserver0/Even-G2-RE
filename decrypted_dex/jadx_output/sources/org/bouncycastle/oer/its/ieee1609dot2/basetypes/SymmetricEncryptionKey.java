package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import com.stub.StubApp;
import i2.u;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SymmetricEncryptionKey extends ASN1Object implements ASN1Choice {
    public static final int aes128ccm = 0;
    private final int choice;
    private final ASN1Encodable symmetricEncryptionKey;

    public SymmetricEncryptionKey(int i3, ASN1Encodable aSN1Encodable) {
        this.choice = i3;
        this.symmetricEncryptionKey = aSN1Encodable;
    }

    public static SymmetricEncryptionKey aes128ccm(ASN1OctetString aSN1OctetString) {
        return new SymmetricEncryptionKey(0, aSN1OctetString);
    }

    public static SymmetricEncryptionKey getInstance(Object obj) {
        if (obj instanceof SymmetricEncryptionKey) {
            return (SymmetricEncryptionKey) obj;
        }
        if (obj != null) {
            return new SymmetricEncryptionKey(ASN1TaggedObject.getInstance(obj));
        }
        return null;
    }

    public int getChoice() {
        return this.choice;
    }

    public ASN1Encodable getSymmetricEncryptionKey() {
        return this.symmetricEncryptionKey;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(this.choice, this.symmetricEncryptionKey);
    }

    private SymmetricEncryptionKey(ASN1TaggedObject aSN1TaggedObject) {
        int tagNo = aSN1TaggedObject.getTagNo();
        this.choice = tagNo;
        if (tagNo != 0) {
            throw new IllegalArgumentException(u.p(tagNo, StubApp.getString2(33172)));
        }
        ASN1OctetString aSN1OctetString = ASN1OctetString.getInstance(aSN1TaggedObject.getObject());
        if (aSN1OctetString.getOctets().length != 16) {
            throw new IllegalArgumentException(StubApp.getString2(33225));
        }
        this.symmetricEncryptionKey = aSN1OctetString;
    }

    public static SymmetricEncryptionKey aes128ccm(byte[] bArr) {
        return new SymmetricEncryptionKey(0, new DEROctetString(bArr));
    }
}
