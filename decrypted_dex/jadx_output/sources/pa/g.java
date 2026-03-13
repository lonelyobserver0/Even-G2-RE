package pa;

import com.stub.StubApp;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f19755b = new g();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f19756a;

    public g() {
        HashMap hashMap = new HashMap();
        this.f19756a = hashMap;
        b bVar = new b(5);
        b bVar2 = new b(4);
        b bVar3 = new b(2);
        b bVar4 = new b(6);
        b bVar5 = new b(0);
        b bVar6 = new b(1);
        b bVar7 = new b(7);
        b bVar8 = new b(3);
        h hVar = new h();
        hashMap.put(oa.j.f18550i1, bVar);
        hashMap.put(oa.j.f18552j1, bVar);
        hashMap.put(oa.j.f18419A0, bVar2);
        hashMap.put(oa.j.f18424B0, bVar2);
        hashMap.put(oa.j.f18470L, bVar3);
        hashMap.put(oa.j.f18482O, bVar3);
        hashMap.put(oa.j.f18518Y1, bVar4);
        hashMap.put(oa.j.f18522Z1, bVar4);
        hashMap.put(oa.j.f18577p, bVar5);
        hashMap.put(oa.j.f18581q, bVar5);
        hashMap.put(oa.j.f18586r, bVar6);
        hashMap.put(oa.j.f18591s, bVar6);
        hashMap.put(oa.j.f18511W2, bVar7);
        hashMap.put(oa.j.f18515X2, bVar7);
        hashMap.put(oa.j.f18613x0, bVar8);
        hashMap.put(oa.j.f18467K1, hVar);
    }

    public final f a(oa.j jVar) {
        f fVar = (f) this.f19756a.get(jVar);
        if (fVar != null) {
            return fVar;
        }
        throw new IOException(StubApp.getString2(22148) + jVar);
    }
}
