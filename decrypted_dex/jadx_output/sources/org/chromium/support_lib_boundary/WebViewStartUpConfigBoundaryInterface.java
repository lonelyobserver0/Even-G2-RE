package org.chromium.support_lib_boundary;

import java.util.concurrent.Executor;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public interface WebViewStartUpConfigBoundaryInterface {
    Executor getBackgroundExecutor();

    boolean shouldRunUiThreadStartUpTasks();
}
