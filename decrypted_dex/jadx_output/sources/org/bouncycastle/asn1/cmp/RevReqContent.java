package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RevReqContent extends ASN1Object {
    private final ASN1Sequence content;

    private RevReqContent(ASN1Sequence aSN1Sequence) {
        this.content = aSN1Sequence;
    }

    public static RevReqContent getInstance(Object obj) {
        if (obj instanceof RevReqContent) {
            return (RevReqContent) obj;
        }
        if (obj != null) {
            return new RevReqContent(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.content;
    }

    public RevDetails[] toRevDetailsArray() {
        int size = this.content.size();
        RevDetails[] revDetailsArr = new RevDetails[size];
        for (int i3 = 0; i3 != size; i3++) {
            revDetailsArr[i3] = RevDetails.getInstance(this.content.getObjectAt(i3));
        }
        return revDetailsArr;
    }

    public RevReqContent(RevDetails revDetails) {
        this.content = new DERSequence(revDetails);
    }

    public RevReqContent(RevDetails[] revDetailsArr) {
        this.content = new DERSequence(revDetailsArr);
    }
}
