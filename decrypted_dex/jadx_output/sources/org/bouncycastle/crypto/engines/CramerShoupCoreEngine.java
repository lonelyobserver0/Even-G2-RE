package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.CramerShoupKeyParameters;
import org.bouncycastle.crypto.params.CramerShoupPrivateKeyParameters;
import org.bouncycastle.crypto.params.CramerShoupPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CramerShoupCoreEngine {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private boolean forEncryption;
    private CramerShoupKeyParameters key;
    private byte[] label = null;
    private SecureRandom random;

    public static class CramerShoupCiphertextException extends Exception {
        private static final long serialVersionUID = -6360977166495345076L;

        public CramerShoupCiphertextException(String str) {
            super(str);
        }
    }

    private BigInteger generateRandomElement(BigInteger bigInteger, SecureRandom secureRandom) {
        BigInteger bigInteger2 = ONE;
        return BigIntegers.createRandomInRange(bigInteger2, bigInteger.subtract(bigInteger2), secureRandom);
    }

    private boolean isValidMessage(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.compareTo(bigInteger2) < 0;
    }

    public BigInteger convertInput(byte[] bArr, int i3, int i10) {
        int inputBlockSize = getInputBlockSize() + 1;
        String string2 = StubApp.getString2(28584);
        if (i10 > inputBlockSize) {
            throw new DataLengthException(string2);
        }
        if (i10 == getInputBlockSize() + 1 && this.forEncryption) {
            throw new DataLengthException(string2);
        }
        if (i3 != 0 || i10 != bArr.length) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, i3, bArr2, 0, i10);
            bArr = bArr2;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(this.key.getParameters().getP()) < 0) {
            return bigInteger;
        }
        throw new DataLengthException(string2);
    }

    public byte[] convertOutput(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (this.forEncryption) {
            if (byteArray[0] == 0) {
                int length = byteArray.length - 1;
                byte[] bArr = new byte[length];
                System.arraycopy(byteArray, 1, bArr, 0, length);
                return bArr;
            }
        } else {
            if (byteArray[0] == 0 && byteArray.length > getOutputBlockSize()) {
                int length2 = byteArray.length - 1;
                byte[] bArr2 = new byte[length2];
                System.arraycopy(byteArray, 1, bArr2, 0, length2);
                return bArr2;
            }
            if (byteArray.length < getOutputBlockSize()) {
                int outputBlockSize = getOutputBlockSize();
                byte[] bArr3 = new byte[outputBlockSize];
                System.arraycopy(byteArray, 0, bArr3, outputBlockSize - byteArray.length, byteArray.length);
                return bArr3;
            }
        }
        return byteArray;
    }

    public BigInteger decryptBlock(CramerShoupCiphertext cramerShoupCiphertext) throws CramerShoupCiphertextException {
        if (!this.key.isPrivate() || this.forEncryption) {
            return null;
        }
        CramerShoupKeyParameters cramerShoupKeyParameters = this.key;
        if (!(cramerShoupKeyParameters instanceof CramerShoupPrivateKeyParameters)) {
            return null;
        }
        CramerShoupPrivateKeyParameters cramerShoupPrivateKeyParameters = (CramerShoupPrivateKeyParameters) cramerShoupKeyParameters;
        BigInteger p8 = cramerShoupPrivateKeyParameters.getParameters().getP();
        Digest h2 = cramerShoupPrivateKeyParameters.getParameters().getH();
        byte[] byteArray = cramerShoupCiphertext.getU1().toByteArray();
        h2.update(byteArray, 0, byteArray.length);
        byte[] byteArray2 = cramerShoupCiphertext.getU2().toByteArray();
        h2.update(byteArray2, 0, byteArray2.length);
        byte[] byteArray3 = cramerShoupCiphertext.getE().toByteArray();
        h2.update(byteArray3, 0, byteArray3.length);
        byte[] bArr = this.label;
        if (bArr != null) {
            h2.update(bArr, 0, bArr.length);
        }
        byte[] bArr2 = new byte[h2.getDigestSize()];
        h2.doFinal(bArr2, 0);
        BigInteger bigInteger = new BigInteger(1, bArr2);
        if (cramerShoupCiphertext.f18932v.equals(cramerShoupCiphertext.f18931u1.modPow(cramerShoupPrivateKeyParameters.getX1().add(cramerShoupPrivateKeyParameters.getY1().multiply(bigInteger)), p8).multiply(cramerShoupCiphertext.u2.modPow(cramerShoupPrivateKeyParameters.getX2().add(cramerShoupPrivateKeyParameters.getY2().multiply(bigInteger)), p8)).mod(p8))) {
            return cramerShoupCiphertext.f18930e.multiply(cramerShoupCiphertext.f18931u1.modPow(cramerShoupPrivateKeyParameters.getZ(), p8).modInverse(p8)).mod(p8);
        }
        throw new CramerShoupCiphertextException(StubApp.getString2(28585));
    }

    public CramerShoupCiphertext encryptBlock(BigInteger bigInteger) {
        if (this.key.isPrivate() || !this.forEncryption) {
            return null;
        }
        CramerShoupKeyParameters cramerShoupKeyParameters = this.key;
        if (!(cramerShoupKeyParameters instanceof CramerShoupPublicKeyParameters)) {
            return null;
        }
        CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (CramerShoupPublicKeyParameters) cramerShoupKeyParameters;
        BigInteger p8 = cramerShoupPublicKeyParameters.getParameters().getP();
        BigInteger g12 = cramerShoupPublicKeyParameters.getParameters().getG1();
        BigInteger g22 = cramerShoupPublicKeyParameters.getParameters().getG2();
        BigInteger h2 = cramerShoupPublicKeyParameters.getH();
        if (!isValidMessage(bigInteger, p8)) {
            return null;
        }
        BigInteger generateRandomElement = generateRandomElement(p8, this.random);
        BigInteger modPow = g12.modPow(generateRandomElement, p8);
        BigInteger modPow2 = g22.modPow(generateRandomElement, p8);
        BigInteger mod = h2.modPow(generateRandomElement, p8).multiply(bigInteger).mod(p8);
        Digest h4 = cramerShoupPublicKeyParameters.getParameters().getH();
        byte[] byteArray = modPow.toByteArray();
        h4.update(byteArray, 0, byteArray.length);
        byte[] byteArray2 = modPow2.toByteArray();
        h4.update(byteArray2, 0, byteArray2.length);
        byte[] byteArray3 = mod.toByteArray();
        h4.update(byteArray3, 0, byteArray3.length);
        byte[] bArr = this.label;
        if (bArr != null) {
            h4.update(bArr, 0, bArr.length);
        }
        byte[] bArr2 = new byte[h4.getDigestSize()];
        h4.doFinal(bArr2, 0);
        return new CramerShoupCiphertext(modPow, modPow2, mod, cramerShoupPublicKeyParameters.getC().modPow(generateRandomElement, p8).multiply(cramerShoupPublicKeyParameters.getD().modPow(generateRandomElement.multiply(new BigInteger(1, bArr2)), p8)).mod(p8));
    }

    public int getInputBlockSize() {
        int bitLength = (this.key.getParameters().getP().bitLength() + 7) / 8;
        return this.forEncryption ? bitLength - 1 : bitLength;
    }

    public int getOutputBlockSize() {
        int bitLength = (this.key.getParameters().getP().bitLength() + 7) / 8;
        return this.forEncryption ? bitLength : bitLength - 1;
    }

    public void init(boolean z2, CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.key = (CramerShoupKeyParameters) parametersWithRandom.getParameters();
            secureRandom = parametersWithRandom.getRandom();
        } else {
            this.key = (CramerShoupKeyParameters) cipherParameters;
            secureRandom = null;
        }
        this.random = initSecureRandom(z2, secureRandom);
        this.forEncryption = z2;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(StubApp.getString2(28586), ConstraintUtils.bitsOfSecurityFor(this.key.getParameters().getP()), this.key, Utils.getPurpose(z2)));
    }

    public SecureRandom initSecureRandom(boolean z2, SecureRandom secureRandom) {
        if (z2) {
            return CryptoServicesRegistrar.getSecureRandom(secureRandom);
        }
        return null;
    }

    public void init(boolean z2, CipherParameters cipherParameters, String str) {
        init(z2, cipherParameters);
        this.label = Strings.toUTF8ByteArray(str);
    }
}
