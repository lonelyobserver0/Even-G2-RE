package com.mapbox.module;

import androidx.annotation.Keep;
import com.mapbox.common.loader.MapboxLibraryLoader;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/mapbox/module/Mapbox_LibraryLoaderModuleConfiguration;", "", "()V", "enableConfiguration", "", "getEnableConfiguration$annotations", "getEnableConfiguration", "()Z", "implClass", "Ljava/lang/Class;", "Lcom/mapbox/common/loader/MapboxLibraryLoader;", "getImplClass$annotations", "getImplClass", "()Ljava/lang/Class;", "libloader_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Mapbox_LibraryLoaderModuleConfiguration {
    private static final boolean enableConfiguration = false;
    public static final Mapbox_LibraryLoaderModuleConfiguration INSTANCE = new Mapbox_LibraryLoaderModuleConfiguration();
    private static final Class<MapboxLibraryLoader> implClass = MapboxLibraryLoader.class;

    private Mapbox_LibraryLoaderModuleConfiguration() {
    }

    public static final boolean getEnableConfiguration() {
        return enableConfiguration;
    }

    @JvmStatic
    public static /* synthetic */ void getEnableConfiguration$annotations() {
    }

    public static final Class<MapboxLibraryLoader> getImplClass() {
        return implClass;
    }

    @JvmStatic
    public static /* synthetic */ void getImplClass$annotations() {
    }
}
