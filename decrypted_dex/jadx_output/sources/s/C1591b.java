package s;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: s.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1591b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f20576a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f20577b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f20578c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f20579d;

    /* renamed from: e, reason: collision with root package name */
    public float f20580e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f20583h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f20584i;
    public ColorStateList j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20581f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20582g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f20585k = PorterDuff.Mode.SRC_IN;

    public C1591b(ColorStateList colorStateList, float f10) {
        this.f20576a = f10;
        Paint paint = new Paint(5);
        this.f20577b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f20583h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f20583h.getDefaultColor()));
        this.f20578c = new RectF();
        this.f20579d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f20578c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f20579d;
        rect2.set(rect);
        if (this.f20581f) {
            rect2.inset((int) Math.ceil(AbstractC1592c.a(this.f20580e, this.f20576a, this.f20582g)), (int) Math.ceil(AbstractC1592c.b(this.f20580e, this.f20576a, this.f20582g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z2;
        Paint paint = this.f20577b;
        if (this.f20584i == null || paint.getColorFilter() != null) {
            z2 = false;
        } else {
            paint.setColorFilter(this.f20584i);
            z2 = true;
        }
        RectF rectF = this.f20578c;
        float f10 = this.f20576a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z2) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f20579d, this.f20576a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f20583h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f20583h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f20577b;
        boolean z2 = colorForState != paint.getColor();
        if (z2) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 == null || (mode = this.f20585k) == null) {
            return z2;
        }
        this.f20584i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        this.f20577b.setAlpha(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f20577b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.f20584i = a(colorStateList, this.f20585k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f20585k = mode;
        this.f20584i = a(this.j, mode);
        invalidateSelf();
    }
}
