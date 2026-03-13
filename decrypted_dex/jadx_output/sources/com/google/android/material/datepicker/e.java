package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ int f11904E;

    /* renamed from: F, reason: collision with root package name */
    public final /* synthetic */ i f11905F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, int i3, int i10) {
        super(i3);
        this.f11905F = iVar;
        this.f11904E = i10;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.M
    public final void r0(RecyclerView recyclerView, int i3) {
        s sVar = new s(recyclerView.getContext());
        sVar.f10320a = i3;
        s0(sVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void u0(b0 b0Var, int[] iArr) {
        int i3 = this.f11904E;
        i iVar = this.f11905F;
        if (i3 == 0) {
            iArr[0] = iVar.f11919v0.getWidth();
            iArr[1] = iVar.f11919v0.getWidth();
        } else {
            iArr[0] = iVar.f11919v0.getHeight();
            iArr[1] = iVar.f11919v0.getHeight();
        }
    }
}
