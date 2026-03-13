package com.fasterxml.jackson.core.io.doubleparser;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
abstract class FastDoubleSwar {
    public static int tryToParseEightDigitsUtf16(long j, long j3) {
        long j10 = j - 13511005043687472L;
        long j11 = j3 - 13511005043687472L;
        if ((((j + 19703549022044230L) | j10 | (j3 + 19703549022044230L) | j11) & (-35747867511423104L)) != 0) {
            return -1;
        }
        return (((int) ((j10 * 281475406208040961L) >>> 48)) * 10000) + ((int) ((j11 * 281475406208040961L) >>> 48));
    }
}
