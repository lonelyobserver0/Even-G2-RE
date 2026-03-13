package com.even.translate;

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

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class TranslationEventOuterClass {

    /* renamed from: com.even.translate.TranslationEventOuterClass$1, reason: invalid class name */
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

    public static final class TranslationEvent extends F implements TranslationEventOrBuilder {
        private static final TranslationEvent DEFAULT_INSTANCE;
        private static volatile InterfaceC0746p0 PARSER = null;
        public static final int RESULT_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private TranslationResult result_;
        private int type_;

        public static final class Builder extends A implements TranslationEventOrBuilder {
            public /* synthetic */ Builder(int i3) {
                this();
            }

            public Builder clearResult() {
                copyOnWrite();
                ((TranslationEvent) this.instance).clearResult();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((TranslationEvent) this.instance).clearType();
                return this;
            }

            @Override // com.even.translate.TranslationEventOuterClass.TranslationEventOrBuilder
            public TranslationResult getResult() {
                return ((TranslationEvent) this.instance).getResult();
            }

            @Override // com.even.translate.TranslationEventOuterClass.TranslationEventOrBuilder
            public TranslationEventType getType() {
                return ((TranslationEvent) this.instance).getType();
            }

            @Override // com.even.translate.TranslationEventOuterClass.TranslationEventOrBuilder
            public int getTypeValue() {
                return ((TranslationEvent) this.instance).getTypeValue();
            }

            @Override // com.even.translate.TranslationEventOuterClass.TranslationEventOrBuilder
            public boolean hasResult() {
                return ((TranslationEvent) this.instance).hasResult();
            }

            public Builder mergeResult(TranslationResult translationResult) {
                copyOnWrite();
                ((TranslationEvent) this.instance).mergeResult(translationResult);
                return this;
            }

            public Builder setResult(TranslationResult translationResult) {
                copyOnWrite();
                ((TranslationEvent) this.instance).setResult(translationResult);
                return this;
            }

            public Builder setType(TranslationEventType translationEventType) {
                copyOnWrite();
                ((TranslationEvent) this.instance).setType(translationEventType);
                return this;
            }

            public Builder setTypeValue(int i3) {
                copyOnWrite();
                ((TranslationEvent) this.instance).setTypeValue(i3);
                return this;
            }

            private Builder() {
                super(TranslationEvent.DEFAULT_INSTANCE);
            }

            public Builder setResult(TranslationResult.Builder builder) {
                copyOnWrite();
                ((TranslationEvent) this.instance).setResult((TranslationResult) builder.m5build());
                return this;
            }
        }

        static {
            TranslationEvent translationEvent = new TranslationEvent();
            DEFAULT_INSTANCE = translationEvent;
            F.registerDefaultInstance(TranslationEvent.class, translationEvent);
        }

        private TranslationEvent() {
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

        public static TranslationEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeResult(TranslationResult translationResult) {
            translationResult.getClass();
            TranslationResult translationResult2 = this.result_;
            if (translationResult2 == null || translationResult2 == TranslationResult.getDefaultInstance()) {
                this.result_ = translationResult;
            } else {
                this.result_ = (TranslationResult) ((TranslationResult.Builder) TranslationResult.newBuilder(this.result_).mergeFrom((F) translationResult)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TranslationEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TranslationEvent) F.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TranslationEvent parseFrom(ByteBuffer byteBuffer) throws T {
            return (TranslationEvent) F.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static InterfaceC0746p0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResult(TranslationResult translationResult) {
            translationResult.getClass();
            this.result_ = translationResult;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(TranslationEventType translationEventType) {
            this.type_ = translationEventType.getNumber();
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
                    return new TranslationEvent();
                case 4:
                    return new Builder(0);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    InterfaceC0746p0 interfaceC0746p02 = PARSER;
                    if (interfaceC0746p02 != null) {
                        return interfaceC0746p02;
                    }
                    synchronized (TranslationEvent.class) {
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

        @Override // com.even.translate.TranslationEventOuterClass.TranslationEventOrBuilder
        public TranslationResult getResult() {
            TranslationResult translationResult = this.result_;
            return translationResult == null ? TranslationResult.getDefaultInstance() : translationResult;
        }

        @Override // com.even.translate.TranslationEventOuterClass.TranslationEventOrBuilder
        public TranslationEventType getType() {
            TranslationEventType forNumber = TranslationEventType.forNumber(this.type_);
            return forNumber == null ? TranslationEventType.UNRECOGNIZED : forNumber;
        }

        @Override // com.even.translate.TranslationEventOuterClass.TranslationEventOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.even.translate.TranslationEventOuterClass.TranslationEventOrBuilder
        public boolean hasResult() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(TranslationEvent translationEvent) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(translationEvent);
        }

        public static TranslationEvent parseDelimitedFrom(InputStream inputStream, C0750u c0750u) throws IOException {
            return (TranslationEvent) F.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c0750u);
        }

        public static TranslationEvent parseFrom(ByteBuffer byteBuffer, C0750u c0750u) throws T {
            return (TranslationEvent) F.parseFrom(DEFAULT_INSTANCE, byteBuffer, c0750u);
        }

        public static TranslationEvent parseFrom(AbstractC0733j abstractC0733j) throws T {
            return (TranslationEvent) F.parseFrom(DEFAULT_INSTANCE, abstractC0733j);
        }

        public static TranslationEvent parseFrom(AbstractC0733j abstractC0733j, C0750u c0750u) throws T {
            return (TranslationEvent) F.parseFrom(DEFAULT_INSTANCE, abstractC0733j, c0750u);
        }

        public static TranslationEvent parseFrom(byte[] bArr) throws T {
            return (TranslationEvent) F.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TranslationEvent parseFrom(byte[] bArr, C0750u c0750u) throws T {
            return (TranslationEvent) F.parseFrom(DEFAULT_INSTANCE, bArr, c0750u);
        }

        public static TranslationEvent parseFrom(InputStream inputStream) throws IOException {
            return (TranslationEvent) F.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TranslationEvent parseFrom(InputStream inputStream, C0750u c0750u) throws IOException {
            return (TranslationEvent) F.parseFrom(DEFAULT_INSTANCE, inputStream, c0750u);
        }

        public static TranslationEvent parseFrom(AbstractC0741n abstractC0741n) throws IOException {
            return (TranslationEvent) F.parseFrom(DEFAULT_INSTANCE, abstractC0741n);
        }

        public static TranslationEvent parseFrom(AbstractC0741n abstractC0741n, C0750u c0750u) throws IOException {
            return (TranslationEvent) F.parseFrom(DEFAULT_INSTANCE, abstractC0741n, c0750u);
        }
    }

    public interface TranslationEventOrBuilder extends InterfaceC0734j0 {
        @Override // com.google.protobuf.InterfaceC0734j0
        /* synthetic */ InterfaceC0732i0 getDefaultInstanceForType();

        TranslationResult getResult();

        TranslationEventType getType();

        int getTypeValue();

        boolean hasResult();

        /* synthetic */ boolean isInitialized();
    }

    public enum TranslationEventType implements J {
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
        private static final K internalValueMap = new K() { // from class: com.even.translate.TranslationEventOuterClass.TranslationEventType.1
            /* renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
            public TranslationEventType m2findValueByNumber(int i3) {
                return TranslationEventType.forNumber(i3);
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

        public static final class TranslationEventTypeVerifier implements L {
            static final L INSTANCE = new TranslationEventTypeVerifier();

            private TranslationEventTypeVerifier() {
            }

            @Override // com.google.protobuf.L
            public boolean isInRange(int i3) {
                return TranslationEventType.forNumber(i3) != null;
            }
        }

        TranslationEventType(int i3) {
            this.value = i3;
        }

        public static TranslationEventType forNumber(int i3) {
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
            return TranslationEventTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException(StubApp.getString2(10075));
        }

        @Deprecated
        public static TranslationEventType valueOf(int i3) {
            return forNumber(i3);
        }
    }

    public static final class TranslationResult extends F implements TranslationResultOrBuilder {
        private static final TranslationResult DEFAULT_INSTANCE;
        public static final int DURATION_FIELD_NUMBER = 8;
        public static final int ID_FIELD_NUMBER = 6;
        public static final int IS_FINAL_FIELD_NUMBER = 4;
        public static final int OFFSET_FIELD_NUMBER = 7;
        public static final int ORIGINAL_FIELD_NUMBER = 1;
        private static volatile InterfaceC0746p0 PARSER = null;
        public static final int REASON_FIELD_NUMBER = 3;
        public static final int SESSION_ID_FIELD_NUMBER = 5;
        public static final int TARGET_FIELD_NUMBER = 2;
        private long duration_;
        private long id_;
        private boolean isFinal_;
        private long offset_;
        private String original_ = "";
        private String target_ = "";
        private String reason_ = "";
        private String sessionId_ = "";

        public static final class Builder extends A implements TranslationResultOrBuilder {
            public /* synthetic */ Builder(int i3) {
                this();
            }

            public Builder clearDuration() {
                copyOnWrite();
                ((TranslationResult) this.instance).clearDuration();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((TranslationResult) this.instance).clearId();
                return this;
            }

            public Builder clearIsFinal() {
                copyOnWrite();
                ((TranslationResult) this.instance).clearIsFinal();
                return this;
            }

            public Builder clearOffset() {
                copyOnWrite();
                ((TranslationResult) this.instance).clearOffset();
                return this;
            }

            public Builder clearOriginal() {
                copyOnWrite();
                ((TranslationResult) this.instance).clearOriginal();
                return this;
            }

            public Builder clearReason() {
                copyOnWrite();
                ((TranslationResult) this.instance).clearReason();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((TranslationResult) this.instance).clearSessionId();
                return this;
            }

            public Builder clearTarget() {
                copyOnWrite();
                ((TranslationResult) this.instance).clearTarget();
                return this;
            }

            @Override // com.even.translate.TranslationEventOuterClass.TranslationResultOrBuilder
            public long getDuration() {
                return ((TranslationResult) this.instance).getDuration();
            }

            @Override // com.even.translate.TranslationEventOuterClass.TranslationResultOrBuilder
            public long getId() {
                return ((TranslationResult) this.instance).getId();
            }

            @Override // com.even.translate.TranslationEventOuterClass.TranslationResultOrBuilder
            public boolean getIsFinal() {
                return ((TranslationResult) this.instance).getIsFinal();
            }

            @Override // com.even.translate.TranslationEventOuterClass.TranslationResultOrBuilder
            public long getOffset() {
                return ((TranslationResult) this.instance).getOffset();
            }

            @Override // com.even.translate.TranslationEventOuterClass.TranslationResultOrBuilder
            public String getOriginal() {
                return ((TranslationResult) this.instance).getOriginal();
            }

            @Override // com.even.translate.TranslationEventOuterClass.TranslationResultOrBuilder
            public AbstractC0733j getOriginalBytes() {
                return ((TranslationResult) this.instance).getOriginalBytes();
            }

            @Override // com.even.translate.TranslationEventOuterClass.TranslationResultOrBuilder
            public String getReason() {
                return ((TranslationResult) this.instance).getReason();
            }

            @Override // com.even.translate.TranslationEventOuterClass.TranslationResultOrBuilder
            public AbstractC0733j getReasonBytes() {
                return ((TranslationResult) this.instance).getReasonBytes();
            }

            @Override // com.even.translate.TranslationEventOuterClass.TranslationResultOrBuilder
            public String getSessionId() {
                return ((TranslationResult) this.instance).getSessionId();
            }

            @Override // com.even.translate.TranslationEventOuterClass.TranslationResultOrBuilder
            public AbstractC0733j getSessionIdBytes() {
                return ((TranslationResult) this.instance).getSessionIdBytes();
            }

            @Override // com.even.translate.TranslationEventOuterClass.TranslationResultOrBuilder
            public String getTarget() {
                return ((TranslationResult) this.instance).getTarget();
            }

            @Override // com.even.translate.TranslationEventOuterClass.TranslationResultOrBuilder
            public AbstractC0733j getTargetBytes() {
                return ((TranslationResult) this.instance).getTargetBytes();
            }

            public Builder setDuration(long j) {
                copyOnWrite();
                ((TranslationResult) this.instance).setDuration(j);
                return this;
            }

            public Builder setId(long j) {
                copyOnWrite();
                ((TranslationResult) this.instance).setId(j);
                return this;
            }

            public Builder setIsFinal(boolean z2) {
                copyOnWrite();
                ((TranslationResult) this.instance).setIsFinal(z2);
                return this;
            }

            public Builder setOffset(long j) {
                copyOnWrite();
                ((TranslationResult) this.instance).setOffset(j);
                return this;
            }

            public Builder setOriginal(String str) {
                copyOnWrite();
                ((TranslationResult) this.instance).setOriginal(str);
                return this;
            }

            public Builder setOriginalBytes(AbstractC0733j abstractC0733j) {
                copyOnWrite();
                ((TranslationResult) this.instance).setOriginalBytes(abstractC0733j);
                return this;
            }

            public Builder setReason(String str) {
                copyOnWrite();
                ((TranslationResult) this.instance).setReason(str);
                return this;
            }

            public Builder setReasonBytes(AbstractC0733j abstractC0733j) {
                copyOnWrite();
                ((TranslationResult) this.instance).setReasonBytes(abstractC0733j);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((TranslationResult) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(AbstractC0733j abstractC0733j) {
                copyOnWrite();
                ((TranslationResult) this.instance).setSessionIdBytes(abstractC0733j);
                return this;
            }

            public Builder setTarget(String str) {
                copyOnWrite();
                ((TranslationResult) this.instance).setTarget(str);
                return this;
            }

            public Builder setTargetBytes(AbstractC0733j abstractC0733j) {
                copyOnWrite();
                ((TranslationResult) this.instance).setTargetBytes(abstractC0733j);
                return this;
            }

            private Builder() {
                super(TranslationResult.DEFAULT_INSTANCE);
            }
        }

        static {
            TranslationResult translationResult = new TranslationResult();
            DEFAULT_INSTANCE = translationResult;
            F.registerDefaultInstance(TranslationResult.class, translationResult);
        }

        private TranslationResult() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDuration() {
            this.duration_ = 0L;
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
        public void clearOffset() {
            this.offset_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOriginal() {
            this.original_ = getDefaultInstance().getOriginal();
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
        public void clearTarget() {
            this.target_ = getDefaultInstance().getTarget();
        }

        public static TranslationResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TranslationResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TranslationResult) F.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TranslationResult parseFrom(ByteBuffer byteBuffer) throws T {
            return (TranslationResult) F.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static InterfaceC0746p0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDuration(long j) {
            this.duration_ = j;
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
        public void setOffset(long j) {
            this.offset_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOriginal(String str) {
            str.getClass();
            this.original_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOriginalBytes(AbstractC0733j abstractC0733j) {
            AbstractC0719c.checkByteStringIsUtf8(abstractC0733j);
            this.original_ = abstractC0733j.n();
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
        public void setTarget(String str) {
            str.getClass();
            this.target_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTargetBytes(AbstractC0733j abstractC0733j) {
            AbstractC0719c.checkByteStringIsUtf8(abstractC0733j);
            this.target_ = abstractC0733j.n();
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
                    Object[] objArr = {StubApp.getString2(10076), StubApp.getString2(10077), StubApp.getString2(10078), StubApp.getString2(10079), StubApp.getString2(10080), StubApp.getString2(10081), StubApp.getString2(10082), StubApp.getString2(10083)};
                    return F.newMessageInfo(DEFAULT_INSTANCE, StubApp.getString2(10084), objArr);
                case 3:
                    return new TranslationResult();
                case 4:
                    return new Builder(0);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    InterfaceC0746p0 interfaceC0746p02 = PARSER;
                    if (interfaceC0746p02 != null) {
                        return interfaceC0746p02;
                    }
                    synchronized (TranslationResult.class) {
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

        @Override // com.even.translate.TranslationEventOuterClass.TranslationResultOrBuilder
        public long getDuration() {
            return this.duration_;
        }

        @Override // com.even.translate.TranslationEventOuterClass.TranslationResultOrBuilder
        public long getId() {
            return this.id_;
        }

        @Override // com.even.translate.TranslationEventOuterClass.TranslationResultOrBuilder
        public boolean getIsFinal() {
            return this.isFinal_;
        }

        @Override // com.even.translate.TranslationEventOuterClass.TranslationResultOrBuilder
        public long getOffset() {
            return this.offset_;
        }

        @Override // com.even.translate.TranslationEventOuterClass.TranslationResultOrBuilder
        public String getOriginal() {
            return this.original_;
        }

        @Override // com.even.translate.TranslationEventOuterClass.TranslationResultOrBuilder
        public AbstractC0733j getOriginalBytes() {
            return AbstractC0733j.d(this.original_);
        }

        @Override // com.even.translate.TranslationEventOuterClass.TranslationResultOrBuilder
        public String getReason() {
            return this.reason_;
        }

        @Override // com.even.translate.TranslationEventOuterClass.TranslationResultOrBuilder
        public AbstractC0733j getReasonBytes() {
            return AbstractC0733j.d(this.reason_);
        }

        @Override // com.even.translate.TranslationEventOuterClass.TranslationResultOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.even.translate.TranslationEventOuterClass.TranslationResultOrBuilder
        public AbstractC0733j getSessionIdBytes() {
            return AbstractC0733j.d(this.sessionId_);
        }

        @Override // com.even.translate.TranslationEventOuterClass.TranslationResultOrBuilder
        public String getTarget() {
            return this.target_;
        }

        @Override // com.even.translate.TranslationEventOuterClass.TranslationResultOrBuilder
        public AbstractC0733j getTargetBytes() {
            return AbstractC0733j.d(this.target_);
        }

        public static Builder newBuilder(TranslationResult translationResult) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(translationResult);
        }

        public static TranslationResult parseDelimitedFrom(InputStream inputStream, C0750u c0750u) throws IOException {
            return (TranslationResult) F.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c0750u);
        }

        public static TranslationResult parseFrom(ByteBuffer byteBuffer, C0750u c0750u) throws T {
            return (TranslationResult) F.parseFrom(DEFAULT_INSTANCE, byteBuffer, c0750u);
        }

        public static TranslationResult parseFrom(AbstractC0733j abstractC0733j) throws T {
            return (TranslationResult) F.parseFrom(DEFAULT_INSTANCE, abstractC0733j);
        }

        public static TranslationResult parseFrom(AbstractC0733j abstractC0733j, C0750u c0750u) throws T {
            return (TranslationResult) F.parseFrom(DEFAULT_INSTANCE, abstractC0733j, c0750u);
        }

        public static TranslationResult parseFrom(byte[] bArr) throws T {
            return (TranslationResult) F.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TranslationResult parseFrom(byte[] bArr, C0750u c0750u) throws T {
            return (TranslationResult) F.parseFrom(DEFAULT_INSTANCE, bArr, c0750u);
        }

        public static TranslationResult parseFrom(InputStream inputStream) throws IOException {
            return (TranslationResult) F.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TranslationResult parseFrom(InputStream inputStream, C0750u c0750u) throws IOException {
            return (TranslationResult) F.parseFrom(DEFAULT_INSTANCE, inputStream, c0750u);
        }

        public static TranslationResult parseFrom(AbstractC0741n abstractC0741n) throws IOException {
            return (TranslationResult) F.parseFrom(DEFAULT_INSTANCE, abstractC0741n);
        }

        public static TranslationResult parseFrom(AbstractC0741n abstractC0741n, C0750u c0750u) throws IOException {
            return (TranslationResult) F.parseFrom(DEFAULT_INSTANCE, abstractC0741n, c0750u);
        }
    }

    public interface TranslationResultOrBuilder extends InterfaceC0734j0 {
        @Override // com.google.protobuf.InterfaceC0734j0
        /* synthetic */ InterfaceC0732i0 getDefaultInstanceForType();

        long getDuration();

        long getId();

        boolean getIsFinal();

        long getOffset();

        String getOriginal();

        AbstractC0733j getOriginalBytes();

        String getReason();

        AbstractC0733j getReasonBytes();

        String getSessionId();

        AbstractC0733j getSessionIdBytes();

        String getTarget();

        AbstractC0733j getTargetBytes();

        /* synthetic */ boolean isInitialized();
    }

    private TranslationEventOuterClass() {
    }

    public static void registerAllExtensions(C0750u c0750u) {
    }
}
