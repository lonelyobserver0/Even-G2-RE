package I4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import i5.C1059c;
import java.util.Objects;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class g extends Drawable implements t {

    /* renamed from: y, reason: collision with root package name */
    public static final Paint f3150y = new Paint(1);

    /* renamed from: a, reason: collision with root package name */
    public f f3151a;

    /* renamed from: b, reason: collision with root package name */
    public final r[] f3152b;

    /* renamed from: c, reason: collision with root package name */
    public final r[] f3153c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3154d;

    /* renamed from: e, reason: collision with root package name */
    public final Matrix f3155e;

    /* renamed from: f, reason: collision with root package name */
    public final Path f3156f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f3157g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f3158h;
    public final RectF j;

    /* renamed from: k, reason: collision with root package name */
    public final Region f3159k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f3160l;

    /* renamed from: m, reason: collision with root package name */
    public k f3161m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f3162n;

    /* renamed from: p, reason: collision with root package name */
    public final Paint f3163p;

    /* renamed from: q, reason: collision with root package name */
    public final H4.a f3164q;

    /* renamed from: r, reason: collision with root package name */
    public final F5.c f3165r;

    /* renamed from: s, reason: collision with root package name */
    public final C1059c f3166s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f3167t;

    /* renamed from: v, reason: collision with root package name */
    public PorterDuffColorFilter f3168v;

    /* renamed from: w, reason: collision with root package name */
    public Rect f3169w;

    /* renamed from: x, reason: collision with root package name */
    public final RectF f3170x;

    public g() {
        this(new k());
    }

    public static void c(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a3 = kVar.f3188f.a(rectF);
            canvas.drawRoundRect(rectF, a3, a3, paint);
        }
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f3151a;
        this.f3166s.e(fVar.f3135a, fVar.f3143i, rectF, this.f3165r, path);
        if (this.f3151a.f3142h != 1.0f) {
            Matrix matrix = this.f3155e;
            matrix.reset();
            float f10 = this.f3151a.f3142h;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f3170x, true);
    }

    public final int b(int i3) {
        f fVar = this.f3151a;
        float f10 = 0.0f;
        float f11 = fVar.f3146m + 0.0f + fVar.f3145l;
        C4.a aVar = fVar.f3136b;
        if (aVar == null || !aVar.f1116a || F.a.d(i3, 255) != aVar.f1118c) {
            return i3;
        }
        if (aVar.f1119d > 0.0f && f11 > 0.0f) {
            f10 = Math.min(((((float) Math.log1p(f11 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        return F.a.d(Ec.l.q(f10, F.a.d(i3, 255), aVar.f1117b), Color.alpha(i3));
    }

    public final RectF d() {
        Rect bounds = getBounds();
        RectF rectF = this.f3158h;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i3;
        Paint paint = this.f3162n;
        paint.setColorFilter(this.f3167t);
        int alpha = paint.getAlpha();
        int i10 = this.f3151a.f3144k;
        paint.setAlpha(((i10 + (i10 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f3163p;
        paint2.setColorFilter(this.f3168v);
        paint2.setStrokeWidth(this.f3151a.j);
        int alpha2 = paint2.getAlpha();
        int i11 = this.f3151a.f3144k;
        paint2.setAlpha(((i11 + (i11 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f3154d;
        Path path = this.f3157g;
        Path path2 = this.f3156f;
        RectF rectF = this.j;
        if (z2) {
            float f10 = -(e() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f3151a.f3135a;
            j e10 = kVar.e();
            c cVar = kVar.f3187e;
            if (!(cVar instanceof h)) {
                cVar = new b(f10, cVar);
            }
            e10.f3176e = cVar;
            c cVar2 = kVar.f3188f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f10, cVar2);
            }
            e10.f3177f = cVar2;
            c cVar3 = kVar.f3190h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f10, cVar3);
            }
            e10.f3179h = cVar3;
            c cVar4 = kVar.f3189g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f10, cVar4);
            }
            e10.f3178g = cVar4;
            k a3 = e10.a();
            this.f3161m = a3;
            float f11 = this.f3151a.f3143i;
            RectF d8 = d();
            float strokeWidth = e() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.set(d8.left + strokeWidth, d8.top + strokeWidth, d8.right - strokeWidth, d8.bottom - strokeWidth);
            this.f3166s.e(a3, f11, rectF, null, path);
            a(d(), path2);
            this.f3154d = false;
        }
        f fVar = this.f3151a;
        fVar.getClass();
        if (fVar.f3147n <= 0 || this.f3151a.f3135a.d(d()) || path2.isConvex()) {
            i3 = alpha2;
        } else {
            canvas.save();
            double d10 = 0;
            canvas.translate((int) (this.f3151a.f3148o * Math.sin(Math.toRadians(d10))), (int) (Math.cos(Math.toRadians(d10)) * this.f3151a.f3148o));
            RectF rectF2 = this.f3170x;
            int width = (int) (rectF2.width() - getBounds().width());
            int height = (int) (rectF2.height() - getBounds().height());
            Bitmap createBitmap = Bitmap.createBitmap(AbstractC1482f.c(this.f3151a.f3147n, 2, (int) rectF2.width(), width), AbstractC1482f.c(this.f3151a.f3147n, 2, (int) rectF2.height(), height), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f12 = (getBounds().left - this.f3151a.f3147n) - width;
            float f13 = (getBounds().top - this.f3151a.f3147n) - height;
            canvas2.translate(-f12, -f13);
            int i12 = this.f3151a.f3148o;
            H4.a aVar = this.f3164q;
            if (i12 != 0) {
                canvas2.drawPath(path2, aVar.f2740a);
            }
            int i13 = 0;
            while (i13 < 4) {
                r rVar = this.f3152b[i13];
                int i14 = i13;
                int i15 = this.f3151a.f3147n;
                int i16 = alpha2;
                Matrix matrix = r.f3210a;
                rVar.a(matrix, aVar, i15, canvas2);
                this.f3153c[i14].a(matrix, aVar, this.f3151a.f3147n, canvas2);
                i13 = i14 + 1;
                alpha2 = i16;
            }
            i3 = alpha2;
            int sin = (int) (this.f3151a.f3148o * Math.sin(Math.toRadians(d10)));
            int cos = (int) (this.f3151a.f3148o * Math.cos(Math.toRadians(d10)));
            canvas2.translate(-sin, -cos);
            canvas2.drawPath(path2, f3150y);
            canvas2.translate(sin, cos);
            canvas.drawBitmap(createBitmap, f12, f13, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
        f fVar2 = this.f3151a;
        Paint.Style style = fVar2.f3149p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            c(canvas, paint, path2, fVar2.f3135a, d());
        }
        if (e()) {
            k kVar2 = this.f3161m;
            RectF d11 = d();
            float strokeWidth2 = e() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.set(d11.left + strokeWidth2, d11.top + strokeWidth2, d11.right - strokeWidth2, d11.bottom - strokeWidth2);
            c(canvas, paint2, path, kVar2, rectF);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(i3);
    }

    public final boolean e() {
        Paint.Style style = this.f3151a.f3149p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f3163p.getStrokeWidth() > 0.0f;
    }

    public final void f(Context context) {
        this.f3151a.f3136b = new C4.a(context);
        k();
    }

    public final void g(float f10) {
        f fVar = this.f3151a;
        if (fVar.f3146m != f10) {
            fVar.f3146m = f10;
            k();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f3151a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f3151a.getClass();
        if (this.f3151a.f3135a.d(d())) {
            outline.setRoundRect(getBounds(), this.f3151a.f3135a.f3187e.a(d()));
            return;
        }
        RectF d8 = d();
        Path path = this.f3156f;
        a(d8, path);
        if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f3169w;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f3159k;
        region.set(bounds);
        RectF d8 = d();
        Path path = this.f3156f;
        a(d8, path);
        Region region2 = this.f3160l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(ColorStateList colorStateList) {
        f fVar = this.f3151a;
        if (fVar.f3137c != colorStateList) {
            fVar.f3137c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean i(int[] iArr) {
        boolean z2;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f3151a.f3137c == null || color2 == (colorForState2 = this.f3151a.f3137c.getColorForState(iArr, (color2 = (paint2 = this.f3162n).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f3151a.f3138d == null || color == (colorForState = this.f3151a.f3138d.getColorForState(iArr, (color = (paint = this.f3163p).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f3154d = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f3151a.f3139e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f3151a.getClass();
        ColorStateList colorStateList2 = this.f3151a.f3138d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f3151a.f3137c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    public final boolean j() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f3167t;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f3168v;
        f fVar = this.f3151a;
        ColorStateList colorStateList = fVar.f3139e;
        PorterDuff.Mode mode = fVar.f3140f;
        Paint paint = this.f3162n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int b2 = b(color);
            porterDuffColorFilter = b2 != color ? new PorterDuffColorFilter(b2, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f3167t = porterDuffColorFilter;
        this.f3151a.getClass();
        this.f3168v = null;
        this.f3151a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f3167t) && Objects.equals(porterDuffColorFilter3, this.f3168v)) ? false : true;
    }

    public final void k() {
        f fVar = this.f3151a;
        float f10 = fVar.f3146m + 0.0f;
        fVar.f3147n = (int) Math.ceil(0.75f * f10);
        this.f3151a.f3148o = (int) Math.ceil(f10 * 0.25f);
        j();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        f fVar = this.f3151a;
        f fVar2 = new f();
        fVar2.f3137c = null;
        fVar2.f3138d = null;
        fVar2.f3139e = null;
        fVar2.f3140f = PorterDuff.Mode.SRC_IN;
        fVar2.f3141g = null;
        fVar2.f3142h = 1.0f;
        fVar2.f3143i = 1.0f;
        fVar2.f3144k = 255;
        fVar2.f3145l = 0.0f;
        fVar2.f3146m = 0.0f;
        fVar2.f3147n = 0;
        fVar2.f3148o = 0;
        fVar2.f3149p = Paint.Style.FILL_AND_STROKE;
        fVar2.f3135a = fVar.f3135a;
        fVar2.f3136b = fVar.f3136b;
        fVar2.j = fVar.j;
        fVar2.f3137c = fVar.f3137c;
        fVar2.f3138d = fVar.f3138d;
        fVar2.f3140f = fVar.f3140f;
        fVar2.f3139e = fVar.f3139e;
        fVar2.f3144k = fVar.f3144k;
        fVar2.f3142h = fVar.f3142h;
        fVar2.f3148o = fVar.f3148o;
        fVar2.f3143i = fVar.f3143i;
        fVar2.f3145l = fVar.f3145l;
        fVar2.f3146m = fVar.f3146m;
        fVar2.f3147n = fVar.f3147n;
        fVar2.f3149p = fVar.f3149p;
        if (fVar.f3141g != null) {
            fVar2.f3141g = new Rect(fVar.f3141g);
        }
        this.f3151a = fVar2;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f3154d = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z2 = i(iArr) || j();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i3) {
        f fVar = this.f3151a;
        if (fVar.f3144k != i3) {
            fVar.f3144k = i3;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3151a.getClass();
        super.invalidateSelf();
    }

    @Override // I4.t
    public final void setShapeAppearanceModel(k kVar) {
        this.f3151a.f3135a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i3) {
        setTintList(ColorStateList.valueOf(i3));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f3151a.f3139e = colorStateList;
        j();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f3151a;
        if (fVar.f3140f != mode) {
            fVar.f3140f = mode;
            j();
            super.invalidateSelf();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i3, int i10) {
        this(k.b(context, attributeSet, i3, i10).a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(I4.k r4) {
        /*
            r3 = this;
            I4.f r0 = new I4.f
            r0.<init>()
            r1 = 0
            r0.f3137c = r1
            r0.f3138d = r1
            r0.f3139e = r1
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r0.f3140f = r2
            r0.f3141g = r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.f3142h = r2
            r0.f3143i = r2
            r2 = 255(0xff, float:3.57E-43)
            r0.f3144k = r2
            r2 = 0
            r0.f3145l = r2
            r0.f3146m = r2
            r2 = 0
            r0.f3147n = r2
            r0.f3148o = r2
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL_AND_STROKE
            r0.f3149p = r2
            r0.f3135a = r4
            r0.f3136b = r1
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I4.g.<init>(I4.k):void");
    }

    public g(f fVar) {
        this.f3152b = new r[4];
        this.f3153c = new r[4];
        this.f3155e = new Matrix();
        this.f3156f = new Path();
        this.f3157g = new Path();
        this.f3158h = new RectF();
        this.j = new RectF();
        this.f3159k = new Region();
        this.f3160l = new Region();
        Paint paint = new Paint(1);
        this.f3162n = paint;
        Paint paint2 = new Paint(1);
        this.f3163p = paint2;
        this.f3164q = new H4.a();
        this.f3166s = new C1059c(3);
        this.f3170x = new RectF();
        this.f3151a = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f3150y;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        j();
        i(getState());
        this.f3165r = new F5.c(this, 10);
    }
}
