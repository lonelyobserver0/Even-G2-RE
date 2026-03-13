package wa;

import android.util.Log;
import com.stub.StubApp;
import f4.C0879c;
import f4.C0882f;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.Iterator;
import s.C1590a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final C1590a f22198a;

    static {
        C0879c c0879c = h.f22201e;
        String string2 = StubApp.getString2(948);
        C1590a c1590a = new C1590a();
        c1590a.f20574a = new ArrayList();
        c1590a.f20575b = c0879c;
        try {
            c1590a.d(new File(StubApp.getString2("23871")));
            c1590a.d(new File(StubApp.getString2("23872")));
            c1590a.d(new File(StubApp.getString2("23873")));
        } catch (IOException e10) {
            e10.printStackTrace();
            try {
                C0882f c0882f = new C0882f(2, false);
                c0882f.f13748b = null;
                ArrayList h2 = c0882f.h();
                ArrayList arrayList = new ArrayList(h2.size());
                Iterator it = h2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new File((URI) it.next()));
                }
                if (!arrayList.isEmpty()) {
                    ArrayList l9 = c1590a.l(arrayList);
                    if (l9 == null || l9.isEmpty()) {
                        Log.w(string2, StubApp.getString2("23874"));
                        c1590a.q(arrayList);
                        c1590a.o();
                        Log.w(string2, StubApp.getString2("23875") + ((ArrayList) c1590a.f20574a).size() + StubApp.getString2("23876"));
                    } else {
                        ((ArrayList) c1590a.f20574a).addAll(l9);
                    }
                }
            } catch (AccessControlException e11) {
                Log.e(string2, StubApp.getString2(23877), e11);
            }
        }
        f22198a = c1590a;
    }
}
