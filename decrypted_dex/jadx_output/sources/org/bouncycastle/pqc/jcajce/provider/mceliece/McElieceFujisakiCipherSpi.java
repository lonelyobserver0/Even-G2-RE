package org.bouncycastle.pqc.jcajce.provider.mceliece;

import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McElieceCCA2KeyParameters;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McElieceFujisakiCipher;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class McElieceFujisakiCipherSpi extends AsymmetricHybridCipher implements PKCSObjectIdentifiers, X509ObjectIdentifiers {
    private ByteArrayOutputStream buf = new ByteArrayOutputStream();
    private McElieceFujisakiCipher cipher;
    private Digest digest;

    public static class McElieceFujisaki extends McElieceFujisakiCipherSpi {
        public McElieceFujisaki() {
            super(DigestFactory.createSHA1(), new McElieceFujisakiCipher());
        }
    }

    public McElieceFujisakiCipherSpi(Digest digest, McElieceFujisakiCipher mcElieceFujisakiCipher) {
        this.digest = digest;
        this.cipher = mcElieceFujisakiCipher;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    public int decryptOutputSize(int i3) {
        return 0;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher, org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public byte[] doFinal(byte[] bArr, int i3, int i10) throws BadPaddingException {
        update(bArr, i3, i10);
        byte[] byteArray = this.buf.toByteArray();
        this.buf.reset();
        int i11 = this.opMode;
        if (i11 == 1) {
            return this.cipher.messageEncrypt(byteArray);
        }
        if (i11 != 2) {
            throw new IllegalStateException(StubApp.getString2(34683));
        }
        try {
            return this.cipher.messageDecrypt(byteArray);
        } catch (InvalidCipherTextException e10) {
            throw new BadPaddingException(e10.getMessage());
        }
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    public int encryptOutputSize(int i3) {
        return 0;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public int getKeySize(Key key) throws InvalidKeyException {
        return this.cipher.getKeySize((McElieceCCA2KeyParameters) (key instanceof PublicKey ? McElieceCCA2KeysToParams.generatePublicKeyParameter((PublicKey) key) : McElieceCCA2KeysToParams.generatePrivateKeyParameter((PrivateKey) key)));
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public String getName() {
        return StubApp.getString2(34684);
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    public void initCipherDecrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AsymmetricKeyParameter generatePrivateKeyParameter = McElieceCCA2KeysToParams.generatePrivateKeyParameter((PrivateKey) key);
        this.digest.reset();
        this.cipher.init(false, generatePrivateKeyParameter);
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    public void initCipherEncrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        ParametersWithRandom parametersWithRandom = new ParametersWithRandom(McElieceCCA2KeysToParams.generatePublicKeyParameter((PublicKey) key), secureRandom);
        this.digest.reset();
        this.cipher.init(true, parametersWithRandom);
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher, org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public byte[] update(byte[] bArr, int i3, int i10) {
        this.buf.write(bArr, i3, i10);
        return new byte[0];
    }
}
