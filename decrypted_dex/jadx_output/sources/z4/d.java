package z4;

import D4.i;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import s4.C1599b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d extends I4.g implements Drawable.Callback, D4.h {

    /* renamed from: X0, reason: collision with root package name */
    public static final int[] f24045X0 = {R.attr.state_enabled};

    /* renamed from: Y0, reason: collision with root package name */
    public static final ShapeDrawable f24046Y0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f24047A;

    /* renamed from: A0, reason: collision with root package name */
    public final PointF f24048A0;

    /* renamed from: B, reason: collision with root package name */
    public float f24049B;

    /* renamed from: B0, reason: collision with root package name */
    public final Path f24050B0;

    /* renamed from: C, reason: collision with root package name */
    public float f24051C;

    /* renamed from: C0, reason: collision with root package name */
    public final i f24052C0;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f24053D;

    /* renamed from: D0, reason: collision with root package name */
    public int f24054D0;

    /* renamed from: E, reason: collision with root package name */
    public float f24055E;

    /* renamed from: E0, reason: collision with root package name */
    public int f24056E0;

    /* renamed from: F, reason: collision with root package name */
    public ColorStateList f24057F;

    /* renamed from: F0, reason: collision with root package name */
    public int f24058F0;

    /* renamed from: G, reason: collision with root package name */
    public CharSequence f24059G;

    /* renamed from: G0, reason: collision with root package name */
    public int f24060G0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f24061H;

    /* renamed from: H0, reason: collision with root package name */
    public int f24062H0;

    /* renamed from: I, reason: collision with root package name */
    public Drawable f24063I;

    /* renamed from: I0, reason: collision with root package name */
    public int f24064I0;

    /* renamed from: J0, reason: collision with root package name */
    public boolean f24065J0;

    /* renamed from: K, reason: collision with root package name */
    public ColorStateList f24066K;

    /* renamed from: K0, reason: collision with root package name */
    public int f24067K0;

    /* renamed from: L, reason: collision with root package name */
    public float f24068L;

    /* renamed from: L0, reason: collision with root package name */
    public int f24069L0;

    /* renamed from: M0, reason: collision with root package name */
    public ColorFilter f24070M0;

    /* renamed from: N0, reason: collision with root package name */
    public PorterDuffColorFilter f24071N0;

    /* renamed from: O, reason: collision with root package name */
    public boolean f24072O;

    /* renamed from: O0, reason: collision with root package name */
    public ColorStateList f24073O0;

    /* renamed from: P, reason: collision with root package name */
    public boolean f24074P;

    /* renamed from: P0, reason: collision with root package name */
    public PorterDuff.Mode f24075P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int[] f24076Q0;

    /* renamed from: R, reason: collision with root package name */
    public Drawable f24077R;

    /* renamed from: R0, reason: collision with root package name */
    public ColorStateList f24078R0;

    /* renamed from: S0, reason: collision with root package name */
    public WeakReference f24079S0;

    /* renamed from: T, reason: collision with root package name */
    public RippleDrawable f24080T;

    /* renamed from: T0, reason: collision with root package name */
    public TextUtils.TruncateAt f24081T0;

    /* renamed from: U0, reason: collision with root package name */
    public boolean f24082U0;

    /* renamed from: V0, reason: collision with root package name */
    public int f24083V0;
    public boolean W0;

    /* renamed from: X, reason: collision with root package name */
    public ColorStateList f24084X;

    /* renamed from: Y, reason: collision with root package name */
    public float f24085Y;

    /* renamed from: Z, reason: collision with root package name */
    public SpannableStringBuilder f24086Z;
    public boolean h0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f24087k0;

    /* renamed from: l0, reason: collision with root package name */
    public Drawable f24088l0;

    /* renamed from: m0, reason: collision with root package name */
    public C1599b f24089m0;

    /* renamed from: n0, reason: collision with root package name */
    public C1599b f24090n0;

    /* renamed from: o0, reason: collision with root package name */
    public float f24091o0;

    /* renamed from: p0, reason: collision with root package name */
    public float f24092p0;

    /* renamed from: q0, reason: collision with root package name */
    public float f24093q0;

    /* renamed from: r0, reason: collision with root package name */
    public float f24094r0;

    /* renamed from: s0, reason: collision with root package name */
    public float f24095s0;

    /* renamed from: t0, reason: collision with root package name */
    public float f24096t0;

    /* renamed from: u0, reason: collision with root package name */
    public float f24097u0;

    /* renamed from: v0, reason: collision with root package name */
    public float f24098v0;

    /* renamed from: w0, reason: collision with root package name */
    public final Context f24099w0;

    /* renamed from: x0, reason: collision with root package name */
    public final Paint f24100x0;

    /* renamed from: y0, reason: collision with root package name */
    public final Paint.FontMetrics f24101y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f24102z;

    /* renamed from: z0, reason: collision with root package name */
    public final RectF f24103z0;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903212, 2131821245);
        this.f24100x0 = new Paint(1);
        this.f24101y0 = new Paint.FontMetrics();
        this.f24103z0 = new RectF();
        this.f24048A0 = new PointF();
        this.f24050B0 = new Path();
        this.f24069L0 = 255;
        this.f24075P0 = PorterDuff.Mode.SRC_IN;
        this.f24079S0 = new WeakReference(null);
        f(context);
        this.f24099w0 = context;
        i iVar = new i(this);
        this.f24052C0 = iVar;
        this.f24059G = "";
        iVar.f1328a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f24045X0;
        setState(iArr);
        if (!Arrays.equals(this.f24076Q0, iArr)) {
            this.f24076Q0 = iArr;
            if (Q()) {
                t(getState(), iArr);
            }
        }
        this.f24082U0 = true;
        f24046Y0.setTint(-1);
    }

    public static void R(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean q(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean r(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(ColorStateList colorStateList) {
        this.f24072O = true;
        if (this.f24066K != colorStateList) {
            this.f24066K = colorStateList;
            if (P()) {
                this.f24063I.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void B(boolean z2) {
        if (this.f24061H != z2) {
            boolean P10 = P();
            this.f24061H = z2;
            boolean P11 = P();
            if (P10 != P11) {
                if (P11) {
                    l(this.f24063I);
                } else {
                    R(this.f24063I);
                }
                invalidateSelf();
                s();
            }
        }
    }

    public final void C(ColorStateList colorStateList) {
        if (this.f24053D != colorStateList) {
            this.f24053D = colorStateList;
            if (this.W0) {
                I4.f fVar = this.f3151a;
                if (fVar.f3138d != colorStateList) {
                    fVar.f3138d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void D(float f10) {
        if (this.f24055E != f10) {
            this.f24055E = f10;
            this.f24100x0.setStrokeWidth(f10);
            if (this.W0) {
                this.f3151a.j = f10;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f24077R;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof G.b;
            drawable2 = drawable3;
            if (z2) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float o5 = o();
            this.f24077R = drawable != null ? drawable.mutate() : null;
            ColorStateList colorStateList = this.f24057F;
            if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(0);
            }
            this.f24080T = new RippleDrawable(colorStateList, this.f24077R, f24046Y0);
            float o10 = o();
            R(drawable2);
            if (Q()) {
                l(this.f24077R);
            }
            invalidateSelf();
            if (o5 != o10) {
                s();
            }
        }
    }

    public final void F(float f10) {
        if (this.f24097u0 != f10) {
            this.f24097u0 = f10;
            invalidateSelf();
            if (Q()) {
                s();
            }
        }
    }

    public final void G(float f10) {
        if (this.f24085Y != f10) {
            this.f24085Y = f10;
            invalidateSelf();
            if (Q()) {
                s();
            }
        }
    }

    public final void H(float f10) {
        if (this.f24096t0 != f10) {
            this.f24096t0 = f10;
            invalidateSelf();
            if (Q()) {
                s();
            }
        }
    }

    public final void I(ColorStateList colorStateList) {
        if (this.f24084X != colorStateList) {
            this.f24084X = colorStateList;
            if (Q()) {
                this.f24077R.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void J(boolean z2) {
        if (this.f24074P != z2) {
            boolean Q10 = Q();
            this.f24074P = z2;
            boolean Q11 = Q();
            if (Q10 != Q11) {
                if (Q11) {
                    l(this.f24077R);
                } else {
                    R(this.f24077R);
                }
                invalidateSelf();
                s();
            }
        }
    }

    public final void K(float f10) {
        if (this.f24093q0 != f10) {
            float n10 = n();
            this.f24093q0 = f10;
            float n11 = n();
            invalidateSelf();
            if (n10 != n11) {
                s();
            }
        }
    }

    public final void L(float f10) {
        if (this.f24092p0 != f10) {
            float n10 = n();
            this.f24092p0 = f10;
            float n11 = n();
            invalidateSelf();
            if (n10 != n11) {
                s();
            }
        }
    }

    public final void M(ColorStateList colorStateList) {
        if (this.f24057F != colorStateList) {
            this.f24057F = colorStateList;
            this.f24078R0 = null;
            onStateChange(getState());
        }
    }

    public final void N(F4.d dVar) {
        i iVar = this.f24052C0;
        if (iVar.f1333f != dVar) {
            iVar.f1333f = dVar;
            if (dVar != null) {
                TextPaint textPaint = iVar.f1328a;
                dVar.a();
                dVar.d(textPaint, dVar.f2231l);
                D4.g gVar = iVar.f1329b;
                F4.c cVar = new F4.c(dVar, textPaint, gVar);
                Context context = this.f24099w0;
                dVar.b(context, cVar);
                D4.h hVar = (D4.h) iVar.f1332e.get();
                if (hVar != null) {
                    textPaint.drawableState = hVar.getState();
                }
                dVar.c(context, textPaint, gVar);
                iVar.f1331d = true;
            }
            D4.h hVar2 = (D4.h) iVar.f1332e.get();
            if (hVar2 != null) {
                d dVar2 = (d) hVar2;
                dVar2.s();
                dVar2.invalidateSelf();
                dVar2.onStateChange(hVar2.getState());
            }
        }
    }

    public final boolean O() {
        return this.f24087k0 && this.f24088l0 != null && this.f24065J0;
    }

    public final boolean P() {
        return this.f24061H && this.f24063I != null;
    }

    public final boolean Q() {
        return this.f24074P && this.f24077R != null;
    }

    @Override // I4.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i3;
        Canvas canvas2;
        int i10;
        float f10;
        int i11;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i3 = this.f24069L0) == 0) {
            return;
        }
        if (i3 < 255) {
            canvas2 = canvas;
            i10 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i3);
        } else {
            canvas2 = canvas;
            i10 = 0;
        }
        boolean z2 = this.W0;
        Paint paint = this.f24100x0;
        RectF rectF = this.f24103z0;
        if (!z2) {
            paint.setColor(this.f24054D0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, p(), p(), paint);
        }
        if (!this.W0) {
            paint.setColor(this.f24056E0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f24070M0;
            if (colorFilter == null) {
                colorFilter = this.f24071N0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, p(), p(), paint);
        }
        if (this.W0) {
            super.draw(canvas);
        }
        if (this.f24055E > 0.0f && !this.W0) {
            paint.setColor(this.f24060G0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.W0) {
                ColorFilter colorFilter2 = this.f24070M0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f24071N0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f11 = bounds.left;
            float f12 = this.f24055E / 2.0f;
            rectF.set(f11 + f12, bounds.top + f12, bounds.right - f12, bounds.bottom - f12);
            float f13 = this.f24051C - (this.f24055E / 2.0f);
            canvas2.drawRoundRect(rectF, f13, f13, paint);
        }
        paint.setColor(this.f24062H0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.W0) {
            RectF rectF2 = new RectF(bounds);
            Path path = this.f24050B0;
            I4.f fVar = this.f3151a;
            this.f3166s.e(fVar.f3135a, fVar.f3143i, rectF2, this.f3165r, path);
            I4.g.c(canvas2, paint, path, this.f3151a.f3135a, d());
        } else {
            canvas2.drawRoundRect(rectF, p(), p(), paint);
        }
        if (P()) {
            m(bounds, rectF);
            float f14 = rectF.left;
            float f15 = rectF.top;
            canvas2.translate(f14, f15);
            this.f24063I.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f24063I.draw(canvas2);
            canvas2.translate(-f14, -f15);
        }
        if (O()) {
            m(bounds, rectF);
            float f16 = rectF.left;
            float f17 = rectF.top;
            canvas2.translate(f16, f17);
            this.f24088l0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f24088l0.draw(canvas2);
            canvas2.translate(-f16, -f17);
        }
        if (this.f24082U0 && this.f24059G != null) {
            PointF pointF = this.f24048A0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f24059G;
            i iVar = this.f24052C0;
            if (charSequence != null) {
                float n10 = n() + this.f24091o0 + this.f24094r0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + n10;
                } else {
                    pointF.x = bounds.right - n10;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = iVar.f1328a;
                Paint.FontMetrics fontMetrics = this.f24101y0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f24059G != null) {
                float n11 = n() + this.f24091o0 + this.f24094r0;
                float o5 = o() + this.f24098v0 + this.f24095s0;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + n11;
                    rectF.right = bounds.right - o5;
                } else {
                    rectF.left = bounds.left + o5;
                    rectF.right = bounds.right - n11;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            F4.d dVar = iVar.f1333f;
            TextPaint textPaint2 = iVar.f1328a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                iVar.f1333f.c(this.f24099w0, textPaint2, iVar.f1329b);
            }
            textPaint2.setTextAlign(align);
            String charSequence2 = this.f24059G.toString();
            if (iVar.f1331d) {
                float measureText = charSequence2 != null ? textPaint2.measureText((CharSequence) charSequence2, 0, charSequence2.length()) : 0.0f;
                iVar.f1330c = measureText;
                iVar.f1331d = false;
                f10 = measureText;
            } else {
                f10 = iVar.f1330c;
            }
            boolean z10 = Math.round(f10) > Math.round(rectF.width());
            if (z10) {
                int save = canvas2.save();
                canvas2.clipRect(rectF);
                i11 = save;
            } else {
                i11 = 0;
            }
            CharSequence charSequence3 = this.f24059G;
            if (z10 && this.f24081T0 != null) {
                charSequence3 = TextUtils.ellipsize(charSequence3, textPaint2, rectF.width(), this.f24081T0);
            }
            canvas2.drawText(charSequence3, 0, charSequence3.length(), pointF.x, pointF.y, textPaint2);
            if (z10) {
                canvas2.restoreToCount(i11);
            }
        }
        if (Q()) {
            rectF.setEmpty();
            if (Q()) {
                float f18 = this.f24098v0 + this.f24097u0;
                if (getLayoutDirection() == 0) {
                    float f19 = bounds.right - f18;
                    rectF.right = f19;
                    rectF.left = f19 - this.f24085Y;
                } else {
                    float f20 = bounds.left + f18;
                    rectF.left = f20;
                    rectF.right = f20 + this.f24085Y;
                }
                float exactCenterY = bounds.exactCenterY();
                float f21 = this.f24085Y;
                float f22 = exactCenterY - (f21 / 2.0f);
                rectF.top = f22;
                rectF.bottom = f22 + f21;
            }
            float f23 = rectF.left;
            float f24 = rectF.top;
            canvas2.translate(f23, f24);
            this.f24077R.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f24080T.setBounds(this.f24077R.getBounds());
            this.f24080T.jumpToCurrentState();
            this.f24080T.draw(canvas2);
            canvas2.translate(-f23, -f24);
        }
        if (this.f24069L0 < 255) {
            canvas2.restoreToCount(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f24069L0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f24070M0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f24049B;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float measureText;
        float n10 = n() + this.f24091o0 + this.f24094r0;
        String charSequence = this.f24059G.toString();
        i iVar = this.f24052C0;
        if (iVar.f1331d) {
            measureText = charSequence == null ? 0.0f : iVar.f1328a.measureText((CharSequence) charSequence, 0, charSequence.length());
            iVar.f1330c = measureText;
            iVar.f1331d = false;
        } else {
            measureText = iVar.f1330c;
        }
        return Math.min(Math.round(o() + measureText + n10 + this.f24095s0 + this.f24098v0), this.f24083V0);
    }

    @Override // I4.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // I4.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.W0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f24049B, this.f24051C);
        } else {
            outline.setRoundRect(bounds, this.f24051C);
            outline2 = outline;
        }
        outline2.setAlpha(this.f24069L0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // I4.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (q(this.f24102z) || q(this.f24047A) || q(this.f24053D)) {
            return true;
        }
        F4.d dVar = this.f24052C0.f1333f;
        if (dVar == null || (colorStateList = dVar.f2222b) == null || !colorStateList.isStateful()) {
            return (this.f24087k0 && this.f24088l0 != null && this.h0) || r(this.f24063I) || r(this.f24088l0) || q(this.f24073O0);
        }
        return true;
    }

    public final void l(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f24077R) {
            if (drawable.isStateful()) {
                drawable.setState(this.f24076Q0);
            }
            drawable.setTintList(this.f24084X);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.f24063I;
        if (drawable == drawable2 && this.f24072O) {
            drawable2.setTintList(this.f24066K);
        }
    }

    public final void m(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (P() || O()) {
            float f10 = this.f24091o0 + this.f24092p0;
            if (getLayoutDirection() == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + this.f24068L;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - this.f24068L;
            }
            float exactCenterY = rect.exactCenterY();
            float f13 = this.f24068L;
            float f14 = exactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    public final float n() {
        if (P() || O()) {
            return this.f24092p0 + this.f24068L + this.f24093q0;
        }
        return 0.0f;
    }

    public final float o() {
        if (Q()) {
            return this.f24096t0 + this.f24085Y + this.f24097u0;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i3) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i3);
        if (P()) {
            onLayoutDirectionChanged |= this.f24063I.setLayoutDirection(i3);
        }
        if (O()) {
            onLayoutDirectionChanged |= this.f24088l0.setLayoutDirection(i3);
        }
        if (Q()) {
            onLayoutDirectionChanged |= this.f24077R.setLayoutDirection(i3);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i3) {
        boolean onLevelChange = super.onLevelChange(i3);
        if (P()) {
            onLevelChange |= this.f24063I.setLevel(i3);
        }
        if (O()) {
            onLevelChange |= this.f24088l0.setLevel(i3);
        }
        if (Q()) {
            onLevelChange |= this.f24077R.setLevel(i3);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // I4.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.W0) {
            super.onStateChange(iArr);
        }
        return t(iArr, this.f24076Q0);
    }

    public final float p() {
        return this.W0 ? this.f3151a.f3135a.f3187e.a(d()) : this.f24051C;
    }

    public final void s() {
        InterfaceC2009c interfaceC2009c = (InterfaceC2009c) this.f24079S0.get();
        if (interfaceC2009c != null) {
            Chip chip = (Chip) interfaceC2009c;
            chip.b(chip.f11881r);
            chip.d();
            chip.e();
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // I4.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        if (this.f24069L0 != i3) {
            this.f24069L0 = i3;
            invalidateSelf();
        }
    }

    @Override // I4.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f24070M0 != colorFilter) {
            this.f24070M0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // I4.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f24073O0 != colorStateList) {
            this.f24073O0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // I4.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f24075P0 != mode) {
            this.f24075P0 = mode;
            ColorStateList colorStateList = this.f24073O0;
            this.f24071N0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z10) {
        boolean visible = super.setVisible(z2, z10);
        if (P()) {
            visible |= this.f24063I.setVisible(z2, z10);
        }
        if (O()) {
            visible |= this.f24088l0.setVisible(z2, z10);
        }
        if (Q()) {
            visible |= this.f24077R.setVisible(z2, z10);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(int[] r12, int[] r13) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.d.t(int[], int[]):boolean");
    }

    public final void u(boolean z2) {
        if (this.h0 != z2) {
            this.h0 = z2;
            float n10 = n();
            if (!z2 && this.f24065J0) {
                this.f24065J0 = false;
            }
            float n11 = n();
            invalidateSelf();
            if (n10 != n11) {
                s();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v(Drawable drawable) {
        if (this.f24088l0 != drawable) {
            float n10 = n();
            this.f24088l0 = drawable;
            float n11 = n();
            R(this.f24088l0);
            l(this.f24088l0);
            invalidateSelf();
            if (n10 != n11) {
                s();
            }
        }
    }

    public final void w(boolean z2) {
        if (this.f24087k0 != z2) {
            boolean O7 = O();
            this.f24087k0 = z2;
            boolean O10 = O();
            if (O7 != O10) {
                if (O10) {
                    l(this.f24088l0);
                } else {
                    R(this.f24088l0);
                }
                invalidateSelf();
                s();
            }
        }
    }

    public final void x(float f10) {
        if (this.f24051C != f10) {
            this.f24051C = f10;
            setShapeAppearanceModel(this.f3151a.f3135a.f(f10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f24063I;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof G.b;
            drawable2 = drawable3;
            if (z2) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float n10 = n();
            this.f24063I = drawable != null ? drawable.mutate() : null;
            float n11 = n();
            R(drawable2);
            if (P()) {
                l(this.f24063I);
            }
            invalidateSelf();
            if (n10 != n11) {
                s();
            }
        }
    }

    public final void z(float f10) {
        if (this.f24068L != f10) {
            float n10 = n();
            this.f24068L = f10;
            float n11 = n();
            invalidateSelf();
            if (n10 != n11) {
                s();
            }
        }
    }
}
