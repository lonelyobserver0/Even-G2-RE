package org.bouncycastle.its;

import com.stub.StubApp;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.its.operator.ECDSAEncoder;
import org.bouncycastle.its.operator.ITSContentSigner;
import org.bouncycastle.oer.OEREncoder;
import org.bouncycastle.oer.its.ieee1609dot2.CertificateBase;
import org.bouncycastle.oer.its.ieee1609dot2.CertificateId;
import org.bouncycastle.oer.its.ieee1609dot2.CertificateType;
import org.bouncycastle.oer.its.ieee1609dot2.IssuerIdentifier;
import org.bouncycastle.oer.its.ieee1609dot2.ToBeSignedCertificate;
import org.bouncycastle.oer.its.ieee1609dot2.VerificationKeyIndicator;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashAlgorithm;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId8;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Signature;
import org.bouncycastle.oer.its.template.ieee1609dot2.IEEE1609dot2;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ITSExplicitCertificateBuilder extends ITSCertificateBuilder {
    private final ITSContentSigner signer;

    public ITSExplicitCertificateBuilder(ITSContentSigner iTSContentSigner, ToBeSignedCertificate.Builder builder) {
        super(builder);
        this.signer = iTSContentSigner;
    }

    public ITSCertificate build(CertificateId certificateId, ITSPublicVerificationKey iTSPublicVerificationKey) {
        return build(certificateId, iTSPublicVerificationKey, null);
    }

    public ITSCertificate build(CertificateId certificateId, ITSPublicVerificationKey iTSPublicVerificationKey, ITSPublicEncryptionKey iTSPublicEncryptionKey) {
        Signature its;
        IssuerIdentifier sha384AndDigest;
        HashAlgorithm hashAlgorithm;
        ToBeSignedCertificate.Builder builder = new ToBeSignedCertificate.Builder(this.tbsCertificateBuilder);
        builder.setId(certificateId);
        if (iTSPublicEncryptionKey != null) {
            builder.setEncryptionKey(iTSPublicEncryptionKey.toASN1Structure());
        }
        builder.setVerifyKeyIndicator(VerificationKeyIndicator.verificationKey(iTSPublicVerificationKey.toASN1Structure()));
        ToBeSignedCertificate createToBeSignedCertificate = builder.createToBeSignedCertificate();
        VerificationKeyIndicator verifyKeyIndicator = this.signer.isForSelfSigning() ? createToBeSignedCertificate.getVerifyKeyIndicator() : this.signer.getAssociatedCertificate().toASN1Structure().getToBeSigned().getVerifyKeyIndicator();
        OutputStream outputStream = this.signer.getOutputStream();
        try {
            outputStream.write(OEREncoder.toByteArray(createToBeSignedCertificate, IEEE1609dot2.ToBeSignedCertificate.build()));
            outputStream.close();
            int choice = verifyKeyIndicator.getChoice();
            if (choice == 0) {
                its = ECDSAEncoder.toITS(SECObjectIdentifiers.secp256r1, this.signer.getSignature());
            } else if (choice == 1) {
                its = ECDSAEncoder.toITS(TeleTrusTObjectIdentifiers.brainpoolP256r1, this.signer.getSignature());
            } else {
                if (choice != 2) {
                    throw new IllegalStateException(StubApp.getString2(29600));
                }
                its = ECDSAEncoder.toITS(TeleTrusTObjectIdentifiers.brainpoolP384r1, this.signer.getSignature());
            }
            CertificateBase.Builder builder2 = new CertificateBase.Builder();
            ASN1ObjectIdentifier algorithm = this.signer.getDigestAlgorithm().getAlgorithm();
            boolean isForSelfSigning = this.signer.isForSelfSigning();
            String string2 = StubApp.getString2(29601);
            if (isForSelfSigning) {
                if (algorithm.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha256)) {
                    hashAlgorithm = HashAlgorithm.sha256;
                } else {
                    if (!algorithm.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha384)) {
                        throw new IllegalStateException(string2);
                    }
                    hashAlgorithm = HashAlgorithm.sha384;
                }
                sha384AndDigest = IssuerIdentifier.self(hashAlgorithm);
            } else {
                byte[] associatedCertificateDigest = this.signer.getAssociatedCertificateDigest();
                HashedId8 hashedId8 = new HashedId8(Arrays.copyOfRange(associatedCertificateDigest, associatedCertificateDigest.length - 8, associatedCertificateDigest.length));
                if (algorithm.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha256)) {
                    sha384AndDigest = IssuerIdentifier.sha256AndDigest(hashedId8);
                } else {
                    if (!algorithm.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha384)) {
                        throw new IllegalStateException(string2);
                    }
                    sha384AndDigest = IssuerIdentifier.sha384AndDigest(hashedId8);
                }
            }
            builder2.setVersion(this.version);
            builder2.setType(CertificateType.explicit);
            builder2.setIssuer(sha384AndDigest);
            builder2.setToBeSigned(createToBeSignedCertificate);
            builder2.setSignature(its);
            return new ITSCertificate(builder2.createCertificateBase());
        } catch (IOException unused) {
            throw new IllegalArgumentException(StubApp.getString2(28008));
        }
    }
}
