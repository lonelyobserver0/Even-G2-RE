package com.google.android.material.datepicker;

import N.I;
import Z9.C0366a;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.C0471y;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h0;
import com.google.android.material.button.MaterialButton;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i<S> extends r {

    /* renamed from: p0, reason: collision with root package name */
    public int f11913p0;

    /* renamed from: q0, reason: collision with root package name */
    public b f11914q0;

    /* renamed from: r0, reason: collision with root package name */
    public m f11915r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f11916s0;

    /* renamed from: t0, reason: collision with root package name */
    public a5.c f11917t0;

    /* renamed from: u0, reason: collision with root package name */
    public RecyclerView f11918u0;

    /* renamed from: v0, reason: collision with root package name */
    public RecyclerView f11919v0;

    /* renamed from: w0, reason: collision with root package name */
    public View f11920w0;

    /* renamed from: x0, reason: collision with root package name */
    public View f11921x0;

    @Override // d0.AbstractComponentCallbacksC0789t
    public final void D(Bundle bundle) {
        bundle.putInt(StubApp.getString2(12500), this.f11913p0);
        bundle.putParcelable(StubApp.getString2(12501), null);
        bundle.putParcelable(StubApp.getString2(12502), this.f11914q0);
        bundle.putParcelable(StubApp.getString2(12503), this.f11915r0);
    }

    public final void M(m mVar) {
        q qVar = (q) this.f11919v0.getAdapter();
        int f10 = qVar.f11950c.f11894a.f(mVar);
        int f11 = f10 - qVar.f11950c.f11894a.f(this.f11915r0);
        boolean z2 = Math.abs(f11) > 3;
        boolean z10 = f11 > 0;
        this.f11915r0 = mVar;
        if (z2 && z10) {
            this.f11919v0.scrollToPosition(f10 - 3);
            this.f11919v0.post(new K.a(f10, 3, this));
        } else if (!z2) {
            this.f11919v0.post(new K.a(f10, 3, this));
        } else {
            this.f11919v0.scrollToPosition(f10 + 3);
            this.f11919v0.post(new K.a(f10, 3, this));
        }
    }

    public final void N(int i3) {
        this.f11916s0 = i3;
        if (i3 == 2) {
            this.f11918u0.getLayoutManager().h0(this.f11915r0.f11938d - ((u) this.f11918u0.getAdapter()).f11955c.f11914q0.f11894a.f11938d);
            this.f11920w0.setVisibility(0);
            this.f11921x0.setVisibility(8);
            return;
        }
        if (i3 == 1) {
            this.f11920w0.setVisibility(8);
            this.f11921x0.setVisibility(0);
            M(this.f11915r0);
        }
    }

    @Override // d0.AbstractComponentCallbacksC0789t
    public final void w(Bundle bundle) {
        super.w(bundle);
        if (bundle == null) {
            bundle = this.f13369f;
        }
        this.f11913p0 = bundle.getInt(StubApp.getString2(12500));
        if (bundle.getParcelable(StubApp.getString2(12501)) != null) {
            throw new ClassCastException();
        }
        this.f11914q0 = (b) bundle.getParcelable(StubApp.getString2(12502));
        this.f11915r0 = (m) bundle.getParcelable(StubApp.getString2(12503));
    }

    @Override // d0.AbstractComponentCallbacksC0789t
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i3;
        int i10;
        C0471y c0471y;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m(), this.f11913p0);
        this.f11917t0 = new a5.c(contextThemeWrapper, 3);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        m mVar = this.f11914q0.f11894a;
        if (j.O(contextThemeWrapper)) {
            i3 = 2131427411;
            i10 = 1;
        } else {
            i3 = 2131427406;
            i10 = 0;
        }
        View inflate = cloneInContext.inflate(i3, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(2131230961);
        I.i(gridView, new Q.e(1));
        gridView.setAdapter((ListAdapter) new d());
        gridView.setNumColumns(mVar.f11939e);
        gridView.setEnabled(false);
        this.f11919v0 = (RecyclerView) inflate.findViewById(2131230964);
        this.f11919v0.setLayoutManager(new e(this, i10, i10));
        this.f11919v0.setTag(StubApp.getString2(12504));
        q qVar = new q(contextThemeWrapper, this.f11914q0, new C0366a(this, 3));
        this.f11919v0.setAdapter(qVar);
        int integer = contextThemeWrapper.getResources().getInteger(2131296271);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(2131230967);
        this.f11918u0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f11918u0.setLayoutManager(new GridLayoutManager(integer));
            this.f11918u0.setAdapter(new u(this));
            this.f11918u0.addItemDecoration(new f(this));
        }
        if (inflate.findViewById(2131230956) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(2131230956);
            materialButton.setTag(StubApp.getString2(12505));
            I.i(materialButton, new D4.a(this, 2));
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(2131230958);
            materialButton2.setTag(StubApp.getString2(12506));
            MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(2131230957);
            materialButton3.setTag(StubApp.getString2(12507));
            this.f11920w0 = inflate.findViewById(2131230967);
            this.f11921x0 = inflate.findViewById(2131230960);
            N(1);
            materialButton.setText(this.f11915r0.f11936b);
            this.f11919v0.addOnScrollListener(new g(this, qVar, materialButton));
            materialButton.setOnClickListener(new K4.c(this, 3));
            materialButton3.setOnClickListener(new h(this, qVar, 0));
            materialButton2.setOnClickListener(new h(this, qVar, 1));
        }
        if (!j.O(contextThemeWrapper) && (recyclerView2 = (c0471y = new C0471y()).f10335a) != (recyclerView = this.f11919v0)) {
            h0 h0Var = c0471y.f10337c;
            if (recyclerView2 != null) {
                recyclerView2.removeOnScrollListener(h0Var);
                c0471y.f10335a.setOnFlingListener(null);
            }
            c0471y.f10335a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException(StubApp.getString2(12508));
                }
                c0471y.f10335a.addOnScrollListener(h0Var);
                c0471y.f10335a.setOnFlingListener(c0471y);
                c0471y.f10336b = new Scroller(c0471y.f10335a.getContext(), new DecelerateInterpolator());
                c0471y.f();
            }
        }
        this.f11919v0.scrollToPosition(qVar.f11950c.f11894a.f(this.f11915r0));
        return inflate;
    }
}
