package com.microsoft.cognitiveservices.speech;

import com.microsoft.cognitiveservices.speech.translation.TranslationRecognitionResult;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class AutoDetectSourceLanguageResult {
    private String _language;

    private AutoDetectSourceLanguageResult(String str) {
        this._language = str;
    }

    public static AutoDetectSourceLanguageResult fromResult(SpeechRecognitionResult speechRecognitionResult) {
        Contracts.throwIfNull(speechRecognitionResult, StubApp.getString2(15665));
        return new AutoDetectSourceLanguageResult(speechRecognitionResult.getProperties().getProperty(PropertyId.SpeechServiceConnection_AutoDetectSourceLanguageResult));
    }

    public String getLanguage() {
        return this._language;
    }

    public static AutoDetectSourceLanguageResult fromResult(TranslationRecognitionResult translationRecognitionResult) {
        Contracts.throwIfNull(translationRecognitionResult, StubApp.getString2(15666));
        return new AutoDetectSourceLanguageResult(translationRecognitionResult.getProperties().getProperty(PropertyId.SpeechServiceConnection_AutoDetectSourceLanguageResult));
    }
}
