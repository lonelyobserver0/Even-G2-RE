package com.mapbox.maps;

import X6.q;
import X6.r;
import android.content.Context;
import android.util.AttributeSet;
import com.mapbox.maps.MapOptions;
import com.stub.StubApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b=\b\u0086\b\u0018\u0000 M2\u00020\u0001:\u0001MBm\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b&\u0010!Jv\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b)\u0010!J\u0010\u0010*\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b*\u0010%J\u001a\u0010,\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0017R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0019\"\u0004\b2\u00103R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\u001b\"\u0004\b6\u00107R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00108\u001a\u0004\b9\u0010\u001d\"\u0004\b:\u0010;R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010\u001f\"\u0004\b>\u0010?R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bA\u0010!R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010B\u001a\u0004\bC\u0010#\"\u0004\bD\u0010ER\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010F\u001a\u0004\bG\u0010%\"\u0004\bH\u0010IR\"\u0010\u0013\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010@\u001a\u0004\bJ\u0010!\"\u0004\bK\u0010L¨\u0006N"}, d2 = {"Lcom/mapbox/maps/MapInitOptions;", "", "Landroid/content/Context;", "context", "Lcom/mapbox/maps/MapOptions;", "mapOptions", "", "LX6/r;", "plugins", "Lcom/mapbox/maps/CameraOptions;", "cameraOptions", "", "textureView", "", "styleUri", "Landroid/util/AttributeSet;", "attrs", "", "antialiasingSampleCount", "mapName", "<init>", "(Landroid/content/Context;Lcom/mapbox/maps/MapOptions;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;ZLjava/lang/String;Landroid/util/AttributeSet;ILjava/lang/String;)V", "component1", "()Landroid/content/Context;", "component2", "()Lcom/mapbox/maps/MapOptions;", "component3", "()Ljava/util/List;", "component4", "()Lcom/mapbox/maps/CameraOptions;", "component5", "()Z", "component6", "()Ljava/lang/String;", "component7", "()Landroid/util/AttributeSet;", "component8", "()I", "component9", "copy", "(Landroid/content/Context;Lcom/mapbox/maps/MapOptions;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;ZLjava/lang/String;Landroid/util/AttributeSet;ILjava/lang/String;)Lcom/mapbox/maps/MapInitOptions;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "getContext", "Lcom/mapbox/maps/MapOptions;", "getMapOptions", "setMapOptions", "(Lcom/mapbox/maps/MapOptions;)V", "Ljava/util/List;", "getPlugins", "setPlugins", "(Ljava/util/List;)V", "Lcom/mapbox/maps/CameraOptions;", "getCameraOptions", "setCameraOptions", "(Lcom/mapbox/maps/CameraOptions;)V", "Z", "getTextureView", "setTextureView", "(Z)V", "Ljava/lang/String;", "getStyleUri", "Landroid/util/AttributeSet;", "getAttrs", "setAttrs", "(Landroid/util/AttributeSet;)V", "I", "getAntialiasingSampleCount", "setAntialiasingSampleCount", "(I)V", "getMapName", "setMapName", "(Ljava/lang/String;)V", "Companion", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class MapInitOptions {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<r> defaultPluginList = CollectionsKt.listOf((Object[]) new q[]{new q(StubApp.getString2(7571)), new q(StubApp.getString2(8511)), new q(StubApp.getString2(13945)), new q(StubApp.getString2(8983)), new q(StubApp.getString2(8982)), new q(StubApp.getString2(13942)), new q(StubApp.getString2(8981)), new q(StubApp.getString2(9142)), new q(StubApp.getString2(13946)), new q(StubApp.getString2(13943)), new q(StubApp.getString2(13944))});
    private int antialiasingSampleCount;
    private AttributeSet attrs;
    private CameraOptions cameraOptions;
    private final Context context;
    private String mapName;
    private MapOptions mapOptions;
    private List<? extends r> plugins;
    private final String styleUri;
    private boolean textureView;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/mapbox/maps/MapInitOptions$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/mapbox/maps/MapOptions;", "getDefaultMapOptions", "(Landroid/content/Context;)Lcom/mapbox/maps/MapOptions;", "", "LX6/r;", "defaultPluginList", "Ljava/util/List;", "getDefaultPluginList", "()Ljava/util/List;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MapOptions getDefaultMapOptions(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            MapOptions build = MapInitOptionsKt.applyDefaultParams(new MapOptions.Builder(), context).build();
            Intrinsics.checkNotNullExpressionValue(build, "Builder().applyDefaultParams(context).build()");
            return build;
        }

        public final List<r> getDefaultPluginList() {
            return MapInitOptions.defaultPluginList;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MapInitOptions(Context context) {
        this(context, null, null, null, false, null, null, 0, null, 510, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ MapInitOptions copy$default(MapInitOptions mapInitOptions, Context context, MapOptions mapOptions, List list, CameraOptions cameraOptions, boolean z2, String str, AttributeSet attributeSet, int i3, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = mapInitOptions.context;
        }
        if ((i10 & 2) != 0) {
            mapOptions = mapInitOptions.mapOptions;
        }
        if ((i10 & 4) != 0) {
            list = mapInitOptions.plugins;
        }
        if ((i10 & 8) != 0) {
            cameraOptions = mapInitOptions.cameraOptions;
        }
        if ((i10 & 16) != 0) {
            z2 = mapInitOptions.textureView;
        }
        if ((i10 & 32) != 0) {
            str = mapInitOptions.styleUri;
        }
        if ((i10 & 64) != 0) {
            attributeSet = mapInitOptions.attrs;
        }
        if ((i10 & 128) != 0) {
            i3 = mapInitOptions.antialiasingSampleCount;
        }
        if ((i10 & 256) != 0) {
            str2 = mapInitOptions.mapName;
        }
        int i11 = i3;
        String str3 = str2;
        String str4 = str;
        AttributeSet attributeSet2 = attributeSet;
        boolean z10 = z2;
        List list2 = list;
        return mapInitOptions.copy(context, mapOptions, list2, cameraOptions, z10, str4, attributeSet2, i11, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* renamed from: component2, reason: from getter */
    public final MapOptions getMapOptions() {
        return this.mapOptions;
    }

    public final List<r> component3() {
        return this.plugins;
    }

    /* renamed from: component4, reason: from getter */
    public final CameraOptions getCameraOptions() {
        return this.cameraOptions;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getTextureView() {
        return this.textureView;
    }

    /* renamed from: component6, reason: from getter */
    public final String getStyleUri() {
        return this.styleUri;
    }

    /* renamed from: component7, reason: from getter */
    public final AttributeSet getAttrs() {
        return this.attrs;
    }

    /* renamed from: component8, reason: from getter */
    public final int getAntialiasingSampleCount() {
        return this.antialiasingSampleCount;
    }

    /* renamed from: component9, reason: from getter */
    public final String getMapName() {
        return this.mapName;
    }

    public final MapInitOptions copy(Context context, MapOptions mapOptions, List<? extends r> plugins, CameraOptions cameraOptions, boolean textureView, String styleUri, AttributeSet attrs, int antialiasingSampleCount, String mapName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mapOptions, "mapOptions");
        Intrinsics.checkNotNullParameter(plugins, "plugins");
        Intrinsics.checkNotNullParameter(mapName, StubApp.getString2(13968));
        return new MapInitOptions(context, mapOptions, plugins, cameraOptions, textureView, styleUri, attrs, antialiasingSampleCount, mapName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapInitOptions)) {
            return false;
        }
        MapInitOptions mapInitOptions = (MapInitOptions) other;
        return Intrinsics.areEqual(this.context, mapInitOptions.context) && Intrinsics.areEqual(this.mapOptions, mapInitOptions.mapOptions) && Intrinsics.areEqual(this.plugins, mapInitOptions.plugins) && Intrinsics.areEqual(this.cameraOptions, mapInitOptions.cameraOptions) && this.textureView == mapInitOptions.textureView && Intrinsics.areEqual(this.styleUri, mapInitOptions.styleUri) && Intrinsics.areEqual(this.attrs, mapInitOptions.attrs) && this.antialiasingSampleCount == mapInitOptions.antialiasingSampleCount && Intrinsics.areEqual(this.mapName, mapInitOptions.mapName);
    }

    public final int getAntialiasingSampleCount() {
        return this.antialiasingSampleCount;
    }

    public final AttributeSet getAttrs() {
        return this.attrs;
    }

    public final CameraOptions getCameraOptions() {
        return this.cameraOptions;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getMapName() {
        return this.mapName;
    }

    public final MapOptions getMapOptions() {
        return this.mapOptions;
    }

    public final List<r> getPlugins() {
        return this.plugins;
    }

    public final String getStyleUri() {
        return this.styleUri;
    }

    public final boolean getTextureView() {
        return this.textureView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int g10 = E1.a.g((this.mapOptions.hashCode() + (this.context.hashCode() * 31)) * 31, 31, this.plugins);
        CameraOptions cameraOptions = this.cameraOptions;
        int hashCode = (g10 + (cameraOptions == null ? 0 : cameraOptions.hashCode())) * 31;
        boolean z2 = this.textureView;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i10 = (hashCode + i3) * 31;
        String str = this.styleUri;
        int hashCode2 = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        AttributeSet attributeSet = this.attrs;
        return this.mapName.hashCode() + E1.a.e(this.antialiasingSampleCount, (hashCode2 + (attributeSet != null ? attributeSet.hashCode() : 0)) * 31, 31);
    }

    public final void setAntialiasingSampleCount(int i3) {
        this.antialiasingSampleCount = i3;
    }

    public final void setAttrs(AttributeSet attributeSet) {
        this.attrs = attributeSet;
    }

    public final void setCameraOptions(CameraOptions cameraOptions) {
        this.cameraOptions = cameraOptions;
    }

    public final void setMapName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mapName = str;
    }

    public final void setMapOptions(MapOptions mapOptions) {
        Intrinsics.checkNotNullParameter(mapOptions, "<set-?>");
        this.mapOptions = mapOptions;
    }

    public final void setPlugins(List<? extends r> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.plugins = list;
    }

    public final void setTextureView(boolean z2) {
        this.textureView = z2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(13969));
        sb2.append(this.context);
        sb2.append(StubApp.getString2(13970));
        sb2.append(this.mapOptions);
        sb2.append(StubApp.getString2(13971));
        sb2.append(this.plugins);
        sb2.append(StubApp.getString2(13972));
        sb2.append(this.cameraOptions);
        sb2.append(StubApp.getString2(13973));
        sb2.append(this.textureView);
        sb2.append(StubApp.getString2(13974));
        sb2.append(this.styleUri);
        sb2.append(StubApp.getString2(13975));
        sb2.append(this.attrs);
        sb2.append(StubApp.getString2(13976));
        sb2.append(this.antialiasingSampleCount);
        sb2.append(StubApp.getString2(13977));
        return Xa.h.s(sb2, this.mapName, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MapInitOptions(Context context, MapOptions mapOptions) {
        this(context, mapOptions, null, null, false, null, null, 0, null, 508, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mapOptions, "mapOptions");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MapInitOptions(Context context, MapOptions mapOptions, List<? extends r> list) {
        this(context, mapOptions, list, null, false, null, null, 0, null, 504, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mapOptions, "mapOptions");
        Intrinsics.checkNotNullParameter(list, StubApp.getString2(7359));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MapInitOptions(Context context, MapOptions mapOptions, List<? extends r> list, CameraOptions cameraOptions) {
        this(context, mapOptions, list, cameraOptions, false, null, null, 0, null, 496, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mapOptions, "mapOptions");
        Intrinsics.checkNotNullParameter(list, StubApp.getString2(7359));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MapInitOptions(Context context, MapOptions mapOptions, List<? extends r> list, CameraOptions cameraOptions, boolean z2) {
        this(context, mapOptions, list, cameraOptions, z2, null, null, 0, null, 480, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mapOptions, "mapOptions");
        Intrinsics.checkNotNullParameter(list, StubApp.getString2(7359));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MapInitOptions(Context context, MapOptions mapOptions, List<? extends r> list, CameraOptions cameraOptions, boolean z2, String str) {
        this(context, mapOptions, list, cameraOptions, z2, str, null, 0, null, 448, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mapOptions, "mapOptions");
        Intrinsics.checkNotNullParameter(list, StubApp.getString2(7359));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MapInitOptions(Context context, MapOptions mapOptions, List<? extends r> list, CameraOptions cameraOptions, boolean z2, String str, AttributeSet attributeSet) {
        this(context, mapOptions, list, cameraOptions, z2, str, attributeSet, 0, null, KyberEngine.KyberPolyBytes, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mapOptions, "mapOptions");
        Intrinsics.checkNotNullParameter(list, StubApp.getString2(7359));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MapInitOptions(Context context, MapOptions mapOptions, List<? extends r> list, CameraOptions cameraOptions, boolean z2, String str, AttributeSet attributeSet, int i3) {
        this(context, mapOptions, list, cameraOptions, z2, str, attributeSet, i3, null, 256, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mapOptions, "mapOptions");
        Intrinsics.checkNotNullParameter(list, StubApp.getString2(7359));
    }

    @JvmOverloads
    public MapInitOptions(Context context, MapOptions mapOptions, List<? extends r> plugins, CameraOptions cameraOptions, boolean z2, String str, AttributeSet attributeSet, int i3, String mapName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mapOptions, "mapOptions");
        Intrinsics.checkNotNullParameter(plugins, "plugins");
        Intrinsics.checkNotNullParameter(mapName, "mapName");
        this.context = context;
        this.mapOptions = mapOptions;
        this.plugins = plugins;
        this.cameraOptions = cameraOptions;
        this.textureView = z2;
        this.styleUri = str;
        this.attrs = attributeSet;
        this.antialiasingSampleCount = i3;
        this.mapName = mapName;
    }

    public /* synthetic */ MapInitOptions(Context context, MapOptions mapOptions, List list, CameraOptions cameraOptions, boolean z2, String str, AttributeSet attributeSet, int i3, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? INSTANCE.getDefaultMapOptions(context) : mapOptions, (i10 & 4) != 0 ? defaultPluginList : list, (i10 & 8) != 0 ? null : cameraOptions, (i10 & 16) != 0 ? false : z2, (i10 & 32) != 0 ? StubApp.getString2(13967) : str, (i10 & 64) == 0 ? attributeSet : null, (i10 & 128) != 0 ? 1 : i3, (i10 & 256) != 0 ? "" : str2);
    }
}
