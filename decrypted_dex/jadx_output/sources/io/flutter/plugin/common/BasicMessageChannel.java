package io.flutter.plugin.common;

import android.util.Log;
import com.stub.StubApp;
import io.flutter.plugin.common.BinaryMessenger;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class BasicMessageChannel<T> {
    public static final String CHANNEL_BUFFERS_CHANNEL = StubApp.getString2(18663);
    private static final String TAG = StubApp.getString2(18660);
    private final MessageCodec<T> codec;
    private final BinaryMessenger messenger;
    private final String name;
    private final BinaryMessenger.TaskQueue taskQueue;

    /* renamed from: io.flutter.plugin.common.BasicMessageChannel$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public final class IncomingMessageHandler implements BinaryMessenger.BinaryMessageHandler {
        private final MessageHandler<T> handler;

        public /* synthetic */ IncomingMessageHandler(BasicMessageChannel basicMessageChannel, MessageHandler messageHandler, AnonymousClass1 anonymousClass1) {
            this(messageHandler);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler
        public void onMessage(ByteBuffer byteBuffer, final BinaryMessenger.BinaryReply binaryReply) {
            try {
                this.handler.onMessage(BasicMessageChannel.this.codec.decodeMessage(byteBuffer), new Reply<T>() { // from class: io.flutter.plugin.common.BasicMessageChannel.IncomingMessageHandler.1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                    public void reply(T t3) {
                        binaryReply.reply(BasicMessageChannel.this.codec.encodeMessage(t3));
                    }
                });
            } catch (RuntimeException e10) {
                Log.e(StubApp.getString2(18660) + BasicMessageChannel.this.name, StubApp.getString2(18661), e10);
                binaryReply.reply(null);
            }
        }

        private IncomingMessageHandler(MessageHandler<T> messageHandler) {
            this.handler = messageHandler;
        }
    }

    public final class IncomingReplyHandler implements BinaryMessenger.BinaryReply {
        private final Reply<T> callback;

        public /* synthetic */ IncomingReplyHandler(BasicMessageChannel basicMessageChannel, Reply reply, AnonymousClass1 anonymousClass1) {
            this(reply);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryReply
        public void reply(ByteBuffer byteBuffer) {
            try {
                this.callback.reply(BasicMessageChannel.this.codec.decodeMessage(byteBuffer));
            } catch (RuntimeException e10) {
                Log.e(StubApp.getString2(18660) + BasicMessageChannel.this.name, StubApp.getString2(18662), e10);
            }
        }

        private IncomingReplyHandler(Reply<T> reply) {
            this.callback = reply;
        }
    }

    public interface MessageHandler<T> {
        void onMessage(T t3, Reply<T> reply);
    }

    public interface Reply<T> {
        void reply(T t3);
    }

    public BasicMessageChannel(BinaryMessenger binaryMessenger, String str, MessageCodec<T> messageCodec) {
        this(binaryMessenger, str, messageCodec, null);
    }

    private static ByteBuffer packetFromEncodedMessage(ByteBuffer byteBuffer) {
        byteBuffer.flip();
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(remaining);
        allocateDirect.put(bArr);
        return allocateDirect;
    }

    public void resizeChannelBuffer(int i3) {
        resizeChannelBuffer(this.messenger, this.name, i3);
    }

    public void send(T t3) {
        send(t3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.flutter.plugin.common.BinaryMessenger] */
    /* JADX WARN: Type inference failed for: r1v0, types: [io.flutter.plugin.common.BasicMessageChannel$1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [io.flutter.plugin.common.BinaryMessenger$BinaryMessageHandler] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public void setMessageHandler(MessageHandler<T> messageHandler) {
        if (this.taskQueue != null) {
            this.messenger.setMessageHandler(this.name, messageHandler != null ? new IncomingMessageHandler(this, messageHandler, r1) : null, this.taskQueue);
        } else {
            this.messenger.setMessageHandler(this.name, messageHandler != null ? new IncomingMessageHandler(this, messageHandler, r1) : 0);
        }
    }

    public void setWarnsOnChannelOverflow(boolean z2) {
        setWarnsOnChannelOverflow(this.messenger, this.name, z2);
    }

    public BasicMessageChannel(BinaryMessenger binaryMessenger, String str, MessageCodec<T> messageCodec, BinaryMessenger.TaskQueue taskQueue) {
        this.messenger = binaryMessenger;
        this.name = str;
        this.codec = messageCodec;
        this.taskQueue = taskQueue;
    }

    public static void resizeChannelBuffer(BinaryMessenger binaryMessenger, String str, int i3) {
        binaryMessenger.send(StubApp.getString2(18663), packetFromEncodedMessage(StandardMethodCodec.INSTANCE.encodeMethodCall(new MethodCall(StubApp.getString2(17849), Arrays.asList(str, Integer.valueOf(i3))))));
    }

    public static void setWarnsOnChannelOverflow(BinaryMessenger binaryMessenger, String str, boolean z2) {
        binaryMessenger.send(StubApp.getString2(18663), packetFromEncodedMessage(StandardMethodCodec.INSTANCE.encodeMethodCall(new MethodCall(StubApp.getString2(18664), Arrays.asList(str, Boolean.valueOf(!z2))))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void send(T t3, Reply<T> reply) {
        this.messenger.send(this.name, this.codec.encodeMessage(t3), reply != null ? new IncomingReplyHandler(this, reply, 0 == true ? 1 : 0) : null);
    }
}
