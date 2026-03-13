package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.pqc.crypto.lms.LMOtsParameters;
import org.bouncycastle.pqc.crypto.lms.LMSigParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class LMSParameterSpec implements AlgorithmParameterSpec {
    private final LMOtsParameters lmOtsParameters;
    private final LMSigParameters lmSigParams;

    public LMSParameterSpec(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters) {
        this.lmSigParams = lMSigParameters;
        this.lmOtsParameters = lMOtsParameters;
    }

    public LMOtsParameters getOtsParams() {
        return this.lmOtsParameters;
    }

    public LMSigParameters getSigParams() {
        return this.lmSigParams;
    }
}
