package com.even.translate;

import com.even.translate.TranslationEventOuterClass;
import com.even.translate.TranslationResultKt;
import com.google.protobuf.A;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"translationResult", "Lcom/even/translate/TranslationEventOuterClass$TranslationResult;", "block", "Lkotlin/Function1;", "Lcom/even/translate/TranslationResultKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializetranslationResult", "copy", "translate_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTranslationResultKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranslationResultKt.kt\ncom/even/translate/TranslationResultKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1#2:171\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class TranslationResultKtKt {
    @JvmName(name = "-initializetranslationResult")
    /* renamed from: -initializetranslationResult, reason: not valid java name */
    public static final TranslationEventOuterClass.TranslationResult m3initializetranslationResult(Function1<? super TranslationResultKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        TranslationResultKt.Dsl.Companion companion = TranslationResultKt.Dsl.INSTANCE;
        TranslationEventOuterClass.TranslationResult.Builder newBuilder = TranslationEventOuterClass.TranslationResult.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        TranslationResultKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final TranslationEventOuterClass.TranslationResult copy(TranslationEventOuterClass.TranslationResult translationResult, Function1<? super TranslationResultKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(translationResult, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        TranslationResultKt.Dsl.Companion companion = TranslationResultKt.Dsl.INSTANCE;
        A m13toBuilder = translationResult.m13toBuilder();
        Intrinsics.checkNotNullExpressionValue(m13toBuilder, "toBuilder(...)");
        TranslationResultKt.Dsl _create = companion._create((TranslationEventOuterClass.TranslationResult.Builder) m13toBuilder);
        block.invoke(_create);
        return _create._build();
    }
}
