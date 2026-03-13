package K4;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h extends I4.g {

    /* renamed from: A, reason: collision with root package name */
    public final RectF f3660A;

    /* renamed from: B, reason: collision with root package name */
    public int f3661B;

    /* renamed from: z, reason: collision with root package name */
    public final Paint f3662z;

    public h(I4.k kVar) {
        super(kVar == null ? new I4.k() : kVar);
        Paint paint = new Paint(1);
        this.f3662z = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f3660A = new RectF();
    }

    @Override // I4.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            this.f3661B = canvas2.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        }
        super.draw(canvas2);
        canvas2.drawRect(this.f3660A, this.f3662z);
        if (getCallback() instanceof View) {
            return;
        }
        canvas2.restoreToCount(this.f3661B);
    }

    public final void l(float f10, float f11, float f12, float f13) {
        RectF rectF = this.f3660A;
        if (f10 == rectF.left && f11 == rectF.top && f12 == rectF.right && f13 == rectF.bottom) {
            return;
        }
        rectF.set(f10, f11, f12, f13);
        invalidateSelf();
    }
}
