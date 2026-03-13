package org.bouncycastle.crypto.kems;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.EncapsulatedSecretExtractor;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECIESKEMExtractor implements EncapsulatedSecretExtractor {
    private boolean CofactorMode;
    private boolean OldCofactorMode;
    private boolean SingleHashMode;
    private final ECPrivateKeyParameters decKey;
    private DerivationFunction kdf;
    private int keyLen;

    public ECIESKEMExtractor(ECPrivateKeyParameters eCPrivateKeyParameters, int i3, DerivationFunction derivationFunction) {
        this.decKey = eCPrivateKeyParameters;
        this.keyLen = i3;
        this.kdf = derivationFunction;
        this.CofactorMode = false;
        this.OldCofactorMode = false;
        this.SingleHashMode = false;
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public byte[] extractSecret(byte[] bArr) {
        ECPrivateKeyParameters eCPrivateKeyParameters = this.decKey;
        ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
        ECCurve curve = parameters.getCurve();
        BigInteger n10 = parameters.getN();
        BigInteger h2 = parameters.getH();
        ECPoint decodePoint = curve.decodePoint(bArr);
        if (this.CofactorMode || this.OldCofactorMode) {
            decodePoint = decodePoint.multiply(h2);
        }
        BigInteger d8 = eCPrivateKeyParameters.getD();
        if (this.CofactorMode) {
            d8 = d8.multiply(parameters.getHInv()).mod(n10);
        }
        return ECIESKEMGenerator.deriveKey(this.SingleHashMode, this.kdf, this.keyLen, bArr, decodePoint.multiply(d8).normalize().getAffineXCoord().getEncoded());
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public int getEncapsulationLength() {
        return ((this.decKey.getParameters().getCurve().getFieldSize() / 8) * 2) + 1;
    }

    public ECIESKEMExtractor(ECPrivateKeyParameters eCPrivateKeyParameters, int i3, DerivationFunction derivationFunction, boolean z2, boolean z10, boolean z11) {
        this.decKey = eCPrivateKeyParameters;
        this.keyLen = i3;
        this.kdf = derivationFunction;
        this.CofactorMode = z2;
        if (z2) {
            this.OldCofactorMode = false;
        } else {
            this.OldCofactorMode = z10;
        }
        this.SingleHashMode = z11;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(StubApp.getString2(29006), ConstraintUtils.bitsOfSecurityFor(eCPrivateKeyParameters.getParameters().getCurve()), eCPrivateKeyParameters, CryptoServicePurpose.DECRYPTION));
    }
}
