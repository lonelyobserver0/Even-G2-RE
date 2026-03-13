package jb;

import A2.g;
import Ab.c;
import R4.h;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import hb.f;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.Map;
import java.util.Objects;
import q4.j;
import q4.k;
import q4.s;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class b implements FlutterFirebasePlugin, InterfaceC0825b, MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel f15418a;

    public static boolean a(b bVar, h hVar) {
        Boolean bool;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        hVar.a();
        String string2 = StubApp.getString2(1000);
        Context context = hVar.f6193a;
        SharedPreferences sharedPreferences = context.getSharedPreferences(string2, 0);
        String string22 = StubApp.getString2(7535);
        if (sharedPreferences.contains(string22)) {
            return sharedPreferences.getBoolean(string22, true);
        }
        hVar.a();
        try {
            packageManager = context.getPackageManager();
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e(StubApp.getString2(280), StubApp.getString2(9588), e10);
        }
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(string22)) {
            bool = Boolean.valueOf(applicationInfo.metaData.getBoolean(string22));
            Y4.b.a().b(bool);
            return bool.booleanValue();
        }
        bool = Boolean.TRUE;
        Y4.b.a().b(bool);
        return bool.booleanValue();
    }

    public static StackTraceElement b(Map map) {
        try {
            String str = (String) map.get(StubApp.getString2("3105"));
            String str2 = (String) map.get(StubApp.getString2("5281"));
            String str3 = (String) map.get(StubApp.getString2("11020"));
            String str4 = (String) map.get(StubApp.getString2("6738"));
            if (str3 == null) {
                str3 = "";
            }
            Objects.requireNonNull(str2);
            return new StackTraceElement(str3, str4, str, Integer.parseInt(str2));
        } catch (Exception unused) {
            Log.e(StubApp.getString2(19083), StubApp.getString2(19084));
            return null;
        }
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final j didReinitializeFirebaseCore() {
        k kVar = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new f(3, kVar));
        return kVar.f20051a;
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final j getPluginConstantsForFirebaseApp(h hVar) {
        k kVar = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new c(this, kVar, hVar, 13));
        return kVar.f20051a;
    }

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a c0824a) {
        BinaryMessenger binaryMessenger = c0824a.f13554b;
        String string2 = StubApp.getString2(19085);
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, string2);
        this.f15418a = methodChannel;
        methodChannel.setMethodCallHandler(this);
        FlutterFirebasePluginRegistry.registerPlugin(string2, this);
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a c0824a) {
        MethodChannel methodChannel = this.f15418a;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
            this.f15418a = null;
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        s sVar;
        String str = methodCall.method;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2094964816:
                if (str.equals(StubApp.getString2(19095))) {
                    c10 = 0;
                    break;
                }
                break;
            case -1437158995:
                if (str.equals(StubApp.getString2(19094))) {
                    c10 = 1;
                    break;
                }
                break;
            case -1025128541:
                if (str.equals(StubApp.getString2(19093))) {
                    c10 = 2;
                    break;
                }
                break;
            case -424770276:
                if (str.equals(StubApp.getString2(19092))) {
                    c10 = 3;
                    break;
                }
                break;
            case -108157790:
                if (str.equals(StubApp.getString2(19091))) {
                    c10 = 4;
                    break;
                }
                break;
            case 28093114:
                if (str.equals(StubApp.getString2(19090))) {
                    c10 = 5;
                    break;
                }
                break;
            case 108415030:
                if (str.equals(StubApp.getString2(19089))) {
                    c10 = 6;
                    break;
                }
                break;
            case 213629529:
                if (str.equals(StubApp.getString2(19088))) {
                    c10 = 7;
                    break;
                }
                break;
            case 679831756:
                if (str.equals(StubApp.getString2(19087))) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1219454365:
                if (str.equals(StubApp.getString2(19086))) {
                    c10 = '\t';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                k kVar = new k();
                FlutterFirebasePlugin.cachedThreadPool.execute(new f(this, kVar, 7));
                sVar = kVar.f20051a;
                break;
            case 1:
                Map map = (Map) methodCall.arguments();
                k kVar2 = new k();
                FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC1100a(this, map, kVar2, 2));
                sVar = kVar2.f20051a;
                break;
            case 2:
                k kVar3 = new k();
                FlutterFirebasePlugin.cachedThreadPool.execute(new f(this, kVar3, 4));
                sVar = kVar3.f20051a;
                break;
            case 3:
                k kVar4 = new k();
                FlutterFirebasePlugin.cachedThreadPool.execute(new f(6, kVar4));
                sVar = kVar4.f20051a;
                break;
            case 4:
                Map map2 = (Map) methodCall.arguments();
                k kVar5 = new k();
                FlutterFirebasePlugin.cachedThreadPool.execute(new c(this, map2, kVar5, 14));
                sVar = kVar5.f20051a;
                break;
            case 5:
                Map map3 = (Map) methodCall.arguments();
                k kVar6 = new k();
                FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC1100a(map3, kVar6, 1));
                sVar = kVar6.f20051a;
                break;
            case 6:
                Map map4 = (Map) methodCall.arguments();
                k kVar7 = new k();
                FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC1100a(map4, kVar7, 0));
                sVar = kVar7.f20051a;
                break;
            case 7:
                k kVar8 = new k();
                FlutterFirebasePlugin.cachedThreadPool.execute(new f(5, kVar8));
                sVar = kVar8.f20051a;
                break;
            case '\b':
                Map map5 = (Map) methodCall.arguments();
                k kVar9 = new k();
                FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC1100a(map5, kVar9, 3));
                sVar = kVar9.f20051a;
                break;
            case '\t':
                new Handler(Looper.myLooper()).postDelayed(new H3.a(2), 50L);
                return;
            default:
                result.notImplemented();
                return;
        }
        sVar.addOnCompleteListener(new g(result, 6));
    }
}
