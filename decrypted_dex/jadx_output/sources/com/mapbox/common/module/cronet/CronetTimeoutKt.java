package com.mapbox.common.module.cronet;

import android.os.SystemClock;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\b\u0010\u0002\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0003"}, d2 = {"SECOND_AS_MILLISECONDS", "", "nowMilliseconds", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CronetTimeoutKt {
    private static final long SECOND_AS_MILLISECONDS = 1000;

    /* JADX INFO: Access modifiers changed from: private */
    public static final long nowMilliseconds() {
        return SystemClock.elapsedRealtime();
    }
}
