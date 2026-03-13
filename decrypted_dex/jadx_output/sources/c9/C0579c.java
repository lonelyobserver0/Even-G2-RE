package c9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.mapbox.navigation.trip.notification.internal.MapboxTripNotification;

/* renamed from: c9.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0579c extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapboxTripNotification f11046a;

    public C0579c(MapboxTripNotification mapboxTripNotification) {
        this.f11046a = mapboxTripNotification;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f11046a.onEndNavigationBtnClick();
    }
}
