package androidx.appcompat.widget;

import N.L;
import a0.C0379a;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import i.v;
import m.l;
import n.C1337g;
import n.C1345k;
import n.InterfaceC1336f0;
import n.InterfaceC1338g0;
import n.Z0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f9493a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f9494b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f9495c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f9496d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f9497e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f9498f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f9499g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1336f0 f9500h;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f9499g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f9497e == null) {
            this.f9497e = new TypedValue();
        }
        return this.f9497e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f9498f == null) {
            this.f9498f = new TypedValue();
        }
        return this.f9498f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f9495c == null) {
            this.f9495c = new TypedValue();
        }
        return this.f9495c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f9496d == null) {
            this.f9496d = new TypedValue();
        }
        return this.f9496d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f9493a == null) {
            this.f9493a = new TypedValue();
        }
        return this.f9493a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f9494b == null) {
            this.f9494b = new TypedValue();
        }
        return this.f9494b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC1336f0 interfaceC1336f0 = this.f9500h;
        if (interfaceC1336f0 != null) {
            interfaceC1336f0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1345k c1345k;
        super.onDetachedFromWindow();
        InterfaceC1336f0 interfaceC1336f0 = this.f9500h;
        if (interfaceC1336f0 != null) {
            v vVar = (v) ((C0379a) interfaceC1336f0).f9233b;
            InterfaceC1338g0 interfaceC1338g0 = vVar.f14684t;
            if (interfaceC1338g0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1338g0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((Z0) actionBarOverlayLayout.f9456e).f17488a.f9576a;
                if (actionMenuView != null && (c1345k = actionMenuView.f9482w) != null) {
                    c1345k.g();
                    C1337g c1337g = c1345k.f17550w;
                    if (c1337g != null && c1337g.b()) {
                        c1337g.f16996i.dismiss();
                    }
                }
            }
            if (vVar.f14695z != null) {
                vVar.f14671m.getDecorView().removeCallbacks(vVar.f14648A);
                if (vVar.f14695z.isShowing()) {
                    try {
                        vVar.f14695z.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                vVar.f14695z = null;
            }
            L l9 = vVar.f14650B;
            if (l9 != null) {
                l9.b();
            }
            l lVar = vVar.z(0).f14637h;
            if (lVar != null) {
                lVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC1336f0 interfaceC1336f0) {
        this.f9500h = interfaceC1336f0;
    }
}
