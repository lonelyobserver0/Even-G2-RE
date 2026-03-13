package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class o implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f11946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f11947b;

    public o(q qVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f11947b = qVar;
        this.f11946a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f11946a;
        n a3 = materialCalendarGridView.a();
        if (i3 < a3.f11943a.e() || i3 > a3.b()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i3).longValue() >= ((i) this.f11947b.f11951d.f9105b).f11914q0.f11897d.f11900a) {
            throw null;
        }
    }
}
