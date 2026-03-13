package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.ElGamalKeyParameters;
import org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.bouncycastle.crypto.params.ElGamalPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ElGamalEngine implements AsymmetricBlockCipher {
    private int bitSize;
    private boolean forEncryption;
    private ElGamalKeyParameters key;
    private SecureRandom random;
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        return this.forEncryption ? (this.bitSize - 1) / 8 : ((this.bitSize + 7) / 8) * 2;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        return this.forEncryption ? ((this.bitSize + 7) / 8) * 2 : (this.bitSize - 1) / 8;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.key = (ElGamalKeyParameters) parametersWithRandom.getParameters();
            secureRandom = parametersWithRandom.getRandom();
        } else {
            this.key = (ElGamalKeyParameters) cipherParameters;
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        this.random = secureRandom;
        this.forEncryption = z2;
        this.bitSize = this.key.getParameters().getP().bitLength();
        ElGamalKeyParameters elGamalKeyParameters = this.key;
        if (z2) {
            if (!(elGamalKeyParameters instanceof ElGamalPublicKeyParameters)) {
                throw new IllegalArgumentException(StubApp.getString2(28618));
            }
        } else if (!(elGamalKeyParameters instanceof ElGamalPrivateKeyParameters)) {
            throw new IllegalArgumentException(StubApp.getString2(28619));
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(StubApp.getString2(24659), ConstraintUtils.bitsOfSecurityFor(this.key.getParameters().getP()), this.key, Utils.getPurpose(z2)));
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i3, int i10) {
        BigInteger createRandomBigInteger;
        if (this.key == null) {
            throw new IllegalStateException(StubApp.getString2(28621));
        }
        int inputBlockSize = this.forEncryption ? (this.bitSize + 6) / 8 : getInputBlockSize();
        String string2 = StubApp.getString2(28620);
        if (i10 > inputBlockSize) {
            throw new DataLengthException(string2);
        }
        BigInteger p8 = this.key.getParameters().getP();
        if (this.key instanceof ElGamalPrivateKeyParameters) {
            int i11 = i10 / 2;
            byte[] bArr2 = new byte[i11];
            byte[] bArr3 = new byte[i11];
            System.arraycopy(bArr, i3, bArr2, 0, i11);
            System.arraycopy(bArr, i3 + i11, bArr3, 0, i11);
            return BigIntegers.asUnsignedByteArray(new BigInteger(1, bArr2).modPow(p8.subtract(ONE).subtract(((ElGamalPrivateKeyParameters) this.key).getX()), p8).multiply(new BigInteger(1, bArr3)).mod(p8));
        }
        if (i3 != 0 || i10 != bArr.length) {
            byte[] bArr4 = new byte[i10];
            System.arraycopy(bArr, i3, bArr4, 0, i10);
            bArr = bArr4;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(p8) >= 0) {
            throw new DataLengthException(string2);
        }
        ElGamalPublicKeyParameters elGamalPublicKeyParameters = (ElGamalPublicKeyParameters) this.key;
        int bitLength = p8.bitLength();
        while (true) {
            createRandomBigInteger = BigIntegers.createRandomBigInteger(bitLength, this.random);
            if (!createRandomBigInteger.equals(ZERO) && createRandomBigInteger.compareTo(p8.subtract(TWO)) <= 0) {
                break;
            }
        }
        BigInteger modPow = this.key.getParameters().getG().modPow(createRandomBigInteger, p8);
        BigInteger mod = bigInteger.multiply(elGamalPublicKeyParameters.getY().modPow(createRandomBigInteger, p8)).mod(p8);
        byte[] byteArray = modPow.toByteArray();
        byte[] byteArray2 = mod.toByteArray();
        int outputBlockSize = getOutputBlockSize();
        byte[] bArr5 = new byte[outputBlockSize];
        int i12 = outputBlockSize / 2;
        if (byteArray.length > i12) {
            System.arraycopy(byteArray, 1, bArr5, i12 - (byteArray.length - 1), byteArray.length - 1);
        } else {
            System.arraycopy(byteArray, 0, bArr5, i12 - byteArray.length, byteArray.length);
        }
        if (byteArray2.length > i12) {
            System.arraycopy(byteArray2, 1, bArr5, outputBlockSize - (byteArray2.length - 1), byteArray2.length - 1);
            return bArr5;
        }
        System.arraycopy(byteArray2, 0, bArr5, outputBlockSize - byteArray2.length, byteArray2.length);
        return bArr5;
    }
}
