package org.chromium.support_lib_boundary;

import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    boolean getIncludeCookiesOnIntercept();

    Set<String> getRequestedWithHeaderOriginAllowList();

    void setAllowContentAccess(boolean z2);

    void setAllowFileAccess(boolean z2);

    void setBlockNetworkLoads(boolean z2);

    void setCacheMode(int i3);

    void setIncludeCookiesOnIntercept(boolean z2);

    void setRequestedWithHeaderOriginAllowList(Set<String> set);
}
