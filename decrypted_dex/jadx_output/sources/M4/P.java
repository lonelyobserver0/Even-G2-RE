package M4;

import java.util.NoSuchElementException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class P extends n0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4563a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4564b;

    public P(Object obj) {
        this.f4563a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f4564b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4564b) {
            throw new NoSuchElementException();
        }
        this.f4564b = true;
        return this.f4563a;
    }
}
