package com.mapbox.common.location;

import Xa.h;
import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.bindgen.Value;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.MapboxSDKCommon;
import com.mapbox.common.SettingsService;
import com.mapbox.common.SettingsServiceFactory;
import com.mapbox.common.SettingsServiceStorageType;
import com.mapbox.common.location.ExtendedLocationProviderParameters;
import com.mapbox.common.location.LocationService;
import com.stub.StubApp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0003;<=B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001a\u001a\u00020\u001bH\u0016J:\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000f0\u001d2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J.\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000f0\u001d2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010%\u001a\u00020&H\u0016J&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000f0\u001d2\u0006\u0010'\u001a\u00020(2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001e\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000f0\u001d2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020&H\u0016J<\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020 2\b\u0010/\u001a\u0004\u0018\u00010\"2\u0006\u00100\u001a\u00020&2\u0006\u0010%\u001a\u00020&2\b\u00101\u001a\u0004\u0018\u00010$H\u0002J\u0010\u00102\u001a\u0002032\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u0016H\u0016J\r\u00106\u001a\u000203H\u0000¢\u0006\u0002\b7J\u0012\u00108\u001a\u0002032\b\u00109\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010:\u001a\u0002032\u0006\u00105\u001a\u00020\u0016H\u0016R\u0016\u0010\u0002\u001a\n \u0005*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00060\tR\u00020\u0000X\u0082.¢\u0006\u0002\n\u0000R2\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f0\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/mapbox/common/location/LocationServiceImpl;", "Lcom/mapbox/common/location/LocationService;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "kotlin.jvm.PlatformType", "locationManager", "Landroid/location/LocationManager;", "locationModeChangedReceiver", "Lcom/mapbox/common/location/LocationServiceImpl$LocationModeChangedBroadcastReceiver;", "locationProviders", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Pair;", "Lcom/mapbox/common/location/LocationServiceImpl$DeviceLocationProviderParams;", "Ljava/lang/ref/WeakReference;", "Lcom/mapbox/common/location/DeviceLocationProvider;", "getLocationProviders$common_release", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "setLocationProviders$common_release", "(Ljava/util/concurrent/CopyOnWriteArrayList;)V", "observers", "Ljava/util/HashSet;", "Lcom/mapbox/common/location/LocationServiceObserver;", "Lkotlin/collections/HashSet;", "userDefinedFactory", "Lcom/mapbox/common/location/DeviceLocationProviderFactory;", "getAccuracyAuthorization", "Lcom/mapbox/common/location/AccuracyAuthorization;", "getDeviceLocationProvider", "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/common/location/LocationError;", "type", "Lcom/mapbox/common/location/DeviceLocationProviderType;", "request", "Lcom/mapbox/common/location/LocationProviderRequest;", "locationProviderName", "", "allowUserDefined", "", "extendedParameters", "Lcom/mapbox/common/location/ExtendedLocationProviderParameters;", "getPermissionStatus", "Lcom/mapbox/common/location/PermissionStatus;", "isAvailable", "isLocationProviderRequestCompatible", "existing", "requestedType", "requested", "googlePlayAvailable", "providerName", "registerModeChangedReceiver", "", "registerObserver", "observer", "resetLocationServices", "resetLocationServices$common_release", "setUserDefinedDeviceLocationProviderFactory", "factory", "unregisterObserver", "Companion", "DeviceLocationProviderParams", "LocationModeChangedBroadcastReceiver", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class LocationServiceImpl implements LocationService {
    private final Context context;
    private final LocationManager locationManager;
    private LocationModeChangedBroadcastReceiver locationModeChangedReceiver;
    private CopyOnWriteArrayList<Pair<DeviceLocationProviderParams, WeakReference<DeviceLocationProvider>>> locationProviders;
    private final HashSet<LocationServiceObserver> observers;
    private DeviceLocationProviderFactory userDefinedFactory;
    public static final String ERROR_MESSAGE_FAILED_TO_GET_LAST_LOCATION = StubApp.getString2(13688);
    public static final String ERROR_MESSAGE_GOOGLE_PLAY_NOT_AVAILABLE = StubApp.getString2(13689);
    public static final String ERROR_MESSAGE_LAST_LOCATION_NOT_AVAILABLE = StubApp.getString2(13610);
    public static final String TAG = StubApp.getString2(13619);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SuppressLint({"StaticFieldLeak"})
    private static final LocationServiceImpl INSTANCE = new LocationServiceImpl(MapboxSDKCommon.INSTANCE.getContext());

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/mapbox/common/location/LocationServiceImpl$Companion;", "", "()V", "ERROR_MESSAGE_FAILED_TO_GET_LAST_LOCATION", "", "ERROR_MESSAGE_GOOGLE_PLAY_NOT_AVAILABLE", "ERROR_MESSAGE_LAST_LOCATION_NOT_AVAILABLE", "INSTANCE", "Lcom/mapbox/common/location/LocationServiceImpl;", "TAG", "createPlatformLocationService", "Lcom/mapbox/common/location/LocationService;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final LocationService createPlatformLocationService() {
            return LocationServiceImpl.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/location/LocationServiceImpl$DeviceLocationProviderParams;", "", "()V", "Custom", "Default", "Lcom/mapbox/common/location/LocationServiceImpl$DeviceLocationProviderParams$Custom;", "Lcom/mapbox/common/location/LocationServiceImpl$DeviceLocationProviderParams$Default;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static abstract class DeviceLocationProviderParams {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/mapbox/common/location/LocationServiceImpl$DeviceLocationProviderParams$Custom;", "Lcom/mapbox/common/location/LocationServiceImpl$DeviceLocationProviderParams;", "factory", "Ljava/lang/ref/WeakReference;", "Lcom/mapbox/common/location/DeviceLocationProviderFactory;", "request", "Lcom/mapbox/common/location/LocationProviderRequest;", "(Ljava/lang/ref/WeakReference;Lcom/mapbox/common/location/LocationProviderRequest;)V", "getFactory", "()Ljava/lang/ref/WeakReference;", "getRequest", "()Lcom/mapbox/common/location/LocationProviderRequest;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final /* data */ class Custom extends DeviceLocationProviderParams {
            private final WeakReference<DeviceLocationProviderFactory> factory;
            private final LocationProviderRequest request;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Custom(WeakReference<DeviceLocationProviderFactory> factory, LocationProviderRequest locationProviderRequest) {
                super(null);
                Intrinsics.checkNotNullParameter(factory, "factory");
                this.factory = factory;
                this.request = locationProviderRequest;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Custom copy$default(Custom custom, WeakReference weakReference, LocationProviderRequest locationProviderRequest, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    weakReference = custom.factory;
                }
                if ((i3 & 2) != 0) {
                    locationProviderRequest = custom.request;
                }
                return custom.copy(weakReference, locationProviderRequest);
            }

            public final WeakReference<DeviceLocationProviderFactory> component1() {
                return this.factory;
            }

            /* renamed from: component2, reason: from getter */
            public final LocationProviderRequest getRequest() {
                return this.request;
            }

            public final Custom copy(WeakReference<DeviceLocationProviderFactory> factory, LocationProviderRequest request) {
                Intrinsics.checkNotNullParameter(factory, "factory");
                return new Custom(factory, request);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Custom)) {
                    return false;
                }
                Custom custom = (Custom) other;
                return Intrinsics.areEqual(this.factory, custom.factory) && Intrinsics.areEqual(this.request, custom.request);
            }

            public final WeakReference<DeviceLocationProviderFactory> getFactory() {
                return this.factory;
            }

            public final LocationProviderRequest getRequest() {
                return this.request;
            }

            public int hashCode() {
                int hashCode = this.factory.hashCode() * 31;
                LocationProviderRequest locationProviderRequest = this.request;
                return hashCode + (locationProviderRequest == null ? 0 : locationProviderRequest.hashCode());
            }

            public String toString() {
                return StubApp.getString2(13684) + this.factory + StubApp.getString2(13685) + this.request + ')';
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/mapbox/common/location/LocationServiceImpl$DeviceLocationProviderParams$Default;", "Lcom/mapbox/common/location/LocationServiceImpl$DeviceLocationProviderParams;", "type", "Lcom/mapbox/common/location/DeviceLocationProviderType;", "request", "Lcom/mapbox/common/location/LocationProviderRequest;", "name", "", "(Lcom/mapbox/common/location/DeviceLocationProviderType;Lcom/mapbox/common/location/LocationProviderRequest;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getRequest", "()Lcom/mapbox/common/location/LocationProviderRequest;", "getType", "()Lcom/mapbox/common/location/DeviceLocationProviderType;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final /* data */ class Default extends DeviceLocationProviderParams {
            private final String name;
            private final LocationProviderRequest request;
            private final DeviceLocationProviderType type;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Default(DeviceLocationProviderType type, LocationProviderRequest locationProviderRequest, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
                this.request = locationProviderRequest;
                this.name = str;
            }

            public static /* synthetic */ Default copy$default(Default r02, DeviceLocationProviderType deviceLocationProviderType, LocationProviderRequest locationProviderRequest, String str, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    deviceLocationProviderType = r02.type;
                }
                if ((i3 & 2) != 0) {
                    locationProviderRequest = r02.request;
                }
                if ((i3 & 4) != 0) {
                    str = r02.name;
                }
                return r02.copy(deviceLocationProviderType, locationProviderRequest, str);
            }

            /* renamed from: component1, reason: from getter */
            public final DeviceLocationProviderType getType() {
                return this.type;
            }

            /* renamed from: component2, reason: from getter */
            public final LocationProviderRequest getRequest() {
                return this.request;
            }

            /* renamed from: component3, reason: from getter */
            public final String getName() {
                return this.name;
            }

            public final Default copy(DeviceLocationProviderType type, LocationProviderRequest request, String name) {
                Intrinsics.checkNotNullParameter(type, "type");
                return new Default(type, request, name);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Default)) {
                    return false;
                }
                Default r52 = (Default) other;
                return this.type == r52.type && Intrinsics.areEqual(this.request, r52.request) && Intrinsics.areEqual(this.name, r52.name);
            }

            public final String getName() {
                return this.name;
            }

            public final LocationProviderRequest getRequest() {
                return this.request;
            }

            public final DeviceLocationProviderType getType() {
                return this.type;
            }

            public int hashCode() {
                int hashCode = this.type.hashCode() * 31;
                LocationProviderRequest locationProviderRequest = this.request;
                int hashCode2 = (hashCode + (locationProviderRequest == null ? 0 : locationProviderRequest.hashCode())) * 31;
                String str = this.name;
                return hashCode2 + (str != null ? str.hashCode() : 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(13686));
                sb2.append(this.type);
                sb2.append(StubApp.getString2(13685));
                sb2.append(this.request);
                sb2.append(StubApp.getString2(1065));
                return h.s(sb2, this.name, ')');
            }
        }

        public /* synthetic */ DeviceLocationProviderParams(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DeviceLocationProviderParams() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/mapbox/common/location/LocationServiceImpl$LocationModeChangedBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "(Lcom/mapbox/common/location/LocationServiceImpl;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class LocationModeChangedBroadcastReceiver extends BroadcastReceiver {
        public LocationModeChangedBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if (action != null) {
                    LocationServiceImpl locationServiceImpl = LocationServiceImpl.this;
                    if (action.hashCode() == -511271086 && action.equals(StubApp.getString2("13687"))) {
                        Iterator it = locationServiceImpl.observers.iterator();
                        while (it.hasNext()) {
                            ((LocationServiceObserver) it.next()).onAvailabilityChanged(locationServiceImpl.isAvailable());
                        }
                    }
                }
            }
        }
    }

    private LocationServiceImpl(Context context) {
        this.context = StubApp.getOrigApplicationContext(context.getApplicationContext());
        Object systemService = context.getSystemService(StubApp.getString2(662));
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        this.locationManager = (LocationManager) systemService;
        this.observers = new HashSet<>();
        this.locationProviders = new CopyOnWriteArrayList<>();
        registerModeChangedReceiver(context);
    }

    @JvmStatic
    public static final LocationService createPlatformLocationService() {
        return INSTANCE.createPlatformLocationService();
    }

    private final boolean isLocationProviderRequestCompatible(DeviceLocationProviderParams existing, DeviceLocationProviderType requestedType, LocationProviderRequest requested, boolean googlePlayAvailable, boolean allowUserDefined, String providerName) {
        if (existing instanceof DeviceLocationProviderParams.Custom) {
            if (!allowUserDefined) {
                return false;
            }
            DeviceLocationProviderParams.Custom custom = (DeviceLocationProviderParams.Custom) existing;
            DeviceLocationProviderFactory deviceLocationProviderFactory = custom.getFactory().get();
            DeviceLocationProviderFactory deviceLocationProviderFactory2 = this.userDefinedFactory;
            if (deviceLocationProviderFactory2 == null || deviceLocationProviderFactory == null || !Intrinsics.areEqual(deviceLocationProviderFactory, deviceLocationProviderFactory2)) {
                return false;
            }
            if (requested == null) {
                return true;
            }
            return requested.equals(custom.getRequest());
        }
        if (!(existing instanceof DeviceLocationProviderParams.Default)) {
            throw new NoWhenBranchMatchedException();
        }
        if (allowUserDefined && this.userDefinedFactory != null) {
            return false;
        }
        DeviceLocationProviderParams.Default r52 = (DeviceLocationProviderParams.Default) existing;
        if (requestedType != r52.getType()) {
            DeviceLocationProviderType type = r52.getType();
            DeviceLocationProviderType deviceLocationProviderType = DeviceLocationProviderType.GOOGLE_PLAY_SERVICES;
            if (type == deviceLocationProviderType && requestedType == DeviceLocationProviderType.ANDROID) {
                return false;
            }
            DeviceLocationProviderType type2 = r52.getType();
            DeviceLocationProviderType deviceLocationProviderType2 = DeviceLocationProviderType.ANDROID;
            if (type2 == deviceLocationProviderType2 && requestedType == deviceLocationProviderType) {
                return false;
            }
            if (r52.getType() == deviceLocationProviderType2 && requestedType == DeviceLocationProviderType.BEST && googlePlayAvailable) {
                return false;
            }
        }
        boolean z2 = providerName == null || Intrinsics.areEqual(r52.getName(), providerName);
        if (requested == null && z2) {
            return true;
        }
        return Objects.equals(requested, r52.getRequest()) && z2;
    }

    private final void registerModeChangedReceiver(Context context) {
        this.locationModeChangedReceiver = new LocationModeChangedBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter(StubApp.getString2(13687));
        LocationModeChangedBroadcastReceiver locationModeChangedBroadcastReceiver = this.locationModeChangedReceiver;
        if (locationModeChangedBroadcastReceiver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("locationModeChangedReceiver");
            locationModeChangedBroadcastReceiver = null;
        }
        context.registerReceiver(locationModeChangedBroadcastReceiver, intentFilter);
    }

    @Override // com.mapbox.common.location.LocationService
    public AccuracyAuthorization getAccuracyAuthorization() {
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return LocationServiceUtils.getAccuracyAuthorization(context);
    }

    @Override // com.mapbox.common.location.LocationService
    public Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(LocationProviderRequest request) {
        return LocationService.DefaultImpls.getDeviceLocationProvider$default(this, DeviceLocationProviderType.BEST, request, false, 4, null);
    }

    public final CopyOnWriteArrayList<Pair<DeviceLocationProviderParams, WeakReference<DeviceLocationProvider>>> getLocationProviders$common_release() {
        return this.locationProviders;
    }

    @Override // com.mapbox.common.location.LocationService
    public PermissionStatus getPermissionStatus() {
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return LocationServiceUtils.getPermissionStatus(context);
    }

    @Override // com.mapbox.common.location.LocationService
    public boolean isAvailable() {
        LocationManager locationManager = this.locationManager;
        int i3 = I.b.f3017a;
        return locationManager.isLocationEnabled();
    }

    @Override // com.mapbox.common.location.LocationService
    public synchronized void registerObserver(LocationServiceObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.observers.add(observer);
    }

    public final void resetLocationServices$common_release() {
        this.locationProviders.clear();
    }

    public final void setLocationProviders$common_release(CopyOnWriteArrayList<Pair<DeviceLocationProviderParams, WeakReference<DeviceLocationProvider>>> copyOnWriteArrayList) {
        Intrinsics.checkNotNullParameter(copyOnWriteArrayList, "<set-?>");
        this.locationProviders = copyOnWriteArrayList;
    }

    @Override // com.mapbox.common.location.LocationService
    public synchronized void setUserDefinedDeviceLocationProviderFactory(DeviceLocationProviderFactory factory) {
        try {
            this.userDefinedFactory = factory;
            SettingsService settingsServiceFactory = SettingsServiceFactory.getInstance(SettingsServiceStorageType.NON_PERSISTENT);
            String string2 = StubApp.getString2("13691");
            Long longOrNull = StringsKt.toLongOrNull(String.valueOf(settingsServiceFactory.get(string2, Value.valueOf(0L)).getValue()));
            settingsServiceFactory.set(string2, Value.valueOf((longOrNull != null ? longOrNull.longValue() : 0L) + 1));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.mapbox.common.location.LocationService
    public synchronized void unregisterObserver(LocationServiceObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.observers.remove(observer);
    }

    @Override // com.mapbox.common.location.LocationService
    public Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(DeviceLocationProviderType type, LocationProviderRequest request, boolean allowUserDefined) {
        Intrinsics.checkNotNullParameter(type, "type");
        ExtendedLocationProviderParameters build = new ExtendedLocationProviderParameters.Builder().deviceLocationProviderType(type).allowUserDefined(Boolean.valueOf(allowUserDefined)).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder().\n            d…allowUserDefined).build()");
        return getDeviceLocationProvider(build, request);
    }

    @Override // com.mapbox.common.location.LocationService
    public Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(ExtendedLocationProviderParameters extendedParameters, LocationProviderRequest request) {
        boolean z2;
        DeviceLocationProviderType deviceLocationProviderType;
        Intrinsics.checkNotNullParameter(extendedParameters, "extendedParameters");
        try {
            z2 = GoogleDeviceLocationProvider.INSTANCE.isAvailable();
        } catch (IncompatibleGooglePlayServicesLocationVersion unused) {
            z2 = false;
        }
        boolean z10 = z2;
        DeviceLocationProviderType deviceLocationProviderType2 = extendedParameters.getDeviceLocationProviderType();
        if (deviceLocationProviderType2 == null) {
            deviceLocationProviderType2 = DeviceLocationProviderType.BEST;
        }
        DeviceLocationProviderType deviceLocationProviderType3 = deviceLocationProviderType2;
        Intrinsics.checkNotNullExpressionValue(deviceLocationProviderType3, "extendedParameters.devic…LocationProviderType.BEST");
        Boolean allowUserDefined = extendedParameters.getAllowUserDefined();
        if (allowUserDefined == null) {
            allowUserDefined = Boolean.TRUE;
        }
        boolean booleanValue = allowUserDefined.booleanValue();
        String locationProviderName = deviceLocationProviderType3 == DeviceLocationProviderType.ANDROID ? extendedParameters.getLocationProviderName() : null;
        CopyOnWriteArrayList<Pair<DeviceLocationProviderParams, WeakReference<DeviceLocationProvider>>> copyOnWriteArrayList = this.locationProviders;
        ArrayList arrayList = new ArrayList();
        for (Object obj : copyOnWriteArrayList) {
            if (((WeakReference) ((Pair) obj).getSecond()).get() != null) {
                arrayList.add(obj);
            }
        }
        CopyOnWriteArrayList<Pair<DeviceLocationProviderParams, WeakReference<DeviceLocationProvider>>> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>(arrayList);
        this.locationProviders = copyOnWriteArrayList2;
        Iterator<Pair<DeviceLocationProviderParams, WeakReference<DeviceLocationProvider>>> it = copyOnWriteArrayList2.iterator();
        while (it.hasNext()) {
            Pair<DeviceLocationProviderParams, WeakReference<DeviceLocationProvider>> next = it.next();
            DeviceLocationProvider deviceLocationProvider = next.getSecond().get();
            if (deviceLocationProvider != null) {
                LocationProviderRequest locationProviderRequest = request;
                if (isLocationProviderRequestCompatible(next.getFirst(), deviceLocationProviderType3, locationProviderRequest, z10, booleanValue, locationProviderName)) {
                    Expected<LocationError, DeviceLocationProvider> createValue = ExpectedFactory.createValue(deviceLocationProvider);
                    Intrinsics.checkNotNullExpressionValue(createValue, "createValue(provider)");
                    return createValue;
                }
                request = locationProviderRequest;
            }
        }
        LocationProviderRequest locationProviderRequest2 = request;
        DeviceLocationProviderFactory deviceLocationProviderFactory = this.userDefinedFactory;
        if (deviceLocationProviderFactory != null && booleanValue) {
            Expected<LocationError, DeviceLocationProvider> build = deviceLocationProviderFactory.build(locationProviderRequest2);
            Intrinsics.checkNotNullExpressionValue(build, "factory.build(request)");
            if (build.isValue()) {
                this.locationProviders.add(new Pair<>(new DeviceLocationProviderParams.Custom(new WeakReference(deviceLocationProviderFactory), locationProviderRequest2), new WeakReference(build.getValue())));
            }
            return build;
        }
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Expected<LocationError, DeviceLocationProvider> deviceLocationProvider2 = getDeviceLocationProvider(context, deviceLocationProviderType3, locationProviderRequest2, locationProviderName);
        if (deviceLocationProvider2.isValue()) {
            if (deviceLocationProvider2.getValue() instanceof GoogleDeviceLocationProvider) {
                deviceLocationProviderType = DeviceLocationProviderType.GOOGLE_PLAY_SERVICES;
            } else {
                deviceLocationProviderType = DeviceLocationProviderType.ANDROID;
            }
            this.locationProviders.add(new Pair<>(new DeviceLocationProviderParams.Default(deviceLocationProviderType, locationProviderRequest2, locationProviderName), new WeakReference(deviceLocationProvider2.getValue())));
        }
        return deviceLocationProvider2;
    }

    private final Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(Context context, DeviceLocationProviderType type, LocationProviderRequest request, String locationProviderName) {
        boolean z2;
        String string2 = StubApp.getString2(13619);
        try {
            z2 = GoogleDeviceLocationProvider.INSTANCE.isAvailable();
        } catch (IncompatibleGooglePlayServicesLocationVersion unused) {
            MapboxCommonLogger.INSTANCE.logW$common_release(string2, StubApp.getString2(13690));
            z2 = false;
        }
        if (type == null) {
            type = DeviceLocationProviderType.BEST;
        }
        DeviceLocationProviderType deviceLocationProviderType = DeviceLocationProviderType.BEST;
        if ((type == deviceLocationProviderType || type == DeviceLocationProviderType.GOOGLE_PLAY_SERVICES) && z2) {
            Expected<LocationError, DeviceLocationProvider> createValue = ExpectedFactory.createValue(new GoogleDeviceLocationProvider(context, request));
            Intrinsics.checkNotNullExpressionValue(createValue, "createValue(GoogleDevice…ovider(context, request))");
            return createValue;
        }
        if (type != deviceLocationProviderType && type != DeviceLocationProviderType.ANDROID) {
            LocationError locationError = new LocationError(LocationErrorCode.NOT_AVAILABLE, StubApp.getString2(13689));
            MapboxCommonLogger.INSTANCE.logE$common_release(string2, StubApp.getString2(8990) + locationError.getMessage());
            Expected<LocationError, DeviceLocationProvider> createError = ExpectedFactory.createError(locationError);
            Intrinsics.checkNotNullExpressionValue(createError, "createError(error)");
            return createError;
        }
        Expected<LocationError, DeviceLocationProvider> createValue2 = ExpectedFactory.createValue(new AndroidDeviceLocationProvider(context, request, locationProviderName));
        Intrinsics.checkNotNullExpressionValue(createValue2, "createValue(AndroidDevic…t, locationProviderName))");
        return createValue2;
    }
}
