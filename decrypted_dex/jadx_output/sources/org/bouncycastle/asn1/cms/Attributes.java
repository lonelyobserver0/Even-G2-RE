package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DLSet;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Attributes extends ASN1Object {
    private ASN1Set attributes;

    public Attributes(ASN1EncodableVector aSN1EncodableVector) {
        this.attributes = new DLSet(aSN1EncodableVector);
    }

    public static Attributes getInstance(Object obj) {
        if (obj instanceof Attributes) {
            return (Attributes) obj;
        }
        if (obj != null) {
            return new Attributes(ASN1Set.getInstance(obj));
        }
        return null;
    }

    public Attribute[] getAttributes() {
        int size = this.attributes.size();
        Attribute[] attributeArr = new Attribute[size];
        for (int i3 = 0; i3 != size; i3++) {
            attributeArr[i3] = Attribute.getInstance(this.attributes.getObjectAt(i3));
        }
        return attributeArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.attributes;
    }

    private Attributes(ASN1Set aSN1Set) {
        this.attributes = aSN1Set;
    }

    public static Attributes getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Set.getInstance(aSN1TaggedObject, z2));
    }
}
