package org.bouncycastle.eac.operator.jcajce;

import com.stub.StubApp;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.eac.EACObjectIdentifiers;
import org.bouncycastle.eac.operator.EACSignatureVerifier;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.OperatorStreamException;
import org.bouncycastle.operator.RuntimeOperatorException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JcaEACSignatureVerifierBuilder {
    private EACHelper helper = new DefaultEACHelper();

    public static class SignatureOutputStream extends OutputStream {
        private Signature sig;

        public SignatureOutputStream(Signature signature) {
            this.sig = signature;
        }

        public boolean verify(byte[] bArr) throws SignatureException {
            return this.sig.verify(bArr);
        }

        @Override // java.io.OutputStream
        public void write(int i3) throws IOException {
            try {
                this.sig.update((byte) i3);
            } catch (SignatureException e10) {
                throw new OperatorStreamException(StubApp.getString2(29436) + e10.getMessage(), e10);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            try {
                this.sig.update(bArr);
            } catch (SignatureException e10) {
                throw new OperatorStreamException(StubApp.getString2(29436) + e10.getMessage(), e10);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i3, int i10) throws IOException {
            try {
                this.sig.update(bArr, i3, i10);
            } catch (SignatureException e10) {
                throw new OperatorStreamException(StubApp.getString2(29436) + e10.getMessage(), e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] derEncode(byte[] bArr) throws IOException {
        int length = bArr.length / 2;
        byte[] bArr2 = new byte[length];
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        System.arraycopy(bArr, length, bArr3, 0, length);
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(new BigInteger(1, bArr2)));
        aSN1EncodableVector.add(new ASN1Integer(new BigInteger(1, bArr3)));
        return new DERSequence(aSN1EncodableVector).getEncoded();
    }

    public EACSignatureVerifier build(final ASN1ObjectIdentifier aSN1ObjectIdentifier, PublicKey publicKey) throws OperatorCreationException {
        try {
            Signature signature = this.helper.getSignature(aSN1ObjectIdentifier);
            signature.initVerify(publicKey);
            final SignatureOutputStream signatureOutputStream = new SignatureOutputStream(signature);
            return new EACSignatureVerifier() { // from class: org.bouncycastle.eac.operator.jcajce.JcaEACSignatureVerifierBuilder.1
                @Override // org.bouncycastle.eac.operator.EACSignatureVerifier
                public OutputStream getOutputStream() {
                    return signatureOutputStream;
                }

                @Override // org.bouncycastle.eac.operator.EACSignatureVerifier
                public ASN1ObjectIdentifier getUsageIdentifier() {
                    return aSN1ObjectIdentifier;
                }

                @Override // org.bouncycastle.eac.operator.EACSignatureVerifier
                public boolean verify(byte[] bArr) {
                    try {
                        if (!aSN1ObjectIdentifier.on(EACObjectIdentifiers.id_TA_ECDSA)) {
                            return signatureOutputStream.verify(bArr);
                        }
                        try {
                            return signatureOutputStream.verify(JcaEACSignatureVerifierBuilder.derEncode(bArr));
                        } catch (Exception unused) {
                            return false;
                        }
                    } catch (SignatureException e10) {
                        throw new RuntimeOperatorException(StubApp.getString2(29435) + e10.getMessage(), e10);
                    }
                }
            };
        } catch (InvalidKeyException e10) {
            throw new OperatorCreationException(StubApp.getString2(28073) + e10.getMessage(), e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new OperatorCreationException(StubApp.getString2(29438) + e11.getMessage(), e11);
        } catch (NoSuchProviderException e12) {
            throw new OperatorCreationException(StubApp.getString2(29437) + e12.getMessage(), e12);
        }
    }

    public JcaEACSignatureVerifierBuilder setProvider(String str) {
        this.helper = new NamedEACHelper(str);
        return this;
    }

    public JcaEACSignatureVerifierBuilder setProvider(Provider provider) {
        this.helper = new ProviderEACHelper(provider);
        return this;
    }
}
