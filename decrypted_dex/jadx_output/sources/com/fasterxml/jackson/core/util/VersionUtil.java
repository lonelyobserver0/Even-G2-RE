package com.fasterxml.jackson.core.util;

import com.stub.StubApp;
import java.util.regex.Pattern;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class VersionUtil {
    private static final Pattern V_SEP = Pattern.compile(StubApp.getString2(10496));

    public static final void throwInternal() {
        throw new RuntimeException(StubApp.getString2(10497));
    }
}
