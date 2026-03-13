package v6;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* renamed from: v6.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface InterfaceC1836b {
    boolean d();

    void i(int i3, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    int m(MediaFormat mediaFormat);

    byte[] p(int i3, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    void release();

    boolean s();

    void start();

    void stop();
}
