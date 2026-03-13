package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import com.stub.StubApp;
import i2.u;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.agreement.ECVKOAgreement;
import org.bouncycastle.crypto.digests.GOST3411_2012_256Digest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithUKM;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec;
import org.bouncycastle.jce.interfaces.ECPrivateKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {
    private ECVKOAgreement agreement;
    private String kaAlgorithm;
    private ECDomainParameters parameters;
    private byte[] result;

    public static class ECVKO256 extends KeyAgreementSpi {
        public ECVKO256() {
            super(StubApp.getString2(28169), new ECVKOAgreement(new GOST3411_2012_256Digest()), null);
        }
    }

    public static class ECVKO512 extends KeyAgreementSpi {
        public ECVKO512() {
            super(StubApp.getString2(28170), new ECVKOAgreement(new GOST3411_2012_256Digest()), null);
        }
    }

    public KeyAgreementSpi(String str, ECVKOAgreement eCVKOAgreement, DerivationFunction derivationFunction) {
        super(str, derivationFunction);
        this.kaAlgorithm = str;
        this.agreement = eCVKOAgreement;
    }

    public static AsymmetricKeyParameter generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        return publicKey instanceof BCECGOST3410_2012PublicKey ? ((BCECGOST3410_2012PublicKey) publicKey).engineGetKeyParameters() : ECUtil.generatePublicKeyParameter(publicKey);
    }

    private static String getSimpleName(Class cls) {
        String name = cls.getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public byte[] doCalcSecret() {
        return this.result;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public void doInitFromKey(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (!(key instanceof PrivateKey)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.kaAlgorithm);
            sb2.append(StubApp.getString2(30655));
            throw new InvalidKeyException(AbstractC1482f.k(sb2, getSimpleName(ECPrivateKey.class), StubApp.getString2(30654)));
        }
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof UserKeyingMaterialSpec)) {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(30653));
        }
        ECPrivateKeyParameters eCPrivateKeyParameters = (ECPrivateKeyParameters) ECUtil.generatePrivateKeyParameter((PrivateKey) key);
        this.parameters = eCPrivateKeyParameters.getParameters();
        byte[] userKeyingMaterial = algorithmParameterSpec instanceof UserKeyingMaterialSpec ? ((UserKeyingMaterialSpec) algorithmParameterSpec).getUserKeyingMaterial() : null;
        this.ukmParameters = userKeyingMaterial;
        this.agreement.init(new ParametersWithUKM(eCPrivateKeyParameters, userKeyingMaterial));
    }

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z2) throws InvalidKeyException, IllegalStateException {
        if (this.parameters == null) {
            throw new IllegalStateException(AbstractC1482f.k(new StringBuilder(), this.kaAlgorithm, StubApp.getString2(30660)));
        }
        if (!z2) {
            throw new IllegalStateException(AbstractC1482f.k(new StringBuilder(), this.kaAlgorithm, StubApp.getString2(30659)));
        }
        if (!(key instanceof PublicKey)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.kaAlgorithm);
            sb2.append(StubApp.getString2(30655));
            throw new InvalidKeyException(AbstractC1482f.k(sb2, getSimpleName(ECPublicKey.class), StubApp.getString2(30658)));
        }
        try {
            this.result = this.agreement.calculateAgreement(generatePublicKeyParameter((PublicKey) key));
            return null;
        } catch (Exception e10) {
            throw new InvalidKeyException(u.r(e10, new StringBuilder(StubApp.getString2(30657)))) { // from class: org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyAgreementSpi.1
                @Override // java.lang.Throwable
                public Throwable getCause() {
                    return e10;
                }
            };
        }
    }
}
