package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.stub.StubApp;
import java.util.regex.Pattern;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class C1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f11238a = Uri.parse(StubApp.getString2(11570));

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f11239b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f11240c;

    static {
        Uri.parse(StubApp.getString2(11571));
        f11239b = Pattern.compile(StubApp.getString2(11572), 2);
        f11240c = Pattern.compile(StubApp.getString2(11573), 2);
    }
}
