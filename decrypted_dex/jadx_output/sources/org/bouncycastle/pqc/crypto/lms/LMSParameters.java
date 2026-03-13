package org.bouncycastle.pqc.crypto.lms;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class LMSParameters {
    private final LMOtsParameters lmOTSParam;
    private final LMSigParameters lmSigParam;

    public LMSParameters(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters) {
        this.lmSigParam = lMSigParameters;
        this.lmOTSParam = lMOtsParameters;
    }

    public LMOtsParameters getLMOTSParam() {
        return this.lmOTSParam;
    }

    public LMSigParameters getLMSigParam() {
        return this.lmSigParam;
    }
}
