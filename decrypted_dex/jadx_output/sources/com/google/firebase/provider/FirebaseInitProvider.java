package com.google.firebase.provider;

import R4.a;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class FirebaseInitProvider extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final a f12069a;

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f12070b;

    static {
        StubApp.interface11(4350);
        f12069a = new a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
        f12070b = new AtomicBoolean(false);
    }

    @Override // android.content.ContentProvider
    public final native void attachInfo(Context context, ProviderInfo providerInfo);

    @Override // android.content.ContentProvider
    public final native int delete(Uri uri, String str, String[] strArr);

    @Override // android.content.ContentProvider
    public final native String getType(Uri uri);

    @Override // android.content.ContentProvider
    public final native Uri insert(Uri uri, ContentValues contentValues);

    @Override // android.content.ContentProvider
    public final native boolean onCreate();

    @Override // android.content.ContentProvider
    public final native Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    @Override // android.content.ContentProvider
    public final native int update(Uri uri, ContentValues contentValues, String str, String[] strArr);
}
