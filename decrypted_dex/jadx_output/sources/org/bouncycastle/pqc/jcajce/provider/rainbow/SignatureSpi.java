package org.bouncycastle.pqc.jcajce.provider.rainbow;

import com.stub.StubApp;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.legacy.crypto.rainbow.RainbowSigner;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SignatureSpi extends java.security.SignatureSpi {
    private Digest digest;
    private SecureRandom random;
    private RainbowSigner signer;

    public static class withSha224 extends SignatureSpi {
        public withSha224() {
            super(new SHA224Digest(), new RainbowSigner());
        }
    }

    public static class withSha256 extends SignatureSpi {
        public withSha256() {
            super(new SHA256Digest(), new RainbowSigner());
        }
    }

    public static class withSha384 extends SignatureSpi {
        public withSha384() {
            super(new SHA384Digest(), new RainbowSigner());
        }
    }

    public static class withSha512 extends SignatureSpi {
        public withSha512() {
            super(new SHA512Digest(), new RainbowSigner());
        }
    }

    public SignatureSpi(Digest digest, RainbowSigner rainbowSigner) {
        this.digest = digest;
        this.signer = rainbowSigner;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException(StubApp.getString2(30579));
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        CipherParameters generatePrivateKeyParameter = RainbowKeysToParams.generatePrivateKeyParameter(privateKey);
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            generatePrivateKeyParameter = new ParametersWithRandom(generatePrivateKeyParameter, secureRandom);
        }
        this.digest.reset();
        this.signer.init(true, generatePrivateKeyParameter);
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        AsymmetricKeyParameter generatePublicKeyParameter = RainbowKeysToParams.generatePublicKeyParameter(publicKey);
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
            return this.signer.generateSignature(bArr);
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
        return this.signer.verifySignature(bArr2, bArr);
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
