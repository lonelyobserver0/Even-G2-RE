package com.even.translate.azure.translation;

import com.microsoft.cognitiveservices.speech.translation.SpeechTranslationConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"removeAllTargetLanguages", "", "Lcom/microsoft/cognitiveservices/speech/translation/SpeechTranslationConfig;", "translate_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAzureTranslationRecognizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AzureTranslationRecognizer.kt\ncom/even/translate/azure/translation/AzureTranslationRecognizerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,377:1\n1863#2,2:378\n*S KotlinDebug\n*F\n+ 1 AzureTranslationRecognizer.kt\ncom/even/translate/azure/translation/AzureTranslationRecognizerKt\n*L\n374#1:378,2\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class AzureTranslationRecognizerKt {
    public static final void removeAllTargetLanguages(SpeechTranslationConfig speechTranslationConfig) {
        Intrinsics.checkNotNullParameter(speechTranslationConfig, "<this>");
        ArrayList<String> targetLanguages = speechTranslationConfig.getTargetLanguages();
        Intrinsics.checkNotNull(targetLanguages);
        Iterator<T> it = targetLanguages.iterator();
        while (it.hasNext()) {
            speechTranslationConfig.removeTargetLanguage((String) it.next());
        }
    }
}
