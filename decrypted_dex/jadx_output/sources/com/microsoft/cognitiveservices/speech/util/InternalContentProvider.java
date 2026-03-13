package com.microsoft.cognitiveservices.speech.util;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class InternalContentProvider extends ContentProvider {
    static {
        StubApp.interface11(7454);
    }

    @Override // android.content.ContentProvider
    public native int delete(Uri uri, String str, String[] strArr);

    @Override // android.content.ContentProvider
    public native String getType(Uri uri);

    @Override // android.content.ContentProvider
    public native Uri insert(Uri uri, ContentValues contentValues);

    @Override // android.content.ContentProvider
    public native boolean onCreate();

    @Override // android.content.ContentProvider
    public native Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    @Override // android.content.ContentProvider
    public native int update(Uri uri, ContentValues contentValues, String str, String[] strArr);
}
