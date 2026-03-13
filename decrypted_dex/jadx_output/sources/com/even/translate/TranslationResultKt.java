package com.even.translate;

import com.even.translate.TranslationEventOuterClass;
import com.google.protobuf.F;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/even/translate/TranslationResultKt;", "", "<init>", "()V", "Dsl", "translate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class TranslationResultKt {
    public static final TranslationResultKt INSTANCE = new TranslationResultKt();

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0010\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020\u0010J\u0006\u0010*\u001a\u00020\u0010J\u0006\u0010.\u001a\u00020\u0010J\u0006\u00102\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00198G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000eR$\u0010%\u001a\u00020$2\u0006\u0010\b\u001a\u00020$8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010+\u001a\u00020$2\u0006\u0010\b\u001a\u00020$8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R$\u0010/\u001a\u00020$2\u0006\u0010\b\u001a\u00020$8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010'\"\u0004\b1\u0010)¨\u00064"}, d2 = {"Lcom/even/translate/TranslationResultKt$Dsl;", "", "_builder", "Lcom/even/translate/TranslationEventOuterClass$TranslationResult$Builder;", "<init>", "(Lcom/even/translate/TranslationEventOuterClass$TranslationResult$Builder;)V", "_build", "Lcom/even/translate/TranslationEventOuterClass$TranslationResult;", "value", "", "original", "getOriginal", "()Ljava/lang/String;", "setOriginal", "(Ljava/lang/String;)V", "clearOriginal", "", "target", "getTarget", "setTarget", "clearTarget", "reason", "getReason", "setReason", "clearReason", "", "isFinal", "getIsFinal", "()Z", "setIsFinal", "(Z)V", "clearIsFinal", "sessionId", "getSessionId", "setSessionId", "clearSessionId", "", "id", "getId", "()J", "setId", "(J)V", "clearId", "offset", "getOffset", "setOffset", "clearOffset", "duration", "getDuration", "setDuration", "clearDuration", "Companion", "translate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final TranslationEventOuterClass.TranslationResult.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lcom/even/translate/TranslationResultKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/even/translate/TranslationResultKt$Dsl;", "builder", "Lcom/even/translate/TranslationEventOuterClass$TranslationResult$Builder;", "translate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(TranslationEventOuterClass.TranslationResult.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(TranslationEventOuterClass.TranslationResult.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ TranslationEventOuterClass.TranslationResult _build() {
            F m5build = this._builder.m5build();
            Intrinsics.checkNotNullExpressionValue(m5build, "build(...)");
            return (TranslationEventOuterClass.TranslationResult) m5build;
        }

        public final void clearDuration() {
            this._builder.clearDuration();
        }

        public final void clearId() {
            this._builder.clearId();
        }

        public final void clearIsFinal() {
            this._builder.clearIsFinal();
        }

        public final void clearOffset() {
            this._builder.clearOffset();
        }

        public final void clearOriginal() {
            this._builder.clearOriginal();
        }

        public final void clearReason() {
            this._builder.clearReason();
        }

        public final void clearSessionId() {
            this._builder.clearSessionId();
        }

        public final void clearTarget() {
            this._builder.clearTarget();
        }

        @JvmName(name = "getDuration")
        public final long getDuration() {
            return this._builder.getDuration();
        }

        @JvmName(name = "getId")
        public final long getId() {
            return this._builder.getId();
        }

        @JvmName(name = "getIsFinal")
        public final boolean getIsFinal() {
            return this._builder.getIsFinal();
        }

        @JvmName(name = "getOffset")
        public final long getOffset() {
            return this._builder.getOffset();
        }

        @JvmName(name = "getOriginal")
        public final String getOriginal() {
            String original = this._builder.getOriginal();
            Intrinsics.checkNotNullExpressionValue(original, "getOriginal(...)");
            return original;
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

        @JvmName(name = "getTarget")
        public final String getTarget() {
            String target = this._builder.getTarget();
            Intrinsics.checkNotNullExpressionValue(target, "getTarget(...)");
            return target;
        }

        @JvmName(name = "setDuration")
        public final void setDuration(long j) {
            this._builder.setDuration(j);
        }

        @JvmName(name = "setId")
        public final void setId(long j) {
            this._builder.setId(j);
        }

        @JvmName(name = "setIsFinal")
        public final void setIsFinal(boolean z2) {
            this._builder.setIsFinal(z2);
        }

        @JvmName(name = "setOffset")
        public final void setOffset(long j) {
            this._builder.setOffset(j);
        }

        @JvmName(name = "setOriginal")
        public final void setOriginal(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setOriginal(value);
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

        @JvmName(name = "setTarget")
        public final void setTarget(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTarget(value);
        }

        private Dsl(TranslationEventOuterClass.TranslationResult.Builder builder) {
            this._builder = builder;
        }
    }

    private TranslationResultKt() {
    }
}
