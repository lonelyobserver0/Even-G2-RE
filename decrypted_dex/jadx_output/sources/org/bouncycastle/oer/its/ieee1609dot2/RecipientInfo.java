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
public class RecipientInfo extends ASN1Object implements ASN1Choice {
    public static final int certRecipInfo = 2;
    public static final int pskRecipInfo = 0;
    public static final int rekRecipInfo = 4;
    public static final int signedDataRecipInfo = 3;
    public static final int symmRecipInfo = 1;
    private final int choice;
    private final ASN1Encodable recipientInfo;

    public RecipientInfo(int i3, ASN1Encodable aSN1Encodable) {
        this.choice = i3;
        this.recipientInfo = aSN1Encodable;
    }

    public static RecipientInfo certRecipInfo(PKRecipientInfo pKRecipientInfo) {
        return new RecipientInfo(2, pKRecipientInfo);
    }

    public static RecipientInfo getInstance(Object obj) {
        if (obj instanceof RecipientInfo) {
            return (RecipientInfo) obj;
        }
        if (obj != null) {
            return new RecipientInfo(ASN1TaggedObject.getInstance(obj));
        }
        return null;
    }

    public static RecipientInfo pskRecipInfo(PreSharedKeyRecipientInfo preSharedKeyRecipientInfo) {
        return new RecipientInfo(0, preSharedKeyRecipientInfo);
    }

    public static RecipientInfo rekRecipInfo(PKRecipientInfo pKRecipientInfo) {
        return new RecipientInfo(4, pKRecipientInfo);
    }

    public static RecipientInfo signedDataRecipInfo(PKRecipientInfo pKRecipientInfo) {
        return new RecipientInfo(3, pKRecipientInfo);
    }

    public static RecipientInfo symmRecipInfo(SymmRecipientInfo symmRecipientInfo) {
        return new RecipientInfo(1, symmRecipientInfo);
    }

    public int getChoice() {
        return this.choice;
    }

    public ASN1Encodable getRecipientInfo() {
        return this.recipientInfo;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(this.choice, this.recipientInfo);
    }

    private RecipientInfo(ASN1TaggedObject aSN1TaggedObject) {
        ASN1Encodable preSharedKeyRecipientInfo;
        int tagNo = aSN1TaggedObject.getTagNo();
        this.choice = tagNo;
        if (tagNo == 0) {
            preSharedKeyRecipientInfo = PreSharedKeyRecipientInfo.getInstance((Object) aSN1TaggedObject.getObject());
        } else if (tagNo == 1) {
            preSharedKeyRecipientInfo = SymmRecipientInfo.getInstance(aSN1TaggedObject.getObject());
        } else {
            if (tagNo != 2 && tagNo != 3 && tagNo != 4) {
                throw new IllegalArgumentException(u.p(tagNo, StubApp.getString2(33172)));
            }
            preSharedKeyRecipientInfo = PKRecipientInfo.getInstance(aSN1TaggedObject.getObject());
        }
        this.recipientInfo = preSharedKeyRecipientInfo;
    }
}
