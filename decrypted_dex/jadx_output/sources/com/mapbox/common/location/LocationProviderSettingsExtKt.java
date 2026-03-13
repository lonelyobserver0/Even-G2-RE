package com.mapbox.common.location;

import S3.D;
import android.location.Criteria;
import com.google.android.gms.location.LocationRequest;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.stub.StubApp;
import i4.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0005H\u0000\u001a\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007*\u0004\u0018\u00010\u0002H\u0000\u001a\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u0007*\u0004\u0018\u00010\u0002H\u0000¨\u0006\f"}, d2 = {"minimumDisplacement", "", "Lcom/mapbox/common/location/LocationProviderRequest;", "default", "minimumInterval", "", "toCriteria", "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/common/location/LocationError;", "Landroid/location/Criteria;", "toLocationRequest", "Lcom/google/android/gms/location/LocationRequest;", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class LocationProviderSettingsExtKt {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccuracyLevel.values().length];
            try {
                iArr[AccuracyLevel.HIGHEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccuracyLevel.HIGH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccuracyLevel.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccuracyLevel.LOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccuracyLevel.PASSIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final float minimumDisplacement(LocationProviderRequest locationProviderRequest, float f10) {
        Float displacement = locationProviderRequest != null ? locationProviderRequest.getDisplacement() : null;
        return displacement == null ? f10 : displacement.floatValue();
    }

    public static /* synthetic */ float minimumDisplacement$default(LocationProviderRequest locationProviderRequest, float f10, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            f10 = 1.0f;
        }
        return minimumDisplacement(locationProviderRequest, f10);
    }

    public static final long minimumInterval(LocationProviderRequest locationProviderRequest, long j) {
        IntervalSettings interval;
        Long minimumInterval = (locationProviderRequest == null || (interval = locationProviderRequest.getInterval()) == null) ? null : interval.getMinimumInterval();
        return minimumInterval == null ? j : minimumInterval.longValue();
    }

    public static /* synthetic */ long minimumInterval$default(LocationProviderRequest locationProviderRequest, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = 1000;
        }
        return minimumInterval(locationProviderRequest, j);
    }

    public static final Expected<LocationError, Criteria> toCriteria(LocationProviderRequest locationProviderRequest) {
        Criteria criteria = new Criteria();
        if (locationProviderRequest != null) {
            locationProviderRequest.getAccuracy();
            AccuracyLevel accuracy = locationProviderRequest.getAccuracy();
            int i3 = accuracy == null ? -1 : WhenMappings.$EnumSwitchMapping$0[accuracy.ordinal()];
            if (i3 == 1) {
                criteria.setCostAllowed(true);
                criteria.setPowerRequirement(3);
                criteria.setHorizontalAccuracy(3);
                criteria.setVerticalAccuracy(3);
                criteria.setBearingAccuracy(3);
                criteria.setSpeedAccuracy(3);
            } else if (i3 == 2) {
                criteria.setPowerRequirement(3);
                criteria.setHorizontalAccuracy(3);
                criteria.setVerticalAccuracy(3);
                criteria.setBearingAccuracy(3);
                criteria.setSpeedAccuracy(3);
            } else if (i3 == 3) {
                criteria.setPowerRequirement(2);
                criteria.setHorizontalAccuracy(2);
                criteria.setVerticalAccuracy(2);
                criteria.setBearingAccuracy(2);
                criteria.setSpeedAccuracy(2);
            } else if (i3 == 4) {
                criteria.setPowerRequirement(1);
                criteria.setHorizontalAccuracy(1);
                criteria.setVerticalAccuracy(1);
                criteria.setBearingAccuracy(1);
                criteria.setSpeedAccuracy(1);
            } else if (i3 != 5) {
                Expected<LocationError, Criteria> createError = ExpectedFactory.createError(new LocationError(LocationErrorCode.INVALID_ARGUMENT, StubApp.getString2(13681) + locationProviderRequest.getAccuracy()));
                Intrinsics.checkNotNullExpressionValue(createError, "createError(error)");
                return createError;
            }
        }
        Expected<LocationError, Criteria> createValue = ExpectedFactory.createValue(criteria);
        Intrinsics.checkNotNullExpressionValue(createValue, "createValue(criteria)");
        return createValue;
    }

    public static final Expected<LocationError, LocationRequest> toLocationRequest(LocationProviderRequest locationProviderRequest) {
        Long maximumInterval;
        Long minimumInterval;
        Long interval;
        LocationRequest d8 = LocationRequest.d();
        AccuracyLevel accuracy = locationProviderRequest != null ? locationProviderRequest.getAccuracy() : null;
        int i3 = accuracy == null ? -1 : WhenMappings.$EnumSwitchMapping$0[accuracy.ordinal()];
        int i10 = 100;
        if (i3 != 1 && i3 != 2) {
            if (i3 == 3) {
                i10 = 102;
            } else if (i3 == 4) {
                i10 = 104;
            } else {
                if (i3 != 5) {
                    LocationErrorCode locationErrorCode = LocationErrorCode.INVALID_ARGUMENT;
                    StringBuilder sb2 = new StringBuilder(StubApp.getString2(13681));
                    sb2.append(locationProviderRequest != null ? locationProviderRequest.getAccuracy() : null);
                    Expected<LocationError, LocationRequest> createError = ExpectedFactory.createError(new LocationError(locationErrorCode, sb2.toString()));
                    Intrinsics.checkNotNullExpressionValue(createError, "createError(error)");
                    return createError;
                }
                i10 = 105;
            }
        }
        y.a(i10);
        d8.f11784a = i10;
        IntervalSettings interval2 = locationProviderRequest.getInterval();
        String string2 = StubApp.getString2(345);
        if (interval2 != null && (interval = interval2.getInterval()) != null) {
            Intrinsics.checkNotNullExpressionValue(interval, string2);
            d8.g(interval.longValue());
        }
        IntervalSettings interval3 = locationProviderRequest.getInterval();
        if (interval3 != null && (minimumInterval = interval3.getMinimumInterval()) != null) {
            Intrinsics.checkNotNullExpressionValue(minimumInterval, string2);
            long longValue = minimumInterval.longValue();
            D.c(longValue >= 0, StubApp.getString2(1074), minimumInterval);
            d8.f11786c = longValue;
        }
        IntervalSettings interval4 = locationProviderRequest.getInterval();
        if (interval4 != null && (maximumInterval = interval4.getMaximumInterval()) != null) {
            Intrinsics.checkNotNullExpressionValue(maximumInterval, string2);
            long longValue2 = maximumInterval.longValue();
            D.c(longValue2 >= 0, StubApp.getString2(13682), maximumInterval);
            d8.f11787d = longValue2;
        }
        Float displacement = locationProviderRequest.getDisplacement();
        if (displacement != null) {
            d8.i(displacement.floatValue());
        }
        Expected<LocationError, LocationRequest> createValue = ExpectedFactory.createValue(d8);
        Intrinsics.checkNotNullExpressionValue(createValue, "createValue(request)");
        return createValue;
    }
}
