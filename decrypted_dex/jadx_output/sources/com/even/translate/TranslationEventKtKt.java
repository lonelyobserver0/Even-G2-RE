package com.even.translate;

import com.even.translate.TranslationEventKt;
import com.even.translate.TranslationEventOuterClass;
import com.google.protobuf.A;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\"\u0017\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"translationEvent", "Lcom/even/translate/TranslationEventOuterClass$TranslationEvent;", "block", "Lkotlin/Function1;", "Lcom/even/translate/TranslationEventKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializetranslationEvent", "copy", "resultOrNull", "Lcom/even/translate/TranslationEventOuterClass$TranslationResult;", "Lcom/even/translate/TranslationEventOuterClass$TranslationEventOrBuilder;", "getResultOrNull", "(Lcom/even/translate/TranslationEventOuterClass$TranslationEventOrBuilder;)Lcom/even/translate/TranslationEventOuterClass$TranslationResult;", "translate_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTranslationEventKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranslationEventKt.kt\ncom/even/translate/TranslationEventKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n1#2:90\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class TranslationEventKtKt {
    @JvmName(name = "-initializetranslationEvent")
    /* renamed from: -initializetranslationEvent, reason: not valid java name */
    public static final TranslationEventOuterClass.TranslationEvent m1initializetranslationEvent(Function1<? super TranslationEventKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        TranslationEventKt.Dsl.Companion companion = TranslationEventKt.Dsl.INSTANCE;
        TranslationEventOuterClass.TranslationEvent.Builder newBuilder = TranslationEventOuterClass.TranslationEvent.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        TranslationEventKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final TranslationEventOuterClass.TranslationEvent copy(TranslationEventOuterClass.TranslationEvent translationEvent, Function1<? super TranslationEventKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(translationEvent, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        TranslationEventKt.Dsl.Companion companion = TranslationEventKt.Dsl.INSTANCE;
        A m13toBuilder = translationEvent.m13toBuilder();
        Intrinsics.checkNotNullExpressionValue(m13toBuilder, "toBuilder(...)");
        TranslationEventKt.Dsl _create = companion._create((TranslationEventOuterClass.TranslationEvent.Builder) m13toBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final TranslationEventOuterClass.TranslationResult getResultOrNull(TranslationEventOuterClass.TranslationEventOrBuilder translationEventOrBuilder) {
        Intrinsics.checkNotNullParameter(translationEventOrBuilder, "<this>");
        if (translationEventOrBuilder.hasResult()) {
            return translationEventOrBuilder.getResult();
        }
        return null;
    }
}
