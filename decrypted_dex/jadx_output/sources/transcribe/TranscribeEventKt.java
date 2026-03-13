package transcribe;

import com.google.protobuf.F;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import transcribe.TranscribeEventOuterClass;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ltranscribe/TranscribeEventKt;", "", "<init>", "()V", "Dsl", "flutter_ezw_asr_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class TranscribeEventKt {
    public static final TranscribeEventKt INSTANCE = new TranscribeEventKt();

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u001d\u001a\u00020\u0016J\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00178G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Ltranscribe/TranscribeEventKt$Dsl;", "", "_builder", "Ltranscribe/TranscribeEventOuterClass$TranscribeEvent$Builder;", "<init>", "(Ltranscribe/TranscribeEventOuterClass$TranscribeEvent$Builder;)V", "_build", "Ltranscribe/TranscribeEventOuterClass$TranscribeEvent;", "value", "Ltranscribe/TranscribeEventOuterClass$TranscribeEventType;", "type", "getType", "()Ltranscribe/TranscribeEventOuterClass$TranscribeEventType;", "setType", "(Ltranscribe/TranscribeEventOuterClass$TranscribeEventType;)V", "", "typeValue", "getTypeValue", "()I", "setTypeValue", "(I)V", "clearType", "", "Ltranscribe/TranscribeEventOuterClass$TranscribeResult;", "result", "getResult", "()Ltranscribe/TranscribeEventOuterClass$TranscribeResult;", "setResult", "(Ltranscribe/TranscribeEventOuterClass$TranscribeResult;)V", "clearResult", "hasResult", "", "Companion", "flutter_ezw_asr_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final TranscribeEventOuterClass.TranscribeEvent.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Ltranscribe/TranscribeEventKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Ltranscribe/TranscribeEventKt$Dsl;", "builder", "Ltranscribe/TranscribeEventOuterClass$TranscribeEvent$Builder;", "flutter_ezw_asr_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(TranscribeEventOuterClass.TranscribeEvent.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(TranscribeEventOuterClass.TranscribeEvent.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ TranscribeEventOuterClass.TranscribeEvent _build() {
            F m5build = this._builder.m5build();
            Intrinsics.checkNotNullExpressionValue(m5build, "build(...)");
            return (TranscribeEventOuterClass.TranscribeEvent) m5build;
        }

        public final void clearResult() {
            this._builder.clearResult();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        @JvmName(name = "getResult")
        public final TranscribeEventOuterClass.TranscribeResult getResult() {
            TranscribeEventOuterClass.TranscribeResult result = this._builder.getResult();
            Intrinsics.checkNotNullExpressionValue(result, "getResult(...)");
            return result;
        }

        @JvmName(name = "getType")
        public final TranscribeEventOuterClass.TranscribeEventType getType() {
            TranscribeEventOuterClass.TranscribeEventType type = this._builder.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            return type;
        }

        @JvmName(name = "getTypeValue")
        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        public final boolean hasResult() {
            return this._builder.hasResult();
        }

        @JvmName(name = "setResult")
        public final void setResult(TranscribeEventOuterClass.TranscribeResult value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setResult(value);
        }

        @JvmName(name = "setType")
        public final void setType(TranscribeEventOuterClass.TranscribeEventType value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setType(value);
        }

        @JvmName(name = "setTypeValue")
        public final void setTypeValue(int i3) {
            this._builder.setTypeValue(i3);
        }

        private Dsl(TranscribeEventOuterClass.TranscribeEvent.Builder builder) {
            this._builder = builder;
        }
    }

    private TranscribeEventKt() {
    }
}
