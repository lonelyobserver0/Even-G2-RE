package y2;

import com.stub.StubApp;
import io.flutter.plugin.common.MethodChannel;
import java.util.List;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class e implements InterfaceC1967a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f23494a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23495b;

    public e(MethodChannel.Result result, String str) {
        this.f23494a = result;
        this.f23495b = str;
    }

    @Override // y2.InterfaceC1967a
    public final void onError(String str) {
        if (str == null) {
            str = StubApp.getString2(24624);
        }
        this.f23494a.error(StubApp.getString2(24625), str, null);
    }

    @Override // y2.InterfaceC1967a
    public final void onGeocode(List list) {
        MethodChannel.Result result = this.f23494a;
        if (list != null && list.size() > 0) {
            result.success(Y3.a.B(list));
        } else {
            result.error(StubApp.getString2(13272), AbstractC1482f.k(new StringBuilder(StubApp.getString2(24626)), this.f23495b, StubApp.getString2(620)), null);
        }
    }
}
