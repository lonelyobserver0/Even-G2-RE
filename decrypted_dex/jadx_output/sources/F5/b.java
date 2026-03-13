package F5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2234a;

    /* renamed from: b, reason: collision with root package name */
    public final c f2235b;

    public b(Set set, c cVar) {
        this.f2234a = b(set);
        this.f2235b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f2232a);
            sb2.append('/');
            sb2.append(aVar.f2233b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        c cVar = this.f2235b;
        synchronized (((HashSet) cVar.f2238b)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) cVar.f2238b);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.f2234a;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(' ');
        synchronized (((HashSet) cVar.f2238b)) {
            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) cVar.f2238b);
        }
        sb2.append(b(unmodifiableSet2));
        return sb2.toString();
    }
}
