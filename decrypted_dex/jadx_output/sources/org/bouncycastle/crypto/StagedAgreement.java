package org.bouncycastle.crypto;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface StagedAgreement extends BasicAgreement {
    AsymmetricKeyParameter calculateStage(CipherParameters cipherParameters);
}
