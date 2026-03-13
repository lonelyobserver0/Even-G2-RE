package org.bouncycastle.crypto.kems;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.EncapsulatedSecretExtractor;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.RSAKeyParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RSAKEMExtractor implements EncapsulatedSecretExtractor {
    private DerivationFunction kdf;
    private final int keyLen;
    private final RSAKeyParameters privKey;

    public RSAKEMExtractor(RSAKeyParameters rSAKeyParameters, int i3, DerivationFunction derivationFunction) {
        if (!rSAKeyParameters.isPrivate()) {
            throw new IllegalArgumentException(StubApp.getString2(29011));
        }
        this.privKey = rSAKeyParameters;
        this.keyLen = i3;
        this.kdf = derivationFunction;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(StubApp.getString2(29010), ConstraintUtils.bitsOfSecurityFor(rSAKeyParameters.getModulus()), rSAKeyParameters, CryptoServicePurpose.DECRYPTION));
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public byte[] extractSecret(byte[] bArr) {
        BigInteger modulus = this.privKey.getModulus();
        return RSAKEMGenerator.generateKey(this.kdf, modulus, new BigInteger(1, bArr).modPow(this.privKey.getExponent(), modulus), this.keyLen);
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public int getEncapsulationLength() {
        return (this.privKey.getModulus().bitLength() + 7) / 8;
    }
}
