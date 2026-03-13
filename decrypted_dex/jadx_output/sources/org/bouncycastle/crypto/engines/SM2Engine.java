package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import i2.u;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SM2Engine {
    private int curveLength;
    private final Digest digest;
    private ECKeyParameters ecKey;
    private ECDomainParameters ecParams;
    private boolean forEncryption;
    private final Mode mode;
    private SecureRandom random;

    /* renamed from: org.bouncycastle.crypto.engines.SM2Engine$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$SM2Engine$Mode;

        static {
            int[] iArr = new int[Mode.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$SM2Engine$Mode = iArr;
            try {
                iArr[Mode.C1C3C2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public enum Mode {
        C1C2C3,
        C1C3C2
    }

    public SM2Engine() {
        this(new SM3Digest());
    }

    private void addFieldElement(Digest digest, ECFieldElement eCFieldElement) {
        byte[] asUnsignedByteArray = BigIntegers.asUnsignedByteArray(this.curveLength, eCFieldElement.toBigInteger());
        digest.update(asUnsignedByteArray, 0, asUnsignedByteArray.length);
    }

    private byte[] decrypt(byte[] bArr, int i3, int i10) throws InvalidCipherTextException {
        int i11;
        int i12 = (this.curveLength * 2) + 1;
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i3, bArr2, 0, i12);
        ECPoint decodePoint = this.ecParams.getCurve().decodePoint(bArr2);
        if (decodePoint.multiply(this.ecParams.getH()).isInfinity()) {
            throw new InvalidCipherTextException(StubApp.getString2(28748));
        }
        ECPoint normalize = decodePoint.multiply(((ECPrivateKeyParameters) this.ecKey).getD()).normalize();
        int digestSize = this.digest.getDigestSize();
        int i13 = (i10 - i12) - digestSize;
        byte[] bArr3 = new byte[i13];
        Mode mode = this.mode;
        Mode mode2 = Mode.C1C3C2;
        if (mode == mode2) {
            System.arraycopy(bArr, i3 + i12 + digestSize, bArr3, 0, i13);
        } else {
            System.arraycopy(bArr, i3 + i12, bArr3, 0, i13);
        }
        kdf(this.digest, normalize, bArr3);
        int digestSize2 = this.digest.getDigestSize();
        byte[] bArr4 = new byte[digestSize2];
        addFieldElement(this.digest, normalize.getAffineXCoord());
        this.digest.update(bArr3, 0, i13);
        addFieldElement(this.digest, normalize.getAffineYCoord());
        this.digest.doFinal(bArr4, 0);
        if (this.mode == mode2) {
            i11 = 0;
            for (int i14 = 0; i14 != digestSize2; i14++) {
                i11 |= bArr4[i14] ^ bArr[(i3 + i12) + i14];
            }
        } else {
            i11 = 0;
            for (int i15 = 0; i15 != digestSize2; i15++) {
                i11 |= bArr4[i15] ^ bArr[u.C(i3, i12, i13, i15)];
            }
        }
        Arrays.fill(bArr2, (byte) 0);
        Arrays.fill(bArr4, (byte) 0);
        if (i11 == 0) {
            return bArr3;
        }
        Arrays.fill(bArr3, (byte) 0);
        throw new InvalidCipherTextException(StubApp.getString2(28747));
    }

    private byte[] encrypt(byte[] bArr, int i3, int i10) throws InvalidCipherTextException {
        byte[] encoded;
        ECPoint normalize;
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i3, bArr2, 0, i10);
        ECMultiplier createBasePointMultiplier = createBasePointMultiplier();
        do {
            BigInteger nextK = nextK();
            encoded = createBasePointMultiplier.multiply(this.ecParams.getG(), nextK).normalize().getEncoded(false);
            normalize = ((ECPublicKeyParameters) this.ecKey).getQ().multiply(nextK).normalize();
            kdf(this.digest, normalize, bArr2);
        } while (notEncrypted(bArr2, bArr, i3));
        byte[] bArr3 = new byte[this.digest.getDigestSize()];
        addFieldElement(this.digest, normalize.getAffineXCoord());
        this.digest.update(bArr, i3, i10);
        addFieldElement(this.digest, normalize.getAffineYCoord());
        this.digest.doFinal(bArr3, 0);
        return AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SM2Engine$Mode[this.mode.ordinal()] != 1 ? Arrays.concatenate(encoded, bArr2, bArr3) : Arrays.concatenate(encoded, bArr3, bArr2);
    }

    private void kdf(Digest digest, ECPoint eCPoint, byte[] bArr) {
        Memoable memoable;
        Memoable memoable2;
        int digestSize = digest.getDigestSize();
        byte[] bArr2 = new byte[Math.max(4, digestSize)];
        if (digest instanceof Memoable) {
            addFieldElement(digest, eCPoint.getAffineXCoord());
            addFieldElement(digest, eCPoint.getAffineYCoord());
            memoable = (Memoable) digest;
            memoable2 = memoable.copy();
        } else {
            memoable = null;
            memoable2 = null;
        }
        int i3 = 0;
        int i10 = 0;
        while (i3 < bArr.length) {
            if (memoable != null) {
                memoable.reset(memoable2);
            } else {
                addFieldElement(digest, eCPoint.getAffineXCoord());
                addFieldElement(digest, eCPoint.getAffineYCoord());
            }
            i10++;
            Pack.intToBigEndian(i10, bArr2, 0);
            digest.update(bArr2, 0, 4);
            digest.doFinal(bArr2, 0);
            int min = Math.min(digestSize, bArr.length - i3);
            xor(bArr, bArr2, i3, min);
            i3 += min;
        }
    }

    private BigInteger nextK() {
        int bitLength = this.ecParams.getN().bitLength();
        while (true) {
            BigInteger createRandomBigInteger = BigIntegers.createRandomBigInteger(bitLength, this.random);
            if (!createRandomBigInteger.equals(BigIntegers.ZERO) && createRandomBigInteger.compareTo(this.ecParams.getN()) < 0) {
                return createRandomBigInteger;
            }
        }
    }

    private boolean notEncrypted(byte[] bArr, byte[] bArr2, int i3) {
        for (int i10 = 0; i10 != bArr.length; i10++) {
            if (bArr[i10] != bArr2[i3 + i10]) {
                return false;
            }
        }
        return true;
    }

    private void xor(byte[] bArr, byte[] bArr2, int i3, int i10) {
        for (int i11 = 0; i11 != i10; i11++) {
            int i12 = i3 + i11;
            bArr[i12] = (byte) (bArr[i12] ^ bArr2[i11]);
        }
    }

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    public int getOutputSize(int i3) {
        return this.digest.getDigestSize() + AbstractC1482f.c(this.curveLength, 2, 1, i3);
    }

    public void init(boolean z2, CipherParameters cipherParameters) {
        this.forEncryption = z2;
        if (z2) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            ECKeyParameters eCKeyParameters = (ECKeyParameters) parametersWithRandom.getParameters();
            this.ecKey = eCKeyParameters;
            this.ecParams = eCKeyParameters.getParameters();
            if (((ECPublicKeyParameters) this.ecKey).getQ().multiply(this.ecParams.getH()).isInfinity()) {
                throw new IllegalArgumentException(StubApp.getString2(28749));
            }
            this.random = parametersWithRandom.getRandom();
        } else {
            ECKeyParameters eCKeyParameters2 = (ECKeyParameters) cipherParameters;
            this.ecKey = eCKeyParameters2;
            this.ecParams = eCKeyParameters2.getParameters();
        }
        this.curveLength = (this.ecParams.getCurve().getFieldSize() + 7) / 8;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(StubApp.getString2(28188), ConstraintUtils.bitsOfSecurityFor(this.ecParams.getCurve()), this.ecKey, Utils.getPurpose(z2)));
    }

    public byte[] processBlock(byte[] bArr, int i3, int i10) throws InvalidCipherTextException {
        if (i3 + i10 > bArr.length || i10 == 0) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        return this.forEncryption ? encrypt(bArr, i3, i10) : decrypt(bArr, i3, i10);
    }

    public SM2Engine(Digest digest) {
        this(digest, Mode.C1C2C3);
    }

    public SM2Engine(Digest digest, Mode mode) {
        if (mode == null) {
            throw new IllegalArgumentException(StubApp.getString2(28746));
        }
        this.digest = digest;
        this.mode = mode;
    }

    public SM2Engine(Mode mode) {
        this(new SM3Digest(), mode);
    }
}
