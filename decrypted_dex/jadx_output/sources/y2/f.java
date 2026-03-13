package y2;

import com.stub.StubApp;
import io.flutter.plugin.common.MethodChannel;
import java.util.List;
import java.util.Locale;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f implements InterfaceC1967a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f23496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f23497b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f23498c;

    public f(MethodChannel.Result result, double d8, double d10) {
        this.f23496a = result;
        this.f23497b = d8;
        this.f23498c = d10;
    }

    @Override // y2.InterfaceC1967a
    public final void onError(String str) {
        if (str == null) {
            str = StubApp.getString2(24624);
        }
        this.f23496a.error(StubApp.getString2(24625), str, null);
    }

    @Override // y2.InterfaceC1967a
    public final void onGeocode(List list) {
        MethodChannel.Result result = this.f23496a;
        if (list != null && list.size() > 0) {
            result.success(Y3.a.B(list));
            return;
        }
        result.error(StubApp.getString2(13272), String.format(Locale.ENGLISH, StubApp.getString2(24627), Double.valueOf(this.f23497b), Double.valueOf(this.f23498c)), null);
    }
}
