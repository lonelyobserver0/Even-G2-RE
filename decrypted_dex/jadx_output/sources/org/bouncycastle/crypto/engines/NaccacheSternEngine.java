package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import java.math.BigInteger;
import java.util.Vector;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.NaccacheSternKeyParameters;
import org.bouncycastle.crypto.params.NaccacheSternPrivateKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class NaccacheSternEngine implements AsymmetricBlockCipher {
    private boolean forEncryption;
    private NaccacheSternKeyParameters key;
    private static BigInteger ZERO = BigInteger.valueOf(0);
    private static BigInteger ONE = BigInteger.valueOf(1);
    private Vector[] lookup = null;
    private boolean debug = false;

    private static BigInteger chineseRemainder(Vector vector, Vector vector2) {
        BigInteger bigInteger = ZERO;
        BigInteger bigInteger2 = ONE;
        for (int i3 = 0; i3 < vector2.size(); i3++) {
            bigInteger2 = bigInteger2.multiply((BigInteger) vector2.elementAt(i3));
        }
        for (int i10 = 0; i10 < vector2.size(); i10++) {
            BigInteger bigInteger3 = (BigInteger) vector2.elementAt(i10);
            BigInteger divide = bigInteger2.divide(bigInteger3);
            bigInteger = bigInteger.add(divide.multiply(divide.modInverse(bigInteger3)).multiply((BigInteger) vector.elementAt(i10)));
        }
        return bigInteger.mod(bigInteger2);
    }

    public byte[] addCryptedBlocks(byte[] bArr, byte[] bArr2) throws InvalidCipherTextException {
        boolean z2 = this.forEncryption;
        String string2 = StubApp.getString2(28678);
        if (z2) {
            if (bArr.length > getOutputBlockSize() || bArr2.length > getOutputBlockSize()) {
                throw new InvalidCipherTextException(string2);
            }
        } else if (bArr.length > getInputBlockSize() || bArr2.length > getInputBlockSize()) {
            throw new InvalidCipherTextException(string2);
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        BigInteger bigInteger2 = new BigInteger(1, bArr2);
        BigInteger mod = bigInteger.multiply(bigInteger2).mod(this.key.getModulus());
        if (this.debug) {
            System.out.println(StubApp.getString2(28679) + bigInteger);
            System.out.println(StubApp.getString2(28680) + bigInteger2);
            System.out.println(StubApp.getString2(28681) + mod);
        }
        byte[] byteArray = this.key.getModulus().toByteArray();
        Arrays.fill(byteArray, (byte) 0);
        System.arraycopy(mod.toByteArray(), 0, byteArray, byteArray.length - mod.toByteArray().length, mod.toByteArray().length);
        return byteArray;
    }

    public byte[] encrypt(BigInteger bigInteger) {
        byte[] byteArray = this.key.getModulus().toByteArray();
        Arrays.fill(byteArray, (byte) 0);
        byte[] byteArray2 = this.key.getG().modPow(bigInteger, this.key.getModulus()).toByteArray();
        System.arraycopy(byteArray2, 0, byteArray, byteArray.length - byteArray2.length, byteArray2.length);
        if (this.debug) {
            System.out.println(StubApp.getString2(28682) + new BigInteger(byteArray));
        }
        return byteArray;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        return this.forEncryption ? ((this.key.getLowerSigmaBound() + 7) / 8) - 1 : this.key.getModulus().toByteArray().length;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        return this.forEncryption ? this.key.getModulus().toByteArray().length : ((this.key.getLowerSigmaBound() + 7) / 8) - 1;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        this.forEncryption = z2;
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        this.key = (NaccacheSternKeyParameters) cipherParameters;
        if (!this.forEncryption) {
            if (this.debug) {
                System.out.println(StubApp.getString2(28683));
            }
            NaccacheSternPrivateKeyParameters naccacheSternPrivateKeyParameters = (NaccacheSternPrivateKeyParameters) this.key;
            Vector smallPrimes = naccacheSternPrivateKeyParameters.getSmallPrimes();
            this.lookup = new Vector[smallPrimes.size()];
            for (int i3 = 0; i3 < smallPrimes.size(); i3++) {
                BigInteger bigInteger = (BigInteger) smallPrimes.elementAt(i3);
                int intValue = bigInteger.intValue();
                this.lookup[i3] = new Vector();
                this.lookup[i3].addElement(ONE);
                if (this.debug) {
                    System.out.println(StubApp.getString2(28684) + intValue);
                }
                BigInteger bigInteger2 = ZERO;
                for (int i10 = 1; i10 < intValue; i10++) {
                    bigInteger2 = bigInteger2.add(naccacheSternPrivateKeyParameters.getPhi_n());
                    this.lookup[i3].addElement(naccacheSternPrivateKeyParameters.getG().modPow(bigInteger2.divide(bigInteger), naccacheSternPrivateKeyParameters.getModulus()));
                }
            }
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(StubApp.getString2(28685), ConstraintUtils.bitsOfSecurityFor(this.key.getModulus()), cipherParameters, Utils.getPurpose(z2)));
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i3, int i10) throws InvalidCipherTextException {
        if (this.key == null) {
            throw new IllegalStateException(StubApp.getString2(28700));
        }
        if (i10 > getInputBlockSize() + 1) {
            throw new DataLengthException(StubApp.getString2(28699));
        }
        if (!this.forEncryption && i10 < getInputBlockSize()) {
            throw new InvalidCipherTextException(StubApp.getString2(28686));
        }
        if (i3 != 0 || i10 != bArr.length) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, i3, bArr2, 0, i10);
            bArr = bArr2;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (this.debug) {
            System.out.println(StubApp.getString2(28687) + bigInteger);
        }
        if (this.forEncryption) {
            return encrypt(bigInteger);
        }
        Vector vector = new Vector();
        NaccacheSternPrivateKeyParameters naccacheSternPrivateKeyParameters = (NaccacheSternPrivateKeyParameters) this.key;
        Vector smallPrimes = naccacheSternPrivateKeyParameters.getSmallPrimes();
        for (int i11 = 0; i11 < smallPrimes.size(); i11++) {
            BigInteger modPow = bigInteger.modPow(naccacheSternPrivateKeyParameters.getPhi_n().divide((BigInteger) smallPrimes.elementAt(i11)), naccacheSternPrivateKeyParameters.getModulus());
            Vector vector2 = this.lookup[i11];
            if (vector2.size() != ((BigInteger) smallPrimes.elementAt(i11)).intValue()) {
                if (this.debug) {
                    System.out.println(StubApp.getString2(28688) + smallPrimes.elementAt(i11) + StubApp.getString2(28689) + vector2.size());
                }
                throw new InvalidCipherTextException(StubApp.getString2(28690) + ((BigInteger) smallPrimes.elementAt(i11)).intValue() + StubApp.getString2(28691) + ((BigInteger) smallPrimes.elementAt(i11)).intValue() + StubApp.getString2(28692) + this.lookup[i11].size());
            }
            int indexOf = vector2.indexOf(modPow);
            if (indexOf == -1) {
                if (this.debug) {
                    System.out.println(StubApp.getString2(28693) + smallPrimes.elementAt(i11));
                    System.out.println(StubApp.getString2(28694) + modPow);
                    System.out.println(StubApp.getString2(28695) + smallPrimes.elementAt(i11) + StubApp.getString2(28696) + this.lookup[i11].size() + StubApp.getString2(28697));
                    for (int i12 = 0; i12 < this.lookup[i11].size(); i12++) {
                        System.out.println(this.lookup[i11].elementAt(i12));
                    }
                }
                throw new InvalidCipherTextException(StubApp.getString2(28698));
            }
            vector.addElement(BigInteger.valueOf(indexOf));
        }
        return chineseRemainder(vector, smallPrimes).toByteArray();
    }

    public byte[] processData(byte[] bArr) throws InvalidCipherTextException {
        byte[] processBlock;
        if (this.debug) {
            System.out.println();
        }
        if (bArr.length <= getInputBlockSize()) {
            if (this.debug) {
                System.out.println(StubApp.getString2(28707));
            }
            return processBlock(bArr, 0, bArr.length);
        }
        int inputBlockSize = getInputBlockSize();
        int outputBlockSize = getOutputBlockSize();
        boolean z2 = this.debug;
        String string2 = StubApp.getString2(693);
        if (z2) {
            System.out.println(StubApp.getString2(28701) + inputBlockSize + string2);
            System.out.println(StubApp.getString2(28702) + outputBlockSize + string2);
            System.out.println(StubApp.getString2(28703) + bArr.length + string2);
        }
        byte[] bArr2 = new byte[((bArr.length / inputBlockSize) + 1) * outputBlockSize];
        int i3 = 0;
        int i10 = 0;
        while (i3 < bArr.length) {
            int i11 = i3 + inputBlockSize;
            if (i11 < bArr.length) {
                processBlock = processBlock(bArr, i3, inputBlockSize);
                i3 = i11;
            } else {
                processBlock = processBlock(bArr, i3, bArr.length - i3);
                i3 = (bArr.length - i3) + i3;
            }
            if (this.debug) {
                System.out.println(StubApp.getString2(28704) + i3);
            }
            if (processBlock == null) {
                boolean z10 = this.debug;
                String string22 = StubApp.getString2(28705);
                if (z10) {
                    System.out.println(string22);
                }
                throw new InvalidCipherTextException(string22);
            }
            System.arraycopy(processBlock, 0, bArr2, i10, processBlock.length);
            i10 += processBlock.length;
        }
        byte[] bArr3 = new byte[i10];
        System.arraycopy(bArr2, 0, bArr3, 0, i10);
        if (this.debug) {
            System.out.println(StubApp.getString2(28706) + i10 + string2);
        }
        return bArr3;
    }

    public void setDebug(boolean z2) {
        this.debug = z2;
    }
}
