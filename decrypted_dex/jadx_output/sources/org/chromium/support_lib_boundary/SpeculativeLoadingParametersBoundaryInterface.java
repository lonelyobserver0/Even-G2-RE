package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public interface SpeculativeLoadingParametersBoundaryInterface {
    Map<String, String> getAdditionalHeaders();

    InvocationHandler getNoVarySearchData();

    boolean isJavaScriptEnabled();
}
