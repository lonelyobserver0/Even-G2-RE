package u0;

import J1.s;
import com.stub.StubApp;
import java.nio.ByteBuffer;
import o0.AbstractC1448w;
import o0.C1438m;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class e extends s {

    /* renamed from: c, reason: collision with root package name */
    public C1438m f21394c;

    /* renamed from: d, reason: collision with root package name */
    public final b f21395d;

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f21396e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21397f;

    /* renamed from: g, reason: collision with root package name */
    public long f21398g;

    /* renamed from: h, reason: collision with root package name */
    public ByteBuffer f21399h;
    public final int j;

    static {
        AbstractC1448w.a(StubApp.getString2(23513));
    }

    public e(int i3) {
        super(5);
        this.f21395d = new b();
        this.j = i3;
    }

    public void s() {
        this.f3376b = 0;
        ByteBuffer byteBuffer = this.f21396e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f21399h;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f21397f = false;
    }

    public final ByteBuffer t(int i3) {
        int i10 = this.j;
        if (i10 == 1) {
            return ByteBuffer.allocate(i3);
        }
        if (i10 == 2) {
            return ByteBuffer.allocateDirect(i3);
        }
        ByteBuffer byteBuffer = this.f21396e;
        throw new d(AbstractC1482f.e(byteBuffer == null ? 0 : byteBuffer.capacity(), StubApp.getString2(23514), i3, StubApp.getString2(2975), StubApp.getString2(74)));
    }

    public final void u(int i3) {
        ByteBuffer byteBuffer = this.f21396e;
        if (byteBuffer == null) {
            this.f21396e = t(i3);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i10 = i3 + position;
        if (capacity >= i10) {
            this.f21396e = byteBuffer;
            return;
        }
        ByteBuffer t3 = t(i10);
        t3.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            t3.put(byteBuffer);
        }
        this.f21396e = t3;
    }

    public final void v() {
        ByteBuffer byteBuffer = this.f21396e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f21399h;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
