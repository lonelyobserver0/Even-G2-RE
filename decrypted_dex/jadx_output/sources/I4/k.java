package I4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.gms.internal.measurement.F1;
import r4.AbstractC1567a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public D1 f3183a = new i();

    /* renamed from: b, reason: collision with root package name */
    public D1 f3184b = new i();

    /* renamed from: c, reason: collision with root package name */
    public D1 f3185c = new i();

    /* renamed from: d, reason: collision with root package name */
    public D1 f3186d = new i();

    /* renamed from: e, reason: collision with root package name */
    public c f3187e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public c f3188f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public c f3189g = new a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public c f3190h = new a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    public e f3191i = new e(0);
    public e j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public e f3192k = new e(0);

    /* renamed from: l, reason: collision with root package name */
    public e f3193l = new e(0);

    public static j a(Context context, int i3, int i10, a aVar) {
        if (i10 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i3);
            i3 = i10;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i3, AbstractC1567a.f20337q);
        try {
            int i11 = obtainStyledAttributes.getInt(0, 0);
            int i12 = obtainStyledAttributes.getInt(3, i11);
            int i13 = obtainStyledAttributes.getInt(4, i11);
            int i14 = obtainStyledAttributes.getInt(2, i11);
            int i15 = obtainStyledAttributes.getInt(1, i11);
            c c10 = c(obtainStyledAttributes, 5, aVar);
            c c11 = c(obtainStyledAttributes, 8, c10);
            c c12 = c(obtainStyledAttributes, 9, c10);
            c c13 = c(obtainStyledAttributes, 7, c10);
            c c14 = c(obtainStyledAttributes, 6, c10);
            j jVar = new j();
            D1 j = F1.j(i12);
            jVar.f3172a = j;
            j.b(j);
            jVar.f3176e = c11;
            D1 j3 = F1.j(i13);
            jVar.f3173b = j3;
            j.b(j3);
            jVar.f3177f = c12;
            D1 j10 = F1.j(i14);
            jVar.f3174c = j10;
            j.b(j10);
            jVar.f3178g = c13;
            D1 j11 = F1.j(i15);
            jVar.f3175d = j11;
            j.b(j11);
            jVar.f3179h = c14;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i3, int i10) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1567a.f20333m, i3, i10);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i3, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i3);
        if (peekValue != null) {
            int i10 = peekValue.type;
            if (i10 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i10 == 6) {
                return new h(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z2 = this.f3193l.getClass().equals(e.class) && this.j.getClass().equals(e.class) && this.f3191i.getClass().equals(e.class) && this.f3192k.getClass().equals(e.class);
        float a3 = this.f3187e.a(rectF);
        return z2 && ((this.f3188f.a(rectF) > a3 ? 1 : (this.f3188f.a(rectF) == a3 ? 0 : -1)) == 0 && (this.f3190h.a(rectF) > a3 ? 1 : (this.f3190h.a(rectF) == a3 ? 0 : -1)) == 0 && (this.f3189g.a(rectF) > a3 ? 1 : (this.f3189g.a(rectF) == a3 ? 0 : -1)) == 0) && ((this.f3184b instanceof i) && (this.f3183a instanceof i) && (this.f3185c instanceof i) && (this.f3186d instanceof i));
    }

    public final j e() {
        j jVar = new j();
        jVar.f3172a = this.f3183a;
        jVar.f3173b = this.f3184b;
        jVar.f3174c = this.f3185c;
        jVar.f3175d = this.f3186d;
        jVar.f3176e = this.f3187e;
        jVar.f3177f = this.f3188f;
        jVar.f3178g = this.f3189g;
        jVar.f3179h = this.f3190h;
        jVar.f3180i = this.f3191i;
        jVar.j = this.j;
        jVar.f3181k = this.f3192k;
        jVar.f3182l = this.f3193l;
        return jVar;
    }

    public final k f(float f10) {
        j e10 = e();
        e10.f3176e = new a(f10);
        e10.f3177f = new a(f10);
        e10.f3178g = new a(f10);
        e10.f3179h = new a(f10);
        return e10.a();
    }
}
