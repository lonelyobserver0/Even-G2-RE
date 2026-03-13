package org.bouncycastle.pqc.jcajce.provider.hqc;

import E1.a;
import Xa.h;
import com.stub.StubApp;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.DestroyFailedException;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.jcajce.spec.KEMParameterSpec;
import org.bouncycastle.pqc.crypto.hqc.HQCKEMExtractor;
import org.bouncycastle.pqc.crypto.hqc.HQCKEMGenerator;
import org.bouncycastle.pqc.jcajce.provider.util.WrapUtil;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Exceptions;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class HQCCipherSpi extends CipherSpi {
    private final String algorithmName;
    private AlgorithmParameters engineParams;
    private HQCKEMGenerator kemGen;
    private KEMParameterSpec kemParameterSpec;
    private SecureRandom random;
    private BCHQCPrivateKey unwrapKey;
    private BCHQCPublicKey wrapKey;

    public static class Base extends HQCCipherSpi {
        public Base() throws NoSuchAlgorithmException {
            super(StubApp.getString2(34398));
        }
    }

    public HQCCipherSpi(String str) throws NoSuchAlgorithmException {
        this.algorithmName = str;
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        throw new IllegalStateException(StubApp.getString2(34620));
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
        return 2048;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i3) {
        return -1;
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null) {
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(this.algorithmName, StubApp.getString2("34410"));
                this.engineParams = algorithmParameters;
                algorithmParameters.init(this.kemParameterSpec);
            } catch (Exception e10) {
                throw Exceptions.illegalStateException(e10.toString(), e10);
            }
        }
        return this.engineParams;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i3, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(KEMParameterSpec.class);
            } catch (Exception unused) {
                throw new InvalidAlgorithmParameterException(StubApp.getString2(32365) + algorithmParameters.toString());
            }
        } else {
            parameterSpec = null;
        }
        engineInit(i3, key, parameterSpec, this.random);
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(a.j(StubApp.getString2(34626), str));
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(a.k(StubApp.getString2(30841), str, StubApp.getString2(34627)));
    }

    @Override // javax.crypto.CipherSpi
    public Key engineUnwrap(byte[] bArr, String str, int i3) throws InvalidKeyException, NoSuchAlgorithmException {
        String string2 = StubApp.getString2(34628);
        if (i3 != 3) {
            throw new InvalidKeyException(StubApp.getString2(34629));
        }
        try {
            HQCKEMExtractor hQCKEMExtractor = new HQCKEMExtractor(this.unwrapKey.getKeyParams());
            byte[] extractSecret = hQCKEMExtractor.extractSecret(Arrays.copyOfRange(bArr, 0, hQCKEMExtractor.getEncapsulationLength()));
            Wrapper wrapper = WrapUtil.getWrapper(this.kemParameterSpec.getKeyAlgorithmName());
            KeyParameter keyParameter = new KeyParameter(extractSecret);
            Arrays.clear(extractSecret);
            wrapper.init(false, keyParameter);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, hQCKEMExtractor.getEncapsulationLength(), bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(wrapper.unwrap(copyOfRange, 0, copyOfRange.length), str);
            Arrays.clear(keyParameter.getKey());
            return secretKeySpec;
        } catch (IllegalArgumentException e10) {
            throw new NoSuchAlgorithmException(h.l(e10, new StringBuilder(string2)));
        } catch (InvalidCipherTextException e11) {
            throw new InvalidKeyException(string2 + e11.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws ShortBufferException {
        throw new IllegalStateException(StubApp.getString2(34620));
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        if (key.getEncoded() == null) {
            throw new InvalidKeyException(StubApp.getString2(30846));
        }
        try {
            SecretWithEncapsulation generateEncapsulated = this.kemGen.generateEncapsulated(this.wrapKey.getKeyParams());
            Wrapper wrapper = WrapUtil.getWrapper(this.kemParameterSpec.getKeyAlgorithmName());
            wrapper.init(true, new KeyParameter(generateEncapsulated.getSecret()));
            byte[] encapsulation = generateEncapsulated.getEncapsulation();
            generateEncapsulated.destroy();
            byte[] encoded = key.getEncoded();
            byte[] concatenate = Arrays.concatenate(encapsulation, wrapper.wrap(encoded, 0, encoded.length));
            Arrays.clear(encoded);
            return concatenate;
        } catch (IllegalArgumentException e10) {
            throw new IllegalBlockSizeException(h.l(e10, new StringBuilder(StubApp.getString2(34631))));
        } catch (DestroyFailedException e11) {
            throw new IllegalBlockSizeException(StubApp.getString2(34630) + e11.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i3, int i10) throws IllegalBlockSizeException, BadPaddingException {
        throw new IllegalStateException(StubApp.getString2(34620));
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i3, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i3, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e10) {
            throw Exceptions.illegalArgumentException(e10.getMessage(), e10);
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i3, int i10) {
        throw new IllegalStateException(StubApp.getString2(34620));
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i3, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        KEMParameterSpec kEMParameterSpec;
        if (secureRandom == null) {
            this.random = CryptoServicesRegistrar.getSecureRandom();
        }
        if (algorithmParameterSpec == null) {
            kEMParameterSpec = new KEMParameterSpec(StubApp.getString2(34621));
        } else {
            if (!(algorithmParameterSpec instanceof KEMParameterSpec)) {
                throw new InvalidAlgorithmParameterException(AbstractC1482f.k(new StringBuilder(), this.algorithmName, StubApp.getString2(34625)));
            }
            kEMParameterSpec = (KEMParameterSpec) algorithmParameterSpec;
        }
        this.kemParameterSpec = kEMParameterSpec;
        if (i3 == 3) {
            if (!(key instanceof BCHQCPublicKey)) {
                throw new InvalidKeyException(StubApp.getString2(34622));
            }
            this.wrapKey = (BCHQCPublicKey) key;
            this.kemGen = new HQCKEMGenerator(secureRandom);
            return;
        }
        if (i3 != 4) {
            throw new InvalidParameterException(StubApp.getString2(34624));
        }
        if (!(key instanceof BCHQCPrivateKey)) {
            throw new InvalidKeyException(StubApp.getString2(34623));
        }
        this.unwrapKey = (BCHQCPrivateKey) key;
    }
}
