package com.google.android.material.datepicker;

import N.B;
import N.I;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.gms.internal.measurement.F1;
import com.google.android.material.internal.CheckableImageButton;
import com.stub.StubApp;
import d0.DialogInterfaceOnCancelListenerC0786p;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.TimeZone;
import java.util.WeakHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j<S> extends DialogInterfaceOnCancelListenerC0786p {

    /* renamed from: C0, reason: collision with root package name */
    public final LinkedHashSet f11922C0;

    /* renamed from: D0, reason: collision with root package name */
    public final LinkedHashSet f11923D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f11924E0;

    /* renamed from: F0, reason: collision with root package name */
    public r f11925F0;

    /* renamed from: G0, reason: collision with root package name */
    public b f11926G0;

    /* renamed from: H0, reason: collision with root package name */
    public i f11927H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f11928I0;

    /* renamed from: J0, reason: collision with root package name */
    public CharSequence f11929J0;

    /* renamed from: K0, reason: collision with root package name */
    public boolean f11930K0;

    /* renamed from: L0, reason: collision with root package name */
    public CheckableImageButton f11931L0;

    /* renamed from: M0, reason: collision with root package name */
    public I4.g f11932M0;

    public j() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f11922C0 = new LinkedHashSet();
        this.f11923D0 = new LinkedHashSet();
    }

    public static int N(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(2131099889);
        Calendar x7 = hc.b.x(Calendar.getInstance());
        x7.set(5, 1);
        Calendar x10 = hc.b.x(x7);
        x10.get(2);
        x10.get(1);
        int maximum = x10.getMaximum(7);
        x10.getActualMaximum(5);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StubApp.getString2(12499), Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(StubApp.getString2(8779)));
        simpleDateFormat.format(x10.getTime());
        x10.getTimeInMillis();
        return E1.a.f(maximum, 1, resources.getDimensionPixelOffset(2131099909), (resources.getDimensionPixelSize(2131099895) * maximum) + (dimensionPixelOffset * 2));
    }

    public static boolean O(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(F1.w(context, 2130903709, i.class.getCanonicalName()), new int[]{R.attr.windowFullscreen});
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z2;
    }

    @Override // d0.DialogInterfaceOnCancelListenerC0786p, d0.AbstractComponentCallbacksC0789t
    public final void D(Bundle bundle) {
        super.D(bundle);
        bundle.putInt(StubApp.getString2(12509), this.f11924E0);
        bundle.putParcelable(StubApp.getString2(12510), null);
        b bVar = this.f11926G0;
        a aVar = new a();
        int i3 = a.f11892b;
        int i10 = a.f11892b;
        long j = bVar.f11894a.f11941g;
        long j3 = bVar.f11895b.f11941g;
        aVar.f11893a = Long.valueOf(bVar.f11896c.f11941g);
        m mVar = this.f11927H0.f11915r0;
        if (mVar != null) {
            aVar.f11893a = Long.valueOf(mVar.f11941g);
        }
        if (aVar.f11893a == null) {
            Calendar x7 = hc.b.x(Calendar.getInstance());
            x7.set(5, 1);
            Calendar x10 = hc.b.x(x7);
            x10.get(2);
            x10.get(1);
            x10.getMaximum(7);
            x10.getActualMaximum(5);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StubApp.getString2(12499), Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(StubApp.getString2(8779)));
            simpleDateFormat.format(x10.getTime());
            long timeInMillis = x10.getTimeInMillis();
            if (j > timeInMillis || timeInMillis > j3) {
                timeInMillis = j;
            }
            aVar.f11893a = Long.valueOf(timeInMillis);
        }
        Bundle bundle2 = new Bundle();
        String string2 = StubApp.getString2(12511);
        bundle2.putParcelable(string2, bVar.f11897d);
        Calendar I10 = hc.b.I(null);
        I10.setTimeInMillis(j);
        m mVar2 = new m(I10);
        Calendar I11 = hc.b.I(null);
        I11.setTimeInMillis(j3);
        m mVar3 = new m(I11);
        long longValue = aVar.f11893a.longValue();
        Calendar I12 = hc.b.I(null);
        I12.setTimeInMillis(longValue);
        bundle.putParcelable(StubApp.getString2(12502), new b(mVar2, mVar3, new m(I12), (c) bundle2.getParcelable(string2)));
        bundle.putInt(StubApp.getString2(12512), this.f11928I0);
        bundle.putCharSequence(StubApp.getString2(12513), this.f11929J0);
    }

    @Override // d0.DialogInterfaceOnCancelListenerC0786p, d0.AbstractComponentCallbacksC0789t
    public final void E() {
        super.E();
        Dialog dialog = this.f13330x0;
        String string2 = StubApp.getString2(12514);
        String string22 = StubApp.getString2(47);
        if (dialog == null) {
            throw new IllegalStateException(string22 + this + string2);
        }
        Window window = dialog.getWindow();
        if (this.f11930K0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f11932M0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = I().getResources().getDimensionPixelOffset(2131099897);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f11932M0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f13330x0;
            if (dialog2 == null) {
                throw new IllegalStateException(string22 + this + string2);
            }
            decorView.setOnTouchListener(new B4.a(dialog2, rect));
        }
        P();
        throw null;
    }

    @Override // d0.DialogInterfaceOnCancelListenerC0786p, d0.AbstractComponentCallbacksC0789t
    public final void F() {
        this.f11925F0.f11953o0.clear();
        super.F();
    }

    @Override // d0.DialogInterfaceOnCancelListenerC0786p
    public final Dialog M() {
        Context I10 = I();
        I();
        int i3 = this.f11924E0;
        if (i3 == 0) {
            throw null;
        }
        Dialog dialog = new Dialog(I10, i3);
        Context context = dialog.getContext();
        this.f11930K0 = O(context);
        int w10 = F1.w(context, 2130903249, j.class.getCanonicalName());
        I4.g gVar = new I4.g(context, null, 2130903709, 2131821258);
        this.f11932M0 = gVar;
        gVar.f(context);
        this.f11932M0.h(ColorStateList.valueOf(w10));
        I4.g gVar2 = this.f11932M0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = I.f4732a;
        gVar2.g(B.e(decorView));
        return dialog;
    }

    public final void P() {
        I();
        int i3 = this.f11924E0;
        if (i3 == 0) {
            throw null;
        }
        b bVar = this.f11926G0;
        i iVar = new i();
        Bundle bundle = new Bundle();
        bundle.putInt(StubApp.getString2(12500), i3);
        bundle.putParcelable(StubApp.getString2(12501), null);
        String string2 = StubApp.getString2(12502);
        bundle.putParcelable(string2, bVar);
        bundle.putParcelable(StubApp.getString2(12503), bVar.f11896c);
        iVar.L(bundle);
        this.f11927H0 = iVar;
        r rVar = iVar;
        if (this.f11931L0.f11958d) {
            b bVar2 = this.f11926G0;
            r kVar = new k();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(StubApp.getString2(12510), null);
            bundle2.putParcelable(string2, bVar2);
            kVar.L(bundle2);
            rVar = kVar;
        }
        this.f11925F0 = rVar;
        throw null;
    }

    public final void Q(CheckableImageButton checkableImageButton) {
        this.f11931L0.setContentDescription(this.f11931L0.f11958d ? checkableImageButton.getContext().getString(2131755212) : checkableImageButton.getContext().getString(2131755214));
    }

    @Override // d0.DialogInterfaceOnCancelListenerC0786p, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f11922C0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // d0.DialogInterfaceOnCancelListenerC0786p, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f11923D0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f13354I;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // d0.DialogInterfaceOnCancelListenerC0786p, d0.AbstractComponentCallbacksC0789t
    public final void w(Bundle bundle) {
        super.w(bundle);
        if (bundle == null) {
            bundle = this.f13369f;
        }
        this.f11924E0 = bundle.getInt(StubApp.getString2(12509));
        if (bundle.getParcelable(StubApp.getString2(12510)) != null) {
            throw new ClassCastException();
        }
        this.f11926G0 = (b) bundle.getParcelable(StubApp.getString2(12502));
        this.f11928I0 = bundle.getInt(StubApp.getString2(12512));
        this.f11929J0 = bundle.getCharSequence(StubApp.getString2(12513));
    }

    @Override // d0.AbstractComponentCallbacksC0789t
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.f11930K0 ? 2131427417 : 2131427416, viewGroup);
        Context context = inflate.getContext();
        if (this.f11930K0) {
            inflate.findViewById(2131230962).setLayoutParams(new LinearLayout.LayoutParams(N(context), -2));
        } else {
            View findViewById = inflate.findViewById(2131230963);
            View findViewById2 = inflate.findViewById(2131230962);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(N(context), -1));
            Resources resources = I().getResources();
            int dimensionPixelOffset = resources.getDimensionPixelOffset(2131099911) + resources.getDimensionPixelOffset(2131099913) + resources.getDimensionPixelSize(2131099912);
            int dimensionPixelSize = resources.getDimensionPixelSize(2131099896);
            int i3 = n.f11942d;
            findViewById2.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(2131099910) * (i3 - 1)) + (resources.getDimensionPixelSize(2131099891) * i3) + resources.getDimensionPixelOffset(2131099888));
        }
        TextView textView = (TextView) inflate.findViewById(2131230973);
        WeakHashMap weakHashMap = I.f4732a;
        textView.setAccessibilityLiveRegion(1);
        this.f11931L0 = (CheckableImageButton) inflate.findViewById(2131230975);
        TextView textView2 = (TextView) inflate.findViewById(2131230979);
        CharSequence charSequence = this.f11929J0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f11928I0);
        }
        this.f11931L0.setTag(StubApp.getString2(12515));
        CheckableImageButton checkableImageButton = this.f11931L0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, D1.m(context, 2131165317));
        stateListDrawable.addState(new int[0], D1.m(context, 2131165325));
        checkableImageButton.setImageDrawable(stateListDrawable);
        I.i(this.f11931L0, null);
        Q(this.f11931L0);
        this.f11931L0.setOnClickListener(new K4.c(this, 4));
        throw null;
    }
}
