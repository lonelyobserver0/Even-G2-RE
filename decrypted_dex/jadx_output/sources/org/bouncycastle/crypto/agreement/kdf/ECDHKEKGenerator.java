package org.bouncycastle.crypto.agreement.kdf;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.DigestDerivationFunction;
import org.bouncycastle.crypto.generators.KDF2BytesGenerator;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECDHKEKGenerator implements DigestDerivationFunction {
    private ASN1ObjectIdentifier algorithm;
    private DigestDerivationFunction kdf;
    private int keySize;

    /* renamed from: z, reason: collision with root package name */
    private byte[] f18749z;

    public ECDHKEKGenerator(Digest digest) {
        this.kdf = new KDF2BytesGenerator(digest);
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i3, int i10) throws DataLengthException, IllegalArgumentException {
        if (i3 + i10 > bArr.length) {
            throw new DataLengthException(StubApp.getString2(28433));
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new AlgorithmIdentifier(this.algorithm, DERNull.INSTANCE));
        aSN1EncodableVector.add(new DERTaggedObject(true, 2, (ASN1Encodable) new DEROctetString(Pack.intToBigEndian(this.keySize))));
        try {
            this.kdf.init(new KDFParameters(this.f18749z, new DERSequence(aSN1EncodableVector).getEncoded(StubApp.getString2("26791"))));
            return this.kdf.generateBytes(bArr, i3, i10);
        } catch (IOException e10) {
            throw new IllegalArgumentException(u.q(e10, new StringBuilder(StubApp.getString2(28437))));
        }
    }

    @Override // org.bouncycastle.crypto.DigestDerivationFunction
    public Digest getDigest() {
        return this.kdf.getDigest();
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        DHKDFParameters dHKDFParameters = (DHKDFParameters) derivationParameters;
        this.algorithm = dHKDFParameters.getAlgorithm();
        this.keySize = dHKDFParameters.getKeySize();
        this.f18749z = dHKDFParameters.getZ();
    }
}
