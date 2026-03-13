package com.mapbox.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.system.Os;
import com.mapbox.common.core.module.CommonSingletonModuleProvider;
import com.stub.StubApp;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/mapbox/common/CoreInitializer;", "LR1/b;", "Lcom/mapbox/common/MapboxSDKCommon;", "<init>", "()V", "Landroid/content/Context;", "context", "", "setupSqlite", "(Landroid/content/Context;)V", "create", "(Landroid/content/Context;)Lcom/mapbox/common/MapboxSDKCommon;", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CoreInitializer implements R1.b {
    private static final String SQLITE_TMPDIR_VAR_NAME = StubApp.getString2(13259);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/mapbox/common/CoreInitializer$Companion;", "", "()V", "SQLITE_TMPDIR_VAR_NAME", "", "createSystemInformation", "Lcom/mapbox/common/SystemInformation;", "isEmulator", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean isEmulator() {
            boolean contains$default;
            boolean contains$default2;
            boolean contains$default3;
            boolean contains$default4;
            boolean contains$default5;
            boolean contains$default6;
            boolean contains$default7;
            boolean contains$default8;
            boolean contains$default9;
            boolean contains$default10;
            boolean contains$default11;
            boolean contains$default12;
            boolean contains$default13;
            String BRAND = Build.BRAND;
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            String string2 = StubApp.getString2(5879);
            if (StringsKt.O(BRAND, string2)) {
                String DEVICE = Build.DEVICE;
                Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                if (StringsKt.O(DEVICE, string2)) {
                    return true;
                }
            }
            String FINGERPRINT = Build.FINGERPRINT;
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
            if (StringsKt.O(FINGERPRINT, string2)) {
                return true;
            }
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
            if (StringsKt.O(FINGERPRINT, StubApp.getString2(351))) {
                return true;
            }
            String HARDWARE = Build.HARDWARE;
            Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
            contains$default = StringsKt__StringsKt.contains$default(HARDWARE, (CharSequence) StubApp.getString2(5880), false, 2, (Object) null);
            if (contains$default) {
                return true;
            }
            Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
            contains$default2 = StringsKt__StringsKt.contains$default(HARDWARE, (CharSequence) StubApp.getString2(5881), false, 2, (Object) null);
            if (contains$default2) {
                return true;
            }
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            String string22 = StubApp.getString2(5882);
            contains$default3 = StringsKt__StringsKt.contains$default(MODEL, (CharSequence) string22, false, 2, (Object) null);
            if (contains$default3) {
                return true;
            }
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            contains$default4 = StringsKt__StringsKt.contains$default(MODEL, (CharSequence) StubApp.getString2(5883), false, 2, (Object) null);
            if (contains$default4) {
                return true;
            }
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            contains$default5 = StringsKt__StringsKt.contains$default(MODEL, (CharSequence) StubApp.getString2(5884), false, 2, (Object) null);
            if (contains$default5) {
                return true;
            }
            String MANUFACTURER = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            contains$default6 = StringsKt__StringsKt.contains$default(MANUFACTURER, (CharSequence) StubApp.getString2(5885), false, 2, (Object) null);
            if (contains$default6) {
                return true;
            }
            String PRODUCT = Build.PRODUCT;
            Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
            contains$default7 = StringsKt__StringsKt.contains$default(PRODUCT, (CharSequence) StubApp.getString2(13256), false, 2, (Object) null);
            if (contains$default7) {
                return true;
            }
            Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
            contains$default8 = StringsKt__StringsKt.contains$default(PRODUCT, (CharSequence) string22, false, 2, (Object) null);
            if (contains$default8) {
                return true;
            }
            Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
            contains$default9 = StringsKt__StringsKt.contains$default(PRODUCT, (CharSequence) StubApp.getString2(5886), false, 2, (Object) null);
            if (contains$default9) {
                return true;
            }
            Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
            contains$default10 = StringsKt__StringsKt.contains$default(PRODUCT, (CharSequence) StubApp.getString2(13257), false, 2, (Object) null);
            if (contains$default10) {
                return true;
            }
            Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
            contains$default11 = StringsKt__StringsKt.contains$default(PRODUCT, (CharSequence) StubApp.getString2(5887), false, 2, (Object) null);
            if (contains$default11) {
                return true;
            }
            Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
            contains$default12 = StringsKt__StringsKt.contains$default(PRODUCT, (CharSequence) StubApp.getString2(5888), false, 2, (Object) null);
            if (contains$default12) {
                return true;
            }
            Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
            contains$default13 = StringsKt__StringsKt.contains$default(PRODUCT, (CharSequence) StubApp.getString2(5889), false, 2, (Object) null);
            return contains$default13;
        }

        @JvmStatic
        public final SystemInformation createSystemInformation() {
            String str;
            String str2;
            String str3;
            PackageInfo packageInfo;
            Context context = MapboxSDKCommon.INSTANCE.getContext();
            PackageManager packageManager = context.getPackageManager();
            String string2 = StubApp.getString2(351);
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0)) == null) {
                str = string2;
                str2 = str;
                str3 = str2;
            } else {
                String obj = packageManager.getApplicationLabel(packageInfo.applicationInfo).toString();
                String str4 = packageInfo.versionName;
                if (str4 != null) {
                    Intrinsics.checkNotNullExpressionValue(str4, "packageInfo.versionName");
                } else {
                    str4 = "";
                }
                str = obj;
                str3 = String.valueOf(packageInfo.versionCode);
                str2 = str4;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String str5 = applicationInfo != null ? applicationInfo.packageName : null;
            String str6 = str5 == null ? string2 : str5;
            String str7 = Build.DEVICE;
            String str8 = str7 == null ? "" : str7;
            String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
            Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
            String str9 = (String) ArraysKt.firstOrNull(SUPPORTED_ABIS);
            String str10 = str9 == null ? "" : str9;
            String str11 = Build.MODEL;
            String str12 = (str11 == null || StringsKt.isBlank(str11)) ? "" : str11;
            File filesDir = context.getFilesDir();
            String absolutePath = filesDir != null ? filesDir.getAbsolutePath() : null;
            String str13 = absolutePath == null ? "" : absolutePath;
            File cacheDir = context.getCacheDir();
            String absolutePath2 = cacheDir != null ? cacheDir.getAbsolutePath() : null;
            return new SystemInformation(Platform.ANDROID, StubApp.getString2(13258), Build.VERSION.RELEASE.toString(), str, str6, str2, str3, str8, str10, str12, str13, !isEmulator(), absolutePath2 == null ? "" : absolutePath2);
        }

        private Companion() {
        }
    }

    @JvmStatic
    public static final SystemInformation createSystemInformation() {
        return INSTANCE.createSystemInformation();
    }

    private final void setupSqlite(Context context) {
        String string2 = StubApp.getString2(13259);
        String str = Os.getenv(string2);
        if (str == null || StringsKt.isBlank(str)) {
            Os.setenv(string2, context.getCacheDir().getAbsolutePath(), true);
        }
    }

    @Override // R1.b
    public List<Class<? extends R1.b>> dependencies() {
        return CollectionsKt.emptyList();
    }

    @Override // R1.b
    public MapboxSDKCommon create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        setupSqlite(context);
        MapboxSDKCommon invoke = MapboxSDKCommon.INSTANCE.invoke(context);
        CommonSingletonModuleProvider.INSTANCE.getLoaderInstance().load(StubApp.getString2(13260));
        Log.info(StubApp.getString2(13261) + Version.getCommonSDKVersionString() + '(' + Version.getCommonSDKRevisionString() + ')', StubApp.getString2(13262));
        String accessToken = MapboxOptions.getAccessToken();
        if (StringsKt.isBlank(accessToken)) {
            Log.info(StubApp.getString2(13263), StubApp.getString2(13264));
            return invoke;
        }
        MapboxOptions.setAccessToken(accessToken);
        return invoke;
    }
}
