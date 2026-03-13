package com.google.android.gms.common;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m extends c4.h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GoogleApiAvailability f11204b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(GoogleApiAvailability googleApiAvailability, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.f11204b = googleApiAvailability;
        this.f11203a = StubApp.getOrigApplicationContext(context.getApplicationContext());
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i3 = message.what;
        if (i3 != 1) {
            Log.w(StubApp.getString2(5987), StubApp.getString2(11537) + i3);
            return;
        }
        GoogleApiAvailability googleApiAvailability = this.f11204b;
        Context context = this.f11203a;
        int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context);
        if (googleApiAvailability.isUserResolvableError(isGooglePlayServicesAvailable)) {
            googleApiAvailability.showErrorNotification(context, isGooglePlayServicesAvailable);
        }
    }
}
