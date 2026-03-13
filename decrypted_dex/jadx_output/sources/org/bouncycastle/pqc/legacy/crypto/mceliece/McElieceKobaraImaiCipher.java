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
import org.bouncycastle.pqc.legacy.math.linearalgebra.IntegerFunctions;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class McElieceKobaraImaiCipher implements MessageEncryptor {
    private static final String DEFAULT_PRNG_NAME = StubApp.getString2(34781);
    public static final String OID = StubApp.getString2(34784);
    public static final byte[] PUBLIC_CONSTANT = StubApp.getString2(34783).getBytes();
    private boolean forEncryption;

    /* renamed from: k, reason: collision with root package name */
    private int f19534k;
    McElieceCCA2KeyParameters key;
    private Digest messDigest;

    /* renamed from: n, reason: collision with root package name */
    private int f19535n;
    private SecureRandom sr;

    /* renamed from: t, reason: collision with root package name */
    private int f19536t;

    private void initCipherDecrypt(McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters) {
        this.messDigest = Utils.getDigest(mcElieceCCA2PrivateKeyParameters.getDigest());
        this.f19535n = mcElieceCCA2PrivateKeyParameters.getN();
        this.f19534k = mcElieceCCA2PrivateKeyParameters.getK();
        this.f19536t = mcElieceCCA2PrivateKeyParameters.getT();
    }

    private void initCipherEncrypt(McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters) {
        this.messDigest = Utils.getDigest(mcElieceCCA2PublicKeyParameters.getDigest());
        this.f19535n = mcElieceCCA2PublicKeyParameters.getN();
        this.f19534k = mcElieceCCA2PublicKeyParameters.getK();
        this.f19536t = mcElieceCCA2PublicKeyParameters.getT();
    }

    public int getKeySize(McElieceCCA2KeyParameters mcElieceCCA2KeyParameters) {
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
        byte[] bArr2;
        if (this.forEncryption) {
            throw new IllegalStateException(StubApp.getString2(34780));
        }
        int i3 = this.f19535n >> 3;
        if (bArr.length < i3) {
            throw new InvalidCipherTextException(StubApp.getString2(34785));
        }
        int digestSize = this.messDigest.getDigestSize();
        int i10 = this.f19534k >> 3;
        int bitLength = (IntegerFunctions.binomial(this.f19535n, this.f19536t).bitLength() - 1) >> 3;
        int length = bArr.length - i3;
        if (length > 0) {
            byte[][] split = ByteUtils.split(bArr, length);
            bArr2 = split[0];
            bArr = split[1];
        } else {
            bArr2 = new byte[0];
        }
        GF2Vector[] decryptionPrimitive = McElieceCCA2Primitives.decryptionPrimitive((McElieceCCA2PrivateKeyParameters) this.key, GF2Vector.OS2VP(this.f19535n, bArr));
        byte[] encoded = decryptionPrimitive[0].getEncoded();
        GF2Vector gF2Vector = decryptionPrimitive[1];
        if (encoded.length > i10) {
            encoded = ByteUtils.subArray(encoded, 0, i10);
        }
        byte[] decode = Conversions.decode(this.f19535n, this.f19536t, gF2Vector);
        if (decode.length < bitLength) {
            byte[] bArr3 = new byte[bitLength];
            System.arraycopy(decode, 0, bArr3, bitLength - decode.length, decode.length);
            decode = bArr3;
        }
        byte[] concatenate = ByteUtils.concatenate(ByteUtils.concatenate(bArr2, decode), encoded);
        int length2 = concatenate.length - digestSize;
        byte[][] split2 = ByteUtils.split(concatenate, digestSize);
        byte[] bArr4 = split2[0];
        byte[] bArr5 = split2[1];
        byte[] bArr6 = new byte[this.messDigest.getDigestSize()];
        this.messDigest.update(bArr5, 0, bArr5.length);
        this.messDigest.doFinal(bArr6, 0);
        for (int i11 = digestSize - 1; i11 >= 0; i11--) {
            bArr6[i11] = (byte) (bArr6[i11] ^ bArr4[i11]);
        }
        DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator(new SHA1Digest());
        digestRandomGenerator.addSeedMaterial(bArr6);
        byte[] bArr7 = new byte[length2];
        digestRandomGenerator.nextBytes(bArr7);
        for (int i12 = length2 - 1; i12 >= 0; i12--) {
            bArr7[i12] = (byte) (bArr7[i12] ^ bArr5[i12]);
        }
        byte[] bArr8 = PUBLIC_CONSTANT;
        byte[][] split3 = ByteUtils.split(bArr7, length2 - bArr8.length);
        byte[] bArr9 = split3[0];
        if (ByteUtils.equals(split3[1], bArr8)) {
            return bArr9;
        }
        throw new InvalidCipherTextException(StubApp.getString2(34778));
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public byte[] messageEncrypt(byte[] bArr) {
        if (!this.forEncryption) {
            throw new IllegalStateException(StubApp.getString2(34780));
        }
        int digestSize = this.messDigest.getDigestSize();
        int i3 = this.f19534k >> 3;
        int bitLength = (IntegerFunctions.binomial(this.f19535n, this.f19536t).bitLength() - 1) >> 3;
        byte[] bArr2 = PUBLIC_CONSTANT;
        int length = ((i3 + bitLength) - digestSize) - bArr2.length;
        if (bArr.length > length) {
            length = bArr.length;
        }
        int length2 = bArr2.length + length;
        int i10 = ((length2 + digestSize) - i3) - bitLength;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, length, bArr2.length);
        byte[] bArr4 = new byte[digestSize];
        this.sr.nextBytes(bArr4);
        DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator(new SHA1Digest());
        digestRandomGenerator.addSeedMaterial(bArr4);
        byte[] bArr5 = new byte[length2];
        digestRandomGenerator.nextBytes(bArr5);
        for (int i11 = length2 - 1; i11 >= 0; i11--) {
            bArr5[i11] = (byte) (bArr5[i11] ^ bArr3[i11]);
        }
        byte[] bArr6 = new byte[this.messDigest.getDigestSize()];
        this.messDigest.update(bArr5, 0, length2);
        this.messDigest.doFinal(bArr6, 0);
        for (int i12 = digestSize - 1; i12 >= 0; i12--) {
            bArr6[i12] = (byte) (bArr6[i12] ^ bArr4[i12]);
        }
        byte[] concatenate = ByteUtils.concatenate(bArr6, bArr5);
        byte[] bArr7 = new byte[0];
        if (i10 > 0) {
            bArr7 = new byte[i10];
            System.arraycopy(concatenate, 0, bArr7, 0, i10);
        }
        byte[] bArr8 = new byte[bitLength];
        System.arraycopy(concatenate, i10, bArr8, 0, bitLength);
        byte[] bArr9 = new byte[i3];
        System.arraycopy(concatenate, bitLength + i10, bArr9, 0, i3);
        byte[] encoded = McElieceCCA2Primitives.encryptionPrimitive((McElieceCCA2PublicKeyParameters) this.key, GF2Vector.OS2VP(this.f19534k, bArr9), Conversions.encode(this.f19535n, this.f19536t, bArr8)).getEncoded();
        return i10 > 0 ? ByteUtils.concatenate(bArr7, encoded) : encoded;
    }
}
