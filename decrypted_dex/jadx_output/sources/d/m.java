package d;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0446v;
import androidx.lifecycle.EnumC0438m;
import androidx.lifecycle.InterfaceC0444t;
import androidx.lifecycle.L;
import kotlin.jvm.internal.Intrinsics;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class m extends Dialog implements InterfaceC0444t, InterfaceC0756A, M1.e {

    /* renamed from: a, reason: collision with root package name */
    public C0446v f13093a;

    /* renamed from: b, reason: collision with root package name */
    public final Z9.C f13094b;

    /* renamed from: c, reason: collision with root package name */
    public final z f13095c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, int i3) {
        super(context, i3);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(this, "owner");
        this.f13094b = new Z9.C(new C2.c(this, new J2.d(this, 1)));
        this.f13095c = new z(new B0.o(this, 20));
    }

    public static void b(m mVar) {
        super.onBackPressed();
    }

    @Override // d.InterfaceC0756A
    public final z a() {
        return this.f13095c;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public final void c() {
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window!!.decorView");
        L.e(decorView, this);
        Window window2 = getWindow();
        Intrinsics.checkNotNull(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window!!.decorView");
        Intrinsics.checkNotNullParameter(decorView2, "<this>");
        Intrinsics.checkNotNullParameter(this, "onBackPressedDispatcherOwner");
        decorView2.setTag(2131231164, this);
        Window window3 = getWindow();
        Intrinsics.checkNotNull(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window!!.decorView");
        Intrinsics.checkNotNullParameter(decorView3, "<this>");
        decorView3.setTag(2131231165, this);
    }

    @Override // M1.e
    public final E0 f() {
        return (E0) this.f13094b.f9078c;
    }

    @Override // androidx.lifecycle.InterfaceC0444t
    public final C0446v i() {
        C0446v c0446v = this.f13093a;
        if (c0446v != null) {
            return c0446v;
        }
        C0446v c0446v2 = new C0446v(this);
        this.f13093a = c0446v2;
        return c0446v2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f13095c.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher invoker;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            invoker = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(invoker, "onBackInvokedDispatcher");
            z zVar = this.f13095c;
            zVar.getClass();
            Intrinsics.checkNotNullParameter(invoker, "invoker");
            zVar.f13120e = invoker;
            zVar.c(zVar.f13122g);
        }
        this.f13094b.v(bundle);
        C0446v c0446v = this.f13093a;
        if (c0446v == null) {
            c0446v = new C0446v(this);
            this.f13093a = c0446v;
        }
        c0446v.e(EnumC0438m.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f13094b.x(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C0446v c0446v = this.f13093a;
        if (c0446v == null) {
            c0446v = new C0446v(this);
            this.f13093a = c0446v;
        }
        c0446v.e(EnumC0438m.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        C0446v c0446v = this.f13093a;
        if (c0446v == null) {
            c0446v = new C0446v(this);
            this.f13093a = c0446v;
        }
        c0446v.e(EnumC0438m.ON_DESTROY);
        this.f13093a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i3) {
        c();
        super.setContentView(i3);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
