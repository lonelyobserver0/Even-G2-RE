package org.bouncycastle.oer.its.ieee1609dot2;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.OEROptional;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.GroupLinkageValue;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.IValue;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.LinkageValue;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class LinkageData extends ASN1Object {
    private final GroupLinkageValue groupLinkageValue;
    private final IValue iCert;
    private final LinkageValue linkageValue;

    public static class Builder {
        private GroupLinkageValue groupLinkageValue;
        private IValue iCert;
        private LinkageValue linkageValue;

        public LinkageData createLinkageData() {
            return new LinkageData(this.iCert, this.linkageValue, this.groupLinkageValue);
        }

        public Builder setGroupLinkageValue(GroupLinkageValue groupLinkageValue) {
            this.groupLinkageValue = groupLinkageValue;
            return this;
        }

        public Builder setICert(IValue iValue) {
            this.iCert = iValue;
            return this;
        }

        public Builder setLinkageValue(LinkageValue linkageValue) {
            this.linkageValue = linkageValue;
            return this;
        }
    }

    private LinkageData(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException(StubApp.getString2(33170));
        }
        this.iCert = IValue.getInstance(aSN1Sequence.getObjectAt(0));
        this.linkageValue = LinkageValue.getInstance((Object) aSN1Sequence.getObjectAt(1));
        this.groupLinkageValue = (GroupLinkageValue) OEROptional.getValue(GroupLinkageValue.class, aSN1Sequence.getObjectAt(2));
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LinkageData getInstance(Object obj) {
        if (obj instanceof LinkageData) {
            return (LinkageData) obj;
        }
        if (obj != null) {
            return new LinkageData(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GroupLinkageValue getGroupLinkageValue() {
        return this.groupLinkageValue;
    }

    public IValue getICert() {
        return this.iCert;
    }

    public LinkageValue getLinkageValue() {
        return this.linkageValue;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(new ASN1Encodable[]{this.iCert, this.linkageValue, OEROptional.getInstance(this.groupLinkageValue)});
    }

    public LinkageData(IValue iValue, LinkageValue linkageValue, GroupLinkageValue groupLinkageValue) {
        this.iCert = iValue;
        this.linkageValue = linkageValue;
        this.groupLinkageValue = groupLinkageValue;
    }
}
