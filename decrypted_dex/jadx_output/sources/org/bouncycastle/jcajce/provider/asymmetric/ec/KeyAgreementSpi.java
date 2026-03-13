package org.bouncycastle.jcajce.provider.asymmetric.ec;

import com.stub.StubApp;
import i2.u;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.x9.X9IntegerConverter;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.agreement.ECDHBasicAgreement;
import org.bouncycastle.crypto.agreement.ECDHCBasicAgreement;
import org.bouncycastle.crypto.agreement.ECDHCUnifiedAgreement;
import org.bouncycastle.crypto.agreement.ECMQVBasicAgreement;
import org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.generators.KDF2BytesGenerator;
import org.bouncycastle.crypto.params.ECDHUPrivateParameters;
import org.bouncycastle.crypto.params.ECDHUPublicParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.MQVPrivateParameters;
import org.bouncycastle.crypto.params.MQVPublicParameters;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.spec.DHUParameterSpec;
import org.bouncycastle.jcajce.spec.MQVParameterSpec;
import org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec;
import org.bouncycastle.jce.interfaces.ECPrivateKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.interfaces.MQVPrivateKey;
import org.bouncycastle.jce.interfaces.MQVPublicKey;
import org.bouncycastle.util.Arrays;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {
    private static final X9IntegerConverter converter = new X9IntegerConverter();
    private Object agreement;
    private DHUParameterSpec dheParameters;
    private String kaAlgorithm;
    private MQVParameterSpec mqvParameters;
    private ECDomainParameters parameters;
    private byte[] result;

    public static class CDHwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA1KDFAndSharedInfo() {
            super(StubApp.getString2(30612), new ECDHCBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class CDHwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA224KDFAndSharedInfo() {
            super(StubApp.getString2(30613), new ECDHCBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA224()));
        }
    }

    public static class CDHwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA256KDFAndSharedInfo() {
            super(StubApp.getString2(30614), new ECDHCBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class CDHwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA384KDFAndSharedInfo() {
            super(StubApp.getString2(30615), new ECDHCBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class CDHwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA512KDFAndSharedInfo() {
            super(StubApp.getString2(30616), new ECDHCBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA512()));
        }
    }

    public static class DH extends KeyAgreementSpi {
        public DH() {
            super(StubApp.getString2(28368), new ECDHBasicAgreement(), (DerivationFunction) null);
        }
    }

    public static class DHC extends KeyAgreementSpi {
        public DHC() {
            super(StubApp.getString2(30617), new ECDHCBasicAgreement(), (DerivationFunction) null);
        }
    }

    public static class DHUC extends KeyAgreementSpi {
        public DHUC() {
            super(StubApp.getString2(28373), new ECDHCUnifiedAgreement(), (DerivationFunction) null);
        }
    }

    public static class DHUwithSHA1CKDF extends KeyAgreementSpi {
        public DHUwithSHA1CKDF() {
            super(StubApp.getString2(30618), new ECDHCUnifiedAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class DHUwithSHA1KDF extends KeyAgreementSpi {
        public DHUwithSHA1KDF() {
            super(StubApp.getString2(30619), new ECDHCUnifiedAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class DHUwithSHA224CKDF extends KeyAgreementSpi {
        public DHUwithSHA224CKDF() {
            super(StubApp.getString2(30620), new ECDHCUnifiedAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA224()));
        }
    }

    public static class DHUwithSHA224KDF extends KeyAgreementSpi {
        public DHUwithSHA224KDF() {
            super(StubApp.getString2(30621), new ECDHCUnifiedAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA224()));
        }
    }

    public static class DHUwithSHA256CKDF extends KeyAgreementSpi {
        public DHUwithSHA256CKDF() {
            super(StubApp.getString2(30622), new ECDHCUnifiedAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class DHUwithSHA256KDF extends KeyAgreementSpi {
        public DHUwithSHA256KDF() {
            super(StubApp.getString2(30623), new ECDHCUnifiedAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class DHUwithSHA384CKDF extends KeyAgreementSpi {
        public DHUwithSHA384CKDF() {
            super(StubApp.getString2(30624), new ECDHCUnifiedAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class DHUwithSHA384KDF extends KeyAgreementSpi {
        public DHUwithSHA384KDF() {
            super(StubApp.getString2(30625), new ECDHCUnifiedAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class DHUwithSHA512CKDF extends KeyAgreementSpi {
        public DHUwithSHA512CKDF() {
            super(StubApp.getString2(30626), new ECDHCUnifiedAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA512()));
        }
    }

    public static class DHUwithSHA512KDF extends KeyAgreementSpi {
        public DHUwithSHA512KDF() {
            super(StubApp.getString2(30627), new ECDHCUnifiedAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA512()));
        }
    }

    public static class DHwithSHA1CKDF extends KeyAgreementSpi {
        public DHwithSHA1CKDF() {
            super(StubApp.getString2(30628), new ECDHCBasicAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class DHwithSHA1KDF extends KeyAgreementSpi {
        public DHwithSHA1KDF() {
            super(StubApp.getString2(30629), new ECDHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class DHwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA1KDFAndSharedInfo() {
            super(StubApp.getString2(30629), new ECDHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class DHwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA224KDFAndSharedInfo() {
            super(StubApp.getString2(30630), new ECDHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA224()));
        }
    }

    public static class DHwithSHA256CKDF extends KeyAgreementSpi {
        public DHwithSHA256CKDF() {
            super(StubApp.getString2(30631), new ECDHCBasicAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class DHwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA256KDFAndSharedInfo() {
            super(StubApp.getString2(30632), new ECDHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class DHwithSHA384CKDF extends KeyAgreementSpi {
        public DHwithSHA384CKDF() {
            super(StubApp.getString2(30633), new ECDHCBasicAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class DHwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA384KDFAndSharedInfo() {
            super(StubApp.getString2(30634), new ECDHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class DHwithSHA512CKDF extends KeyAgreementSpi {
        public DHwithSHA512CKDF() {
            super(StubApp.getString2(30635), new ECDHCBasicAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA512()));
        }
    }

    public static class DHwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA512KDFAndSharedInfo() {
            super(StubApp.getString2(30636), new ECDHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA512()));
        }
    }

    public static class ECKAEGwithRIPEMD160KDF extends KeyAgreementSpi {
        public ECKAEGwithRIPEMD160KDF() {
            super(StubApp.getString2(30637), new ECDHBasicAgreement(), new KDF2BytesGenerator(new RIPEMD160Digest()));
        }
    }

    public static class ECKAEGwithSHA1KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA1KDF() {
            super(StubApp.getString2(30638), new ECDHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class ECKAEGwithSHA224KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA224KDF() {
            super(StubApp.getString2(30639), new ECDHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA224()));
        }
    }

    public static class ECKAEGwithSHA256KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA256KDF() {
            super(StubApp.getString2(30640), new ECDHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class ECKAEGwithSHA384KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA384KDF() {
            super(StubApp.getString2(30641), new ECDHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class ECKAEGwithSHA512KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA512KDF() {
            super(StubApp.getString2(30642), new ECDHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA512()));
        }
    }

    public static class MQV extends KeyAgreementSpi {
        public MQV() {
            super(StubApp.getString2(28378), new ECMQVBasicAgreement(), (DerivationFunction) null);
        }
    }

    public static class MQVwithSHA1CKDF extends KeyAgreementSpi {
        public MQVwithSHA1CKDF() {
            super(StubApp.getString2(30643), new ECMQVBasicAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class MQVwithSHA1KDF extends KeyAgreementSpi {
        public MQVwithSHA1KDF() {
            super(StubApp.getString2(30644), new ECMQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class MQVwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA1KDFAndSharedInfo() {
            super(StubApp.getString2(30644), new ECMQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class MQVwithSHA224CKDF extends KeyAgreementSpi {
        public MQVwithSHA224CKDF() {
            super(StubApp.getString2(30645), new ECMQVBasicAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA224()));
        }
    }

    public static class MQVwithSHA224KDF extends KeyAgreementSpi {
        public MQVwithSHA224KDF() {
            super(StubApp.getString2(30646), new ECMQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA224()));
        }
    }

    public static class MQVwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA224KDFAndSharedInfo() {
            super(StubApp.getString2(30646), new ECMQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA224()));
        }
    }

    public static class MQVwithSHA256CKDF extends KeyAgreementSpi {
        public MQVwithSHA256CKDF() {
            super(StubApp.getString2(30647), new ECMQVBasicAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class MQVwithSHA256KDF extends KeyAgreementSpi {
        public MQVwithSHA256KDF() {
            super(StubApp.getString2(30648), new ECMQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class MQVwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA256KDFAndSharedInfo() {
            super(StubApp.getString2(30648), new ECMQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class MQVwithSHA384CKDF extends KeyAgreementSpi {
        public MQVwithSHA384CKDF() {
            super(StubApp.getString2(30649), new ECMQVBasicAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class MQVwithSHA384KDF extends KeyAgreementSpi {
        public MQVwithSHA384KDF() {
            super(StubApp.getString2(30650), new ECMQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class MQVwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA384KDFAndSharedInfo() {
            super(StubApp.getString2(30650), new ECMQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class MQVwithSHA512CKDF extends KeyAgreementSpi {
        public MQVwithSHA512CKDF() {
            super(StubApp.getString2(30651), new ECMQVBasicAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA512()));
        }
    }

    public static class MQVwithSHA512KDF extends KeyAgreementSpi {
        public MQVwithSHA512KDF() {
            super(StubApp.getString2(30652), new ECMQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA512()));
        }
    }

    public static class MQVwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA512KDFAndSharedInfo() {
            super(StubApp.getString2(30652), new ECMQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA512()));
        }
    }

    public KeyAgreementSpi(String str, BasicAgreement basicAgreement, DerivationFunction derivationFunction) {
        super(str, derivationFunction);
        this.kaAlgorithm = str;
        this.agreement = basicAgreement;
    }

    private static String getSimpleName(Class cls) {
        String name = cls.getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    public byte[] bigIntToBytes(BigInteger bigInteger) {
        X9IntegerConverter x9IntegerConverter = converter;
        return x9IntegerConverter.integerToBytes(bigInteger, x9IntegerConverter.getByteLength(this.parameters.getCurve()));
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public byte[] doCalcSecret() {
        return Arrays.clone(this.result);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public void doInitFromKey(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        ECPrivateKeyParameters eCPrivateKeyParameters;
        ECPrivateKeyParameters eCPrivateKeyParameters2;
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof MQVParameterSpec) && !(algorithmParameterSpec instanceof UserKeyingMaterialSpec) && !(algorithmParameterSpec instanceof DHUParameterSpec)) {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(30653));
        }
        Object obj = this.agreement;
        boolean z2 = obj instanceof ECMQVBasicAgreement;
        String string2 = StubApp.getString2(30654);
        String string22 = StubApp.getString2(30655);
        ECPublicKeyParameters eCPublicKeyParameters = null;
        if (z2) {
            this.mqvParameters = null;
            boolean z10 = key instanceof MQVPrivateKey;
            if (!z10 && !(algorithmParameterSpec instanceof MQVParameterSpec)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.kaAlgorithm);
                sb2.append(string22);
                throw new InvalidAlgorithmParameterException(AbstractC1482f.k(sb2, getSimpleName(MQVParameterSpec.class), string2));
            }
            if (z10) {
                MQVPrivateKey mQVPrivateKey = (MQVPrivateKey) key;
                eCPrivateKeyParameters2 = (ECPrivateKeyParameters) ECUtil.generatePrivateKeyParameter(mQVPrivateKey.getStaticPrivateKey());
                eCPrivateKeyParameters = (ECPrivateKeyParameters) ECUtil.generatePrivateKeyParameter(mQVPrivateKey.getEphemeralPrivateKey());
                if (mQVPrivateKey.getEphemeralPublicKey() != null) {
                    eCPublicKeyParameters = (ECPublicKeyParameters) ECUtils.generatePublicKeyParameter(mQVPrivateKey.getEphemeralPublicKey());
                }
            } else {
                MQVParameterSpec mQVParameterSpec = (MQVParameterSpec) algorithmParameterSpec;
                ECPrivateKeyParameters eCPrivateKeyParameters3 = (ECPrivateKeyParameters) ECUtil.generatePrivateKeyParameter((PrivateKey) key);
                eCPrivateKeyParameters = (ECPrivateKeyParameters) ECUtil.generatePrivateKeyParameter(mQVParameterSpec.getEphemeralPrivateKey());
                eCPublicKeyParameters = mQVParameterSpec.getEphemeralPublicKey() != null ? (ECPublicKeyParameters) ECUtils.generatePublicKeyParameter(mQVParameterSpec.getEphemeralPublicKey()) : null;
                this.mqvParameters = mQVParameterSpec;
                this.ukmParameters = mQVParameterSpec.getUserKeyingMaterial();
                eCPrivateKeyParameters2 = eCPrivateKeyParameters3;
            }
            MQVPrivateParameters mQVPrivateParameters = new MQVPrivateParameters(eCPrivateKeyParameters2, eCPrivateKeyParameters, eCPublicKeyParameters);
            this.parameters = eCPrivateKeyParameters2.getParameters();
            ((ECMQVBasicAgreement) this.agreement).init(mQVPrivateParameters);
            return;
        }
        if (!(algorithmParameterSpec instanceof DHUParameterSpec)) {
            if (!(key instanceof PrivateKey)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.kaAlgorithm);
                sb3.append(string22);
                throw new InvalidKeyException(AbstractC1482f.k(sb3, getSimpleName(ECPrivateKey.class), string2));
            }
            if (this.kdf == null && (algorithmParameterSpec instanceof UserKeyingMaterialSpec)) {
                throw new InvalidAlgorithmParameterException(StubApp.getString2(30550));
            }
            ECPrivateKeyParameters eCPrivateKeyParameters4 = (ECPrivateKeyParameters) ECUtil.generatePrivateKeyParameter((PrivateKey) key);
            this.parameters = eCPrivateKeyParameters4.getParameters();
            this.ukmParameters = algorithmParameterSpec instanceof UserKeyingMaterialSpec ? ((UserKeyingMaterialSpec) algorithmParameterSpec).getUserKeyingMaterial() : null;
            ((BasicAgreement) this.agreement).init(eCPrivateKeyParameters4);
            return;
        }
        if (!(obj instanceof ECDHCUnifiedAgreement)) {
            throw new InvalidAlgorithmParameterException(this.kaAlgorithm + StubApp.getString2(30656) + getSimpleName(DHUParameterSpec.class));
        }
        DHUParameterSpec dHUParameterSpec = (DHUParameterSpec) algorithmParameterSpec;
        ECPrivateKeyParameters eCPrivateKeyParameters5 = (ECPrivateKeyParameters) ECUtil.generatePrivateKeyParameter((PrivateKey) key);
        ECPrivateKeyParameters eCPrivateKeyParameters6 = (ECPrivateKeyParameters) ECUtil.generatePrivateKeyParameter(dHUParameterSpec.getEphemeralPrivateKey());
        ECPublicKeyParameters eCPublicKeyParameters2 = dHUParameterSpec.getEphemeralPublicKey() != null ? (ECPublicKeyParameters) ECUtils.generatePublicKeyParameter(dHUParameterSpec.getEphemeralPublicKey()) : null;
        this.dheParameters = dHUParameterSpec;
        this.ukmParameters = dHUParameterSpec.getUserKeyingMaterial();
        ECDHUPrivateParameters eCDHUPrivateParameters = new ECDHUPrivateParameters(eCPrivateKeyParameters5, eCPrivateKeyParameters6, eCPublicKeyParameters2);
        this.parameters = eCPrivateKeyParameters5.getParameters();
        ((ECDHCUnifiedAgreement) this.agreement).init(eCDHUPrivateParameters);
    }

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z2) throws InvalidKeyException, IllegalStateException {
        CipherParameters generatePublicKeyParameter;
        if (this.parameters == null) {
            throw new IllegalStateException(AbstractC1482f.k(new StringBuilder(), this.kaAlgorithm, StubApp.getString2(30660)));
        }
        if (!z2) {
            throw new IllegalStateException(AbstractC1482f.k(new StringBuilder(), this.kaAlgorithm, StubApp.getString2(30659)));
        }
        Object obj = this.agreement;
        if (obj instanceof ECMQVBasicAgreement) {
            if (key instanceof MQVPublicKey) {
                MQVPublicKey mQVPublicKey = (MQVPublicKey) key;
                generatePublicKeyParameter = new MQVPublicParameters((ECPublicKeyParameters) ECUtils.generatePublicKeyParameter(mQVPublicKey.getStaticKey()), (ECPublicKeyParameters) ECUtils.generatePublicKeyParameter(mQVPublicKey.getEphemeralKey()));
            } else {
                generatePublicKeyParameter = new MQVPublicParameters((ECPublicKeyParameters) ECUtils.generatePublicKeyParameter((PublicKey) key), (ECPublicKeyParameters) ECUtils.generatePublicKeyParameter(this.mqvParameters.getOtherPartyEphemeralKey()));
            }
        } else if (obj instanceof ECDHCUnifiedAgreement) {
            generatePublicKeyParameter = new ECDHUPublicParameters((ECPublicKeyParameters) ECUtils.generatePublicKeyParameter((PublicKey) key), (ECPublicKeyParameters) ECUtils.generatePublicKeyParameter(this.dheParameters.getOtherPartyEphemeralKey()));
        } else {
            if (!(key instanceof PublicKey)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.kaAlgorithm);
                sb2.append(StubApp.getString2(30655));
                throw new InvalidKeyException(AbstractC1482f.k(sb2, getSimpleName(ECPublicKey.class), StubApp.getString2(30658)));
            }
            generatePublicKeyParameter = ECUtils.generatePublicKeyParameter((PublicKey) key);
        }
        try {
            Object obj2 = this.agreement;
            if (obj2 instanceof BasicAgreement) {
                this.result = bigIntToBytes(((BasicAgreement) obj2).calculateAgreement(generatePublicKeyParameter));
                return null;
            }
            this.result = ((ECDHCUnifiedAgreement) obj2).calculateAgreement(generatePublicKeyParameter);
            return null;
        } catch (Exception e10) {
            throw new InvalidKeyException(u.r(e10, new StringBuilder(StubApp.getString2(30657)))) { // from class: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi.1
                @Override // java.lang.Throwable
                public Throwable getCause() {
                    return e10;
                }
            };
        }
    }

    public KeyAgreementSpi(String str, ECDHCUnifiedAgreement eCDHCUnifiedAgreement, DerivationFunction derivationFunction) {
        super(str, derivationFunction);
        this.kaAlgorithm = str;
        this.agreement = eCDHCUnifiedAgreement;
    }
}
