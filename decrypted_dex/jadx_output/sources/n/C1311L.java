package n;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: n.L, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1311L implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1313N f17424a;

    public C1311L(C1313N c1313n) {
        this.f17424a = c1313n;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j) {
        C1313N c1313n = this.f17424a;
        c1313n.f17439I.setSelection(i3);
        C1316Q c1316q = c1313n.f17439I;
        if (c1316q.getOnItemClickListener() != null) {
            c1316q.performItemClick(view, i3, c1313n.f17436F.getItemId(i3));
        }
        c1313n.dismiss();
    }
}
