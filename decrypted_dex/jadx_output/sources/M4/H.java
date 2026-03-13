package M4;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class H extends I {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f4546c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f4547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ I f4548e;

    public H(I i3, int i10, int i11) {
        this.f4548e = i3;
        this.f4546c = i10;
        this.f4547d = i11;
    }

    @Override // M4.D
    public final Object[] c() {
        return this.f4548e.c();
    }

    @Override // M4.D
    public final int d() {
        return this.f4548e.f() + this.f4546c + this.f4547d;
    }

    @Override // M4.D
    public final int f() {
        return this.f4548e.f() + this.f4546c;
    }

    @Override // M4.D
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        hc.b.i(i3, this.f4547d);
        return this.f4548e.get(i3 + this.f4546c);
    }

    @Override // M4.I, M4.D, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // M4.I, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4547d;
    }

    @Override // M4.I, java.util.List
    /* renamed from: u */
    public final I subList(int i3, int i10) {
        hc.b.l(i3, i10, this.f4547d);
        int i11 = this.f4546c;
        return this.f4548e.subList(i3 + i11, i10 + i11);
    }

    @Override // M4.I, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i3) {
        return listIterator(i3);
    }
}
