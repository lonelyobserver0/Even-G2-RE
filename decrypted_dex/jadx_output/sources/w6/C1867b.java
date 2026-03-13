package w6;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import com.stub.StubApp;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import v6.InterfaceC1836b;

/* renamed from: w6.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1867b extends MediaCodec.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f22117a;

    public C1867b(d dVar) {
        this.f22117a = dVar;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec codec, MediaCodec.CodecException e10) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        Intrinsics.checkNotNullParameter(e10, "e");
        this.f22117a.d(e10);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec codec, int i3) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        d dVar = this.f22117a;
        dVar.f22130m = i3;
        dVar.e();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec codec, int i3, MediaCodec.BufferInfo info) {
        ByteBuffer outputBuffer;
        Intrinsics.checkNotNullParameter(codec, "codec");
        Intrinsics.checkNotNullParameter(info, "info");
        d dVar = this.f22117a;
        try {
            InterfaceC1836b interfaceC1836b = dVar.f22127h;
            if (interfaceC1836b != null && info.size != 0 && ((!interfaceC1836b.s() || (info.flags & 2) == 0) && (outputBuffer = codec.getOutputBuffer(i3)) != null)) {
                if (interfaceC1836b.d()) {
                    dVar.f22123d.c(interfaceC1836b.p(dVar.f22131n, outputBuffer, info));
                } else {
                    interfaceC1836b.i(dVar.f22131n, outputBuffer, info);
                }
            }
            codec.releaseOutputBuffer(i3, false);
            if ((info.flags & 4) != 0) {
                dVar.f();
            }
        } catch (Exception e10) {
            dVar.d(e10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec codec, MediaFormat format) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        Intrinsics.checkNotNullParameter(format, "format");
        d dVar = this.f22117a;
        InterfaceC1836b interfaceC1836b = dVar.f22127h;
        dVar.f22131n = interfaceC1836b != null ? interfaceC1836b.m(format) : -1;
        InterfaceC1836b interfaceC1836b2 = dVar.f22127h;
        if (interfaceC1836b2 != null) {
            interfaceC1836b2.start();
        }
        Log.d(StubApp.getString2(23860), StubApp.getString2(23859) + format);
    }
}
