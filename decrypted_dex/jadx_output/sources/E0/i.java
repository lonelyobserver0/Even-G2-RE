package E0;

import java.nio.ByteBuffer;
import r0.AbstractC1550k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i extends u0.e {

    /* renamed from: k, reason: collision with root package name */
    public long f1770k;

    /* renamed from: l, reason: collision with root package name */
    public int f1771l;

    /* renamed from: m, reason: collision with root package name */
    public int f1772m;

    @Override // u0.e
    public final void s() {
        super.s();
        this.f1771l = 0;
    }

    public final boolean w(u0.e eVar) {
        ByteBuffer byteBuffer;
        AbstractC1550k.c(!eVar.k(1073741824));
        AbstractC1550k.c(!eVar.k(268435456));
        AbstractC1550k.c(!eVar.k(4));
        if (x()) {
            if (this.f1771l >= this.f1772m) {
                return false;
            }
            ByteBuffer byteBuffer2 = eVar.f21396e;
            if (byteBuffer2 != null && (byteBuffer = this.f21396e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i3 = this.f1771l;
        this.f1771l = i3 + 1;
        if (i3 == 0) {
            this.f21398g = eVar.f21398g;
            if (eVar.k(1)) {
                this.f3376b = 1;
            }
        }
        ByteBuffer byteBuffer3 = eVar.f21396e;
        if (byteBuffer3 != null) {
            u(byteBuffer3.remaining());
            this.f21396e.put(byteBuffer3);
        }
        this.f1770k = eVar.f21398g;
        return true;
    }

    public final boolean x() {
        return this.f1771l > 0;
    }
}
