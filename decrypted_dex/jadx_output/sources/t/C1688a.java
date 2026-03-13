package t;

import com.stub.StubApp;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMutableIterator;

/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1688a implements Iterator, KMutableIterator {

    /* renamed from: a, reason: collision with root package name */
    public int f21009a;

    /* renamed from: b, reason: collision with root package name */
    public int f21010b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21011c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f21013e;

    public C1688a(int i3) {
        this.f21009a = i3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21010b < this.f21009a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f10;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f21010b;
        switch (this.f21012d) {
            case 0:
                f10 = ((C1692e) this.f21013e).f(i3);
                break;
            case 1:
                f10 = ((C1692e) this.f21013e).i(i3);
                break;
            default:
                f10 = ((C1693f) this.f21013e).f21024b[i3];
                break;
        }
        this.f21010b++;
        this.f21011c = true;
        return f10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f21011c) {
            throw new IllegalStateException(StubApp.getString2(23371));
        }
        int i3 = this.f21010b - 1;
        this.f21010b = i3;
        switch (this.f21012d) {
            case 0:
                ((C1692e) this.f21013e).g(i3);
                break;
            case 1:
                ((C1692e) this.f21013e).g(i3);
                break;
            default:
                ((C1693f) this.f21013e).a(i3);
                break;
        }
        this.f21009a--;
        this.f21011c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1688a(C1693f c1693f) {
        this(c1693f.f21025c);
        this.f21012d = 2;
        this.f21013e = c1693f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1688a(C1692e c1692e, int i3) {
        this(c1692e.f21040c);
        this.f21012d = i3;
        switch (i3) {
            case 1:
                this.f21013e = c1692e;
                this(c1692e.f21040c);
                break;
            default:
                this.f21013e = c1692e;
                break;
        }
    }
}
