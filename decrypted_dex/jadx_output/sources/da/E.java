package da;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class E extends F {

    /* renamed from: a, reason: collision with root package name */
    public final D f13466a;

    public E(D d8) {
        this.f13466a = d8;
    }

    @Override // da.F
    public final short A() {
        return this.f13466a.f13464a.readShort();
    }

    @Override // da.F
    public final int G() {
        return this.f13466a.f13464a.readUnsignedShort();
    }

    @Override // da.F, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // da.F
    public final long d() {
        return this.f13466a.f13464a.getFilePointer();
    }

    @Override // da.F
    public final long e() {
        return this.f13466a.f13465b.length();
    }

    @Override // da.F
    public final int read() {
        return this.f13466a.f13464a.read();
    }

    @Override // da.F
    public final void seek(long j) {
        this.f13466a.seek(j);
    }

    @Override // da.F
    public final long v() {
        return this.f13466a.f13464a.readLong();
    }

    @Override // da.F
    public final int read(byte[] bArr, int i3, int i10) {
        return this.f13466a.f13464a.read(bArr, i3, i10);
    }
}
