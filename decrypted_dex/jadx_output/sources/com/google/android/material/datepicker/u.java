package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.C;
import androidx.recyclerview.widget.e0;
import com.stub.StubApp;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class u extends C {

    /* renamed from: c, reason: collision with root package name */
    public final i f11955c;

    public u(i iVar) {
        this.f11955c = iVar;
    }

    @Override // androidx.recyclerview.widget.C
    public final int a() {
        return this.f11955c.f11914q0.f11898e;
    }

    @Override // androidx.recyclerview.widget.C
    public final void c(e0 e0Var, int i3) {
        i iVar = this.f11955c;
        int i10 = iVar.f11914q0.f11894a.f11938d + i3;
        TextView textView = ((t) e0Var).f11954t;
        String string = textView.getContext().getString(2131755198);
        textView.setText(String.format(Locale.getDefault(), StubApp.getString2(12522), Integer.valueOf(i10)));
        textView.setContentDescription(String.format(string, Integer.valueOf(i10)));
        a5.c cVar = iVar.f11917t0;
        if (hc.b.x(Calendar.getInstance()).get(1) == i10) {
            Object obj = cVar.f9283c;
        } else {
            Object obj2 = cVar.f9282b;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.C
    public final e0 d(ViewGroup viewGroup) {
        return new t((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(2131427412, viewGroup, false));
    }
}
