package x4;

import Ec.l;
import I4.f;
import I4.g;
import I4.k;
import I4.t;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;

/* renamed from: x4.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1909b {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f22849a;

    /* renamed from: b, reason: collision with root package name */
    public k f22850b;

    /* renamed from: c, reason: collision with root package name */
    public int f22851c;

    /* renamed from: d, reason: collision with root package name */
    public int f22852d;

    /* renamed from: e, reason: collision with root package name */
    public int f22853e;

    /* renamed from: f, reason: collision with root package name */
    public int f22854f;

    /* renamed from: g, reason: collision with root package name */
    public int f22855g;

    /* renamed from: h, reason: collision with root package name */
    public int f22856h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f22857i;
    public ColorStateList j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f22858k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f22859l;

    /* renamed from: m, reason: collision with root package name */
    public g f22860m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f22861n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f22862o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f22863p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f22864q;

    /* renamed from: r, reason: collision with root package name */
    public RippleDrawable f22865r;

    public C1909b(MaterialButton materialButton, k kVar) {
        this.f22849a = materialButton;
        this.f22850b = kVar;
    }

    public final t a() {
        RippleDrawable rippleDrawable = this.f22865r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f22865r.getNumberOfLayers() > 2 ? (t) this.f22865r.getDrawable(2) : (t) this.f22865r.getDrawable(1);
    }

    public final g b(boolean z2) {
        RippleDrawable rippleDrawable = this.f22865r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f22865r.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f22850b = kVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(kVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(kVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(kVar);
        }
    }

    public final void d() {
        g b2 = b(false);
        g b10 = b(true);
        if (b2 != null) {
            float f10 = this.f22856h;
            ColorStateList colorStateList = this.f22858k;
            b2.f3151a.j = f10;
            b2.invalidateSelf();
            f fVar = b2.f3151a;
            if (fVar.f3138d != colorStateList) {
                fVar.f3138d = colorStateList;
                b2.onStateChange(b2.getState());
            }
            if (b10 != null) {
                float f11 = this.f22856h;
                int m4 = this.f22861n ? l.m(this.f22849a, 2130903249) : 0;
                b10.f3151a.j = f11;
                b10.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(m4);
                f fVar2 = b10.f3151a;
                if (fVar2.f3138d != valueOf) {
                    fVar2.f3138d = valueOf;
                    b10.onStateChange(b10.getState());
                }
            }
        }
    }
}
