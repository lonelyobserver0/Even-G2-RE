package kb;

import io.flutter.plugin.common.MethodChannel;
import java.util.concurrent.CountDownLatch;

/* renamed from: kb.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1123b implements MethodChannel.Result {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f15522a;

    public C1123b(CountDownLatch countDownLatch) {
        this.f15522a = countDownLatch;
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void error(String str, String str2, Object obj) {
        this.f15522a.countDown();
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void notImplemented() {
        this.f15522a.countDown();
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void success(Object obj) {
        this.f15522a.countDown();
    }
}
