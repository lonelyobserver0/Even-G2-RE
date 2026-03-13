package org.bouncycastle.jce.interfaces;

import java.math.BigInteger;
import javax.crypto.interfaces.DHPrivateKey;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface ElGamalPrivateKey extends ElGamalKey, DHPrivateKey {
    BigInteger getX();
}
