package org.bouncycastle.util;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Longs {
    public static final int BYTES = 8;
    public static final int SIZE = 64;

    public static long highestOneBit(long j) {
        return Long.highestOneBit(j);
    }

    public static long lowestOneBit(long j) {
        return Long.lowestOneBit(j);
    }

    public static int numberOfLeadingZeros(long j) {
        return Long.numberOfLeadingZeros(j);
    }

    public static int numberOfTrailingZeros(long j) {
        return Long.numberOfTrailingZeros(j);
    }

    public static long reverse(long j) {
        return Long.reverse(j);
    }

    public static long reverseBytes(long j) {
        return Long.reverseBytes(j);
    }

    public static long rotateLeft(long j, int i3) {
        return Long.rotateLeft(j, i3);
    }

    public static long rotateRight(long j, int i3) {
        return Long.rotateRight(j, i3);
    }

    public static Long valueOf(long j) {
        return Long.valueOf(j);
    }
}
