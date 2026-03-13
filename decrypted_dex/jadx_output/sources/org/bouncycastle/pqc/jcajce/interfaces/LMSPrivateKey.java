package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.PrivateKey;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface LMSPrivateKey extends LMSKey, PrivateKey {
    LMSPrivateKey extractKeyShard(int i3);

    long getIndex();

    long getUsagesRemaining();
}
