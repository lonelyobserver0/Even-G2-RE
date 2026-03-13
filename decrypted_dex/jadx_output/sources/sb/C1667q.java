package sb;

import android.webkit.DownloadListener;
import com.stub.StubApp;
import g5.C0955a;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: sb.q, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1667q implements DownloadListener {

    /* renamed from: a, reason: collision with root package name */
    public final C1669r f20986a;

    public C1667q(C1669r c1669r) {
        this.f20986a = c1669r;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(final String str, final String str2, final String str3, final String str4, final long j) {
        C1669r c1669r = this.f20986a;
        c1669r.f20885a.p(new Runnable() { // from class: sb.p
            @Override // java.lang.Runnable
            public final void run() {
                C1645f callback = new C1645f(9);
                C1667q pigeon_instanceArg = C1667q.this;
                C1669r c1669r2 = pigeon_instanceArg.f20986a;
                Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
                String urlArg = str;
                Intrinsics.checkNotNullParameter(urlArg, "urlArg");
                String userAgentArg = str2;
                Intrinsics.checkNotNullParameter(userAgentArg, "userAgentArg");
                String contentDispositionArg = str3;
                Intrinsics.checkNotNullParameter(contentDispositionArg, "contentDispositionArg");
                String mimetypeArg = str4;
                Intrinsics.checkNotNullParameter(mimetypeArg, "mimetypeArg");
                Intrinsics.checkNotNullParameter(callback, "callback");
                B3.s sVar = c1669r2.f20885a;
                sVar.getClass();
                new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(17776), sVar.i()).send(CollectionsKt.listOf(pigeon_instanceArg, urlArg, userAgentArg, contentDispositionArg, mimetypeArg, Long.valueOf(j)), new C0955a(callback, 27));
            }
        });
    }
}
