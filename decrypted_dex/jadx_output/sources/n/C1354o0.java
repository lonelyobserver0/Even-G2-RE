package n;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: n.o0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1354o0 extends Drawable implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    public Drawable f17571a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17572b;

    public final void a(Canvas canvas) {
        this.f17571a.draw(canvas);
    }

    public final void b(float f10, float f11) {
        this.f17571a.setHotspot(f10, f11);
    }

    public final void c(int i3, int i10, int i11, int i12) {
        this.f17571a.setHotspotBounds(i3, i10, i11, i12);
    }

    public final boolean d(boolean z2, boolean z10) {
        return super.setVisible(z2, z10) || this.f17571a.setVisible(z2, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f17572b) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.f17571a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f17571a.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f17571a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f17571a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f17571a.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f17571a.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f17571a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f17571a.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f17571a.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f17571a.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f17571a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f17571a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f17571a.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f17571a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i3) {
        return this.f17571a.setLevel(i3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        this.f17571a.setAlpha(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        this.f17571a.setAutoMirrored(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i3) {
        this.f17571a.setChangingConfigurations(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f17571a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z2) {
        this.f17571a.setDither(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z2) {
        this.f17571a.setFilterBitmap(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f10, float f11) {
        if (this.f17572b) {
            b(f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i3, int i10, int i11, int i12) {
        if (this.f17572b) {
            c(i3, i10, i11, i12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f17572b) {
            return this.f17571a.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i3) {
        this.f17571a.setTint(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f17571a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f17571a.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z10) {
        if (this.f17572b) {
            return d(z2, z10);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
