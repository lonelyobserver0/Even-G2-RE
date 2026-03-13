package com.microsoft.cognitiveservices.speech.intent;

import com.microsoft.cognitiveservices.speech.util.KeyedItemHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class PatternMatchingModel extends LanguageUnderstandingModel {

    /* renamed from: b, reason: collision with root package name */
    public final KeyedItemHashMap f12602b;

    /* renamed from: c, reason: collision with root package name */
    public final KeyedItemHashMap f12603c;

    public PatternMatchingModel(String str) {
        this.modelId = str;
        this.f12602b = new KeyedItemHashMap();
        this.f12603c = new KeyedItemHashMap();
    }

    public KeyedItemHashMap<PatternMatchingEntity> getEntities() {
        return this.f12603c;
    }

    public KeyedItemHashMap<PatternMatchingIntent> getIntents() {
        return this.f12602b;
    }
}
