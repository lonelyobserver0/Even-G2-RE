package f4;

import com.stub.StubApp;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class w implements ListIterator, Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f13787a;

    /* renamed from: b, reason: collision with root package name */
    public int f13788b;

    /* renamed from: c, reason: collision with root package name */
    public final y f13789c;

    public w(y yVar, int i3) {
        int size = yVar.size();
        if (i3 < 0 || i3 > size) {
            throw new IndexOutOfBoundsException(a4.f.U(i3, size, StubApp.getString2(8110)));
        }
        this.f13787a = size;
        this.f13788b = i3;
        this.f13789c = yVar;
    }

    public final Object a(int i3) {
        return this.f13789c.get(i3);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f13788b < this.f13787a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f13788b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f13788b;
        this.f13788b = i3 + 1;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f13788b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f13788b - 1;
        this.f13788b = i3;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f13788b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
