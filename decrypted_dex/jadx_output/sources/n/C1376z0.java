package n;

import android.database.DataSetObserver;

/* renamed from: n.z0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1376z0 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1299C0 f17639a;

    public C1376z0(AbstractC1299C0 abstractC1299C0) {
        this.f17639a = abstractC1299C0;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        AbstractC1299C0 abstractC1299C0 = this.f17639a;
        if (abstractC1299C0.f17372B.isShowing()) {
            abstractC1299C0.show();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f17639a.dismiss();
    }
}
