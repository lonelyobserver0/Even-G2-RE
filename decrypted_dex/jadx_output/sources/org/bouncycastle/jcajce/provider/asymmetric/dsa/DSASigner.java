package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import com.stub.StubApp;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DSAExt;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.signers.DSAEncoding;
import org.bouncycastle.crypto.signers.HMacDSAKCalculator;
import org.bouncycastle.crypto.signers.StandardDSAEncoding;
import org.bouncycastle.crypto.util.DigestFactory;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DSASigner extends SignatureSpi implements PKCSObjectIdentifiers, X509ObjectIdentifiers {
    private Digest digest;
    private DSAEncoding encoding = StandardDSAEncoding.INSTANCE;
    private SecureRandom random;
    private DSAExt signer;

    public static class detDSA extends DSASigner {
        public detDSA() {
            super(DigestFactory.createSHA1(), new org.bouncycastle.crypto.signers.DSASigner(new HMacDSAKCalculator(DigestFactory.createSHA1())));
        }
    }

    public static class detDSA224 extends DSASigner {
        public detDSA224() {
            super(DigestFactory.createSHA224(), new org.bouncycastle.crypto.signers.DSASigner(new HMacDSAKCalculator(DigestFactory.createSHA224())));
        }
    }

    public static class detDSA256 extends DSASigner {
        public detDSA256() {
            super(DigestFactory.createSHA256(), new org.bouncycastle.crypto.signers.DSASigner(new HMacDSAKCalculator(DigestFactory.createSHA256())));
        }
    }

    public static class detDSA384 extends DSASigner {
        public detDSA384() {
            super(DigestFactory.createSHA384(), new org.bouncycastle.crypto.signers.DSASigner(new HMacDSAKCalculator(DigestFactory.createSHA384())));
        }
    }

    public static class detDSA512 extends DSASigner {
        public detDSA512() {
            super(DigestFactory.createSHA512(), new org.bouncycastle.crypto.signers.DSASigner(new HMacDSAKCalculator(DigestFactory.createSHA512())));
        }
    }

    public static class detDSASha3_224 extends DSASigner {
        public detDSASha3_224() {
            super(DigestFactory.createSHA3_224(), new org.bouncycastle.crypto.signers.DSASigner(new HMacDSAKCalculator(DigestFactory.createSHA3_224())));
        }
    }

    public static class detDSASha3_256 extends DSASigner {
        public detDSASha3_256() {
            super(DigestFactory.createSHA3_256(), new org.bouncycastle.crypto.signers.DSASigner(new HMacDSAKCalculator(DigestFactory.createSHA3_256())));
        }
    }

    public static class detDSASha3_384 extends DSASigner {
        public detDSASha3_384() {
            super(DigestFactory.createSHA3_384(), new org.bouncycastle.crypto.signers.DSASigner(new HMacDSAKCalculator(DigestFactory.createSHA3_384())));
        }
    }

    public static class detDSASha3_512 extends DSASigner {
        public detDSASha3_512() {
            super(DigestFactory.createSHA3_512(), new org.bouncycastle.crypto.signers.DSASigner(new HMacDSAKCalculator(DigestFactory.createSHA3_512())));
        }
    }

    public static class dsa224 extends DSASigner {
        public dsa224() {
            super(DigestFactory.createSHA224(), new org.bouncycastle.crypto.signers.DSASigner());
        }
    }

    public static class dsa256 extends DSASigner {
        public dsa256() {
            super(DigestFactory.createSHA256(), new org.bouncycastle.crypto.signers.DSASigner());
        }
    }

    public static class dsa384 extends DSASigner {
        public dsa384() {
            super(DigestFactory.createSHA384(), new org.bouncycastle.crypto.signers.DSASigner());
        }
    }

    public static class dsa512 extends DSASigner {
        public dsa512() {
            super(DigestFactory.createSHA512(), new org.bouncycastle.crypto.signers.DSASigner());
        }
    }

    public static class dsaRMD160 extends DSASigner {
        public dsaRMD160() {
            super(new RIPEMD160Digest(), new org.bouncycastle.crypto.signers.DSASigner());
        }
    }

    public static class dsaSha3_224 extends DSASigner {
        public dsaSha3_224() {
            super(DigestFactory.createSHA3_224(), new org.bouncycastle.crypto.signers.DSASigner());
        }
    }

    public static class dsaSha3_256 extends DSASigner {
        public dsaSha3_256() {
            super(DigestFactory.createSHA3_256(), new org.bouncycastle.crypto.signers.DSASigner());
        }
    }

    public static class dsaSha3_384 extends DSASigner {
        public dsaSha3_384() {
            super(DigestFactory.createSHA3_384(), new org.bouncycastle.crypto.signers.DSASigner());
        }
    }

    public static class dsaSha3_512 extends DSASigner {
        public dsaSha3_512() {
            super(DigestFactory.createSHA3_512(), new org.bouncycastle.crypto.signers.DSASigner());
        }
    }

    public static class noneDSA extends DSASigner {
        public noneDSA() {
            super(new NullDigest(), new org.bouncycastle.crypto.signers.DSASigner());
        }
    }

    public static class stdDSA extends DSASigner {
        public stdDSA() {
            super(DigestFactory.createSHA1(), new org.bouncycastle.crypto.signers.DSASigner());
        }
    }

    public DSASigner(Digest digest, DSAExt dSAExt) {
        this.digest = digest;
        this.signer = dSAExt;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException(StubApp.getString2(30578));
    }

    @Override // java.security.SignatureSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        CipherParameters generatePrivateKeyParameter = DSAUtil.generatePrivateKeyParameter(privateKey);
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            generatePrivateKeyParameter = new ParametersWithRandom(generatePrivateKeyParameter, secureRandom);
        }
        this.digest.reset();
        this.signer.init(true, generatePrivateKeyParameter);
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        AsymmetricKeyParameter generatePublicKeyParameter = DSAUtil.generatePublicKeyParameter(publicKey);
        this.digest.reset();
        this.signer.init(false, generatePublicKeyParameter);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException(StubApp.getString2(30579));
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        try {
            BigInteger[] generateSignature = this.signer.generateSignature(bArr);
            return this.encoding.encode(this.signer.getOrder(), generateSignature[0], generateSignature[1]);
        } catch (Exception e10) {
            throw new SignatureException(e10.toString());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b2) throws SignatureException {
        this.digest.update(b2);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        try {
            BigInteger[] decode = this.encoding.decode(this.signer.getOrder(), bArr);
            return this.signer.verifySignature(bArr2, decode[0], decode[1]);
        } catch (Exception unused) {
            throw new SignatureException(StubApp.getString2(30580));
        }
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        this.random = secureRandom;
        engineInitSign(privateKey);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException(StubApp.getString2(30579));
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i3, int i10) throws SignatureException {
        this.digest.update(bArr, i3, i10);
    }
}
