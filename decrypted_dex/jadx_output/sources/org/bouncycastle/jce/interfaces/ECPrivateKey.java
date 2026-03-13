package org.bouncycastle.jce.interfaces;

import java.math.BigInteger;
import java.security.PrivateKey;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface ECPrivateKey extends ECKey, PrivateKey {
    BigInteger getD();
}
