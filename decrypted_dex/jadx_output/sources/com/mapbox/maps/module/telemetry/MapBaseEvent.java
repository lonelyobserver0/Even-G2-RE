package com.mapbox.maps.module.telemetry;

import android.annotation.SuppressLint;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b!\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\u0006H&R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lcom/mapbox/maps/module/telemetry/MapBaseEvent;", "", "phoneState", "Lcom/mapbox/maps/module/telemetry/PhoneState;", "(Lcom/mapbox/maps/module/telemetry/PhoneState;)V", "created", "", "getCreated", "()Ljava/lang/String;", "event", "getEvent", "getEventName", "module-telemetry_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@SuppressLint({"ParcelCreator"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class MapBaseEvent {

    @SerializedName("created")
    private final String created;

    @SerializedName("event")
    private final String event;

    public MapBaseEvent(PhoneState phoneState) {
        Intrinsics.checkNotNullParameter(phoneState, "phoneState");
        this.event = getEventName();
        this.created = phoneState.getCreated();
    }

    public final String getCreated() {
        return this.created;
    }

    public final String getEvent() {
        return this.event;
    }

    public abstract String getEventName();
}
