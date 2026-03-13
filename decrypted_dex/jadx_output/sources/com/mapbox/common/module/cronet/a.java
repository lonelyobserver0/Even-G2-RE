package com.mapbox.common.module.cronet;

import Ac.j;
import D9.l;
import Xa.h;
import android.util.JsonReader;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.EventsServiceResponseCallback;
import com.mapbox.common.FlushOperationResultCallback;
import com.mapbox.common.TelemetryUtilsResponseCallback;
import com.mapbox.common.module.okhttp.NetworkUsageListener;
import com.mapbox.maps.CameraChanged;
import com.mapbox.maps.CameraChangedCallback;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.FeatureStateOperationCallback;
import com.mapbox.maps.MapIdle;
import com.mapbox.maps.MapIdleCallback;
import com.mapbox.maps.MapLoadingError;
import com.mapbox.maps.MapLoadingErrorDelegate;
import com.mapbox.maps.MapProvider;
import com.mapbox.maps.NativeObserver;
import com.mapbox.maps.RenderFrameFinished;
import com.mapbox.maps.RenderFrameFinishedCallback;
import com.mapbox.maps.RenderFrameStarted;
import com.mapbox.maps.RenderFrameStartedCallback;
import com.mapbox.maps.Snapshotter;
import com.mapbox.maps.SourceAdded;
import com.mapbox.maps.SourceAddedCallback;
import com.mapbox.maps.SourceDataLoaded;
import com.mapbox.maps.SourceDataLoadedCallback;
import com.mapbox.maps.SourceRemoved;
import com.mapbox.maps.SourceRemovedCallback;
import com.mapbox.maps.StyleDataLoaded;
import com.mapbox.maps.StyleDataLoadedCallback;
import com.mapbox.maps.StyleImageMissing;
import com.mapbox.maps.StyleImageMissingCallback;
import com.mapbox.maps.StyleImageRemoveUnused;
import com.mapbox.maps.StyleImageRemoveUnusedCallback;
import com.mapbox.maps.StyleLoaded;
import com.mapbox.maps.StyleLoadedCallback;
import com.mapbox.maps.module.telemetry.MapTelemetryImpl;
import com.stub.StubApp;
import f5.E;
import g5.b;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import q4.e;
import wc.p;
import wc.q;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class a implements e, p, FlushOperationResultCallback, FeatureStateOperationCallback, MapLoadingErrorDelegate, MapIdleCallback, StyleImageMissingCallback, StyleImageRemoveUnusedCallback, RenderFrameFinishedCallback, SourceRemovedCallback, StyleDataLoadedCallback, CameraChangedCallback, RenderFrameStartedCallback, StyleLoadedCallback, SourceAddedCallback, SourceDataLoadedCallback, Expected.Transformer, EventsServiceResponseCallback, TelemetryUtilsResponseCallback, b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12408a;

    public /* synthetic */ a(int i3) {
        this.f12408a = i3;
    }

    @Override // q4.e
    public void C(Exception exc) {
        LazyEngine.tryInstallFromGooglePlay$lambda$2(exc);
    }

    @Override // wc.p
    public q a(j jVar) {
        q lambda$static$0;
        lambda$static$0 = NetworkUsageListener.lambda$static$0(jVar);
        return lambda$static$0;
    }

    @Override // g5.b
    public Object b(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -609862170:
                    if (nextName.equals(StubApp.getString2(13782))) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals(StubApp.getString2(13781))) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 230943785:
                    if (nextName.equals(StubApp.getString2(13780))) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    str2 = jsonReader.nextString();
                    if (str2 == null) {
                        throw new NullPointerException(StubApp.getString2(9491));
                    }
                    break;
                case 1:
                    str = jsonReader.nextString();
                    if (str == null) {
                        throw new NullPointerException(StubApp.getString2(9490));
                    }
                    break;
                case 2:
                    str3 = jsonReader.nextString();
                    if (str3 == null) {
                        throw new NullPointerException(StubApp.getString2(9489));
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (str != null && str2 != null && str3 != null) {
            return new E(str, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            sb2.append(StubApp.getString2(13783));
        }
        if (str2 == null) {
            sb2.append(StubApp.getString2(13784));
        }
        if (str3 == null) {
            sb2.append(StubApp.getString2(13785));
        }
        throw new IllegalStateException(h.r(sb2, StubApp.getString2(555)));
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) {
        CameraOptions cameraForCoordinates$lambda$20;
        switch (this.f12408a) {
            case 23:
                cameraForCoordinates$lambda$20 = Snapshotter.cameraForCoordinates$lambda$20((String) obj);
                return cameraForCoordinates$lambda$20;
            case 27:
                String error = (String) obj;
                Intrinsics.checkNotNullParameter(error, "error");
                l.e(StubApp.getString2(9621), StubApp.getString2(13786) + error);
                return CollectionsKt.emptyList();
            default:
                List value = (List) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
        }
    }

    @Override // com.mapbox.common.FlushOperationResultCallback
    public void run(Expected expected) {
        switch (this.f12408a) {
            case 2:
                MapProvider.flushPendingEvents$lambda$1(expected);
                break;
            case 3:
                MapProvider.flushPendingEvents$lambda$3(expected);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(expected, "it");
                break;
            case 6:
                Intrinsics.checkNotNullParameter(expected, "it");
                break;
            case 7:
                Intrinsics.checkNotNullParameter(expected, "it");
                break;
            case 8:
                Intrinsics.checkNotNullParameter(expected, "it");
                break;
            case 9:
                Intrinsics.checkNotNullParameter(expected, "it");
                break;
            case 24:
                MapTelemetryImpl.onAppUserTurnstileEvent$lambda$0(expected);
                break;
            case 25:
                MapTelemetryImpl.sendEvent$lambda$2(expected);
                break;
            default:
                MapTelemetryImpl.enableTelemetryCollection$lambda$3(expected);
                break;
        }
    }

    @Override // com.mapbox.maps.MapLoadingErrorDelegate
    public void sendMapLoadingError(MapLoadingError mapLoadingError) {
        switch (this.f12408a) {
            case 5:
                Intrinsics.checkNotNullParameter(mapLoadingError, "it");
                break;
            case 21:
                Intrinsics.checkNotNullParameter(mapLoadingError, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(mapLoadingError, "it");
                break;
        }
    }

    @Override // com.mapbox.maps.CameraChangedCallback
    public void run(CameraChanged cameraChanged) {
        NativeObserver.addOnCameraChangeListener$lambda$2(null, cameraChanged);
    }

    @Override // com.mapbox.maps.MapIdleCallback
    public void run(MapIdle mapIdle) {
        NativeObserver.addOnMapIdleListener$lambda$4(null, mapIdle);
    }

    @Override // com.mapbox.maps.RenderFrameFinishedCallback
    public void run(RenderFrameFinished renderFrameFinished) {
        NativeObserver.addOnRenderFrameFinishedListener$lambda$14(null, renderFrameFinished);
    }

    @Override // com.mapbox.maps.RenderFrameStartedCallback
    public void run(RenderFrameStarted renderFrameStarted) {
        NativeObserver.addOnRenderFrameStartedListener$lambda$13(null, renderFrameStarted);
    }

    @Override // com.mapbox.maps.SourceAddedCallback
    public void run(SourceAdded sourceAdded) {
        NativeObserver.addOnSourceAddedListener$lambda$9(null, sourceAdded);
    }

    @Override // com.mapbox.maps.SourceDataLoadedCallback
    public void run(SourceDataLoaded sourceDataLoaded) {
        NativeObserver.addOnSourceDataLoadedListener$lambda$8(null, sourceDataLoaded);
    }

    @Override // com.mapbox.maps.SourceRemovedCallback
    public void run(SourceRemoved sourceRemoved) {
        NativeObserver.addOnSourceRemovedListener$lambda$10(null, sourceRemoved);
    }

    @Override // com.mapbox.maps.StyleDataLoadedCallback
    public void run(StyleDataLoaded styleDataLoaded) {
        NativeObserver.addOnStyleDataLoadedListener$lambda$7(null, styleDataLoaded);
    }

    @Override // com.mapbox.maps.StyleImageMissingCallback
    public void run(StyleImageMissing styleImageMissing) {
        NativeObserver.addOnStyleImageMissingListener$lambda$11(null, styleImageMissing);
    }

    @Override // com.mapbox.maps.StyleImageRemoveUnusedCallback
    public void run(StyleImageRemoveUnused styleImageRemoveUnused) {
        NativeObserver.addOnStyleImageUnusedListener$lambda$12(null, styleImageRemoveUnused);
    }

    @Override // com.mapbox.maps.StyleLoadedCallback
    public void run(StyleLoaded styleLoaded) {
        NativeObserver.addOnStyleLoadedListener$lambda$6(null, styleLoaded);
    }
}
