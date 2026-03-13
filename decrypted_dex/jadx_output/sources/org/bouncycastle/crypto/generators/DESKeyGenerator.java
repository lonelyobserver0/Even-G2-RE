package org.bouncycastle.crypto.generators;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.DESParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DESKeyGenerator extends CipherKeyGenerator {
    @Override // org.bouncycastle.crypto.CipherKeyGenerator
    public byte[] generateKey() {
        byte[] bArr = new byte[8];
        do {
            this.random.nextBytes(bArr);
            DESParameters.setOddParity(bArr);
        } while (DESParameters.isWeakKey(bArr, 0));
        return bArr;
    }

    @Override // org.bouncycastle.crypto.CipherKeyGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        super.init(keyGenerationParameters);
        int i3 = this.strength;
        if (i3 == 0 || i3 == 7) {
            this.strength = 8;
        } else if (i3 != 8) {
            throw new IllegalArgumentException(StubApp.getString2(28893));
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(StubApp.getString2(28894), 56, null, CryptoServicePurpose.KEYGEN));
    }
}
