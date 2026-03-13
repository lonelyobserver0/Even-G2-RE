package W4;

import com.stub.StubApp;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import t5.InterfaceC1732c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class s implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Set f8156a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f8157b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f8158c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f8159d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f8160e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f8161f;

    /* renamed from: g, reason: collision with root package name */
    public final c f8162g;

    public s(b bVar, c cVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (i iVar : bVar.f8117c) {
            int i3 = iVar.f8139c;
            boolean z2 = i3 == 0;
            int i10 = iVar.f8138b;
            q qVar = iVar.f8137a;
            if (z2) {
                if (i10 == 2) {
                    hashSet4.add(qVar);
                } else {
                    hashSet.add(qVar);
                }
            } else if (i3 == 2) {
                hashSet3.add(qVar);
            } else if (i10 == 2) {
                hashSet5.add(qVar);
            } else {
                hashSet2.add(qVar);
            }
        }
        Set set = bVar.f8121g;
        if (!set.isEmpty()) {
            hashSet.add(q.a(InterfaceC1732c.class));
        }
        this.f8156a = Collections.unmodifiableSet(hashSet);
        this.f8157b = Collections.unmodifiableSet(hashSet2);
        this.f8158c = Collections.unmodifiableSet(hashSet3);
        this.f8159d = Collections.unmodifiableSet(hashSet4);
        this.f8160e = Collections.unmodifiableSet(hashSet5);
        this.f8161f = set;
        this.f8162g = cVar;
    }

    @Override // W4.c
    public final o a(q qVar) {
        if (this.f8158c.contains(qVar)) {
            return this.f8162g.a(qVar);
        }
        throw new H9.b(StubApp.getString2(6918) + qVar + StubApp.getString2(6919));
    }

    @Override // W4.c
    public final w5.b b(q qVar) {
        if (this.f8160e.contains(qVar)) {
            return this.f8162g.b(qVar);
        }
        throw new H9.b(StubApp.getString2(6920) + qVar + StubApp.getString2(6921));
    }

    @Override // W4.c
    public final w5.b c(Class cls) {
        return d(q.a(cls));
    }

    @Override // W4.c
    public final w5.b d(q qVar) {
        if (this.f8157b.contains(qVar)) {
            return this.f8162g.d(qVar);
        }
        throw new H9.b(StubApp.getString2(6922) + qVar + StubApp.getString2(6919));
    }

    @Override // W4.c
    public final Object e(q qVar) {
        if (this.f8156a.contains(qVar)) {
            return this.f8162g.e(qVar);
        }
        throw new H9.b(StubApp.getString2(6923) + qVar + StubApp.getString2(1));
    }

    @Override // W4.c
    public final Set f(q qVar) {
        if (this.f8159d.contains(qVar)) {
            return this.f8162g.f(qVar);
        }
        throw new H9.b(StubApp.getString2(6924) + qVar + StubApp.getString2(6919));
    }

    public final o g(Class cls) {
        return a(q.a(cls));
    }

    @Override // W4.c
    public final Object get(Class cls) {
        if (!this.f8156a.contains(q.a(cls))) {
            throw new H9.b(Xa.h.p(StubApp.getString2(6923), cls, StubApp.getString2(1)));
        }
        Object obj = this.f8162g.get(cls);
        return !cls.equals(InterfaceC1732c.class) ? obj : new r(this.f8161f, (InterfaceC1732c) obj);
    }
}
