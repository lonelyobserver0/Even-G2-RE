package org.bouncycastle.pqc.jcajce.provider.mceliece;

import com.stub.StubApp;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.jcajce.provider.util.AsymmetricBlockCipher;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McElieceCipher;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McElieceKeyParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class McEliecePKCSCipherSpi extends AsymmetricBlockCipher implements PKCSObjectIdentifiers, X509ObjectIdentifiers {
    private McElieceCipher cipher;

    public static class McEliecePKCS extends McEliecePKCSCipherSpi {
        public McEliecePKCS() {
            super(new McElieceCipher());
        }
    }

    public McEliecePKCSCipherSpi(McElieceCipher mcElieceCipher) {
        this.cipher = mcElieceCipher;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public int getKeySize(Key key) throws InvalidKeyException {
        return this.cipher.getKeySize((McElieceKeyParameters) (key instanceof PublicKey ? McElieceKeysToParams.generatePublicKeyParameter((PublicKey) key) : McElieceKeysToParams.generatePrivateKeyParameter((PrivateKey) key)));
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public String getName() {
        return StubApp.getString2(34690);
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricBlockCipher
    public void initCipherDecrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.cipher.init(false, McElieceKeysToParams.generatePrivateKeyParameter((PrivateKey) key));
        McElieceCipher mcElieceCipher = this.cipher;
        this.maxPlainTextSize = mcElieceCipher.maxPlainTextSize;
        this.cipherTextSize = mcElieceCipher.cipherTextSize;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricBlockCipher
    public void initCipherEncrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.cipher.init(true, new ParametersWithRandom(McElieceKeysToParams.generatePublicKeyParameter((PublicKey) key), secureRandom));
        McElieceCipher mcElieceCipher = this.cipher;
        this.maxPlainTextSize = mcElieceCipher.maxPlainTextSize;
        this.cipherTextSize = mcElieceCipher.cipherTextSize;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricBlockCipher
    public byte[] messageDecrypt(byte[] bArr) throws IllegalBlockSizeException, BadPaddingException {
        try {
            return this.cipher.messageDecrypt(bArr);
        } catch (Exception e10) {
            throw new IllegalBlockSizeException(e10.getMessage());
        }
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricBlockCipher
    public byte[] messageEncrypt(byte[] bArr) throws IllegalBlockSizeException, BadPaddingException {
        try {
            return this.cipher.messageEncrypt(bArr);
        } catch (Exception e10) {
            throw new IllegalBlockSizeException(e10.getMessage());
        }
    }
}
