package Z4;

import Y.m;
import android.content.Context;
import android.util.Log;
import c5.f;
import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8977a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final String f8978b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8979c;

    public b(String str, String str2) {
        this.f8978b = str;
        this.f8979c = str2;
    }

    public String toString() {
        switch (this.f8977a) {
            case 1:
                return this.f8978b + StubApp.getString2(81) + this.f8979c;
            default:
                return super.toString();
        }
    }

    public b(m mVar) {
        int d8 = f.d((Context) mVar.f8674b, StubApp.getString2(7616), StubApp.getString2(983));
        String string2 = StubApp.getString2(280);
        Context context = (Context) mVar.f8674b;
        if (d8 != 0) {
            this.f8978b = StubApp.getString2(7617);
            String string = context.getResources().getString(d8);
            this.f8979c = string;
            String j = E1.a.j(StubApp.getString2(7618), string);
            if (Log.isLoggable(string2, 2)) {
                Log.v(string2, j, null);
                return;
            }
            return;
        }
        String string22 = StubApp.getString2(7619);
        if (context.getAssets() != null) {
            try {
                InputStream open = context.getAssets().open(string22);
                if (open != null) {
                    open.close();
                }
                this.f8978b = "Flutter";
                this.f8979c = null;
                if (Log.isLoggable(string2, 2)) {
                    Log.v(string2, StubApp.getString2(7620), null);
                    return;
                }
                return;
            } catch (IOException unused) {
            }
        }
        this.f8978b = null;
        this.f8979c = null;
    }
}
