package com.google.android.gms.measurement;

import S3.D;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.U;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.stub.StubApp;
import j4.AbstractC1090c;
import j4.C1088a;
import j4.C1089b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l4.A0;
import l4.C1200n0;
import l4.Q0;

@Deprecated
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AppMeasurement {

    /* renamed from: b, reason: collision with root package name */
    public static volatile AppMeasurement f11799b;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1090c f11800a;

    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;
    }

    public AppMeasurement(C1200n0 c1200n0) {
        this.f11800a = new C1088a(c1200n0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f11799b == null) {
            synchronized (AppMeasurement.class) {
                if (f11799b == null) {
                    Q0 q02 = (Q0) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (q02 != null) {
                        f11799b = new AppMeasurement(q02);
                    } else {
                        f11799b = new AppMeasurement(C1200n0.r(context, new U(0L, 0L, true, null, null), null));
                    }
                }
            }
        }
        return f11799b;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f11800a.f(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f11800a.h(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f11800a.e(str);
    }

    @Keep
    public long generateEventId() {
        return this.f11800a.g();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f11800a.k();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> i3 = this.f11800a.i(str, str2);
        ArrayList arrayList = new ArrayList(i3 == null ? 0 : i3.size());
        for (Bundle bundle : i3) {
            ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
            D.h(bundle);
            conditionalUserProperty.mAppId = (String) A0.e(bundle, StubApp.getString2(3132), String.class, null);
            conditionalUserProperty.mOrigin = (String) A0.e(bundle, StubApp.getString2(3353), String.class, null);
            conditionalUserProperty.mName = (String) A0.e(bundle, StubApp.getString2(ModuleDescriptor.MODULE_VERSION), String.class, null);
            conditionalUserProperty.mValue = A0.e(bundle, StubApp.getString2(1061), Object.class, null);
            conditionalUserProperty.mTriggerEventName = (String) A0.e(bundle, StubApp.getString2(12356), String.class, null);
            conditionalUserProperty.mTriggerTimeout = ((Long) A0.e(bundle, StubApp.getString2(12357), Long.class, 0L)).longValue();
            conditionalUserProperty.mTimedOutEventName = (String) A0.e(bundle, StubApp.getString2(12358), String.class, null);
            conditionalUserProperty.mTimedOutEventParams = (Bundle) A0.e(bundle, StubApp.getString2(12359), Bundle.class, null);
            conditionalUserProperty.mTriggeredEventName = (String) A0.e(bundle, StubApp.getString2(12360), String.class, null);
            conditionalUserProperty.mTriggeredEventParams = (Bundle) A0.e(bundle, StubApp.getString2(12361), Bundle.class, null);
            conditionalUserProperty.mTimeToLive = ((Long) A0.e(bundle, StubApp.getString2(12362), Long.class, 0L)).longValue();
            conditionalUserProperty.mExpiredEventName = (String) A0.e(bundle, StubApp.getString2(12363), String.class, null);
            conditionalUserProperty.mExpiredEventParams = (Bundle) A0.e(bundle, StubApp.getString2(12364), Bundle.class, null);
            conditionalUserProperty.mActive = ((Boolean) A0.e(bundle, StubApp.getString2(12365), Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.mCreationTimestamp = ((Long) A0.e(bundle, StubApp.getString2(3138), Long.class, 0L)).longValue();
            conditionalUserProperty.mTriggeredTimestamp = ((Long) A0.e(bundle, StubApp.getString2(12366), Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f11800a.c();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f11800a.b();
    }

    @Keep
    public String getGmpAppId() {
        return this.f11800a.l();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f11800a.j(str);
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z2) {
        return this.f11800a.m(str, str2, z2);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f11800a.a(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        D.h(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString(StubApp.getString2(3132), str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString(StubApp.getString2(3353), str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString(StubApp.getString2(ModuleDescriptor.MODULE_VERSION), str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            A0.c(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString(StubApp.getString2(12356), str4);
        }
        bundle.putLong(StubApp.getString2(12357), conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString(StubApp.getString2(12358), str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle(StubApp.getString2(12359), bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString(StubApp.getString2(12360), str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle(StubApp.getString2(12361), bundle3);
        }
        bundle.putLong(StubApp.getString2(12362), conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString(StubApp.getString2(12363), str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle(StubApp.getString2(12364), bundle4);
        }
        bundle.putLong(StubApp.getString2(3138), conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean(StubApp.getString2(12365), conditionalUserProperty.mActive);
        bundle.putLong(StubApp.getString2(12366), conditionalUserProperty.mTriggeredTimestamp);
        this.f11800a.d(bundle);
    }

    public AppMeasurement(Q0 q02) {
        this.f11800a = new C1089b(q02);
    }
}
