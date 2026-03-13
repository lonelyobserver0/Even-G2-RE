package com.google.android.material.datepicker;

import Z9.C0366a;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.C;
import androidx.recyclerview.widget.N;
import androidx.recyclerview.widget.e0;
import com.stub.StubApp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class q extends C {

    /* renamed from: c, reason: collision with root package name */
    public final b f11950c;

    /* renamed from: d, reason: collision with root package name */
    public final C0366a f11951d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11952e;

    public q(ContextThemeWrapper contextThemeWrapper, b bVar, C0366a c0366a) {
        Calendar calendar = bVar.f11894a.f11935a;
        m mVar = bVar.f11896c;
        if (calendar.compareTo(mVar.f11935a) > 0) {
            throw new IllegalArgumentException(StubApp.getString2(12521));
        }
        if (mVar.f11935a.compareTo(bVar.f11895b.f11935a) > 0) {
            throw new IllegalArgumentException(StubApp.getString2(12520));
        }
        this.f11952e = (contextThemeWrapper.getResources().getDimensionPixelSize(2131099891) * n.f11942d) + (j.O(contextThemeWrapper) ? contextThemeWrapper.getResources().getDimensionPixelSize(2131099891) : 0);
        this.f11950c = bVar;
        this.f11951d = c0366a;
        if (this.f9999a.a()) {
            throw new IllegalStateException(StubApp.getString2(12519));
        }
        this.f10000b = true;
    }

    @Override // androidx.recyclerview.widget.C
    public final int a() {
        return this.f11950c.f11899f;
    }

    @Override // androidx.recyclerview.widget.C
    public final long b(int i3) {
        Calendar x7 = hc.b.x(this.f11950c.f11894a.f11935a);
        x7.add(2, i3);
        x7.set(5, 1);
        Calendar x10 = hc.b.x(x7);
        x10.get(2);
        x10.get(1);
        x10.getMaximum(7);
        x10.getActualMaximum(5);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StubApp.getString2(12499), Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(StubApp.getString2(8779)));
        simpleDateFormat.format(x10.getTime());
        x10.getTimeInMillis();
        return x10.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.C
    public final void c(e0 e0Var, int i3) {
        p pVar = (p) e0Var;
        b bVar = this.f11950c;
        Calendar x7 = hc.b.x(bVar.f11894a.f11935a);
        x7.add(2, i3);
        m mVar = new m(x7);
        pVar.f11948t.setText(mVar.f11936b);
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) pVar.f11949u.findViewById(2131230954);
        if (materialCalendarGridView.a() == null || !mVar.equals(materialCalendarGridView.a().f11943a)) {
            n nVar = new n(mVar, bVar);
            materialCalendarGridView.setNumColumns(mVar.f11939e);
            materialCalendarGridView.setAdapter((ListAdapter) nVar);
        } else {
            materialCalendarGridView.a().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new o(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.C
    public final e0 d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(2131427408, viewGroup, false);
        if (!j.O(viewGroup.getContext())) {
            return new p(linearLayout, false);
        }
        linearLayout.setLayoutParams(new N(-1, this.f11952e));
        return new p(linearLayout, true);
    }
}
