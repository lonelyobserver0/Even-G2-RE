package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import l4.C1223z;
import r.AbstractC1539a;
import s.C1590a;
import s.C1591b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class CardView extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f9611f = {R.attr.colorBackground};

    /* renamed from: g, reason: collision with root package name */
    public static final C1223z f9612g = new C1223z(23);

    /* renamed from: a, reason: collision with root package name */
    public boolean f9613a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9614b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f9615c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f9616d;

    /* renamed from: e, reason: collision with root package name */
    public final C1590a f9617e;

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903180);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f9615c = rect;
        this.f9616d = new Rect();
        C1590a c1590a = new C1590a(this);
        this.f9617e = c1590a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1539a.f20136a, 2130903180, 2131820762);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f9611f);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(2131034160) : getResources().getColor(2131034159));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f9613a = obtainStyledAttributes.getBoolean(7, false);
        this.f9614b = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        C1223z c1223z = f9612g;
        C1591b c1591b = new C1591b(valueOf, dimension);
        c1590a.f20574a = c1591b;
        setBackgroundDrawable(c1591b);
        setClipToOutline(true);
        setElevation(dimension2);
        c1223z.g(c1590a, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C1591b) ((Drawable) this.f9617e.f20574a)).f20583h;
    }

    public float getCardElevation() {
        return ((CardView) this.f9617e.f20575b).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f9615c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f9615c.left;
    }

    public int getContentPaddingRight() {
        return this.f9615c.right;
    }

    public int getContentPaddingTop() {
        return this.f9615c.top;
    }

    public float getMaxCardElevation() {
        return ((C1591b) ((Drawable) this.f9617e.f20574a)).f20580e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f9614b;
    }

    public float getRadius() {
        return ((C1591b) ((Drawable) this.f9617e.f20574a)).f20576a;
    }

    public boolean getUseCompatPadding() {
        return this.f9613a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
    }

    public void setCardBackgroundColor(int i3) {
        ColorStateList valueOf = ColorStateList.valueOf(i3);
        C1591b c1591b = (C1591b) ((Drawable) this.f9617e.f20574a);
        if (valueOf == null) {
            c1591b.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        c1591b.f20583h = valueOf;
        c1591b.f20577b.setColor(valueOf.getColorForState(c1591b.getState(), c1591b.f20583h.getDefaultColor()));
        c1591b.invalidateSelf();
    }

    public void setCardElevation(float f10) {
        ((CardView) this.f9617e.f20575b).setElevation(f10);
    }

    public void setMaxCardElevation(float f10) {
        f9612g.g(this.f9617e, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i3) {
        super.setMinimumHeight(i3);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i3) {
        super.setMinimumWidth(i3);
    }

    @Override // android.view.View
    public final void setPadding(int i3, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i3, int i10, int i11, int i12) {
    }

    public void setPreventCornerOverlap(boolean z2) {
        if (z2 != this.f9614b) {
            this.f9614b = z2;
            C1223z c1223z = f9612g;
            C1590a c1590a = this.f9617e;
            c1223z.g(c1590a, ((C1591b) ((Drawable) c1590a.f20574a)).f20580e);
        }
    }

    public void setRadius(float f10) {
        C1591b c1591b = (C1591b) ((Drawable) this.f9617e.f20574a);
        if (f10 == c1591b.f20576a) {
            return;
        }
        c1591b.f20576a = f10;
        c1591b.b(null);
        c1591b.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z2) {
        if (this.f9613a != z2) {
            this.f9613a = z2;
            C1223z c1223z = f9612g;
            C1590a c1590a = this.f9617e;
            c1223z.g(c1590a, ((C1591b) ((Drawable) c1590a.f20574a)).f20580e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C1591b c1591b = (C1591b) ((Drawable) this.f9617e.f20574a);
        if (colorStateList == null) {
            c1591b.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c1591b.f20583h = colorStateList;
        c1591b.f20577b.setColor(colorStateList.getColorForState(c1591b.getState(), c1591b.f20583h.getDefaultColor()));
        c1591b.invalidateSelf();
    }
}
