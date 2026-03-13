package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.i, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0626i implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f11584a;

    public C0626i(Iterator it) {
        this.f11584a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11584a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new C0666q((String) this.f11584a.next());
    }
}
