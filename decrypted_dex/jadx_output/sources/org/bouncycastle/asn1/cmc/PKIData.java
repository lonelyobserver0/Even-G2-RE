package org.bouncycastle.asn1.cmc;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKIData extends ASN1Object {
    private final TaggedContentInfo[] cmsSequence;
    private final TaggedAttribute[] controlSequence;
    private final OtherMsg[] otherMsgSequence;
    private final TaggedRequest[] reqSequence;

    private PKIData(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 4) {
            throw new IllegalArgumentException(StubApp.getString2(26875));
        }
        int i3 = 0;
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(0);
        this.controlSequence = new TaggedAttribute[aSN1Sequence2.size()];
        int i10 = 0;
        while (true) {
            TaggedAttribute[] taggedAttributeArr = this.controlSequence;
            if (i10 >= taggedAttributeArr.length) {
                break;
            }
            taggedAttributeArr[i10] = TaggedAttribute.getInstance(aSN1Sequence2.getObjectAt(i10));
            i10++;
        }
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
        this.reqSequence = new TaggedRequest[aSN1Sequence3.size()];
        int i11 = 0;
        while (true) {
            TaggedRequest[] taggedRequestArr = this.reqSequence;
            if (i11 >= taggedRequestArr.length) {
                break;
            }
            taggedRequestArr[i11] = TaggedRequest.getInstance(aSN1Sequence3.getObjectAt(i11));
            i11++;
        }
        ASN1Sequence aSN1Sequence4 = (ASN1Sequence) aSN1Sequence.getObjectAt(2);
        this.cmsSequence = new TaggedContentInfo[aSN1Sequence4.size()];
        int i12 = 0;
        while (true) {
            TaggedContentInfo[] taggedContentInfoArr = this.cmsSequence;
            if (i12 >= taggedContentInfoArr.length) {
                break;
            }
            taggedContentInfoArr[i12] = TaggedContentInfo.getInstance(aSN1Sequence4.getObjectAt(i12));
            i12++;
        }
        ASN1Sequence aSN1Sequence5 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        this.otherMsgSequence = new OtherMsg[aSN1Sequence5.size()];
        while (true) {
            OtherMsg[] otherMsgArr = this.otherMsgSequence;
            if (i3 >= otherMsgArr.length) {
                return;
            }
            otherMsgArr[i3] = OtherMsg.getInstance(aSN1Sequence5.getObjectAt(i3));
            i3++;
        }
    }

    private OtherMsg[] copy(OtherMsg[] otherMsgArr) {
        int length = otherMsgArr.length;
        OtherMsg[] otherMsgArr2 = new OtherMsg[length];
        System.arraycopy(otherMsgArr, 0, otherMsgArr2, 0, length);
        return otherMsgArr2;
    }

    public static PKIData getInstance(Object obj) {
        if (obj instanceof PKIData) {
            return (PKIData) obj;
        }
        if (obj != null) {
            return new PKIData(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public TaggedContentInfo[] getCmsSequence() {
        return copy(this.cmsSequence);
    }

    public TaggedAttribute[] getControlSequence() {
        return copy(this.controlSequence);
    }

    public OtherMsg[] getOtherMsgSequence() {
        return copy(this.otherMsgSequence);
    }

    public TaggedRequest[] getReqSequence() {
        return copy(this.reqSequence);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(new ASN1Encodable[]{new DERSequence(this.controlSequence), new DERSequence(this.reqSequence), new DERSequence(this.cmsSequence), new DERSequence(this.otherMsgSequence)});
    }

    public PKIData(TaggedAttribute[] taggedAttributeArr, TaggedRequest[] taggedRequestArr, TaggedContentInfo[] taggedContentInfoArr, OtherMsg[] otherMsgArr) {
        this.controlSequence = copy(taggedAttributeArr);
        this.reqSequence = copy(taggedRequestArr);
        this.cmsSequence = copy(taggedContentInfoArr);
        this.otherMsgSequence = copy(otherMsgArr);
    }

    private TaggedAttribute[] copy(TaggedAttribute[] taggedAttributeArr) {
        int length = taggedAttributeArr.length;
        TaggedAttribute[] taggedAttributeArr2 = new TaggedAttribute[length];
        System.arraycopy(taggedAttributeArr, 0, taggedAttributeArr2, 0, length);
        return taggedAttributeArr2;
    }

    private TaggedContentInfo[] copy(TaggedContentInfo[] taggedContentInfoArr) {
        int length = taggedContentInfoArr.length;
        TaggedContentInfo[] taggedContentInfoArr2 = new TaggedContentInfo[length];
        System.arraycopy(taggedContentInfoArr, 0, taggedContentInfoArr2, 0, length);
        return taggedContentInfoArr2;
    }

    private TaggedRequest[] copy(TaggedRequest[] taggedRequestArr) {
        int length = taggedRequestArr.length;
        TaggedRequest[] taggedRequestArr2 = new TaggedRequest[length];
        System.arraycopy(taggedRequestArr, 0, taggedRequestArr2, 0, length);
        return taggedRequestArr2;
    }
}
