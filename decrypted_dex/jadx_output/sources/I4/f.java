package I4;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f3135a;

    /* renamed from: b, reason: collision with root package name */
    public C4.a f3136b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f3137c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f3138d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f3139e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f3140f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f3141g;

    /* renamed from: h, reason: collision with root package name */
    public float f3142h;

    /* renamed from: i, reason: collision with root package name */
    public float f3143i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public int f3144k;

    /* renamed from: l, reason: collision with root package name */
    public float f3145l;

    /* renamed from: m, reason: collision with root package name */
    public float f3146m;

    /* renamed from: n, reason: collision with root package name */
    public int f3147n;

    /* renamed from: o, reason: collision with root package name */
    public int f3148o;

    /* renamed from: p, reason: collision with root package name */
    public Paint.Style f3149p;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f3154d = true;
        return gVar;
    }
}
