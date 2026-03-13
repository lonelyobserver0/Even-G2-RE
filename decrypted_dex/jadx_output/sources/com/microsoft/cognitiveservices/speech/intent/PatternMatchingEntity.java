package com.microsoft.cognitiveservices.speech.intent;

import com.microsoft.cognitiveservices.speech.util.KeyedItem;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class PatternMatchingEntity implements KeyedItem {
    public Collection<String> Phrases;

    /* renamed from: a, reason: collision with root package name */
    public String f12594a;

    /* renamed from: b, reason: collision with root package name */
    public EntityMatchMode f12595b;

    /* renamed from: c, reason: collision with root package name */
    public EntityType f12596c;

    public enum EntityMatchMode {
        Basic(0),
        Strict(1),
        Fuzzy(2);


        /* renamed from: a, reason: collision with root package name */
        public final int f12598a;

        EntityMatchMode(int i3) {
            this.f12598a = i3;
        }

        public int getValue() {
            return this.f12598a;
        }
    }

    public enum EntityType {
        Any(0),
        List(1),
        PrebuiltInteger(2);


        /* renamed from: a, reason: collision with root package name */
        public final int f12600a;

        EntityType(int i3) {
            this.f12600a = i3;
        }

        public int getValue() {
            return this.f12600a;
        }
    }

    public PatternMatchingEntity(String str, EntityType entityType, EntityMatchMode entityMatchMode, Collection collection) {
        this.f12594a = str;
        this.f12596c = entityType;
        this.f12595b = entityMatchMode;
        if (collection == null) {
            this.Phrases = new ArrayList();
        } else {
            this.Phrases = collection;
        }
    }

    public static PatternMatchingEntity CreateAnyEntity(String str) {
        return new PatternMatchingEntity(str, EntityType.Any, EntityMatchMode.Basic, null);
    }

    public static PatternMatchingEntity CreateIntegerEntity(String str) {
        return new PatternMatchingEntity(str, EntityType.PrebuiltInteger, EntityMatchMode.Basic, null);
    }

    public static PatternMatchingEntity CreateListEntity(String str, EntityMatchMode entityMatchMode, Collection<String> collection) {
        return new PatternMatchingEntity(str, EntityType.List, entityMatchMode, collection);
    }

    @Override // com.microsoft.cognitiveservices.speech.util.KeyedItem
    public String getId() {
        return this.f12594a;
    }

    public EntityMatchMode getMatchMode() {
        return this.f12595b;
    }

    public EntityType getType() {
        return this.f12596c;
    }

    public void setId(String str) {
        this.f12594a = str;
    }

    public void setMatchMode(EntityMatchMode entityMatchMode) {
        this.f12595b = entityMatchMode;
    }

    public void setType(EntityType entityType) {
        this.f12596c = entityType;
    }

    public static PatternMatchingEntity CreateListEntity(String str, EntityMatchMode entityMatchMode, String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            arrayList.add(str2);
        }
        return new PatternMatchingEntity(str, EntityType.List, entityMatchMode, arrayList);
    }
}
