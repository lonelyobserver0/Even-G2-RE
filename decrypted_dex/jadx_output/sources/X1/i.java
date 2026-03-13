package X1;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i extends c {

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f8245d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i() {
        /*
            r1 = this;
            r0 = 6960(0x1b30, float:9.753E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r1.<init>(r0, r0)
            r0 = 6961(0x1b31, float:9.754E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r1.f8245d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X1.i.<init>():void");
    }

    @Override // X1.c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // X1.c
    public final boolean b() {
        boolean b2 = super.b();
        if (!b2 || Build.VERSION.SDK_INT >= 29) {
            return b2;
        }
        int i3 = W1.a.f8064a;
        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
        if (currentWebViewPackage == null) {
            return false;
        }
        Matcher matcher = this.f8245d.matcher(currentWebViewPackage.versionName);
        return matcher.find() && Integer.parseInt(currentWebViewPackage.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
