package com.fasterxml.jackson.dataformat.cbor;

import org.bouncycastle.asn1.BERTags;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class CBORConstants {
    public static final int[] sUtf8UnitLengths;

    static {
        int[] iArr = new int[256];
        for (int i3 = 128; i3 < 256; i3++) {
            iArr[i3] = (i3 & BERTags.FLAGS) == 192 ? 1 : (i3 & 240) == 224 ? 2 : (i3 & 248) == 240 ? 3 : -1;
        }
        sUtf8UnitLengths = iArr;
    }
}
