package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public interface WebViewNavigationBoundaryInterface extends IsomorphicObjectBoundaryInterface {
    boolean didCommit();

    boolean didCommitErrorPage();

    InvocationHandler getPage();

    int getStatusCode();

    String getUrl();

    boolean isBack();

    boolean isForward();

    boolean isHistory();

    boolean isReload();

    boolean isRestore();

    boolean isSameDocument();

    boolean wasInitiatedByPage();
}
