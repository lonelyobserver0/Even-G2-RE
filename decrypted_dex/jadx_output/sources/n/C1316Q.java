package n;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import com.google.android.gms.internal.measurement.D1;
import m.ViewTreeObserverOnGlobalLayoutListenerC1261d;

/* renamed from: n.Q, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1316Q extends Spinner {
    public static final int[] j = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final C1355p f17449a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f17450b;

    /* renamed from: c, reason: collision with root package name */
    public final C1307H f17451c;

    /* renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f17452d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17453e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1315P f17454f;

    /* renamed from: g, reason: collision with root package name */
    public int f17455g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f17456h;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1316Q(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            r0 = 2130903836(0x7f03031c, float:1.7414501E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.f17456h = r1
            android.content.Context r1 = r12.getContext()
            n.O0.a(r12, r1)
            int[] r1 = h.AbstractC0997a.f14413u
            a5.c r2 = a5.c.E(r13, r14, r1, r0)
            n.p r3 = new n.p
            r3.<init>(r12)
            r12.f17449a = r3
            java.lang.Object r3 = r2.f9283c
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L35
            l.c r6 = new l.c
            r6.<init>(r13, r4)
            r12.f17450b = r6
            goto L37
        L35:
            r12.f17450b = r13
        L37:
            r4 = -1
            r6 = 0
            int[] r7 = n.C1316Q.j     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            boolean r8 = r7.hasValue(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            if (r8 == 0) goto L50
            int r4 = r7.getInt(r5, r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            goto L50
        L4a:
            r13 = move-exception
            r6 = r7
            goto Ldd
        L4e:
            r8 = move-exception
            goto L59
        L50:
            r7.recycle()
            goto L6b
        L54:
            r13 = move-exception
            goto Ldd
        L57:
            r8 = move-exception
            r7 = r6
        L59:
            java.lang.String r9 = "21230"
            java.lang.String r9 = com.stub.StubApp.getString2(r9)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r10 = "21241"
            java.lang.String r10 = com.stub.StubApp.getString2(r10)     // Catch: java.lang.Throwable -> L4a
            android.util.Log.i(r9, r10, r8)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L6b
            goto L50
        L6b:
            r7 = 2
            r8 = 1
            if (r4 == 0) goto La5
            if (r4 == r8) goto L72
            goto Lb2
        L72:
            n.N r4 = new n.N
            android.content.Context r9 = r12.f17450b
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.f17450b
            a5.c r1 = a5.c.E(r9, r14, r1, r0)
            r9 = 3
            r10 = -2
            java.lang.Object r11 = r1.f9283c
            android.content.res.TypedArray r11 = (android.content.res.TypedArray) r11
            int r9 = r11.getLayoutDimension(r9, r10)
            r12.f17455g = r9
            android.graphics.drawable.Drawable r9 = r1.r(r8)
            r4.i(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.f17435E = r7
            r1.I()
            r12.f17454f = r4
            n.H r1 = new n.H
            r1.<init>(r12, r12, r4)
            r12.f17451c = r1
            goto Lb2
        La5:
            n.J r1 = new n.J
            r1.<init>(r12)
            r12.f17454f = r1
            java.lang.String r4 = r3.getString(r7)
            r1.f17412c = r4
        Lb2:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto Lc9
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131427459(0x7f0b0083, float:1.8476535E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter(r3)
        Lc9:
            r2.I()
            r12.f17453e = r8
            android.widget.SpinnerAdapter r13 = r12.f17452d
            if (r13 == 0) goto Ld7
            r12.setAdapter(r13)
            r12.f17452d = r6
        Ld7:
            n.p r13 = r12.f17449a
            r13.d(r14, r0)
            return
        Ldd:
            if (r6 == 0) goto Le2
            r6.recycle()
        Le2:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C1316Q.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i3 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i10 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i10 = Math.max(i10, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i10;
        }
        Rect rect = this.f17456h;
        drawable.getPadding(rect);
        return rect.left + rect.right + i10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1355p c1355p = this.f17449a;
        if (c1355p != null) {
            c1355p.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC1315P interfaceC1315P = this.f17454f;
        return interfaceC1315P != null ? interfaceC1315P.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC1315P interfaceC1315P = this.f17454f;
        return interfaceC1315P != null ? interfaceC1315P.m() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f17454f != null ? this.f17455g : super.getDropDownWidth();
    }

    public final InterfaceC1315P getInternalPopup() {
        return this.f17454f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC1315P interfaceC1315P = this.f17454f;
        return interfaceC1315P != null ? interfaceC1315P.f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f17450b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC1315P interfaceC1315P = this.f17454f;
        return interfaceC1315P != null ? interfaceC1315P.d() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1355p c1355p = this.f17449a;
        if (c1355p != null) {
            return c1355p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1355p c1355p = this.f17449a;
        if (c1355p != null) {
            return c1355p.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1315P interfaceC1315P = this.f17454f;
        if (interfaceC1315P == null || !interfaceC1315P.a()) {
            return;
        }
        interfaceC1315P.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        if (this.f17454f == null || View.MeasureSpec.getMode(i3) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i3)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C1314O c1314o = (C1314O) parcelable;
        super.onRestoreInstanceState(c1314o.getSuperState());
        if (!c1314o.f17440a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1261d(this, 2));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1314O c1314o = new C1314O(super.onSaveInstanceState());
        InterfaceC1315P interfaceC1315P = this.f17454f;
        c1314o.f17440a = interfaceC1315P != null && interfaceC1315P.a();
        return c1314o;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1307H c1307h = this.f17451c;
        if (c1307h == null || !c1307h.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC1315P interfaceC1315P = this.f17454f;
        if (interfaceC1315P == null) {
            return super.performClick();
        }
        if (interfaceC1315P.a()) {
            return true;
        }
        this.f17454f.l(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1355p c1355p = this.f17449a;
        if (c1355p != null) {
            c1355p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C1355p c1355p = this.f17449a;
        if (c1355p != null) {
            c1355p.f(i3);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i3) {
        InterfaceC1315P interfaceC1315P = this.f17454f;
        if (interfaceC1315P == null) {
            super.setDropDownHorizontalOffset(i3);
        } else {
            interfaceC1315P.k(i3);
            interfaceC1315P.c(i3);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i3) {
        InterfaceC1315P interfaceC1315P = this.f17454f;
        if (interfaceC1315P != null) {
            interfaceC1315P.j(i3);
        } else {
            super.setDropDownVerticalOffset(i3);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i3) {
        if (this.f17454f != null) {
            this.f17455g = i3;
        } else {
            super.setDropDownWidth(i3);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC1315P interfaceC1315P = this.f17454f;
        if (interfaceC1315P != null) {
            interfaceC1315P.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i3) {
        setPopupBackgroundDrawable(D1.m(getPopupContext(), i3));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC1315P interfaceC1315P = this.f17454f;
        if (interfaceC1315P != null) {
            interfaceC1315P.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1355p c1355p = this.f17449a;
        if (c1355p != null) {
            c1355p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1355p c1355p = this.f17449a;
        if (c1355p != null) {
            c1355p.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f17453e) {
            this.f17452d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC1315P interfaceC1315P = this.f17454f;
        if (interfaceC1315P != null) {
            Context context = this.f17450b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C1310K c1310k = new C1310K();
            c1310k.f17422a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c1310k.f17423b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC1308I.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC1315P.n(c1310k);
        }
    }
}
