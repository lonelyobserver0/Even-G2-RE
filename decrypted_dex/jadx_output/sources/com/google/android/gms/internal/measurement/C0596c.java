package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0596c implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f11459a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterator f11460b;

    public C0596c(C0601d c0601d, Iterator it, Iterator it2) {
        this.f11459a = it;
        this.f11460b = it2;
        Objects.requireNonNull(c0601d);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f11459a.hasNext()) {
            return true;
        }
        return this.f11460b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f11459a;
        if (it.hasNext()) {
            return new C0666q(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f11460b;
        if (it2.hasNext()) {
            return new C0666q((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
