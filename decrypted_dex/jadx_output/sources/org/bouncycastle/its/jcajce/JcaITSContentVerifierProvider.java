package org.bouncycastle.its.jcajce;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.io.OutputStream;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.its.ITSCertificate;
import org.bouncycastle.its.ITSPublicVerificationKey;
import org.bouncycastle.its.operator.ITSContentVerifierProvider;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.oer.OEREncoder;
import org.bouncycastle.oer.its.ieee1609dot2.VerificationKeyIndicator;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicVerificationKey;
import org.bouncycastle.oer.its.template.ieee1609dot2.IEEE1609dot2;
import org.bouncycastle.operator.ContentVerifier;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JcaITSContentVerifierProvider implements ITSContentVerifierProvider {
    private AlgorithmIdentifier digestAlgo;
    private final JcaJceHelper helper;
    private final ITSCertificate issuer;
    private final byte[] parentData;
    private ECPublicKey pubParams;
    private int sigChoice;

    public static class Builder {
        private JcaJceHelper helper = new DefaultJcaJceHelper();

        public JcaITSContentVerifierProvider build(ITSCertificate iTSCertificate) {
            return new JcaITSContentVerifierProvider(iTSCertificate, this.helper);
        }

        public Builder setProvider(String str) {
            this.helper = new NamedJcaJceHelper(str);
            return this;
        }

        public JcaITSContentVerifierProvider build(ITSPublicVerificationKey iTSPublicVerificationKey) {
            return new JcaITSContentVerifierProvider(iTSPublicVerificationKey, this.helper);
        }

        public Builder setProvider(Provider provider) {
            this.helper = new ProviderJcaJceHelper(provider);
            return this;
        }
    }

    private JcaITSContentVerifierProvider(ITSCertificate iTSCertificate, JcaJceHelper jcaJceHelper) {
        this.issuer = iTSCertificate;
        this.helper = jcaJceHelper;
        try {
            this.parentData = iTSCertificate.getEncoded();
            VerificationKeyIndicator verifyKeyIndicator = iTSCertificate.toASN1Structure().getToBeSigned().getVerifyKeyIndicator();
            if (!(verifyKeyIndicator.getVerificationKeyIndicator() instanceof PublicVerificationKey)) {
                throw new IllegalArgumentException(StubApp.getString2(29611));
            }
            initForPvi(PublicVerificationKey.getInstance(verifyKeyIndicator.getVerificationKeyIndicator()), jcaJceHelper);
        } catch (IOException e10) {
            throw new IllegalStateException(u.q(e10, new StringBuilder(StubApp.getString2(29621))));
        }
    }

    private void initForPvi(PublicVerificationKey publicVerificationKey, JcaJceHelper jcaJceHelper) {
        AlgorithmIdentifier algorithmIdentifier;
        this.sigChoice = publicVerificationKey.getChoice();
        int choice = publicVerificationKey.getChoice();
        if (choice == 0) {
            algorithmIdentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
        } else if (choice == 1) {
            algorithmIdentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
        } else {
            if (choice != 2) {
                throw new IllegalArgumentException(StubApp.getString2(29600));
            }
            algorithmIdentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384);
        }
        this.digestAlgo = algorithmIdentifier;
        this.pubParams = (ECPublicKey) new JcaITSPublicVerificationKey(publicVerificationKey, jcaJceHelper).getKey();
    }

    @Override // org.bouncycastle.its.operator.ITSContentVerifierProvider
    public ContentVerifier get(int i3) throws OperatorCreationException {
        byte[] bArr;
        JcaJceHelper jcaJceHelper;
        String str;
        String string2 = StubApp.getString2(29622);
        if (this.sigChoice != i3) {
            throw new OperatorCreationException(u.p(i3, StubApp.getString2(29612)));
        }
        try {
            final DigestCalculator digestCalculator = new JcaDigestCalculatorProviderBuilder().setHelper(this.helper).build().get(this.digestAlgo);
            try {
                final OutputStream outputStream = digestCalculator.getOutputStream();
                byte[] bArr2 = this.parentData;
                if (bArr2 != null) {
                    outputStream.write(bArr2, 0, bArr2.length);
                }
                final byte[] digest = digestCalculator.getDigest();
                ITSCertificate iTSCertificate = this.issuer;
                if (iTSCertificate == null || !iTSCertificate.getIssuer().isSelf()) {
                    bArr = null;
                } else {
                    byte[] byteArray = OEREncoder.toByteArray(this.issuer.toASN1Structure().getToBeSigned(), IEEE1609dot2.ToBeSignedCertificate.build());
                    outputStream.write(byteArray, 0, byteArray.length);
                    bArr = digestCalculator.getDigest();
                }
                final byte[] bArr3 = bArr;
                int i10 = this.sigChoice;
                if (i10 == 0 || i10 == 1) {
                    jcaJceHelper = this.helper;
                    str = "SHA256withECDSA";
                } else {
                    if (i10 != 2) {
                        throw new IllegalArgumentException(string2 + this.sigChoice + StubApp.getString2("17458"));
                    }
                    jcaJceHelper = this.helper;
                    str = StubApp.getString2("29433");
                }
                final Signature createSignature = jcaJceHelper.createSignature(str);
                return new ContentVerifier() { // from class: org.bouncycastle.its.jcajce.JcaITSContentVerifierProvider.1
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
                        byte[] digest2 = digestCalculator.getDigest();
                        try {
                            createSignature.initVerify(JcaITSContentVerifierProvider.this.pubParams);
                            createSignature.update(digest2);
                            byte[] bArr5 = bArr3;
                            if (bArr5 == null || !Arrays.areEqual(digest2, bArr5)) {
                                createSignature.update(digest);
                            } else {
                                createSignature.update(digestCalculator.getDigest());
                            }
                            return createSignature.verify(bArr4);
                        } catch (Exception e10) {
                            throw new RuntimeException(e10.getMessage(), e10);
                        }
                    }
                };
            } catch (Exception e10) {
                throw new IllegalStateException(e10.getMessage(), e10);
            }
        } catch (Exception e11) {
            throw new IllegalStateException(e11.getMessage(), e11);
        }
    }

    @Override // org.bouncycastle.its.operator.ITSContentVerifierProvider
    public ITSCertificate getAssociatedCertificate() {
        return this.issuer;
    }

    @Override // org.bouncycastle.its.operator.ITSContentVerifierProvider
    public boolean hasAssociatedCertificate() {
        return this.issuer != null;
    }

    private JcaITSContentVerifierProvider(ITSPublicVerificationKey iTSPublicVerificationKey, JcaJceHelper jcaJceHelper) {
        this.issuer = null;
        this.parentData = null;
        this.helper = jcaJceHelper;
        initForPvi(iTSPublicVerificationKey.toASN1Structure(), jcaJceHelper);
    }
}
