package org.bouncycastle.jce.interfaces;

import java.security.PublicKey;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface MQVPublicKey extends PublicKey {
    PublicKey getEphemeralKey();

    PublicKey getStaticKey();
}
