package org.bouncycastle.pqc.legacy.crypto.mceliece;

import com.stub.StubApp;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.prng.DigestRandomGenerator;
import org.bouncycastle.pqc.crypto.MessageEncryptor;
import org.bouncycastle.pqc.legacy.math.linearalgebra.ByteUtils;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Vector;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class McEliecePointchevalCipher implements MessageEncryptor {
    public static final String OID = StubApp.getString2(34787);
    private boolean forEncryption;

    /* renamed from: k, reason: collision with root package name */
    private int f19540k;
    McElieceCCA2KeyParameters key;
    private Digest messDigest;

    /* renamed from: n, reason: collision with root package name */
    private int f19541n;
    private SecureRandom sr;

    /* renamed from: t, reason: collision with root package name */
    private int f19542t;

    private void initCipherDecrypt(McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters) {
        this.messDigest = Utils.getDigest(mcElieceCCA2PrivateKeyParameters.getDigest());
        this.f19541n = mcElieceCCA2PrivateKeyParameters.getN();
        this.f19540k = mcElieceCCA2PrivateKeyParameters.getK();
        this.f19542t = mcElieceCCA2PrivateKeyParameters.getT();
    }

    private void initCipherEncrypt(McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters) {
        this.messDigest = Utils.getDigest(mcElieceCCA2PublicKeyParameters.getDigest());
        this.f19541n = mcElieceCCA2PublicKeyParameters.getN();
        this.f19540k = mcElieceCCA2PublicKeyParameters.getK();
        this.f19542t = mcElieceCCA2PublicKeyParameters.getT();
    }

    public int decryptOutputSize(int i3) {
        return 0;
    }

    public int encryptOutputSize(int i3) {
        return 0;
    }

    public int getKeySize(McElieceCCA2KeyParameters mcElieceCCA2KeyParameters) throws IllegalArgumentException {
        if (mcElieceCCA2KeyParameters instanceof McElieceCCA2PublicKeyParameters) {
            return ((McElieceCCA2PublicKeyParameters) mcElieceCCA2KeyParameters).getN();
        }
        if (mcElieceCCA2KeyParameters instanceof McElieceCCA2PrivateKeyParameters) {
            return ((McElieceCCA2PrivateKeyParameters) mcElieceCCA2KeyParameters).getN();
        }
        throw new IllegalArgumentException(StubApp.getString2(34779));
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public void init(boolean z2, CipherParameters cipherParameters) {
        this.forEncryption = z2;
        if (!z2) {
            McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters = (McElieceCCA2PrivateKeyParameters) cipherParameters;
            this.key = mcElieceCCA2PrivateKeyParameters;
            initCipherDecrypt(mcElieceCCA2PrivateKeyParameters);
        } else {
            if (!(cipherParameters instanceof ParametersWithRandom)) {
                this.sr = CryptoServicesRegistrar.getSecureRandom();
                McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters = (McElieceCCA2PublicKeyParameters) cipherParameters;
                this.key = mcElieceCCA2PublicKeyParameters;
                initCipherEncrypt(mcElieceCCA2PublicKeyParameters);
                return;
            }
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.sr = parametersWithRandom.getRandom();
            McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters2 = (McElieceCCA2PublicKeyParameters) parametersWithRandom.getParameters();
            this.key = mcElieceCCA2PublicKeyParameters2;
            initCipherEncrypt(mcElieceCCA2PublicKeyParameters2);
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public byte[] messageDecrypt(byte[] bArr) throws InvalidCipherTextException {
        if (this.forEncryption) {
            throw new IllegalStateException(StubApp.getString2(34780));
        }
        int i3 = (this.f19541n + 7) >> 3;
        int length = bArr.length - i3;
        byte[][] split = ByteUtils.split(bArr, i3);
        byte[] bArr2 = split[0];
        byte[] bArr3 = split[1];
        GF2Vector[] decryptionPrimitive = McElieceCCA2Primitives.decryptionPrimitive((McElieceCCA2PrivateKeyParameters) this.key, GF2Vector.OS2VP(this.f19541n, bArr2));
        byte[] encoded = decryptionPrimitive[0].getEncoded();
        GF2Vector gF2Vector = decryptionPrimitive[1];
        DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator(new SHA1Digest());
        digestRandomGenerator.addSeedMaterial(encoded);
        byte[] bArr4 = new byte[length];
        digestRandomGenerator.nextBytes(bArr4);
        for (int i10 = 0; i10 < length; i10++) {
            bArr4[i10] = (byte) (bArr4[i10] ^ bArr3[i10]);
        }
        this.messDigest.update(bArr4, 0, length);
        byte[] bArr5 = new byte[this.messDigest.getDigestSize()];
        this.messDigest.doFinal(bArr5, 0);
        if (Conversions.encode(this.f19541n, this.f19542t, bArr5).equals(gF2Vector)) {
            return ByteUtils.split(bArr4, length - (this.f19540k >> 3))[0];
        }
        throw new InvalidCipherTextException(StubApp.getString2(34786));
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public byte[] messageEncrypt(byte[] bArr) {
        if (!this.forEncryption) {
            throw new IllegalStateException(StubApp.getString2(34780));
        }
        int i3 = this.f19540k >> 3;
        byte[] bArr2 = new byte[i3];
        this.sr.nextBytes(bArr2);
        GF2Vector gF2Vector = new GF2Vector(this.f19540k, this.sr);
        byte[] encoded = gF2Vector.getEncoded();
        byte[] concatenate = ByteUtils.concatenate(bArr, bArr2);
        this.messDigest.update(concatenate, 0, concatenate.length);
        byte[] bArr3 = new byte[this.messDigest.getDigestSize()];
        this.messDigest.doFinal(bArr3, 0);
        byte[] encoded2 = McElieceCCA2Primitives.encryptionPrimitive((McElieceCCA2PublicKeyParameters) this.key, gF2Vector, Conversions.encode(this.f19541n, this.f19542t, bArr3)).getEncoded();
        DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator(new SHA1Digest());
        digestRandomGenerator.addSeedMaterial(encoded);
        byte[] bArr4 = new byte[bArr.length + i3];
        digestRandomGenerator.nextBytes(bArr4);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr4[i10] = (byte) (bArr4[i10] ^ bArr[i10]);
        }
        for (int i11 = 0; i11 < i3; i11++) {
            int length = bArr.length + i11;
            bArr4[length] = (byte) (bArr4[length] ^ bArr2[i11]);
        }
        return ByteUtils.concatenate(encoded2, bArr4);
    }
}
