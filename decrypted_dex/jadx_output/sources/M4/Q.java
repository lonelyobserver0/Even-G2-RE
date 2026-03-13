package M4;

import java.util.AbstractList;
import java.util.ListIterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Q extends m0 implements ListIterator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4565b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractList f4566c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(AbstractList abstractList, ListIterator listIterator, int i3) {
        super(listIterator);
        this.f4565b = i3;
        this.f4566c = abstractList;
    }

    @Override // M4.m0
    public final Object a(Object obj) {
        switch (this.f4565b) {
            case 0:
                return ((S) this.f4566c).f4568b.apply(obj);
            default:
                return ((T) this.f4566c).f4570b.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f4637a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f4637a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.f4637a).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f4637a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
