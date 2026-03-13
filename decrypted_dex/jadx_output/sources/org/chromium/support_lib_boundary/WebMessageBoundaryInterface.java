package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public interface WebMessageBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    @Deprecated
    String getData();

    InvocationHandler getMessagePayload();

    InvocationHandler[] getPorts();
}
