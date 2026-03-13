package com.mapbox.navigator;

import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import java.util.HashMap;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface RouterRefreshCallback {
    void run(Expected<List<RouterError>, DataRef> expected, RouterOrigin routerOrigin, HashMap<String, String> hashMap);
}
