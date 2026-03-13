package org.bouncycastle.asn1.cmp;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CertStatus extends ASN1Object {
    private final ASN1OctetString certHash;
    private final ASN1Integer certReqId;
    private AlgorithmIdentifier hashAlg;
    private PKIStatusInfo statusInfo;

    private CertStatus(ASN1Sequence aSN1Sequence) {
        this.certHash = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0));
        this.certReqId = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() > 2) {
            for (int i3 = 2; i3 < aSN1Sequence.size(); i3++) {
                ASN1Primitive aSN1Primitive = aSN1Sequence.getObjectAt(i3).toASN1Primitive();
                if (aSN1Primitive instanceof ASN1Sequence) {
                    this.statusInfo = PKIStatusInfo.getInstance(aSN1Primitive);
                }
                if (aSN1Primitive instanceof ASN1TaggedObject) {
                    ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Primitive;
                    if (aSN1TaggedObject.getTagNo() != 0) {
                        throw new IllegalArgumentException(a.l(aSN1TaggedObject, new StringBuilder(StubApp.getString2(26756))));
                    }
                    this.hashAlg = AlgorithmIdentifier.getInstance(aSN1TaggedObject, true);
                }
            }
        }
    }

    public static CertStatus getInstance(Object obj) {
        if (obj instanceof CertStatus) {
            return (CertStatus) obj;
        }
        if (obj != null) {
            return new CertStatus(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1OctetString getCertHash() {
        return this.certHash;
    }

    public ASN1Integer getCertReqId() {
        return this.certReqId;
    }

    public AlgorithmIdentifier getHashAlg() {
        return this.hashAlg;
    }

    public PKIStatusInfo getStatusInfo() {
        return this.statusInfo;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.certHash);
        aSN1EncodableVector.add(this.certReqId);
        PKIStatusInfo pKIStatusInfo = this.statusInfo;
        if (pKIStatusInfo != null) {
            aSN1EncodableVector.add(pKIStatusInfo);
        }
        AlgorithmIdentifier algorithmIdentifier = this.hashAlg;
        if (algorithmIdentifier != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, (ASN1Encodable) algorithmIdentifier));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public CertStatus(byte[] bArr, BigInteger bigInteger) {
        this.certHash = new DEROctetString(bArr);
        this.certReqId = new ASN1Integer(bigInteger);
    }

    public CertStatus(byte[] bArr, BigInteger bigInteger, PKIStatusInfo pKIStatusInfo) {
        this.certHash = new DEROctetString(bArr);
        this.certReqId = new ASN1Integer(bigInteger);
        this.statusInfo = pKIStatusInfo;
    }

    public CertStatus(byte[] bArr, BigInteger bigInteger, PKIStatusInfo pKIStatusInfo, AlgorithmIdentifier algorithmIdentifier) {
        this.certHash = new DEROctetString(bArr);
        this.certReqId = new ASN1Integer(bigInteger);
        this.statusInfo = pKIStatusInfo;
        this.hashAlg = algorithmIdentifier;
    }
}
