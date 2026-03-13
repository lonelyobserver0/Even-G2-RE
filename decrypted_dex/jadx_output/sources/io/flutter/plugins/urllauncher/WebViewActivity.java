package io.flutter.plugins.urllauncher;

import R5.f;
import android.app.Activity;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import com.stub.StubApp;
import ob.h;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class WebViewActivity extends Activity {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f15094e = 0;

    /* renamed from: c, reason: collision with root package name */
    public WebView f15097c;

    /* renamed from: a, reason: collision with root package name */
    public final f f15095a = new f(this, 4);

    /* renamed from: b, reason: collision with root package name */
    public final h f15096b = new h();

    /* renamed from: d, reason: collision with root package name */
    public final IntentFilter f15098d = new IntentFilter(StubApp.getString2(5721));

    static {
        StubApp.interface11(8311);
    }

    @Override // android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // android.app.Activity
    public final native void onDestroy();

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final native boolean onKeyDown(int i3, KeyEvent keyEvent);
}
