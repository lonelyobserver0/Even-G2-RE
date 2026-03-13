package org.bouncycastle.jce.interfaces;

import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface ElGamalPublicKey extends ElGamalKey, DHPublicKey {
    BigInteger getY();
}
