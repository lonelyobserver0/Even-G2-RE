package org.bouncycastle.asn1.icao;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.x509.Certificate;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CscaMasterList extends ASN1Object {
    private Certificate[] certList;
    private ASN1Integer version;

    private CscaMasterList(ASN1Sequence aSN1Sequence) {
        this.version = new ASN1Integer(0L);
        if (aSN1Sequence == null || aSN1Sequence.size() == 0) {
            throw new IllegalArgumentException(StubApp.getString2(27117));
        }
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(a.k(aSN1Sequence, new StringBuilder(StubApp.getString2(27116))));
        }
        int i3 = 0;
        this.version = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        ASN1Set aSN1Set = ASN1Set.getInstance(aSN1Sequence.getObjectAt(1));
        this.certList = new Certificate[aSN1Set.size()];
        while (true) {
            Certificate[] certificateArr = this.certList;
            if (i3 >= certificateArr.length) {
                return;
            }
            certificateArr[i3] = Certificate.getInstance(aSN1Set.getObjectAt(i3));
            i3++;
        }
    }

    private Certificate[] copyCertList(Certificate[] certificateArr) {
        int length = certificateArr.length;
        Certificate[] certificateArr2 = new Certificate[length];
        for (int i3 = 0; i3 != length; i3++) {
            certificateArr2[i3] = certificateArr[i3];
        }
        return certificateArr2;
    }

    public static CscaMasterList getInstance(Object obj) {
        if (obj instanceof CscaMasterList) {
            return (CscaMasterList) obj;
        }
        if (obj != null) {
            return new CscaMasterList(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Certificate[] getCertStructs() {
        return copyCertList(this.certList);
    }

    public int getVersion() {
        return this.version.intValueExact();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.version);
        aSN1EncodableVector.add(new DERSet(this.certList));
        return new DERSequence(aSN1EncodableVector);
    }

    public CscaMasterList(Certificate[] certificateArr) {
        this.version = new ASN1Integer(0L);
        this.certList = copyCertList(certificateArr);
    }
}
