package T1;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class w extends o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f7155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f7156b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f7157c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f7158d;

    public w(j jVar, ViewGroup viewGroup, View view, View view2) {
        this.f7158d = jVar;
        this.f7155a = viewGroup;
        this.f7156b = view;
        this.f7157c = view2;
    }

    @Override // T1.o, T1.m
    public final void a() {
        this.f7155a.getOverlay().remove(this.f7156b);
    }

    @Override // T1.m
    public final void d(n nVar) {
        this.f7157c.setTag(2131231033, null);
        this.f7155a.getOverlay().remove(this.f7156b);
        nVar.v(this);
    }

    @Override // T1.o, T1.m
    public final void e() {
        View view = this.f7156b;
        if (view.getParent() == null) {
            this.f7155a.getOverlay().add(view);
        } else {
            this.f7158d.c();
        }
    }
}
