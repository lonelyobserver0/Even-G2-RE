package org.bouncycastle.asn1.cmc;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.Extension;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Utils {
    public static BodyPartID[] clone(BodyPartID[] bodyPartIDArr) {
        BodyPartID[] bodyPartIDArr2 = new BodyPartID[bodyPartIDArr.length];
        System.arraycopy(bodyPartIDArr, 0, bodyPartIDArr2, 0, bodyPartIDArr.length);
        return bodyPartIDArr2;
    }

    public static BodyPartID[] toBodyPartIDArray(ASN1Sequence aSN1Sequence) {
        BodyPartID[] bodyPartIDArr = new BodyPartID[aSN1Sequence.size()];
        for (int i3 = 0; i3 != aSN1Sequence.size(); i3++) {
            bodyPartIDArr[i3] = BodyPartID.getInstance(aSN1Sequence.getObjectAt(i3));
        }
        return bodyPartIDArr;
    }

    public static Extension[] clone(Extension[] extensionArr) {
        Extension[] extensionArr2 = new Extension[extensionArr.length];
        System.arraycopy(extensionArr, 0, extensionArr2, 0, extensionArr.length);
        return extensionArr2;
    }
}
