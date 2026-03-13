package org.bouncycastle.pqc.jcajce.provider.newhope;

import com.stub.StubApp;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.ShortBufferException;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.pqc.crypto.ExchangePair;
import org.bouncycastle.pqc.crypto.newhope.NHAgreement;
import org.bouncycastle.pqc.crypto.newhope.NHExchangePairGenerator;
import org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {
    private NHAgreement agreement;
    private NHExchangePairGenerator exchangePairGenerator;
    private BCNHPublicKey otherPartyKey;
    private byte[] shared;

    public KeyAgreementSpi() {
        super(StubApp.getString2(34400), null);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public byte[] doCalcSecret() {
        return engineGenerateSecret();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public void doInitFromKey(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException(StubApp.getString2(34693));
    }

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z2) throws InvalidKeyException, IllegalStateException {
        if (!z2) {
            throw new IllegalStateException(StubApp.getString2(34694));
        }
        BCNHPublicKey bCNHPublicKey = (BCNHPublicKey) key;
        this.otherPartyKey = bCNHPublicKey;
        NHExchangePairGenerator nHExchangePairGenerator = this.exchangePairGenerator;
        if (nHExchangePairGenerator == null) {
            this.shared = this.agreement.calculateAgreement(bCNHPublicKey.getKeyParams());
            return null;
        }
        ExchangePair generateExchange = nHExchangePairGenerator.generateExchange((AsymmetricKeyParameter) bCNHPublicKey.getKeyParams());
        this.shared = generateExchange.getSharedValue();
        return new BCNHPublicKey((NHPublicKeyParameters) generateExchange.getPublicKey());
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public int engineGenerateSecret(byte[] bArr, int i3) throws IllegalStateException, ShortBufferException {
        byte[] bArr2 = this.shared;
        System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
        Arrays.fill(this.shared, (byte) 0);
        return this.shared.length;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        if (key == null) {
            this.exchangePairGenerator = new NHExchangePairGenerator(secureRandom);
            return;
        }
        NHAgreement nHAgreement = new NHAgreement();
        this.agreement = nHAgreement;
        nHAgreement.init(((BCNHPrivateKey) key).getKeyParams());
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public byte[] engineGenerateSecret() throws IllegalStateException {
        byte[] clone = Arrays.clone(this.shared);
        Arrays.fill(this.shared, (byte) 0);
        return clone;
    }
}
