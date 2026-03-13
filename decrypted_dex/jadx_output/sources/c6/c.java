package c6;

import N5.o;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f10982a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f10983b;

    /* renamed from: c, reason: collision with root package name */
    public final o[] f10984c;

    public c(int i3, int[] iArr, int i10, int i11, int i12) {
        this.f10982a = i3;
        this.f10983b = iArr;
        float f10 = i10;
        float f11 = i12;
        this.f10984c = new o[]{new o(f10, f11), new o(i11, f11)};
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && this.f10982a == ((c) obj).f10982a;
    }

    public final int hashCode() {
        return this.f10982a;
    }
}
