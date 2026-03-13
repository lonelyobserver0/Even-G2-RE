package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import h.AbstractC0997a;
import m.AbstractC1260c;
import m.C1259b;
import m.k;
import m.l;
import m.n;
import m.y;
import n.InterfaceC1347l;
import n.a1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ActionMenuItemView extends AppCompatTextView implements y, View.OnClickListener, InterfaceC1347l {

    /* renamed from: a, reason: collision with root package name */
    public n f9389a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f9390b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f9391c;

    /* renamed from: d, reason: collision with root package name */
    public k f9392d;

    /* renamed from: e, reason: collision with root package name */
    public C1259b f9393e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC1260c f9394f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9395g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9396h;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public int f9397k;

    /* renamed from: l, reason: collision with root package name */
    public final int f9398l;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f9395g = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0997a.f14396c, 0, 0);
        this.j = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f9398l = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f9397k = -1;
        setSaveEnabled(false);
    }

    @Override // m.y
    public final void a(n nVar) {
        this.f9389a = nVar;
        setIcon(nVar.getIcon());
        setTitle(nVar.getTitleCondensed());
        setId(nVar.f16951a);
        setVisibility(nVar.isVisible() ? 0 : 8);
        setEnabled(nVar.isEnabled());
        if (nVar.hasSubMenu() && this.f9393e == null) {
            this.f9393e = new C1259b(this);
        }
    }

    @Override // n.InterfaceC1347l
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // n.InterfaceC1347l
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f9389a.getIcon() == null;
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (i3 < 480) {
            return (i3 >= 640 && i10 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void f() {
        boolean z2 = true;
        boolean z10 = !TextUtils.isEmpty(this.f9390b);
        if (this.f9391c != null && ((this.f9389a.f16974y & 4) != 4 || (!this.f9395g && !this.f9396h))) {
            z2 = false;
        }
        boolean z11 = z10 & z2;
        setText(z11 ? this.f9390b : null);
        CharSequence charSequence = this.f9389a.f16966q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z11 ? null : this.f9389a.f16955e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f9389a.f16967r;
        if (TextUtils.isEmpty(charSequence2)) {
            a1.a(this, z11 ? null : this.f9389a.f16955e);
        } else {
            a1.a(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // m.y
    public n getItemData() {
        return this.f9389a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k kVar = this.f9392d;
        if (kVar != null) {
            kVar.c(this.f9389a);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f9395g = e();
        f();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i11 = this.f9397k) >= 0) {
            super.setPadding(i11, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i3, i10);
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int measuredWidth = getMeasuredWidth();
        int i12 = this.j;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i12) : i12;
        if (mode != 1073741824 && i12 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i10);
        }
        if (!isEmpty || this.f9391c == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f9391c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1259b c1259b;
        if (this.f9389a.hasSubMenu() && (c1259b = this.f9393e) != null && c1259b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f9396h != z2) {
            this.f9396h = z2;
            n nVar = this.f9389a;
            if (nVar != null) {
                l lVar = nVar.f16963n;
                lVar.f16931k = true;
                lVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f9391c = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i3 = this.f9398l;
            if (intrinsicWidth > i3) {
                intrinsicHeight = (int) (intrinsicHeight * (i3 / intrinsicWidth));
                intrinsicWidth = i3;
            }
            if (intrinsicHeight > i3) {
                intrinsicWidth = (int) (intrinsicWidth * (i3 / intrinsicHeight));
            } else {
                i3 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i3);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(k kVar) {
        this.f9392d = kVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i3, int i10, int i11, int i12) {
        this.f9397k = i3;
        super.setPadding(i3, i10, i11, i12);
    }

    public void setPopupCallback(AbstractC1260c abstractC1260c) {
        this.f9394f = abstractC1260c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f9390b = charSequence;
        f();
    }
}
