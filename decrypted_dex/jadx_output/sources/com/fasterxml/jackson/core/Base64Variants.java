package com.fasterxml.jackson.core;

import com.stub.StubApp;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class Base64Variants {
    public static final Base64Variant MIME;
    public static final Base64Variant MIME_NO_LINEFEEDS;
    public static final Base64Variant MODIFIED_FOR_URL;
    public static final Base64Variant PEM;

    static {
        Base64Variant base64Variant = new Base64Variant(StubApp.getString2(10232), StubApp.getString2(10233), true, '=', 76);
        MIME = base64Variant;
        MIME_NO_LINEFEEDS = new Base64Variant(base64Variant, StubApp.getString2(10234), IntCompanionObject.MAX_VALUE);
        PEM = new Base64Variant(base64Variant, StubApp.getString2(10235), true, '=', 64);
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(10233));
        sb2.setCharAt(sb2.indexOf(StubApp.getString2(4966)), '-');
        sb2.setCharAt(sb2.indexOf(StubApp.getString2(601)), '_');
        MODIFIED_FOR_URL = new Base64Variant(StubApp.getString2(10236), sb2.toString(), false, (char) 0, IntCompanionObject.MAX_VALUE);
    }

    public static Base64Variant getDefaultVariant() {
        return MIME_NO_LINEFEEDS;
    }
}
