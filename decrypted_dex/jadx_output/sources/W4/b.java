package W4;

import com.stub.StubApp;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f8115a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f8116b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f8117c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8118d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8119e;

    /* renamed from: f, reason: collision with root package name */
    public final e f8120f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f8121g;

    public b(String str, Set set, Set set2, int i3, int i10, e eVar, Set set3) {
        this.f8115a = str;
        this.f8116b = Collections.unmodifiableSet(set);
        this.f8117c = Collections.unmodifiableSet(set2);
        this.f8118d = i3;
        this.f8119e = i10;
        this.f8120f = eVar;
        this.f8121g = Collections.unmodifiableSet(set3);
    }

    public static U9.h a(q qVar) {
        return new U9.h(qVar, new q[0]);
    }

    public static U9.h b(Class cls) {
        return new U9.h(cls, new Class[0]);
    }

    public static b c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            Y3.a.g(cls2, StubApp.getString2(6407));
            hashSet.add(q.a(cls2));
        }
        return new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new a(obj), hashSet3);
    }

    public final String toString() {
        return StubApp.getString2(6897) + Arrays.toString(this.f8116b.toArray()) + StubApp.getString2(6898) + this.f8118d + StubApp.getString2(2148) + this.f8119e + StubApp.getString2(6899) + Arrays.toString(this.f8117c.toArray()) + StubApp.getString2(265);
    }
}
