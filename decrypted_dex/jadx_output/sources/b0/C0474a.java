package b0;

import android.media.MediaDataSource;
import java.io.IOException;

/* renamed from: b0.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0474a extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public long f10402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0480g f10403b;

    public C0474a(C0480g c0480g) {
        this.f10403b = c0480g;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i3, int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j3 = this.f10402a;
            C0480g c0480g = this.f10403b;
            if (j3 != j) {
                if (j3 >= 0 && j >= j3 + c0480g.f10404a.available()) {
                    return -1;
                }
                c0480g.seek(j);
                this.f10402a = j;
            }
            if (i10 > c0480g.f10404a.available()) {
                i10 = c0480g.f10404a.available();
            }
            int read = c0480g.read(bArr, i3, i10);
            if (read >= 0) {
                this.f10402a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f10402a = -1L;
        return -1;
    }
}
