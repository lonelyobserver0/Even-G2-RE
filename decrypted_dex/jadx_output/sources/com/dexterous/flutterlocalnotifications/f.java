package com.dexterous.flutterlocalnotifications;

import com.dexterous.flutterlocalnotifications.models.IconSource;
import com.dexterous.flutterlocalnotifications.models.NotificationStyle;
import com.dexterous.flutterlocalnotifications.models.RepeatInterval;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract /* synthetic */ class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f11111a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f11112b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f11113c;

    static {
        int[] iArr = new int[NotificationStyle.values().length];
        f11113c = iArr;
        try {
            iArr[NotificationStyle.BigPicture.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f11113c[NotificationStyle.BigText.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f11113c[NotificationStyle.Inbox.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f11113c[NotificationStyle.Messaging.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f11113c[NotificationStyle.Media.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[IconSource.values().length];
        f11112b = iArr2;
        try {
            iArr2[IconSource.DrawableResource.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f11112b[IconSource.BitmapFilePath.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f11112b[IconSource.ContentUri.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f11112b[IconSource.FlutterBitmapAsset.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f11112b[IconSource.ByteArray.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        int[] iArr3 = new int[RepeatInterval.values().length];
        f11111a = iArr3;
        try {
            iArr3[RepeatInterval.EveryMinute.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f11111a[RepeatInterval.Hourly.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f11111a[RepeatInterval.Daily.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f11111a[RepeatInterval.Weekly.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
    }
}
