package w2;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import ec.AbstractC0860c;
import ec.C0859b;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lw2/a;", "Ldb/b;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "flutter_new_badger_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1859a implements InterfaceC0825b, MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel f22103a;

    /* renamed from: b, reason: collision with root package name */
    public Context f22104b;

    public final void a(int i3) {
        Context context = this.f22104b;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(StubApp.getString2(23835), 0).edit();
        edit.putInt(StubApp.getString2(23836), i3);
        edit.apply();
    }

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.f13554b, StubApp.getString2(23837));
        this.f22103a = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.f22104b = flutterPluginBinding.f13553a;
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.f22103a;
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
        if (str != null) {
            int hashCode = str.hashCode();
            String string2 = StubApp.getString2(23838);
            String string22 = StubApp.getString2(23839);
            String string23 = StubApp.getString2(23840);
            String string24 = StubApp.getString2(354);
            if (hashCode != -320903809) {
                if (hashCode != 1388207201) {
                    if (hashCode == 1949319661 && str.equals(StubApp.getString2(23841))) {
                        try {
                            Context context = this.f22104b;
                            if (context == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string24);
                                context = null;
                            }
                            result.success(Integer.valueOf(context.getSharedPreferences(StubApp.getString2("23835"), 0).getInt(StubApp.getString2("23836"), 0)));
                            return;
                        } catch (Exception e10) {
                            result.error(string23, StubApp.getString2(23842) + e10.getLocalizedMessage(), null);
                            return;
                        }
                    }
                } else if (str.equals(StubApp.getString2(23843))) {
                    Integer num = (Integer) call.argument(StubApp.getString2(20291));
                    if (num == null || num.intValue() < 0) {
                        result.error(StubApp.getString2(23845), StubApp.getString2(23846), null);
                        return;
                    }
                    int intValue = num.intValue();
                    try {
                        Context context2 = this.f22104b;
                        if (context2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string24);
                            context2 = null;
                        }
                        try {
                            AbstractC0860c.a(context2, intValue);
                        } catch (C0859b e11) {
                            if (Log.isLoggable(string22, 3)) {
                                Log.d(string22, string2, e11);
                            }
                        }
                        a(intValue);
                        result.success(null);
                        return;
                    } catch (Exception e12) {
                        result.error(string23, StubApp.getString2(23844) + e12.getLocalizedMessage(), null);
                        return;
                    }
                }
            } else if (str.equals(StubApp.getString2(23847))) {
                try {
                    Context context3 = this.f22104b;
                    if (context3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string24);
                        context3 = null;
                    }
                    try {
                        AbstractC0860c.a(context3, 0);
                    } catch (C0859b e13) {
                        if (Log.isLoggable(string22, 3)) {
                            Log.d(string22, string2, e13);
                        }
                    }
                    a(0);
                    result.success(null);
                    return;
                } catch (Exception e14) {
                    result.error(string23, StubApp.getString2(23848) + e14.getLocalizedMessage(), null);
                    return;
                }
            }
        }
        result.notImplemented();
    }
}
