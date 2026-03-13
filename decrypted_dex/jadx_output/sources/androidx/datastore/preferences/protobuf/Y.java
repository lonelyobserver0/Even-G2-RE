package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.N2;
import com.google.android.gms.internal.measurement.O2;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Y implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9756a;

    /* renamed from: b, reason: collision with root package name */
    public int f9757b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9758c;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f9759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f9760e;

    public /* synthetic */ Y(N2 n22) {
        this.f9756a = 1;
        Objects.requireNonNull(n22);
        this.f9760e = n22;
        this.f9757b = -1;
    }

    public Iterator a() {
        if (this.f9759d == null) {
            this.f9759d = ((W) this.f9760e).f9749b.entrySet().iterator();
        }
        return this.f9759d;
    }

    public Iterator b() {
        if (this.f9759d == null) {
            this.f9759d = ((N2) this.f9760e).f11318c.entrySet().iterator();
        }
        return this.f9759d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9756a) {
            case 0:
                int i3 = this.f9757b + 1;
                W w10 = (W) this.f9760e;
                if (i3 >= w10.f9748a.size()) {
                    return !w10.f9749b.isEmpty() && a().hasNext();
                }
                return true;
            default:
                int i10 = this.f9757b + 1;
                N2 n22 = (N2) this.f9760e;
                if (i10 >= n22.f11317b) {
                    return !n22.f11318c.isEmpty() && b().hasNext();
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9756a) {
            case 0:
                this.f9758c = true;
                int i3 = this.f9757b + 1;
                this.f9757b = i3;
                W w10 = (W) this.f9760e;
                return i3 < w10.f9748a.size() ? (Map.Entry) w10.f9748a.get(this.f9757b) : (Map.Entry) a().next();
            default:
                this.f9758c = true;
                int i10 = this.f9757b + 1;
                this.f9757b = i10;
                N2 n22 = (N2) this.f9760e;
                return i10 < n22.f11317b ? (O2) n22.f11316a[i10] : (Map.Entry) b().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractMap abstractMap = this.f9760e;
        switch (this.f9756a) {
            case 0:
                if (!this.f9758c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f9758c = false;
                int i3 = W.f9747f;
                W w10 = (W) abstractMap;
                w10.b();
                if (this.f9757b >= w10.f9748a.size()) {
                    a().remove();
                    return;
                }
                int i10 = this.f9757b;
                this.f9757b = i10 - 1;
                w10.h(i10);
                return;
            default:
                if (!this.f9758c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f9758c = false;
                N2 n22 = (N2) abstractMap;
                n22.f();
                int i11 = this.f9757b;
                if (i11 >= n22.f11317b) {
                    b().remove();
                    return;
                } else {
                    this.f9757b = i11 - 1;
                    n22.d(i11);
                    return;
                }
        }
    }

    public Y(W w10) {
        this.f9756a = 0;
        this.f9760e = w10;
        this.f9757b = -1;
    }
}
