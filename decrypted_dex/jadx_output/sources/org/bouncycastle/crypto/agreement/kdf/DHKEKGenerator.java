package org.bouncycastle.crypto.agreement.kdf;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DHKEKGenerator implements DerivationFunction {
    private ASN1ObjectIdentifier algorithm;
    private final Digest digest;
    private int keySize;
    private byte[] partyAInfo;

    /* renamed from: z, reason: collision with root package name */
    private byte[] f18748z;

    public DHKEKGenerator(Digest digest) {
        this.digest = digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i3, int i10) throws DataLengthException, IllegalArgumentException {
        boolean z2;
        int i11 = i10;
        int i12 = i3;
        if (bArr.length - i11 < i12) {
            throw new OutputLengthException(StubApp.getString2(28433));
        }
        long j = i11;
        int digestSize = this.digest.getDigestSize();
        if (j > 8589934591L) {
            throw new IllegalArgumentException(StubApp.getString2(28436));
        }
        long j3 = digestSize;
        int i13 = (int) (((j + j3) - 1) / j3);
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        int i14 = 0;
        int i15 = 0;
        int i16 = 1;
        while (i15 < i13) {
            Digest digest = this.digest;
            byte[] bArr3 = this.f18748z;
            digest.update(bArr3, i14, bArr3.length);
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            aSN1EncodableVector2.add(this.algorithm);
            aSN1EncodableVector2.add(new DEROctetString(Pack.intToBigEndian(i16)));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
            if (this.partyAInfo != null) {
                z2 = true;
                aSN1EncodableVector.add(new DERTaggedObject(true, i14, (ASN1Encodable) new DEROctetString(this.partyAInfo)));
            } else {
                z2 = true;
            }
            aSN1EncodableVector.add(new DERTaggedObject(z2, 2, new DEROctetString(Pack.intToBigEndian(this.keySize))));
            try {
                byte[] encoded = new DERSequence(aSN1EncodableVector).getEncoded(StubApp.getString2("26791"));
                this.digest.update(encoded, 0, encoded.length);
                this.digest.doFinal(bArr2, 0);
                if (i11 > digestSize) {
                    System.arraycopy(bArr2, 0, bArr, i12, digestSize);
                    i12 += digestSize;
                    i11 -= digestSize;
                } else {
                    System.arraycopy(bArr2, 0, bArr, i12, i11);
                }
                i16++;
                i15++;
                i14 = 0;
            } catch (IOException e10) {
                throw new IllegalArgumentException(u.q(e10, new StringBuilder(StubApp.getString2(28435))));
            }
        }
        this.digest.reset();
        return (int) j;
    }

    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        DHKDFParameters dHKDFParameters = (DHKDFParameters) derivationParameters;
        this.algorithm = dHKDFParameters.getAlgorithm();
        this.keySize = dHKDFParameters.getKeySize();
        this.f18748z = dHKDFParameters.getZ();
        this.partyAInfo = dHKDFParameters.getExtraInfo();
    }
}
