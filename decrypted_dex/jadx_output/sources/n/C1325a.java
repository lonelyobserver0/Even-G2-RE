package n;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1325a implements N.M {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17502a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f17503b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f17504c;

    public C1325a(ActionBarContextView actionBarContextView) {
        this.f17504c = actionBarContextView;
    }

    @Override // N.M
    public final void a() {
        this.f17502a = true;
    }

    @Override // N.M
    public final void b() {
        super/*android.view.View*/.setVisibility(0);
        this.f17502a = false;
    }

    @Override // N.M
    public final void c() {
        if (this.f17502a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f17504c;
        actionBarContextView.f9430f = null;
        super/*android.view.View*/.setVisibility(this.f17503b);
    }
}
