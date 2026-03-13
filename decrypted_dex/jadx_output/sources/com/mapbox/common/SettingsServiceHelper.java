package com.mapbox.common;

import android.content.SharedPreferences;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.bindgen.None;
import com.stub.StubApp;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/mapbox/common/SettingsServiceHelper;", "", "()V", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class SettingsServiceHelper {
    private static final String MAPBOX_PREFERENCES_NAME = StubApp.getString2(13465);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<SharedPreferences> preferences$delegate = LazyKt.lazy(new Function0<SharedPreferences>() { // from class: com.mapbox.common.SettingsServiceHelper$Companion$preferences$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            return MapboxSDKCommon.INSTANCE.getContext().getSharedPreferences(StubApp.getString2(13465), 0);
        }
    });

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J,\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00170\u00102\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/mapbox/common/SettingsServiceHelper$Companion;", "", "()V", "MAPBOX_PREFERENCES_NAME", "", "preferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getPreferences", "()Landroid/content/SharedPreferences;", "preferences$delegate", "Lkotlin/Lazy;", "clear", "", "clear$common_release", "erase", "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/bindgen/None;", "key", "get", "has", "", "set", "", "value", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final SharedPreferences getPreferences() {
            return (SharedPreferences) SettingsServiceHelper.preferences$delegate.getValue();
        }

        public final void clear$common_release() {
            SharedPreferences.Editor edit = getPreferences().edit();
            edit.clear();
            edit.apply();
        }

        @JvmStatic
        public final Expected<String, None> erase(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                SharedPreferences.Editor edit = getPreferences().edit();
                edit.remove(key);
                edit.apply();
                Expected<String, None> createNone = ExpectedFactory.createNone();
                Intrinsics.checkNotNullExpressionValue(createNone, "createNone()");
                return createNone;
            } catch (Exception e10) {
                String message = e10.getMessage();
                if (message == null) {
                    message = StubApp.getString2(440);
                }
                Expected<String, None> createError = ExpectedFactory.createError(message);
                Intrinsics.checkNotNullExpressionValue(createError, "createError(exception.message ?: \"Unknown error\")");
                return createError;
            }
        }

        @JvmStatic
        public final Expected<String, String> get(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                String string = getPreferences().getString(key, null);
                Expected<String, String> createValue = string != null ? ExpectedFactory.createValue(string) : null;
                if (createValue != null) {
                    return createValue;
                }
                Expected<String, String> createError = ExpectedFactory.createError(StubApp.getString2(13466));
                Intrinsics.checkNotNullExpressionValue(createError, "createError(\"Key is not found\")");
                return createError;
            } catch (ClassCastException e10) {
                StringBuilder l9 = b.l(StubApp.getString2(13467), key, StubApp.getString2(994));
                l9.append(e10.getMessage());
                String sb2 = l9.toString();
                Log.error(sb2, StubApp.getString2(3402));
                Expected<String, String> createError2 = ExpectedFactory.createError(sb2);
                Intrinsics.checkNotNullExpressionValue(createError2, "createError(errorMessage)");
                return createError2;
            } catch (Exception e11) {
                String message = e11.getMessage();
                if (message == null) {
                    message = StubApp.getString2(440);
                }
                Expected<String, String> createError3 = ExpectedFactory.createError(message);
                Intrinsics.checkNotNullExpressionValue(createError3, "createError(exception.message ?: \"Unknown error\")");
                return createError3;
            }
        }

        @JvmStatic
        public final boolean has(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                return getPreferences().contains(key);
            } catch (Exception unused) {
                return false;
            }
        }

        @JvmStatic
        public final Expected<String, List<String>> set(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            Expected<String, String> expected = get(key);
            if (expected.isError() && !Intrinsics.areEqual(expected.getError(), "Key is not found")) {
                String error = expected.getError();
                Intrinsics.checkNotNull(error);
                Expected<String, List<String>> createError = ExpectedFactory.createError(error);
                Intrinsics.checkNotNullExpressionValue(createError, "createError(existingValue.error!!)");
                return createError;
            }
            if (expected.isValue() && Intrinsics.areEqual(expected.getValue(), value)) {
                Expected<String, List<String>> createValue = ExpectedFactory.createValue(CollectionsKt.listOf(value));
                Intrinsics.checkNotNullExpressionValue(createValue, "createValue(listOf(value))");
                return createValue;
            }
            String value2 = expected.isValue() ? expected.getValue() : null;
            try {
                SharedPreferences.Editor edit = getPreferences().edit();
                edit.putString(key, value);
                edit.apply();
                Expected<String, List<String>> createValue2 = ExpectedFactory.createValue(CollectionsKt.listOf(value2));
                Intrinsics.checkNotNullExpressionValue(createValue2, "createValue(listOf(oldValue))");
                return createValue2;
            } catch (Exception e10) {
                String message = e10.getMessage();
                if (message == null) {
                    message = StubApp.getString2(440);
                }
                Expected<String, List<String>> createError2 = ExpectedFactory.createError(message);
                Intrinsics.checkNotNullExpressionValue(createError2, "createError(exception.message ?: \"Unknown error\")");
                return createError2;
            }
        }

        private Companion() {
        }
    }

    @JvmStatic
    public static final Expected<String, None> erase(String str) {
        return INSTANCE.erase(str);
    }

    @JvmStatic
    public static final Expected<String, String> get(String str) {
        return INSTANCE.get(str);
    }

    @JvmStatic
    public static final boolean has(String str) {
        return INSTANCE.has(str);
    }

    @JvmStatic
    public static final Expected<String, List<String>> set(String str, String str2) {
        return INSTANCE.set(str, str2);
    }
}
