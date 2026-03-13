package com.google.android.gms.internal.measurement;

import aa.C0398e;
import android.net.Uri;
import android.util.Log;
import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class P1 {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f11332g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static volatile G1 f11333h;

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicInteger f11334i;

    /* renamed from: a, reason: collision with root package name */
    public final C0398e f11335a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11336b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11337c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f11338d = -1;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f11339e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11340f;

    static {
        new AtomicReference();
        f11334i = new AtomicInteger();
    }

    public /* synthetic */ P1(C0398e c0398e, String str, Object obj, int i3) {
        this.f11340f = i3;
        if (((Uri) c0398e.f9344b) == null) {
            throw new IllegalArgumentException(StubApp.getString2(11784));
        }
        this.f11335a = c0398e;
        this.f11336b = str;
        this.f11337c = obj;
    }

    public final Object a(Object obj) {
        switch (this.f11340f) {
            case 0:
                if (!(obj instanceof Long)) {
                    if (obj instanceof String) {
                        try {
                            break;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    String obj2 = obj.toString();
                    String str = this.f11336b;
                    StringBuilder sb2 = new StringBuilder(str.length() + 25 + obj2.length());
                    sb2.append(StubApp.getString2(11788));
                    sb2.append(str);
                    sb2.append(StubApp.getString2(994));
                    sb2.append(obj2);
                    Log.e(StubApp.getString2(11786), sb2.toString());
                    break;
                } else {
                    break;
                }
            case 1:
                if (!(obj instanceof Boolean)) {
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (!C1.f11239b.matcher(str2).matches()) {
                            if (C1.f11240c.matcher(str2).matches()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    String obj3 = obj.toString();
                    String str3 = this.f11336b;
                    StringBuilder sb3 = new StringBuilder(str3.length() + 28 + obj3.length());
                    sb3.append(StubApp.getString2(11787));
                    sb3.append(str3);
                    sb3.append(StubApp.getString2(994));
                    sb3.append(obj3);
                    Log.e(StubApp.getString2(11786), sb3.toString());
                    break;
                } else {
                    break;
                }
            case 2:
                if (!(obj instanceof Double)) {
                    if (!(obj instanceof Float)) {
                        if (obj instanceof String) {
                            try {
                                break;
                            } catch (NumberFormatException unused2) {
                            }
                        }
                        String obj4 = obj.toString();
                        String str4 = this.f11336b;
                        StringBuilder sb4 = new StringBuilder(str4.length() + 27 + obj4.length());
                        sb4.append(StubApp.getString2(11785));
                        sb4.append(str4);
                        sb4.append(StubApp.getString2(994));
                        sb4.append(obj4);
                        Log.e(StubApp.getString2(11786), sb4.toString());
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            default:
                if (obj instanceof String) {
                    break;
                }
                break;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071 A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x001a, B:13:0x0026, B:15:0x0036, B:18:0x004a, B:21:0x0060, B:23:0x0071, B:25:0x0079, B:27:0x0089, B:29:0x0097, B:32:0x00bc, B:35:0x00c4, B:36:0x00c7, B:37:0x00cb, B:38:0x00a0, B:40:0x00a4, B:42:0x00b2, B:44:0x00b8, B:48:0x00d0, B:49:0x00d2, B:52:0x0043, B:54:0x00d3), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0 A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x001a, B:13:0x0026, B:15:0x0036, B:18:0x004a, B:21:0x0060, B:23:0x0071, B:25:0x0079, B:27:0x0089, B:29:0x0097, B:32:0x00bc, B:35:0x00c4, B:36:0x00c7, B:37:0x00cb, B:38:0x00a0, B:40:0x00a4, B:42:0x00b2, B:44:0x00b8, B:48:0x00d0, B:49:0x00d2, B:52:0x0043, B:54:0x00d3), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0 A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x001a, B:13:0x0026, B:15:0x0036, B:18:0x004a, B:21:0x0060, B:23:0x0071, B:25:0x0079, B:27:0x0089, B:29:0x0097, B:32:0x00bc, B:35:0x00c4, B:36:0x00c7, B:37:0x00cb, B:38:0x00a0, B:40:0x00a4, B:42:0x00b2, B:44:0x00b8, B:48:0x00d0, B:49:0x00d2, B:52:0x0043, B:54:0x00d3), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.P1.b():java.lang.Object");
    }
}
