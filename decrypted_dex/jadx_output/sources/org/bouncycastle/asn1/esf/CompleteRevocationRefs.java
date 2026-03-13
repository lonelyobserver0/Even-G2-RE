package org.bouncycastle.asn1.esf;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CompleteRevocationRefs extends ASN1Object {
    private ASN1Sequence crlOcspRefs;

    private CompleteRevocationRefs(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            CrlOcspRef.getInstance(objects.nextElement());
        }
        this.crlOcspRefs = aSN1Sequence;
    }

    public static CompleteRevocationRefs getInstance(Object obj) {
        if (obj instanceof CompleteRevocationRefs) {
            return (CompleteRevocationRefs) obj;
        }
        if (obj != null) {
            return new CompleteRevocationRefs(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CrlOcspRef[] getCrlOcspRefs() {
        int size = this.crlOcspRefs.size();
        CrlOcspRef[] crlOcspRefArr = new CrlOcspRef[size];
        for (int i3 = 0; i3 < size; i3++) {
            crlOcspRefArr[i3] = CrlOcspRef.getInstance(this.crlOcspRefs.getObjectAt(i3));
        }
        return crlOcspRefArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.crlOcspRefs;
    }

    public CompleteRevocationRefs(CrlOcspRef[] crlOcspRefArr) {
        this.crlOcspRefs = new DERSequence(crlOcspRefArr);
    }
}
