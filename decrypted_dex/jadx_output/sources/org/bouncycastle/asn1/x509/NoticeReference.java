package org.bouncycastle.asn1.x509;

import com.stub.StubApp;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class NoticeReference extends ASN1Object {
    private ASN1Sequence noticeNumbers;
    private DisplayText organization;

    public NoticeReference(String str, Vector vector) {
        this(str, convertVector(vector));
    }

    private static ASN1EncodableVector convertVector(Vector vector) {
        ASN1Integer aSN1Integer;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(vector.size());
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            Object nextElement = elements.nextElement();
            if (nextElement instanceof BigInteger) {
                aSN1Integer = new ASN1Integer((BigInteger) nextElement);
            } else {
                if (!(nextElement instanceof Integer)) {
                    throw new IllegalArgumentException();
                }
                aSN1Integer = new ASN1Integer(((Integer) nextElement).intValue());
            }
            aSN1EncodableVector.add(aSN1Integer);
        }
        return aSN1EncodableVector;
    }

    public static NoticeReference getInstance(Object obj) {
        if (obj instanceof NoticeReference) {
            return (NoticeReference) obj;
        }
        if (obj != null) {
            return new NoticeReference(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1Integer[] getNoticeNumbers() {
        ASN1Integer[] aSN1IntegerArr = new ASN1Integer[this.noticeNumbers.size()];
        for (int i3 = 0; i3 != this.noticeNumbers.size(); i3++) {
            aSN1IntegerArr[i3] = ASN1Integer.getInstance(this.noticeNumbers.getObjectAt(i3));
        }
        return aSN1IntegerArr;
    }

    public DisplayText getOrganization() {
        return this.organization;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.organization);
        aSN1EncodableVector.add(this.noticeNumbers);
        return new DERSequence(aSN1EncodableVector);
    }

    public NoticeReference(String str, ASN1EncodableVector aSN1EncodableVector) {
        this(new DisplayText(str), aSN1EncodableVector);
    }

    private NoticeReference(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(a.k(aSN1Sequence, new StringBuilder(StubApp.getString2(26912))));
        }
        this.organization = DisplayText.getInstance(aSN1Sequence.getObjectAt(0));
        this.noticeNumbers = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public NoticeReference(DisplayText displayText, ASN1EncodableVector aSN1EncodableVector) {
        this.organization = displayText;
        this.noticeNumbers = new DERSequence(aSN1EncodableVector);
    }
}
