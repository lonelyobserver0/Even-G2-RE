package com.mapbox.common.loader;

import androidx.annotation.Keep;
import com.mapbox.common.module.LibraryLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/loader/MapboxLibraryLoader;", "Lcom/mapbox/common/module/LibraryLoader;", "()V", "load", "", "libraryName", "", "libloader_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxLibraryLoader implements LibraryLoader {
    public static final MapboxLibraryLoader INSTANCE = new MapboxLibraryLoader();

    private MapboxLibraryLoader() {
    }

    @Override // com.mapbox.common.module.LibraryLoader
    public void load(String libraryName) {
        Intrinsics.checkNotNullParameter(libraryName, "libraryName");
        System.loadLibrary(libraryName);
    }
}
