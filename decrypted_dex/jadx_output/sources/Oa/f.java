package Oa;

import B6.p;
import Xa.h;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.internal.measurement.D1;
import com.stub.StubApp;
import com.yalantis.ucrop.UCropActivity;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.UCropView;
import java.util.Locale;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class f extends AppCompatImageView {

    /* renamed from: d, reason: collision with root package name */
    public final float[] f5357d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f5358e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f5359f;

    /* renamed from: g, reason: collision with root package name */
    public final Matrix f5360g;

    /* renamed from: h, reason: collision with root package name */
    public int f5361h;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public e f5362k;

    /* renamed from: l, reason: collision with root package name */
    public float[] f5363l;

    /* renamed from: m, reason: collision with root package name */
    public float[] f5364m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5365n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5366p;

    /* renamed from: q, reason: collision with root package name */
    public int f5367q;

    /* renamed from: r, reason: collision with root package name */
    public String f5368r;

    /* renamed from: s, reason: collision with root package name */
    public String f5369s;

    /* renamed from: t, reason: collision with root package name */
    public Uri f5370t;

    /* renamed from: v, reason: collision with root package name */
    public Uri f5371v;

    /* renamed from: w, reason: collision with root package name */
    public La.c f5372w;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f5357d = new float[8];
        this.f5358e = new float[2];
        this.f5359f = new float[9];
        this.f5360g = new Matrix();
        this.f5365n = false;
        this.f5366p = false;
        this.f5367q = 0;
        GestureCropImageView gestureCropImageView = (GestureCropImageView) this;
        gestureCropImageView.setScaleType(ImageView.ScaleType.MATRIX);
        gestureCropImageView.f12990O = new GestureDetector(gestureCropImageView.getContext(), new p(gestureCropImageView, 1), null, true);
        gestureCropImageView.f12988K = new ScaleGestureDetector(gestureCropImageView.getContext(), new d(gestureCropImageView));
        s2.d dVar = new s2.d(gestureCropImageView, 12);
        Na.c cVar = new Na.c();
        cVar.f4968i = dVar;
        cVar.f4964e = -1;
        cVar.f4965f = -1;
        gestureCropImageView.f12989L = cVar;
    }

    public final float a(Matrix matrix) {
        float[] fArr = this.f5359f;
        matrix.getValues(fArr);
        double pow = Math.pow(fArr[0], 2.0d);
        matrix.getValues(fArr);
        return (float) Math.sqrt(Math.pow(fArr[3], 2.0d) + pow);
    }

    public final void d(float f10, float f11) {
        if (f10 == 0.0f && f11 == 0.0f) {
            return;
        }
        Matrix matrix = this.f5360g;
        matrix.postTranslate(f10, f11);
        setImageMatrix(matrix);
    }

    public float getCurrentAngle() {
        Matrix matrix = this.f5360g;
        float[] fArr = this.f5359f;
        matrix.getValues(fArr);
        double d8 = fArr[1];
        matrix.getValues(fArr);
        return (float) (-(Math.atan2(d8, fArr[0]) * 57.29577951308232d));
    }

    public float getCurrentScale() {
        return a(this.f5360g);
    }

    public La.c getExifInfo() {
        return this.f5372w;
    }

    public String getImageInputPath() {
        return this.f5368r;
    }

    public Uri getImageInputUri() {
        return this.f5370t;
    }

    public String getImageOutputPath() {
        return this.f5369s;
    }

    public Uri getImageOutputUri() {
        return this.f5371v;
    }

    public int getMaxBitmapSize() {
        int i3;
        if (this.f5367q <= 0) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService(StubApp.getString2(526));
            Point point = new Point();
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getSize(point);
            }
            int i10 = point.x;
            int sqrt = (int) Math.sqrt(Math.pow(point.y, 2.0d) + Math.pow(i10, 2.0d));
            Canvas canvas = new Canvas();
            int min = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
            if (min > 0) {
                sqrt = Math.min(sqrt, min);
            }
            try {
                i3 = D1.n();
            } catch (Exception e10) {
                Log.d(StubApp.getString2(4523), StubApp.getString2(4524), e10);
                i3 = 0;
            }
            if (i3 > 0) {
                sqrt = Math.min(sqrt, i3);
            }
            h.v(sqrt, StubApp.getString2(4525), StubApp.getString2(3594));
            this.f5367q = sqrt;
        }
        return this.f5367q;
    }

    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof Na.a)) {
            return null;
        }
        return ((Na.a) getDrawable()).f4953b;
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i3, int i10, int i11, int i12) {
        super.onLayout(z2, i3, i10, i11, i12);
        if (z2 || (this.f5365n && !this.f5366p)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.f5361h = width - paddingLeft;
            this.j = height - paddingTop;
            c cVar = (c) this;
            Drawable drawable = cVar.getDrawable();
            if (drawable != null) {
                float intrinsicWidth = drawable.getIntrinsicWidth();
                float intrinsicHeight = drawable.getIntrinsicHeight();
                Log.d(StubApp.getString2(3602), String.format(StubApp.getString2(4526), Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight)));
                RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
                float f10 = rectF.left;
                float f11 = rectF.top;
                float f12 = rectF.right;
                float f13 = rectF.bottom;
                cVar.f5363l = new float[]{f10, f11, f12, f11, f12, f13, f10, f13};
                cVar.f5364m = new float[]{rectF.centerX(), rectF.centerY()};
                cVar.f5366p = true;
                e eVar = cVar.f5362k;
                if (eVar != null) {
                    UCropActivity uCropActivity = (UCropActivity) ((Ja.c) eVar).f3470b;
                    uCropActivity.f12970P.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateInterpolator());
                    uCropActivity.f12981p0.setClickable(false);
                    uCropActivity.f12969O = false;
                    uCropActivity.m().b();
                }
            }
            Drawable drawable2 = cVar.getDrawable();
            if (drawable2 == null) {
                return;
            }
            float intrinsicWidth2 = drawable2.getIntrinsicWidth();
            float intrinsicHeight2 = drawable2.getIntrinsicHeight();
            if (cVar.f5355z == 0.0f) {
                cVar.f5355z = intrinsicWidth2 / intrinsicHeight2;
            }
            int i13 = cVar.f5361h;
            float f14 = i13;
            float f15 = cVar.f5355z;
            int i14 = (int) (f14 / f15);
            int i15 = cVar.j;
            RectF rectF2 = cVar.f5353x;
            if (i14 > i15) {
                float f16 = i15;
                rectF2.set((i13 - ((int) (f15 * f16))) / 2, 0.0f, r3 + r1, f16);
            } else {
                rectF2.set(0.0f, (i15 - i14) / 2, f14, i14 + r5);
            }
            cVar.e(intrinsicWidth2, intrinsicHeight2);
            float width2 = rectF2.width();
            float height2 = rectF2.height();
            float max = Math.max(rectF2.width() / intrinsicWidth2, rectF2.height() / intrinsicHeight2);
            float f17 = ((width2 - (intrinsicWidth2 * max)) / 2.0f) + rectF2.left;
            float f18 = ((height2 - (intrinsicHeight2 * max)) / 2.0f) + rectF2.top;
            Matrix matrix = cVar.f5360g;
            matrix.reset();
            matrix.postScale(max, max);
            matrix.postTranslate(f17, f18);
            cVar.setImageMatrix(matrix);
            Ka.a aVar = cVar.f5345B;
            if (aVar != null) {
                ((UCropView) ((A0.c) aVar).f29a).f13023b.setTargetAspectRatio(cVar.f5355z);
            }
            e eVar2 = cVar.f5362k;
            if (eVar2 != null) {
                ((Ja.c) eVar2).d(cVar.getCurrentScale());
                e eVar3 = cVar.f5362k;
                float currentAngle = cVar.getCurrentAngle();
                TextView textView = ((UCropActivity) ((Ja.c) eVar3).f3470b).f12979n0;
                if (textView != null) {
                    textView.setText(String.format(Locale.getDefault(), StubApp.getString2(3096), Float.valueOf(currentAngle)));
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new Na.a(bitmap));
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        Matrix matrix2 = this.f5360g;
        matrix2.set(matrix);
        matrix2.mapPoints(this.f5357d, this.f5363l);
        matrix2.mapPoints(this.f5358e, this.f5364m);
    }

    public void setMaxBitmapSize(int i3) {
        this.f5367q = i3;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        } else {
            Log.w(StubApp.getString2(3602), StubApp.getString2(4527));
        }
    }

    public void setTransformImageListener(e eVar) {
        this.f5362k = eVar;
    }
}
