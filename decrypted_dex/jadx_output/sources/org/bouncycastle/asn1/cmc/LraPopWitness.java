package org.bouncycastle.asn1.cmc;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class LraPopWitness extends ASN1Object {
    private final ASN1Sequence bodyIds;
    private final BodyPartID pkiDataBodyid;

    private LraPopWitness(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(StubApp.getString2(26869));
        }
        this.pkiDataBodyid = BodyPartID.getInstance(aSN1Sequence.getObjectAt(0));
        this.bodyIds = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static LraPopWitness getInstance(Object obj) {
        if (obj instanceof LraPopWitness) {
            return (LraPopWitness) obj;
        }
        if (obj != null) {
            return new LraPopWitness(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BodyPartID[] getBodyIds() {
        BodyPartID[] bodyPartIDArr = new BodyPartID[this.bodyIds.size()];
        for (int i3 = 0; i3 != this.bodyIds.size(); i3++) {
            bodyPartIDArr[i3] = BodyPartID.getInstance(this.bodyIds.getObjectAt(i3));
        }
        return bodyPartIDArr;
    }

    public BodyPartID getPkiDataBodyid() {
        return this.pkiDataBodyid;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.pkiDataBodyid);
        aSN1EncodableVector.add(this.bodyIds);
        return new DERSequence(aSN1EncodableVector);
    }

    public LraPopWitness(BodyPartID bodyPartID, ASN1Sequence aSN1Sequence) {
        this.pkiDataBodyid = bodyPartID;
        this.bodyIds = aSN1Sequence;
    }
}
