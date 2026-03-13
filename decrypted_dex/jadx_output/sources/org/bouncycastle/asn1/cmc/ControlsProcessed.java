package org.bouncycastle.asn1.cmc;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ControlsProcessed extends ASN1Object {
    private final ASN1Sequence bodyPartReferences;

    private ControlsProcessed(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 1) {
            throw new IllegalArgumentException(StubApp.getString2(26869));
        }
        this.bodyPartReferences = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(0));
    }

    public static ControlsProcessed getInstance(Object obj) {
        if (obj instanceof ControlsProcessed) {
            return (ControlsProcessed) obj;
        }
        if (obj != null) {
            return new ControlsProcessed(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BodyPartReference[] getBodyList() {
        BodyPartReference[] bodyPartReferenceArr = new BodyPartReference[this.bodyPartReferences.size()];
        for (int i3 = 0; i3 != this.bodyPartReferences.size(); i3++) {
            bodyPartReferenceArr[i3] = BodyPartReference.getInstance(this.bodyPartReferences.getObjectAt(i3));
        }
        return bodyPartReferenceArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.bodyPartReferences);
    }

    public ControlsProcessed(BodyPartReference bodyPartReference) {
        this.bodyPartReferences = new DERSequence(bodyPartReference);
    }

    public ControlsProcessed(BodyPartReference[] bodyPartReferenceArr) {
        this.bodyPartReferences = new DERSequence(bodyPartReferenceArr);
    }
}
