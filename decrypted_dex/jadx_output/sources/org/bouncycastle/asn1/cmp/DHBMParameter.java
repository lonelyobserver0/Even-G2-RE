package org.bouncycastle.asn1.cmp;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DHBMParameter extends ASN1Object {
    private final AlgorithmIdentifier mac;
    private final AlgorithmIdentifier owf;

    private DHBMParameter(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(StubApp.getString2(26893));
        }
        this.owf = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.mac = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static DHBMParameter getInstance(Object obj) {
        if (obj instanceof DHBMParameter) {
            return (DHBMParameter) obj;
        }
        if (obj != null) {
            return new DHBMParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public AlgorithmIdentifier getMac() {
        return this.mac;
    }

    public AlgorithmIdentifier getOwf() {
        return this.owf;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(new ASN1Encodable[]{this.owf, this.mac});
    }

    public DHBMParameter(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2) {
        this.owf = algorithmIdentifier;
        this.mac = algorithmIdentifier2;
    }
}
