package sb;

import android.webkit.JavascriptInterface;

/* renamed from: sb.x, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1681x {

    /* renamed from: a, reason: collision with root package name */
    public final String f21003a;

    /* renamed from: b, reason: collision with root package name */
    public final C1683y f21004b;

    public C1681x(String str, C1683y c1683y) {
        this.f21003a = str;
        this.f21004b = c1683y;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        C1683y c1683y = this.f21004b;
        c1683y.f20915a.p(new com.even.translate.a(18, this, str));
    }
}
