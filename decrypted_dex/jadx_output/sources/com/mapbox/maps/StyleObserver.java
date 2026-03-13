package com.mapbox.maps;

import com.mapbox.common.Cancelable;
import com.mapbox.maps.Style;
import com.stub.StubApp;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 .2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001.B-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0007J\u0006\u0010$\u001a\u00020\"J\b\u0010%\u001a\u00020\"H\u0002J\b\u0010&\u001a\u00020\"H\u0002J\u0010\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020*H\u0016J\u0010\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020+H\u0016J0\u0010,\u001a\u00020\"2\b\u0010-\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001f\u001a\u00020\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007R\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/mapbox/maps/StyleObserver;", "Lcom/mapbox/maps/StyleLoadedCallback;", "Lcom/mapbox/maps/MapLoadingErrorCallback;", "Lcom/mapbox/maps/StyleDataLoadedCallback;", "styleManager", "Lcom/mapbox/maps/StyleManager;", "styleLoadedListener", "Lcom/mapbox/maps/Style$OnStyleLoaded;", "nativeObserver", "Lcom/mapbox/maps/NativeObserver;", "pixelRatio", "", "mapLoadingErrorDelegate", "Lcom/mapbox/maps/MapLoadingErrorDelegate;", "(Lcom/mapbox/maps/StyleManager;Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/NativeObserver;FLcom/mapbox/maps/MapLoadingErrorDelegate;)V", "cancelableList", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/mapbox/common/Cancelable;", "getCancelableList$annotations", "()V", "getCancelableList", "()Ljava/util/concurrent/CopyOnWriteArraySet;", "getStyleListeners", "isWaitingStyleDataStyleEvent", "", "()Z", "loadedStyle", "Lcom/mapbox/maps/Style;", "preLoadedStyle", "styleDataSourcesLoadedListener", "styleDataSpritesLoadedListener", "styleDataStyleLoadedListener", "userStyleLoadedListener", "addGetStyleListener", "", "loadedListener", "onDestroy", "onStyleSourcesReady", "onStyleSpritesReady", "run", "eventData", "Lcom/mapbox/maps/MapLoadingError;", "Lcom/mapbox/maps/StyleDataLoaded;", "Lcom/mapbox/maps/StyleLoaded;", "setLoadStyleListener", "userOnStyleLoaded", "Companion", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class StyleObserver implements StyleLoadedCallback, MapLoadingErrorCallback, StyleDataLoadedCallback {
    private final CopyOnWriteArraySet<Cancelable> cancelableList;
    private final CopyOnWriteArraySet<Style.OnStyleLoaded> getStyleListeners;
    private Style loadedStyle;
    private final MapLoadingErrorDelegate mapLoadingErrorDelegate;
    private final NativeObserver nativeObserver;
    private final float pixelRatio;
    private Style preLoadedStyle;
    private Style.OnStyleLoaded styleDataSourcesLoadedListener;
    private Style.OnStyleLoaded styleDataSpritesLoadedListener;
    private Style.OnStyleLoaded styleDataStyleLoadedListener;
    private final Style.OnStyleLoaded styleLoadedListener;
    private final StyleManager styleManager;
    private Style.OnStyleLoaded userStyleLoadedListener;
    public static final String TAG = StubApp.getString2(14286);

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StyleDataLoadedType.values().length];
            try {
                iArr[StyleDataLoadedType.STYLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleDataLoadedType.SPRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleDataLoadedType.SOURCES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StyleObserver(StyleManager styleManager, Style.OnStyleLoaded styleLoadedListener, NativeObserver nativeObserver, float f10, MapLoadingErrorDelegate mapLoadingErrorDelegate) {
        Intrinsics.checkNotNullParameter(styleManager, "styleManager");
        Intrinsics.checkNotNullParameter(styleLoadedListener, "styleLoadedListener");
        Intrinsics.checkNotNullParameter(nativeObserver, "nativeObserver");
        Intrinsics.checkNotNullParameter(mapLoadingErrorDelegate, "mapLoadingErrorDelegate");
        this.styleManager = styleManager;
        this.styleLoadedListener = styleLoadedListener;
        this.nativeObserver = nativeObserver;
        this.pixelRatio = f10;
        this.mapLoadingErrorDelegate = mapLoadingErrorDelegate;
        this.getStyleListeners = new CopyOnWriteArraySet<>();
        CopyOnWriteArraySet<Cancelable> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.cancelableList = copyOnWriteArraySet;
        copyOnWriteArraySet.add(NativeObserver.subscribeStyleLoaded$default(nativeObserver, this, null, null, 6, null));
        copyOnWriteArraySet.add(NativeObserver.subscribeMapLoadingError$default(nativeObserver, this, null, null, 6, null));
        copyOnWriteArraySet.add(NativeObserver.subscribeStyleDataLoaded$default(nativeObserver, this, null, null, 6, null));
    }

    public static /* synthetic */ void getCancelableList$annotations() {
    }

    private final boolean isWaitingStyleDataStyleEvent() {
        return this.styleDataStyleLoadedListener != null;
    }

    private final void onStyleSourcesReady() {
        Style.OnStyleLoaded onStyleLoaded = this.styleDataSourcesLoadedListener;
        if (onStyleLoaded != null) {
            Unit unit = null;
            this.styleDataSourcesLoadedListener = null;
            Style style = this.preLoadedStyle;
            if (style != null) {
                onStyleLoaded.onStyleLoaded(style);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                MapboxLogger.logE(StubApp.getString2(14286), StubApp.getString2(14287));
            }
        }
    }

    private final void onStyleSpritesReady() {
        Style.OnStyleLoaded onStyleLoaded = this.styleDataSpritesLoadedListener;
        if (onStyleLoaded != null) {
            Unit unit = null;
            this.styleDataSpritesLoadedListener = null;
            Style style = this.preLoadedStyle;
            if (style != null) {
                onStyleLoaded.onStyleLoaded(style);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                MapboxLogger.logE(StubApp.getString2(14286), StubApp.getString2(14288));
            }
        }
    }

    public static /* synthetic */ void setLoadStyleListener$default(StyleObserver styleObserver, Style.OnStyleLoaded onStyleLoaded, Style.OnStyleLoaded onStyleLoaded2, Style.OnStyleLoaded onStyleLoaded3, Style.OnStyleLoaded onStyleLoaded4, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            onStyleLoaded3 = null;
        }
        if ((i3 & 8) != 0) {
            onStyleLoaded4 = null;
        }
        styleObserver.setLoadStyleListener(onStyleLoaded, onStyleLoaded2, onStyleLoaded3, onStyleLoaded4);
    }

    public final void addGetStyleListener(Style.OnStyleLoaded loadedListener) {
        Intrinsics.checkNotNullParameter(loadedListener, "loadedListener");
        this.getStyleListeners.add(loadedListener);
    }

    public final CopyOnWriteArraySet<Cancelable> getCancelableList() {
        return this.cancelableList;
    }

    public final void onDestroy() {
        this.userStyleLoadedListener = null;
        this.styleDataStyleLoadedListener = null;
        this.styleDataSpritesLoadedListener = null;
        this.styleDataSourcesLoadedListener = null;
        Style style = this.preLoadedStyle;
        if (style != null) {
            style.markInvalid$maps_sdk_release();
        }
        this.preLoadedStyle = null;
        Style style2 = this.loadedStyle;
        if (style2 != null) {
            style2.markInvalid$maps_sdk_release();
        }
        this.loadedStyle = null;
        this.getStyleListeners.clear();
        Iterator<T> it = this.cancelableList.iterator();
        while (it.hasNext()) {
            ((Cancelable) it.next()).cancel();
        }
        this.cancelableList.clear();
    }

    @Override // com.mapbox.maps.StyleLoadedCallback
    public void run(StyleLoaded eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        Style style = this.loadedStyle;
        if (style != null) {
            style.markInvalid$maps_sdk_release();
        }
        Style style2 = this.preLoadedStyle;
        this.loadedStyle = style2;
        if (style2 == null) {
            throw new MapboxMapException(StubApp.getString2(14292));
        }
        onStyleSpritesReady();
        onStyleSourcesReady();
        this.styleLoadedListener.onStyleLoaded(style2);
        Style.OnStyleLoaded onStyleLoaded = this.userStyleLoadedListener;
        if (onStyleLoaded != null) {
            this.userStyleLoadedListener = null;
            onStyleLoaded.onStyleLoaded(style2);
        }
        Iterator<T> it = this.getStyleListeners.iterator();
        while (it.hasNext()) {
            ((Style.OnStyleLoaded) it.next()).onStyleLoaded(style2);
        }
        this.getStyleListeners.clear();
    }

    public final void setLoadStyleListener(Style.OnStyleLoaded userOnStyleLoaded, Style.OnStyleLoaded styleDataStyleLoadedListener, Style.OnStyleLoaded styleDataSpritesLoadedListener, Style.OnStyleLoaded styleDataSourcesLoadedListener) {
        Intrinsics.checkNotNullParameter(styleDataStyleLoadedListener, "styleDataStyleLoadedListener");
        this.nativeObserver.resubscribeStyleLoadListeners();
        this.userStyleLoadedListener = userOnStyleLoaded;
        this.styleDataStyleLoadedListener = styleDataStyleLoadedListener;
        this.styleDataSpritesLoadedListener = styleDataSpritesLoadedListener;
        this.styleDataSourcesLoadedListener = styleDataSourcesLoadedListener;
    }

    @Override // com.mapbox.maps.MapLoadingErrorCallback
    public void run(MapLoadingError eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        MapboxLogger.logE(StubApp.getString2(14286), StubApp.getString2(14289) + eventData.getType() + StubApp.getString2(544) + eventData.getMessage() + StubApp.getString2(14290) + eventData.getSourceId() + StubApp.getString2(14291) + eventData.getTileId());
    }

    @Override // com.mapbox.maps.StyleDataLoadedCallback
    public void run(StyleDataLoaded eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        int i3 = WhenMappings.$EnumSwitchMapping$0[eventData.getType().ordinal()];
        if (i3 == 1) {
            Style style = new Style(this.styleManager, this.pixelRatio, this.mapLoadingErrorDelegate);
            Style.OnStyleLoaded onStyleLoaded = this.styleDataStyleLoadedListener;
            if (onStyleLoaded != null) {
                onStyleLoaded.onStyleLoaded(style);
            }
            this.preLoadedStyle = style;
            this.styleDataStyleLoadedListener = null;
            return;
        }
        if (i3 != 2) {
            if (i3 == 3 && !isWaitingStyleDataStyleEvent()) {
                onStyleSourcesReady();
                return;
            }
            return;
        }
        if (isWaitingStyleDataStyleEvent()) {
            return;
        }
        onStyleSpritesReady();
    }
}
