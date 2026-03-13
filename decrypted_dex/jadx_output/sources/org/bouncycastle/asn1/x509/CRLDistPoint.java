package org.bouncycastle.asn1.x509;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CRLDistPoint extends ASN1Object {
    ASN1Sequence seq;

    private CRLDistPoint(ASN1Sequence aSN1Sequence) {
        this.seq = aSN1Sequence;
    }

    public static CRLDistPoint fromExtensions(Extensions extensions) {
        return getInstance(Extensions.getExtensionParsedValue(extensions, Extension.cRLDistributionPoints));
    }

    public static CRLDistPoint getInstance(Object obj) {
        if (obj instanceof CRLDistPoint) {
            return (CRLDistPoint) obj;
        }
        if (obj != null) {
            return new CRLDistPoint(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public DistributionPoint[] getDistributionPoints() {
        DistributionPoint[] distributionPointArr = new DistributionPoint[this.seq.size()];
        for (int i3 = 0; i3 != this.seq.size(); i3++) {
            distributionPointArr[i3] = DistributionPoint.getInstance(this.seq.getObjectAt(i3));
        }
        return distributionPointArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.seq;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(StubApp.getString2(27718));
        String lineSeparator = Strings.lineSeparator();
        stringBuffer.append(lineSeparator);
        DistributionPoint[] distributionPoints = getDistributionPoints();
        for (int i3 = 0; i3 != distributionPoints.length; i3++) {
            stringBuffer.append(StubApp.getString2(6147));
            stringBuffer.append(distributionPoints[i3]);
            stringBuffer.append(lineSeparator);
        }
        return stringBuffer.toString();
    }

    public CRLDistPoint(DistributionPoint[] distributionPointArr) {
        this.seq = null;
        this.seq = new DERSequence(distributionPointArr);
    }

    public static CRLDistPoint getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z2));
    }
}
