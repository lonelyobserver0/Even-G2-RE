package com.mapbox.common.location;

import android.content.Context;
import android.content.res.Resources;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.mapbox.bindgen.Value;
import com.mapbox.common.ValueUtilsKt;
import com.mapbox.common.location.Location;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\b\u0010\u000e\u001a\u00020\u000fH\u0007\u001a\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0001H\u0000\u001a\n\u0010\u0017\u001a\u00020\u0012*\u00020\u0018\u001a\f\u0010\u0019\u001a\u00020\u001a*\u00020\u001bH\u0000\u001a\n\u0010\u001c\u001a\u00020\u0018*\u00020\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u001d"}, d2 = {"GOOGLE_API_AVAILABILITY", "", "googlePlayServicesBundled", "", "getGooglePlayServicesBundled", "()Z", "setGooglePlayServicesBundled", "(Z)V", "getAccuracyAuthorization", "Lcom/mapbox/common/location/AccuracyAuthorization;", "context", "Landroid/content/Context;", "getPermissionStatus", "Lcom/mapbox/common/location/PermissionStatus;", "getVersionSDKInt", "", "isMock", "location", "Landroid/location/Location;", "isOnClasspath", "className", "isPermissionGranted", "permission", "toAndroidLocation", "Lcom/mapbox/common/location/Location;", "toBundle", "Landroid/os/Bundle;", "Lcom/mapbox/bindgen/Value;", "toCommonLocation", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
@JvmName(name = "LocationServiceUtils")
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class LocationServiceUtils {
    private static final String GOOGLE_API_AVAILABILITY = StubApp.getString2(13693);
    private static boolean googlePlayServicesBundled = isOnClasspath(StubApp.getString2(13693));

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccuracyAuthorization.values().length];
            try {
                iArr[AccuracyAuthorization.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final AccuracyAuthorization getAccuracyAuthorization(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return isPermissionGranted(context, StubApp.getString2(140)) ? AccuracyAuthorization.EXACT : isPermissionGranted(context, StubApp.getString2(141)) ? AccuracyAuthorization.INEXACT : AccuracyAuthorization.NONE;
    }

    public static final boolean getGooglePlayServicesBundled() {
        return googlePlayServicesBundled;
    }

    public static final PermissionStatus getPermissionStatus(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (WhenMappings.$EnumSwitchMapping$0[getAccuracyAuthorization(context).ordinal()] == 1) {
            return PermissionStatus.DENIED;
        }
        if (getVersionSDKInt() >= 29) {
            return isPermissionGranted(context, StubApp.getString2(1283)) ? PermissionStatus.BACKGROUND : PermissionStatus.FOREGROUND;
        }
        String packageName = context.getPackageName();
        Resources resources = context.getResources();
        return (resources != null ? resources.getIdentifier(StubApp.getString2(13694), StubApp.getString2(1002), packageName) : 0) != 0 ? PermissionStatus.BACKGROUND : PermissionStatus.GRANTED;
    }

    public static final int getVersionSDKInt() {
        return Build.VERSION.SDK_INT;
    }

    private static final boolean isMock(android.location.Location location) {
        boolean isMock;
        if (Build.VERSION.SDK_INT < 31) {
            return location.isFromMockProvider();
        }
        isMock = location.isMock();
        return isMock;
    }

    public static final boolean isOnClasspath(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        try {
            Class.forName(className);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static final boolean isPermissionGranted(Context context, String permission) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return D.a.a(context, permission) == 0;
    }

    public static final void setGooglePlayServicesBundled(boolean z2) {
        googlePlayServicesBundled = z2;
    }

    public static final android.location.Location toAndroidLocation(Location location) {
        Object obj;
        boolean booleanValue;
        Object invoke;
        Intrinsics.checkNotNullParameter(location, "<this>");
        android.location.Location location2 = new android.location.Location(location.getSource());
        location2.setLatitude(location.getLatitude());
        location2.setLongitude(location.getLongitude());
        location2.setTime(location.getTimestamp());
        Long monotonicTimestamp = location.getMonotonicTimestamp();
        if (monotonicTimestamp != null) {
            location2.setElapsedRealtimeNanos(monotonicTimestamp.longValue());
        }
        Double altitude = location.getAltitude();
        if (altitude != null) {
            location2.setAltitude(altitude.doubleValue());
        }
        Double horizontalAccuracy = location.getHorizontalAccuracy();
        if (horizontalAccuracy != null) {
            location2.setAccuracy((float) horizontalAccuracy.doubleValue());
        }
        Double speed = location.getSpeed();
        if (speed != null) {
            location2.setSpeed((float) speed.doubleValue());
        }
        Double bearing = location.getBearing();
        if (bearing != null) {
            location2.setBearing((float) bearing.doubleValue());
        }
        int i3 = Build.VERSION.SDK_INT;
        Double verticalAccuracy = location.getVerticalAccuracy();
        if (verticalAccuracy != null) {
            location2.setVerticalAccuracyMeters((float) verticalAccuracy.doubleValue());
        }
        Double speedAccuracy = location.getSpeedAccuracy();
        if (speedAccuracy != null) {
            location2.setSpeedAccuracyMetersPerSecond((float) speedAccuracy.doubleValue());
        }
        Double bearingAccuracy = location.getBearingAccuracy();
        if (bearingAccuracy != null) {
            location2.setBearingAccuracyDegrees((float) bearingAccuracy.doubleValue());
        }
        Value extra = location.getExtra();
        location2.setExtras(extra != null ? toBundle(extra) : null);
        Value extra2 = location.getExtra();
        Object contents = extra2 != null ? extra2.getContents() : null;
        HashMap hashMap = contents instanceof HashMap ? (HashMap) contents : null;
        if (hashMap != null && (obj = hashMap.get(StubApp.getString2(6677))) != null) {
            Value value = obj instanceof Value ? (Value) obj : null;
            Object contents2 = value != null ? value.getContents() : null;
            Boolean bool = contents2 instanceof Boolean ? (Boolean) contents2 : null;
            if (bool != null && (booleanValue = bool.booleanValue())) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    if (i3 >= 31) {
                        location2.setMock(booleanValue);
                        invoke = Unit.INSTANCE;
                    } else {
                        invoke = android.location.Location.class.getDeclaredMethod(StubApp.getString2("13695"), Boolean.TYPE).invoke(location2, ((Value) obj).getContents());
                    }
                    Result.m40constructorimpl(invoke);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m40constructorimpl(ResultKt.createFailure(th));
                }
            }
        }
        return location2;
    }

    public static final Bundle toBundle(Value value) {
        Intrinsics.checkNotNullParameter(value, "<this>");
        Bundle bundle = new Bundle();
        Object contents = value.getContents();
        if (contents instanceof HashMap) {
            for (Map.Entry entry : ((Map) contents).entrySet()) {
                Object key = entry.getKey();
                Object value2 = entry.getValue();
                if ((key instanceof String) && (value2 instanceof Value) && !Intrinsics.areEqual(key, "is_mock")) {
                    Object contents2 = ((Value) value2).getContents();
                    if (contents2 instanceof String) {
                        bundle.putString((String) key, (String) contents2);
                    } else if (contents2 instanceof Boolean) {
                        bundle.putBoolean((String) key, ((Boolean) contents2).booleanValue());
                    } else if (contents2 instanceof Long) {
                        bundle.putLong((String) key, ((Number) contents2).longValue());
                    } else if (contents2 instanceof Double) {
                        bundle.putDouble((String) key, ((Number) contents2).doubleValue());
                    } else if (contents2 instanceof List) {
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        for (Object obj : (Iterable) contents2) {
                            if (obj instanceof Value) {
                                arrayList.add(toBundle((Value) obj));
                            }
                        }
                        bundle.putParcelableArrayList((String) key, arrayList);
                    } else if (contents2 instanceof HashMap) {
                        Value valueOf = Value.valueOf((HashMap<String, Value>) contents2);
                        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(innerContent as HashMap<String, Value>)");
                        bundle.putBundle((String) key, toBundle(valueOf));
                    }
                }
            }
        }
        return bundle;
    }

    public static final Location toCommonLocation(android.location.Location location) {
        Value valueOf;
        Intrinsics.checkNotNullParameter(location, "<this>");
        Location.Builder monotonicTimestamp = new Location.Builder().latitude(location.getLatitude()).longitude(location.getLongitude()).timestamp(location.getTime()).monotonicTimestamp(Long.valueOf(location.getElapsedRealtimeNanos()));
        if (location.hasAccuracy()) {
            monotonicTimestamp.horizontalAccuracy(Double.valueOf(location.getAccuracy()));
        }
        if (location.hasAltitude()) {
            monotonicTimestamp.altitude(Double.valueOf(location.getAltitude()));
        }
        if (location.hasBearing()) {
            monotonicTimestamp.bearing(Double.valueOf(location.getBearing()));
        }
        if (location.hasSpeed()) {
            monotonicTimestamp.speed(Double.valueOf(location.getSpeed()));
        }
        String provider = location.getProvider();
        if (provider != null) {
            monotonicTimestamp.source(provider);
        }
        if (location.hasVerticalAccuracy()) {
            monotonicTimestamp.verticalAccuracy(Double.valueOf(location.getVerticalAccuracyMeters()));
        }
        if (location.hasSpeedAccuracy()) {
            monotonicTimestamp.speedAccuracy(Double.valueOf(location.getSpeedAccuracyMetersPerSecond()));
        }
        if (location.hasBearingAccuracy()) {
            monotonicTimestamp.bearingAccuracy(Double.valueOf(location.getBearingAccuracyDegrees()));
        }
        Bundle extras = location.getExtras();
        if (extras == null || (valueOf = ValueUtilsKt.toValue((BaseBundle) extras)) == null) {
            valueOf = Value.valueOf((HashMap<String, Value>) new HashMap());
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(hashMapOf())");
        }
        Object contents = valueOf.getContents();
        Intrinsics.checkNotNull(contents, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, com.mapbox.bindgen.Value>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, com.mapbox.bindgen.Value> }");
        Value valueOf2 = Value.valueOf(isMock(location));
        Intrinsics.checkNotNullExpressionValue(valueOf2, "valueOf(isMock(this))");
        ((HashMap) contents).put(StubApp.getString2(6677), valueOf2);
        monotonicTimestamp.extra(valueOf);
        Location build = monotonicTimestamp.build();
        Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
        return build;
    }
}
