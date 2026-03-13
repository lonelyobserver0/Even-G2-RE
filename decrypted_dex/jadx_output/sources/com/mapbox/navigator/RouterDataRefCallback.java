package com.mapbox.navigator;

import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface RouterDataRefCallback {
    void run(Expected<List<RouterError>, DataRef> expected, RouterOrigin routerOrigin);
}
