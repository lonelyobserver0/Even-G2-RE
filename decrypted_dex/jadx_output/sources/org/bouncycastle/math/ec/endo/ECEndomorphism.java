package org.bouncycastle.math.ec.endo;

import org.bouncycastle.math.ec.ECPointMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface ECEndomorphism {
    ECPointMap getPointMap();

    boolean hasEfficientPointMap();
}
