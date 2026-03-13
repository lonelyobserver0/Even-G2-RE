package org.chromium.support_lib_boundary;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public interface PrefetchOperationCallbackBoundaryInterface {

    @Retention(RetentionPolicy.SOURCE)
    public @interface PrefetchExceptionTypeBoundaryInterface {
        public static final int DUPLICATE = 2;
        public static final int GENERIC = 0;
        public static final int NETWORK = 1;
    }

    void onFailure(int i3, String str, int i10);

    void onSuccess();
}
