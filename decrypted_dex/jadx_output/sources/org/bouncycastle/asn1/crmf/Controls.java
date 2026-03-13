package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Controls extends ASN1Object {
    private ASN1Sequence content;

    private Controls(ASN1Sequence aSN1Sequence) {
        this.content = aSN1Sequence;
    }

    public static Controls getInstance(Object obj) {
        if (obj instanceof Controls) {
            return (Controls) obj;
        }
        if (obj != null) {
            return new Controls(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.content;
    }

    public AttributeTypeAndValue[] toAttributeTypeAndValueArray() {
        int size = this.content.size();
        AttributeTypeAndValue[] attributeTypeAndValueArr = new AttributeTypeAndValue[size];
        for (int i3 = 0; i3 != size; i3++) {
            attributeTypeAndValueArr[i3] = AttributeTypeAndValue.getInstance(this.content.getObjectAt(i3));
        }
        return attributeTypeAndValueArr;
    }

    public Controls(AttributeTypeAndValue attributeTypeAndValue) {
        this.content = new DERSequence(attributeTypeAndValue);
    }

    public Controls(AttributeTypeAndValue[] attributeTypeAndValueArr) {
        this.content = new DERSequence(attributeTypeAndValueArr);
    }
}
