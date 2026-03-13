package x5;

import android.text.TextUtils;
import com.stub.StubApp;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final long f22888b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f22889c = Pattern.compile(StubApp.getString2(24179));

    /* renamed from: d, reason: collision with root package name */
    public static j f22890d;

    /* renamed from: a, reason: collision with root package name */
    public final C2.i f22891a;

    public j(C2.i iVar) {
        this.f22891a = iVar;
    }

    public final boolean a(y5.a aVar) {
        if (TextUtils.isEmpty(aVar.f23515c)) {
            return true;
        }
        long j = aVar.f23518f + aVar.f23517e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f22891a.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + f22888b;
    }
}
