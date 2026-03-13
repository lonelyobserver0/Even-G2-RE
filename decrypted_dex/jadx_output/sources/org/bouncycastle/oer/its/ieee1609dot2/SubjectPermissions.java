package org.bouncycastle.oer.its.ieee1609dot2;

import com.stub.StubApp;
import i2.u;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.SequenceOfPsidSspRange;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SubjectPermissions extends ASN1Object implements ASN1Choice {
    public static final int all = 1;
    public static final int explicit = 0;
    private final int choice;
    private final ASN1Encodable subjectPermissions;

    public SubjectPermissions(int i3, ASN1Encodable aSN1Encodable) {
        this.subjectPermissions = aSN1Encodable;
        this.choice = i3;
    }

    public static SubjectPermissions all() {
        return new SubjectPermissions(1, DERNull.INSTANCE);
    }

    public static SubjectPermissions explicit(SequenceOfPsidSspRange sequenceOfPsidSspRange) {
        return new SubjectPermissions(0, sequenceOfPsidSspRange);
    }

    public static SubjectPermissions getInstance(Object obj) {
        if (obj instanceof SubjectPermissions) {
            return (SubjectPermissions) obj;
        }
        if (obj != null) {
            return new SubjectPermissions(ASN1TaggedObject.getInstance(obj));
        }
        return null;
    }

    public int getChoice() {
        return this.choice;
    }

    public ASN1Encodable getSubjectPermissions() {
        return this.subjectPermissions;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(this.choice, this.subjectPermissions);
    }

    private SubjectPermissions(ASN1TaggedObject aSN1TaggedObject) {
        int tagNo = aSN1TaggedObject.getTagNo();
        this.choice = tagNo;
        if (tagNo == 0) {
            this.subjectPermissions = SequenceOfPsidSspRange.getInstance(aSN1TaggedObject.getObject());
        } else {
            if (tagNo != 1) {
                throw new IllegalArgumentException(u.p(tagNo, StubApp.getString2(33172)));
            }
            this.subjectPermissions = ASN1Null.getInstance(aSN1TaggedObject.getObject());
        }
    }
}
