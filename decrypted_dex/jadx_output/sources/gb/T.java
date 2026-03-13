package gb;

import com.stub.StubApp;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.util.HashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14303a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f14304b;

    /* renamed from: c, reason: collision with root package name */
    public final MethodChannel f14305c;

    /* renamed from: d, reason: collision with root package name */
    public MethodChannel.Result f14306d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14307e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14308f;

    public T(Za.d dVar, boolean z2) {
        MethodChannel methodChannel = new MethodChannel(dVar, StubApp.getString2(17863), StandardMethodCodec.INSTANCE);
        this.f14307e = false;
        this.f14308f = false;
        S s10 = new S(this);
        this.f14305c = methodChannel;
        this.f14303a = z2;
        methodChannel.setMethodCallHandler(s10);
    }

    public static HashMap a(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put(StubApp.getString2(427), Boolean.TRUE);
        hashMap.put(StubApp.getString2(1485), bArr);
        return hashMap;
    }
}
