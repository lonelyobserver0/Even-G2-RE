package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import h.AbstractC0997a;
import java.util.WeakHashMap;

/* renamed from: n.p, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1355p {

    /* renamed from: a, reason: collision with root package name */
    public final View f17573a;

    /* renamed from: d, reason: collision with root package name */
    public Q0 f17576d;

    /* renamed from: e, reason: collision with root package name */
    public Q0 f17577e;

    /* renamed from: f, reason: collision with root package name */
    public Q0 f17578f;

    /* renamed from: c, reason: collision with root package name */
    public int f17575c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C1365u f17574b = C1365u.a();

    public C1355p(View view) {
        this.f17573a = view;
    }

    public final void a() {
        View view = this.f17573a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f17576d != null) {
                if (this.f17578f == null) {
                    this.f17578f = new Q0();
                }
                Q0 q02 = this.f17578f;
                q02.f17459c = null;
                q02.f17458b = false;
                q02.f17460d = null;
                q02.f17457a = false;
                WeakHashMap weakHashMap = N.I.f4732a;
                ColorStateList c10 = N.B.c(view);
                if (c10 != null) {
                    q02.f17458b = true;
                    q02.f17459c = c10;
                }
                PorterDuff.Mode d8 = N.B.d(view);
                if (d8 != null) {
                    q02.f17457a = true;
                    q02.f17460d = d8;
                }
                if (q02.f17458b || q02.f17457a) {
                    C1365u.e(background, q02, view.getDrawableState());
                    return;
                }
            }
            Q0 q03 = this.f17577e;
            if (q03 != null) {
                C1365u.e(background, q03, view.getDrawableState());
                return;
            }
            Q0 q04 = this.f17576d;
            if (q04 != null) {
                C1365u.e(background, q04, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        Q0 q02 = this.f17577e;
        if (q02 != null) {
            return (ColorStateList) q02.f17459c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        Q0 q02 = this.f17577e;
        if (q02 != null) {
            return (PorterDuff.Mode) q02.f17460d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i3) {
        ColorStateList f10;
        View view = this.f17573a;
        Context context = view.getContext();
        int[] iArr = AbstractC0997a.f14418z;
        a5.c E10 = a5.c.E(context, attributeSet, iArr, i3);
        TypedArray typedArray = (TypedArray) E10.f9283c;
        View view2 = this.f17573a;
        N.I.h(view2, view2.getContext(), iArr, attributeSet, (TypedArray) E10.f9283c, i3);
        try {
            if (typedArray.hasValue(0)) {
                this.f17575c = typedArray.getResourceId(0, -1);
                C1365u c1365u = this.f17574b;
                Context context2 = view.getContext();
                int i10 = this.f17575c;
                synchronized (c1365u) {
                    f10 = c1365u.f17620a.f(context2, i10);
                }
                if (f10 != null) {
                    g(f10);
                }
            }
            if (typedArray.hasValue(1)) {
                N.B.i(view, E10.p(1));
            }
            if (typedArray.hasValue(2)) {
                N.B.j(view, AbstractC1346k0.c(typedArray.getInt(2, -1), null));
            }
            E10.I();
        } catch (Throwable th) {
            E10.I();
            throw th;
        }
    }

    public final void e() {
        this.f17575c = -1;
        g(null);
        a();
    }

    public final void f(int i3) {
        ColorStateList colorStateList;
        this.f17575c = i3;
        C1365u c1365u = this.f17574b;
        if (c1365u != null) {
            Context context = this.f17573a.getContext();
            synchronized (c1365u) {
                colorStateList = c1365u.f17620a.f(context, i3);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f17576d == null) {
                this.f17576d = new Q0();
            }
            Q0 q02 = this.f17576d;
            q02.f17459c = colorStateList;
            q02.f17458b = true;
        } else {
            this.f17576d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f17577e == null) {
            this.f17577e = new Q0();
        }
        Q0 q02 = this.f17577e;
        q02.f17459c = colorStateList;
        q02.f17458b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f17577e == null) {
            this.f17577e = new Q0();
        }
        Q0 q02 = this.f17577e;
        q02.f17460d = mode;
        q02.f17457a = true;
        a();
    }
}
