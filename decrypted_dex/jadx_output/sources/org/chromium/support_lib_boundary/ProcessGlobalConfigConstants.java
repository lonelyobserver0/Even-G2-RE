package org.chromium.support_lib_boundary;

import com.stub.StubApp;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class ProcessGlobalConfigConstants {
    public static final String CACHE_DIRECTORY_BASE_PATH = StubApp.getString2(35239);
    public static final String CONFIGURE_PARTITIONED_COOKIES = StubApp.getString2(35240);
    public static final String DATA_DIRECTORY_BASE_PATH = StubApp.getString2(35241);
    public static final String DATA_DIRECTORY_SUFFIX = StubApp.getString2(35242);

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ProcessGlobalConfigMapKey {
    }
}
