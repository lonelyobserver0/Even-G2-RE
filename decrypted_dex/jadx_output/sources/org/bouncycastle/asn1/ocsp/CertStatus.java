package org.bouncycastle.asn1.ocsp;

import E1.a;
import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1Util;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERTaggedObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CertStatus extends ASN1Object implements ASN1Choice {
    private int tagNo;
    private ASN1Encodable value;

    public CertStatus() {
        this.tagNo = 0;
        this.value = DERNull.INSTANCE;
    }

    public static CertStatus getInstance(Object obj) {
        if (obj == null || (obj instanceof CertStatus)) {
            return (CertStatus) obj;
        }
        if (obj instanceof ASN1TaggedObject) {
            return new CertStatus((ASN1TaggedObject) obj);
        }
        throw new IllegalArgumentException(a.h(obj, StubApp.getString2(26925)));
    }

    public ASN1Encodable getStatus() {
        return this.value;
    }

    public int getTagNo() {
        return this.tagNo;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(false, this.tagNo, this.value);
    }

    public CertStatus(int i3, ASN1Encodable aSN1Encodable) {
        this.tagNo = i3;
        this.value = aSN1Encodable;
    }

    private CertStatus(ASN1TaggedObject aSN1TaggedObject) {
        ASN1Encodable aSN1Null;
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo != 0) {
            if (tagNo == 1) {
                aSN1Null = RevokedInfo.getInstance(aSN1TaggedObject, false);
                this.value = aSN1Null;
                this.tagNo = tagNo;
            } else if (tagNo != 2) {
                throw new IllegalArgumentException(StubApp.getString2(26939) + ASN1Util.getTagText(aSN1TaggedObject));
            }
        }
        aSN1Null = ASN1Null.getInstance(aSN1TaggedObject, false);
        this.value = aSN1Null;
        this.tagNo = tagNo;
    }

    public CertStatus(RevokedInfo revokedInfo) {
        this.tagNo = 1;
        this.value = revokedInfo;
    }

    public static CertStatus getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(aSN1TaggedObject.getObject());
    }
}
