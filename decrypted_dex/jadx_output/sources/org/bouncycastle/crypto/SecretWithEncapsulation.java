package org.bouncycastle.crypto;

import javax.security.auth.Destroyable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface SecretWithEncapsulation extends Destroyable {
    byte[] getEncapsulation();

    byte[] getSecret();
}
