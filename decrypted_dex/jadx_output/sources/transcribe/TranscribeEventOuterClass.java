package transcribe;

import com.google.protobuf.A;
import com.google.protobuf.AbstractC0719c;
import com.google.protobuf.AbstractC0733j;
import com.google.protobuf.AbstractC0741n;
import com.google.protobuf.B;
import com.google.protobuf.C0750u;
import com.google.protobuf.E;
import com.google.protobuf.F;
import com.google.protobuf.InterfaceC0732i0;
import com.google.protobuf.InterfaceC0734j0;
import com.google.protobuf.InterfaceC0746p0;
import com.google.protobuf.J;
import com.google.protobuf.K;
import com.google.protobuf.L;
import com.google.protobuf.T;
import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class TranscribeEventOuterClass {

    /* renamed from: transcribe.TranscribeEventOuterClass$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[E.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class TranscribeEvent extends F implements TranscribeEventOrBuilder {
        private static final TranscribeEvent DEFAULT_INSTANCE;
        private static volatile InterfaceC0746p0 PARSER = null;
        public static final int RESULT_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private TranscribeResult result_;
        private int type_;

        public static final class Builder extends A implements TranscribeEventOrBuilder {
            public /* synthetic */ Builder(int i3) {
                this();
            }

            public Builder clearResult() {
                copyOnWrite();
                ((TranscribeEvent) this.instance).clearResult();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((TranscribeEvent) this.instance).clearType();
                return this;
            }

            @Override // transcribe.TranscribeEventOuterClass.TranscribeEventOrBuilder
            public TranscribeResult getResult() {
                return ((TranscribeEvent) this.instance).getResult();
            }

            @Override // transcribe.TranscribeEventOuterClass.TranscribeEventOrBuilder
            public TranscribeEventType getType() {
                return ((TranscribeEvent) this.instance).getType();
            }

            @Override // transcribe.TranscribeEventOuterClass.TranscribeEventOrBuilder
            public int getTypeValue() {
                return ((TranscribeEvent) this.instance).getTypeValue();
            }

            @Override // transcribe.TranscribeEventOuterClass.TranscribeEventOrBuilder
            public boolean hasResult() {
                return ((TranscribeEvent) this.instance).hasResult();
            }

            public Builder mergeResult(TranscribeResult transcribeResult) {
                copyOnWrite();
                ((TranscribeEvent) this.instance).mergeResult(transcribeResult);
                return this;
            }

            public Builder setResult(TranscribeResult transcribeResult) {
                copyOnWrite();
                ((TranscribeEvent) this.instance).setResult(transcribeResult);
                return this;
            }

            public Builder setType(TranscribeEventType transcribeEventType) {
                copyOnWrite();
                ((TranscribeEvent) this.instance).setType(transcribeEventType);
                return this;
            }

            public Builder setTypeValue(int i3) {
                copyOnWrite();
                ((TranscribeEvent) this.instance).setTypeValue(i3);
                return this;
            }

            private Builder() {
                super(TranscribeEvent.DEFAULT_INSTANCE);
            }

            public Builder setResult(TranscribeResult.Builder builder) {
                copyOnWrite();
                ((TranscribeEvent) this.instance).setResult((TranscribeResult) builder.m5build());
                return this;
            }
        }

        static {
            TranscribeEvent transcribeEvent = new TranscribeEvent();
            DEFAULT_INSTANCE = transcribeEvent;
            F.registerDefaultInstance(TranscribeEvent.class, transcribeEvent);
        }

        private TranscribeEvent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResult() {
            this.result_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static TranscribeEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeResult(TranscribeResult transcribeResult) {
            transcribeResult.getClass();
            TranscribeResult transcribeResult2 = this.result_;
            if (transcribeResult2 == null || transcribeResult2 == TranscribeResult.getDefaultInstance()) {
                this.result_ = transcribeResult;
            } else {
                this.result_ = (TranscribeResult) ((TranscribeResult.Builder) TranscribeResult.newBuilder(this.result_).mergeFrom((F) transcribeResult)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TranscribeEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TranscribeEvent) F.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TranscribeEvent parseFrom(ByteBuffer byteBuffer) throws T {
            return (TranscribeEvent) F.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static InterfaceC0746p0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResult(TranscribeResult transcribeResult) {
            transcribeResult.getClass();
            this.result_ = transcribeResult;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(TranscribeEventType transcribeEventType) {
            this.type_ = transcribeEventType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i3) {
            this.type_ = i3;
        }

        @Override // com.google.protobuf.F
        public final Object dynamicMethod(E e10, Object obj, Object obj2) {
            InterfaceC0746p0 interfaceC0746p0;
            switch (e10.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] objArr = {StubApp.getString2(10064), StubApp.getString2(10065), StubApp.getString2(10066)};
                    return F.newMessageInfo(DEFAULT_INSTANCE, StubApp.getString2(10067), objArr);
                case 3:
                    return new TranscribeEvent();
                case 4:
                    return new Builder(0);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    InterfaceC0746p0 interfaceC0746p02 = PARSER;
                    if (interfaceC0746p02 != null) {
                        return interfaceC0746p02;
                    }
                    synchronized (TranscribeEvent.class) {
                        try {
                            interfaceC0746p0 = PARSER;
                            if (interfaceC0746p0 == null) {
                                interfaceC0746p0 = new B();
                                PARSER = interfaceC0746p0;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return interfaceC0746p0;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // transcribe.TranscribeEventOuterClass.TranscribeEventOrBuilder
        public TranscribeResult getResult() {
            TranscribeResult transcribeResult = this.result_;
            return transcribeResult == null ? TranscribeResult.getDefaultInstance() : transcribeResult;
        }

        @Override // transcribe.TranscribeEventOuterClass.TranscribeEventOrBuilder
        public TranscribeEventType getType() {
            TranscribeEventType forNumber = TranscribeEventType.forNumber(this.type_);
            return forNumber == null ? TranscribeEventType.UNRECOGNIZED : forNumber;
        }

        @Override // transcribe.TranscribeEventOuterClass.TranscribeEventOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // transcribe.TranscribeEventOuterClass.TranscribeEventOrBuilder
        public boolean hasResult() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(TranscribeEvent transcribeEvent) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(transcribeEvent);
        }

        public static TranscribeEvent parseDelimitedFrom(InputStream inputStream, C0750u c0750u) throws IOException {
            return (TranscribeEvent) F.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c0750u);
        }

        public static TranscribeEvent parseFrom(ByteBuffer byteBuffer, C0750u c0750u) throws T {
            return (TranscribeEvent) F.parseFrom(DEFAULT_INSTANCE, byteBuffer, c0750u);
        }

        public static TranscribeEvent parseFrom(AbstractC0733j abstractC0733j) throws T {
            return (TranscribeEvent) F.parseFrom(DEFAULT_INSTANCE, abstractC0733j);
        }

        public static TranscribeEvent parseFrom(AbstractC0733j abstractC0733j, C0750u c0750u) throws T {
            return (TranscribeEvent) F.parseFrom(DEFAULT_INSTANCE, abstractC0733j, c0750u);
        }

        public static TranscribeEvent parseFrom(byte[] bArr) throws T {
            return (TranscribeEvent) F.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TranscribeEvent parseFrom(byte[] bArr, C0750u c0750u) throws T {
            return (TranscribeEvent) F.parseFrom(DEFAULT_INSTANCE, bArr, c0750u);
        }

        public static TranscribeEvent parseFrom(InputStream inputStream) throws IOException {
            return (TranscribeEvent) F.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TranscribeEvent parseFrom(InputStream inputStream, C0750u c0750u) throws IOException {
            return (TranscribeEvent) F.parseFrom(DEFAULT_INSTANCE, inputStream, c0750u);
        }

        public static TranscribeEvent parseFrom(AbstractC0741n abstractC0741n) throws IOException {
            return (TranscribeEvent) F.parseFrom(DEFAULT_INSTANCE, abstractC0741n);
        }

        public static TranscribeEvent parseFrom(AbstractC0741n abstractC0741n, C0750u c0750u) throws IOException {
            return (TranscribeEvent) F.parseFrom(DEFAULT_INSTANCE, abstractC0741n, c0750u);
        }
    }

    public interface TranscribeEventOrBuilder extends InterfaceC0734j0 {
        @Override // com.google.protobuf.InterfaceC0734j0
        /* synthetic */ InterfaceC0732i0 getDefaultInstanceForType();

        TranscribeResult getResult();

        TranscribeEventType getType();

        int getTypeValue();

        boolean hasResult();

        /* synthetic */ boolean isInitialized();
    }

    public enum TranscribeEventType implements J {
        recognizing(0),
        recognized(1),
        synthesizing(2),
        sessionStarted(3),
        sessionStopped(4),
        speechStartDetected(5),
        speechEndDetected(6),
        canceled(7),
        error(8),
        UNRECOGNIZED(-1);

        public static final int canceled_VALUE = 7;
        public static final int error_VALUE = 8;
        private static final K internalValueMap = new K() { // from class: transcribe.TranscribeEventOuterClass.TranscribeEventType.1
            public TranscribeEventType findValueByNumber(int i3) {
                return TranscribeEventType.forNumber(i3);
            }
        };
        public static final int recognized_VALUE = 1;
        public static final int recognizing_VALUE = 0;
        public static final int sessionStarted_VALUE = 3;
        public static final int sessionStopped_VALUE = 4;
        public static final int speechEndDetected_VALUE = 6;
        public static final int speechStartDetected_VALUE = 5;
        public static final int synthesizing_VALUE = 2;
        private final int value;

        public static final class TranscribeEventTypeVerifier implements L {
            static final L INSTANCE = new TranscribeEventTypeVerifier();

            private TranscribeEventTypeVerifier() {
            }

            @Override // com.google.protobuf.L
            public boolean isInRange(int i3) {
                return TranscribeEventType.forNumber(i3) != null;
            }
        }

        TranscribeEventType(int i3) {
            this.value = i3;
        }

        public static TranscribeEventType forNumber(int i3) {
            switch (i3) {
                case 0:
                    return recognizing;
                case 1:
                    return recognized;
                case 2:
                    return synthesizing;
                case 3:
                    return sessionStarted;
                case 4:
                    return sessionStopped;
                case 5:
                    return speechStartDetected;
                case 6:
                    return speechEndDetected;
                case 7:
                    return canceled;
                case 8:
                    return error;
                default:
                    return null;
            }
        }

        public static K internalGetValueMap() {
            return internalValueMap;
        }

        public static L internalGetVerifier() {
            return TranscribeEventTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException(StubApp.getString2(10075));
        }

        @Deprecated
        public static TranscribeEventType valueOf(int i3) {
            return forNumber(i3);
        }
    }

    public static final class TranscribeResult extends F implements TranscribeResultOrBuilder {
        private static final TranscribeResult DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 5;
        public static final int IS_FINAL_FIELD_NUMBER = 3;
        private static volatile InterfaceC0746p0 PARSER = null;
        public static final int REASON_FIELD_NUMBER = 2;
        public static final int SESSION_ID_FIELD_NUMBER = 4;
        public static final int TEXT_FIELD_NUMBER = 1;
        private long id_;
        private boolean isFinal_;
        private String text_ = "";
        private String reason_ = "";
        private String sessionId_ = "";

        public static final class Builder extends A implements TranscribeResultOrBuilder {
            public /* synthetic */ Builder(int i3) {
                this();
            }

            public Builder clearId() {
                copyOnWrite();
                ((TranscribeResult) this.instance).clearId();
                return this;
            }

            public Builder clearIsFinal() {
                copyOnWrite();
                ((TranscribeResult) this.instance).clearIsFinal();
                return this;
            }

            public Builder clearReason() {
                copyOnWrite();
                ((TranscribeResult) this.instance).clearReason();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((TranscribeResult) this.instance).clearSessionId();
                return this;
            }

            public Builder clearText() {
                copyOnWrite();
                ((TranscribeResult) this.instance).clearText();
                return this;
            }

            @Override // transcribe.TranscribeEventOuterClass.TranscribeResultOrBuilder
            public long getId() {
                return ((TranscribeResult) this.instance).getId();
            }

            @Override // transcribe.TranscribeEventOuterClass.TranscribeResultOrBuilder
            public boolean getIsFinal() {
                return ((TranscribeResult) this.instance).getIsFinal();
            }

            @Override // transcribe.TranscribeEventOuterClass.TranscribeResultOrBuilder
            public String getReason() {
                return ((TranscribeResult) this.instance).getReason();
            }

            @Override // transcribe.TranscribeEventOuterClass.TranscribeResultOrBuilder
            public AbstractC0733j getReasonBytes() {
                return ((TranscribeResult) this.instance).getReasonBytes();
            }

            @Override // transcribe.TranscribeEventOuterClass.TranscribeResultOrBuilder
            public String getSessionId() {
                return ((TranscribeResult) this.instance).getSessionId();
            }

            @Override // transcribe.TranscribeEventOuterClass.TranscribeResultOrBuilder
            public AbstractC0733j getSessionIdBytes() {
                return ((TranscribeResult) this.instance).getSessionIdBytes();
            }

            @Override // transcribe.TranscribeEventOuterClass.TranscribeResultOrBuilder
            public String getText() {
                return ((TranscribeResult) this.instance).getText();
            }

            @Override // transcribe.TranscribeEventOuterClass.TranscribeResultOrBuilder
            public AbstractC0733j getTextBytes() {
                return ((TranscribeResult) this.instance).getTextBytes();
            }

            public Builder setId(long j) {
                copyOnWrite();
                ((TranscribeResult) this.instance).setId(j);
                return this;
            }

            public Builder setIsFinal(boolean z2) {
                copyOnWrite();
                ((TranscribeResult) this.instance).setIsFinal(z2);
                return this;
            }

            public Builder setReason(String str) {
                copyOnWrite();
                ((TranscribeResult) this.instance).setReason(str);
                return this;
            }

            public Builder setReasonBytes(AbstractC0733j abstractC0733j) {
                copyOnWrite();
                ((TranscribeResult) this.instance).setReasonBytes(abstractC0733j);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((TranscribeResult) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(AbstractC0733j abstractC0733j) {
                copyOnWrite();
                ((TranscribeResult) this.instance).setSessionIdBytes(abstractC0733j);
                return this;
            }

            public Builder setText(String str) {
                copyOnWrite();
                ((TranscribeResult) this.instance).setText(str);
                return this;
            }

            public Builder setTextBytes(AbstractC0733j abstractC0733j) {
                copyOnWrite();
                ((TranscribeResult) this.instance).setTextBytes(abstractC0733j);
                return this;
            }

            private Builder() {
                super(TranscribeResult.DEFAULT_INSTANCE);
            }
        }

        static {
            TranscribeResult transcribeResult = new TranscribeResult();
            DEFAULT_INSTANCE = transcribeResult;
            F.registerDefaultInstance(TranscribeResult.class, transcribeResult);
        }

        private TranscribeResult() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsFinal() {
            this.isFinal_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReason() {
            this.reason_ = getDefaultInstance().getReason();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearText() {
            this.text_ = getDefaultInstance().getText();
        }

        public static TranscribeResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TranscribeResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TranscribeResult) F.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TranscribeResult parseFrom(ByteBuffer byteBuffer) throws T {
            return (TranscribeResult) F.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static InterfaceC0746p0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(long j) {
            this.id_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsFinal(boolean z2) {
            this.isFinal_ = z2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReason(String str) {
            str.getClass();
            this.reason_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReasonBytes(AbstractC0733j abstractC0733j) {
            AbstractC0719c.checkByteStringIsUtf8(abstractC0733j);
            this.reason_ = abstractC0733j.n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionIdBytes(AbstractC0733j abstractC0733j) {
            AbstractC0719c.checkByteStringIsUtf8(abstractC0733j);
            this.sessionId_ = abstractC0733j.n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setText(String str) {
            str.getClass();
            this.text_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextBytes(AbstractC0733j abstractC0733j) {
            AbstractC0719c.checkByteStringIsUtf8(abstractC0733j);
            this.text_ = abstractC0733j.n();
        }

        @Override // com.google.protobuf.F
        public final Object dynamicMethod(E e10, Object obj, Object obj2) {
            InterfaceC0746p0 interfaceC0746p0;
            switch (e10.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    Object[] objArr = {StubApp.getString2(35391), StubApp.getString2(10078), StubApp.getString2(10079), StubApp.getString2(10080), StubApp.getString2(10081)};
                    return F.newMessageInfo(DEFAULT_INSTANCE, StubApp.getString2(35392), objArr);
                case 3:
                    return new TranscribeResult();
                case 4:
                    return new Builder(0);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    InterfaceC0746p0 interfaceC0746p02 = PARSER;
                    if (interfaceC0746p02 != null) {
                        return interfaceC0746p02;
                    }
                    synchronized (TranscribeResult.class) {
                        try {
                            interfaceC0746p0 = PARSER;
                            if (interfaceC0746p0 == null) {
                                interfaceC0746p0 = new B();
                                PARSER = interfaceC0746p0;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return interfaceC0746p0;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // transcribe.TranscribeEventOuterClass.TranscribeResultOrBuilder
        public long getId() {
            return this.id_;
        }

        @Override // transcribe.TranscribeEventOuterClass.TranscribeResultOrBuilder
        public boolean getIsFinal() {
            return this.isFinal_;
        }

        @Override // transcribe.TranscribeEventOuterClass.TranscribeResultOrBuilder
        public String getReason() {
            return this.reason_;
        }

        @Override // transcribe.TranscribeEventOuterClass.TranscribeResultOrBuilder
        public AbstractC0733j getReasonBytes() {
            return AbstractC0733j.d(this.reason_);
        }

        @Override // transcribe.TranscribeEventOuterClass.TranscribeResultOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // transcribe.TranscribeEventOuterClass.TranscribeResultOrBuilder
        public AbstractC0733j getSessionIdBytes() {
            return AbstractC0733j.d(this.sessionId_);
        }

        @Override // transcribe.TranscribeEventOuterClass.TranscribeResultOrBuilder
        public String getText() {
            return this.text_;
        }

        @Override // transcribe.TranscribeEventOuterClass.TranscribeResultOrBuilder
        public AbstractC0733j getTextBytes() {
            return AbstractC0733j.d(this.text_);
        }

        public static Builder newBuilder(TranscribeResult transcribeResult) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(transcribeResult);
        }

        public static TranscribeResult parseDelimitedFrom(InputStream inputStream, C0750u c0750u) throws IOException {
            return (TranscribeResult) F.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c0750u);
        }

        public static TranscribeResult parseFrom(ByteBuffer byteBuffer, C0750u c0750u) throws T {
            return (TranscribeResult) F.parseFrom(DEFAULT_INSTANCE, byteBuffer, c0750u);
        }

        public static TranscribeResult parseFrom(AbstractC0733j abstractC0733j) throws T {
            return (TranscribeResult) F.parseFrom(DEFAULT_INSTANCE, abstractC0733j);
        }

        public static TranscribeResult parseFrom(AbstractC0733j abstractC0733j, C0750u c0750u) throws T {
            return (TranscribeResult) F.parseFrom(DEFAULT_INSTANCE, abstractC0733j, c0750u);
        }

        public static TranscribeResult parseFrom(byte[] bArr) throws T {
            return (TranscribeResult) F.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TranscribeResult parseFrom(byte[] bArr, C0750u c0750u) throws T {
            return (TranscribeResult) F.parseFrom(DEFAULT_INSTANCE, bArr, c0750u);
        }

        public static TranscribeResult parseFrom(InputStream inputStream) throws IOException {
            return (TranscribeResult) F.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TranscribeResult parseFrom(InputStream inputStream, C0750u c0750u) throws IOException {
            return (TranscribeResult) F.parseFrom(DEFAULT_INSTANCE, inputStream, c0750u);
        }

        public static TranscribeResult parseFrom(AbstractC0741n abstractC0741n) throws IOException {
            return (TranscribeResult) F.parseFrom(DEFAULT_INSTANCE, abstractC0741n);
        }

        public static TranscribeResult parseFrom(AbstractC0741n abstractC0741n, C0750u c0750u) throws IOException {
            return (TranscribeResult) F.parseFrom(DEFAULT_INSTANCE, abstractC0741n, c0750u);
        }
    }

    public interface TranscribeResultOrBuilder extends InterfaceC0734j0 {
        @Override // com.google.protobuf.InterfaceC0734j0
        /* synthetic */ InterfaceC0732i0 getDefaultInstanceForType();

        long getId();

        boolean getIsFinal();

        String getReason();

        AbstractC0733j getReasonBytes();

        String getSessionId();

        AbstractC0733j getSessionIdBytes();

        String getText();

        AbstractC0733j getTextBytes();

        /* synthetic */ boolean isInitialized();
    }

    private TranscribeEventOuterClass() {
    }

    public static void registerAllExtensions(C0750u c0750u) {
    }
}
