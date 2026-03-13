package com.yalantis.ucrop;

import J1.A;
import Ja.c;
import Ja.d;
import T1.a;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.stub.StubApp;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.UCropView;
import i.AbstractActivityC1027h;
import i.C1026g;
import i.l;
import java.util.ArrayList;
import l4.E0;
import n.b1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class UCropActivity extends AbstractActivityC1027h {

    /* renamed from: w0, reason: collision with root package name */
    public static final Bitmap.CompressFormat f12959w0;

    /* renamed from: C, reason: collision with root package name */
    public String f12960C;

    /* renamed from: D, reason: collision with root package name */
    public int f12961D;

    /* renamed from: E, reason: collision with root package name */
    public int f12962E;

    /* renamed from: F, reason: collision with root package name */
    public int f12963F;

    /* renamed from: G, reason: collision with root package name */
    public int f12964G;

    /* renamed from: H, reason: collision with root package name */
    public int f12965H;

    /* renamed from: I, reason: collision with root package name */
    public int f12966I;

    /* renamed from: K, reason: collision with root package name */
    public int f12967K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f12968L;

    /* renamed from: O, reason: collision with root package name */
    public boolean f12969O;

    /* renamed from: P, reason: collision with root package name */
    public UCropView f12970P;

    /* renamed from: R, reason: collision with root package name */
    public GestureCropImageView f12971R;

    /* renamed from: T, reason: collision with root package name */
    public OverlayView f12972T;

    /* renamed from: X, reason: collision with root package name */
    public ViewGroup f12973X;

    /* renamed from: Y, reason: collision with root package name */
    public ViewGroup f12974Y;

    /* renamed from: Z, reason: collision with root package name */
    public ViewGroup f12975Z;
    public ViewGroup h0;

    /* renamed from: k0, reason: collision with root package name */
    public ViewGroup f12976k0;

    /* renamed from: l0, reason: collision with root package name */
    public ViewGroup f12977l0;

    /* renamed from: m0, reason: collision with root package name */
    public final ArrayList f12978m0;

    /* renamed from: n0, reason: collision with root package name */
    public TextView f12979n0;

    /* renamed from: o0, reason: collision with root package name */
    public TextView f12980o0;

    /* renamed from: p0, reason: collision with root package name */
    public View f12981p0;

    /* renamed from: q0, reason: collision with root package name */
    public a f12982q0;

    /* renamed from: r0, reason: collision with root package name */
    public Bitmap.CompressFormat f12983r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f12984s0;

    /* renamed from: t0, reason: collision with root package name */
    public int[] f12985t0;

    /* renamed from: u0, reason: collision with root package name */
    public final c f12986u0;

    /* renamed from: v0, reason: collision with root package name */
    public final d f12987v0;

    static {
        StubApp.interface11(7500);
        f12959w0 = Bitmap.CompressFormat.JPEG;
        A a3 = l.f14609a;
        int i3 = b1.f17506a;
    }

    public UCropActivity() {
        ((E0) this.f13079d.f9078c).K(StubApp.getString2(16371), new M1.a(this));
        h(new C1026g(this));
        this.f12969O = true;
        this.f12978m0 = new ArrayList();
        this.f12983r0 = f12959w0;
        this.f12984s0 = 90;
        this.f12985t0 = new int[]{1, 2, 3};
        this.f12986u0 = new c(this, 0);
        this.f12987v0 = new d(this, 3);
    }

    @Override // i.AbstractActivityC1027h, d.l, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // android.app.Activity
    public final native boolean onCreateOptionsMenu(Menu menu);

    @Override // android.app.Activity
    public final native boolean onOptionsItemSelected(MenuItem menuItem);

    @Override // android.app.Activity
    public final native boolean onPrepareOptionsMenu(Menu menu);

    @Override // i.AbstractActivityC1027h, android.app.Activity
    public final native void onStop();

    public final native void u(int i3);

    public final native void v(Throwable th);

    public final native void w(int i3);
}
