package org.bouncycastle.crypto.generators;

import com.stub.StubApp;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.DESParameters;
import org.bouncycastle.crypto.params.DESedeParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DESedeKeyGenerator extends DESKeyGenerator {
    private static final int MAX_IT = 20;

    @Override // org.bouncycastle.crypto.generators.DESKeyGenerator, org.bouncycastle.crypto.CipherKeyGenerator
    public byte[] generateKey() {
        int i3 = this.strength;
        byte[] bArr = new byte[i3];
        int i10 = 0;
        while (true) {
            this.random.nextBytes(bArr);
            DESParameters.setOddParity(bArr);
            i10++;
            if (i10 >= 20 || (!DESedeParameters.isWeakKey(bArr, 0, i3) && DESedeParameters.isRealEDEKey(bArr, 0))) {
                break;
            }
        }
        if (DESedeParameters.isWeakKey(bArr, 0, i3) || !DESedeParameters.isRealEDEKey(bArr, 0)) {
            throw new IllegalStateException(StubApp.getString2(28895));
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.generators.DESKeyGenerator, org.bouncycastle.crypto.CipherKeyGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.random = keyGenerationParameters.getRandom();
        int strength = (keyGenerationParameters.getStrength() + 7) / 8;
        this.strength = strength;
        if (strength == 0 || strength == 21) {
            this.strength = 24;
        } else if (strength == 14) {
            this.strength = 16;
        } else if (strength != 24 && strength != 16) {
            throw new IllegalArgumentException(StubApp.getString2(28896));
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(StubApp.getString2(28897), 112, null, CryptoServicePurpose.KEYGEN));
    }
}
