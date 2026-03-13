package org.bouncycastle.pqc.jcajce.provider.picnic;

import com.stub.StubApp;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.crypto.picnic.PicnicPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicPublicKeyParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicSigner;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SignatureSpi extends Signature {
    private Digest digest;
    private SecureRandom random;
    private PicnicSigner signer;

    public static class Base extends SignatureSpi {
        public Base() throws NoSuchAlgorithmException {
            super(new NullDigest(), new PicnicSigner());
        }
    }

    public static class withSha3512 extends SignatureSpi {
        public withSha3512() throws NoSuchAlgorithmException {
            super(new SHA3Digest(512), new PicnicSigner());
        }
    }

    public static class withSha512 extends SignatureSpi {
        public withSha512() throws NoSuchAlgorithmException {
            super(new SHA512Digest(), new PicnicSigner());
        }
    }

    public static class withShake256 extends SignatureSpi {
        public withShake256() throws NoSuchAlgorithmException {
            super(new SHAKEDigest(256), new PicnicSigner());
        }
    }

    public SignatureSpi(Digest digest, PicnicSigner picnicSigner) {
        super(StubApp.getString2(28191));
        this.digest = digest;
        this.signer = picnicSigner;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException(StubApp.getString2(30579));
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof BCPicnicPrivateKey)) {
            throw new InvalidKeyException(StubApp.getString2(34699));
        }
        PicnicPrivateKeyParameters keyParams = ((BCPicnicPrivateKey) privateKey).getKeyParams();
        this.digest.reset();
        this.signer.init(true, keyParams);
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof BCPicnicPublicKey)) {
            throw new InvalidKeyException(StubApp.getString2(34700));
        }
        PicnicPublicKeyParameters keyParams = ((BCPicnicPublicKey) publicKey).getKeyParams();
        this.digest.reset();
        this.signer.init(false, keyParams);
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
