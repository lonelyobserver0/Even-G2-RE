package M4;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: M4.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class C0139j extends C0134e implements SortedSet {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W f4628c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0139j(W w10, SortedMap sortedMap) {
        super(w10, sortedMap);
        this.f4628c = w10;
    }

    public SortedMap a() {
        return (SortedMap) this.f4604a;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C0139j(this.f4628c, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C0139j(this.f4628c, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C0139j(this.f4628c, a().tailMap(obj));
    }
}
