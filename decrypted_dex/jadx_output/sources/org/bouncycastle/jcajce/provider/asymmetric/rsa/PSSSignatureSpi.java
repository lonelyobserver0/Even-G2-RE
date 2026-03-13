package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PSSSignatureSpi extends SignatureSpi {
    private Digest contentDigest;
    private AlgorithmParameters engineParams;
    private final JcaJceHelper helper;
    private boolean isInitState;
    private boolean isRaw;
    private RSAKeyParameters key;
    private Digest mgfDigest;
    private PSSParameterSpec originalSpec;
    private PSSParameterSpec paramSpec;
    private PSSSigner pss;
    private SecureRandom random;
    private int saltLength;
    private AsymmetricBlockCipher signer;
    private byte trailer;

    public static class NullPssDigest implements Digest {
        private Digest baseDigest;
        private ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        private boolean oddTime = true;

        public NullPssDigest(Digest digest) {
            this.baseDigest = digest;
        }

        @Override // org.bouncycastle.crypto.Digest
        public int doFinal(byte[] bArr, int i3) {
            byte[] byteArray = this.bOut.toByteArray();
            if (this.oddTime) {
                System.arraycopy(byteArray, 0, bArr, i3, byteArray.length);
            } else {
                this.baseDigest.update(byteArray, 0, byteArray.length);
                this.baseDigest.doFinal(bArr, i3);
            }
            reset();
            this.oddTime = !this.oddTime;
            return byteArray.length;
        }

        @Override // org.bouncycastle.crypto.Digest
        public String getAlgorithmName() {
            return StubApp.getString2(3796);
        }

        public int getByteLength() {
            return 0;
        }

        @Override // org.bouncycastle.crypto.Digest
        public int getDigestSize() {
            return this.baseDigest.getDigestSize();
        }

        @Override // org.bouncycastle.crypto.Digest
        public void reset() {
            this.bOut.reset();
            this.baseDigest.reset();
        }

        @Override // org.bouncycastle.crypto.Digest
        public void update(byte b2) {
            this.bOut.write(b2);
        }

        @Override // org.bouncycastle.crypto.Digest
        public void update(byte[] bArr, int i3, int i10) {
            this.bOut.write(bArr, i3, i10);
        }
    }

    public static class PSSwithRSA extends PSSSignatureSpi {
        public PSSwithRSA() {
            super(new RSABlindedEngine(), null);
        }
    }

    public static class SHA1withRSA extends PSSSignatureSpi {
        public SHA1withRSA() {
            super(new RSABlindedEngine(), PSSParameterSpec.DEFAULT);
        }
    }

    public static class SHA1withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA1withRSAandSHAKE128() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(21748), StubApp.getString2(28183), null, 20, 1));
        }
    }

    public static class SHA1withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA1withRSAandSHAKE256() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(21748), StubApp.getString2(28184), null, 20, 1));
        }
    }

    public static class SHA224withRSA extends PSSSignatureSpi {
        public SHA224withRSA() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(28501), StubApp.getString2(30299), new MGF1ParameterSpec(StubApp.getString2(28501)), 28, 1));
        }
    }

    public static class SHA224withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA224withRSAandSHAKE128() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(28501), StubApp.getString2(28183), null, 28, 1));
        }
    }

    public static class SHA224withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA224withRSAandSHAKE256() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(28501), StubApp.getString2(28184), null, 28, 1));
        }
    }

    public static class SHA256withRSA extends PSSSignatureSpi {
        public SHA256withRSA() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(1488), StubApp.getString2(30299), new MGF1ParameterSpec(StubApp.getString2(1488)), 32, 1));
        }
    }

    public static class SHA256withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA256withRSAandSHAKE128() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(1488), StubApp.getString2(28183), null, 32, 1));
        }
    }

    public static class SHA256withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA256withRSAandSHAKE256() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(1488), StubApp.getString2(28184), null, 32, 1));
        }
    }

    public static class SHA384withRSA extends PSSSignatureSpi {
        public SHA384withRSA() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(23704), StubApp.getString2(30299), new MGF1ParameterSpec(StubApp.getString2(23704)), 48, 1));
        }
    }

    public static class SHA384withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA384withRSAandSHAKE128() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(23704), StubApp.getString2(28183), null, 48, 1));
        }
    }

    public static class SHA384withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA384withRSAandSHAKE256() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(23704), StubApp.getString2(28184), null, 48, 1));
        }
    }

    public static class SHA3_224withRSA extends PSSSignatureSpi {
        public SHA3_224withRSA() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(28174), StubApp.getString2(30299), new MGF1ParameterSpec(StubApp.getString2(28174)), 28, 1));
        }
    }

    public static class SHA3_224withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA3_224withRSAandSHAKE128() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(28174), StubApp.getString2(28183), null, 28, 1));
        }
    }

    public static class SHA3_224withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA3_224withRSAandSHAKE256() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(28174), StubApp.getString2(28184), null, 28, 1));
        }
    }

    public static class SHA3_256withRSA extends PSSSignatureSpi {
        public SHA3_256withRSA() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(28175), StubApp.getString2(30299), new MGF1ParameterSpec(StubApp.getString2(28175)), 32, 1));
        }
    }

    public static class SHA3_256withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA3_256withRSAandSHAKE128() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(28175), StubApp.getString2(28183), null, 32, 1));
        }
    }

    public static class SHA3_256withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA3_256withRSAandSHAKE256() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(28175), StubApp.getString2(28184), null, 32, 1));
        }
    }

    public static class SHA3_384withRSA extends PSSSignatureSpi {
        public SHA3_384withRSA() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(28176), StubApp.getString2(30299), new MGF1ParameterSpec(StubApp.getString2(28176)), 48, 1));
        }
    }

    public static class SHA3_384withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA3_384withRSAandSHAKE128() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(28176), StubApp.getString2(28183), null, 48, 1));
        }
    }

    public static class SHA3_384withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA3_384withRSAandSHAKE256() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(28176), StubApp.getString2(28184), null, 48, 1));
        }
    }

    public static class SHA3_512withRSA extends PSSSignatureSpi {
        public SHA3_512withRSA() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(28177), StubApp.getString2(30299), new MGF1ParameterSpec(StubApp.getString2(28177)), 64, 1));
        }
    }

    public static class SHA3_512withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA3_512withRSAandSHAKE128() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(28177), StubApp.getString2(28183), null, 64, 1));
        }
    }

    public static class SHA3_512withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA3_512withRSAandSHAKE256() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(28177), StubApp.getString2(28184), null, 64, 1));
        }
    }

    public static class SHA512_224withRSA extends PSSSignatureSpi {
        public SHA512_224withRSA() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(30820), StubApp.getString2(30299), new MGF1ParameterSpec(StubApp.getString2(30820)), 28, 1));
        }
    }

    public static class SHA512_224withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA512_224withRSAandSHAKE128() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(30820), StubApp.getString2(28183), null, 28, 1));
        }
    }

    public static class SHA512_224withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA512_224withRSAandSHAKE256() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(30820), StubApp.getString2(28184), null, 28, 1));
        }
    }

    public static class SHA512_256withRSA extends PSSSignatureSpi {
        public SHA512_256withRSA() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(30821), StubApp.getString2(30299), new MGF1ParameterSpec(StubApp.getString2(30821)), 32, 1));
        }
    }

    public static class SHA512_256withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA512_256withRSAandSHAKE128() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(30821), StubApp.getString2(28183), null, 32, 1));
        }
    }

    public static class SHA512_256withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA512_256withRSAandSHAKE256() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(30821), StubApp.getString2(28184), null, 32, 1));
        }
    }

    public static class SHA512withRSA extends PSSSignatureSpi {
        public SHA512withRSA() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(23705), StubApp.getString2(30299), new MGF1ParameterSpec(StubApp.getString2(23705)), 64, 1));
        }
    }

    public static class SHA512withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA512withRSAandSHAKE128() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(23705), StubApp.getString2(28183), null, 64, 1));
        }
    }

    public static class SHA512withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA512withRSAandSHAKE256() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(23705), StubApp.getString2(28184), null, 64, 1));
        }
    }

    public static class SHAKE128WithRSAPSS extends PSSSignatureSpi {
        public SHAKE128WithRSAPSS() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(28183), StubApp.getString2(28183), null, 32, 1));
        }
    }

    public static class SHAKE256WithRSAPSS extends PSSSignatureSpi {
        public SHAKE256WithRSAPSS() {
            super(new RSABlindedEngine(), new PSSParameterSpec(StubApp.getString2(28184), StubApp.getString2(28184), null, 64, 1));
        }
    }

    public static class nonePSS extends PSSSignatureSpi {
        public nonePSS() {
            super(new RSABlindedEngine(), null, true);
        }
    }

    public PSSSignatureSpi(AsymmetricBlockCipher asymmetricBlockCipher, PSSParameterSpec pSSParameterSpec) {
        this(asymmetricBlockCipher, pSSParameterSpec, false);
    }

    private byte getTrailer(int i3) {
        if (i3 == 1) {
            return PSSSigner.TRAILER_IMPLICIT;
        }
        throw new IllegalArgumentException(StubApp.getString2(30822));
    }

    private void setupContentDigest() {
        Digest digest = DigestFactory.getDigest(this.paramSpec.getDigestAlgorithm());
        this.contentDigest = digest;
        if (this.isRaw) {
            this.contentDigest = new NullPssDigest(digest);
        }
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException(StubApp.getString2(30578));
    }

    @Override // java.security.SignatureSpi
    public AlgorithmParameters engineGetParameters() {
        PSSParameterSpec pSSParameterSpec;
        if (this.engineParams == null && (pSSParameterSpec = this.paramSpec) != null) {
            if (pSSParameterSpec.getDigestAlgorithm().equals(this.paramSpec.getMGFAlgorithm()) && this.paramSpec.getMGFParameters() == null) {
                return null;
            }
            try {
                AlgorithmParameters createAlgorithmParameters = this.helper.createAlgorithmParameters(StubApp.getString2("30318"));
                this.engineParams = createAlgorithmParameters;
                createAlgorithmParameters.init(this.paramSpec);
            } catch (Exception e10) {
                throw new RuntimeException(e10.toString());
            }
        }
        return this.engineParams;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof RSAPrivateKey)) {
            throw new InvalidKeyException(StubApp.getString2(30823));
        }
        this.key = RSAUtil.generatePrivateKeyParameter((RSAPrivateKey) privateKey);
        PSSSigner pSSSigner = new PSSSigner(this.signer, this.contentDigest, this.mgfDigest, this.saltLength, this.trailer);
        this.pss = pSSSigner;
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            pSSSigner.init(true, new ParametersWithRandom(this.key, secureRandom));
        } else {
            pSSSigner.init(true, this.key);
        }
        this.isInitState = true;
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof RSAPublicKey)) {
            throw new InvalidKeyException(StubApp.getString2(30824));
        }
        this.key = RSAUtil.generatePublicKeyParameter((RSAPublicKey) publicKey);
        PSSSigner pSSSigner = new PSSSigner(this.signer, this.contentDigest, this.mgfDigest, this.saltLength, this.trailer);
        this.pss = pSSSigner;
        pSSSigner.init(false, this.key);
        this.isInitState = true;
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException(StubApp.getString2(30579));
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        this.isInitState = true;
        try {
            return this.pss.generateSignature();
        } catch (CryptoException e10) {
            throw new SignatureException(e10.getMessage());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b2) throws SignatureException {
        this.pss.update(b2);
        this.isInitState = false;
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        this.isInitState = true;
        return this.pss.verifySignature(bArr);
    }

    public PSSSignatureSpi(AsymmetricBlockCipher asymmetricBlockCipher, PSSParameterSpec pSSParameterSpec, boolean z2) {
        this.helper = new BCJcaJceHelper();
        this.isInitState = true;
        this.signer = asymmetricBlockCipher;
        this.originalSpec = pSSParameterSpec;
        if (pSSParameterSpec == null) {
            this.paramSpec = PSSParameterSpec.DEFAULT;
        } else {
            this.paramSpec = pSSParameterSpec;
        }
        this.mgfDigest = DigestFactory.getDigest(StubApp.getString2(30299).equals(this.paramSpec.getMGFAlgorithm()) ? this.paramSpec.getDigestAlgorithm() : this.paramSpec.getMGFAlgorithm());
        this.saltLength = this.paramSpec.getSaltLength();
        this.trailer = getTrailer(this.paramSpec.getTrailerField());
        this.isRaw = z2;
        setupContentDigest();
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        this.random = secureRandom;
        engineInitSign(privateKey);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        String digestAlgorithm;
        PSSSigner pSSSigner;
        boolean z2;
        if (algorithmParameterSpec == null && (algorithmParameterSpec = this.originalSpec) == null) {
            return;
        }
        if (!this.isInitState) {
            throw new ProviderException(StubApp.getString2(30830));
        }
        if (!(algorithmParameterSpec instanceof PSSParameterSpec)) {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(30829));
        }
        PSSParameterSpec pSSParameterSpec = (PSSParameterSpec) algorithmParameterSpec;
        PSSParameterSpec pSSParameterSpec2 = this.originalSpec;
        if (pSSParameterSpec2 != null && !DigestFactory.isSameDigest(pSSParameterSpec2.getDigestAlgorithm(), pSSParameterSpec.getDigestAlgorithm())) {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(30825) + this.originalSpec.getDigestAlgorithm());
        }
        if (pSSParameterSpec.getMGFAlgorithm().equalsIgnoreCase(StubApp.getString2(30299)) || pSSParameterSpec.getMGFAlgorithm().equals(PKCSObjectIdentifiers.id_mgf1.getId())) {
            if (!(pSSParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec)) {
                throw new InvalidAlgorithmParameterException(StubApp.getString2(30828));
            }
            MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) pSSParameterSpec.getMGFParameters();
            if (!DigestFactory.isSameDigest(mGF1ParameterSpec.getDigestAlgorithm(), pSSParameterSpec.getDigestAlgorithm())) {
                throw new InvalidAlgorithmParameterException(StubApp.getString2(30827));
            }
            digestAlgorithm = mGF1ParameterSpec.getDigestAlgorithm();
        } else {
            if (!pSSParameterSpec.getMGFAlgorithm().equals(StubApp.getString2(28183)) && !pSSParameterSpec.getMGFAlgorithm().equals(StubApp.getString2(28184))) {
                throw new InvalidAlgorithmParameterException(StubApp.getString2(30734));
            }
            digestAlgorithm = pSSParameterSpec.getMGFAlgorithm();
        }
        Digest digest = DigestFactory.getDigest(digestAlgorithm);
        if (digest == null) {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(30826) + pSSParameterSpec.getMGFAlgorithm());
        }
        this.engineParams = null;
        this.paramSpec = pSSParameterSpec;
        this.mgfDigest = digest;
        this.saltLength = pSSParameterSpec.getSaltLength();
        this.trailer = getTrailer(this.paramSpec.getTrailerField());
        setupContentDigest();
        if (this.key != null) {
            this.pss = new PSSSigner(this.signer, this.contentDigest, digest, this.saltLength, this.trailer);
            if (this.key.isPrivate()) {
                pSSSigner = this.pss;
                z2 = true;
            } else {
                pSSSigner = this.pss;
                z2 = false;
            }
            pSSSigner.init(z2, this.key);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i3, int i10) throws SignatureException {
        this.pss.update(bArr, i3, i10);
        this.isInitState = false;
    }
}
