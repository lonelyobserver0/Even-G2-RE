package Oa;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.google.android.gms.internal.measurement.F1;
import com.stub.StubApp;
import com.yalantis.ucrop.view.UCropView;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class c extends f {

    /* renamed from: A, reason: collision with root package name */
    public float f5344A;

    /* renamed from: B, reason: collision with root package name */
    public Ka.a f5345B;

    /* renamed from: C, reason: collision with root package name */
    public a f5346C;

    /* renamed from: D, reason: collision with root package name */
    public b f5347D;

    /* renamed from: E, reason: collision with root package name */
    public float f5348E;

    /* renamed from: F, reason: collision with root package name */
    public float f5349F;

    /* renamed from: G, reason: collision with root package name */
    public int f5350G;

    /* renamed from: H, reason: collision with root package name */
    public int f5351H;

    /* renamed from: I, reason: collision with root package name */
    public long f5352I;

    /* renamed from: x, reason: collision with root package name */
    public final RectF f5353x;

    /* renamed from: y, reason: collision with root package name */
    public final Matrix f5354y;

    /* renamed from: z, reason: collision with root package name */
    public float f5355z;

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5353x = new RectF();
        this.f5354y = new Matrix();
        this.f5344A = 10.0f;
        this.f5347D = null;
        this.f5350G = 0;
        this.f5351H = 0;
        this.f5352I = 500L;
    }

    public final void e(float f10, float f11) {
        RectF rectF = this.f5353x;
        float min = Math.min(Math.min(rectF.width() / f10, rectF.width() / f11), Math.min(rectF.height() / f11, rectF.height() / f10));
        this.f5349F = min;
        this.f5348E = min * this.f5344A;
    }

    public final void f() {
        removeCallbacks(this.f5346C);
        removeCallbacks(this.f5347D);
    }

    public final boolean g(float[] fArr) {
        Matrix matrix = this.f5354y;
        matrix.reset();
        matrix.setRotate(-getCurrentAngle());
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        matrix.mapPoints(copyOf);
        RectF rectF = this.f5353x;
        float f10 = rectF.left;
        float f11 = rectF.top;
        float f12 = rectF.right;
        float f13 = rectF.bottom;
        float[] fArr2 = {f10, f11, f12, f11, f12, f13, f10, f13};
        matrix.mapPoints(fArr2);
        return F1.z(copyOf).contains(F1.z(fArr2));
    }

    public Ka.a getCropBoundsChangeListener() {
        return this.f5345B;
    }

    public float getMaxScale() {
        return this.f5348E;
    }

    public float getMinScale() {
        return this.f5349F;
    }

    public float getTargetAspectRatio() {
        return this.f5355z;
    }

    public final void h(float f10, float f11, float f12) {
        if (f10 > 1.0f && getCurrentScale() * f10 <= getMaxScale()) {
            if (f10 != 0.0f) {
                Matrix matrix = this.f5360g;
                matrix.postScale(f10, f10, f11, f12);
                setImageMatrix(matrix);
                e eVar = this.f5362k;
                if (eVar != null) {
                    ((Ja.c) eVar).d(a(matrix));
                    return;
                }
                return;
            }
            return;
        }
        if (f10 >= 1.0f || getCurrentScale() * f10 < getMinScale() || f10 == 0.0f) {
            return;
        }
        Matrix matrix2 = this.f5360g;
        matrix2.postScale(f10, f10, f11, f12);
        setImageMatrix(matrix2);
        e eVar2 = this.f5362k;
        if (eVar2 != null) {
            ((Ja.c) eVar2).d(a(matrix2));
        }
    }

    public final void i(float f10, float f11, float f12) {
        if (f10 <= getMaxScale()) {
            h(f10 / getCurrentScale(), f11, f12);
        }
    }

    public void setCropBoundsChangeListener(Ka.a aVar) {
        this.f5345B = aVar;
    }

    public void setCropRect(RectF rectF) {
        this.f5355z = rectF.width() / rectF.height();
        this.f5353x.set(rectF.left - getPaddingLeft(), rectF.top - getPaddingTop(), rectF.right - getPaddingRight(), rectF.bottom - getPaddingBottom());
        if (getDrawable() != null) {
            e(r6.getIntrinsicWidth(), r6.getIntrinsicHeight());
        }
        setImageToWrapCropBounds(true);
    }

    public void setImageToWrapCropBounds(boolean z2) {
        float f10;
        float max;
        if (this.f5366p) {
            float[] fArr = this.f5357d;
            if (g(fArr)) {
                return;
            }
            float[] fArr2 = this.f5358e;
            float f11 = fArr2[0];
            float f12 = fArr2[1];
            float currentScale = getCurrentScale();
            RectF rectF = this.f5353x;
            float centerX = rectF.centerX() - f11;
            float centerY = rectF.centerY() - f12;
            Matrix matrix = this.f5354y;
            matrix.reset();
            matrix.setTranslate(centerX, centerY);
            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
            matrix.mapPoints(copyOf);
            boolean g10 = g(copyOf);
            if (g10) {
                matrix.reset();
                matrix.setRotate(-getCurrentAngle());
                float[] copyOf2 = Arrays.copyOf(fArr, fArr.length);
                float f13 = rectF.left;
                float f14 = rectF.top;
                float f15 = rectF.right;
                float f16 = rectF.bottom;
                float[] fArr3 = {f13, f14, f15, f14, f15, f16, f13, f16};
                matrix.mapPoints(copyOf2);
                matrix.mapPoints(fArr3);
                RectF z10 = F1.z(copyOf2);
                RectF z11 = F1.z(fArr3);
                float f17 = z10.left - z11.left;
                float f18 = z10.top - z11.top;
                float f19 = z10.right - z11.right;
                float f20 = z10.bottom - z11.bottom;
                max = 0.0f;
                if (f17 <= 0.0f) {
                    f17 = 0.0f;
                }
                if (f18 <= 0.0f) {
                    f18 = 0.0f;
                }
                if (f19 >= 0.0f) {
                    f19 = 0.0f;
                }
                if (f20 >= 0.0f) {
                    f20 = 0.0f;
                }
                float[] fArr4 = {f17, f18, f19, f20};
                matrix.reset();
                matrix.setRotate(getCurrentAngle());
                matrix.mapPoints(fArr4);
                centerX = -(fArr4[0] + fArr4[2]);
                centerY = -(fArr4[1] + fArr4[3]);
                f10 = f12;
            } else {
                RectF rectF2 = new RectF(rectF);
                matrix.reset();
                matrix.setRotate(getCurrentAngle());
                matrix.mapRect(rectF2);
                f10 = f12;
                float[] fArr5 = {(float) Math.sqrt(Math.pow(fArr[1] - fArr[3], 2.0d) + Math.pow(fArr[0] - fArr[2], 2.0d)), (float) Math.sqrt(Math.pow(fArr[3] - fArr[5], 2.0d) + Math.pow(fArr[2] - fArr[4], 2.0d))};
                max = (Math.max(rectF2.width() / fArr5[0], rectF2.height() / fArr5[1]) * currentScale) - currentScale;
            }
            float f21 = centerX;
            float f22 = centerY;
            if (z2) {
                a aVar = new a(this, this.f5352I, f11, f10, f21, f22, currentScale, max, g10);
                this.f5346C = aVar;
                post(aVar);
            } else {
                float f23 = max;
                d(f21, f22);
                if (g10) {
                    return;
                }
                i(currentScale + f23, rectF.centerX(), rectF.centerY());
            }
        }
    }

    public void setImageToWrapCropBoundsAnimDuration(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException(StubApp.getString2(4522));
        }
        this.f5352I = j;
    }

    public void setMaxResultImageSizeX(int i3) {
        this.f5350G = i3;
    }

    public void setMaxResultImageSizeY(int i3) {
        this.f5351H = i3;
    }

    public void setMaxScaleMultiplier(float f10) {
        this.f5344A = f10;
    }

    public void setTargetAspectRatio(float f10) {
        if (getDrawable() == null) {
            this.f5355z = f10;
            return;
        }
        if (f10 == 0.0f) {
            this.f5355z = r0.getIntrinsicWidth() / r0.getIntrinsicHeight();
        } else {
            this.f5355z = f10;
        }
        Ka.a aVar = this.f5345B;
        if (aVar != null) {
            ((UCropView) ((A0.c) aVar).f29a).f13023b.setTargetAspectRatio(this.f5355z);
        }
    }
}
