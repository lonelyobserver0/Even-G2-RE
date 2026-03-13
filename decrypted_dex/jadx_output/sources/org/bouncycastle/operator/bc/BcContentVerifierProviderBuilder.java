package org.bouncycastle.operator.bc;

import com.mapbox.common.b;
import com.stub.StubApp;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.operator.ContentVerifier;
import org.bouncycastle.operator.ContentVerifierProvider;
import org.bouncycastle.operator.OperatorCreationException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class BcContentVerifierProviderBuilder {
    protected BcDigestProvider digestProvider = BcDefaultDigestProvider.INSTANCE;

    public static class SigVerifier implements ContentVerifier {
        private AlgorithmIdentifier algorithm;
        private BcSignerOutputStream stream;

        public SigVerifier(AlgorithmIdentifier algorithmIdentifier, BcSignerOutputStream bcSignerOutputStream) {
            this.algorithm = algorithmIdentifier;
            this.stream = bcSignerOutputStream;
        }

        @Override // org.bouncycastle.operator.ContentVerifier
        public AlgorithmIdentifier getAlgorithmIdentifier() {
            return this.algorithm;
        }

        @Override // org.bouncycastle.operator.ContentVerifier
        public OutputStream getOutputStream() {
            BcSignerOutputStream bcSignerOutputStream = this.stream;
            if (bcSignerOutputStream != null) {
                return bcSignerOutputStream;
            }
            throw new IllegalStateException(StubApp.getString2(33841));
        }

        @Override // org.bouncycastle.operator.ContentVerifier
        public boolean verify(byte[] bArr) {
            return this.stream.verify(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BcSignerOutputStream createSignatureStream(AlgorithmIdentifier algorithmIdentifier, AsymmetricKeyParameter asymmetricKeyParameter) throws OperatorCreationException {
        Signer createSigner = createSigner(algorithmIdentifier);
        createSigner.init(false, asymmetricKeyParameter);
        return new BcSignerOutputStream(createSigner);
    }

    public ContentVerifierProvider build(final X509CertificateHolder x509CertificateHolder) throws OperatorCreationException {
        return new ContentVerifierProvider() { // from class: org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder.1
            @Override // org.bouncycastle.operator.ContentVerifierProvider
            public ContentVerifier get(AlgorithmIdentifier algorithmIdentifier) throws OperatorCreationException {
                try {
                    return new SigVerifier(algorithmIdentifier, BcContentVerifierProviderBuilder.this.createSignatureStream(algorithmIdentifier, BcContentVerifierProviderBuilder.this.extractKeyParameters(x509CertificateHolder.getSubjectPublicKeyInfo())));
                } catch (IOException e10) {
                    throw new OperatorCreationException(b.h(StubApp.getString2(33840), e10), e10);
                }
            }

            @Override // org.bouncycastle.operator.ContentVerifierProvider
            public X509CertificateHolder getAssociatedCertificate() {
                return x509CertificateHolder;
            }

            @Override // org.bouncycastle.operator.ContentVerifierProvider
            public boolean hasAssociatedCertificate() {
                return true;
            }
        };
    }

    public abstract Signer createSigner(AlgorithmIdentifier algorithmIdentifier) throws OperatorCreationException;

    public abstract AsymmetricKeyParameter extractKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException;

    public ContentVerifierProvider build(final AsymmetricKeyParameter asymmetricKeyParameter) throws OperatorCreationException {
        return new ContentVerifierProvider() { // from class: org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder.2
            @Override // org.bouncycastle.operator.ContentVerifierProvider
            public ContentVerifier get(AlgorithmIdentifier algorithmIdentifier) throws OperatorCreationException {
                return new SigVerifier(algorithmIdentifier, BcContentVerifierProviderBuilder.this.createSignatureStream(algorithmIdentifier, asymmetricKeyParameter));
            }

            @Override // org.bouncycastle.operator.ContentVerifierProvider
            public X509CertificateHolder getAssociatedCertificate() {
                return null;
            }

            @Override // org.bouncycastle.operator.ContentVerifierProvider
            public boolean hasAssociatedCertificate() {
                return false;
            }
        };
    }
}
