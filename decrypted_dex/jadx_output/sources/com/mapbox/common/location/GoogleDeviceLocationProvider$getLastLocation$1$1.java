package com.mapbox.common.location;

import android.os.Handler;
import android.os.Looper;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.location.BaseDeviceLocationProvider;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import q4.j;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class GoogleDeviceLocationProvider$getLastLocation$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ GetLocationCallback $callback;
    final /* synthetic */ BaseDeviceLocationProvider.LocationCancelable $cancelable;
    final /* synthetic */ j $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleDeviceLocationProvider$getLastLocation$1$1(j jVar, BaseDeviceLocationProvider.LocationCancelable locationCancelable, GetLocationCallback getLocationCallback) {
        super(0);
        this.$it = jVar;
        this.$cancelable = locationCancelable;
        this.$callback = getLocationCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(BaseDeviceLocationProvider.LocationCancelable cancelable, final GetLocationCallback callback, final android.location.Location location) {
        Intrinsics.checkNotNullParameter(cancelable, "$cancelable");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        cancelable.invokeIfNotCanceled(new Function0<Unit>() { // from class: com.mapbox.common.location.GoogleDeviceLocationProvider$getLastLocation$1$1$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                GetLocationCallback getLocationCallback = GetLocationCallback.this;
                android.location.Location location2 = location;
                Intrinsics.checkNotNullExpressionValue(location2, "location");
                getLocationCallback.run(LocationServiceUtils.toCommonLocation(location2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(BaseDeviceLocationProvider.LocationCancelable cancelable, final GetLocationCallback callback) {
        Intrinsics.checkNotNullParameter(cancelable, "$cancelable");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        cancelable.invokeIfNotCanceled(new Function0<Unit>() { // from class: com.mapbox.common.location.GoogleDeviceLocationProvider$getLastLocation$1$1$2$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                GetLocationCallback.this.run(null);
            }
        });
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        android.location.Location location;
        if (this.$it.isCanceled()) {
            MapboxCommonLogger.INSTANCE.logW$common_release(StubApp.getString2(13639), StubApp.getString2(13643));
        } else if (!this.$it.isSuccessful() || (location = (android.location.Location) this.$it.getResult()) == null) {
            new Handler(Looper.getMainLooper()).post(new d(0, this.$cancelable, this.$callback));
        } else {
            new Handler(Looper.getMainLooper()).post(new c(this.$cancelable, this.$callback, location, 0));
        }
    }
}
