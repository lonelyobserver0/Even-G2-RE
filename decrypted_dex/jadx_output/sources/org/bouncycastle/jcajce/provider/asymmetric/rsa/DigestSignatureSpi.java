package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import com.stub.StubApp;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.MD2Digest;
import org.bouncycastle.crypto.digests.MD4Digest;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.crypto.digests.RIPEMD128Digest;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.digests.RIPEMD256Digest;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.util.Arrays;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DigestSignatureSpi extends SignatureSpi {
    private AlgorithmIdentifier algId;
    private AsymmetricBlockCipher cipher;
    private Digest digest;

    public static class MD2 extends DigestSignatureSpi {
        public MD2() {
            super(PKCSObjectIdentifiers.md2, new MD2Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class MD4 extends DigestSignatureSpi {
        public MD4() {
            super(PKCSObjectIdentifiers.md4, new MD4Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class MD5 extends DigestSignatureSpi {
        public MD5() {
            super(PKCSObjectIdentifiers.md5, DigestFactory.createMD5(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class RIPEMD128 extends DigestSignatureSpi {
        public RIPEMD128() {
            super(TeleTrusTObjectIdentifiers.ripemd128, new RIPEMD128Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class RIPEMD160 extends DigestSignatureSpi {
        public RIPEMD160() {
            super(TeleTrusTObjectIdentifiers.ripemd160, new RIPEMD160Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class RIPEMD256 extends DigestSignatureSpi {
        public RIPEMD256() {
            super(TeleTrusTObjectIdentifiers.ripemd256, new RIPEMD256Digest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA1 extends DigestSignatureSpi {
        public SHA1() {
            super(OIWObjectIdentifiers.idSHA1, DigestFactory.createSHA1(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA224 extends DigestSignatureSpi {
        public SHA224() {
            super(NISTObjectIdentifiers.id_sha224, DigestFactory.createSHA224(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA256 extends DigestSignatureSpi {
        public SHA256() {
            super(NISTObjectIdentifiers.id_sha256, DigestFactory.createSHA256(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA384 extends DigestSignatureSpi {
        public SHA384() {
            super(NISTObjectIdentifiers.id_sha384, DigestFactory.createSHA384(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA3_224 extends DigestSignatureSpi {
        public SHA3_224() {
            super(NISTObjectIdentifiers.id_sha3_224, DigestFactory.createSHA3_224(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA3_256 extends DigestSignatureSpi {
        public SHA3_256() {
            super(NISTObjectIdentifiers.id_sha3_256, DigestFactory.createSHA3_256(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA3_384 extends DigestSignatureSpi {
        public SHA3_384() {
            super(NISTObjectIdentifiers.id_sha3_384, DigestFactory.createSHA3_384(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA3_512 extends DigestSignatureSpi {
        public SHA3_512() {
            super(NISTObjectIdentifiers.id_sha3_512, DigestFactory.createSHA3_512(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA512 extends DigestSignatureSpi {
        public SHA512() {
            super(NISTObjectIdentifiers.id_sha512, DigestFactory.createSHA512(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA512_224 extends DigestSignatureSpi {
        public SHA512_224() {
            super(NISTObjectIdentifiers.id_sha512_224, DigestFactory.createSHA512_224(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class SHA512_256 extends DigestSignatureSpi {
        public SHA512_256() {
            super(NISTObjectIdentifiers.id_sha512_256, DigestFactory.createSHA512_256(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class noneRSA extends DigestSignatureSpi {
        public noneRSA() {
            super(new NullDigest(), new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public DigestSignatureSpi(ASN1ObjectIdentifier aSN1ObjectIdentifier, Digest digest, AsymmetricBlockCipher asymmetricBlockCipher) {
        this.digest = digest;
        this.cipher = asymmetricBlockCipher;
        this.algId = new AlgorithmIdentifier(aSN1ObjectIdentifier, DERNull.INSTANCE);
    }

    private byte[] derEncode(byte[] bArr) throws IOException {
        AlgorithmIdentifier algorithmIdentifier = this.algId;
        return algorithmIdentifier == null ? bArr : new DigestInfo(algorithmIdentifier, bArr).getEncoded(StubApp.getString2(26791));
    }

    private String getType(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.getClass().getName();
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        return null;
    }

    @Override // java.security.SignatureSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof RSAPrivateKey)) {
            throw new InvalidKeyException(AbstractC1482f.k(new StringBuilder(StubApp.getString2(30811)), getType(privateKey), StubApp.getString2(30812)));
        }
        RSAKeyParameters generatePrivateKeyParameter = RSAUtil.generatePrivateKeyParameter((RSAPrivateKey) privateKey);
        this.digest.reset();
        this.cipher.init(true, generatePrivateKeyParameter);
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof RSAPublicKey)) {
            throw new InvalidKeyException(AbstractC1482f.k(new StringBuilder(StubApp.getString2(30811)), getType(publicKey), StubApp.getString2(30813)));
        }
        RSAKeyParameters generatePublicKeyParameter = RSAUtil.generatePublicKeyParameter((RSAPublicKey) publicKey);
        this.digest.reset();
        this.cipher.init(false, generatePublicKeyParameter);
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
            byte[] derEncode = derEncode(bArr);
            return this.cipher.processBlock(derEncode, 0, derEncode.length);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new SignatureException(StubApp.getString2(30814));
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
        byte[] processBlock;
        byte[] derEncode;
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        try {
            processBlock = this.cipher.processBlock(bArr, 0, bArr.length);
            derEncode = derEncode(bArr2);
        } catch (Exception unused) {
        }
        if (processBlock.length == derEncode.length) {
            return Arrays.constantTimeAreEqual(processBlock, derEncode);
        }
        if (processBlock.length != derEncode.length - 2) {
            Arrays.constantTimeAreEqual(derEncode, derEncode);
            return false;
        }
        derEncode[1] = (byte) (derEncode[1] - 2);
        byte b2 = (byte) (derEncode[3] - 2);
        derEncode[3] = b2;
        int i3 = b2 + 4;
        int i10 = b2 + 6;
        int i11 = 0;
        for (int i12 = 0; i12 < derEncode.length - i10; i12++) {
            i11 |= processBlock[i3 + i12] ^ derEncode[i10 + i12];
        }
        for (int i13 = 0; i13 < i3; i13++) {
            i11 |= processBlock[i13] ^ derEncode[i13];
        }
        return i11 == 0;
    }

    public DigestSignatureSpi(Digest digest, AsymmetricBlockCipher asymmetricBlockCipher) {
        this.digest = digest;
        this.cipher = asymmetricBlockCipher;
        this.algId = null;
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
