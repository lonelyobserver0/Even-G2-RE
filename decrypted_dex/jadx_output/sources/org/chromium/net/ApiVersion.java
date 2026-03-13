package org.chromium.net;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ApiVersion {
    private static final int API_LEVEL = 26;
    private static final String CRONET_VERSION = StubApp.getString2(35169);
    private static final String LAST_CHANGE = StubApp.getString2(35171);
    private static final int MIN_COMPATIBLE_API_LEVEL = 3;

    private ApiVersion() {
    }

    public static int getApiLevel() {
        return 3;
    }

    public static String getCronetVersion() {
        return StubApp.getString2(35169);
    }

    public static String getCronetVersionWithLastChange() {
        return StubApp.getString2(35170);
    }

    public static String getLastChange() {
        return StubApp.getString2(35171);
    }

    public static int getMaximumAvailableApiLevel() {
        return 26;
    }
}
