package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.N2;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import t.C1690c;
import t.C1692e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class Z extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f9762b;

    public /* synthetic */ Z(Map map, int i3) {
        this.f9761a = i3;
        this.f9762b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f9761a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((W) this.f9762b).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((N2) this.f9762b).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f9761a) {
            case 0:
                ((W) this.f9762b).clear();
                break;
            case 1:
                ((N2) this.f9762b).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f9761a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((W) this.f9762b).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((N2) this.f9762b).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj3 != value2) {
                    return obj3 != null && obj3.equals(value2);
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f9761a) {
            case 0:
                return new Y((W) this.f9762b);
            case 1:
                return new Y((N2) this.f9762b);
            default:
                return new C1690c((C1692e) this.f9762b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f9761a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((W) this.f9762b).remove(entry.getKey());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((N2) this.f9762b).remove(entry2.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f9761a) {
            case 0:
                return ((W) this.f9762b).size();
            case 1:
                return ((N2) this.f9762b).size();
            default:
                return ((C1692e) this.f9762b).f21040c;
        }
    }
}
