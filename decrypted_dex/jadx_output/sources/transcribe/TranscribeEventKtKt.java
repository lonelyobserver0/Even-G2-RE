package transcribe;

import com.google.protobuf.A;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import transcribe.TranscribeEventKt;
import transcribe.TranscribeEventOuterClass;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\"\u0017\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"transcribeEvent", "Ltranscribe/TranscribeEventOuterClass$TranscribeEvent;", "block", "Lkotlin/Function1;", "Ltranscribe/TranscribeEventKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializetranscribeEvent", "copy", "resultOrNull", "Ltranscribe/TranscribeEventOuterClass$TranscribeResult;", "Ltranscribe/TranscribeEventOuterClass$TranscribeEventOrBuilder;", "getResultOrNull", "(Ltranscribe/TranscribeEventOuterClass$TranscribeEventOrBuilder;)Ltranscribe/TranscribeEventOuterClass$TranscribeResult;", "flutter_ezw_asr_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTranscribeEventKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranscribeEventKt.kt\ntranscribe/TranscribeEventKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n1#2:90\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class TranscribeEventKtKt {
    @JvmName(name = "-initializetranscribeEvent")
    /* renamed from: -initializetranscribeEvent, reason: not valid java name */
    public static final TranscribeEventOuterClass.TranscribeEvent m1508initializetranscribeEvent(Function1<? super TranscribeEventKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        TranscribeEventKt.Dsl.Companion companion = TranscribeEventKt.Dsl.INSTANCE;
        TranscribeEventOuterClass.TranscribeEvent.Builder newBuilder = TranscribeEventOuterClass.TranscribeEvent.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        TranscribeEventKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final TranscribeEventOuterClass.TranscribeEvent copy(TranscribeEventOuterClass.TranscribeEvent transcribeEvent, Function1<? super TranscribeEventKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(transcribeEvent, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        TranscribeEventKt.Dsl.Companion companion = TranscribeEventKt.Dsl.INSTANCE;
        A m13toBuilder = transcribeEvent.m13toBuilder();
        Intrinsics.checkNotNullExpressionValue(m13toBuilder, "toBuilder(...)");
        TranscribeEventKt.Dsl _create = companion._create((TranscribeEventOuterClass.TranscribeEvent.Builder) m13toBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final TranscribeEventOuterClass.TranscribeResult getResultOrNull(TranscribeEventOuterClass.TranscribeEventOrBuilder transcribeEventOrBuilder) {
        Intrinsics.checkNotNullParameter(transcribeEventOrBuilder, "<this>");
        if (transcribeEventOrBuilder.hasResult()) {
            return transcribeEventOrBuilder.getResult();
        }
        return null;
    }
}
