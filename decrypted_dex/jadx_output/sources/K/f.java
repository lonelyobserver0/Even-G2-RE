package K;

import Z9.C;
import java.util.ArrayList;
import t.C1697j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f implements M.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3554a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3555b;

    public /* synthetic */ f(Object obj, int i3) {
        this.f3554a = i3;
        this.f3555b = obj;
    }

    @Override // M.a
    public final void accept(Object obj) {
        switch (this.f3554a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((C) this.f3555b).t(gVar);
                return;
            default:
                g gVar2 = (g) obj;
                synchronized (h.f3560c) {
                    try {
                        C1697j c1697j = h.f3561d;
                        ArrayList arrayList = (ArrayList) c1697j.get((String) this.f3555b);
                        if (arrayList == null) {
                            return;
                        }
                        c1697j.remove((String) this.f3555b);
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            ((M.a) arrayList.get(i3)).accept(gVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
