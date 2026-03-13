package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.M;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.S;
import com.google.android.material.button.MaterialButton;
import com.stub.StubApp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g extends S {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f11907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f11908b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f11909c;

    public g(i iVar, q qVar, MaterialButton materialButton) {
        this.f11909c = iVar;
        this.f11907a = qVar;
        this.f11908b = materialButton;
    }

    @Override // androidx.recyclerview.widget.S
    public final void a(RecyclerView recyclerView, int i3) {
        if (i3 == 0) {
            recyclerView.announceForAccessibility(this.f11908b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.S
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        int E02;
        i iVar = this.f11909c;
        if (i3 < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) iVar.f11919v0.getLayoutManager();
            View G02 = linearLayoutManager.G0(0, linearLayoutManager.v(), false);
            E02 = G02 == null ? -1 : M.C(G02);
        } else {
            E02 = ((LinearLayoutManager) iVar.f11919v0.getLayoutManager()).E0();
        }
        b bVar = this.f11907a.f11950c;
        Calendar x7 = hc.b.x(bVar.f11894a.f11935a);
        x7.add(2, E02);
        iVar.f11915r0 = new m(x7);
        Calendar x10 = hc.b.x(bVar.f11894a.f11935a);
        x10.add(2, E02);
        x10.set(5, 1);
        Calendar x11 = hc.b.x(x10);
        x11.get(2);
        x11.get(1);
        x11.getMaximum(7);
        x11.getActualMaximum(5);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StubApp.getString2(12499), Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(StubApp.getString2(8779)));
        String format = simpleDateFormat.format(x11.getTime());
        x11.getTimeInMillis();
        this.f11908b.setText(format);
    }
}
