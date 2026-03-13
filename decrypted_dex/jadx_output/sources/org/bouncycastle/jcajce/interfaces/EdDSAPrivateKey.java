package org.bouncycastle.jcajce.interfaces;

import java.security.PrivateKey;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface EdDSAPrivateKey extends EdDSAKey, PrivateKey {
    EdDSAPublicKey getPublicKey();
}
