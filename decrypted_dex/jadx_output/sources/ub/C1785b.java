package ub;

import android.widget.Toast$Callback;

/* renamed from: ub.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1785b extends Toast$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1786c f21483a;

    public C1785b(C1786c c1786c) {
        this.f21483a = c1786c;
    }

    public final void onToastHidden() {
        super.onToastHidden();
        this.f21483a.f21485b = null;
    }
}
