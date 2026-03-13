package org.bouncycastle.pqc.jcajce.provider.falcon;

import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.falcon.FalconPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconSigner;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SignatureSpi extends Signature {
    private ByteArrayOutputStream bOut;
    private SecureRandom random;
    private FalconSigner signer;

    public static class Base extends SignatureSpi {
        public Base() throws NoSuchAlgorithmException {
            super(new FalconSigner());
        }
    }

    public SignatureSpi(FalconSigner falconSigner) {
        super(StubApp.getString2(34405));
        this.bOut = new ByteArrayOutputStream();
        this.signer = falconSigner;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException(StubApp.getString2(30579));
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof BCFalconPrivateKey)) {
            throw new InvalidKeyException(StubApp.getString2(34644));
        }
        FalconPrivateKeyParameters keyParams = ((BCFalconPrivateKey) privateKey).getKeyParams();
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            this.signer.init(true, new ParametersWithRandom(keyParams, secureRandom));
        } else {
            this.signer.init(true, keyParams);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof BCFalconPublicKey)) {
            throw new InvalidKeyException(StubApp.getString2(34645));
        }
        this.signer.init(false, ((BCFalconPublicKey) publicKey).getKeyParams());
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException(StubApp.getString2(30579));
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        try {
            byte[] byteArray = this.bOut.toByteArray();
            this.bOut.reset();
            return this.signer.generateSignature(byteArray);
        } catch (Exception e10) {
            throw new SignatureException(e10.toString());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b2) throws SignatureException {
        this.bOut.write(b2);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        byte[] byteArray = this.bOut.toByteArray();
        this.bOut.reset();
        return this.signer.verifySignature(byteArray, bArr);
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
        this.bOut.write(bArr, i3, i10);
    }
}
