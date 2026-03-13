package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.J;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends J {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f11906a;

    public f(i iVar) {
        this.f11906a = iVar;
        hc.b.I(null);
        hc.b.I(null);
    }

    @Override // androidx.recyclerview.widget.J
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof u) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f11906a.getClass();
            throw null;
        }
    }
}
