package ta;

import com.stub.StubApp;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import oa.AbstractC1469b;
import oa.C1470c;
import oa.C1471d;
import oa.C1473f;
import oa.i;
import oa.j;
import oa.q;

/* renamed from: ta.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1742b implements Map {

    /* renamed from: a, reason: collision with root package name */
    public final C1471d f21249a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f21250b;

    public C1742b(HashMap hashMap, C1471d c1471d) {
        this.f21250b = hashMap;
        this.f21249a = c1471d;
    }

    public static C1742b a(C1471d c1471d) {
        Object obj;
        if (c1471d == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (j jVar : c1471d.f18397a.keySet()) {
            AbstractC1469b J10 = c1471d.J(jVar);
            if (J10 instanceof q) {
                obj = ((q) J10).a();
            } else if (J10 instanceof i) {
                obj = Integer.valueOf((int) ((i) J10).f18416a);
            } else if (J10 instanceof j) {
                obj = ((j) J10).f18626a;
            } else if (J10 instanceof C1473f) {
                obj = Float.valueOf(((C1473f) J10).f18406a.floatValue());
            } else {
                if (!(J10 instanceof C1470c)) {
                    throw new IOException(StubApp.getString2(23511) + J10);
                }
                obj = ((C1470c) J10).f18396a ? Boolean.TRUE : Boolean.FALSE;
            }
            hashMap.put(jVar.f18626a, obj);
        }
        return new C1742b(hashMap, c1471d);
    }

    @Override // java.util.Map
    public final void clear() {
        this.f21249a.f18397a.clear();
        this.f21250b.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f21250b.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f21250b.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return Collections.unmodifiableSet(this.f21250b.entrySet());
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof C1742b) {
            return ((C1742b) obj).f21249a.equals(this.f21249a);
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f21250b.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f21249a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f21250b.keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f21249a.V(j.a((String) obj), ((InterfaceC1743c) obj2).p());
        return this.f21250b.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException(StubApp.getString2(23512));
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        this.f21249a.S(j.a((String) obj));
        return this.f21250b.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f21249a.f18397a.size();
    }

    public final String toString() {
        return this.f21250b.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f21250b.values();
    }
}
