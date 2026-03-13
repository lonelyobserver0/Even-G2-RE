package com.mapbox.maps.module.telemetry;

import Qb.C;
import Qb.H;
import Qb.I;
import Qb.J;
import Qb.L;
import Qb.W;
import android.content.Context;
import android.os.Bundle;
import com.google.gson.Gson;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.common.Event;
import com.mapbox.common.EventPriority;
import com.mapbox.common.EventsServerOptions;
import com.mapbox.common.EventsService;
import com.mapbox.common.EventsServiceInterface;
import com.mapbox.common.SdkInformation;
import com.mapbox.common.TelemetryCollectionState;
import com.mapbox.common.TelemetryService;
import com.mapbox.common.TelemetryUtils;
import com.mapbox.common.TurnstileEvent;
import com.mapbox.common.UserSKUIdentifier;
import com.mapbox.common.module.cronet.a;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.module.MapTelemetry;
import com.stub.StubApp;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 +2\u00020\u0001:\u0001+B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0004\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0011J\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u0011J\u0019\u0010!\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0014\u0010&\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;", "Lcom/mapbox/maps/module/MapTelemetry;", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "Lcom/mapbox/common/EventsServiceInterface;", "eventsService", "Lcom/mapbox/common/TelemetryService;", "telemetryService", "Lcom/mapbox/common/EventsServerOptions;", "eventsServerOptions", "LQb/C;", "defaultCoroutineDispatcher", "(Landroid/content/Context;Lcom/mapbox/common/EventsServiceInterface;Lcom/mapbox/common/TelemetryService;Lcom/mapbox/common/EventsServerOptions;LQb/C;)V", "", "sendMapLoadEvent", "()V", "", "shouldSendEvents", "()Z", "", "event", "sendEvent", "(Ljava/lang/String;)V", "enabled", "enableTelemetryCollection", "(Z)V", "onAppUserTurnstileEvent", "setUserTelemetryRequestState", "disableTelemetrySession", "Landroid/os/Bundle;", "data", "onPerformanceEvent", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", "Lcom/mapbox/common/EventsServiceInterface;", "Lcom/mapbox/common/TelemetryService;", "eventsServiceOptions", "Lcom/mapbox/common/EventsServerOptions;", "LQb/I;", "bgScope", "LQb/I;", "Companion", "module-telemetry_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapTelemetryImpl implements MapTelemetry {
    private final Context appContext;
    private final I bgScope;
    private final EventsServiceInterface eventsService;
    private final EventsServerOptions eventsServiceOptions;
    private final TelemetryService telemetryService;

    @Deprecated
    private static final String TAG = StubApp.getString2(14415);
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl$Companion;", "", "()V", "TAG", "", "module-telemetry_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MapTelemetryImpl(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.appContext = appContext;
        EventsServerOptions eventsServerOptions = new EventsServerOptions(new SdkInformation(StubApp.getString2(13986), StubApp.getString2(13987), null), null);
        this.eventsServiceOptions = eventsServerOptions;
        EventsService orCreate = EventsService.getOrCreate(eventsServerOptions);
        Intrinsics.checkNotNullExpressionValue(orCreate, "getOrCreate(eventsServiceOptions)");
        this.eventsService = orCreate;
        TelemetryService orCreate2 = TelemetryService.getOrCreate();
        Intrinsics.checkNotNullExpressionValue(orCreate2, "getOrCreate()");
        this.telemetryService = orCreate2;
        this.bgScope = J.a(new H(StubApp.getString2(14415)).plus(L.b()).plus(W.f5839b));
    }

    private final void enableTelemetryCollection(boolean enabled) {
        TelemetryUtils.setEventsCollectionState(enabled, new a(26));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enableTelemetryCollection$lambda$3(Expected response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.isError()) {
            MapboxLogger.logE(StubApp.getString2(14415), StubApp.getString2(14416) + response.getError());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAppUserTurnstileEvent$lambda$0(Expected response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.isError()) {
            MapboxLogger.logE(StubApp.getString2(14415), StubApp.getString2(14417) + response.getError());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendEvent(String event) {
        Expected<String, Value> fromJson = Value.fromJson(event);
        Intrinsics.checkNotNullExpressionValue(fromJson, "fromJson(event)");
        Value value = fromJson.getValue();
        Event event2 = value != null ? new Event(EventPriority.QUEUED, value, null) : null;
        if (event2 != null) {
            this.eventsService.sendEvent(event2, new a(25));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendEvent$lambda$2(Expected response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.isError()) {
            MapboxLogger.logE(StubApp.getString2(14415), StubApp.getString2(14418) + response.getError());
        }
    }

    private final void sendMapLoadEvent() {
        L.j(this.bgScope, null, new MapTelemetryImpl$sendMapLoadEvent$1(this, null), 3);
    }

    private final boolean shouldSendEvents() {
        return TelemetryUtils.getClientServerEventsCollectionState() != TelemetryCollectionState.TURNSTILE_EVENTS_ONLY;
    }

    @Override // com.mapbox.maps.module.MapTelemetry
    public void disableTelemetrySession() {
        enableTelemetryCollection(false);
    }

    @Override // com.mapbox.maps.module.MapTelemetry
    public void onAppUserTurnstileEvent() {
        this.eventsService.sendTurnstileEvent(new TurnstileEvent(UserSKUIdentifier.MAPS_MAUS), new a(24));
        if (shouldSendEvents()) {
            sendMapLoadEvent();
        }
    }

    @Override // com.mapbox.maps.module.MapTelemetry
    public void onPerformanceEvent(Bundle data) {
        if (shouldSendEvents()) {
            MapEventFactory mapEventFactory = MapEventFactory.INSTANCE;
            PhoneState phoneState = new PhoneState(this.appContext);
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            if (data == null) {
                data = new Bundle();
            }
            String json = new Gson().toJson(mapEventFactory.buildPerformanceEvent(phoneState, uuid, data));
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(performanceEvent)");
            sendEvent(json);
        }
    }

    @Override // com.mapbox.maps.module.MapTelemetry
    public void setUserTelemetryRequestState(boolean enabled) {
        enableTelemetryCollection(enabled);
    }

    public MapTelemetryImpl(Context appContext, EventsServiceInterface eventsService, TelemetryService telemetryService, EventsServerOptions eventsServerOptions, C defaultCoroutineDispatcher) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(eventsService, "eventsService");
        Intrinsics.checkNotNullParameter(telemetryService, "telemetryService");
        Intrinsics.checkNotNullParameter(eventsServerOptions, "eventsServerOptions");
        Intrinsics.checkNotNullParameter(defaultCoroutineDispatcher, "defaultCoroutineDispatcher");
        this.appContext = appContext;
        this.eventsService = eventsService;
        this.telemetryService = telemetryService;
        this.eventsServiceOptions = eventsServerOptions;
        this.bgScope = J.a(new H(StubApp.getString2(14415)).plus(L.b()).plus(defaultCoroutineDispatcher));
    }
}
