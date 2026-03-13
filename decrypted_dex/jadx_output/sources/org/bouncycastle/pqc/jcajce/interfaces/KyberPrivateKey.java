package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.PrivateKey;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface KyberPrivateKey extends PrivateKey, KyberKey {
    KyberPublicKey getPublicKey();
}
