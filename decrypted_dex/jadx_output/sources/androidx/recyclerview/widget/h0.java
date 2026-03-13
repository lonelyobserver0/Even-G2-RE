package androidx.recyclerview.widget;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h0 extends S {

    /* renamed from: a, reason: collision with root package name */
    public boolean f10178a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0471y f10179b;

    public h0(C0471y c0471y) {
        this.f10179b = c0471y;
    }

    @Override // androidx.recyclerview.widget.S
    public final void a(RecyclerView recyclerView, int i3) {
        if (i3 == 0 && this.f10178a) {
            this.f10178a = false;
            this.f10179b.f();
        }
    }

    @Override // androidx.recyclerview.widget.S
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        if (i3 == 0 && i10 == 0) {
            return;
        }
        this.f10178a = true;
    }
}
