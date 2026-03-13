package org.bouncycastle.jcajce.provider.asymmetric.util;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PrimeCertaintyCalculator {
    private PrimeCertaintyCalculator() {
    }

    public static int getDefaultCertainty(int i3) {
        if (i3 <= 1024) {
            return 80;
        }
        return (((i3 - 1) / 1024) * 16) + 96;
    }
}
