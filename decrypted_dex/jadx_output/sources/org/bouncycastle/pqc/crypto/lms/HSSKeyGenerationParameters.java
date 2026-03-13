package org.bouncycastle.pqc.crypto.lms;

import com.stub.StubApp;
import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HSSKeyGenerationParameters extends KeyGenerationParameters {
    private final LMSParameters[] lmsParameters;

    public HSSKeyGenerationParameters(LMSParameters[] lMSParametersArr, SecureRandom secureRandom) {
        super(secureRandom, LmsUtils.calculateStrength(lMSParametersArr[0]));
        if (lMSParametersArr.length == 0 || lMSParametersArr.length > 8) {
            throw new IllegalArgumentException(StubApp.getString2(34030));
        }
        this.lmsParameters = lMSParametersArr;
    }

    public int getDepth() {
        return this.lmsParameters.length;
    }

    public LMSParameters[] getLmsParameters() {
        return this.lmsParameters;
    }
}
