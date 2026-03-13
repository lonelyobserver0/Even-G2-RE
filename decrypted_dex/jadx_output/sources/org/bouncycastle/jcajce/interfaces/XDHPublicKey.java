package org.bouncycastle.jcajce.interfaces;

import java.math.BigInteger;
import java.security.PublicKey;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface XDHPublicKey extends XDHKey, PublicKey {
    BigInteger getU();

    byte[] getUEncoding();
}
