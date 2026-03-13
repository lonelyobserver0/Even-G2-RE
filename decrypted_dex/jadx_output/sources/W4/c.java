package W4;

import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface c {
    o a(q qVar);

    w5.b b(q qVar);

    default w5.b c(Class cls) {
        return d(q.a(cls));
    }

    w5.b d(q qVar);

    default Object e(q qVar) {
        w5.b d8 = d(qVar);
        if (d8 == null) {
            return null;
        }
        return d8.get();
    }

    default Set f(q qVar) {
        return (Set) b(qVar).get();
    }

    default Object get(Class cls) {
        return e(q.a(cls));
    }
}
