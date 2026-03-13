package com.yalantis.ucrop.view;

import Ka.b;
import Z9.q;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class OverlayView extends View {

    /* renamed from: A, reason: collision with root package name */
    public final int f12996A;

    /* renamed from: B, reason: collision with root package name */
    public final int f12997B;

    /* renamed from: C, reason: collision with root package name */
    public b f12998C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f12999D;

    /* renamed from: a, reason: collision with root package name */
    public final RectF f13000a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f13001b;

    /* renamed from: c, reason: collision with root package name */
    public int f13002c;

    /* renamed from: d, reason: collision with root package name */
    public int f13003d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f13004e;

    /* renamed from: f, reason: collision with root package name */
    public int f13005f;

    /* renamed from: g, reason: collision with root package name */
    public int f13006g;

    /* renamed from: h, reason: collision with root package name */
    public float f13007h;
    public float[] j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13008k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13009l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13010m;

    /* renamed from: n, reason: collision with root package name */
    public int f13011n;

    /* renamed from: p, reason: collision with root package name */
    public final Path f13012p;

    /* renamed from: q, reason: collision with root package name */
    public final Paint f13013q;

    /* renamed from: r, reason: collision with root package name */
    public final Paint f13014r;

    /* renamed from: s, reason: collision with root package name */
    public final Paint f13015s;

    /* renamed from: t, reason: collision with root package name */
    public final Paint f13016t;

    /* renamed from: v, reason: collision with root package name */
    public int f13017v;

    /* renamed from: w, reason: collision with root package name */
    public float f13018w;

    /* renamed from: x, reason: collision with root package name */
    public float f13019x;

    /* renamed from: y, reason: collision with root package name */
    public int f13020y;

    /* renamed from: z, reason: collision with root package name */
    public final int f13021z;

    public OverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f13000a = new RectF();
        this.f13001b = new RectF();
        this.j = null;
        this.f13012p = new Path();
        this.f13013q = new Paint(1);
        this.f13014r = new Paint(1);
        this.f13015s = new Paint(1);
        this.f13016t = new Paint(1);
        this.f13017v = 0;
        this.f13018w = -1.0f;
        this.f13019x = -1.0f;
        this.f13020y = -1;
        this.f13021z = getResources().getDimensionPixelSize(2131100027);
        this.f12996A = getResources().getDimensionPixelSize(2131100028);
        this.f12997B = getResources().getDimensionPixelSize(2131100026);
    }

    public final void a() {
        RectF rectF = this.f13000a;
        float f10 = rectF.left;
        float f11 = rectF.top;
        float f12 = rectF.right;
        float f13 = rectF.bottom;
        this.f13004e = new float[]{f10, f11, f12, f11, f12, f13, f10, f13};
        rectF.centerX();
        rectF.centerY();
        this.j = null;
        Path path = this.f13012p;
        path.reset();
        path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
    }

    public RectF getCropViewRect() {
        return this.f13000a;
    }

    public int getFreestyleCropMode() {
        return this.f13017v;
    }

    public b getOverlayViewChangeListener() {
        return this.f12998C;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        boolean z2 = this.f13010m;
        RectF rectF = this.f13000a;
        if (z2) {
            canvas.clipPath(this.f13012p, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.f13011n);
        canvas.restore();
        if (this.f13010m) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, this.f13013q);
        }
        if (this.f13009l) {
            if (this.j == null && !rectF.isEmpty()) {
                this.j = new float[(this.f13006g * 4) + (this.f13005f * 4)];
                int i3 = 0;
                for (int i10 = 0; i10 < this.f13005f; i10++) {
                    float[] fArr = this.j;
                    fArr[i3] = rectF.left;
                    float f10 = i10 + 1.0f;
                    fArr[i3 + 1] = ((f10 / (this.f13005f + 1)) * rectF.height()) + rectF.top;
                    float[] fArr2 = this.j;
                    int i11 = i3 + 3;
                    fArr2[i3 + 2] = rectF.right;
                    i3 += 4;
                    fArr2[i11] = ((f10 / (this.f13005f + 1)) * rectF.height()) + rectF.top;
                }
                for (int i12 = 0; i12 < this.f13006g; i12++) {
                    float f11 = i12 + 1.0f;
                    this.j[i3] = ((f11 / (this.f13006g + 1)) * rectF.width()) + rectF.left;
                    float[] fArr3 = this.j;
                    fArr3[i3 + 1] = rectF.top;
                    int i13 = i3 + 3;
                    fArr3[i3 + 2] = ((f11 / (this.f13006g + 1)) * rectF.width()) + rectF.left;
                    i3 += 4;
                    this.j[i13] = rectF.bottom;
                }
            }
            float[] fArr4 = this.j;
            if (fArr4 != null) {
                canvas.drawLines(fArr4, this.f13014r);
            }
        }
        if (this.f13008k) {
            canvas.drawRect(rectF, this.f13015s);
        }
        if (this.f13017v != 0) {
            canvas.save();
            RectF rectF2 = this.f13001b;
            rectF2.set(rectF);
            int i14 = this.f12997B;
            float f12 = i14;
            float f13 = -i14;
            rectF2.inset(f12, f13);
            Region.Op op = Region.Op.DIFFERENCE;
            canvas.clipRect(rectF2, op);
            rectF2.set(rectF);
            rectF2.inset(f13, f12);
            canvas.clipRect(rectF2, op);
            canvas.drawRect(rectF, this.f13016t);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i3, int i10, int i11, int i12) {
        super.onLayout(z2, i3, i10, i11, i12);
        if (z2) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.f13002c = width - paddingLeft;
            this.f13003d = height - paddingTop;
            if (this.f12999D) {
                this.f12999D = false;
                setTargetAspectRatio(this.f13007h);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        RectF rectF = this.f13000a;
        if (rectF.isEmpty() || this.f13017v == 0) {
            return false;
        }
        float x7 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if ((motionEvent.getAction() & 255) == 0) {
            double d8 = this.f13021z;
            int i3 = -1;
            for (int i10 = 0; i10 < 8; i10 += 2) {
                double d10 = d8;
                double sqrt = Math.sqrt(Math.pow(y10 - this.f13004e[i10 + 1], 2.0d) + Math.pow(x7 - this.f13004e[i10], 2.0d));
                if (sqrt < d10) {
                    i3 = i10 / 2;
                    d8 = sqrt;
                } else {
                    d8 = d10;
                }
            }
            int i11 = (this.f13017v == 1 && i3 < 0 && rectF.contains(x7, y10)) ? 4 : i3;
            this.f13020y = i11;
            boolean z2 = i11 != -1;
            if (!z2) {
                this.f13018w = -1.0f;
                this.f13019x = -1.0f;
                return z2;
            }
            if (this.f13018w < 0.0f) {
                this.f13018w = x7;
                this.f13019x = y10;
            }
            return z2;
        }
        if ((motionEvent.getAction() & 255) != 2 || motionEvent.getPointerCount() != 1 || this.f13020y == -1) {
            if ((motionEvent.getAction() & 255) != 1) {
                return false;
            }
            this.f13018w = -1.0f;
            this.f13019x = -1.0f;
            this.f13020y = -1;
            b bVar = this.f12998C;
            if (bVar == null) {
                return false;
            }
            ((UCropView) ((q) bVar).f9143b).f13022a.setCropRect(rectF);
            return false;
        }
        float min = Math.min(Math.max(x7, getPaddingLeft()), getWidth() - getPaddingRight());
        float min2 = Math.min(Math.max(y10, getPaddingTop()), getHeight() - getPaddingBottom());
        RectF rectF2 = this.f13001b;
        rectF2.set(rectF);
        int i12 = this.f13020y;
        if (i12 == 0) {
            rectF2.set(min, min2, rectF.right, rectF.bottom);
        } else if (i12 == 1) {
            rectF2.set(rectF.left, min2, min, rectF.bottom);
        } else if (i12 == 2) {
            rectF2.set(rectF.left, rectF.top, min, min2);
        } else if (i12 == 3) {
            rectF2.set(min, rectF.top, rectF.right, min2);
        } else if (i12 == 4) {
            rectF2.offset(min - this.f13018w, min2 - this.f13019x);
            if (rectF2.left > getLeft() && rectF2.top > getTop() && rectF2.right < getRight() && rectF2.bottom < getBottom()) {
                rectF.set(rectF2);
                a();
                postInvalidate();
            }
            this.f13018w = min;
            this.f13019x = min2;
            return true;
        }
        float height = rectF2.height();
        float f10 = this.f12996A;
        boolean z10 = height >= f10;
        boolean z11 = rectF2.width() >= f10;
        rectF.set(z11 ? rectF2.left : rectF.left, z10 ? rectF2.top : rectF.top, z11 ? rectF2.right : rectF.right, z10 ? rectF2.bottom : rectF.bottom);
        if (z10 || z11) {
            a();
            postInvalidate();
        }
        this.f13018w = min;
        this.f13019x = min2;
        return true;
    }

    public void setCircleDimmedLayer(boolean z2) {
        this.f13010m = z2;
    }

    public void setCropFrameColor(int i3) {
        this.f13015s.setColor(i3);
    }

    public void setCropFrameStrokeWidth(int i3) {
        this.f13015s.setStrokeWidth(i3);
    }

    public void setCropGridColor(int i3) {
        this.f13014r.setColor(i3);
    }

    public void setCropGridColumnCount(int i3) {
        this.f13006g = i3;
        this.j = null;
    }

    public void setCropGridRowCount(int i3) {
        this.f13005f = i3;
        this.j = null;
    }

    public void setCropGridStrokeWidth(int i3) {
        this.f13014r.setStrokeWidth(i3);
    }

    public void setDimmedColor(int i3) {
        this.f13011n = i3;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z2) {
        this.f13017v = z2 ? 1 : 0;
    }

    public void setFreestyleCropMode(int i3) {
        this.f13017v = i3;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(b bVar) {
        this.f12998C = bVar;
    }

    public void setShowCropFrame(boolean z2) {
        this.f13008k = z2;
    }

    public void setShowCropGrid(boolean z2) {
        this.f13009l = z2;
    }

    public void setTargetAspectRatio(float f10) {
        this.f13007h = f10;
        int i3 = this.f13002c;
        if (i3 <= 0) {
            this.f12999D = true;
            return;
        }
        int i10 = (int) (i3 / f10);
        int i11 = this.f13003d;
        RectF rectF = this.f13000a;
        if (i10 > i11) {
            int i12 = (i3 - ((int) (i11 * f10))) / 2;
            rectF.set(getPaddingLeft() + i12, getPaddingTop(), getPaddingLeft() + r7 + i12, getPaddingTop() + this.f13003d);
        } else {
            int i13 = (i11 - i10) / 2;
            rectF.set(getPaddingLeft(), getPaddingTop() + i13, getPaddingLeft() + this.f13002c, getPaddingTop() + i10 + i13);
        }
        b bVar = this.f12998C;
        if (bVar != null) {
            ((UCropView) ((q) bVar).f9143b).f13022a.setCropRect(rectF);
        }
        a();
        postInvalidate();
    }
}
