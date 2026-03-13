package org.bouncycastle.pqc.legacy.crypto.mceliece;

import com.stub.StubApp;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageEncryptor;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Vector;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GoppaCode;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.legacy.math.linearalgebra.PolynomialGF2mSmallM;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class McElieceCipher implements MessageEncryptor {
    public static final String OID = StubApp.getString2(34685);
    public int cipherTextSize;
    private boolean forEncryption;

    /* renamed from: k, reason: collision with root package name */
    private int f19525k;
    private McElieceKeyParameters key;
    public int maxPlainTextSize;

    /* renamed from: n, reason: collision with root package name */
    private int f19526n;
    private SecureRandom sr;

    /* renamed from: t, reason: collision with root package name */
    private int f19527t;

    private byte[] computeMessage(GF2Vector gF2Vector) throws InvalidCipherTextException {
        byte[] encoded = gF2Vector.getEncoded();
        int length = encoded.length - 1;
        while (length >= 0 && encoded[length] == 0) {
            length--;
        }
        if (length < 0 || encoded[length] != 1) {
            throw new InvalidCipherTextException(StubApp.getString2(34778));
        }
        byte[] bArr = new byte[length];
        System.arraycopy(encoded, 0, bArr, 0, length);
        return bArr;
    }

    private GF2Vector computeMessageRepresentative(byte[] bArr) {
        byte[] bArr2 = new byte[this.maxPlainTextSize + ((this.f19525k & 7) != 0 ? 1 : 0)];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[bArr.length] = 1;
        return GF2Vector.OS2VP(this.f19525k, bArr2);
    }

    private void initCipherDecrypt(McEliecePrivateKeyParameters mcEliecePrivateKeyParameters) {
        this.f19526n = mcEliecePrivateKeyParameters.getN();
        int k3 = mcEliecePrivateKeyParameters.getK();
        this.f19525k = k3;
        this.maxPlainTextSize = k3 >> 3;
        this.cipherTextSize = this.f19526n >> 3;
    }

    private void initCipherEncrypt(McEliecePublicKeyParameters mcEliecePublicKeyParameters) {
        this.f19526n = mcEliecePublicKeyParameters.getN();
        this.f19525k = mcEliecePublicKeyParameters.getK();
        this.f19527t = mcEliecePublicKeyParameters.getT();
        this.cipherTextSize = this.f19526n >> 3;
        this.maxPlainTextSize = this.f19525k >> 3;
    }

    public int getKeySize(McElieceKeyParameters mcElieceKeyParameters) {
        if (mcElieceKeyParameters instanceof McEliecePublicKeyParameters) {
            return ((McEliecePublicKeyParameters) mcElieceKeyParameters).getN();
        }
        if (mcElieceKeyParameters instanceof McEliecePrivateKeyParameters) {
            return ((McEliecePrivateKeyParameters) mcElieceKeyParameters).getN();
        }
        throw new IllegalArgumentException(StubApp.getString2(34779));
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public void init(boolean z2, CipherParameters cipherParameters) {
        this.forEncryption = z2;
        if (!z2) {
            McEliecePrivateKeyParameters mcEliecePrivateKeyParameters = (McEliecePrivateKeyParameters) cipherParameters;
            this.key = mcEliecePrivateKeyParameters;
            initCipherDecrypt(mcEliecePrivateKeyParameters);
        } else {
            if (!(cipherParameters instanceof ParametersWithRandom)) {
                this.sr = CryptoServicesRegistrar.getSecureRandom();
                McEliecePublicKeyParameters mcEliecePublicKeyParameters = (McEliecePublicKeyParameters) cipherParameters;
                this.key = mcEliecePublicKeyParameters;
                initCipherEncrypt(mcEliecePublicKeyParameters);
                return;
            }
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.sr = parametersWithRandom.getRandom();
            McEliecePublicKeyParameters mcEliecePublicKeyParameters2 = (McEliecePublicKeyParameters) parametersWithRandom.getParameters();
            this.key = mcEliecePublicKeyParameters2;
            initCipherEncrypt(mcEliecePublicKeyParameters2);
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public byte[] messageDecrypt(byte[] bArr) throws InvalidCipherTextException {
        if (this.forEncryption) {
            throw new IllegalStateException(StubApp.getString2(34780));
        }
        GF2Vector OS2VP = GF2Vector.OS2VP(this.f19526n, bArr);
        McEliecePrivateKeyParameters mcEliecePrivateKeyParameters = (McEliecePrivateKeyParameters) this.key;
        GF2mField field = mcEliecePrivateKeyParameters.getField();
        PolynomialGF2mSmallM goppaPoly = mcEliecePrivateKeyParameters.getGoppaPoly();
        GF2Matrix sInv = mcEliecePrivateKeyParameters.getSInv();
        Permutation p1 = mcEliecePrivateKeyParameters.getP1();
        Permutation p22 = mcEliecePrivateKeyParameters.getP2();
        GF2Matrix h2 = mcEliecePrivateKeyParameters.getH();
        PolynomialGF2mSmallM[] qInv = mcEliecePrivateKeyParameters.getQInv();
        Permutation rightMultiply = p1.rightMultiply(p22);
        GF2Vector gF2Vector = (GF2Vector) OS2VP.multiply(rightMultiply.computeInverse());
        GF2Vector syndromeDecode = GoppaCode.syndromeDecode((GF2Vector) h2.rightMultiply(gF2Vector), field, goppaPoly, qInv);
        GF2Vector gF2Vector2 = (GF2Vector) ((GF2Vector) gF2Vector.add(syndromeDecode)).multiply(p1);
        return computeMessage((GF2Vector) sInv.leftMultiply(gF2Vector2.extractRightVector(this.f19525k)));
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public byte[] messageEncrypt(byte[] bArr) {
        if (!this.forEncryption) {
            throw new IllegalStateException(StubApp.getString2(34780));
        }
        GF2Vector computeMessageRepresentative = computeMessageRepresentative(bArr);
        return ((GF2Vector) ((McEliecePublicKeyParameters) this.key).getG().leftMultiply(computeMessageRepresentative).add(new GF2Vector(this.f19526n, this.f19527t, this.sr))).getEncoded();
    }
}
