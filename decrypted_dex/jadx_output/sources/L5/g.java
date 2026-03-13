package L5;

import H5.C0068a;
import H5.C0069b;
import android.net.Uri;
import com.stub.StubApp;
import java.net.URL;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final C0069b f4223a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f4224b;

    public g(C0069b appInfo, CoroutineContext blockingDispatcher) {
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
        this.f4223a = appInfo;
        this.f4224b = blockingDispatcher;
    }

    public static final URL a(g gVar) {
        gVar.getClass();
        Uri.Builder appendPath = new Uri.Builder().scheme(StubApp.getString2(3396)).authority(StubApp.getString2(3397)).appendPath(StubApp.getString2(3398)).appendPath(StubApp.getString2(820)).appendPath(StubApp.getString2(3399)).appendPath(StubApp.getString2(3400)).appendPath(StubApp.getString2(3401));
        C0069b c0069b = gVar.f4223a;
        Uri.Builder appendPath2 = appendPath.appendPath(c0069b.f2835a).appendPath(StubApp.getString2(3402));
        C0068a c0068a = c0069b.f2836b;
        return new URL(appendPath2.appendQueryParameter(StubApp.getString2(3403), c0068a.f2829c).appendQueryParameter(StubApp.getString2(3404), c0068a.f2828b).build().toString());
    }
}
