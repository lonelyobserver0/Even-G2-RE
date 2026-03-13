package D4;

import N.I;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import s4.AbstractC1598a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: A, reason: collision with root package name */
    public float f1278A;

    /* renamed from: B, reason: collision with root package name */
    public float f1279B;

    /* renamed from: C, reason: collision with root package name */
    public int[] f1280C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1281D;

    /* renamed from: E, reason: collision with root package name */
    public final TextPaint f1282E;

    /* renamed from: F, reason: collision with root package name */
    public final TextPaint f1283F;

    /* renamed from: G, reason: collision with root package name */
    public LinearInterpolator f1284G;

    /* renamed from: H, reason: collision with root package name */
    public LinearInterpolator f1285H;

    /* renamed from: I, reason: collision with root package name */
    public float f1286I;

    /* renamed from: J, reason: collision with root package name */
    public float f1287J;

    /* renamed from: K, reason: collision with root package name */
    public float f1288K;

    /* renamed from: L, reason: collision with root package name */
    public ColorStateList f1289L;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f1290a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1291b;

    /* renamed from: c, reason: collision with root package name */
    public float f1292c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f1293d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f1294e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f1295f;

    /* renamed from: g, reason: collision with root package name */
    public int f1296g = 16;

    /* renamed from: h, reason: collision with root package name */
    public int f1297h = 16;

    /* renamed from: i, reason: collision with root package name */
    public float f1298i = 15.0f;
    public float j = 15.0f;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f1299k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f1300l;

    /* renamed from: m, reason: collision with root package name */
    public float f1301m;

    /* renamed from: n, reason: collision with root package name */
    public float f1302n;

    /* renamed from: o, reason: collision with root package name */
    public float f1303o;

    /* renamed from: p, reason: collision with root package name */
    public float f1304p;

    /* renamed from: q, reason: collision with root package name */
    public float f1305q;

    /* renamed from: r, reason: collision with root package name */
    public float f1306r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f1307s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f1308t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f1309u;

    /* renamed from: v, reason: collision with root package name */
    public F4.a f1310v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f1311w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f1312x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1313y;

    /* renamed from: z, reason: collision with root package name */
    public Bitmap f1314z;

    public c(TextInputLayout textInputLayout) {
        this.f1290a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f1282E = textPaint;
        this.f1283F = new TextPaint(textPaint);
        this.f1294e = new Rect();
        this.f1293d = new Rect();
        this.f1295f = new RectF();
    }

    public static int a(float f10, int i3, int i10) {
        float f11 = 1.0f - f10;
        return Color.argb((int) ((Color.alpha(i10) * f10) + (Color.alpha(i3) * f11)), (int) ((Color.red(i10) * f10) + (Color.red(i3) * f11)), (int) ((Color.green(i10) * f10) + (Color.green(i3) * f11)), (int) ((Color.blue(i10) * f10) + (Color.blue(i3) * f11)));
    }

    public static float d(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        LinearInterpolator linearInterpolator = AbstractC1598a.f20746a;
        return E1.a.c(f11, f10, f12, f10);
    }

    public final void b(float f10) {
        boolean z2;
        float f11;
        boolean z10;
        if (this.f1311w == null) {
            return;
        }
        float width = this.f1294e.width();
        float width2 = this.f1293d.width();
        if (Math.abs(f10 - this.j) < 0.001f) {
            f11 = this.j;
            this.f1278A = 1.0f;
            Typeface typeface = this.f1309u;
            Typeface typeface2 = this.f1307s;
            if (typeface != typeface2) {
                this.f1309u = typeface2;
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            float f12 = this.f1298i;
            Typeface typeface3 = this.f1309u;
            Typeface typeface4 = this.f1308t;
            if (typeface3 != typeface4) {
                this.f1309u = typeface4;
                z2 = true;
            } else {
                z2 = false;
            }
            if (Math.abs(f10 - f12) < 0.001f) {
                this.f1278A = 1.0f;
            } else {
                this.f1278A = f10 / this.f1298i;
            }
            float f13 = this.j / this.f1298i;
            width = width2 * f13 > width ? Math.min(width / f13, width2) : width2;
            f11 = f12;
            z10 = z2;
        }
        if (width > 0.0f) {
            z10 = this.f1279B != f11 || this.f1281D || z10;
            this.f1279B = f11;
            this.f1281D = false;
        }
        if (this.f1312x == null || z10) {
            TextPaint textPaint = this.f1282E;
            textPaint.setTextSize(this.f1279B);
            textPaint.setTypeface(this.f1309u);
            textPaint.setLinearText(this.f1278A != 1.0f);
            CharSequence ellipsize = TextUtils.ellipsize(this.f1311w, textPaint, width, TextUtils.TruncateAt.END);
            if (TextUtils.equals(ellipsize, this.f1312x)) {
                return;
            }
            this.f1312x = ellipsize;
            WeakHashMap weakHashMap = I.f4732a;
            this.f1313y = (this.f1290a.getLayoutDirection() == 1 ? L.f.f3880d : L.f.f3879c).l(ellipsize, ellipsize.length());
        }
    }

    public final int c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f1280C;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void e() {
        boolean z2;
        Rect rect = this.f1294e;
        if (rect.width() > 0 && rect.height() > 0) {
            Rect rect2 = this.f1293d;
            if (rect2.width() > 0 && rect2.height() > 0) {
                z2 = true;
                this.f1291b = z2;
            }
        }
        z2 = false;
        this.f1291b = z2;
    }

    public final void f() {
        TextInputLayout textInputLayout = this.f1290a;
        if (textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) {
            return;
        }
        float f10 = this.f1279B;
        b(this.j);
        CharSequence charSequence = this.f1312x;
        TextPaint textPaint = this.f1282E;
        float measureText = charSequence != null ? textPaint.measureText(charSequence, 0, charSequence.length()) : 0.0f;
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f1297h, this.f1313y ? 1 : 0);
        int i3 = absoluteGravity & 112;
        Rect rect = this.f1294e;
        if (i3 == 48) {
            this.f1302n = rect.top - textPaint.ascent();
        } else if (i3 != 80) {
            this.f1302n = rect.centerY() + (((textPaint.descent() - textPaint.ascent()) / 2.0f) - textPaint.descent());
        } else {
            this.f1302n = rect.bottom;
        }
        int i10 = absoluteGravity & 8388615;
        if (i10 == 1) {
            this.f1304p = rect.centerX() - (measureText / 2.0f);
        } else if (i10 != 5) {
            this.f1304p = rect.left;
        } else {
            this.f1304p = rect.right - measureText;
        }
        b(this.f1298i);
        CharSequence charSequence2 = this.f1312x;
        float measureText2 = charSequence2 != null ? textPaint.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f1296g, this.f1313y ? 1 : 0);
        int i11 = absoluteGravity2 & 112;
        Rect rect2 = this.f1293d;
        if (i11 == 48) {
            this.f1301m = rect2.top - textPaint.ascent();
        } else if (i11 != 80) {
            this.f1301m = rect2.centerY() + (((textPaint.descent() - textPaint.ascent()) / 2.0f) - textPaint.descent());
        } else {
            this.f1301m = rect2.bottom;
        }
        int i12 = absoluteGravity2 & 8388615;
        if (i12 == 1) {
            this.f1303o = rect2.centerX() - (measureText2 / 2.0f);
        } else if (i12 != 5) {
            this.f1303o = rect2.left;
        } else {
            this.f1303o = rect2.right - measureText2;
        }
        Bitmap bitmap = this.f1314z;
        if (bitmap != null) {
            bitmap.recycle();
            this.f1314z = null;
        }
        i(f10);
        float f11 = this.f1292c;
        RectF rectF = this.f1295f;
        rectF.left = d(rect2.left, rect.left, f11, this.f1284G);
        rectF.top = d(this.f1301m, this.f1302n, f11, this.f1284G);
        rectF.right = d(rect2.right, rect.right, f11, this.f1284G);
        rectF.bottom = d(rect2.bottom, rect.bottom, f11, this.f1284G);
        this.f1305q = d(this.f1303o, this.f1304p, f11, this.f1284G);
        this.f1306r = d(this.f1301m, this.f1302n, f11, this.f1284G);
        i(d(this.f1298i, this.j, f11, this.f1285H));
        ColorStateList colorStateList = this.f1300l;
        ColorStateList colorStateList2 = this.f1299k;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f11, c(colorStateList2), c(this.f1300l)));
        } else {
            textPaint.setColor(c(colorStateList));
        }
        textPaint.setShadowLayer(E1.a.c(this.f1286I, 0.0f, f11, 0.0f), E1.a.c(this.f1287J, 0.0f, f11, 0.0f), E1.a.c(this.f1288K, 0.0f, f11, 0.0f), a(f11, 0, c(this.f1289L)));
        WeakHashMap weakHashMap = I.f4732a;
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void g(ColorStateList colorStateList) {
        if (this.f1300l != colorStateList) {
            this.f1300l = colorStateList;
            f();
        }
    }

    public final void h(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f10 != this.f1292c) {
            this.f1292c = f10;
            RectF rectF = this.f1295f;
            float f11 = this.f1293d.left;
            Rect rect = this.f1294e;
            rectF.left = d(f11, rect.left, f10, this.f1284G);
            rectF.top = d(this.f1301m, this.f1302n, f10, this.f1284G);
            rectF.right = d(r2.right, rect.right, f10, this.f1284G);
            rectF.bottom = d(r2.bottom, rect.bottom, f10, this.f1284G);
            this.f1305q = d(this.f1303o, this.f1304p, f10, this.f1284G);
            this.f1306r = d(this.f1301m, this.f1302n, f10, this.f1284G);
            i(d(this.f1298i, this.j, f10, this.f1285H));
            ColorStateList colorStateList = this.f1300l;
            ColorStateList colorStateList2 = this.f1299k;
            TextPaint textPaint = this.f1282E;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f10, c(colorStateList2), c(this.f1300l)));
            } else {
                textPaint.setColor(c(colorStateList));
            }
            textPaint.setShadowLayer(E1.a.c(this.f1286I, 0.0f, f10, 0.0f), E1.a.c(this.f1287J, 0.0f, f10, 0.0f), E1.a.c(this.f1288K, 0.0f, f10, 0.0f), a(f10, 0, c(this.f1289L)));
            WeakHashMap weakHashMap = I.f4732a;
            this.f1290a.postInvalidateOnAnimation();
        }
    }

    public final void i(float f10) {
        b(f10);
        WeakHashMap weakHashMap = I.f4732a;
        this.f1290a.postInvalidateOnAnimation();
    }
}
