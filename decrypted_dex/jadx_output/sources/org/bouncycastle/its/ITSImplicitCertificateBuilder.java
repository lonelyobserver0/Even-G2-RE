package org.bouncycastle.its;

import com.stub.StubApp;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.oer.its.ieee1609dot2.CertificateBase;
import org.bouncycastle.oer.its.ieee1609dot2.CertificateId;
import org.bouncycastle.oer.its.ieee1609dot2.CertificateType;
import org.bouncycastle.oer.its.ieee1609dot2.IssuerIdentifier;
import org.bouncycastle.oer.its.ieee1609dot2.ToBeSignedCertificate;
import org.bouncycastle.oer.its.ieee1609dot2.VerificationKeyIndicator;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EccP256CurvePoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId8;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicEncryptionKey;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ITSImplicitCertificateBuilder extends ITSCertificateBuilder {
    private final IssuerIdentifier issuerIdentifier;

    public ITSImplicitCertificateBuilder(ITSCertificate iTSCertificate, DigestCalculatorProvider digestCalculatorProvider, ToBeSignedCertificate.Builder builder) {
        super(iTSCertificate, builder);
        IssuerIdentifier sha384AndDigest;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_sha256;
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(aSN1ObjectIdentifier);
        ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        try {
            DigestCalculator digestCalculator = digestCalculatorProvider.get(algorithmIdentifier);
            try {
                OutputStream outputStream = digestCalculator.getOutputStream();
                outputStream.write(iTSCertificate.getEncoded());
                outputStream.close();
                byte[] digest = digestCalculator.getDigest();
                HashedId8 hashedId8 = new HashedId8(Arrays.copyOfRange(digest, digest.length - 8, digest.length));
                if (algorithm.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                    sha384AndDigest = IssuerIdentifier.sha256AndDigest(hashedId8);
                } else {
                    if (!algorithm.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha384)) {
                        throw new IllegalStateException(StubApp.getString2(29601));
                    }
                    sha384AndDigest = IssuerIdentifier.sha384AndDigest(hashedId8);
                }
                this.issuerIdentifier = sha384AndDigest;
            } catch (IOException e10) {
                throw new IllegalStateException(e10.getMessage(), e10);
            }
        } catch (OperatorCreationException e11) {
            throw new IllegalStateException(e11.getMessage(), e11);
        }
    }

    public ITSCertificate build(CertificateId certificateId, BigInteger bigInteger, BigInteger bigInteger2) {
        return build(certificateId, bigInteger, bigInteger2, null);
    }

    public ITSCertificate build(CertificateId certificateId, BigInteger bigInteger, BigInteger bigInteger2, PublicEncryptionKey publicEncryptionKey) {
        EccP256CurvePoint uncompressedP256 = EccP256CurvePoint.uncompressedP256(bigInteger, bigInteger2);
        ToBeSignedCertificate.Builder builder = new ToBeSignedCertificate.Builder(this.tbsCertificateBuilder);
        builder.setId(certificateId);
        if (publicEncryptionKey != null) {
            builder.setEncryptionKey(publicEncryptionKey);
        }
        builder.setVerifyKeyIndicator(VerificationKeyIndicator.reconstructionValue(uncompressedP256));
        CertificateBase.Builder builder2 = new CertificateBase.Builder();
        builder2.setVersion(this.version);
        builder2.setType(CertificateType.implicit);
        builder2.setIssuer(this.issuerIdentifier);
        builder2.setToBeSigned(builder.createToBeSignedCertificate());
        return new ITSCertificate(builder2.createCertificateBase());
    }
}
