package org.bouncycastle.pqc.crypto.sphincsplus;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SPHINCSPlusKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private SPHINCSPlusParameters parameters;
    private SecureRandom random;

    private byte[] sec_rand(int i3) {
        byte[] bArr = new byte[i3];
        this.random.nextBytes(bArr);
        return bArr;
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        SK sk;
        byte[] sec_rand;
        SPHINCSPlusEngine engine = this.parameters.getEngine();
        if (engine instanceof SPHINCSPlusEngine.HarakaSEngine) {
            byte[] sec_rand2 = sec_rand(engine.f19474N * 3);
            int i3 = engine.f19474N;
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[i3];
            sec_rand = new byte[i3];
            System.arraycopy(sec_rand2, 0, bArr, 0, i3);
            int i10 = engine.f19474N;
            System.arraycopy(sec_rand2, i10, bArr2, 0, i10);
            int i11 = engine.f19474N;
            System.arraycopy(sec_rand2, i11 << 1, sec_rand, 0, i11);
            sk = new SK(bArr, bArr2);
        } else {
            sk = new SK(sec_rand(engine.f19474N), sec_rand(engine.f19474N));
            sec_rand = sec_rand(engine.f19474N);
        }
        engine.init(sec_rand);
        PK pk = new PK(sec_rand, new HT(engine, sk.seed, sec_rand).htPubKey);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new SPHINCSPlusPublicKeyParameters(this.parameters, pk), (AsymmetricKeyParameter) new SPHINCSPlusPrivateKeyParameters(this.parameters, sk, pk));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.random = keyGenerationParameters.getRandom();
        this.parameters = ((SPHINCSPlusKeyGenerationParameters) keyGenerationParameters).getParameters();
    }
}
