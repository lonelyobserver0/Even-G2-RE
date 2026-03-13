package org.bouncycastle.jcajce.interfaces;

import java.security.PublicKey;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface EdDSAPublicKey extends EdDSAKey, PublicKey {
    byte[] getPointEncoding();
}
