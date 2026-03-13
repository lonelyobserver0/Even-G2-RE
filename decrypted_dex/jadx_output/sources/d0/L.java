package d0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class L implements J {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M f13141a;

    public L(M m4) {
        this.f13141a = m4;
    }

    @Override // d0.J
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        M m4 = this.f13141a;
        C0771a c0771a = (C0771a) i2.u.j(1, m4.f13161d);
        m4.f13165h = c0771a;
        Iterator it = c0771a.f13240a.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = ((V) it.next()).f13220b;
            if (abstractComponentCallbacksC0789t != null) {
                abstractComponentCallbacksC0789t.f13378n = true;
            }
        }
        boolean S5 = m4.S(arrayList, arrayList2, -1, 0);
        if (!m4.f13170n.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(M.E((C0771a) it2.next()));
            }
            Iterator it3 = m4.f13170n.iterator();
            while (it3.hasNext()) {
                if (it3.next() != null) {
                    throw new ClassCastException();
                }
                Iterator it4 = linkedHashSet.iterator();
                if (it4.hasNext()) {
                    throw null;
                }
            }
        }
        return S5;
    }
}
