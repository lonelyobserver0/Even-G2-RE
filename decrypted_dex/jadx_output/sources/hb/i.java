package hb;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;
import q4.j;
import q4.k;
import q4.s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhb/i;", "Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;", "Ldb/b;", "Lhb/d;", "<init>", "()V", "firebase_analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class i implements FlutterFirebasePlugin, InterfaceC0825b, d {

    /* renamed from: a, reason: collision with root package name */
    public FirebaseAnalytics f14495a;

    /* renamed from: b, reason: collision with root package name */
    public MethodChannel f14496b;

    /* renamed from: c, reason: collision with root package name */
    public BinaryMessenger f14497c;

    public static Bundle a(Map map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                bundle.putString(str, (String) value);
            } else if (value instanceof Integer) {
                bundle.putLong(str, ((Number) value).intValue());
            } else if (value instanceof Long) {
                bundle.putLong(str, ((Number) value).longValue());
            } else if (value instanceof Double) {
                bundle.putDouble(str, ((Number) value).doubleValue());
            } else if (value instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) value).booleanValue());
            } else if (value == null) {
                bundle.putString(str, null);
            } else {
                boolean z2 = value instanceof Iterable;
                String string2 = StubApp.getString2(18336);
                if (z2) {
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                    for (Object obj : (Iterable) value) {
                        if (obj instanceof Map) {
                            arrayList.add(a((Map) obj));
                        } else if (obj != null) {
                            throw new IllegalArgumentException(AbstractC1482f.i(string2, obj.getClass().getCanonicalName(), StubApp.getString2(18337), str));
                        }
                    }
                    bundle.putParcelableArrayList(str, arrayList);
                } else {
                    if (!(value instanceof Map)) {
                        throw new IllegalArgumentException(E1.a.j(string2, value.getClass().getCanonicalName()));
                    }
                    bundle.putParcelable(str, a((Map) value));
                }
            }
        }
        return bundle;
    }

    public static void b(j jVar, Function1 function1) {
        String string2;
        if (jVar.isSuccessful()) {
            Result.Companion companion = Result.INSTANCE;
            function1.invoke(Result.m39boximpl(Result.m40constructorimpl(jVar.getResult())));
            return;
        }
        Exception exception = jVar.getException();
        if (exception == null || (string2 = exception.getMessage()) == null) {
            string2 = StubApp.getString2(126);
        }
        Result.Companion companion2 = Result.INSTANCE;
        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new e(StubApp.getString2(18338), string2)))));
    }

    public static void c(j jVar, Function1 function1) {
        String string2;
        if (jVar.isSuccessful()) {
            Result.Companion companion = Result.INSTANCE;
            function1.invoke(Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE)));
            return;
        }
        Exception exception = jVar.getException();
        if (exception == null || (string2 = exception.getMessage()) == null) {
            string2 = StubApp.getString2(126);
        }
        Result.Companion companion2 = Result.INSTANCE;
        function1.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new e(StubApp.getString2(18338), string2)))));
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final j didReinitializeFirebaseCore() {
        k kVar = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new f(1, kVar));
        s sVar = kVar.f20051a;
        Intrinsics.checkNotNullExpressionValue(sVar, "getTask(...)");
        return sVar;
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final j getPluginConstantsForFirebaseApp(R4.h hVar) {
        k kVar = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new f(0, kVar));
        s sVar = kVar.f20051a;
        Intrinsics.checkNotNullExpressionValue(sVar, "getTask(...)");
        return sVar;
    }

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        BinaryMessenger binaryMessenger = binding.f13554b;
        Intrinsics.checkNotNullExpressionValue(binaryMessenger, "getBinaryMessenger(...)");
        Context context = binding.f13553a;
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        this.f14495a = FirebaseAnalytics.getInstance(context);
        String string2 = StubApp.getString2(18339);
        this.f14496b = new MethodChannel(binaryMessenger, string2);
        C1016c.b(d.f14483f0, binaryMessenger, this);
        FlutterFirebasePluginRegistry.registerPlugin(string2, this);
        this.f14497c = binaryMessenger;
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.f14496b;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        BinaryMessenger binaryMessenger = this.f14497c;
        if (binaryMessenger == null) {
            throw new IllegalStateException(StubApp.getString2(2906));
        }
        Intrinsics.checkNotNull(binaryMessenger);
        C1016c.b(d.f14483f0, binaryMessenger, null);
        this.f14496b = null;
        this.f14497c = null;
    }
}
