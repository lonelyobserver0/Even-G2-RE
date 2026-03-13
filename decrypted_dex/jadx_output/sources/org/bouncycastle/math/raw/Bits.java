package org.bouncycastle.math.raw;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class Bits {
    public static int bitPermuteStep(int i3, int i10, int i11) {
        int i12 = i10 & ((i3 >>> i11) ^ i3);
        return i3 ^ (i12 ^ (i12 << i11));
    }

    public static int bitPermuteStepSimple(int i3, int i10, int i11) {
        return ((i3 >>> i11) & i10) | ((i3 & i10) << i11);
    }

    public static long bitPermuteStep(long j, long j3, int i3) {
        long j10 = j3 & ((j >>> i3) ^ j);
        return j ^ (j10 ^ (j10 << i3));
    }

    public static long bitPermuteStepSimple(long j, long j3, int i3) {
        return ((j >>> i3) & j3) | ((j & j3) << i3);
    }
}
