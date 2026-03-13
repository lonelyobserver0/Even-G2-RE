package M4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class N extends n0 {

    /* renamed from: a, reason: collision with root package name */
    public int f4556a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4557b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4558c;

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f4559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4560e;

    public N() {
        this.f4556a = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        int i3 = this.f4556a;
        if (i3 == 4) {
            throw new IllegalStateException();
        }
        int c10 = AbstractC1856e.c(i3);
        if (c10 == 0) {
            return true;
        }
        if (c10 == 2) {
            return false;
        }
        this.f4556a = 4;
        switch (this.f4558c) {
            case 0:
                do {
                    Iterator it = this.f4559d;
                    if (!it.hasNext()) {
                        this.f4556a = 3;
                        next = null;
                        break;
                    } else {
                        next = it.next();
                    }
                } while (!((L4.g) this.f4560e).apply(next));
            default:
                do {
                    Iterator it2 = this.f4559d;
                    if (!it2.hasNext()) {
                        this.f4556a = 3;
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                    }
                } while (!((h0) this.f4560e).f4623b.contains(next));
        }
        this.f4557b = next;
        if (this.f4556a == 3) {
            return false;
        }
        this.f4556a = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f4556a = 2;
        Object obj = this.f4557b;
        this.f4557b = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N(Iterator it, L4.g gVar) {
        this();
        this.f4558c = 0;
        this.f4559d = it;
        this.f4560e = gVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N(h0 h0Var) {
        this();
        this.f4558c = 1;
        this.f4560e = h0Var;
        this.f4559d = h0Var.f4622a.iterator();
    }
}
