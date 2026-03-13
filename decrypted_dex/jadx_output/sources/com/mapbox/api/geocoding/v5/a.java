package com.mapbox.api.geocoding.v5;

import com.google.gson.stream.JsonToken;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12280a;

    static {
        int[] iArr = new int[JsonToken.values().length];
        f12280a = iArr;
        try {
            iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f12280a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f12280a[JsonToken.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f12280a[JsonToken.NUMBER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f12280a[JsonToken.BOOLEAN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f12280a[JsonToken.NULL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f12280a[JsonToken.NAME.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f12280a[JsonToken.END_ARRAY.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f12280a[JsonToken.END_OBJECT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f12280a[JsonToken.END_DOCUMENT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
