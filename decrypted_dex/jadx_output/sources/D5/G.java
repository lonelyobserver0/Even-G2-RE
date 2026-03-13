package D5;

import android.text.TextUtils;
import com.stub.StubApp;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class G {

    /* renamed from: b, reason: collision with root package name */
    public static WeakReference f1359b;

    /* renamed from: a, reason: collision with root package name */
    public B3.s f1360a;

    public final synchronized F a() {
        String str;
        F f10;
        B3.s sVar = this.f1360a;
        synchronized (((ArrayDeque) sVar.f653e)) {
            str = (String) ((ArrayDeque) sVar.f653e).peek();
        }
        Pattern pattern = F.f1355d;
        f10 = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(StubApp.getString2("1373"), -1);
            if (split.length == 2) {
                f10 = new F(split[0], split[1]);
            }
        }
        return f10;
    }
}
