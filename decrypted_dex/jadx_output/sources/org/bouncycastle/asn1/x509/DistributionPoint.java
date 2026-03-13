package org.bouncycastle.asn1.x509;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.a;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DistributionPoint extends ASN1Object {
    GeneralNames cRLIssuer;
    DistributionPointName distributionPoint;
    ReasonFlags reasons;

    public DistributionPoint(ASN1Sequence aSN1Sequence) {
        for (int i3 = 0; i3 != aSN1Sequence.size(); i3++) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(i3));
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                this.distributionPoint = DistributionPointName.getInstance(aSN1TaggedObject, true);
            } else if (tagNo == 1) {
                this.reasons = new ReasonFlags(DERBitString.getInstance(aSN1TaggedObject, false));
            } else {
                if (tagNo != 2) {
                    throw new IllegalArgumentException(a.l(aSN1TaggedObject, new StringBuilder(StubApp.getString2(27738))));
                }
                this.cRLIssuer = GeneralNames.getInstance(aSN1TaggedObject, false);
            }
        }
    }

    private void appendObject(StringBuffer stringBuffer, String str, String str2, String str3) {
        String string2 = StubApp.getString2(6147);
        stringBuffer.append(string2);
        stringBuffer.append(str2);
        stringBuffer.append(StubApp.getString2(478));
        stringBuffer.append(str);
        stringBuffer.append(string2);
        stringBuffer.append(string2);
        stringBuffer.append(str3);
        stringBuffer.append(str);
    }

    public static DistributionPoint getInstance(Object obj) {
        if (obj == null || (obj instanceof DistributionPoint)) {
            return (DistributionPoint) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new DistributionPoint((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException(E1.a.h(obj, StubApp.getString2(27739)));
    }

    public GeneralNames getCRLIssuer() {
        return this.cRLIssuer;
    }

    public DistributionPointName getDistributionPoint() {
        return this.distributionPoint;
    }

    public ReasonFlags getReasons() {
        return this.reasons;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        DistributionPointName distributionPointName = this.distributionPoint;
        if (distributionPointName != null) {
            aSN1EncodableVector.add(new DERTaggedObject(0, distributionPointName));
        }
        ReasonFlags reasonFlags = this.reasons;
        if (reasonFlags != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, (ASN1Encodable) reasonFlags));
        }
        GeneralNames generalNames = this.cRLIssuer;
        if (generalNames != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 2, (ASN1Encodable) generalNames));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public String toString() {
        String lineSeparator = Strings.lineSeparator();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(StubApp.getString2(27740));
        stringBuffer.append(lineSeparator);
        DistributionPointName distributionPointName = this.distributionPoint;
        if (distributionPointName != null) {
            appendObject(stringBuffer, lineSeparator, StubApp.getString2(27741), distributionPointName.toString());
        }
        ReasonFlags reasonFlags = this.reasons;
        if (reasonFlags != null) {
            appendObject(stringBuffer, lineSeparator, StubApp.getString2(27742), reasonFlags.toString());
        }
        GeneralNames generalNames = this.cRLIssuer;
        if (generalNames != null) {
            appendObject(stringBuffer, lineSeparator, StubApp.getString2(27743), generalNames.toString());
        }
        stringBuffer.append(StubApp.getString2(511));
        stringBuffer.append(lineSeparator);
        return stringBuffer.toString();
    }

    public DistributionPoint(DistributionPointName distributionPointName, ReasonFlags reasonFlags, GeneralNames generalNames) {
        this.distributionPoint = distributionPointName;
        this.reasons = reasonFlags;
        this.cRLIssuer = generalNames;
    }

    public static DistributionPoint getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z2));
    }
}
