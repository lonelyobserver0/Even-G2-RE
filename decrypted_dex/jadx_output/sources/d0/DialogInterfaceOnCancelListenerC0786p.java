package d0;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.stub.StubApp;
import i.AbstractActivityC1027h;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d0.p, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class DialogInterfaceOnCancelListenerC0786p extends AbstractComponentCallbacksC0789t implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: A0, reason: collision with root package name */
    public boolean f13319A0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f13320B0;

    /* renamed from: o0, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0783m f13321o0;

    /* renamed from: p0, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0784n f13322p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f13323q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f13324r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f13325s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f13326t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f13327u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f13328v0;

    /* renamed from: w0, reason: collision with root package name */
    public final A0.c f13329w0;

    /* renamed from: x0, reason: collision with root package name */
    public Dialog f13330x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f13331y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f13332z0;

    public DialogInterfaceOnCancelListenerC0786p() {
        new L9.n(this, 27);
        this.f13321o0 = new DialogInterfaceOnCancelListenerC0783m(this);
        this.f13322p0 = new DialogInterfaceOnDismissListenerC0784n(this);
        this.f13323q0 = 0;
        this.f13324r0 = 0;
        this.f13325s0 = true;
        this.f13326t0 = true;
        this.f13327u0 = -1;
        this.f13329w0 = new A0.c(this);
        this.f13320B0 = false;
    }

    @Override // d0.AbstractComponentCallbacksC0789t
    public final void A() {
        this.f13352G = true;
        if (!this.f13319A0 && !this.f13332z0) {
            this.f13332z0 = true;
        }
        this.h0.e(this.f13329w0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:10:0x001f, B:12:0x002b, B:18:0x0043, B:20:0x0049, B:21:0x0053, B:23:0x0035, B:25:0x003b, B:26:0x0040, B:27:0x006b), top: B:9:0x001f }] */
    @Override // d0.AbstractComponentCallbacksC0789t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.LayoutInflater B(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.B(r8)
            boolean r0 = r7.f13326t0
            r1 = 49
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r2 = 2
            if (r0 == 0) goto La7
            boolean r3 = r7.f13328v0
            if (r3 == 0) goto L16
            goto La7
        L16:
            if (r0 != 0) goto L19
            goto L74
        L19:
            boolean r0 = r7.f13320B0
            if (r0 != 0) goto L74
            r0 = 0
            r3 = 1
            r7.f13328v0 = r3     // Catch: java.lang.Throwable -> L51
            android.app.Dialog r4 = r7.M()     // Catch: java.lang.Throwable -> L51
            r7.f13330x0 = r4     // Catch: java.lang.Throwable -> L51
            boolean r5 = r7.f13326t0     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L6b
            int r5 = r7.f13323q0     // Catch: java.lang.Throwable -> L51
            if (r5 == r3) goto L40
            if (r5 == r2) goto L40
            r6 = 3
            if (r5 == r6) goto L35
            goto L43
        L35:
            android.view.Window r5 = r4.getWindow()     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L40
            r6 = 24
            r5.addFlags(r6)     // Catch: java.lang.Throwable -> L51
        L40:
            r4.requestWindowFeature(r3)     // Catch: java.lang.Throwable -> L51
        L43:
            android.content.Context r4 = r7.m()     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L53
            android.app.Dialog r5 = r7.f13330x0     // Catch: java.lang.Throwable -> L51
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L51
            r5.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L51
            goto L53
        L51:
            r8 = move-exception
            goto L71
        L53:
            android.app.Dialog r4 = r7.f13330x0     // Catch: java.lang.Throwable -> L51
            boolean r5 = r7.f13325s0     // Catch: java.lang.Throwable -> L51
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L51
            android.app.Dialog r4 = r7.f13330x0     // Catch: java.lang.Throwable -> L51
            d0.m r5 = r7.f13321o0     // Catch: java.lang.Throwable -> L51
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L51
            android.app.Dialog r4 = r7.f13330x0     // Catch: java.lang.Throwable -> L51
            d0.n r5 = r7.f13322p0     // Catch: java.lang.Throwable -> L51
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L51
            r7.f13320B0 = r3     // Catch: java.lang.Throwable -> L51
            goto L6e
        L6b:
            r3 = 0
            r7.f13330x0 = r3     // Catch: java.lang.Throwable -> L51
        L6e:
            r7.f13328v0 = r0
            goto L74
        L71:
            r7.f13328v0 = r0
            throw r8
        L74:
            boolean r0 = d0.M.J(r2)
            if (r0 == 0) goto L9a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r2 = 16733(0x415d, float:2.3448E-41)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            r0.<init>(r2)
            r0.append(r7)
            r2 = 16734(0x415e, float:2.345E-41)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L9a:
            android.app.Dialog r0 = r7.f13330x0
            if (r0 == 0) goto Lf1
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r8 = r8.cloneInContext(r0)
            return r8
        La7:
            boolean r0 = d0.M.J(r2)
            if (r0 == 0) goto Lf1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r2 = 16735(0x415f, float:2.3451E-41)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r2 = r7.f13326t0
            if (r2 != 0) goto Ldb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 16736(0x4160, float:2.3452E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
            return r8
        Ldb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 16737(0x4161, float:2.3454E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
        Lf1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.DialogInterfaceOnCancelListenerC0786p.B(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // d0.AbstractComponentCallbacksC0789t
    public void D(Bundle bundle) {
        Dialog dialog = this.f13330x0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean(StubApp.getString2(16738), false);
            bundle.putBundle(StubApp.getString2(16739), onSaveInstanceState);
        }
        int i3 = this.f13323q0;
        if (i3 != 0) {
            bundle.putInt(StubApp.getString2(16740), i3);
        }
        int i10 = this.f13324r0;
        if (i10 != 0) {
            bundle.putInt(StubApp.getString2(16741), i10);
        }
        boolean z2 = this.f13325s0;
        if (!z2) {
            bundle.putBoolean(StubApp.getString2(16742), z2);
        }
        boolean z10 = this.f13326t0;
        if (!z10) {
            bundle.putBoolean(StubApp.getString2(16743), z10);
        }
        int i11 = this.f13327u0;
        if (i11 != -1) {
            bundle.putInt(StubApp.getString2(16744), i11);
        }
    }

    @Override // d0.AbstractComponentCallbacksC0789t
    public void E() {
        this.f13352G = true;
        Dialog dialog = this.f13330x0;
        if (dialog != null) {
            this.f13331y0 = false;
            dialog.show();
            View decorView = this.f13330x0.getWindow().getDecorView();
            androidx.lifecycle.L.e(decorView, this);
            Intrinsics.checkNotNullParameter(decorView, "<this>");
            decorView.setTag(2131231166, this);
            Intrinsics.checkNotNullParameter(decorView, "<this>");
            decorView.setTag(2131231165, this);
        }
    }

    @Override // d0.AbstractComponentCallbacksC0789t
    public void F() {
        this.f13352G = true;
        Dialog dialog = this.f13330x0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // d0.AbstractComponentCallbacksC0789t
    public final void G(Bundle bundle) {
        Bundle bundle2;
        this.f13352G = true;
        if (this.f13330x0 == null || bundle == null || (bundle2 = bundle.getBundle(StubApp.getString2(16739))) == null) {
            return;
        }
        this.f13330x0.onRestoreInstanceState(bundle2);
    }

    @Override // d0.AbstractComponentCallbacksC0789t
    public final void H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.H(layoutInflater, viewGroup, bundle);
        if (this.f13354I != null || this.f13330x0 == null || bundle == null || (bundle2 = bundle.getBundle(StubApp.getString2(16739))) == null) {
            return;
        }
        this.f13330x0.onRestoreInstanceState(bundle2);
    }

    public Dialog M() {
        if (M.J(3)) {
            Log.d(StubApp.getString2(49), StubApp.getString2(16745) + this);
        }
        return new d.m(I(), this.f13324r0);
    }

    @Override // d0.AbstractComponentCallbacksC0789t
    public final AbstractC0793x h() {
        return new C0785o(this, new r(this));
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f13331y0) {
            return;
        }
        if (M.J(3)) {
            Log.d(StubApp.getString2(49), StubApp.getString2(16746) + this);
        }
        if (this.f13332z0) {
            return;
        }
        this.f13332z0 = true;
        this.f13319A0 = false;
        Dialog dialog = this.f13330x0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f13330x0.dismiss();
        }
        this.f13331y0 = true;
        if (this.f13327u0 >= 0) {
            M o5 = o();
            int i3 = this.f13327u0;
            if (i3 < 0) {
                throw new IllegalArgumentException(i2.u.p(i3, StubApp.getString2(16747)));
            }
            o5.x(new K(o5, i3), true);
            this.f13327u0 = -1;
            return;
        }
        C0771a c0771a = new C0771a(o());
        c0771a.f13253o = true;
        M m4 = this.f13384v;
        if (m4 == null || m4 == c0771a.f13254p) {
            c0771a.b(new V(3, this));
            c0771a.d(true);
        } else {
            throw new IllegalStateException(StubApp.getString2(16748) + toString() + StubApp.getString2(16749));
        }
    }

    @Override // d0.AbstractComponentCallbacksC0789t
    public final void t() {
        this.f13352G = true;
    }

    @Override // d0.AbstractComponentCallbacksC0789t
    public final void v(AbstractActivityC1027h abstractActivityC1027h) {
        super.v(abstractActivityC1027h);
        this.h0.c(this.f13329w0);
        if (this.f13319A0) {
            return;
        }
        this.f13332z0 = false;
    }

    @Override // d0.AbstractComponentCallbacksC0789t
    public void w(Bundle bundle) {
        super.w(bundle);
        new Handler();
        this.f13326t0 = this.f13346A == 0;
        if (bundle != null) {
            this.f13323q0 = bundle.getInt(StubApp.getString2(16740), 0);
            this.f13324r0 = bundle.getInt(StubApp.getString2(16741), 0);
            this.f13325s0 = bundle.getBoolean(StubApp.getString2(16742), true);
            this.f13326t0 = bundle.getBoolean(StubApp.getString2(16743), this.f13326t0);
            this.f13327u0 = bundle.getInt(StubApp.getString2(16744), -1);
        }
    }

    @Override // d0.AbstractComponentCallbacksC0789t
    public final void z() {
        this.f13352G = true;
        Dialog dialog = this.f13330x0;
        if (dialog != null) {
            this.f13331y0 = true;
            dialog.setOnDismissListener(null);
            this.f13330x0.dismiss();
            if (!this.f13332z0) {
                onDismiss(this.f13330x0);
            }
            this.f13330x0 = null;
            this.f13320B0 = false;
        }
    }
}
