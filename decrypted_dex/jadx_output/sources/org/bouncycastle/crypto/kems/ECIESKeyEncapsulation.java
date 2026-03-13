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
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECIESKeyEncapsulation implements KeyEncapsulation {
    private boolean CofactorMode;
    private boolean OldCofactorMode;
    private boolean SingleHashMode;
    private DerivationFunction kdf;
    private ECKeyParameters key;
    private SecureRandom rnd;

    public ECIESKeyEncapsulation(DerivationFunction derivationFunction, SecureRandom secureRandom) {
        this.kdf = derivationFunction;
        this.rnd = secureRandom;
        this.CofactorMode = false;
        this.OldCofactorMode = false;
        this.SingleHashMode = false;
    }

    public CipherParameters decrypt(byte[] bArr, int i3) {
        return decrypt(bArr, 0, bArr.length, i3);
    }

    public CipherParameters encrypt(byte[] bArr, int i3) {
        return encrypt(bArr, 0, i3);
    }

    @Override // org.bouncycastle.crypto.KeyEncapsulation
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ECKeyParameters)) {
            throw new IllegalArgumentException(StubApp.getString2(29007));
        }
        ECKeyParameters eCKeyParameters = (ECKeyParameters) cipherParameters;
        this.key = eCKeyParameters;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(StubApp.getString2(29006), ConstraintUtils.bitsOfSecurityFor(eCKeyParameters.getParameters().getCurve()), cipherParameters, CryptoServicePurpose.ANY));
    }

    public ECIESKeyEncapsulation(DerivationFunction derivationFunction, SecureRandom secureRandom, boolean z2, boolean z10, boolean z11) {
        this.kdf = derivationFunction;
        this.rnd = secureRandom;
        this.CofactorMode = z2;
        if (z2) {
            this.OldCofactorMode = false;
        } else {
            this.OldCofactorMode = z10;
        }
        this.SingleHashMode = z11;
    }

    @Override // org.bouncycastle.crypto.KeyEncapsulation
    public CipherParameters decrypt(byte[] bArr, int i3, int i10, int i11) throws IllegalArgumentException {
        ECKeyParameters eCKeyParameters = this.key;
        if (eCKeyParameters instanceof ECPrivateKeyParameters) {
            return new KeyParameter(new ECIESKEMExtractor((ECPrivateKeyParameters) eCKeyParameters, i11, this.kdf, this.CofactorMode, this.OldCofactorMode, this.SingleHashMode).extractSecret(Arrays.copyOfRange(bArr, i3, i10 + i3)));
        }
        throw new IllegalArgumentException(StubApp.getString2(29008));
    }

    @Override // org.bouncycastle.crypto.KeyEncapsulation
    public CipherParameters encrypt(byte[] bArr, int i3, int i10) throws IllegalArgumentException {
        if (!(this.key instanceof ECPublicKeyParameters)) {
            throw new IllegalArgumentException(StubApp.getString2(29009));
        }
        SecretWithEncapsulation generateEncapsulated = new ECIESKEMGenerator(i10, this.kdf, this.rnd, this.CofactorMode, this.OldCofactorMode, this.SingleHashMode).generateEncapsulated(this.key);
        byte[] encapsulation = generateEncapsulated.getEncapsulation();
        System.arraycopy(encapsulation, 0, bArr, i3, encapsulation.length);
        return new KeyParameter(generateEncapsulated.getSecret());
    }
}
