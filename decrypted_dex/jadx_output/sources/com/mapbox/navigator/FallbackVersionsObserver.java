package com.mapbox.navigator;

import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface FallbackVersionsObserver {
    void onCanReturnToLatest(String str);

    void onFallbackVersionsFound(List<String> list);
}
