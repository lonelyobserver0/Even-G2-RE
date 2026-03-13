package I4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m extends r {

    /* renamed from: b, reason: collision with root package name */
    public final o f3196b;

    public m(o oVar) {
        this.f3196b = oVar;
    }

    @Override // I4.r
    public final void a(Matrix matrix, H4.a aVar, int i3, Canvas canvas) {
        o oVar = this.f3196b;
        float f10 = oVar.f3205f;
        float f11 = oVar.f3206g;
        RectF rectF = new RectF(oVar.f3201b, oVar.f3202c, oVar.f3203d, oVar.f3204e);
        aVar.getClass();
        boolean z2 = f11 < 0.0f;
        Path path = aVar.f2746g;
        int[] iArr = H4.a.j;
        if (z2) {
            iArr[0] = 0;
            iArr[1] = aVar.f2745f;
            iArr[2] = aVar.f2744e;
            iArr[3] = aVar.f2743d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i3;
            rectF.inset(f12, f12);
            iArr[0] = 0;
            iArr[1] = aVar.f2743d;
            iArr[2] = aVar.f2744e;
            iArr[3] = aVar.f2745f;
        }
        float width = 1.0f - (i3 / (rectF.width() / 2.0f));
        float[] fArr = H4.a.f2739k;
        fArr[1] = width;
        fArr[2] = ((1.0f - width) / 2.0f) + width;
        Paint paint = aVar.f2741b;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z2) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        canvas.drawArc(rectF, f10, f11, true, paint);
        canvas.restore();
    }
}
