package org.bouncycastle.asn1.isismtt.ocsp;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CertHash extends ASN1Object {
    private byte[] certificateHash;
    private AlgorithmIdentifier hashAlgorithm;

    private CertHash(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(a.k(aSN1Sequence, new StringBuilder(StubApp.getString2(26912))));
        }
        this.hashAlgorithm = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.certificateHash = a.D(aSN1Sequence, 1);
    }

    public static CertHash getInstance(Object obj) {
        if (obj == null || (obj instanceof CertHash)) {
            return (CertHash) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new CertHash((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException(E1.a.h(obj, StubApp.getString2(26708)));
    }

    public byte[] getCertificateHash() {
        return Arrays.clone(this.certificateHash);
    }

    public AlgorithmIdentifier getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.hashAlgorithm);
        aSN1EncodableVector.add(new DEROctetString(this.certificateHash));
        return new DERSequence(aSN1EncodableVector);
    }

    public CertHash(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.hashAlgorithm = algorithmIdentifier;
        byte[] bArr2 = new byte[bArr.length];
        this.certificateHash = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }
}
