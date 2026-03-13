package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import h.AbstractC0997a;

/* renamed from: n.G, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1306G extends C1296B {

    /* renamed from: e, reason: collision with root package name */
    public final C1304F f17397e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f17398f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f17399g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f17400h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17401i;
    public boolean j;

    public C1306G(C1304F c1304f) {
        super(c1304f);
        this.f17399g = null;
        this.f17400h = null;
        this.f17401i = false;
        this.j = false;
        this.f17397e = c1304f;
    }

    @Override // n.C1296B
    public final void e(AttributeSet attributeSet, int i3) {
        super.e(attributeSet, 2130903801);
        C1304F c1304f = this.f17397e;
        Context context = c1304f.getContext();
        int[] iArr = AbstractC0997a.f14400g;
        a5.c E10 = a5.c.E(context, attributeSet, iArr, 2130903801);
        N.I.h(c1304f, c1304f.getContext(), iArr, attributeSet, (TypedArray) E10.f9283c, 2130903801);
        Drawable s10 = E10.s(0);
        if (s10 != null) {
            c1304f.setThumb(s10);
        }
        Drawable r8 = E10.r(1);
        Drawable drawable = this.f17398f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f17398f = r8;
        if (r8 != null) {
            r8.setCallback(c1304f);
            r8.setLayoutDirection(c1304f.getLayoutDirection());
            if (r8.isStateful()) {
                r8.setState(c1304f.getDrawableState());
            }
            i();
        }
        c1304f.invalidate();
        TypedArray typedArray = (TypedArray) E10.f9283c;
        if (typedArray.hasValue(3)) {
            this.f17400h = AbstractC1346k0.c(typedArray.getInt(3, -1), this.f17400h);
            this.j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f17399g = E10.p(2);
            this.f17401i = true;
        }
        E10.I();
        i();
    }

    public final void i() {
        Drawable drawable = this.f17398f;
        if (drawable != null) {
            if (this.f17401i || this.j) {
                Drawable mutate = drawable.mutate();
                this.f17398f = mutate;
                if (this.f17401i) {
                    mutate.setTintList(this.f17399g);
                }
                if (this.j) {
                    this.f17398f.setTintMode(this.f17400h);
                }
                if (this.f17398f.isStateful()) {
                    this.f17398f.setState(this.f17397e.getDrawableState());
                }
            }
        }
    }

    public final void j(Canvas canvas) {
        if (this.f17398f != null) {
            int max = this.f17397e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f17398f.getIntrinsicWidth();
                int intrinsicHeight = this.f17398f.getIntrinsicHeight();
                int i3 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i10 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f17398f.setBounds(-i3, -i10, i3, i10);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i11 = 0; i11 <= max; i11++) {
                    this.f17398f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
