package R3;

import java.util.ArrayList;
import java.util.Iterator;
import t.C1689b;
import t.C1692e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class F {

    /* renamed from: d, reason: collision with root package name */
    public int f6096d;

    /* renamed from: b, reason: collision with root package name */
    public final C1692e f6094b = new C1692e(0);

    /* renamed from: c, reason: collision with root package name */
    public final q4.k f6095c = new q4.k();

    /* renamed from: e, reason: collision with root package name */
    public boolean f6097e = false;

    /* renamed from: a, reason: collision with root package name */
    public final C1692e f6093a = new C1692e(0);

    public F(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f6093a.put(((Q3.l) it.next()).getApiKey(), null);
        }
        this.f6096d = ((C1689b) this.f6093a.keySet()).f21014a.f21040c;
    }

    public final void a(C0233b c0233b, com.google.android.gms.common.b bVar, String str) {
        C1692e c1692e = this.f6093a;
        c1692e.put(c0233b, bVar);
        C1692e c1692e2 = this.f6094b;
        c1692e2.put(c0233b, str);
        this.f6096d--;
        if (!bVar.d()) {
            this.f6097e = true;
        }
        if (this.f6096d == 0) {
            boolean z2 = this.f6097e;
            q4.k kVar = this.f6095c;
            if (z2) {
                kVar.a(new Q3.f(c1692e));
            } else {
                kVar.b(c1692e2);
            }
        }
    }
}
