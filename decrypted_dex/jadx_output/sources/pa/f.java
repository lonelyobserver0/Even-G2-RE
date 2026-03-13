package pa;

import android.util.Log;
import com.stub.StubApp;
import java.io.InputStream;
import java.io.OutputStream;
import oa.AbstractC1469b;
import oa.C1468a;
import oa.C1471d;
import oa.p;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class f {
    public static C1471d c(p pVar, int i3) {
        AbstractC1469b K10 = pVar.K(oa.j.f18528c1, oa.j.f18532d1);
        AbstractC1469b K11 = pVar.K(oa.j.f18494R0, oa.j.f18434D0);
        if ((K10 instanceof oa.j) && (K11 instanceof C1471d)) {
            return (C1471d) K11;
        }
        boolean z2 = K10 instanceof C1468a;
        if (z2 && (K11 instanceof C1468a)) {
            C1468a c1468a = (C1468a) K11;
            if (i3 < c1468a.f18393a.size()) {
                AbstractC1469b G4 = c1468a.G(i3);
                if (G4 instanceof C1471d) {
                    return (C1471d) G4;
                }
            }
        } else if (K11 != null && !z2 && !(K11 instanceof C1468a)) {
            Log.e(StubApp.getString2(948), StubApp.getString2(22147).concat(K11.getClass().getName()));
        }
        return new C1471d();
    }

    public abstract e a(InputStream inputStream, OutputStream outputStream, p pVar, int i3);

    public e b(InputStream inputStream, OutputStream outputStream, p pVar, int i3) {
        return a(inputStream, outputStream, pVar, i3);
    }
}
