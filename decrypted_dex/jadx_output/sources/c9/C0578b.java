package c9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.mapbox.navigation.trip.notification.internal.MapboxTripNotification;

/* renamed from: c9.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0578b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapboxTripNotification f11045a;

    public C0578b(MapboxTripNotification mapboxTripNotification) {
        this.f11045a = mapboxTripNotification;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f11045a.onNotificationDismissed();
    }
}
