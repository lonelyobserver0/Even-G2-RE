package n;

/* renamed from: n.y0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RunnableC1374y0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC1299C0 f17634b;

    public /* synthetic */ RunnableC1374y0(AbstractC1299C0 abstractC1299C0, int i3) {
        this.f17633a = i3;
        this.f17634b = abstractC1299C0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17633a) {
            case 0:
                C1358q0 c1358q0 = this.f17634b.f17375c;
                if (c1358q0 != null) {
                    c1358q0.setListSelectionHidden(true);
                    c1358q0.requestLayout();
                    break;
                }
                break;
            default:
                AbstractC1299C0 abstractC1299C0 = this.f17634b;
                C1358q0 c1358q02 = abstractC1299C0.f17375c;
                if (c1358q02 != null && c1358q02.isAttachedToWindow() && abstractC1299C0.f17375c.getCount() > abstractC1299C0.f17375c.getChildCount() && abstractC1299C0.f17375c.getChildCount() <= abstractC1299C0.f17384n) {
                    abstractC1299C0.f17372B.setInputMethodMode(2);
                    abstractC1299C0.show();
                    break;
                }
                break;
        }
    }
}
