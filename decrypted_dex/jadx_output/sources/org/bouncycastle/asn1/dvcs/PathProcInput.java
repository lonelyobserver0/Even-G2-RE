package org.bouncycastle.asn1.dvcs;

import com.stub.StubApp;
import java.util.Arrays;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.x509.PolicyInformation;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PathProcInput extends ASN1Object {
    private PolicyInformation[] acceptablePolicySet;
    private boolean explicitPolicyReqd;
    private boolean inhibitAnyPolicy;
    private boolean inhibitPolicyMapping;

    public PathProcInput(PolicyInformation[] policyInformationArr) {
        this.inhibitPolicyMapping = false;
        this.explicitPolicyReqd = false;
        this.inhibitAnyPolicy = false;
        this.acceptablePolicySet = copy(policyInformationArr);
    }

    private PolicyInformation[] copy(PolicyInformation[] policyInformationArr) {
        int length = policyInformationArr.length;
        PolicyInformation[] policyInformationArr2 = new PolicyInformation[length];
        System.arraycopy(policyInformationArr, 0, policyInformationArr2, 0, length);
        return policyInformationArr2;
    }

    private static PolicyInformation[] fromSequence(ASN1Sequence aSN1Sequence) {
        int size = aSN1Sequence.size();
        PolicyInformation[] policyInformationArr = new PolicyInformation[size];
        for (int i3 = 0; i3 != size; i3++) {
            policyInformationArr[i3] = PolicyInformation.getInstance(aSN1Sequence.getObjectAt(i3));
        }
        return policyInformationArr;
    }

    public static PathProcInput getInstance(Object obj) {
        if (obj instanceof PathProcInput) {
            return (PathProcInput) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        PathProcInput pathProcInput = new PathProcInput(fromSequence(ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(0))));
        for (int i3 = 1; i3 < aSN1Sequence.size(); i3++) {
            ASN1Encodable objectAt = aSN1Sequence.getObjectAt(i3);
            if (objectAt instanceof ASN1Boolean) {
                pathProcInput.setInhibitPolicyMapping(ASN1Boolean.getInstance(objectAt).isTrue());
            } else if (objectAt instanceof ASN1TaggedObject) {
                ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objectAt);
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    pathProcInput.setExplicitPolicyReqd(ASN1Boolean.getInstance(aSN1TaggedObject, false).isTrue());
                } else {
                    if (tagNo != 1) {
                        throw new IllegalArgumentException(a.l(aSN1TaggedObject, new StringBuilder(StubApp.getString2(26939))));
                    }
                    pathProcInput.setInhibitAnyPolicy(ASN1Boolean.getInstance(aSN1TaggedObject, false).isTrue());
                }
            } else {
                continue;
            }
        }
        return pathProcInput;
    }

    private void setExplicitPolicyReqd(boolean z2) {
        this.explicitPolicyReqd = z2;
    }

    private void setInhibitAnyPolicy(boolean z2) {
        this.inhibitAnyPolicy = z2;
    }

    private void setInhibitPolicyMapping(boolean z2) {
        this.inhibitPolicyMapping = z2;
    }

    public PolicyInformation[] getAcceptablePolicySet() {
        return copy(this.acceptablePolicySet);
    }

    public boolean isExplicitPolicyReqd() {
        return this.explicitPolicyReqd;
    }

    public boolean isInhibitAnyPolicy() {
        return this.inhibitAnyPolicy;
    }

    public boolean isInhibitPolicyMapping() {
        return this.inhibitPolicyMapping;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(this.acceptablePolicySet.length);
        int i3 = 0;
        while (true) {
            PolicyInformation[] policyInformationArr = this.acceptablePolicySet;
            if (i3 == policyInformationArr.length) {
                break;
            }
            aSN1EncodableVector2.add(policyInformationArr[i3]);
            i3++;
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        boolean z2 = this.inhibitPolicyMapping;
        if (z2) {
            aSN1EncodableVector.add(ASN1Boolean.getInstance(z2));
        }
        boolean z10 = this.explicitPolicyReqd;
        if (z10) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, (ASN1Encodable) ASN1Boolean.getInstance(z10)));
        }
        boolean z11 = this.inhibitAnyPolicy;
        if (z11) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, (ASN1Encodable) ASN1Boolean.getInstance(z11)));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public String toString() {
        return StubApp.getString2(27041) + Arrays.asList(this.acceptablePolicySet) + StubApp.getString2(27042) + this.inhibitPolicyMapping + StubApp.getString2(27043) + this.explicitPolicyReqd + StubApp.getString2(27044) + this.inhibitAnyPolicy + StubApp.getString2(27045);
    }

    public PathProcInput(PolicyInformation[] policyInformationArr, boolean z2, boolean z10, boolean z11) {
        this.inhibitPolicyMapping = false;
        this.explicitPolicyReqd = false;
        this.inhibitAnyPolicy = false;
        this.acceptablePolicySet = copy(policyInformationArr);
        this.inhibitPolicyMapping = z2;
        this.explicitPolicyReqd = z10;
        this.inhibitAnyPolicy = z11;
    }

    public static PathProcInput getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z2));
    }
}
