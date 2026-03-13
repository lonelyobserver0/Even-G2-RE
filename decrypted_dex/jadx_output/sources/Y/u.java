package Y;

import com.stub.StubApp;
import java.nio.ByteBuffer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f8697d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f8698a;

    /* renamed from: b, reason: collision with root package name */
    public final p2.h f8699b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f8700c = 0;

    public u(p2.h hVar, int i3) {
        this.f8699b = hVar;
        this.f8698a = i3;
    }

    public final int a(int i3) {
        Z.a b2 = b();
        int a3 = b2.a(16);
        if (a3 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b2.f4812d;
        int i10 = a3 + b2.f4809a;
        return byteBuffer.getInt((i3 * 4) + byteBuffer.getInt(i10) + i10 + 4);
    }

    public final Z.a b() {
        ThreadLocal threadLocal = f8697d;
        Z.a aVar = (Z.a) threadLocal.get();
        if (aVar == null) {
            aVar = new Z.a();
            threadLocal.set(aVar);
        }
        Z.b bVar = (Z.b) this.f8699b.f19671a;
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i3 = a3 + bVar.f4809a;
            int i10 = (this.f8698a * 4) + ((ByteBuffer) bVar.f4812d).getInt(i3) + i3 + 4;
            int i11 = ((ByteBuffer) bVar.f4812d).getInt(i10) + i10;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f4812d;
            aVar.f4812d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f4809a = i11;
                int i12 = i11 - byteBuffer.getInt(i11);
                aVar.f4810b = i12;
                aVar.f4811c = ((ByteBuffer) aVar.f4812d).getShort(i12);
                return aVar;
            }
            aVar.f4809a = 0;
            aVar.f4810b = 0;
            aVar.f4811c = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(StubApp.getString2(759));
        Z.a b2 = b();
        int a3 = b2.a(4);
        sb2.append(Integer.toHexString(a3 != 0 ? ((ByteBuffer) b2.f4812d).getInt(a3 + b2.f4809a) : 0));
        sb2.append(StubApp.getString2(7492));
        Z.a b10 = b();
        int a9 = b10.a(16);
        if (a9 != 0) {
            int i10 = a9 + b10.f4809a;
            i3 = ((ByteBuffer) b10.f4812d).getInt(((ByteBuffer) b10.f4812d).getInt(i10) + i10);
        } else {
            i3 = 0;
        }
        for (int i11 = 0; i11 < i3; i11++) {
            sb2.append(Integer.toHexString(a(i11)));
            sb2.append(StubApp.getString2(397));
        }
        return sb2.toString();
    }
}
