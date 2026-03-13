package org.bouncycastle.asn1.x509;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class IssuingDistributionPoint extends ASN1Object {
    private DistributionPointName distributionPoint;
    private boolean indirectCRL;
    private boolean onlyContainsAttributeCerts;
    private boolean onlyContainsCACerts;
    private boolean onlyContainsUserCerts;
    private ReasonFlags onlySomeReasons;
    private ASN1Sequence seq;

    private IssuingDistributionPoint(ASN1Sequence aSN1Sequence) {
        this.seq = aSN1Sequence;
        for (int i3 = 0; i3 != aSN1Sequence.size(); i3++) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(i3));
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                this.distributionPoint = DistributionPointName.getInstance(aSN1TaggedObject, true);
            } else if (tagNo == 1) {
                this.onlyContainsUserCerts = ASN1Boolean.getInstance(aSN1TaggedObject, false).isTrue();
            } else if (tagNo == 2) {
                this.onlyContainsCACerts = ASN1Boolean.getInstance(aSN1TaggedObject, false).isTrue();
            } else if (tagNo == 3) {
                this.onlySomeReasons = new ReasonFlags(ASN1BitString.getInstance(aSN1TaggedObject, false));
            } else if (tagNo == 4) {
                this.indirectCRL = ASN1Boolean.getInstance(aSN1TaggedObject, false).isTrue();
            } else {
                if (tagNo != 5) {
                    throw new IllegalArgumentException(StubApp.getString2(27796));
                }
                this.onlyContainsAttributeCerts = ASN1Boolean.getInstance(aSN1TaggedObject, false).isTrue();
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

    private String booleanToString(boolean z2) {
        return z2 ? StubApp.getString2(6547) : StubApp.getString2(9372);
    }

    public static IssuingDistributionPoint getInstance(Object obj) {
        if (obj instanceof IssuingDistributionPoint) {
            return (IssuingDistributionPoint) obj;
        }
        if (obj != null) {
            return new IssuingDistributionPoint(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public DistributionPointName getDistributionPoint() {
        return this.distributionPoint;
    }

    public ReasonFlags getOnlySomeReasons() {
        return this.onlySomeReasons;
    }

    public boolean isIndirectCRL() {
        return this.indirectCRL;
    }

    public boolean onlyContainsAttributeCerts() {
        return this.onlyContainsAttributeCerts;
    }

    public boolean onlyContainsCACerts() {
        return this.onlyContainsCACerts;
    }

    public boolean onlyContainsUserCerts() {
        return this.onlyContainsUserCerts;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.seq;
    }

    public String toString() {
        String lineSeparator = Strings.lineSeparator();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(StubApp.getString2(27797));
        stringBuffer.append(lineSeparator);
        DistributionPointName distributionPointName = this.distributionPoint;
        if (distributionPointName != null) {
            appendObject(stringBuffer, lineSeparator, StubApp.getString2(27741), distributionPointName.toString());
        }
        boolean z2 = this.onlyContainsUserCerts;
        if (z2) {
            appendObject(stringBuffer, lineSeparator, StubApp.getString2(27798), booleanToString(z2));
        }
        boolean z10 = this.onlyContainsCACerts;
        if (z10) {
            appendObject(stringBuffer, lineSeparator, StubApp.getString2(27799), booleanToString(z10));
        }
        ReasonFlags reasonFlags = this.onlySomeReasons;
        if (reasonFlags != null) {
            appendObject(stringBuffer, lineSeparator, StubApp.getString2(27800), reasonFlags.toString());
        }
        boolean z11 = this.onlyContainsAttributeCerts;
        if (z11) {
            appendObject(stringBuffer, lineSeparator, StubApp.getString2(27801), booleanToString(z11));
        }
        boolean z12 = this.indirectCRL;
        if (z12) {
            appendObject(stringBuffer, lineSeparator, StubApp.getString2(27802), booleanToString(z12));
        }
        stringBuffer.append(StubApp.getString2(511));
        stringBuffer.append(lineSeparator);
        return stringBuffer.toString();
    }

    public IssuingDistributionPoint(DistributionPointName distributionPointName, boolean z2, boolean z10) {
        this(distributionPointName, false, false, null, z2, z10);
    }

    public static IssuingDistributionPoint getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z2));
    }

    public IssuingDistributionPoint(DistributionPointName distributionPointName, boolean z2, boolean z10, ReasonFlags reasonFlags, boolean z11, boolean z12) {
        this.distributionPoint = distributionPointName;
        this.indirectCRL = z11;
        this.onlyContainsAttributeCerts = z12;
        this.onlyContainsCACerts = z10;
        this.onlyContainsUserCerts = z2;
        this.onlySomeReasons = reasonFlags;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        if (distributionPointName != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, (ASN1Encodable) distributionPointName));
        }
        if (z2) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, (ASN1Encodable) ASN1Boolean.getInstance(true)));
        }
        if (z10) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 2, (ASN1Encodable) ASN1Boolean.getInstance(true)));
        }
        if (reasonFlags != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 3, (ASN1Encodable) reasonFlags));
        }
        if (z11) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 4, (ASN1Encodable) ASN1Boolean.getInstance(true)));
        }
        if (z12) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 5, (ASN1Encodable) ASN1Boolean.getInstance(true)));
        }
        this.seq = new DERSequence(aSN1EncodableVector);
    }
}
