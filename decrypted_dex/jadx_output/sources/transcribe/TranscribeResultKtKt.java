package transcribe;

import com.google.protobuf.A;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import transcribe.TranscribeEventOuterClass;
import transcribe.TranscribeResultKt;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"transcribeResult", "Ltranscribe/TranscribeEventOuterClass$TranscribeResult;", "block", "Lkotlin/Function1;", "Ltranscribe/TranscribeResultKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializetranscribeResult", "copy", "flutter_ezw_asr_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTranscribeResultKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranscribeResultKt.kt\ntranscribe/TranscribeResultKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1#2:120\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class TranscribeResultKtKt {
    @JvmName(name = "-initializetranscribeResult")
    /* renamed from: -initializetranscribeResult, reason: not valid java name */
    public static final TranscribeEventOuterClass.TranscribeResult m1510initializetranscribeResult(Function1<? super TranscribeResultKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        TranscribeResultKt.Dsl.Companion companion = TranscribeResultKt.Dsl.INSTANCE;
        TranscribeEventOuterClass.TranscribeResult.Builder newBuilder = TranscribeEventOuterClass.TranscribeResult.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        TranscribeResultKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final TranscribeEventOuterClass.TranscribeResult copy(TranscribeEventOuterClass.TranscribeResult transcribeResult, Function1<? super TranscribeResultKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(transcribeResult, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        TranscribeResultKt.Dsl.Companion companion = TranscribeResultKt.Dsl.INSTANCE;
        A m13toBuilder = transcribeResult.m13toBuilder();
        Intrinsics.checkNotNullExpressionValue(m13toBuilder, "toBuilder(...)");
        TranscribeResultKt.Dsl _create = companion._create((TranscribeEventOuterClass.TranscribeResult.Builder) m13toBuilder);
        block.invoke(_create);
        return _create._build();
    }
}
