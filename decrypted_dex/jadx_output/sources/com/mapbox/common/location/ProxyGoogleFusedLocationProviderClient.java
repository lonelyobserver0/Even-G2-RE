package com.mapbox.common.location;

import Q3.g;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.mapbox.common.FeatureTelemetryCounter;
import com.mapbox.common.MapboxCommonLogger;
import com.stub.StubApp;
import f4.C0881e;
import i4.AbstractC1047k;
import i4.AbstractC1050n;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import q4.j;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u001d\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0015J\u0015\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\f¢\u0006\u0004\b\u0017\u0010\u0018R(\u0010\u0019\u001a\u00020\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/google/android/gms/location/LocationRequest;", "request", "Li4/k;", "callback", "Landroid/os/Looper;", "looper", "Lq4/j;", "Ljava/lang/Void;", "requestLocationUpdates", "(Lcom/google/android/gms/location/LocationRequest;Li4/k;Landroid/os/Looper;)Lq4/j;", "Landroid/app/PendingIntent;", "pendingIntent", "(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)Lq4/j;", "removeLocationUpdates", "(Li4/k;)Lq4/j;", "(Landroid/app/PendingIntent;)Lq4/j;", "Landroid/location/Location;", "getLastLocation", "()Lq4/j;", "googleFusedLocationProviderClient", "Ljava/lang/Object;", "getGoogleFusedLocationProviderClient", "()Ljava/lang/Object;", "setGoogleFusedLocationProviderClient", "(Ljava/lang/Object;)V", "getGoogleFusedLocationProviderClient$annotations", "()V", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ProxyGoogleFusedLocationProviderClient {
    private static Method getLastLocation;
    public static Method removeLocationUpdatesCallback;
    public static Method removeLocationUpdatesPendingIntent;
    public static Method requestLocationUpdatesCallback;
    public static Method requestLocationUpdatesPendingIntent;
    private Object googleFusedLocationProviderClient;
    private static final String GOOGLE_FUSED_LOCATION_PROVIDER_CLIENT = StubApp.getString2(13711);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<Boolean> available$delegate = LazyKt.lazy(new Function0<Boolean>() { // from class: com.mapbox.common.location.ProxyGoogleFusedLocationProviderClient$Companion$available$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(GoogleDeviceLocationProviderKt.getGooglePlayServicesHelper().isGooglePlayServicesLocationAvailable());
        }
    });

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u001f\u001a\u00020\u0006H\u0000¢\u0006\u0002\b R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R$\u0010\u0017\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R$\u0010\u001b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012¨\u0006!"}, d2 = {"Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient$Companion;", "", "()V", "GOOGLE_FUSED_LOCATION_PROVIDER_CLIENT", "", "available", "", "getAvailable$common_release", "()Z", "available$delegate", "Lkotlin/Lazy;", "getLastLocation", "Ljava/lang/reflect/Method;", "removeLocationUpdatesCallback", "getRemoveLocationUpdatesCallback$annotations", "getRemoveLocationUpdatesCallback", "()Ljava/lang/reflect/Method;", "setRemoveLocationUpdatesCallback", "(Ljava/lang/reflect/Method;)V", "removeLocationUpdatesPendingIntent", "getRemoveLocationUpdatesPendingIntent$annotations", "getRemoveLocationUpdatesPendingIntent", "setRemoveLocationUpdatesPendingIntent", "requestLocationUpdatesCallback", "getRequestLocationUpdatesCallback$annotations", "getRequestLocationUpdatesCallback", "setRequestLocationUpdatesCallback", "requestLocationUpdatesPendingIntent", "getRequestLocationUpdatesPendingIntent$annotations", "getRequestLocationUpdatesPendingIntent", "setRequestLocationUpdatesPendingIntent", "verifyAndCacheMethods", "verifyAndCacheMethods$common_release", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getRemoveLocationUpdatesCallback$annotations() {
        }

        public static /* synthetic */ void getRemoveLocationUpdatesPendingIntent$annotations() {
        }

        public static /* synthetic */ void getRequestLocationUpdatesCallback$annotations() {
        }

        public static /* synthetic */ void getRequestLocationUpdatesPendingIntent$annotations() {
        }

        public final boolean getAvailable$common_release() {
            return ((Boolean) ProxyGoogleFusedLocationProviderClient.available$delegate.getValue()).booleanValue();
        }

        public final Method getRemoveLocationUpdatesCallback() {
            Method method = ProxyGoogleFusedLocationProviderClient.removeLocationUpdatesCallback;
            if (method != null) {
                return method;
            }
            Intrinsics.throwUninitializedPropertyAccessException("removeLocationUpdatesCallback");
            return null;
        }

        public final Method getRemoveLocationUpdatesPendingIntent() {
            Method method = ProxyGoogleFusedLocationProviderClient.removeLocationUpdatesPendingIntent;
            if (method != null) {
                return method;
            }
            Intrinsics.throwUninitializedPropertyAccessException("removeLocationUpdatesPendingIntent");
            return null;
        }

        public final Method getRequestLocationUpdatesCallback() {
            Method method = ProxyGoogleFusedLocationProviderClient.requestLocationUpdatesCallback;
            if (method != null) {
                return method;
            }
            Intrinsics.throwUninitializedPropertyAccessException("requestLocationUpdatesCallback");
            return null;
        }

        public final Method getRequestLocationUpdatesPendingIntent() {
            Method method = ProxyGoogleFusedLocationProviderClient.requestLocationUpdatesPendingIntent;
            if (method != null) {
                return method;
            }
            Intrinsics.throwUninitializedPropertyAccessException("requestLocationUpdatesPendingIntent");
            return null;
        }

        public final void setRemoveLocationUpdatesCallback(Method method) {
            Intrinsics.checkNotNullParameter(method, "<set-?>");
            ProxyGoogleFusedLocationProviderClient.removeLocationUpdatesCallback = method;
        }

        public final void setRemoveLocationUpdatesPendingIntent(Method method) {
            Intrinsics.checkNotNullParameter(method, "<set-?>");
            ProxyGoogleFusedLocationProviderClient.removeLocationUpdatesPendingIntent = method;
        }

        public final void setRequestLocationUpdatesCallback(Method method) {
            Intrinsics.checkNotNullParameter(method, "<set-?>");
            ProxyGoogleFusedLocationProviderClient.requestLocationUpdatesCallback = method;
        }

        public final void setRequestLocationUpdatesPendingIntent(Method method) {
            Intrinsics.checkNotNullParameter(method, "<set-?>");
            ProxyGoogleFusedLocationProviderClient.requestLocationUpdatesPendingIntent = method;
        }

        public final boolean verifyAndCacheMethods$common_release() throws IncompatibleGooglePlayServicesLocationVersion {
            String string2 = StubApp.getString2(13702);
            String string22 = StubApp.getString2(13703);
            String string23 = StubApp.getString2(13704);
            String string24 = StubApp.getString2(1101);
            String string25 = StubApp.getString2(13663);
            try {
                if (FusedLocationProviderClient.class.isInterface()) {
                    FeatureTelemetryCounter.create(StubApp.getString2("13705")).increment();
                } else {
                    FeatureTelemetryCounter.create(StubApp.getString2("13706")).increment();
                }
                Companion companion = ProxyGoogleFusedLocationProviderClient.INSTANCE;
                Method method = FusedLocationProviderClient.class.getMethod(string24, LocationRequest.class, AbstractC1047k.class, Looper.class);
                Intrinsics.checkNotNullExpressionValue(method, string23);
                companion.setRequestLocationUpdatesCallback(method);
                Method method2 = FusedLocationProviderClient.class.getMethod(string24, LocationRequest.class, PendingIntent.class);
                Intrinsics.checkNotNullExpressionValue(method2, string22);
                companion.setRequestLocationUpdatesPendingIntent(method2);
                Method method3 = FusedLocationProviderClient.class.getMethod(string2, AbstractC1047k.class);
                Intrinsics.checkNotNullExpressionValue(method3, string22);
                companion.setRemoveLocationUpdatesCallback(method3);
                Method method4 = FusedLocationProviderClient.class.getMethod(string2, PendingIntent.class);
                Intrinsics.checkNotNullExpressionValue(method4, string23);
                companion.setRemoveLocationUpdatesPendingIntent(method4);
                Method method5 = FusedLocationProviderClient.class.getMethod(StubApp.getString2("13707"), new Class[0]);
                Intrinsics.checkNotNullExpressionValue(method5, "getMethod(\"getLastLocation\")");
                ProxyGoogleFusedLocationProviderClient.getLastLocation = method5;
                return true;
            } catch (ClassNotFoundException e10) {
                MapboxCommonLogger.INSTANCE.logW$common_release(string25, StubApp.getString2(13710) + e10.getMessage());
                return false;
            } catch (NoSuchMethodException e11) {
                MapboxCommonLogger.INSTANCE.logW$common_release(string25, StubApp.getString2(13709) + e11.getMessage());
                throw new IncompatibleGooglePlayServicesLocationVersion();
            } catch (SecurityException e12) {
                MapboxCommonLogger.INSTANCE.logW$common_release(string25, StubApp.getString2(13708) + e12.getMessage());
                throw new IncompatibleGooglePlayServicesLocationVersion();
            }
        }

        private Companion() {
        }
    }

    public ProxyGoogleFusedLocationProviderClient(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i3 = AbstractC1050n.f14794a;
        C0881e c0881e = new C0881e(context, null, C0881e.f13745i, Q3.b.f5714a, g.f5719b);
        Intrinsics.checkNotNullExpressionValue(c0881e, "getFusedLocationProviderClient(context)");
        this.googleFusedLocationProviderClient = c0881e;
    }

    public static /* synthetic */ void getGoogleFusedLocationProviderClient$annotations() {
    }

    public final Object getGoogleFusedLocationProviderClient() {
        return this.googleFusedLocationProviderClient;
    }

    public final j getLastLocation() {
        try {
            Method method = getLastLocation;
            if (method == null) {
                Intrinsics.throwUninitializedPropertyAccessException("getLastLocation");
                method = null;
            }
            return (j) method.invoke(this.googleFusedLocationProviderClient, new Object[0]);
        } catch (Exception e10) {
            return new FailedTask(e10);
        }
    }

    public final j removeLocationUpdates(AbstractC1047k callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            return (j) INSTANCE.getRemoveLocationUpdatesCallback().invoke(this.googleFusedLocationProviderClient, callback);
        } catch (Exception e10) {
            return new FailedTask(e10);
        }
    }

    public final j requestLocationUpdates(LocationRequest request, AbstractC1047k callback, Looper looper) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            return (j) INSTANCE.getRequestLocationUpdatesCallback().invoke(this.googleFusedLocationProviderClient, request, callback, looper);
        } catch (Exception e10) {
            return new FailedTask(e10);
        }
    }

    public final void setGoogleFusedLocationProviderClient(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.googleFusedLocationProviderClient = obj;
    }

    public final j removeLocationUpdates(PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        try {
            return (j) INSTANCE.getRemoveLocationUpdatesPendingIntent().invoke(this.googleFusedLocationProviderClient, pendingIntent);
        } catch (Exception e10) {
            return new FailedTask(e10);
        }
    }

    public final j requestLocationUpdates(LocationRequest request, PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        try {
            return (j) INSTANCE.getRequestLocationUpdatesPendingIntent().invoke(this.googleFusedLocationProviderClient, request, pendingIntent);
        } catch (Exception e10) {
            return new FailedTask(e10);
        }
    }
}
