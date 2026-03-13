package org.bouncycastle.pqc.crypto.lms;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface LMSContextBasedSigner {
    LMSContext generateLMSContext();

    byte[] generateSignature(LMSContext lMSContext);

    long getUsagesRemaining();
}
