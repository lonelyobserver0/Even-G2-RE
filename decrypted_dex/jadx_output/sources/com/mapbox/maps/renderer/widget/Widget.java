package com.mapbox.maps.renderer.widget;

import com.mapbox.maps.MapboxExperimental;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\b'\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000bH&J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\rH&J\u001d\u0010\u0012\u001a\u00020\t2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0000¢\u0006\u0002\b\u0014J\r\u0010\u0015\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X \u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/mapbox/maps/renderer/widget/Widget;", "", "()V", "renderer", "Lcom/mapbox/maps/renderer/widget/WidgetRenderer;", "getRenderer$maps_sdk_release", "()Lcom/mapbox/maps/renderer/widget/WidgetRenderer;", "triggerRepaintAction", "Lkotlin/Function0;", "", "getPosition", "Lcom/mapbox/maps/renderer/widget/WidgetPosition;", "getRotation", "", "setPosition", "widgetPosition", "setRotation", "angleDegrees", "setTriggerRepaintAction", "action", "setTriggerRepaintAction$maps_sdk_release", "triggerRepaint", "triggerRepaint$maps_sdk_release", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class Widget {
    private Function0<Unit> triggerRepaintAction;

    public abstract WidgetPosition getPosition();

    public abstract WidgetRenderer getRenderer$maps_sdk_release();

    public abstract float getRotation();

    public abstract void setPosition(WidgetPosition widgetPosition);

    public abstract void setRotation(float angleDegrees);

    public final /* synthetic */ void setTriggerRepaintAction$maps_sdk_release(Function0 action) {
        this.triggerRepaintAction = action;
    }

    public final /* synthetic */ void triggerRepaint$maps_sdk_release() {
        Function0<Unit> function0 = this.triggerRepaintAction;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
