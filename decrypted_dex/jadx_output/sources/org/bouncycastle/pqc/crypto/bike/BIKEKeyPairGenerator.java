package org.bouncycastle.pqc.crypto.bike;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BIKEKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private int L_BYTE;
    private int R_BYTE;
    private BIKEKeyGenerationParameters bikeKeyGenerationParameters;
    private int hw;

    /* renamed from: l, reason: collision with root package name */
    private int f19357l;
    private int nbIter;

    /* renamed from: r, reason: collision with root package name */
    private int f19358r;
    private SecureRandom random;

    /* renamed from: t, reason: collision with root package name */
    private int f19359t;
    private int tau;

    /* renamed from: w, reason: collision with root package name */
    private int f19360w;

    private AsymmetricCipherKeyPair genKeyPair() {
        BIKEEngine engine = this.bikeKeyGenerationParameters.getParameters().getEngine();
        int i3 = this.R_BYTE;
        byte[] bArr = new byte[i3];
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[i3];
        byte[] bArr4 = new byte[this.L_BYTE];
        engine.genKeyPair(bArr, bArr2, bArr4, bArr3, this.random);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new BIKEPublicKeyParameters(this.bikeKeyGenerationParameters.getParameters(), bArr3), (AsymmetricKeyParameter) new BIKEPrivateKeyParameters(this.bikeKeyGenerationParameters.getParameters(), bArr, bArr2, bArr4));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.bikeKeyGenerationParameters = (BIKEKeyGenerationParameters) keyGenerationParameters;
        this.random = keyGenerationParameters.getRandom();
        this.f19358r = this.bikeKeyGenerationParameters.getParameters().getR();
        this.f19360w = this.bikeKeyGenerationParameters.getParameters().getW();
        this.f19357l = this.bikeKeyGenerationParameters.getParameters().getL();
        this.f19359t = this.bikeKeyGenerationParameters.getParameters().getT();
        this.nbIter = this.bikeKeyGenerationParameters.getParameters().getNbIter();
        this.tau = this.bikeKeyGenerationParameters.getParameters().getTau();
        this.hw = this.f19360w / 2;
        this.L_BYTE = this.f19357l / 8;
        this.R_BYTE = (this.f19358r + 7) / 8;
    }
}
