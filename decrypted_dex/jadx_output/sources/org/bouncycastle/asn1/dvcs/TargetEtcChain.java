package org.bouncycastle.asn1.dvcs;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class TargetEtcChain extends ASN1Object {
    private ASN1Sequence chain;
    private PathProcInput pathProcInput;
    private CertEtcToken target;

    private TargetEtcChain(ASN1Sequence aSN1Sequence) {
        this.target = CertEtcToken.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            ASN1Encodable objectAt = aSN1Sequence.getObjectAt(1);
            if (objectAt instanceof ASN1TaggedObject) {
                extractPathProcInput(objectAt);
                return;
            }
            this.chain = ASN1Sequence.getInstance(objectAt);
            if (aSN1Sequence.size() > 2) {
                extractPathProcInput(aSN1Sequence.getObjectAt(2));
            }
        }
    }

    public static TargetEtcChain[] arrayFromSequence(ASN1Sequence aSN1Sequence) {
        int size = aSN1Sequence.size();
        TargetEtcChain[] targetEtcChainArr = new TargetEtcChain[size];
        for (int i3 = 0; i3 != size; i3++) {
            targetEtcChainArr[i3] = getInstance(aSN1Sequence.getObjectAt(i3));
        }
        return targetEtcChainArr;
    }

    private void extractPathProcInput(ASN1Encodable aSN1Encodable) {
        ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Encodable);
        if (aSN1TaggedObject.getTagNo() != 0) {
            throw new IllegalArgumentException(a.l(aSN1TaggedObject, new StringBuilder(StubApp.getString2(26939))));
        }
        this.pathProcInput = PathProcInput.getInstance(aSN1TaggedObject, false);
    }

    public static TargetEtcChain getInstance(Object obj) {
        if (obj instanceof TargetEtcChain) {
            return (TargetEtcChain) obj;
        }
        if (obj != null) {
            return new TargetEtcChain(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CertEtcToken[] getChain() {
        ASN1Sequence aSN1Sequence = this.chain;
        if (aSN1Sequence != null) {
            return CertEtcToken.arrayFromSequence(aSN1Sequence);
        }
        return null;
    }

    public PathProcInput getPathProcInput() {
        return this.pathProcInput;
    }

    public CertEtcToken getTarget() {
        return this.target;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.target);
        ASN1Sequence aSN1Sequence = this.chain;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        PathProcInput pathProcInput = this.pathProcInput;
        if (pathProcInput != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, (ASN1Encodable) pathProcInput));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(StubApp.getString2(27050));
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(27051));
        sb2.append(this.target);
        String string2 = StubApp.getString2(3692);
        sb2.append(string2);
        stringBuffer.append(sb2.toString());
        if (this.chain != null) {
            stringBuffer.append(StubApp.getString2(27052) + this.chain + string2);
        }
        if (this.pathProcInput != null) {
            stringBuffer.append(StubApp.getString2(27053) + this.pathProcInput + string2);
        }
        stringBuffer.append(StubApp.getString2(20170));
        return stringBuffer.toString();
    }

    public TargetEtcChain(CertEtcToken certEtcToken) {
        this(certEtcToken, null, null);
    }

    public static TargetEtcChain getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z2));
    }

    public TargetEtcChain(CertEtcToken certEtcToken, PathProcInput pathProcInput) {
        this(certEtcToken, null, pathProcInput);
    }

    public TargetEtcChain(CertEtcToken certEtcToken, CertEtcToken[] certEtcTokenArr) {
        this(certEtcToken, certEtcTokenArr, null);
    }

    public TargetEtcChain(CertEtcToken certEtcToken, CertEtcToken[] certEtcTokenArr, PathProcInput pathProcInput) {
        this.target = certEtcToken;
        if (certEtcTokenArr != null) {
            this.chain = new DERSequence(certEtcTokenArr);
        }
        this.pathProcInput = pathProcInput;
    }
}
