package org.bouncycastle.asn1.crmf;

import Xa.h;
import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKIArchiveOptions extends ASN1Object implements ASN1Choice {
    public static final int archiveRemGenPrivKey = 2;
    public static final int encryptedPrivKey = 0;
    public static final int keyGenParameters = 1;
    private ASN1Encodable value;

    public PKIArchiveOptions(ASN1OctetString aSN1OctetString) {
        this.value = aSN1OctetString;
    }

    public static PKIArchiveOptions getInstance(Object obj) {
        if (obj == null || (obj instanceof PKIArchiveOptions)) {
            return (PKIArchiveOptions) obj;
        }
        if (obj instanceof ASN1TaggedObject) {
            return new PKIArchiveOptions((ASN1TaggedObject) obj);
        }
        throw new IllegalArgumentException(h.m(obj, StubApp.getString2(26942)));
    }

    public int getType() {
        ASN1Encodable aSN1Encodable = this.value;
        if (aSN1Encodable instanceof EncryptedKey) {
            return 0;
        }
        return aSN1Encodable instanceof ASN1OctetString ? 1 : 2;
    }

    public ASN1Encodable getValue() {
        return this.value;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1Encodable aSN1Encodable = this.value;
        return aSN1Encodable instanceof EncryptedKey ? new DERTaggedObject(true, 0, aSN1Encodable) : aSN1Encodable instanceof ASN1OctetString ? new DERTaggedObject(false, 1, aSN1Encodable) : new DERTaggedObject(false, 2, aSN1Encodable);
    }

    private PKIArchiveOptions(ASN1TaggedObject aSN1TaggedObject) {
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0) {
            this.value = EncryptedKey.getInstance(aSN1TaggedObject.getObject());
        } else if (tagNo == 1) {
            this.value = ASN1OctetString.getInstance(aSN1TaggedObject, false);
        } else {
            if (tagNo != 2) {
                throw new IllegalArgumentException(a.l(aSN1TaggedObject, new StringBuilder(StubApp.getString2(26896))));
            }
            this.value = ASN1Boolean.getInstance(aSN1TaggedObject, false);
        }
    }

    public PKIArchiveOptions(EncryptedKey encryptedKey) {
        this.value = encryptedKey;
    }

    public PKIArchiveOptions(boolean z2) {
        this.value = ASN1Boolean.getInstance(z2);
    }
}
