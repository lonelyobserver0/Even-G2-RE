package org.bouncycastle.crypto.kems;

import com.stub.StubApp;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.KeyEncapsulation;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RSAKeyEncapsulation implements KeyEncapsulation {
    private DerivationFunction kdf;
    private RSAKeyParameters key;
    private SecureRandom rnd;

    public RSAKeyEncapsulation(DerivationFunction derivationFunction, SecureRandom secureRandom) {
        this.kdf = derivationFunction;
        this.rnd = secureRandom;
    }

    public CipherParameters decrypt(byte[] bArr, int i3) {
        return decrypt(bArr, 0, bArr.length, i3);
    }

    public CipherParameters encrypt(byte[] bArr, int i3) {
        return encrypt(bArr, 0, i3);
    }

    @Override // org.bouncycastle.crypto.KeyEncapsulation
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof RSAKeyParameters)) {
            throw new IllegalArgumentException(StubApp.getString2(29014));
        }
        RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) cipherParameters;
        this.key = rSAKeyParameters;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(StubApp.getString2(29010), ConstraintUtils.bitsOfSecurityFor(rSAKeyParameters.getModulus()), cipherParameters, this.key.isPrivate() ? CryptoServicePurpose.DECRYPTION : CryptoServicePurpose.ENCRYPTION));
    }

    @Override // org.bouncycastle.crypto.KeyEncapsulation
    public CipherParameters decrypt(byte[] bArr, int i3, int i10, int i11) throws IllegalArgumentException {
        if (this.key.isPrivate()) {
            return new KeyParameter(new RSAKEMExtractor(this.key, i11, this.kdf).extractSecret(Arrays.copyOfRange(bArr, i3, i10 + i3)));
        }
        throw new IllegalArgumentException(StubApp.getString2(29013));
    }

    @Override // org.bouncycastle.crypto.KeyEncapsulation
    public CipherParameters encrypt(byte[] bArr, int i3, int i10) throws IllegalArgumentException {
        if (this.key.isPrivate()) {
            throw new IllegalArgumentException(StubApp.getString2(29009));
        }
        SecretWithEncapsulation generateEncapsulated = new RSAKEMGenerator(i10, this.kdf, this.rnd).generateEncapsulated(this.key);
        byte[] encapsulation = generateEncapsulated.getEncapsulation();
        System.arraycopy(encapsulation, 0, bArr, i3, encapsulation.length);
        return new KeyParameter(generateEncapsulated.getSecret());
    }
}
