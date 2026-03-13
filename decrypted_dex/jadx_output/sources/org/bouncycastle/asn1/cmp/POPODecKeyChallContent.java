package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class POPODecKeyChallContent extends ASN1Object {
    private final ASN1Sequence content;

    private POPODecKeyChallContent(ASN1Sequence aSN1Sequence) {
        this.content = aSN1Sequence;
    }

    public static POPODecKeyChallContent getInstance(Object obj) {
        if (obj instanceof POPODecKeyChallContent) {
            return (POPODecKeyChallContent) obj;
        }
        if (obj != null) {
            return new POPODecKeyChallContent(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.content;
    }

    public Challenge[] toChallengeArray() {
        int size = this.content.size();
        Challenge[] challengeArr = new Challenge[size];
        for (int i3 = 0; i3 != size; i3++) {
            challengeArr[i3] = Challenge.getInstance(this.content.getObjectAt(i3));
        }
        return challengeArr;
    }
}
