package Na;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f4953b;

    /* renamed from: d, reason: collision with root package name */
    public final int f4955d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4956e;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f4952a = new Paint(2);

    /* renamed from: c, reason: collision with root package name */
    public int f4954c = 255;

    public a(Bitmap bitmap) {
        this.f4953b = bitmap;
        if (bitmap != null) {
            this.f4955d = bitmap.getWidth();
            this.f4956e = this.f4953b.getHeight();
        } else {
            this.f4956e = 0;
            this.f4955d = 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f4953b;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.f4953b, (Rect) null, getBounds(), this.f4952a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f4954c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f4956e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f4955d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f4956e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f4955d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        this.f4954c = i3;
        this.f4952a.setAlpha(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f4952a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z2) {
        this.f4952a.setFilterBitmap(z2);
    }
}
