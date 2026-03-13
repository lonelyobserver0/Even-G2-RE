package org.bouncycastle.pqc.jcajce.provider.qtesla;

import com.stub.StubApp;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.legacy.crypto.qtesla.QTESLASecurityCategory;
import org.bouncycastle.pqc.legacy.crypto.qtesla.QTESLASigner;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SignatureSpi extends Signature {
    private Digest digest;
    private SecureRandom random;
    private QTESLASigner signer;

    public static class PI extends SignatureSpi {
        public PI() {
            super(QTESLASecurityCategory.getName(5), new NullDigest(), new QTESLASigner());
        }
    }

    public static class PIII extends SignatureSpi {
        public PIII() {
            super(QTESLASecurityCategory.getName(6), new NullDigest(), new QTESLASigner());
        }
    }

    public static class qTESLA extends SignatureSpi {
        public qTESLA() {
            super(StubApp.getString2(34701), new NullDigest(), new QTESLASigner());
        }
    }

    public SignatureSpi(String str) {
        super(str);
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException(StubApp.getString2(30579));
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof BCqTESLAPrivateKey)) {
            throw new InvalidKeyException(StubApp.getString2(34703));
        }
        CipherParameters keyParams = ((BCqTESLAPrivateKey) privateKey).getKeyParams();
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            keyParams = new ParametersWithRandom(keyParams, secureRandom);
        }
        this.signer.init(true, keyParams);
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof BCqTESLAPublicKey)) {
            throw new InvalidKeyException(StubApp.getString2(34704));
        }
        CipherParameters keyParams = ((BCqTESLAPublicKey) publicKey).getKeyParams();
        this.digest.reset();
        this.signer.init(false, keyParams);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException(StubApp.getString2(30579));
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        try {
            return this.signer.generateSignature(DigestUtil.getDigestResult(this.digest));
        } catch (Exception e10) {
            if (e10 instanceof IllegalStateException) {
                throw new SignatureException(e10.getMessage());
            }
            throw new SignatureException(e10.toString());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b2) throws SignatureException {
        this.digest.update(b2);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        return this.signer.verifySignature(DigestUtil.getDigestResult(this.digest), bArr);
    }

    public SignatureSpi(String str, Digest digest, QTESLASigner qTESLASigner) {
        super(str);
        this.digest = digest;
        this.signer = qTESLASigner;
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
