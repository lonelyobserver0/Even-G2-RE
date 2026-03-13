package c3;

import J2.d;
import Xa.AbstractActivityC0364d;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc3/b;", "Ldb/b;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Leb/a;", "<init>", "()V", "teleprompt_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: c3.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0565b implements InterfaceC0825b, MethodChannel.MethodCallHandler, eb.a {

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel f10814a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10815b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractActivityC0364d f10816c;

    /* renamed from: d, reason: collision with root package name */
    public View f10817d;

    /* renamed from: e, reason: collision with root package name */
    public final Lazy f10818e = LazyKt.lazy(new d(this, 5));

    @Override // eb.a
    public final void onAttachedToActivity(eb.b binding) {
        Window window;
        View decorView;
        Intrinsics.checkNotNullParameter(binding, "binding");
        AbstractActivityC0364d abstractActivityC0364d = ((Ya.d) binding).f8882a;
        this.f10816c = abstractActivityC0364d;
        View rootView = (abstractActivityC0364d == null || (window = abstractActivityC0364d.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.getRootView();
        this.f10817d = rootView;
        if (rootView != null) {
            rootView.setOnKeyListener(new ViewOnKeyListenerC0564a(this));
        }
    }

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.f13554b, StubApp.getString2(9411));
        this.f10814a = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // eb.a
    public final void onDetachedFromActivity() {
        View view = this.f10817d;
        if (view != null) {
            view.setOnKeyListener(null);
        }
        this.f10817d = null;
        this.f10816c = null;
    }

    @Override // eb.a
    public final void onDetachedFromActivityForConfigChanges() {
        View view = this.f10817d;
        if (view != null) {
            view.setOnKeyListener(null);
        }
        this.f10817d = null;
        this.f10816c = null;
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.f10814a;
        if (methodChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = call.method;
        if (Intrinsics.areEqual(str, "getPlatformVersion")) {
            result.success(StubApp.getString2(2817) + Build.VERSION.RELEASE);
            return;
        }
        if (!Intrinsics.areEqual(str, "setHideSystemVolume")) {
            result.notImplemented();
            return;
        }
        Boolean bool = (Boolean) call.argument(StubApp.getString2(9412));
        this.f10815b = bool != null ? bool.booleanValue() : false;
        result.success(null);
    }

    @Override // eb.a
    public final void onReattachedToActivityForConfigChanges(eb.b binding) {
        Window window;
        View decorView;
        Intrinsics.checkNotNullParameter(binding, "binding");
        AbstractActivityC0364d abstractActivityC0364d = ((Ya.d) binding).f8882a;
        this.f10816c = abstractActivityC0364d;
        View rootView = (abstractActivityC0364d == null || (window = abstractActivityC0364d.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.getRootView();
        this.f10817d = rootView;
        if (rootView != null) {
            rootView.setOnKeyListener(new ViewOnKeyListenerC0564a(this));
        }
    }
}
