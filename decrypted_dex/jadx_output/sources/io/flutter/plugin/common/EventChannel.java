package io.flutter.plugin.common;

import android.util.Log;
import com.stub.StubApp;
import io.flutter.plugin.common.BinaryMessenger;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class EventChannel {
    private static final String TAG = StubApp.getString2(18666);
    private final MethodCodec codec;
    private final BinaryMessenger messenger;
    private final String name;
    private final BinaryMessenger.TaskQueue taskQueue;

    /* renamed from: io.flutter.plugin.common.EventChannel$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public interface EventSink {
        void endOfStream();

        void error(String str, String str2, Object obj);

        void success(Object obj);
    }

    public final class IncomingStreamRequestHandler implements BinaryMessenger.BinaryMessageHandler {
        private final AtomicReference<EventSink> activeSink = new AtomicReference<>(null);
        private final StreamHandler handler;

        public IncomingStreamRequestHandler(StreamHandler streamHandler) {
            this.handler = streamHandler;
        }

        private void onCancel(Object obj, BinaryMessenger.BinaryReply binaryReply) {
            EventSink andSet = this.activeSink.getAndSet(null);
            String string2 = StubApp.getString2(435);
            if (andSet == null) {
                binaryReply.reply(EventChannel.this.codec.encodeErrorEnvelope(string2, StubApp.getString2(18668), null));
                return;
            }
            try {
                this.handler.onCancel(obj);
                binaryReply.reply(EventChannel.this.codec.encodeSuccessEnvelope(null));
            } catch (RuntimeException e10) {
                Log.e(StubApp.getString2(18666) + EventChannel.this.name, StubApp.getString2(18667), e10);
                binaryReply.reply(EventChannel.this.codec.encodeErrorEnvelope(string2, e10.getMessage(), null));
            }
        }

        private void onListen(Object obj, BinaryMessenger.BinaryReply binaryReply) {
            EventSinkImplementation eventSinkImplementation = new EventSinkImplementation(this, null);
            EventSink andSet = this.activeSink.getAndSet(eventSinkImplementation);
            String string2 = StubApp.getString2(18666);
            if (andSet != null) {
                try {
                    this.handler.onCancel(null);
                } catch (RuntimeException e10) {
                    Log.e(string2 + EventChannel.this.name, StubApp.getString2(18669), e10);
                }
            }
            try {
                this.handler.onListen(obj, eventSinkImplementation);
                binaryReply.reply(EventChannel.this.codec.encodeSuccessEnvelope(null));
            } catch (RuntimeException e11) {
                this.activeSink.set(null);
                Log.e(string2 + EventChannel.this.name, StubApp.getString2(18670), e11);
                binaryReply.reply(EventChannel.this.codec.encodeErrorEnvelope(StubApp.getString2(435), e11.getMessage(), null));
            }
        }

        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler
        public void onMessage(ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
            MethodCall decodeMethodCall = EventChannel.this.codec.decodeMethodCall(byteBuffer);
            if (decodeMethodCall.method.equals(StubApp.getString2(18671))) {
                onListen(decodeMethodCall.arguments, binaryReply);
            } else if (decodeMethodCall.method.equals(StubApp.getString2(6385))) {
                onCancel(decodeMethodCall.arguments, binaryReply);
            } else {
                binaryReply.reply(null);
            }
        }

        public final class EventSinkImplementation implements EventSink {
            final AtomicBoolean hasEnded;

            private EventSinkImplementation() {
                this.hasEnded = new AtomicBoolean(false);
            }

            @Override // io.flutter.plugin.common.EventChannel.EventSink
            public void endOfStream() {
                if (this.hasEnded.getAndSet(true) || IncomingStreamRequestHandler.this.activeSink.get() != this) {
                    return;
                }
                EventChannel.this.messenger.send(EventChannel.this.name, null);
            }

            @Override // io.flutter.plugin.common.EventChannel.EventSink
            public void error(String str, String str2, Object obj) {
                if (this.hasEnded.get() || IncomingStreamRequestHandler.this.activeSink.get() != this) {
                    return;
                }
                EventChannel.this.messenger.send(EventChannel.this.name, EventChannel.this.codec.encodeErrorEnvelope(str, str2, obj));
            }

            @Override // io.flutter.plugin.common.EventChannel.EventSink
            public void success(Object obj) {
                if (this.hasEnded.get() || IncomingStreamRequestHandler.this.activeSink.get() != this) {
                    return;
                }
                EventChannel.this.messenger.send(EventChannel.this.name, EventChannel.this.codec.encodeSuccessEnvelope(obj));
            }

            public /* synthetic */ EventSinkImplementation(IncomingStreamRequestHandler incomingStreamRequestHandler, AnonymousClass1 anonymousClass1) {
                this();
            }
        }
    }

    public interface StreamHandler {
        void onCancel(Object obj);

        void onListen(Object obj, EventSink eventSink);
    }

    public EventChannel(BinaryMessenger binaryMessenger, String str) {
        this(binaryMessenger, str, StandardMethodCodec.INSTANCE);
    }

    public void setStreamHandler(StreamHandler streamHandler) {
        if (this.taskQueue != null) {
            this.messenger.setMessageHandler(this.name, streamHandler != null ? new IncomingStreamRequestHandler(streamHandler) : null, this.taskQueue);
        } else {
            this.messenger.setMessageHandler(this.name, streamHandler != null ? new IncomingStreamRequestHandler(streamHandler) : null);
        }
    }

    public EventChannel(BinaryMessenger binaryMessenger, String str, MethodCodec methodCodec) {
        this(binaryMessenger, str, methodCodec, null);
    }

    public EventChannel(BinaryMessenger binaryMessenger, String str, MethodCodec methodCodec, BinaryMessenger.TaskQueue taskQueue) {
        this.messenger = binaryMessenger;
        this.name = str;
        this.codec = methodCodec;
        this.taskQueue = taskQueue;
    }
}
