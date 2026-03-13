package t;

import com.stub.StubApp;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1690c implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f21015a;

    /* renamed from: b, reason: collision with root package name */
    public int f21016b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21017c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1692e f21018d;

    public C1690c(C1692e c1692e) {
        this.f21018d = c1692e;
        this.f21015a = c1692e.f21040c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f21017c) {
            throw new IllegalStateException(StubApp.getString2(23372));
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i3 = this.f21016b;
        C1692e c1692e = this.f21018d;
        return Intrinsics.areEqual(key, c1692e.f(i3)) && Intrinsics.areEqual(entry.getValue(), c1692e.i(this.f21016b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f21017c) {
            return this.f21018d.f(this.f21016b);
        }
        throw new IllegalStateException(StubApp.getString2(23372));
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f21017c) {
            return this.f21018d.i(this.f21016b);
        }
        throw new IllegalStateException(StubApp.getString2(23372));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21016b < this.f21015a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f21017c) {
            throw new IllegalStateException(StubApp.getString2(23372));
        }
        int i3 = this.f21016b;
        C1692e c1692e = this.f21018d;
        Object f10 = c1692e.f(i3);
        Object i10 = c1692e.i(this.f21016b);
        return (f10 == null ? 0 : f10.hashCode()) ^ (i10 != null ? i10.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f21016b++;
        this.f21017c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f21017c) {
            throw new IllegalStateException();
        }
        this.f21018d.g(this.f21016b);
        this.f21016b--;
        this.f21015a--;
        this.f21017c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f21017c) {
            return this.f21018d.h(this.f21016b, obj);
        }
        throw new IllegalStateException(StubApp.getString2(23372));
    }

    public final String toString() {
        return getKey() + StubApp.getString2(2359) + getValue();
    }
}
