package M4;

import f5.u0;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: M4.n, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0143n extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4638a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4639b;

    public /* synthetic */ C0143n(int i3, Serializable serializable) {
        this.f4638a = i3;
        this.f4639b = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f4638a) {
            case 0:
                ((W) this.f4639b).c();
                break;
            case 1:
                ((C0150v) this.f4639b).clear();
                break;
            default:
                ((C0133d) this.f4639b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f4638a) {
            case 0:
                return ((W) this.f4639b).b(obj);
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((C0133d) this.f4639b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f4638a) {
            case 2:
                return ((C0133d) this.f4639b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f4638a) {
            case 0:
                return new C0130a((W) this.f4639b);
            case 1:
                C0150v c0150v = (C0150v) this.f4639b;
                Map c10 = c0150v.c();
                return c10 != null ? c10.values().iterator() : new C0147s(c0150v, 2);
            default:
                return new U(((C0133d) this.f4639b).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f4638a) {
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    C0133d c0133d = (C0133d) this.f4639b;
                    for (Map.Entry entry : c0133d.entrySet()) {
                        if (u0.j(obj, entry.getValue())) {
                            c0133d.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f4638a) {
            case 2:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C0133d c0133d = (C0133d) this.f4639b;
                    for (Map.Entry entry : c0133d.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c0133d.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f4638a) {
            case 2:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C0133d c0133d = (C0133d) this.f4639b;
                    for (Map.Entry entry : c0133d.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c0133d.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f4638a) {
            case 0:
                return ((W) this.f4639b).f4573e;
            case 1:
                return ((C0150v) this.f4639b).size();
            default:
                return ((C0133d) this.f4639b).f4599c.size();
        }
    }

    public C0143n(C0133d c0133d) {
        this.f4638a = 2;
        this.f4639b = c0133d;
    }
}
