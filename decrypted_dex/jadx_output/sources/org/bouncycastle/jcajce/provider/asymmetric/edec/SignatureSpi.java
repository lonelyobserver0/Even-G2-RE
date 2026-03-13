package org.bouncycastle.jcajce.provider.asymmetric.edec;

import com.stub.StubApp;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.crypto.params.Ed448PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed448PublicKeyParameters;
import org.bouncycastle.crypto.signers.Ed25519Signer;
import org.bouncycastle.crypto.signers.Ed448Signer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SignatureSpi extends java.security.SignatureSpi {
    private static final byte[] EMPTY_CONTEXT = new byte[0];
    private final String algorithm;
    private Signer signer;

    public static final class Ed25519 extends SignatureSpi {
        public Ed25519() {
            super(StubApp.getString2(28196));
        }
    }

    public static final class Ed448 extends SignatureSpi {
        public Ed448() {
            super(StubApp.getString2(28197));
        }
    }

    public static final class EdDSA extends SignatureSpi {
        public EdDSA() {
            super(null);
        }
    }

    public SignatureSpi(String str) {
        this.algorithm = str;
    }

    private static AsymmetricKeyParameter getLwEdDSAKeyPrivate(PrivateKey privateKey) throws InvalidKeyException {
        return EdECUtil.generatePrivateKeyParameter(privateKey);
    }

    private static AsymmetricKeyParameter getLwEdDSAKeyPublic(PublicKey publicKey) throws InvalidKeyException {
        return EdECUtil.generatePublicKeyParameter(publicKey);
    }

    private Signer getSigner(String str) throws InvalidKeyException {
        String str2 = this.algorithm;
        if (str2 == null || str.equals(str2)) {
            return str.equals(StubApp.getString2(28197)) ? new Ed448Signer(EMPTY_CONTEXT) : new Ed25519Signer();
        }
        throw new InvalidKeyException(StubApp.getString2(30698) + this.algorithm);
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) throws InvalidParameterException {
        throw new UnsupportedOperationException(StubApp.getString2(30578));
    }

    @Override // java.security.SignatureSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        String string2;
        AsymmetricKeyParameter lwEdDSAKeyPrivate = getLwEdDSAKeyPrivate(privateKey);
        if (lwEdDSAKeyPrivate instanceof Ed25519PrivateKeyParameters) {
            string2 = StubApp.getString2(28196);
        } else {
            if (!(lwEdDSAKeyPrivate instanceof Ed448PrivateKeyParameters)) {
                throw new IllegalStateException(StubApp.getString2(30700));
            }
            string2 = StubApp.getString2(28197);
        }
        this.signer = getSigner(string2);
        this.signer.init(true, lwEdDSAKeyPrivate);
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        String string2;
        AsymmetricKeyParameter lwEdDSAKeyPublic = getLwEdDSAKeyPublic(publicKey);
        if (lwEdDSAKeyPublic instanceof Ed25519PublicKeyParameters) {
            string2 = StubApp.getString2(28196);
        } else {
            if (!(lwEdDSAKeyPublic instanceof Ed448PublicKeyParameters)) {
                throw new IllegalStateException(StubApp.getString2(30719));
            }
            string2 = StubApp.getString2(28197);
        }
        this.signer = getSigner(string2);
        this.signer.init(false, lwEdDSAKeyPublic);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) throws InvalidParameterException {
        throw new UnsupportedOperationException(StubApp.getString2(30579));
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        try {
            return this.signer.generateSignature();
        } catch (CryptoException e10) {
            throw new SignatureException(e10.getMessage());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b2) throws SignatureException {
        this.signer.update(b2);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        return this.signer.verifySignature(bArr);
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i3, int i10) throws SignatureException {
        this.signer.update(bArr, i3, i10);
    }
}
