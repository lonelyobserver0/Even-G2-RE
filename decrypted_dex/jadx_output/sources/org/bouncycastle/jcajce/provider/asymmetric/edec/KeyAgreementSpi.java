package org.bouncycastle.jcajce.provider.asymmetric.edec;

import com.stub.StubApp;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.RawAgreement;
import org.bouncycastle.crypto.agreement.X25519Agreement;
import org.bouncycastle.crypto.agreement.X448Agreement;
import org.bouncycastle.crypto.agreement.XDHUnifiedAgreement;
import org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator;
import org.bouncycastle.crypto.generators.KDF2BytesGenerator;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.X25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.X448PrivateKeyParameters;
import org.bouncycastle.crypto.params.XDHUPrivateParameters;
import org.bouncycastle.crypto.params.XDHUPublicParameters;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jcajce.spec.DHUParameterSpec;
import org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {
    private RawAgreement agreement;
    private DHUParameterSpec dhuSpec;
    private byte[] result;

    public static final class X25519 extends KeyAgreementSpi {
        public X25519() {
            super(StubApp.getString2(28389));
        }
    }

    public static class X25519UwithSHA256CKDF extends KeyAgreementSpi {
        public X25519UwithSHA256CKDF() {
            super(StubApp.getString2(30686), new ConcatenationKDFGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class X25519UwithSHA256KDF extends KeyAgreementSpi {
        public X25519UwithSHA256KDF() {
            super(StubApp.getString2(30687), new KDF2BytesGenerator(DigestFactory.createSHA256()));
        }
    }

    public static final class X25519withSHA256CKDF extends KeyAgreementSpi {
        public X25519withSHA256CKDF() {
            super(StubApp.getString2(30688), new ConcatenationKDFGenerator(DigestFactory.createSHA256()));
        }
    }

    public static final class X25519withSHA256KDF extends KeyAgreementSpi {
        public X25519withSHA256KDF() {
            super(StubApp.getString2(30689), new KDF2BytesGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class X25519withSHA384CKDF extends KeyAgreementSpi {
        public X25519withSHA384CKDF() {
            super(StubApp.getString2(30690), new ConcatenationKDFGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class X25519withSHA512CKDF extends KeyAgreementSpi {
        public X25519withSHA512CKDF() {
            super(StubApp.getString2(30691), new ConcatenationKDFGenerator(DigestFactory.createSHA512()));
        }
    }

    public static final class X448 extends KeyAgreementSpi {
        public X448() {
            super(StubApp.getString2(28390));
        }
    }

    public static class X448UwithSHA512CKDF extends KeyAgreementSpi {
        public X448UwithSHA512CKDF() {
            super(StubApp.getString2(30692), new ConcatenationKDFGenerator(DigestFactory.createSHA512()));
        }
    }

    public static class X448UwithSHA512KDF extends KeyAgreementSpi {
        public X448UwithSHA512KDF() {
            super(StubApp.getString2(30693), new KDF2BytesGenerator(DigestFactory.createSHA512()));
        }
    }

    public static final class X448withSHA256CKDF extends KeyAgreementSpi {
        public X448withSHA256CKDF() {
            super(StubApp.getString2(30694), new ConcatenationKDFGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class X448withSHA384CKDF extends KeyAgreementSpi {
        public X448withSHA384CKDF() {
            super(StubApp.getString2(30695), new ConcatenationKDFGenerator(DigestFactory.createSHA384()));
        }
    }

    public static final class X448withSHA512CKDF extends KeyAgreementSpi {
        public X448withSHA512CKDF() {
            super(StubApp.getString2(30696), new ConcatenationKDFGenerator(DigestFactory.createSHA512()));
        }
    }

    public static final class X448withSHA512KDF extends KeyAgreementSpi {
        public X448withSHA512KDF() {
            super(StubApp.getString2(30697), new KDF2BytesGenerator(DigestFactory.createSHA512()));
        }
    }

    public static final class XDH extends KeyAgreementSpi {
        public XDH() {
            super(StubApp.getString2(30186));
        }
    }

    public KeyAgreementSpi(String str) {
        super(str, null);
    }

    private RawAgreement getAgreement(String str) throws InvalidKeyException {
        if (this.kaAlgorithm.equals(StubApp.getString2(30186)) || this.kaAlgorithm.startsWith(str)) {
            int indexOf = this.kaAlgorithm.indexOf(85);
            boolean startsWith = str.startsWith(StubApp.getString2(28390));
            return indexOf > 0 ? startsWith ? new XDHUnifiedAgreement(new X448Agreement()) : new XDHUnifiedAgreement(new X25519Agreement()) : startsWith ? new X448Agreement() : new X25519Agreement();
        }
        throw new InvalidKeyException(StubApp.getString2(30698) + this.kaAlgorithm);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public byte[] doCalcSecret() {
        return this.result;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public void doInitFromKey(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String string2;
        if (!(key instanceof PrivateKey)) {
            throw new InvalidKeyException(StubApp.getString2(30701));
        }
        AsymmetricKeyParameter generatePrivateKeyParameter = EdECUtil.generatePrivateKeyParameter((PrivateKey) key);
        if (generatePrivateKeyParameter instanceof X25519PrivateKeyParameters) {
            string2 = StubApp.getString2(28389);
        } else {
            if (!(generatePrivateKeyParameter instanceof X448PrivateKeyParameters)) {
                throw new IllegalStateException(StubApp.getString2(30700));
            }
            string2 = StubApp.getString2(28390);
        }
        this.agreement = getAgreement(string2);
        this.ukmParameters = null;
        if (algorithmParameterSpec instanceof DHUParameterSpec) {
            if (this.kaAlgorithm.indexOf(85) < 0) {
                throw new InvalidAlgorithmParameterException(StubApp.getString2(30548));
            }
            DHUParameterSpec dHUParameterSpec = (DHUParameterSpec) algorithmParameterSpec;
            this.dhuSpec = dHUParameterSpec;
            this.ukmParameters = dHUParameterSpec.getUserKeyingMaterial();
            this.agreement.init(new XDHUPrivateParameters(generatePrivateKeyParameter, ((BCXDHPrivateKey) this.dhuSpec.getEphemeralPrivateKey()).engineGetKeyParameters(), ((BCXDHPublicKey) this.dhuSpec.getEphemeralPublicKey()).engineGetKeyParameters()));
        } else if (algorithmParameterSpec != null) {
            this.agreement.init(generatePrivateKeyParameter);
            if (!(algorithmParameterSpec instanceof UserKeyingMaterialSpec)) {
                throw new InvalidAlgorithmParameterException(StubApp.getString2(30699));
            }
            if (this.kdf == null) {
                throw new InvalidAlgorithmParameterException(StubApp.getString2(30550));
            }
            this.ukmParameters = ((UserKeyingMaterialSpec) algorithmParameterSpec).getUserKeyingMaterial();
        } else {
            this.agreement.init(generatePrivateKeyParameter);
        }
        if (this.kdf == null || this.ukmParameters != null) {
            return;
        }
        this.ukmParameters = new byte[0];
    }

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z2) throws InvalidKeyException, IllegalStateException {
        if (!(key instanceof PublicKey)) {
            throw new InvalidKeyException(StubApp.getString2(30702));
        }
        if (this.agreement == null) {
            throw new IllegalStateException(AbstractC1482f.k(new StringBuilder(), this.kaAlgorithm, StubApp.getString2(30660)));
        }
        if (!z2) {
            throw new IllegalStateException(AbstractC1482f.k(new StringBuilder(), this.kaAlgorithm, StubApp.getString2(30659)));
        }
        AsymmetricKeyParameter generatePublicKeyParameter = EdECUtil.generatePublicKeyParameter((PublicKey) key);
        byte[] bArr = new byte[this.agreement.getAgreementSize()];
        this.result = bArr;
        DHUParameterSpec dHUParameterSpec = this.dhuSpec;
        if (dHUParameterSpec != null) {
            this.agreement.calculateAgreement(new XDHUPublicParameters(generatePublicKeyParameter, ((BCXDHPublicKey) dHUParameterSpec.getOtherPartyEphemeralKey()).engineGetKeyParameters()), this.result, 0);
            return null;
        }
        this.agreement.calculateAgreement(generatePublicKeyParameter, bArr, 0);
        return null;
    }

    public KeyAgreementSpi(String str, DerivationFunction derivationFunction) {
        super(str, derivationFunction);
    }
}
