package org.bouncycastle.cert.path.validations;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.cert.CertException;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.X509ContentVerifierProviderBuilder;
import org.bouncycastle.cert.path.CertPathValidation;
import org.bouncycastle.cert.path.CertPathValidationContext;
import org.bouncycastle.cert.path.CertPathValidationException;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Memoable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ParentCertIssuedValidation implements CertPathValidation {
    private X509ContentVerifierProviderBuilder contentVerifierProvider;
    private AlgorithmIdentifier workingAlgId;
    private X500Name workingIssuerName;
    private SubjectPublicKeyInfo workingPublicKey;

    public ParentCertIssuedValidation(X509ContentVerifierProviderBuilder x509ContentVerifierProviderBuilder) {
        this.contentVerifierProvider = x509ContentVerifierProviderBuilder;
    }

    private boolean isNull(ASN1Encodable aSN1Encodable) {
        return aSN1Encodable == null || (aSN1Encodable instanceof ASN1Null);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        ParentCertIssuedValidation parentCertIssuedValidation = new ParentCertIssuedValidation(this.contentVerifierProvider);
        parentCertIssuedValidation.workingAlgId = this.workingAlgId;
        parentCertIssuedValidation.workingIssuerName = this.workingIssuerName;
        parentCertIssuedValidation.workingPublicKey = this.workingPublicKey;
        return parentCertIssuedValidation;
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        ParentCertIssuedValidation parentCertIssuedValidation = (ParentCertIssuedValidation) memoable;
        this.contentVerifierProvider = parentCertIssuedValidation.contentVerifierProvider;
        this.workingAlgId = parentCertIssuedValidation.workingAlgId;
        this.workingIssuerName = parentCertIssuedValidation.workingIssuerName;
        this.workingPublicKey = parentCertIssuedValidation.workingPublicKey;
    }

    @Override // org.bouncycastle.cert.path.CertPathValidation
    public void validate(CertPathValidationContext certPathValidationContext, X509CertificateHolder x509CertificateHolder) throws CertPathValidationException {
        X500Name x500Name = this.workingIssuerName;
        if (x500Name != null && !x500Name.equals(x509CertificateHolder.getIssuer())) {
            throw new CertPathValidationException(StubApp.getString2(28123));
        }
        SubjectPublicKeyInfo subjectPublicKeyInfo = this.workingPublicKey;
        if (subjectPublicKeyInfo != null) {
            try {
                if (!x509CertificateHolder.isSignatureValid(this.contentVerifierProvider.build(subjectPublicKeyInfo.getAlgorithm().equals(this.workingAlgId) ? this.workingPublicKey : new SubjectPublicKeyInfo(this.workingAlgId, this.workingPublicKey.parsePublicKey())))) {
                    throw new CertPathValidationException(StubApp.getString2("28124"));
                }
            } catch (IOException e10) {
                throw new CertPathValidationException(u.q(e10, new StringBuilder(StubApp.getString2(28125))), e10);
            } catch (CertException e11) {
                throw new CertPathValidationException(StubApp.getString2(28126) + e11.getMessage(), e11);
            } catch (OperatorCreationException e12) {
                throw new CertPathValidationException(StubApp.getString2(28127) + e12.getMessage(), e12);
            }
        }
        this.workingIssuerName = x509CertificateHolder.getSubject();
        SubjectPublicKeyInfo subjectPublicKeyInfo2 = x509CertificateHolder.getSubjectPublicKeyInfo();
        this.workingPublicKey = subjectPublicKeyInfo2;
        AlgorithmIdentifier algorithmIdentifier = this.workingAlgId;
        AlgorithmIdentifier algorithm = subjectPublicKeyInfo2.getAlgorithm();
        if (algorithmIdentifier == null) {
            this.workingAlgId = algorithm;
        } else {
            if (algorithm.getAlgorithm().equals((ASN1Primitive) this.workingAlgId.getAlgorithm()) && isNull(this.workingPublicKey.getAlgorithm().getParameters())) {
                return;
            }
            this.workingAlgId = this.workingPublicKey.getAlgorithm();
        }
    }
}
