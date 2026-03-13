package Za;

import io.flutter.plugin.common.BinaryMessenger;
import java.nio.ByteBuffer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements BinaryMessenger {

    /* renamed from: a, reason: collision with root package name */
    public final o f9162a;

    public c(o oVar) {
        this.f9162a = oVar;
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public final void disableBufferingIncomingMessages() {
        this.f9162a.disableBufferingIncomingMessages();
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public final void enableBufferingIncomingMessages() {
        this.f9162a.enableBufferingIncomingMessages();
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public final BinaryMessenger.TaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions taskQueueOptions) {
        return this.f9162a.makeBackgroundTaskQueue(taskQueueOptions);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public final void send(String str, ByteBuffer byteBuffer) {
        this.f9162a.send(str, byteBuffer, null);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public final void setMessageHandler(String str, BinaryMessenger.BinaryMessageHandler binaryMessageHandler) {
        this.f9162a.setMessageHandler(str, binaryMessageHandler, null);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public final void send(String str, ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
        this.f9162a.send(str, byteBuffer, binaryReply);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public final void setMessageHandler(String str, BinaryMessenger.BinaryMessageHandler binaryMessageHandler, BinaryMessenger.TaskQueue taskQueue) {
        this.f9162a.setMessageHandler(str, binaryMessageHandler, taskQueue);
    }
}
