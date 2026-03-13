package transcribe;

import com.google.protobuf.F;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import transcribe.TranscribeEventOuterClass;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ltranscribe/TranscribeResultKt;", "", "<init>", "()V", "Dsl", "flutter_ezw_asr_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class TranscribeResultKt {
    public static final TranscribeResultKt INSTANCE = new TranscribeResultKt();

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010J\u0006\u0010&\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR$\u0010!\u001a\u00020 2\u0006\u0010\b\u001a\u00020 8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006("}, d2 = {"Ltranscribe/TranscribeResultKt$Dsl;", "", "_builder", "Ltranscribe/TranscribeEventOuterClass$TranscribeResult$Builder;", "<init>", "(Ltranscribe/TranscribeEventOuterClass$TranscribeResult$Builder;)V", "_build", "Ltranscribe/TranscribeEventOuterClass$TranscribeResult;", "value", "", "text", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "clearText", "", "reason", "getReason", "setReason", "clearReason", "", "isFinal", "getIsFinal", "()Z", "setIsFinal", "(Z)V", "clearIsFinal", "sessionId", "getSessionId", "setSessionId", "clearSessionId", "", "id", "getId", "()J", "setId", "(J)V", "clearId", "Companion", "flutter_ezw_asr_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final TranscribeEventOuterClass.TranscribeResult.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Ltranscribe/TranscribeResultKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Ltranscribe/TranscribeResultKt$Dsl;", "builder", "Ltranscribe/TranscribeEventOuterClass$TranscribeResult$Builder;", "flutter_ezw_asr_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(TranscribeEventOuterClass.TranscribeResult.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(TranscribeEventOuterClass.TranscribeResult.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ TranscribeEventOuterClass.TranscribeResult _build() {
            F m5build = this._builder.m5build();
            Intrinsics.checkNotNullExpressionValue(m5build, "build(...)");
            return (TranscribeEventOuterClass.TranscribeResult) m5build;
        }

        public final void clearId() {
            this._builder.clearId();
        }

        public final void clearIsFinal() {
            this._builder.clearIsFinal();
        }

        public final void clearReason() {
            this._builder.clearReason();
        }

        public final void clearSessionId() {
            this._builder.clearSessionId();
        }

        public final void clearText() {
            this._builder.clearText();
        }

        @JvmName(name = "getId")
        public final long getId() {
            return this._builder.getId();
        }

        @JvmName(name = "getIsFinal")
        public final boolean getIsFinal() {
            return this._builder.getIsFinal();
        }

        @JvmName(name = "getReason")
        public final String getReason() {
            String reason = this._builder.getReason();
            Intrinsics.checkNotNullExpressionValue(reason, "getReason(...)");
            return reason;
        }

        @JvmName(name = "getSessionId")
        public final String getSessionId() {
            String sessionId = this._builder.getSessionId();
            Intrinsics.checkNotNullExpressionValue(sessionId, "getSessionId(...)");
            return sessionId;
        }

        @JvmName(name = "getText")
        public final String getText() {
            String text = this._builder.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            return text;
        }

        @JvmName(name = "setId")
        public final void setId(long j) {
            this._builder.setId(j);
        }

        @JvmName(name = "setIsFinal")
        public final void setIsFinal(boolean z2) {
            this._builder.setIsFinal(z2);
        }

        @JvmName(name = "setReason")
        public final void setReason(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setReason(value);
        }

        @JvmName(name = "setSessionId")
        public final void setSessionId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSessionId(value);
        }

        @JvmName(name = "setText")
        public final void setText(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setText(value);
        }

        private Dsl(TranscribeEventOuterClass.TranscribeResult.Builder builder) {
            this._builder = builder;
        }
    }

    private TranscribeResultKt() {
    }
}
