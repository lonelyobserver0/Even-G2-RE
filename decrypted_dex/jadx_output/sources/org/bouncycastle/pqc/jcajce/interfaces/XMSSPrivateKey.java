package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.PrivateKey;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface XMSSPrivateKey extends XMSSKey, PrivateKey {
    XMSSPrivateKey extractKeyShard(int i3);

    long getIndex();

    long getUsagesRemaining();
}
