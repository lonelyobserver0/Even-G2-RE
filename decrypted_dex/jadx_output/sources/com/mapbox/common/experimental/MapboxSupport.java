package com.mapbox.common.experimental;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\b\u0014\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0004R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/mapbox/common/experimental/MapboxSupport;", "", "nativePeer", "", "(J)V", "peer", "setPeer", "", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxSupport {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long peer;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0083 J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0087 J\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\r\u001a\u00020\tH\u0087 ¨\u0006\u000e"}, d2 = {"Lcom/mapbox/common/experimental/MapboxSupport$Companion;", "", "()V", "cleanNativePeer", "", "peer", "", "getSupportPackageData", "Lcom/mapbox/bindgen/Expected;", "", "Lcom/mapbox/bindgen/DataRef;", "saveSupportPackageToFile", "Lcom/mapbox/bindgen/None;", "fileName", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final void cleanNativePeer(long peer) {
            MapboxSupport.cleanNativePeer(peer);
        }

        @JvmStatic
        public final Expected<String, DataRef> getSupportPackageData() {
            return MapboxSupport.getSupportPackageData();
        }

        @JvmStatic
        public final Expected<String, None> saveSupportPackageToFile(String fileName) {
            return MapboxSupport.saveSupportPackageToFile(fileName);
        }

        private Companion() {
        }
    }

    static {
        BaseMapboxInitializer.INSTANCE.init(MapboxSDKCommonInitializerImpl.class);
    }

    public MapboxSupport(long j) {
        setPeer(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JvmStatic
    public static final native void cleanNativePeer(long j);

    @JvmStatic
    public static final native Expected<String, DataRef> getSupportPackageData();

    @JvmStatic
    public static final native Expected<String, None> saveSupportPackageToFile(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPeer$lambda$0(long j) {
        INSTANCE.cleanNativePeer(j);
    }

    public final void setPeer(final long nativePeer) {
        this.peer = nativePeer;
        if (nativePeer == 0) {
            return;
        }
        CleanerService.register(this, new Runnable() { // from class: com.mapbox.common.experimental.a
            @Override // java.lang.Runnable
            public final void run() {
                MapboxSupport.setPeer$lambda$0(nativePeer);
            }
        });
    }
}
