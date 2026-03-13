package M4;

import com.stub.StubApp;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: M4.s, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0147s implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f4645a;

    /* renamed from: b, reason: collision with root package name */
    public int f4646b;

    /* renamed from: c, reason: collision with root package name */
    public int f4647c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0150v f4648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4649e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0150v f4650f;

    public C0147s(C0150v c0150v, int i3) {
        this.f4649e = i3;
        this.f4650f = c0150v;
        this.f4648d = c0150v;
        this.f4645a = c0150v.f4661e;
        this.f4646b = c0150v.isEmpty() ? -1 : 0;
        this.f4647c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4646b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        C0150v c0150v = this.f4648d;
        if (c0150v.f4661e != this.f4645a) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f4646b;
        this.f4647c = i3;
        switch (this.f4649e) {
            case 0:
                obj = this.f4650f.j()[i3];
                break;
            case 1:
                obj = new C0149u(this.f4650f, i3);
                break;
            default:
                obj = this.f4650f.k()[i3];
                break;
        }
        int i10 = this.f4646b + 1;
        if (i10 >= c0150v.f4662f) {
            i10 = -1;
        }
        this.f4646b = i10;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C0150v c0150v = this.f4648d;
        if (c0150v.f4661e != this.f4645a) {
            throw new ConcurrentModificationException();
        }
        hc.b.n(StubApp.getString2(3546), this.f4647c >= 0);
        this.f4645a += 32;
        c0150v.remove(c0150v.j()[this.f4647c]);
        this.f4646b--;
        this.f4647c = -1;
    }
}
