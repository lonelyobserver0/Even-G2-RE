package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class RSACoreEngine {
    private boolean forEncryption;
    private RSAKeyParameters key;

    private CryptoServicePurpose getPurpose(boolean z2, boolean z10) {
        boolean z11 = false;
        boolean z12 = z2 && z10;
        boolean z13 = !z2 && z10;
        if (!z2 && !z10) {
            z11 = true;
        }
        return z12 ? CryptoServicePurpose.SIGNING : z13 ? CryptoServicePurpose.ENCRYPTION : z11 ? CryptoServicePurpose.VERIFYING : CryptoServicePurpose.DECRYPTION;
    }

    public BigInteger convertInput(byte[] bArr, int i3, int i10) {
        int inputBlockSize = getInputBlockSize() + 1;
        String string2 = StubApp.getString2(28736);
        if (i10 > inputBlockSize) {
            throw new DataLengthException(string2);
        }
        if (i10 == getInputBlockSize() + 1 && !this.forEncryption) {
            throw new DataLengthException(string2);
        }
        if (i3 != 0 || i10 != bArr.length) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, i3, bArr2, 0, i10);
            bArr = bArr2;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(this.key.getModulus()) < 0) {
            return bigInteger;
        }
        throw new DataLengthException(string2);
    }

    public byte[] convertOutput(BigInteger bigInteger) {
        byte[] bArr;
        byte[] byteArray = bigInteger.toByteArray();
        if (!this.forEncryption) {
            if (byteArray[0] == 0) {
                int length = byteArray.length - 1;
                bArr = new byte[length];
                System.arraycopy(byteArray, 1, bArr, 0, length);
            } else {
                int length2 = byteArray.length;
                bArr = new byte[length2];
                System.arraycopy(byteArray, 0, bArr, 0, length2);
            }
            Arrays.fill(byteArray, (byte) 0);
            return bArr;
        }
        if (byteArray[0] == 0 && byteArray.length > getOutputBlockSize()) {
            int length3 = byteArray.length - 1;
            byte[] bArr2 = new byte[length3];
            System.arraycopy(byteArray, 1, bArr2, 0, length3);
            return bArr2;
        }
        if (byteArray.length >= getOutputBlockSize()) {
            return byteArray;
        }
        int outputBlockSize = getOutputBlockSize();
        byte[] bArr3 = new byte[outputBlockSize];
        System.arraycopy(byteArray, 0, bArr3, outputBlockSize - byteArray.length, byteArray.length);
        return bArr3;
    }

    public int getInputBlockSize() {
        int bitLength = (this.key.getModulus().bitLength() + 7) / 8;
        return this.forEncryption ? bitLength - 1 : bitLength;
    }

    public int getOutputBlockSize() {
        int bitLength = (this.key.getModulus().bitLength() + 7) / 8;
        return this.forEncryption ? bitLength : bitLength - 1;
    }

    public void init(boolean z2, CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        this.key = (RSAKeyParameters) cipherParameters;
        this.forEncryption = z2;
        int bitsOfSecurityFor = ConstraintUtils.bitsOfSecurityFor(this.key.getModulus());
        RSAKeyParameters rSAKeyParameters = this.key;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(StubApp.getString2(24659), bitsOfSecurityFor, rSAKeyParameters, getPurpose(rSAKeyParameters.isPrivate(), z2)));
    }

    public BigInteger processBlock(BigInteger bigInteger) {
        RSAKeyParameters rSAKeyParameters = this.key;
        if (!(rSAKeyParameters instanceof RSAPrivateCrtKeyParameters)) {
            return bigInteger.modPow(rSAKeyParameters.getExponent(), this.key.getModulus());
        }
        RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters = (RSAPrivateCrtKeyParameters) rSAKeyParameters;
        BigInteger p8 = rSAPrivateCrtKeyParameters.getP();
        BigInteger q10 = rSAPrivateCrtKeyParameters.getQ();
        BigInteger dp = rSAPrivateCrtKeyParameters.getDP();
        BigInteger dq = rSAPrivateCrtKeyParameters.getDQ();
        BigInteger qInv = rSAPrivateCrtKeyParameters.getQInv();
        BigInteger modPow = bigInteger.remainder(p8).modPow(dp, p8);
        BigInteger modPow2 = bigInteger.remainder(q10).modPow(dq, q10);
        return modPow.subtract(modPow2).multiply(qInv).mod(p8).multiply(q10).add(modPow2);
    }
}
