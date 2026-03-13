package Y;

import android.util.SparseArray;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f8691a;

    /* renamed from: b, reason: collision with root package name */
    public u f8692b;

    public r(int i3) {
        this.f8691a = new SparseArray(i3);
    }

    public final void a(u uVar, int i3, int i10) {
        int a3 = uVar.a(i3);
        SparseArray sparseArray = this.f8691a;
        r rVar = sparseArray == null ? null : (r) sparseArray.get(a3);
        if (rVar == null) {
            rVar = new r(1);
            sparseArray.put(uVar.a(i3), rVar);
        }
        if (i10 > i3) {
            rVar.a(uVar, i3 + 1, i10);
        } else {
            rVar.f8692b = uVar;
        }
    }
}
