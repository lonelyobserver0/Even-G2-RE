package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import h.AbstractC0997a;
import n.C1327b;
import n.M0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9417a;

    /* renamed from: b, reason: collision with root package name */
    public View f9418b;

    /* renamed from: c, reason: collision with root package name */
    public View f9419c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f9420d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f9421e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f9422f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f9423g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9424h;
    public final int j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C1327b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0997a.f14394a);
        boolean z2 = false;
        this.f9420d = obtainStyledAttributes.getDrawable(0);
        this.f9421e = obtainStyledAttributes.getDrawable(2);
        this.j = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == 2131231076) {
            this.f9423g = true;
            this.f9422f = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f9423g ? !(this.f9420d != null || this.f9421e != null) : this.f9422f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f9420d;
        if (drawable != null && drawable.isStateful()) {
            this.f9420d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f9421e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f9421e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f9422f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f9422f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f9420d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f9421e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f9422f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f9418b = findViewById(2131230764);
        this.f9419c = findViewById(2131230772);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f9417a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i10, int i11, int i12) {
        super.onLayout(z2, i3, i10, i11, i12);
        boolean z10 = true;
        if (this.f9423g) {
            Drawable drawable = this.f9422f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z10 = false;
            }
        } else {
            if (this.f9420d == null) {
                z10 = false;
            } else if (this.f9418b.getVisibility() == 0) {
                this.f9420d.setBounds(this.f9418b.getLeft(), this.f9418b.getTop(), this.f9418b.getRight(), this.f9418b.getBottom());
            } else {
                View view = this.f9419c;
                if (view == null || view.getVisibility() != 0) {
                    this.f9420d.setBounds(0, 0, 0, 0);
                } else {
                    this.f9420d.setBounds(this.f9419c.getLeft(), this.f9419c.getTop(), this.f9419c.getRight(), this.f9419c.getBottom());
                }
            }
            this.f9424h = false;
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        if (this.f9418b == null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && (i11 = this.j) >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i10)), Integer.MIN_VALUE);
        }
        super.onMeasure(i3, i10);
        if (this.f9418b == null) {
            return;
        }
        View.MeasureSpec.getMode(i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f9420d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f9420d);
        }
        this.f9420d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f9418b;
            if (view != null) {
                this.f9420d.setBounds(view.getLeft(), this.f9418b.getTop(), this.f9418b.getRight(), this.f9418b.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f9423g ? !(this.f9420d != null || this.f9421e != null) : this.f9422f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f9422f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f9422f);
        }
        this.f9422f = drawable;
        boolean z2 = this.f9423g;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f9422f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.f9420d != null || this.f9421e != null) : this.f9422f == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f9421e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f9421e);
        }
        this.f9421e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f9424h && this.f9421e != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.f9423g ? !(this.f9420d != null || this.f9421e != null) : this.f9422f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(M0 m02) {
    }

    public void setTransitioning(boolean z2) {
        this.f9417a = z2;
        setDescendantFocusability(z2 ? 393216 : PKIFailureInfo.transactionIdInUse);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        boolean z2 = i3 == 0;
        Drawable drawable = this.f9420d;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f9421e;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f9422f;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f9420d;
        boolean z2 = this.f9423g;
        if (drawable == drawable2 && !z2) {
            return true;
        }
        if (drawable == this.f9421e && this.f9424h) {
            return true;
        }
        return (drawable == this.f9422f && z2) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i3) {
        if (i3 != 0) {
            return super.startActionModeForChild(view, callback, i3);
        }
        return null;
    }
}
