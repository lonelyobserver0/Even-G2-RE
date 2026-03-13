package org.bouncycastle.crypto.generators;

import com.stub.StubApp;
import java.math.BigInteger;
import java.security.SecureRandom;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.params.DSAParameterGenerationParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAValidationParameters;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DSAParametersGenerator {

    /* renamed from: L, reason: collision with root package name */
    private int f18977L;

    /* renamed from: N, reason: collision with root package name */
    private int f18978N;
    private int certainty;
    private Digest digest;
    private int iterations;
    private SecureRandom random;
    private int usageIndex;
    private boolean use186_3;
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    public DSAParametersGenerator() {
        this(DigestFactory.createSHA1());
    }

    private static BigInteger calculateGenerator_FIPS186_2(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        BigInteger modPow;
        BigInteger divide = bigInteger.subtract(ONE).divide(bigInteger2);
        BigInteger subtract = bigInteger.subtract(TWO);
        do {
            modPow = BigIntegers.createRandomInRange(TWO, subtract, secureRandom).modPow(divide, bigInteger);
        } while (modPow.bitLength() <= 1);
        return modPow;
    }

    private static BigInteger calculateGenerator_FIPS186_3_Unverifiable(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        return calculateGenerator_FIPS186_2(bigInteger, bigInteger2, secureRandom);
    }

    private static BigInteger calculateGenerator_FIPS186_3_Verifiable(Digest digest, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, int i3) {
        BigInteger divide = bigInteger.subtract(ONE).divide(bigInteger2);
        byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(28901));
        int length = bArr.length + decodeStrict.length;
        byte[] bArr2 = new byte[length + 3];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(decodeStrict, 0, bArr2, bArr.length, decodeStrict.length);
        bArr2[length] = (byte) i3;
        byte[] bArr3 = new byte[digest.getDigestSize()];
        for (int i10 = 1; i10 < 65536; i10++) {
            inc(bArr2);
            hash(digest, bArr2, bArr3, 0);
            BigInteger modPow = new BigInteger(1, bArr3).modPow(divide, bigInteger);
            if (modPow.compareTo(TWO) >= 0) {
                return modPow;
            }
        }
        return null;
    }

    private DSAParameters generateParameters_FIPS186_2() {
        int i3 = 20;
        byte[] bArr = new byte[20];
        byte[] bArr2 = new byte[20];
        byte[] bArr3 = new byte[20];
        byte[] bArr4 = new byte[20];
        int i10 = this.f18977L;
        int i11 = (i10 - 1) / 160;
        int i12 = i10 / 8;
        byte[] bArr5 = new byte[i12];
        if (!(this.digest instanceof SHA1Digest)) {
            throw new IllegalStateException(StubApp.getString2(28902));
        }
        while (true) {
            this.random.nextBytes(bArr);
            hash(this.digest, bArr, bArr2, 0);
            System.arraycopy(bArr, 0, bArr3, 0, i3);
            inc(bArr3);
            hash(this.digest, bArr3, bArr3, 0);
            for (int i13 = 0; i13 != i3; i13++) {
                bArr4[i13] = (byte) (bArr2[i13] ^ bArr3[i13]);
            }
            bArr4[0] = (byte) (bArr4[0] | ByteCompanionObject.MIN_VALUE);
            bArr4[19] = (byte) (bArr4[19] | 1);
            BigInteger bigInteger = new BigInteger(1, bArr4);
            if (isProbablePrime(bigInteger)) {
                byte[] clone = Arrays.clone(bArr);
                inc(clone);
                int i14 = 0;
                while (i14 < 4096) {
                    for (int i15 = 1; i15 <= i11; i15++) {
                        inc(clone);
                        hash(this.digest, clone, bArr5, i12 - (i15 * 20));
                    }
                    int i16 = i12 - (i11 * 20);
                    inc(clone);
                    hash(this.digest, clone, bArr2, 0);
                    System.arraycopy(bArr2, 20 - i16, bArr5, 0, i16);
                    bArr5[0] = (byte) (bArr5[0] | ByteCompanionObject.MIN_VALUE);
                    BigInteger bigInteger2 = new BigInteger(1, bArr5);
                    BigInteger subtract = bigInteger2.subtract(bigInteger2.mod(bigInteger.shiftLeft(1)).subtract(ONE));
                    if (subtract.bitLength() == this.f18977L && isProbablePrime(subtract)) {
                        return new DSAParameters(subtract, bigInteger, calculateGenerator_FIPS186_2(subtract, bigInteger, this.random), new DSAValidationParameters(bArr, i14));
                    }
                    i14++;
                    i3 = 20;
                }
            }
        }
    }

    private DSAParameters generateParameters_FIPS186_3() {
        BigInteger bit;
        int i3;
        BigInteger subtract;
        BigInteger calculateGenerator_FIPS186_3_Verifiable;
        Digest digest = this.digest;
        int digestSize = digest.getDigestSize() * 8;
        byte[] bArr = new byte[this.f18978N / 8];
        int i10 = this.f18977L;
        int i11 = (i10 - 1) / digestSize;
        int i12 = (i10 - 1) % digestSize;
        int i13 = i10 / 8;
        byte[] bArr2 = new byte[i13];
        int digestSize2 = digest.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        loop0: while (true) {
            this.random.nextBytes(bArr);
            int i14 = 0;
            hash(digest, bArr, bArr3, 0);
            bit = new BigInteger(1, bArr3).mod(ONE.shiftLeft(this.f18978N - 1)).setBit(0).setBit(this.f18978N - 1);
            if (isProbablePrime(bit)) {
                byte[] clone = Arrays.clone(bArr);
                int i15 = this.f18977L * 4;
                i3 = 0;
                while (i3 < i15) {
                    for (int i16 = 1; i16 <= i11; i16++) {
                        inc(clone);
                        hash(digest, clone, bArr2, i13 - (i16 * digestSize2));
                    }
                    int i17 = i13 - (i11 * digestSize2);
                    inc(clone);
                    hash(digest, clone, bArr3, i14);
                    System.arraycopy(bArr3, digestSize2 - i17, bArr2, i14, i17);
                    bArr2[i14] = (byte) (bArr2[i14] | ByteCompanionObject.MIN_VALUE);
                    BigInteger bigInteger = new BigInteger(1, bArr2);
                    subtract = bigInteger.subtract(bigInteger.mod(bit.shiftLeft(1)).subtract(ONE));
                    if (subtract.bitLength() == this.f18977L && isProbablePrime(subtract)) {
                        break loop0;
                    }
                    i3++;
                    i14 = 0;
                }
            }
        }
        int i18 = this.usageIndex;
        return (i18 < 0 || (calculateGenerator_FIPS186_3_Verifiable = calculateGenerator_FIPS186_3_Verifiable(digest, subtract, bit, bArr, i18)) == null) ? new DSAParameters(subtract, bit, calculateGenerator_FIPS186_3_Unverifiable(subtract, bit, this.random), new DSAValidationParameters(bArr, i3)) : new DSAParameters(subtract, bit, calculateGenerator_FIPS186_3_Verifiable, new DSAValidationParameters(bArr, i3, this.usageIndex));
    }

    private static int getDefaultN(int i3) {
        return i3 > 1024 ? 256 : 160;
    }

    private static int getMinimumIterations(int i3) {
        if (i3 <= 1024) {
            return 40;
        }
        return (((i3 - 1) / 1024) * 8) + 48;
    }

    private static void hash(Digest digest, byte[] bArr, byte[] bArr2, int i3) {
        digest.update(bArr, 0, bArr.length);
        digest.doFinal(bArr2, i3);
    }

    private static void inc(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b2 = (byte) ((bArr[length] + 1) & 255);
            bArr[length] = b2;
            if (b2 != 0) {
                return;
            }
        }
    }

    private boolean isProbablePrime(BigInteger bigInteger) {
        return bigInteger.isProbablePrime(this.certainty);
    }

    public DSAParameters generateParameters() {
        return this.use186_3 ? generateParameters_FIPS186_3() : generateParameters_FIPS186_2();
    }

    public void init(int i3, int i10, SecureRandom secureRandom) {
        this.f18977L = i3;
        this.f18978N = getDefaultN(i3);
        this.certainty = i10;
        this.iterations = Math.max(getMinimumIterations(this.f18977L), (i10 + 1) / 2);
        this.random = secureRandom;
        this.use186_3 = false;
        this.usageIndex = -1;
    }

    public DSAParametersGenerator(Digest digest) {
        this.digest = digest;
    }

    public void init(DSAParameterGenerationParameters dSAParameterGenerationParameters) {
        int l9 = dSAParameterGenerationParameters.getL();
        int n10 = dSAParameterGenerationParameters.getN();
        if (l9 < 1024 || l9 > 3072 || l9 % 1024 != 0) {
            throw new IllegalArgumentException(StubApp.getString2(28907));
        }
        if (l9 == 1024 && n10 != 160) {
            throw new IllegalArgumentException(StubApp.getString2(28903));
        }
        if (l9 == 2048 && n10 != 224 && n10 != 256) {
            throw new IllegalArgumentException(StubApp.getString2(28904));
        }
        if (l9 == 3072 && n10 != 256) {
            throw new IllegalArgumentException(StubApp.getString2(28905));
        }
        if (this.digest.getDigestSize() * 8 < n10) {
            throw new IllegalStateException(StubApp.getString2(28906));
        }
        this.f18977L = l9;
        this.f18978N = n10;
        this.certainty = dSAParameterGenerationParameters.getCertainty();
        this.iterations = Math.max(getMinimumIterations(l9), (this.certainty + 1) / 2);
        this.random = dSAParameterGenerationParameters.getRandom();
        this.use186_3 = true;
        this.usageIndex = dSAParameterGenerationParameters.getUsageIndex();
    }
}
