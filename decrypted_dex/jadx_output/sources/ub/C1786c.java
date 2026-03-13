package ub;

import Q2.g;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import bb.d;
import com.stub.StubApp;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.Intrinsics;
import no.nordicsemi.android.ble.v;

/* renamed from: ub.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1786c implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public Context f21484a;

    /* renamed from: b, reason: collision with root package name */
    public Toast f21485b;

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) {
        Toast toast;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = call.method;
        if (!Intrinsics.areEqual(str, "showToast")) {
            if (!Intrinsics.areEqual(str, "cancel")) {
                result.notImplemented();
                return;
            }
            Toast toast2 = this.f21485b;
            if (toast2 != null) {
                toast2.cancel();
                this.f21485b = null;
            }
            result.success(Boolean.TRUE);
            return;
        }
        String valueOf = String.valueOf(call.argument(StubApp.getString2(3719)));
        String valueOf2 = String.valueOf(call.argument(StubApp.getString2(11905)));
        String valueOf3 = String.valueOf(call.argument(StubApp.getString2(12473)));
        Number number = (Number) call.argument(StubApp.getString2(23586));
        Number number2 = (Number) call.argument(StubApp.getString2(23587));
        Number number3 = (Number) call.argument(StubApp.getString2(23588));
        String str2 = (String) call.argument(StubApp.getString2(23589));
        int i3 = Intrinsics.areEqual(valueOf3, "top") ? 48 : Intrinsics.areEqual(valueOf3, "center") ? 17 : 80;
        boolean areEqual = Intrinsics.areEqual(valueOf2, "long");
        Context context = this.f21484a;
        String string2 = StubApp.getString2(23590);
        String string22 = StubApp.getString2(23591);
        if (number != null) {
            Object systemService = context.getSystemService(StubApp.getString2(18373));
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            View inflate = ((LayoutInflater) systemService).inflate(2131427472, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(2131231116);
            textView.setText(valueOf);
            Drawable drawable = context.getDrawable(2131165302);
            Intrinsics.checkNotNull(drawable);
            Intrinsics.checkNotNull(drawable);
            drawable.setColorFilter(number.intValue(), PorterDuff.Mode.SRC_IN);
            textView.setBackground(drawable);
            if (number3 != null) {
                textView.setTextSize(number3.floatValue());
            }
            if (number2 != null) {
                textView.setTextColor(number2.intValue());
            }
            Toast toast3 = new Toast(context);
            this.f21485b = toast3;
            toast3.setDuration(areEqual ? 1 : 0);
            if (str2 != null) {
                AssetManager assets = context.getAssets();
                Intrinsics.checkNotNullExpressionValue(assets, string22);
                String b2 = ((d) g.H().f5711b).b(str2);
                Intrinsics.checkNotNullExpressionValue(b2, string2);
                textView.setTypeface(Typeface.createFromAsset(assets, b2));
            }
            Toast toast4 = this.f21485b;
            if (toast4 != null) {
                toast4.setView(inflate);
            }
        } else {
            StringBuilder sb2 = new StringBuilder(StubApp.getString2(23592));
            sb2.append(number);
            String string23 = StubApp.getString2(397);
            sb2.append(string23);
            sb2.append(number2);
            sb2.append(string23);
            sb2.append(number3);
            sb2.append(string23);
            sb2.append(str2);
            Log.d(StubApp.getString2(23593), sb2.toString());
            Toast makeText = Toast.makeText(context, valueOf, areEqual ? 1 : 0);
            this.f21485b = makeText;
            if (Build.VERSION.SDK_INT < 30) {
                View view = makeText != null ? makeText.getView() : null;
                Intrinsics.checkNotNull(view);
                View findViewById = view.findViewById(R.id.message);
                Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                TextView textView2 = (TextView) findViewById;
                if (number3 != null) {
                    textView2.setTextSize(number3.floatValue());
                }
                if (number2 != null) {
                    textView2.setTextColor(number2.intValue());
                }
                if (str2 != null) {
                    AssetManager assets2 = context.getAssets();
                    Intrinsics.checkNotNullExpressionValue(assets2, string22);
                    String b10 = ((d) g.H().f5711b).b(str2);
                    Intrinsics.checkNotNullExpressionValue(b10, string2);
                    textView2.setTypeface(Typeface.createFromAsset(assets2, b10));
                }
            }
        }
        try {
            if (i3 == 17) {
                Toast toast5 = this.f21485b;
                if (toast5 != null) {
                    toast5.setGravity(i3, 0, 0);
                }
            } else if (i3 != 48) {
                Toast toast6 = this.f21485b;
                if (toast6 != null) {
                    toast6.setGravity(i3, 0, 100);
                }
            } else {
                Toast toast7 = this.f21485b;
                if (toast7 != null) {
                    toast7.setGravity(i3, 0, 100);
                }
            }
        } catch (Exception unused) {
        }
        if (context instanceof Activity) {
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).runOnUiThread(new v(this, 4));
        } else {
            Toast toast8 = this.f21485b;
            if (toast8 != null) {
                toast8.show();
            }
        }
        if (Build.VERSION.SDK_INT >= 30 && (toast = this.f21485b) != null) {
            toast.addCallback(new C1785b(this));
        }
        result.success(Boolean.TRUE);
    }
}
