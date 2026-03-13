package org.bouncycastle.math.ec.endo;

import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface GLVEndomorphism extends ECEndomorphism {
    BigInteger[] decomposeScalar(BigInteger bigInteger);
}
