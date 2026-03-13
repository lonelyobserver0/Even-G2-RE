package androidx.recyclerview.widget;

import android.view.View;
import android.widget.Scroller;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: androidx.recyclerview.widget.y, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0471y extends P {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f10335a;

    /* renamed from: b, reason: collision with root package name */
    public Scroller f10336b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f10337c = new h0(this);

    /* renamed from: d, reason: collision with root package name */
    public C0472z f10338d;

    /* renamed from: e, reason: collision with root package name */
    public C0472z f10339e;

    public static View c(M m4, Y.e eVar) {
        int v2 = m4.v();
        View view = null;
        if (v2 == 0) {
            return null;
        }
        int l9 = (eVar.l() / 2) + eVar.k();
        int i3 = IntCompanionObject.MAX_VALUE;
        for (int i10 = 0; i10 < v2; i10++) {
            View u2 = m4.u(i10);
            int abs = Math.abs(((eVar.c(u2) / 2) + eVar.e(u2)) - l9);
            if (abs < i3) {
                view = u2;
                i3 = abs;
            }
        }
        return view;
    }

    public final int[] a(M m4, View view) {
        int[] iArr = new int[2];
        if (m4.d()) {
            Y.e d8 = d(m4);
            iArr[0] = ((d8.c(view) / 2) + d8.e(view)) - ((d8.l() / 2) + d8.k());
        } else {
            iArr[0] = 0;
        }
        if (!m4.e()) {
            iArr[1] = 0;
            return iArr;
        }
        Y.e e10 = e(m4);
        iArr[1] = ((e10.c(view) / 2) + e10.e(view)) - ((e10.l() / 2) + e10.k());
        return iArr;
    }

    public final int b(M m4, Y.e eVar, int i3, int i10) {
        this.f10336b.fling(0, 0, i3, i10, Integer.MIN_VALUE, IntCompanionObject.MAX_VALUE, Integer.MIN_VALUE, IntCompanionObject.MAX_VALUE);
        int[] iArr = {this.f10336b.getFinalX(), this.f10336b.getFinalY()};
        int v2 = m4.v();
        float f10 = 1.0f;
        if (v2 != 0) {
            View view = null;
            int i11 = Integer.MIN_VALUE;
            int i12 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i13 = 0; i13 < v2; i13++) {
                View u2 = m4.u(i13);
                int C10 = M.C(u2);
                if (C10 != -1) {
                    if (C10 < i12) {
                        view = u2;
                        i12 = C10;
                    }
                    if (C10 > i11) {
                        view2 = u2;
                        i11 = C10;
                    }
                }
            }
            if (view != null && view2 != null) {
                int max = Math.max(eVar.b(view), eVar.b(view2)) - Math.min(eVar.e(view), eVar.e(view2));
                if (max != 0) {
                    f10 = (max * 1.0f) / ((i11 - i12) + 1);
                }
            }
        }
        if (f10 <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1]) / f10);
    }

    public final Y.e d(M m4) {
        C0472z c0472z = this.f10339e;
        if (c0472z == null || ((M) c0472z.f8656b) != m4) {
            this.f10339e = new C0472z(m4, 0);
        }
        return this.f10339e;
    }

    public final Y.e e(M m4) {
        C0472z c0472z = this.f10338d;
        if (c0472z == null || ((M) c0472z.f8656b) != m4) {
            this.f10338d = new C0472z(m4, 1);
        }
        return this.f10338d;
    }

    public final void f() {
        M layoutManager;
        RecyclerView recyclerView = this.f10335a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View c10 = layoutManager.e() ? c(layoutManager, e(layoutManager)) : layoutManager.d() ? c(layoutManager, d(layoutManager)) : null;
        if (c10 == null) {
            return;
        }
        int[] a3 = a(layoutManager, c10);
        int i3 = a3[0];
        if (i3 == 0 && a3[1] == 0) {
            return;
        }
        this.f10335a.smoothScrollBy(i3, a3[1]);
    }
}
