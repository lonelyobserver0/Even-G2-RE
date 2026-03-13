package M4;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: M4.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0140k extends C0132c implements ListIterator {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0141l f4629e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0140k(C0141l c0141l) {
        super(c0141l);
        this.f4629e = c0141l;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C0141l c0141l = this.f4629e;
        boolean isEmpty = c0141l.isEmpty();
        c().add(obj);
        c0141l.f4635f.f4573e++;
        if (isEmpty) {
            c0141l.a();
        }
    }

    public final ListIterator c() {
        b();
        return (ListIterator) ((Iterator) this.f4592b);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return c().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return c().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return c().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return c().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        c().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0140k(C0141l c0141l, int i3) {
        super(c0141l, ((List) c0141l.f4631b).listIterator(i3));
        this.f4629e = c0141l;
    }
}
