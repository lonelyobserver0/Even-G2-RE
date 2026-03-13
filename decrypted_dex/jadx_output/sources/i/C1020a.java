package i;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: i.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1020a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1024e f14550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1021b f14551b;

    public C1020a(C1021b c1021b, C1024e c1024e) {
        this.f14551b = c1021b;
        this.f14550a = c1024e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j) {
        C1021b c1021b = this.f14551b;
        DialogInterface.OnClickListener onClickListener = c1021b.f14565o;
        C1024e c1024e = this.f14550a;
        onClickListener.onClick(c1024e.f14575b, i3);
        if (c1021b.f14566p) {
            return;
        }
        c1024e.f14575b.dismiss();
    }
}
