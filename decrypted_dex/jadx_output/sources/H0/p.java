package H0;

import M4.C0148t;
import M4.C0150v;
import M4.Z;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.stub.StubApp;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final M4.J f2613a;

    static {
        new p(new F5.c(7));
    }

    public p(F5.c cVar) {
        M4.J j;
        C0150v c0150v = (C0150v) ((A0.c) cVar.f2238b).f29a;
        if (c0150v == null) {
            j = M4.B.f4536e;
        } else {
            Collection entrySet = c0150v.entrySet();
            if (((AbstractCollection) entrySet).isEmpty()) {
                j = M4.B.f4536e;
            } else {
                C0148t c0148t = (C0148t) entrySet;
                Bc.i iVar = new Bc.i(c0148t.f4652b.size(), 5);
                Iterator it = c0148t.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Z g10 = ((M4.F) entry.getValue()).g();
                    iVar.o(key, g10);
                    i3 += g10.f4580d;
                }
                j = new M4.J(iVar.h(), i3);
            }
        }
        this.f2613a = j;
    }

    public static String a(String str) {
        String string2 = StubApp.getString2(395);
        if (AbstractC0624h2.i(str, string2)) {
            return string2;
        }
        String string22 = StubApp.getString2(2406);
        if (AbstractC0624h2.i(str, string22)) {
            return string22;
        }
        String string23 = StubApp.getString2(2407);
        if (AbstractC0624h2.i(str, string23)) {
            return string23;
        }
        String string24 = StubApp.getString2(2408);
        if (AbstractC0624h2.i(str, string24)) {
            return string24;
        }
        String string25 = StubApp.getString2(2409);
        if (AbstractC0624h2.i(str, string25)) {
            return string25;
        }
        String string26 = StubApp.getString2(2410);
        if (AbstractC0624h2.i(str, string26)) {
            return string26;
        }
        String string27 = StubApp.getString2(2411);
        if (AbstractC0624h2.i(str, string27)) {
            return string27;
        }
        String string28 = StubApp.getString2(2412);
        if (AbstractC0624h2.i(str, string28)) {
            return string28;
        }
        String string29 = StubApp.getString2(2413);
        if (AbstractC0624h2.i(str, string29)) {
            return string29;
        }
        String string210 = StubApp.getString2(2414);
        if (AbstractC0624h2.i(str, string210)) {
            return string210;
        }
        String string211 = StubApp.getString2(2415);
        if (AbstractC0624h2.i(str, string211)) {
            return string211;
        }
        String string212 = StubApp.getString2(2416);
        if (AbstractC0624h2.i(str, string212)) {
            return string212;
        }
        String string213 = StubApp.getString2(466);
        if (AbstractC0624h2.i(str, string213)) {
            return string213;
        }
        String string214 = StubApp.getString2(393);
        if (AbstractC0624h2.i(str, string214)) {
            return string214;
        }
        String string215 = StubApp.getString2(2417);
        if (AbstractC0624h2.i(str, string215)) {
            return string215;
        }
        String string216 = StubApp.getString2(2418);
        if (AbstractC0624h2.i(str, string216)) {
            return string216;
        }
        String string217 = StubApp.getString2(398);
        if (AbstractC0624h2.i(str, string217)) {
            return string217;
        }
        String string218 = StubApp.getString2(2419);
        if (AbstractC0624h2.i(str, string218)) {
            return string218;
        }
        String string219 = StubApp.getString2(2420);
        if (AbstractC0624h2.i(str, string219)) {
            return string219;
        }
        String string220 = StubApp.getString2(406);
        if (AbstractC0624h2.i(str, string220)) {
            return string220;
        }
        String string221 = StubApp.getString2(405);
        if (AbstractC0624h2.i(str, string221)) {
            return string221;
        }
        String string222 = StubApp.getString2(2421);
        if (AbstractC0624h2.i(str, string222)) {
            return string222;
        }
        String string223 = StubApp.getString2(2422);
        if (AbstractC0624h2.i(str, string223)) {
            return string223;
        }
        String string224 = StubApp.getString2(2423);
        if (AbstractC0624h2.i(str, string224)) {
            return string224;
        }
        String string225 = StubApp.getString2(403);
        if (AbstractC0624h2.i(str, string225)) {
            return string225;
        }
        String string226 = StubApp.getString2(2424);
        if (AbstractC0624h2.i(str, string226)) {
            return string226;
        }
        String string227 = StubApp.getString2(2425);
        if (AbstractC0624h2.i(str, string227)) {
            return string227;
        }
        String string228 = StubApp.getString2(2426);
        if (AbstractC0624h2.i(str, string228)) {
            return string228;
        }
        String string229 = StubApp.getString2(396);
        if (AbstractC0624h2.i(str, string229)) {
            return string229;
        }
        String string230 = StubApp.getString2(2015);
        if (AbstractC0624h2.i(str, string230)) {
            return string230;
        }
        String string231 = StubApp.getString2(2427);
        if (AbstractC0624h2.i(str, string231)) {
            return string231;
        }
        String string232 = StubApp.getString2(401);
        return AbstractC0624h2.i(str, string232) ? string232 : str;
    }

    public final String b(String str) {
        M4.I d8 = this.f2613a.d(a(str));
        if (d8.isEmpty()) {
            return null;
        }
        return (String) M4.r.j(d8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return this.f2613a.equals(((p) obj).f2613a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2613a.hashCode();
    }
}
