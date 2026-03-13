package U9;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.stub.StubApp;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f7545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7546b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f7547c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f7548d;

    public m(n nVar, d dVar, String str, MethodChannel.Result result) {
        this.f7548d = nVar;
        this.f7545a = dVar;
        this.f7546b = str;
        this.f7547c = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string2 = StubApp.getString2(6422);
        String string22 = StubApp.getString2(6423);
        synchronized (n.f7552f) {
            d dVar = this.f7545a;
            if (dVar != null) {
                n.a(this.f7548d, dVar);
            }
            try {
                if (a.a(n.f7553g)) {
                    Log.d(StubApp.getString2("6389"), string22 + this.f7546b);
                }
                SQLiteDatabase.deleteDatabase(new File(this.f7546b));
            } catch (Exception e10) {
                Log.e(StubApp.getString2("6389"), string2 + e10 + StubApp.getString2("6424") + n.f7556l);
            }
        }
        this.f7547c.success(null);
    }
}
