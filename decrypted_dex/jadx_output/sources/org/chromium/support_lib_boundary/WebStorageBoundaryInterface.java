package org.chromium.support_lib_boundary;

import java.util.concurrent.Executor;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public interface WebStorageBoundaryInterface {
    void deleteBrowsingData(Executor executor, Runnable runnable);

    String deleteBrowsingDataForSite(String str, Executor executor, Runnable runnable);
}
