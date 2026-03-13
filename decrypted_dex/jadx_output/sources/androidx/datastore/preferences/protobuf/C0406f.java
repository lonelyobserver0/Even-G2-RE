package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0406f extends C0407g {

    /* renamed from: e, reason: collision with root package name */
    public final int f9778e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9779f;

    public C0406f(byte[] bArr, int i3, int i10) {
        super(bArr);
        C0407g.b(i3, i3 + i10, bArr.length);
        this.f9778e = i3;
        this.f9779f = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.C0407g
    public final byte a(int i3) {
        int i10 = this.f9779f;
        if (((i10 - (i3 + 1)) | i3) >= 0) {
            return this.f9783b[this.f9778e + i3];
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException(i2.u.p(i3, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(Xa.h.o("Index > length: ", i3, i10, ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.C0407g
    public final void d(int i3, byte[] bArr) {
        System.arraycopy(this.f9783b, this.f9778e, bArr, 0, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.C0407g
    public final int f() {
        return this.f9778e;
    }

    @Override // androidx.datastore.preferences.protobuf.C0407g
    public final byte g(int i3) {
        return this.f9783b[this.f9778e + i3];
    }

    @Override // androidx.datastore.preferences.protobuf.C0407g
    public final int size() {
        return this.f9779f;
    }
}
