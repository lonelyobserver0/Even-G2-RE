package org.bouncycastle.asn1.cmc;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.crmf.PKIPublicationInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMCPublicationInfo extends ASN1Object {
    private final ASN1Sequence certHashes;
    private final AlgorithmIdentifier hashAlg;
    private final PKIPublicationInfo pubInfo;

    private CMCPublicationInfo(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException(StubApp.getString2(26869));
        }
        this.hashAlg = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.certHashes = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        this.pubInfo = PKIPublicationInfo.getInstance(aSN1Sequence.getObjectAt(2));
    }

    public static CMCPublicationInfo getInstance(Object obj) {
        if (obj instanceof CMCPublicationInfo) {
            return (CMCPublicationInfo) obj;
        }
        if (obj != null) {
            return new CMCPublicationInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[][] getCertHashes() {
        int size = this.certHashes.size();
        byte[][] bArr = new byte[size][];
        for (int i3 = 0; i3 != size; i3++) {
            bArr[i3] = a.B(this.certHashes, i3);
        }
        return bArr;
    }

    public AlgorithmIdentifier getHashAlg() {
        return this.hashAlg;
    }

    public PKIPublicationInfo getPubInfo() {
        return this.pubInfo;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.hashAlg);
        aSN1EncodableVector.add(this.certHashes);
        aSN1EncodableVector.add(this.pubInfo);
        return new DERSequence(aSN1EncodableVector);
    }

    public CMCPublicationInfo(AlgorithmIdentifier algorithmIdentifier, byte[][] bArr, PKIPublicationInfo pKIPublicationInfo) {
        this.hashAlg = algorithmIdentifier;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(bArr.length);
        for (int i3 = 0; i3 != bArr.length; i3++) {
            aSN1EncodableVector.add(new DEROctetString(Arrays.clone(bArr[i3])));
        }
        this.certHashes = new DERSequence(aSN1EncodableVector);
        this.pubInfo = pKIPublicationInfo;
    }
}
