package oa;

import Kc.z;
import java.io.FilterOutputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class o extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f18635a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, z zVar) {
        super(zVar);
        this.f18635a = pVar;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        j jVar = j.f18495R1;
        p pVar = this.f18635a;
        pVar.U(jVar, (int) pVar.f18636b.f20122c);
        pVar.f18638d = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i3, int i10) {
        ((FilterOutputStream) this).out.write(bArr, i3, i10);
    }
}
