package com.google.android.material.datepicker;

import N.C0176w;
import N.I;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.e0;
import java.util.WeakHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class p extends e0 {

    /* renamed from: t, reason: collision with root package name */
    public final TextView f11948t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialCalendarGridView f11949u;

    public p(LinearLayout linearLayout, boolean z2) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(2131230959);
        this.f11948t = textView;
        WeakHashMap weakHashMap = I.f4732a;
        new C0176w(2131231101, Boolean.class, 0, 28, 3).d(textView, Boolean.TRUE);
        this.f11949u = (MaterialCalendarGridView) linearLayout.findViewById(2131230954);
        if (z2) {
            return;
        }
        textView.setVisibility(8);
    }
}
