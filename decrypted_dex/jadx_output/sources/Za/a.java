package Za;

import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.StringCodec;
import java.nio.ByteBuffer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements BinaryMessenger.BinaryMessageHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f9158a;

    public a(d dVar) {
        this.f9158a = dVar;
    }

    @Override // io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler
    public final void onMessage(ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
        StringCodec.INSTANCE.decodeMessage(byteBuffer);
        this.f9158a.getClass();
    }
}
