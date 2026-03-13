package Za;

import com.stub.StubApp;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.common.BinaryMessenger;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k implements BinaryMessenger.BinaryReply {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f9183a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9184b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f9185c = new AtomicBoolean(false);

    public k(FlutterJNI flutterJNI, int i3) {
        this.f9183a = flutterJNI;
        this.f9184b = i3;
    }

    @Override // io.flutter.plugin.common.BinaryMessenger.BinaryReply
    public final void reply(ByteBuffer byteBuffer) {
        if (this.f9185c.getAndSet(true)) {
            throw new IllegalStateException(StubApp.getString2(8265));
        }
        int i3 = this.f9184b;
        FlutterJNI flutterJNI = this.f9183a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i3);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i3, byteBuffer, byteBuffer.position());
        }
    }
}
