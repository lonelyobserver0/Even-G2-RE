package j5;

import com.stub.StubApp;
import g5.C0955a;
import g5.c;

/* renamed from: j5.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1091a {

    /* renamed from: b, reason: collision with root package name */
    public static final c f15325b = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final String f15326c = a(StubApp.getString2(19035), StubApp.getString2(19036));

    /* renamed from: d, reason: collision with root package name */
    public static final String f15327d = a(StubApp.getString2(19037), StubApp.getString2(19038));

    /* renamed from: e, reason: collision with root package name */
    public static final C0955a f15328e = new C0955a(6);

    /* renamed from: a, reason: collision with root package name */
    public final b f15329a;

    public C1091a(b bVar) {
        this.f15329a = bVar;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException(StubApp.getString2(8309));
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i3 = 0; i3 < str.length(); i3++) {
            sb2.append(str.charAt(i3));
            if (str2.length() > i3) {
                sb2.append(str2.charAt(i3));
            }
        }
        return sb2.toString();
    }
}
