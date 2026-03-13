package com.fasterxml.jackson.core.io.doubleparser;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
abstract class AbstractFloatValueParser {
    static final byte[] CHAR_TO_HEX_MAP = new byte[128];

    static {
        char c10 = 0;
        while (true) {
            byte[] bArr = CHAR_TO_HEX_MAP;
            if (c10 >= bArr.length) {
                break;
            }
            bArr[c10] = -1;
            c10 = (char) (c10 + 1);
        }
        for (char c11 = '0'; c11 <= '9'; c11 = (char) (c11 + 1)) {
            CHAR_TO_HEX_MAP[c11] = (byte) (c11 - '0');
        }
        for (char c12 = 'A'; c12 <= 'F'; c12 = (char) (c12 + 1)) {
            CHAR_TO_HEX_MAP[c12] = (byte) (c12 - '7');
        }
        for (char c13 = 'a'; c13 <= 'f'; c13 = (char) (c13 + 1)) {
            CHAR_TO_HEX_MAP[c13] = (byte) (c13 - 'W');
        }
        for (char c14 = '.'; c14 <= '.'; c14 = (char) (c14 + 1)) {
            CHAR_TO_HEX_MAP[c14] = -4;
        }
    }
}
