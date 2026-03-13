package M4;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class G extends n0 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f4543a;

    /* renamed from: b, reason: collision with root package name */
    public int f4544b;

    /* renamed from: c, reason: collision with root package name */
    public final I f4545c;

    public G(I i3, int i10) {
        int size = i3.size();
        hc.b.k(i10, size);
        this.f4543a = size;
        this.f4544b = i10;
        this.f4545c = i3;
    }

    public final Object a(int i3) {
        return this.f4545c.get(i3);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f4544b < this.f4543a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4544b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f4544b;
        this.f4544b = i3 + 1;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4544b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f4544b - 1;
        this.f4544b = i3;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4544b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
