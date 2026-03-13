package org.bouncycastle.asn1.cmp;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.crmf.CertTemplate;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CertReqTemplateContent extends ASN1Object {
    private final CertTemplate certTemplate;
    private final ASN1Sequence keySpec;

    private CertReqTemplateContent(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 1 && aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(StubApp.getString2(26888));
        }
        this.certTemplate = CertTemplate.getInstance(aSN1Sequence.getObjectAt(0));
        this.keySpec = aSN1Sequence.size() > 1 ? ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1)) : null;
    }

    public static CertReqTemplateContent getInstance(Object obj) {
        if (obj instanceof CertReqTemplateContent) {
            return (CertReqTemplateContent) obj;
        }
        if (obj != null) {
            return new CertReqTemplateContent(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CertTemplate getCertTemplate() {
        return this.certTemplate;
    }

    public ASN1Sequence getKeySpec() {
        return this.keySpec;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.certTemplate);
        ASN1Sequence aSN1Sequence = this.keySpec;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public CertReqTemplateContent(CertTemplate certTemplate, ASN1Sequence aSN1Sequence) {
        this.certTemplate = certTemplate;
        this.keySpec = aSN1Sequence;
    }
}
