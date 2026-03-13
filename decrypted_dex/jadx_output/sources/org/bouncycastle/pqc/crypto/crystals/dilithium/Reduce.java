package org.bouncycastle.pqc.crypto.crystals.dilithium;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Reduce {
    public static int conditionalAddQ(int i3) {
        return i3 + ((i3 >> 31) & DilithiumEngine.DilithiumQ);
    }

    public static int montgomeryReduce(long j) {
        return (int) ((j - (((int) (58728449 * j)) * 8380417)) >>> 32);
    }

    public static int reduce32(int i3) {
        return i3 - (((4194304 + i3) >> 23) * DilithiumEngine.DilithiumQ);
    }
}
