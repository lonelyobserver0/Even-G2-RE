package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import h.AbstractC0997a;
import java.lang.ref.WeakReference;
import n.c1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f9605a;

    /* renamed from: b, reason: collision with root package name */
    public int f9606b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f9607c;

    /* renamed from: d, reason: collision with root package name */
    public LayoutInflater f9608d;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f9605a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0997a.f14393A, 0, 0);
        this.f9606b = obtainStyledAttributes.getResourceId(2, -1);
        this.f9605a = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f9605a == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f9608d;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f9605a, viewGroup, false);
        int i3 = this.f9606b;
        if (i3 != -1) {
            inflate.setId(i3);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.f9607c = new WeakReference(inflate);
        return inflate;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f9606b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f9608d;
    }

    public int getLayoutResource() {
        return this.f9605a;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i3) {
        this.f9606b = i3;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f9608d = layoutInflater;
    }

    public void setLayoutResource(int i3) {
        this.f9605a = i3;
    }

    public void setOnInflateListener(c1 c1Var) {
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        WeakReference weakReference = this.f9607c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i3);
            return;
        }
        super.setVisibility(i3);
        if (i3 == 0 || i3 == 4) {
            a();
        }
    }
}
