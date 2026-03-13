package M2;

import C.AbstractC0025b;
import C.J;
import Xa.AbstractActivityC0364d;
import Ya.d;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.lifecycle.C0446v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC0444t;
import com.even.even_core.services.nls.EvNLService;
import com.even.even_core.utils.room.EvDatabase;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LM2/c;", "Ldb/b;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "Leb/a;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "<init>", "()V", "even_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements InterfaceC0825b, MethodChannel.MethodCallHandler, EventChannel.StreamHandler, eb.a, DefaultLifecycleObserver {

    /* renamed from: g, reason: collision with root package name */
    public static final LinkedHashMap f4515g = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public Context f4516a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractActivityC0364d f4517b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0444t f4518c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4519d;

    /* renamed from: e, reason: collision with root package name */
    public PowerManager.WakeLock f4520e;

    /* renamed from: f, reason: collision with root package name */
    public MethodChannel f4521f;

    public final Context a() {
        Context context = this.f4516a;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ctx");
        return null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void d(InterfaceC0444t owner) {
        PowerManager.WakeLock wakeLock;
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(owner, "owner");
        PowerManager.WakeLock wakeLock2 = this.f4520e;
        if (wakeLock2 != null && wakeLock2.isHeld() && (wakeLock = this.f4520e) != null) {
            wakeLock.release();
        }
        this.f4520e = null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void k(InterfaceC0444t owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (this.f4519d && this.f4520e == null) {
            AbstractActivityC0364d abstractActivityC0364d = this.f4517b;
            PowerManager powerManager = (PowerManager) (abstractActivityC0364d != null ? abstractActivityC0364d.getSystemService(StubApp.getString2(1358)) : null);
            PowerManager.WakeLock newWakeLock = powerManager != null ? powerManager.newWakeLock(536870913, Reflection.getOrCreateKotlinClass(c.class).getSimpleName()) : null;
            this.f4520e = newWakeLock;
            if (newWakeLock != null) {
                newWakeLock.acquire();
            }
        }
    }

    @Override // eb.a
    public final void onAttachedToActivity(eb.b binding) {
        C0446v i3;
        Intrinsics.checkNotNullParameter(binding, "binding");
        d dVar = (d) binding;
        AbstractActivityC0364d abstractActivityC0364d = dVar.f8882a;
        this.f4517b = abstractActivityC0364d;
        if (abstractActivityC0364d == null) {
            abstractActivityC0364d = null;
        }
        this.f4518c = abstractActivityC0364d;
        if (abstractActivityC0364d != null && (i3 = abstractActivityC0364d.i()) != null) {
            i3.a(this);
        }
        dVar.b(new b());
        P2.b bVar = P2.b.f5486b;
        AbstractActivityC0364d context = this.f4517b;
        Intrinsics.checkNotNull(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (bVar.f5487a != null) {
            return;
        }
        bVar.f5487a = (EvDatabase) Ec.d.r(context, EvDatabase.class, StubApp.getString2(3491)).b();
    }

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        Context context = flutterPluginBinding.f13553a;
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.f4516a = context;
        P2.b bVar = P2.b.f5486b;
        Context context2 = a();
        Intrinsics.checkNotNullParameter(context2, "context");
        if (bVar.f5487a == null) {
            bVar.f5487a = (EvDatabase) Ec.d.r(context2, EvDatabase.class, StubApp.getString2(3491)).b();
        }
        BinaryMessenger binaryMessenger = flutterPluginBinding.f13554b;
        Intrinsics.checkNotNullExpressionValue(binaryMessenger, "getBinaryMessenger(...)");
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, StubApp.getString2(3492));
        this.f4521f = methodChannel;
        methodChannel.setMethodCallHandler(this);
        u5.d dVar = a.f4512a;
        new EventChannel(binaryMessenger, n3.a.a(StubApp.getString2(3490))).setStreamHandler(this);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        if (obj instanceof String) {
            a valueOf = a.valueOf((String) obj);
            valueOf.getClass();
        }
    }

    @Override // eb.a
    public final void onDetachedFromActivity() {
        PowerManager.WakeLock wakeLock;
        C0446v i3;
        this.f4517b = null;
        InterfaceC0444t interfaceC0444t = this.f4518c;
        if (interfaceC0444t != null && (i3 = interfaceC0444t.i()) != null) {
            i3.b(this);
        }
        this.f4518c = null;
        PowerManager.WakeLock wakeLock2 = this.f4520e;
        if (wakeLock2 != null && wakeLock2.isHeld() && (wakeLock = this.f4520e) != null) {
            wakeLock.release();
        }
        this.f4520e = null;
    }

    @Override // eb.a
    public final void onDetachedFromActivityForConfigChanges() {
        C0446v i3;
        InterfaceC0444t interfaceC0444t = this.f4518c;
        if (interfaceC0444t != null && (i3 = interfaceC0444t.i()) != null) {
            i3.b(this);
        }
        this.f4518c = null;
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.f4521f;
        if (methodChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink eventSink) {
        Object obj2;
        if (!(obj instanceof String) || eventSink == null) {
            return;
        }
        String name = (String) obj;
        a.f4512a.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Iterator<E> it = a.f4514c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (Intrinsics.areEqual(n3.a.a(((a) obj2).name()), name)) {
                    break;
                }
            }
        }
        a aVar = (a) obj2;
        if (aVar != null) {
            Intrinsics.checkNotNullParameter(eventSink, "eventSink");
            f4515g.put(n3.a.a(aVar.name()), eventSink);
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) {
        Map map;
        Pair pair;
        AbstractActivityC0364d abstractActivityC0364d;
        AbstractActivityC0364d abstractActivityC0364d2;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        Pair pair2;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        if (Intrinsics.areEqual(call.method, "getPlatformVersion")) {
            result.success(StubApp.getString2(2817) + Build.VERSION.RELEASE);
            return;
        }
        if (Intrinsics.areEqual(call.method, "backToDesktop")) {
            AbstractActivityC0364d abstractActivityC0364d3 = this.f4517b;
            if (abstractActivityC0364d3 != null) {
                abstractActivityC0364d3.moveTaskToBack(false);
            }
        } else {
            boolean areEqual = Intrinsics.areEqual(call.method, "getAppEnv");
            String string2 = StubApp.getString2(354);
            String string22 = StubApp.getString2(3493);
            if (areEqual) {
                List list = O2.a.f5195a;
                Context a3 = a();
                Intrinsics.checkNotNullParameter(a3, string22);
                Intrinsics.checkNotNullParameter(a3, string22);
                PackageInfo packageInfo = a3.getPackageManager().getPackageInfo(a3.getPackageName(), 0);
                Intrinsics.checkNotNullExpressionValue(packageInfo, "getPackageInfo(...)");
                String str = packageInfo.versionName;
                if (str == null) {
                    str = StubApp.getString2(3494);
                }
                Pair pair3 = new Pair(str, String.valueOf(packageInfo.getLongVersionCode()));
                Intrinsics.checkNotNullParameter(a3, string22);
                String string23 = StubApp.getString2(1817);
                TelephonyManager telephonyManager = (TelephonyManager) a3.getSystemService(string23);
                Intrinsics.checkNotNull(telephonyManager);
                String networkOperator = telephonyManager.getNetworkOperator();
                Intrinsics.checkNotNullExpressionValue(networkOperator, "getNetworkOperator(...)");
                if (networkOperator.length() > 3) {
                    String substring = networkOperator.substring(0, 3);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    String substring2 = networkOperator.substring(3);
                    Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                    pair2 = new Pair(substring, substring2);
                } else {
                    pair2 = new Pair(networkOperator, "");
                }
                String platform = Build.VERSION.RELEASE;
                Intrinsics.checkNotNullExpressionValue(platform, "RELEASE");
                Intrinsics.checkNotNullParameter(a3, string22);
                String deviceId = Settings.Secure.getString(a3.getContentResolver(), StubApp.getString2(3495));
                Intrinsics.checkNotNullExpressionValue(deviceId, "getString(...)");
                String packageName = a3.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                String version = (String) pair3.getFirst();
                String build = (String) pair3.getSecond();
                String brand = Build.MANUFACTURER;
                Intrinsics.checkNotNullExpressionValue(brand, "MANUFACTURER");
                String model = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(model, "MODEL");
                String osVersion = platform.toString();
                Intrinsics.checkNotNullParameter(a3, string2);
                WebSettings settings = new WebView(a3).getSettings();
                Pair pair4 = pair2;
                Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
                String webUa = settings.getUserAgentString();
                Intrinsics.checkNotNullExpressionValue(webUa, "getUserAgentString(...)");
                Intrinsics.checkNotNullParameter(a3, string22);
                Object systemService = a3.getSystemService(string23);
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                String carrier = ((TelephonyManager) systemService).getNetworkOperatorName();
                Intrinsics.checkNotNullExpressionValue(carrier, "getNetworkOperatorName(...)");
                String str2 = (String) pair4.getFirst();
                String str3 = (String) pair4.getSecond();
                String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
                Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
                String str4 = (String) ArraysKt.firstOrNull(SUPPORTED_ABIS);
                if (str4 == null) {
                    str4 = StubApp.getString2(351);
                }
                Pair pair5 = TuplesKt.to(StubApp.getString2(3496), str4);
                Pair pair6 = TuplesKt.to(StubApp.getString2(3497), Build.VERSION.INCREMENTAL);
                Pair pair7 = TuplesKt.to(StubApp.getString2(3498), Build.DISPLAY);
                String packageName2 = a3.getPackageName();
                Intrinsics.checkNotNullParameter(a3, string2);
                PackageManager packageManager = a3.getPackageManager();
                Intrinsics.checkNotNull(packageName2);
                Map hardware = MapsKt.mapOf(pair5, pair6, pair7, TuplesKt.to(StubApp.getString2(3499), Long.valueOf(packageManager.getPackageInfo(packageName2, 0).firstInstallTime)));
                Intrinsics.checkNotNullParameter(platform, "platform");
                Intrinsics.checkNotNullParameter(deviceId, "deviceId");
                Intrinsics.checkNotNullParameter(packageName, "packageName");
                Intrinsics.checkNotNullParameter(version, "version");
                Intrinsics.checkNotNullParameter(build, "build");
                Intrinsics.checkNotNullParameter(brand, "brand");
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(osVersion, "osVersion");
                Intrinsics.checkNotNullParameter(webUa, "webUa");
                Intrinsics.checkNotNullParameter(carrier, "carrier");
                String string24 = StubApp.getString2(3500);
                Intrinsics.checkNotNullParameter(str2, string24);
                String string25 = StubApp.getString2(3501);
                Intrinsics.checkNotNullParameter(str3, string25);
                String buildTime = StubApp.getString2(3502);
                Intrinsics.checkNotNullParameter(buildTime, "buildTime");
                Intrinsics.checkNotNullParameter(hardware, "hardware");
                result.success(MapsKt.mapOf(TuplesKt.to("platform", platform), TuplesKt.to("deviceId", deviceId), TuplesKt.to(StubApp.getString2(3503), packageName), TuplesKt.to("version", version), TuplesKt.to("build", build), TuplesKt.to("brand", brand), TuplesKt.to("model", model), TuplesKt.to("osVersion", osVersion), TuplesKt.to("webUa", webUa), TuplesKt.to("carrier", carrier), TuplesKt.to(string24, str2), TuplesKt.to(string25, str3), TuplesKt.to("buildTime", buildTime), TuplesKt.to("hardware", hardware)));
                return;
            }
            boolean areEqual2 = Intrinsics.areEqual(call.method, "getNetworkType");
            String string26 = StubApp.getString2(1848);
            if (areEqual2) {
                List list2 = O2.a.f5195a;
                Context a9 = a();
                String str5 = "Unknown";
                Intrinsics.checkNotNullParameter(a9, string22);
                try {
                    Intrinsics.checkNotNullParameter(a9, string2);
                    try {
                        ConnectivityManager connectivityManager = (ConnectivityManager) a9.getSystemService(ConnectivityManager.class);
                        if (connectivityManager != null && (activeNetwork = connectivityManager.getActiveNetwork()) != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                            networkCapabilities.hasTransport(1);
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    TelephonyManager telephonyManager2 = (TelephonyManager) a9.getSystemService(TelephonyManager.class);
                    if (telephonyManager2 != null) {
                        switch (D.a.a(a9, string26) == 0 ? telephonyManager2.getDataNetworkType() : -1) {
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                                str5 = "2G";
                                break;
                            case 3:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                            case 10:
                            case 12:
                            case 14:
                            case 15:
                                str5 = "3G";
                                break;
                            case 13:
                                str5 = "4G";
                                break;
                            case 20:
                                str5 = "5G";
                                break;
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                result.success(str5);
                return;
            }
            if (Intrinsics.areEqual(call.method, "initKeepAlive")) {
                this.f4519d = true;
            } else {
                boolean areEqual3 = Intrinsics.areEqual(call.method, "hasNotificationPermission");
                String string27 = StubApp.getString2(783);
                String string28 = StubApp.getString2(2680);
                if (areEqual3 && (abstractActivityC0364d2 = this.f4517b) != null) {
                    O2.c cVar = O2.c.f5198a;
                    Intrinsics.checkNotNull(abstractActivityC0364d2);
                    Intrinsics.checkNotNullParameter(abstractActivityC0364d2, string28);
                    if (Build.VERSION.SDK_INT >= 33 && D.a.a(abstractActivityC0364d2, string27) != 0) {
                        r3 = false;
                    }
                    result.success(Boolean.valueOf(r3));
                    return;
                }
                boolean areEqual4 = Intrinsics.areEqual(call.method, "requestNotificationPermission");
                String string29 = StubApp.getString2(696);
                if (areEqual4 && (abstractActivityC0364d = this.f4517b) != null) {
                    O2.c cVar2 = O2.c.f5198a;
                    J2.a aVar = new J2.a(result, 1);
                    Intrinsics.checkNotNullParameter(abstractActivityC0364d, string28);
                    Intrinsics.checkNotNullParameter(aVar, string29);
                    if (Build.VERSION.SDK_INT >= 33) {
                        O2.c.f5199b.put(100010001, aVar);
                        AbstractC0025b.d(abstractActivityC0364d, new String[]{string27}, 100010001);
                        return;
                    }
                    return;
                }
                if (Intrinsics.areEqual(call.method, "hasPhoneStatePermission")) {
                    O2.c cVar3 = O2.c.f5198a;
                    Context a10 = a();
                    Intrinsics.checkNotNullParameter(a10, string22);
                    result.success(Boolean.valueOf(D.a.a(a10, string26) == 0));
                    return;
                }
                if (Intrinsics.areEqual(call.method, "requestPhoneStatePermission")) {
                    AbstractActivityC0364d abstractActivityC0364d4 = this.f4517b;
                    if (abstractActivityC0364d4 != null) {
                        O2.c cVar4 = O2.c.f5198a;
                        J2.a aVar2 = new J2.a(result, 2);
                        Intrinsics.checkNotNullParameter(abstractActivityC0364d4, string28);
                        Intrinsics.checkNotNullParameter(aVar2, string29);
                        O2.c.f5199b.put(100010002, aVar2);
                        AbstractC0025b.d(abstractActivityC0364d4, new String[]{string26}, 100010002);
                        return;
                    }
                    return;
                }
                if (Intrinsics.areEqual(call.method, "isNotificationListenerEnabled")) {
                    O2.c cVar5 = O2.c.f5198a;
                    Context a11 = a();
                    Intrinsics.checkNotNullParameter(a11, string22);
                    Set b2 = J.b(a11);
                    Intrinsics.checkNotNullExpressionValue(b2, "getEnabledListenerPackages(...)");
                    result.success(Boolean.valueOf(((HashSet) b2).contains(a11.getPackageName())));
                    return;
                }
                if (Intrinsics.areEqual(call.method, "openNotificationListenerSetting")) {
                    O2.c cVar6 = O2.c.f5198a;
                    Context a12 = a();
                    Intrinsics.checkNotNullParameter(a12, string22);
                    Intent intent = new Intent(StubApp.getString2(3504));
                    intent.addFlags(268435456);
                    a12.startActivity(intent);
                } else {
                    boolean areEqual5 = Intrinsics.areEqual(call.method, "startNotificationListener");
                    String string210 = StubApp.getString2(3505);
                    if (areEqual5) {
                        boolean z2 = EvNLService.f11127h;
                        AbstractActivityC0364d abstractActivityC0364d5 = this.f4517b;
                        if (EvNLService.f11127h) {
                            R2.c.d(string210, StubApp.getString2(3506));
                        } else {
                            EvNLService.f11127h = true;
                            if (abstractActivityC0364d5 != null) {
                                abstractActivityC0364d5.startService(new Intent(abstractActivityC0364d5, (Class<?>) EvNLService.class));
                                R2.c.d(string210, StubApp.getString2(3507));
                            }
                        }
                    } else if (Intrinsics.areEqual(call.method, "stopNotificationListener")) {
                        boolean z10 = EvNLService.f11127h;
                        AbstractActivityC0364d abstractActivityC0364d6 = this.f4517b;
                        EvNLService.f11127h = false;
                        if (abstractActivityC0364d6 != null) {
                            abstractActivityC0364d6.stopService(new Intent(abstractActivityC0364d6, (Class<?>) EvNLService.class));
                            R2.c.d(string210, StubApp.getString2(3508));
                        }
                    } else {
                        if (Intrinsics.areEqual(call.method, "isAllowCompleteBackendBehavior")) {
                            O2.c cVar7 = O2.c.f5198a;
                            Context a13 = a();
                            J2.a aVar3 = new J2.a(result, 3);
                            Intrinsics.checkNotNullParameter(a13, string22);
                            Intrinsics.checkNotNullParameter(aVar3, string29);
                            Object systemService2 = a13.getSystemService(StubApp.getString2(1358));
                            Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.PowerManager");
                            aVar3.invoke(Boolean.valueOf(((PowerManager) systemService2).isIgnoringBatteryOptimizations(a13.getPackageName())));
                            return;
                        }
                        if (!Intrinsics.areEqual(call.method, "requestAllowCompleteBackendBehavior")) {
                            if (!Intrinsics.areEqual(call.method, "queryInstalledApp")) {
                                result.notImplemented();
                                return;
                            }
                            AbstractActivityC0364d abstractActivityC0364d7 = this.f4517b;
                            if (abstractActivityC0364d7 != null) {
                                List list3 = O2.a.f5195a;
                                Intrinsics.checkNotNullParameter(abstractActivityC0364d7, string2);
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                try {
                                    List<ApplicationInfo> installedApplications = abstractActivityC0364d7.getPackageManager().getInstalledApplications(128);
                                    Intrinsics.checkNotNullExpressionValue(installedApplications, "getInstalledApplications(...)");
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj : installedApplications) {
                                        ApplicationInfo applicationInfo = (ApplicationInfo) obj;
                                        if ((applicationInfo.flags & 1) != 0 && !Intrinsics.areEqual(applicationInfo.packageName, "com.google.android.apps.tachyon") && !Intrinsics.areEqual(applicationInfo.packageName, "com.android.chrome")) {
                                        }
                                        arrayList.add(obj);
                                    }
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        ApplicationInfo applicationInfo2 = (ApplicationInfo) it.next();
                                        String obj2 = applicationInfo2.packageName.length() >= 32 ? applicationInfo2.packageName.subSequence(0, 31).toString() : applicationInfo2.packageName;
                                        if (!Intrinsics.areEqual(obj2, abstractActivityC0364d7.getPackageName())) {
                                            linkedHashMap.put(obj2, applicationInfo2.loadLabel(abstractActivityC0364d7.getPackageManager()).toString());
                                        }
                                    }
                                    if (linkedHashMap.isEmpty()) {
                                        map = linkedHashMap;
                                    } else {
                                        List<String> list4 = O2.a.f5195a;
                                        ArrayList arrayList2 = new ArrayList(CollectionsKt.f(list4));
                                        for (String str6 : list4) {
                                            try {
                                                ApplicationInfo applicationInfo3 = abstractActivityC0364d7.getPackageManager().getApplicationInfo(str6, 1);
                                                Intrinsics.checkNotNullExpressionValue(applicationInfo3, "getApplicationInfo(...)");
                                                pair = TuplesKt.to(str6, applicationInfo3.loadLabel(abstractActivityC0364d7.getPackageManager()).toString());
                                            } catch (PackageManager.NameNotFoundException unused) {
                                                pair = TuplesKt.to("", "");
                                            }
                                            arrayList2.add(pair);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it2 = arrayList2.iterator();
                                        while (it2.hasNext()) {
                                            Object next = it2.next();
                                            if (!StringsKt.isBlank((CharSequence) ((Pair) next).getFirst())) {
                                                arrayList3.add(next);
                                            }
                                        }
                                        Iterator it3 = arrayList3.iterator();
                                        while (it3.hasNext()) {
                                            Pair pair8 = (Pair) it3.next();
                                            if (!linkedHashMap.keySet().contains(pair8.getFirst())) {
                                                linkedHashMap.put(pair8.getFirst(), pair8.getSecond());
                                            }
                                        }
                                        map = O2.a.c(linkedHashMap);
                                    }
                                } catch (Exception e12) {
                                    E1.a.u(StubApp.getString2(3509), e12.getLocalizedMessage(), StubApp.getString2(3510));
                                    map = linkedHashMap;
                                }
                                result.success(map);
                                return;
                            }
                            return;
                        }
                        O2.c cVar8 = O2.c.f5198a;
                        Context a14 = a();
                        Intrinsics.checkNotNullParameter(a14, string22);
                        Intent intent2 = new Intent();
                        intent2.setFlags(268435456);
                        intent2.setAction(StubApp.getString2(1802));
                        intent2.setData(Uri.parse(StubApp.getString2(142) + a14.getPackageName()));
                        a14.startActivity(intent2);
                    }
                }
            }
        }
        result.success(null);
    }

    @Override // eb.a
    public final void onReattachedToActivityForConfigChanges(eb.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
    }
}
