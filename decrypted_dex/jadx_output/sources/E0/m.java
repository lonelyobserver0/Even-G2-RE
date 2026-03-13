package E0;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface m {
    void a(int i3, u0.b bVar, long j, int i10);

    void b(Bundle bundle);

    void c(int i3, int i10, long j, int i11);

    void e(int i3);

    MediaFormat f();

    void flush();

    void g();

    void h(int i3, long j);

    int j();

    int k(MediaCodec.BufferInfo bufferInfo);

    void l(R0.e eVar, Handler handler);

    void n(int i3);

    ByteBuffer o(int i3);

    void q(Surface surface);

    ByteBuffer r(int i3);

    void release();

    default boolean t(s2.d dVar) {
        return false;
    }
}
