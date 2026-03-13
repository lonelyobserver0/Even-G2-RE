package org.bouncycastle.asn1.x509;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CertificatePolicies extends ASN1Object {
    private final PolicyInformation[] policyInformation;

    private CertificatePolicies(ASN1Sequence aSN1Sequence) {
        this.policyInformation = new PolicyInformation[aSN1Sequence.size()];
        for (int i3 = 0; i3 != aSN1Sequence.size(); i3++) {
            this.policyInformation[i3] = PolicyInformation.getInstance(aSN1Sequence.getObjectAt(i3));
        }
    }

    private static PolicyInformation[] copy(PolicyInformation[] policyInformationArr) {
        PolicyInformation[] policyInformationArr2 = new PolicyInformation[policyInformationArr.length];
        System.arraycopy(policyInformationArr, 0, policyInformationArr2, 0, policyInformationArr.length);
        return policyInformationArr2;
    }

    public static CertificatePolicies fromExtensions(Extensions extensions) {
        return getInstance(Extensions.getExtensionParsedValue(extensions, Extension.certificatePolicies));
    }

    public static CertificatePolicies getInstance(Object obj) {
        if (obj instanceof CertificatePolicies) {
            return (CertificatePolicies) obj;
        }
        if (obj != null) {
            return new CertificatePolicies(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public PolicyInformation getPolicyInformation(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i3 = 0;
        while (true) {
            PolicyInformation[] policyInformationArr = this.policyInformation;
            if (i3 == policyInformationArr.length) {
                return null;
            }
            if (aSN1ObjectIdentifier.equals((ASN1Primitive) policyInformationArr[i3].getPolicyIdentifier())) {
                return this.policyInformation[i3];
            }
            i3++;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.policyInformation);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < this.policyInformation.length; i3++) {
            if (stringBuffer.length() != 0) {
                stringBuffer.append(StubApp.getString2(81));
            }
            stringBuffer.append(this.policyInformation[i3]);
        }
        return StubApp.getString2(27736) + ((Object) stringBuffer) + StubApp.getString2(511);
    }

    public CertificatePolicies(PolicyInformation policyInformation) {
        this.policyInformation = new PolicyInformation[]{policyInformation};
    }

    public static CertificatePolicies getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z2));
    }

    public PolicyInformation[] getPolicyInformation() {
        return copy(this.policyInformation);
    }

    public CertificatePolicies(PolicyInformation[] policyInformationArr) {
        this.policyInformation = copy(policyInformationArr);
    }
}
