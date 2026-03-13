package P3;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.stub.StubApp;
import java.io.IOException;
import q4.InterfaceC1521b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class d implements InterfaceC1521b, q4.i {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d f5499b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d f5500c = new d(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d f5501d = new d(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5502a;

    public /* synthetic */ d(int i3) {
        this.f5502a = i3;
    }

    @Override // q4.InterfaceC1521b
    public Object e(q4.j jVar) {
        switch (this.f5502a) {
            case 0:
                if (jVar.isSuccessful()) {
                    return (Bundle) jVar.getResult();
                }
                String string2 = StubApp.getString2(3470);
                if (Log.isLoggable(string2, 3)) {
                    Log.d(string2, StubApp.getString2(4858).concat(String.valueOf(jVar.getException())));
                }
                throw new IOException(StubApp.getString2(964), jVar.getException());
            default:
                Intent intent = (Intent) ((Bundle) jVar.getResult()).getParcelable(StubApp.getString2(4857));
                if (intent != null) {
                    return new a(intent);
                }
                return null;
        }
    }

    @Override // q4.i
    public q4.j k(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i3 = b.f5489h;
        return (bundle == null || !bundle.containsKey(StubApp.getString2(4854))) ? a4.f.m(bundle) : a4.f.m(null);
    }
}
