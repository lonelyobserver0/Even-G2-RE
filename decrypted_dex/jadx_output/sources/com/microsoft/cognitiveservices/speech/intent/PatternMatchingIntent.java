package com.microsoft.cognitiveservices.speech.intent;

import com.microsoft.cognitiveservices.speech.util.KeyedItem;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class PatternMatchingIntent implements KeyedItem {
    public Collection<String> Phrases;

    /* renamed from: a, reason: collision with root package name */
    public String f12601a;

    public PatternMatchingIntent(String str) {
        this.f12601a = str;
        this.Phrases = new ArrayList();
    }

    @Override // com.microsoft.cognitiveservices.speech.util.KeyedItem
    public String getId() {
        return this.f12601a;
    }

    public void setId(String str) {
        this.f12601a = str;
    }

    public PatternMatchingIntent(String str, Collection<String> collection) {
        this.f12601a = str;
        this.Phrases = collection;
    }

    public PatternMatchingIntent(String str, String... strArr) {
        this.f12601a = str;
        this.Phrases = new ArrayList();
        for (String str2 : strArr) {
            this.Phrases.add(str2);
        }
    }
}
