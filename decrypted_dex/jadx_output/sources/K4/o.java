package K4;

import N.I;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.gms.internal.measurement.F1;
import com.google.android.material.textfield.TextInputLayout;
import com.stub.StubApp;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import kotlin.jvm.internal.LongCompanionObject;
import s4.AbstractC1598a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class o extends p {

    /* renamed from: d, reason: collision with root package name */
    public final a f3672d;

    /* renamed from: e, reason: collision with root package name */
    public final i f3673e;

    /* renamed from: f, reason: collision with root package name */
    public final b f3674f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3675g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3676h;

    /* renamed from: i, reason: collision with root package name */
    public long f3677i;
    public StateListDrawable j;

    /* renamed from: k, reason: collision with root package name */
    public I4.g f3678k;

    /* renamed from: l, reason: collision with root package name */
    public AccessibilityManager f3679l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f3680m;

    /* renamed from: n, reason: collision with root package name */
    public ValueAnimator f3681n;

    public o(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f3672d = new a(this, 1);
        this.f3673e = new i(this, textInputLayout);
        this.f3674f = new b(this, 1);
        this.f3675g = false;
        this.f3676h = false;
        this.f3677i = LongCompanionObject.MAX_VALUE;
    }

    public static AutoCompleteTextView c(o oVar, EditText editText) {
        oVar.getClass();
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException(StubApp.getString2(3257));
    }

    public static void d(o oVar, AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            oVar.getClass();
            return;
        }
        oVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() - oVar.f3677i;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            oVar.f3675g = false;
        }
        if (oVar.f3675g) {
            oVar.f3675g = false;
            return;
        }
        oVar.f(!oVar.f3676h);
        if (!oVar.f3676h) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    @Override // K4.p
    public final void a() {
        Context context = this.f3683b;
        float dimensionPixelOffset = context.getResources().getDimensionPixelOffset(2131099977);
        float dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(2131099935);
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(2131099937);
        I4.g e10 = e(dimensionPixelOffset3, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2);
        I4.g e11 = e(dimensionPixelOffset3, 0.0f, dimensionPixelOffset, dimensionPixelOffset2);
        this.f3678k = e10;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.j = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, e10);
        int i3 = 0;
        this.j.addState(new int[0], e11);
        Drawable m4 = D1.m(context, 2131165573);
        TextInputLayout textInputLayout = this.f3682a;
        textInputLayout.setEndIconDrawable(m4);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(2131755114));
        textInputLayout.setEndIconOnClickListener(new c(this, 1));
        LinkedHashSet linkedHashSet = textInputLayout.h0;
        b bVar = this.f3674f;
        linkedHashSet.add(bVar);
        if (textInputLayout.f12005c != null) {
            bVar.a(textInputLayout);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = AbstractC1598a.f20746a;
        ofFloat.setInterpolator(linearInterpolator);
        ofFloat.setDuration(67);
        ofFloat.addUpdateListener(new n(this, i3));
        this.f3681n = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(linearInterpolator);
        ofFloat2.setDuration(50);
        ofFloat2.addUpdateListener(new n(this, i3));
        this.f3680m = ofFloat2;
        ofFloat2.addListener(new m(this, 0));
        WeakHashMap weakHashMap = I.f4732a;
        this.f3684c.setImportantForAccessibility(2);
        this.f3679l = (AccessibilityManager) context.getSystemService(StubApp.getString2(3258));
    }

    @Override // K4.p
    public final boolean b(int i3) {
        return i3 != 0;
    }

    public final I4.g e(int i3, float f10, float f11, float f12) {
        int i10 = 0;
        I4.i iVar = new I4.i();
        I4.i iVar2 = new I4.i();
        I4.i iVar3 = new I4.i();
        I4.i iVar4 = new I4.i();
        I4.e eVar = new I4.e(i10);
        I4.e eVar2 = new I4.e(i10);
        I4.e eVar3 = new I4.e(i10);
        I4.e eVar4 = new I4.e(i10);
        I4.a aVar = new I4.a(f10);
        I4.a aVar2 = new I4.a(f10);
        I4.a aVar3 = new I4.a(f11);
        I4.a aVar4 = new I4.a(f11);
        I4.k kVar = new I4.k();
        kVar.f3183a = iVar;
        kVar.f3184b = iVar2;
        kVar.f3185c = iVar3;
        kVar.f3186d = iVar4;
        kVar.f3187e = aVar;
        kVar.f3188f = aVar2;
        kVar.f3189g = aVar4;
        kVar.f3190h = aVar3;
        kVar.f3191i = eVar;
        kVar.j = eVar2;
        kVar.f3192k = eVar3;
        kVar.f3193l = eVar4;
        Paint paint = I4.g.f3150y;
        String simpleName = I4.g.class.getSimpleName();
        Context context = this.f3683b;
        int w10 = F1.w(context, 2130903249, simpleName);
        I4.g gVar = new I4.g();
        gVar.f(context);
        gVar.h(ColorStateList.valueOf(w10));
        gVar.g(f12);
        gVar.setShapeAppearanceModel(kVar);
        I4.f fVar = gVar.f3151a;
        if (fVar.f3141g == null) {
            fVar.f3141g = new Rect();
        }
        gVar.f3151a.f3141g.set(0, i3, 0, i3);
        gVar.f3169w = gVar.f3151a.f3141g;
        gVar.invalidateSelf();
        return gVar;
    }

    public final void f(boolean z2) {
        if (this.f3676h != z2) {
            this.f3676h = z2;
            this.f3681n.cancel();
            this.f3680m.start();
        }
    }
}
