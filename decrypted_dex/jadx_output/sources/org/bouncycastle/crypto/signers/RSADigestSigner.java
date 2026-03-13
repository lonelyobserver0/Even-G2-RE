package org.bouncycastle.crypto.signers;

import Xa.h;
import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RSADigestSigner implements Signer {
    private static final Hashtable oidMap;
    private final AlgorithmIdentifier algId;
    private final Digest digest;
    private boolean forSigning;
    private final AsymmetricBlockCipher rsaEngine;

    static {
        Hashtable hashtable = new Hashtable();
        oidMap = hashtable;
        hashtable.put(StubApp.getString2(28185), TeleTrusTObjectIdentifiers.ripemd128);
        hashtable.put(StubApp.getString2(21747), TeleTrusTObjectIdentifiers.ripemd160);
        hashtable.put(StubApp.getString2(28186), TeleTrusTObjectIdentifiers.ripemd256);
        hashtable.put(StubApp.getString2(5778), X509ObjectIdentifiers.id_SHA1);
        hashtable.put(StubApp.getString2(28501), NISTObjectIdentifiers.id_sha224);
        hashtable.put(StubApp.getString2(1488), NISTObjectIdentifiers.id_sha256);
        hashtable.put(StubApp.getString2(23704), NISTObjectIdentifiers.id_sha384);
        hashtable.put(StubApp.getString2(23705), NISTObjectIdentifiers.id_sha512);
        hashtable.put(StubApp.getString2(29286), NISTObjectIdentifiers.id_sha512_224);
        hashtable.put(StubApp.getString2(29285), NISTObjectIdentifiers.id_sha512_256);
        hashtable.put(StubApp.getString2(28174), NISTObjectIdentifiers.id_sha3_224);
        hashtable.put(StubApp.getString2(28175), NISTObjectIdentifiers.id_sha3_256);
        hashtable.put(StubApp.getString2(28176), NISTObjectIdentifiers.id_sha3_384);
        hashtable.put(StubApp.getString2(28177), NISTObjectIdentifiers.id_sha3_512);
        hashtable.put(StubApp.getString2(28179), PKCSObjectIdentifiers.md2);
        hashtable.put(StubApp.getString2(28178), PKCSObjectIdentifiers.md4);
        hashtable.put(StubApp.getString2(4894), PKCSObjectIdentifiers.md5);
    }

    public RSADigestSigner(Digest digest) {
        this(digest, (ASN1ObjectIdentifier) oidMap.get(digest.getAlgorithmName()));
    }

    private byte[] derEncode(byte[] bArr) throws IOException {
        AlgorithmIdentifier algorithmIdentifier = this.algId;
        if (algorithmIdentifier != null) {
            return new DigestInfo(algorithmIdentifier, bArr).getEncoded(StubApp.getString2(26791));
        }
        try {
            DigestInfo.getInstance(bArr);
            return bArr;
        } catch (IllegalArgumentException e10) {
            throw new IOException(h.l(e10, new StringBuilder(StubApp.getString2(29326))));
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws CryptoException, DataLengthException {
        if (!this.forSigning) {
            throw new IllegalStateException(StubApp.getString2(29328));
        }
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        try {
            byte[] derEncode = derEncode(bArr);
            return this.rsaEngine.processBlock(derEncode, 0, derEncode.length);
        } catch (IOException e10) {
            throw new CryptoException(u.q(e10, new StringBuilder(StubApp.getString2(29327))), e10);
        }
    }

    public String getAlgorithmName() {
        return this.digest.getAlgorithmName() + StubApp.getString2(29329);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z2, CipherParameters cipherParameters) {
        this.forSigning = z2;
        AsymmetricKeyParameter asymmetricKeyParameter = cipherParameters instanceof ParametersWithRandom ? (AsymmetricKeyParameter) ((ParametersWithRandom) cipherParameters).getParameters() : (AsymmetricKeyParameter) cipherParameters;
        if (z2 && !asymmetricKeyParameter.isPrivate()) {
            throw new IllegalArgumentException(StubApp.getString2(29312));
        }
        if (!z2 && asymmetricKeyParameter.isPrivate()) {
            throw new IllegalArgumentException(StubApp.getString2(29313));
        }
        reset();
        this.rsaEngine.init(z2, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b2) {
        this.digest.update(b2);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        byte[] processBlock;
        byte[] derEncode;
        if (this.forSigning) {
            throw new IllegalStateException(StubApp.getString2(29330));
        }
        int digestSize = this.digest.getDigestSize();
        byte[] bArr2 = new byte[digestSize];
        this.digest.doFinal(bArr2, 0);
        try {
            processBlock = this.rsaEngine.processBlock(bArr, 0, bArr.length);
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
        int length = (processBlock.length - digestSize) - 2;
        int length2 = (derEncode.length - digestSize) - 2;
        derEncode[1] = (byte) (derEncode[1] - 2);
        derEncode[3] = (byte) (derEncode[3] - 2);
        int i3 = 0;
        for (int i10 = 0; i10 < digestSize; i10++) {
            i3 |= processBlock[length + i10] ^ derEncode[length2 + i10];
        }
        for (int i11 = 0; i11 < length; i11++) {
            i3 |= processBlock[i11] ^ derEncode[i11];
        }
        return i3 == 0;
    }

    public RSADigestSigner(Digest digest, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.rsaEngine = new PKCS1Encoding(new RSABlindedEngine());
        this.digest = digest;
        this.algId = aSN1ObjectIdentifier != null ? new AlgorithmIdentifier(aSN1ObjectIdentifier, DERNull.INSTANCE) : null;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i3, int i10) {
        this.digest.update(bArr, i3, i10);
    }
}
