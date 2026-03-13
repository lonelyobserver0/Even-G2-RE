package org.bouncycastle.pqc.crypto;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface StateAwareMessageSigner extends MessageSigner {
    AsymmetricKeyParameter getUpdatedPrivateKey();
}
