package org.bouncycastle.its.bc;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.signers.DSADigestSigner;
import org.bouncycastle.crypto.signers.ECDSASigner;
import org.bouncycastle.its.ITSCertificate;
import org.bouncycastle.its.operator.ITSContentVerifierProvider;
import org.bouncycastle.oer.OEREncoder;
import org.bouncycastle.oer.its.ieee1609dot2.VerificationKeyIndicator;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicVerificationKey;
import org.bouncycastle.oer.its.template.ieee1609dot2.IEEE1609dot2;
import org.bouncycastle.operator.ContentVerifier;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.bc.BcDefaultDigestProvider;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BcITSContentVerifierProvider implements ITSContentVerifierProvider {
    private final AlgorithmIdentifier digestAlgo;
    private final ITSCertificate issuer;
    private final byte[] parentData;
    private final ECPublicKeyParameters pubParams;
    private final int sigChoice;

    public BcITSContentVerifierProvider(ITSCertificate iTSCertificate) throws IOException {
        AlgorithmIdentifier algorithmIdentifier;
        this.issuer = iTSCertificate;
        this.parentData = iTSCertificate.getEncoded();
        VerificationKeyIndicator verifyKeyIndicator = iTSCertificate.toASN1Structure().getToBeSigned().getVerifyKeyIndicator();
        if (!(verifyKeyIndicator.getVerificationKeyIndicator() instanceof PublicVerificationKey)) {
            throw new IllegalStateException(StubApp.getString2(29611));
        }
        PublicVerificationKey publicVerificationKey = PublicVerificationKey.getInstance(verifyKeyIndicator.getVerificationKeyIndicator());
        this.sigChoice = publicVerificationKey.getChoice();
        int choice = publicVerificationKey.getChoice();
        if (choice == 0) {
            algorithmIdentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
        } else if (choice == 1) {
            algorithmIdentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
        } else {
            if (choice != 2) {
                throw new IllegalStateException(StubApp.getString2(29600));
            }
            algorithmIdentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384);
        }
        this.digestAlgo = algorithmIdentifier;
        this.pubParams = (ECPublicKeyParameters) new BcITSPublicVerificationKey(publicVerificationKey).getKey();
    }

    @Override // org.bouncycastle.its.operator.ITSContentVerifierProvider
    public ContentVerifier get(int i3) throws OperatorCreationException {
        if (this.sigChoice != i3) {
            throw new OperatorCreationException(u.p(i3, StubApp.getString2(29612)));
        }
        final ExtendedDigest extendedDigest = BcDefaultDigestProvider.INSTANCE.get(this.digestAlgo);
        final byte[] bArr = new byte[extendedDigest.getDigestSize()];
        byte[] bArr2 = this.parentData;
        extendedDigest.update(bArr2, 0, bArr2.length);
        extendedDigest.doFinal(bArr, 0);
        final byte[] bArr3 = this.issuer.getIssuer().isSelf() ? new byte[extendedDigest.getDigestSize()] : null;
        if (bArr3 != null) {
            byte[] byteArray = OEREncoder.toByteArray(this.issuer.toASN1Structure().getToBeSigned(), IEEE1609dot2.ToBeSignedCertificate.build());
            extendedDigest.update(byteArray, 0, byteArray.length);
            extendedDigest.doFinal(bArr3, 0);
        }
        final OutputStream outputStream = new OutputStream() { // from class: org.bouncycastle.its.bc.BcITSContentVerifierProvider.1
            @Override // java.io.OutputStream
            public void write(int i10) throws IOException {
                extendedDigest.update((byte) i10);
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr4) throws IOException {
                extendedDigest.update(bArr4, 0, bArr4.length);
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr4, int i10, int i11) throws IOException {
                extendedDigest.update(bArr4, i10, i11);
            }
        };
        return new ContentVerifier() { // from class: org.bouncycastle.its.bc.BcITSContentVerifierProvider.2
            final DSADigestSigner signer;

            {
                this.signer = new DSADigestSigner(new ECDSASigner(), BcDefaultDigestProvider.INSTANCE.get(BcITSContentVerifierProvider.this.digestAlgo));
            }

            @Override // org.bouncycastle.operator.ContentVerifier
            public AlgorithmIdentifier getAlgorithmIdentifier() {
                return null;
            }

            @Override // org.bouncycastle.operator.ContentVerifier
            public OutputStream getOutputStream() {
                return outputStream;
            }

            @Override // org.bouncycastle.operator.ContentVerifier
            public boolean verify(byte[] bArr4) {
                int digestSize = extendedDigest.getDigestSize();
                byte[] bArr5 = new byte[digestSize];
                extendedDigest.doFinal(bArr5, 0);
                this.signer.init(false, BcITSContentVerifierProvider.this.pubParams);
                this.signer.update(bArr5, 0, digestSize);
                byte[] bArr6 = bArr3;
                if (bArr6 == null || !Arrays.areEqual(bArr5, bArr6)) {
                    DSADigestSigner dSADigestSigner = this.signer;
                    byte[] bArr7 = bArr;
                    dSADigestSigner.update(bArr7, 0, bArr7.length);
                } else {
                    int digestSize2 = extendedDigest.getDigestSize();
                    byte[] bArr8 = new byte[digestSize2];
                    extendedDigest.doFinal(bArr8, 0);
                    this.signer.update(bArr8, 0, digestSize2);
                }
                return this.signer.verifySignature(bArr4);
            }
        };
    }

    @Override // org.bouncycastle.its.operator.ITSContentVerifierProvider
    public ITSCertificate getAssociatedCertificate() {
        return this.issuer;
    }

    @Override // org.bouncycastle.its.operator.ITSContentVerifierProvider
    public boolean hasAssociatedCertificate() {
        return this.issuer != null;
    }
}
