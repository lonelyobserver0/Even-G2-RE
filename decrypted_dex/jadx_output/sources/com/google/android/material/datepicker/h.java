package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.M;
import java.util.Calendar;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11910a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f11911b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f11912c;

    public /* synthetic */ h(i iVar, q qVar, int i3) {
        this.f11910a = i3;
        this.f11912c = iVar;
        this.f11911b = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f11910a) {
            case 0:
                i iVar = this.f11912c;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) iVar.f11919v0.getLayoutManager();
                View G02 = linearLayoutManager.G0(0, linearLayoutManager.v(), false);
                int C10 = (G02 == null ? -1 : M.C(G02)) + 1;
                if (C10 < iVar.f11919v0.getAdapter().a()) {
                    Calendar x7 = hc.b.x(this.f11911b.f11950c.f11894a.f11935a);
                    x7.add(2, C10);
                    iVar.M(new m(x7));
                    break;
                }
                break;
            default:
                i iVar2 = this.f11912c;
                int E02 = ((LinearLayoutManager) iVar2.f11919v0.getLayoutManager()).E0() - 1;
                if (E02 >= 0) {
                    Calendar x10 = hc.b.x(this.f11911b.f11950c.f11894a.f11935a);
                    x10.add(2, E02);
                    iVar2.M(new m(x10));
                    break;
                }
                break;
        }
    }
}
