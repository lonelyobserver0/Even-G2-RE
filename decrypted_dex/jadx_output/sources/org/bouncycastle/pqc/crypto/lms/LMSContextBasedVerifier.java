package org.bouncycastle.pqc.crypto.lms;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface LMSContextBasedVerifier {
    LMSContext generateLMSContext(byte[] bArr);

    boolean verify(LMSContext lMSContext);
}
