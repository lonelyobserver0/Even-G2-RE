package org.bouncycastle.jcajce.provider.asymmetric.util;

import E1.a;
import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class BaseCipherSpi extends CipherSpi {
    private byte[] iv;
    private int ivSize;
    private Class[] availableSpecs = {IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};
    private final JcaJceHelper helper = new BCJcaJceHelper();
    protected AlgorithmParameters engineParams = null;
    protected Wrapper wrapEngine = null;

    public static final class ErasableOutputStream extends ByteArrayOutputStream {
        public void erase() {
            Arrays.fill(((ByteArrayOutputStream) this).buf, (byte) 0);
            reset();
        }

        public byte[] getBuf() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public final AlgorithmParameters createParametersInstance(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return this.helper.createAlgorithmParameters(str);
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        return key.getEncoded().length;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i3) {
        return -1;
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(a.j(StubApp.getString2(30512), str));
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(a.k(StubApp.getString2(30841), str, StubApp.getString2(11660)));
    }

    @Override // javax.crypto.CipherSpi
    public Key engineUnwrap(byte[] bArr, String str, int i3) throws InvalidKeyException {
        String string2 = StubApp.getString2(30842);
        String string22 = StubApp.getString2(30843);
        try {
            Wrapper wrapper = this.wrapEngine;
            byte[] engineDoFinal = wrapper == null ? engineDoFinal(bArr, 0, bArr.length) : wrapper.unwrap(bArr, 0, bArr.length);
            if (i3 == 3) {
                return new SecretKeySpec(engineDoFinal, str);
            }
            if (str.equals("") && i3 == 2) {
                try {
                    PrivateKeyInfo privateKeyInfo = PrivateKeyInfo.getInstance(engineDoFinal);
                    PrivateKey privateKey = BouncyCastleProvider.getPrivateKey(privateKeyInfo);
                    if (privateKey != null) {
                        return privateKey;
                    }
                    throw new InvalidKeyException(string22 + privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm() + StubApp.getString2("17458"));
                } catch (Exception unused) {
                    throw new InvalidKeyException(StubApp.getString2(30844));
                }
            }
            try {
                KeyFactory createKeyFactory = this.helper.createKeyFactory(str);
                if (i3 == 1) {
                    return createKeyFactory.generatePublic(new X509EncodedKeySpec(engineDoFinal));
                }
                if (i3 == 2) {
                    return createKeyFactory.generatePrivate(new PKCS8EncodedKeySpec(engineDoFinal));
                }
                throw new InvalidKeyException(u.p(i3, string2));
            } catch (NoSuchAlgorithmException e10) {
                throw new InvalidKeyException(string2 + e10.getMessage());
            } catch (NoSuchProviderException e11) {
                throw new InvalidKeyException(string2 + e11.getMessage());
            } catch (InvalidKeySpecException e12) {
                throw new InvalidKeyException(string2 + e12.getMessage());
            }
        } catch (BadPaddingException e13) {
            throw new InvalidKeyException(StubApp.getString2(30845)) { // from class: org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi.1
                @Override // java.lang.Throwable
                public synchronized Throwable getCause() {
                    return e13;
                }
            };
        } catch (IllegalBlockSizeException e14) {
            throw new InvalidKeyException(e14.getMessage());
        } catch (InvalidCipherTextException e15) {
            throw new InvalidKeyException(e15.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            throw new InvalidKeyException(StubApp.getString2(30846));
        }
        try {
            Wrapper wrapper = this.wrapEngine;
            return wrapper == null ? engineDoFinal(encoded, 0, encoded.length) : wrapper.wrap(encoded, 0, encoded.length);
        } catch (BadPaddingException e10) {
            throw new IllegalBlockSizeException(e10.getMessage());
        }
    }
}
