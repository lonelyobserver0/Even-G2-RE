package M4;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: M4.i, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class C0138i extends C0133d implements SortedMap {

    /* renamed from: e, reason: collision with root package name */
    public SortedSet f4624e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ W f4625f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0138i(W w10, SortedMap sortedMap) {
        super(w10, sortedMap);
        this.f4625f = w10;
    }

    public SortedSet b() {
        return new C0139j(this.f4625f, d());
    }

    @Override // M4.C0133d, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f4624e;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet b2 = b();
        this.f4624e = b2;
        return b2;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f4599c;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C0138i(this.f4625f, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C0138i(this.f4625f, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C0138i(this.f4625f, d().tailMap(obj));
    }
}
