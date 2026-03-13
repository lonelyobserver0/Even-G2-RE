package oa;

import qa.C1532c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g extends C1532c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qa.f f18408c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(qa.f fVar, qa.f fVar2) {
        super(fVar);
        this.f18408c = fVar2;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f18408c.close();
    }
}
