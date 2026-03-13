package w6;

import E9.k;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.stub.StubApp;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import t6.C1737d;
import v6.InterfaceC1836b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class e implements InterfaceC1866a {

    /* renamed from: a, reason: collision with root package name */
    public final MediaFormat f22134a;

    /* renamed from: b, reason: collision with root package name */
    public final k f22135b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22136c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodec.BufferInfo f22137d;

    /* renamed from: e, reason: collision with root package name */
    public int f22138e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1836b f22139f;

    /* renamed from: g, reason: collision with root package name */
    public final int f22140g;

    /* renamed from: h, reason: collision with root package name */
    public final int f22141h;
    public long j;

    public e(C1737d config, hc.b format, MediaFormat mediaFormat, k listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(mediaFormat, "mediaFormat");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f22134a = mediaFormat;
        this.f22135b = listener;
        this.f22137d = new MediaCodec.BufferInfo();
        this.f22138e = -1;
        this.f22139f = format.w(config.f21187a);
        this.f22140g = mediaFormat.getInteger(StubApp.getString2(23862));
        this.f22141h = mediaFormat.getInteger(StubApp.getString2(23466));
    }

    @Override // w6.InterfaceC1866a
    public final void a(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.f22136c) {
            ByteBuffer wrap = ByteBuffer.wrap(bytes);
            int remaining = wrap.remaining() / this.f22140g;
            int position = wrap.position();
            MediaCodec.BufferInfo bufferInfo = this.f22137d;
            bufferInfo.offset = position;
            bufferInfo.size = wrap.limit();
            bufferInfo.presentationTimeUs = (this.j * 1000000) / this.f22141h;
            InterfaceC1836b interfaceC1836b = this.f22139f;
            if (interfaceC1836b.d()) {
                int i3 = this.f22138e;
                Intrinsics.checkNotNull(wrap);
                this.f22135b.c(interfaceC1836b.p(i3, wrap, bufferInfo));
            } else {
                int i10 = this.f22138e;
                Intrinsics.checkNotNull(wrap);
                interfaceC1836b.i(i10, wrap, bufferInfo);
            }
            this.j += remaining;
        }
    }

    @Override // w6.InterfaceC1866a
    public final void b() {
        if (this.f22136c) {
            return;
        }
        InterfaceC1836b interfaceC1836b = this.f22139f;
        this.f22138e = interfaceC1836b.m(this.f22134a);
        interfaceC1836b.start();
        this.f22136c = true;
    }

    @Override // w6.InterfaceC1866a
    public final void c() {
        if (this.f22136c) {
            this.f22136c = false;
            this.f22139f.stop();
        }
    }
}
