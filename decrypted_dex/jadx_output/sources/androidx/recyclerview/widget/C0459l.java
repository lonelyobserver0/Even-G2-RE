package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.l, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0459l extends S {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0461n f10208a;

    public C0459l(C0461n c0461n) {
        this.f10208a = c0461n;
    }

    @Override // androidx.recyclerview.widget.S
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0461n c0461n = this.f10208a;
        int computeVerticalScrollRange = c0461n.f10244s.computeVerticalScrollRange();
        int i11 = c0461n.f10243r;
        int i12 = computeVerticalScrollRange - i11;
        int i13 = c0461n.f10227a;
        c0461n.f10245t = i12 > 0 && i11 >= i13;
        int computeHorizontalScrollRange = c0461n.f10244s.computeHorizontalScrollRange();
        int i14 = c0461n.f10242q;
        boolean z2 = computeHorizontalScrollRange - i14 > 0 && i14 >= i13;
        c0461n.f10246u = z2;
        boolean z10 = c0461n.f10245t;
        if (!z10 && !z2) {
            if (c0461n.f10247v != 0) {
                c0461n.f(0);
                return;
            }
            return;
        }
        if (z10) {
            float f10 = i11;
            c0461n.f10237l = (int) ((((f10 / 2.0f) + computeVerticalScrollOffset) * f10) / computeVerticalScrollRange);
            c0461n.f10236k = Math.min(i11, (i11 * i11) / computeVerticalScrollRange);
        }
        if (c0461n.f10246u) {
            float f11 = computeHorizontalScrollOffset;
            float f12 = i14;
            c0461n.f10240o = (int) ((((f12 / 2.0f) + f11) * f12) / computeHorizontalScrollRange);
            c0461n.f10239n = Math.min(i14, (i14 * i14) / computeHorizontalScrollRange);
        }
        int i15 = c0461n.f10247v;
        if (i15 == 0 || i15 == 1) {
            c0461n.f(1);
        }
    }
}
