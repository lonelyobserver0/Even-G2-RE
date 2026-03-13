package da;

import java.io.File;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class D extends F {

    /* renamed from: a, reason: collision with root package name */
    public C0811a f13464a;

    /* renamed from: b, reason: collision with root package name */
    public final File f13465b;

    public D(File file) {
        this.f13464a = null;
        this.f13465b = null;
        this.f13464a = new C0811a(file);
        this.f13465b = file;
    }

    @Override // da.F
    public final short A() {
        return this.f13464a.readShort();
    }

    @Override // da.F
    public final int G() {
        return this.f13464a.readUnsignedShort();
    }

    @Override // da.F, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0811a c0811a = this.f13464a;
        if (c0811a != null) {
            c0811a.close();
            this.f13464a = null;
        }
    }

    @Override // da.F
    public final long d() {
        return this.f13464a.getFilePointer();
    }

    @Override // da.F
    public final long e() {
        return this.f13465b.length();
    }

    @Override // da.F
    public final int read() {
        return this.f13464a.read();
    }

    @Override // da.F
    public final void seek(long j) {
        this.f13464a.seek(j);
    }

    @Override // da.F
    public final long v() {
        return this.f13464a.readLong();
    }

    @Override // da.F
    public final int read(byte[] bArr, int i3, int i10) {
        return this.f13464a.read(bArr, i3, i10);
    }
}
