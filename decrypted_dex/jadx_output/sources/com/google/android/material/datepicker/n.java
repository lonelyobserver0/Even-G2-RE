package com.google.android.material.datepicker;

import N.I;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.icu.text.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.stub.StubApp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.WeakHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class n extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f11942d = hc.b.I(null).getMaximum(4);

    /* renamed from: a, reason: collision with root package name */
    public final m f11943a;

    /* renamed from: b, reason: collision with root package name */
    public a5.c f11944b;

    /* renamed from: c, reason: collision with root package name */
    public final b f11945c;

    public n(m mVar, b bVar) {
        this.f11943a = mVar;
        this.f11945c = bVar;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i3) {
        m mVar = this.f11943a;
        if (i3 < mVar.e() || i3 > b()) {
            return null;
        }
        int e10 = (i3 - mVar.e()) + 1;
        Calendar x7 = hc.b.x(mVar.f11935a);
        x7.set(5, e10);
        return Long.valueOf(x7.getTimeInMillis());
    }

    public final int b() {
        m mVar = this.f11943a;
        return (mVar.e() + mVar.f11940f) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        m mVar = this.f11943a;
        return mVar.e() + mVar.f11940f;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        return i3 / this.f11943a.f11939e;
    }

    @Override // android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f11944b == null) {
            this.f11944b = new a5.c(context, 3);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(2131427403, viewGroup, false);
        }
        m mVar = this.f11943a;
        int e10 = i3 - mVar.e();
        if (e10 < 0 || e10 >= mVar.f11940f) {
            textView.setVisibility(8);
            textView.setEnabled(false);
        } else {
            int i10 = e10 + 1;
            textView.setTag(mVar);
            textView.setText(String.valueOf(i10));
            Calendar x7 = hc.b.x(mVar.f11935a);
            x7.set(5, i10);
            long timeInMillis = x7.getTimeInMillis();
            Calendar x10 = hc.b.x(Calendar.getInstance());
            x10.set(5, 1);
            Calendar x11 = hc.b.x(x10);
            x11.get(2);
            int i11 = x11.get(1);
            x11.getMaximum(7);
            x11.getActualMaximum(5);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StubApp.getString2(12499), Locale.getDefault());
            String string2 = StubApp.getString2(8779);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(string2));
            simpleDateFormat.format(x11.getTime());
            x11.getTimeInMillis();
            if (mVar.f11938d == i11) {
                DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(StubApp.getString2(12517), Locale.getDefault());
                instanceForSkeleton.setTimeZone(android.icu.util.TimeZone.getTimeZone(string2));
                textView.setContentDescription(instanceForSkeleton.format(new Date(timeInMillis)));
            } else {
                DateFormat instanceForSkeleton2 = DateFormat.getInstanceForSkeleton(StubApp.getString2(12518), Locale.getDefault());
                instanceForSkeleton2.setTimeZone(android.icu.util.TimeZone.getTimeZone(string2));
                textView.setContentDescription(instanceForSkeleton2.format(new Date(timeInMillis)));
            }
            textView.setVisibility(0);
            textView.setEnabled(true);
        }
        Long item = getItem(i3);
        if (item == null) {
            return textView;
        }
        if (item.longValue() >= this.f11945c.f11897d.f11900a) {
            textView.setEnabled(true);
            throw null;
        }
        textView.setEnabled(false);
        O0.u uVar = (O0.u) this.f11944b.f9284d;
        uVar.getClass();
        I4.g gVar = new I4.g();
        I4.g gVar2 = new I4.g();
        I4.k kVar = (I4.k) uVar.f5186f;
        gVar.setShapeAppearanceModel(kVar);
        gVar2.setShapeAppearanceModel(kVar);
        gVar.h((ColorStateList) uVar.f5184d);
        gVar.f3151a.j = uVar.f5181a;
        gVar.invalidateSelf();
        I4.f fVar = gVar.f3151a;
        ColorStateList colorStateList = fVar.f3138d;
        ColorStateList colorStateList2 = (ColorStateList) uVar.f5185e;
        if (colorStateList != colorStateList2) {
            fVar.f3138d = colorStateList2;
            gVar.onStateChange(gVar.getState());
        }
        ColorStateList colorStateList3 = (ColorStateList) uVar.f5183c;
        textView.setTextColor(colorStateList3);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList3.withAlpha(30), gVar, gVar2);
        Rect rect = (Rect) uVar.f5182b;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap weakHashMap = I.f4732a;
        textView.setBackground(insetDrawable);
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
