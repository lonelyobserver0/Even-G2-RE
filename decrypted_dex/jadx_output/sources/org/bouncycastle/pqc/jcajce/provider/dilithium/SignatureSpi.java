package org.bouncycastle.pqc.jcajce.provider.dilithium;

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
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumSigner;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SignatureSpi extends Signature {
    private ByteArrayOutputStream bOut;
    private SecureRandom random;
    private DilithiumSigner signer;

    public static class Base extends SignatureSpi {
        public Base() throws NoSuchAlgorithmException {
            super(new DilithiumSigner());
        }
    }

    public SignatureSpi(DilithiumSigner dilithiumSigner) {
        super(StubApp.getString2(34407));
        this.bOut = new ByteArrayOutputStream();
        this.signer = dilithiumSigner;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException(StubApp.getString2(30579));
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof BCDilithiumPrivateKey)) {
            throw new InvalidKeyException(StubApp.getString2(34642));
        }
        DilithiumPrivateKeyParameters keyParams = ((BCDilithiumPrivateKey) privateKey).getKeyParams();
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            this.signer.init(true, new ParametersWithRandom(keyParams, secureRandom));
        } else {
            this.signer.init(true, keyParams);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof BCDilithiumPublicKey)) {
            throw new InvalidKeyException(StubApp.getString2(34643));
        }
        this.signer.init(false, ((BCDilithiumPublicKey) publicKey).getKeyParams());
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
