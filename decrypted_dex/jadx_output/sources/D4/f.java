package D4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import r4.AbstractC1567a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class f extends LinearLayoutCompat {

    /* renamed from: r, reason: collision with root package name */
    public Drawable f1320r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f1321s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f1322t;

    /* renamed from: v, reason: collision with root package name */
    public int f1323v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f1324w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1325x;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1321s = new Rect();
        this.f1322t = new Rect();
        this.f1323v = 119;
        this.f1324w = true;
        this.f1325x = false;
        int[] iArr = AbstractC1567a.f20328g;
        j.a(context, attributeSet, 0, 0);
        j.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f1323v = obtainStyledAttributes.getInt(1, this.f1323v);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f1324w = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f1320r;
        if (drawable != null) {
            if (this.f1325x) {
                this.f1325x = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z2 = this.f1324w;
                Rect rect = this.f1321s;
                if (z2) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i3 = this.f1323v;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f1322t;
                Gravity.apply(i3, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f1320r;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1320r;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f1320r.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f1320r;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f1323v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1320r;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i10, int i11, int i12) {
        super.onLayout(z2, i3, i10, i11, i12);
        this.f1325x = z2 | this.f1325x;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        this.f1325x = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f1320r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f1320r);
            }
            this.f1320r = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f1323v == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i3) {
        if (this.f1323v != i3) {
            if ((8388615 & i3) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            this.f1323v = i3;
            if (i3 == 119 && this.f1320r != null) {
                this.f1320r.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1320r;
    }
}
