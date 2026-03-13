package com.fasterxml.jackson.core;

import java.io.Serializable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class TokenStreamFactory implements Serializable {
    public void _checkRangeBoundsForByteArray(byte[] bArr, int i3, int i10) throws IllegalArgumentException {
        if (bArr == null) {
            _reportRangeError("Invalid `byte[]` argument: `null`");
        }
        int length = bArr.length;
        int i11 = i3 + i10;
        if (((length - i11) | i3 | i10 | i11) < 0) {
            _reportRangeError(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `byte[]` of length %d", Integer.valueOf(i3), Integer.valueOf(i10), Integer.valueOf(length)));
        }
    }

    public <T> T _reportRangeError(String str) throws IllegalArgumentException {
        throw new IllegalArgumentException(str);
    }
}
