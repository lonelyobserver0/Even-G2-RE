package Fa;

import android.util.Log;
import com.stub.StubApp;
import java.io.IOException;
import oa.AbstractC1469b;
import oa.C1471d;
import oa.j;
import ta.InterfaceC1743c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class a implements InterfaceC1743c {

    /* renamed from: a, reason: collision with root package name */
    public final C1471d f2344a;

    public a(C1471d c1471d) {
        this.f2344a = c1471d;
        j jVar = j.f18621y3;
        AbstractC1469b J10 = c1471d.J(jVar);
        if (J10 == null) {
            c1471d.V(jVar, j.f18558l);
            return;
        }
        if (j.f18558l.equals(J10)) {
            return;
        }
        Log.w(StubApp.getString2(948), StubApp.getString2(2194) + J10 + StubApp.getString2(2195));
    }

    public static a a(C1471d c1471d) {
        if (c1471d == null) {
            throw new IOException(StubApp.getString2(2216) + c1471d);
        }
        j jVar = j.f18576o3;
        String Q10 = c1471d.Q(jVar);
        if (!StubApp.getString2(2196).equals(Q10) && !StubApp.getString2(2197).equals(Q10)) {
            if (!StubApp.getString2(2198).equals(Q10) && !StubApp.getString2(2199).equals(Q10)) {
                if (StubApp.getString2(2200).equals(Q10)) {
                    return new b(c1471d);
                }
                if (StubApp.getString2(2201).equals(Q10) || StubApp.getString2(2202).equals(Q10)) {
                    return new b(c1471d);
                }
                if (StubApp.getString2(2203).equals(Q10)) {
                    return new b(c1471d);
                }
                if (StubApp.getString2(2204).equals(Q10) || StubApp.getString2(2205).equals(Q10) || StubApp.getString2(2206).equals(Q10) || StubApp.getString2(2207).equals(Q10)) {
                    return new b(c1471d);
                }
                String string2 = StubApp.getString2(2208);
                if (string2.equals(Q10)) {
                    c cVar = new c(c1471d);
                    c1471d.X(jVar, string2);
                    return cVar;
                }
                if (StubApp.getString2(2209).equals(Q10) || StubApp.getString2(2210).equals(Q10) || StubApp.getString2(2211).equals(Q10) || StubApp.getString2(2212).equals(Q10) || StubApp.getString2(2213).equals(Q10) || StubApp.getString2(2214).equals(Q10)) {
                    return new c(c1471d);
                }
                d dVar = new d(c1471d);
                Log.d(StubApp.getString2(948), StubApp.getString2(2215) + Q10);
                return dVar;
            }
            return new c(c1471d);
        }
        return new b(c1471d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            return ((a) obj).f2344a.equals(this.f2344a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2344a.hashCode();
    }

    @Override // ta.InterfaceC1743c
    public final AbstractC1469b p() {
        return this.f2344a;
    }
}
