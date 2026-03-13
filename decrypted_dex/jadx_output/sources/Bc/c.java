package Bc;

import com.stub.StubApp;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class c extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f751a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f751a) {
            case 0:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StubApp.getString2(25039), Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(xc.b.f23182d);
                return simpleDateFormat;
            default:
                return 0L;
        }
    }
}
