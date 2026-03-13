package org.bouncycastle.asn1.esf;

import com.stub.StubApp;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class OcspListID extends ASN1Object {
    private ASN1Sequence ocspResponses;

    private OcspListID(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 1) {
            throw new IllegalArgumentException(a.k(aSN1Sequence, new StringBuilder(StubApp.getString2(26912))));
        }
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(0);
        this.ocspResponses = aSN1Sequence2;
        Enumeration objects = aSN1Sequence2.getObjects();
        while (objects.hasMoreElements()) {
            OcspResponsesID.getInstance(objects.nextElement());
        }
    }

    public static OcspListID getInstance(Object obj) {
        if (obj instanceof OcspListID) {
            return (OcspListID) obj;
        }
        if (obj != null) {
            return new OcspListID(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public OcspResponsesID[] getOcspResponses() {
        int size = this.ocspResponses.size();
        OcspResponsesID[] ocspResponsesIDArr = new OcspResponsesID[size];
        for (int i3 = 0; i3 < size; i3++) {
            ocspResponsesIDArr[i3] = OcspResponsesID.getInstance(this.ocspResponses.getObjectAt(i3));
        }
        return ocspResponsesIDArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.ocspResponses);
    }

    public OcspListID(OcspResponsesID[] ocspResponsesIDArr) {
        this.ocspResponses = new DERSequence(ocspResponsesIDArr);
    }
}
