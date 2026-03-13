package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f11901a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11902b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11903c;

    public d() {
        Calendar I10 = hc.b.I(null);
        this.f11901a = I10;
        this.f11902b = I10.getMaximum(7);
        this.f11903c = I10.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f11902b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i3) {
        int i10 = this.f11902b;
        if (i3 >= i10) {
            return null;
        }
        int i11 = i3 + this.f11903c;
        if (i11 > i10) {
            i11 -= i10;
        }
        return Integer.valueOf(i11);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(2131427404, viewGroup, false);
        }
        int i10 = i3 + this.f11903c;
        int i11 = this.f11902b;
        if (i10 > i11) {
            i10 -= i11;
        }
        Calendar calendar = this.f11901a;
        calendar.set(7, i10);
        textView.setText(calendar.getDisplayName(7, 4, Locale.getDefault()));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(2131755193), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
