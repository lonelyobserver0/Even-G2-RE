package org.bouncycastle.asn1.ess;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.IssuerSerial;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ESSCertIDv2 extends ASN1Object {
    private static final AlgorithmIdentifier DEFAULT_ALG_ID = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
    private byte[] certHash;
    private AlgorithmIdentifier hashAlgorithm;
    private IssuerSerial issuerSerial;

    private ESSCertIDv2(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() > 3) {
            throw new IllegalArgumentException(a.k(aSN1Sequence, new StringBuilder(StubApp.getString2(26912))));
        }
        int i3 = 0;
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1OctetString) {
            this.hashAlgorithm = DEFAULT_ALG_ID;
        } else {
            this.hashAlgorithm = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0).toASN1Primitive());
            i3 = 1;
        }
        int i10 = i3 + 1;
        this.certHash = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i3).toASN1Primitive()).getOctets();
        if (aSN1Sequence.size() > i10) {
            this.issuerSerial = IssuerSerial.getInstance(aSN1Sequence.getObjectAt(i10));
        }
    }

    public static ESSCertIDv2 getInstance(Object obj) {
        if (obj instanceof ESSCertIDv2) {
            return (ESSCertIDv2) obj;
        }
        if (obj != null) {
            return new ESSCertIDv2(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getCertHash() {
        return Arrays.clone(this.certHash);
    }

    public AlgorithmIdentifier getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public IssuerSerial getIssuerSerial() {
        return this.issuerSerial;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        if (!this.hashAlgorithm.equals(DEFAULT_ALG_ID)) {
            aSN1EncodableVector.add(this.hashAlgorithm);
        }
        aSN1EncodableVector.add(new DEROctetString(this.certHash).toASN1Primitive());
        IssuerSerial issuerSerial = this.issuerSerial;
        if (issuerSerial != null) {
            aSN1EncodableVector.add(issuerSerial);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public ESSCertIDv2(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this(algorithmIdentifier, bArr, null);
    }

    public ESSCertIDv2(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, IssuerSerial issuerSerial) {
        this.hashAlgorithm = algorithmIdentifier == null ? DEFAULT_ALG_ID : algorithmIdentifier;
        this.certHash = Arrays.clone(bArr);
        this.issuerSerial = issuerSerial;
    }

    public ESSCertIDv2(byte[] bArr) {
        this(null, bArr, null);
    }

    public ESSCertIDv2(byte[] bArr, IssuerSerial issuerSerial) {
        this(null, bArr, issuerSerial);
    }
}
