package n;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: n.v0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1368v0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1299C0 f17622a;

    public C1368v0(AbstractC1299C0 abstractC1299C0) {
        this.f17622a = abstractC1299C0;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i3, long j) {
        C1358q0 c1358q0;
        if (i3 == -1 || (c1358q0 = this.f17622a.f17375c) == null) {
            return;
        }
        c1358q0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
