package M4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: M4.o, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0144o {

    /* renamed from: a, reason: collision with root package name */
    public transient Set f4640a;

    /* renamed from: b, reason: collision with root package name */
    public transient Collection f4641b;

    /* renamed from: c, reason: collision with root package name */
    public transient Map f4642c;

    public abstract Map a();

    public boolean b(Object obj) {
        Iterator it = a().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0144o) {
            return a().equals(((AbstractC0144o) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
