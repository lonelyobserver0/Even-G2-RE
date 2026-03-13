package I4;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class n extends r {

    /* renamed from: b, reason: collision with root package name */
    public final p f3197b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3198c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3199d;

    public n(p pVar, float f10, float f11) {
        this.f3197b = pVar;
        this.f3198c = f10;
        this.f3199d = f11;
    }

    @Override // I4.r
    public final void a(Matrix matrix, H4.a aVar, int i3, Canvas canvas) {
        p pVar = this.f3197b;
        float f10 = pVar.f3208c;
        float f11 = this.f3199d;
        float f12 = pVar.f3207b;
        float f13 = this.f3198c;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f10 - f11, f12 - f13), 0.0f);
        Matrix matrix2 = new Matrix(matrix);
        matrix2.preTranslate(f13, f11);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i3;
        rectF.offset(0.0f, -i3);
        int[] iArr = H4.a.f2737h;
        iArr[0] = aVar.f2745f;
        iArr[1] = aVar.f2744e;
        iArr[2] = aVar.f2743d;
        Paint paint = aVar.f2742c;
        float f14 = rectF.left;
        paint.setShader(new LinearGradient(f14, rectF.top, f14, rectF.bottom, iArr, H4.a.f2738i, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        p pVar = this.f3197b;
        return (float) Math.toDegrees(Math.atan((pVar.f3208c - this.f3199d) / (pVar.f3207b - this.f3198c)));
    }
}
