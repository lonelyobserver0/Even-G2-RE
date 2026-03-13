package P3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.stub.StubApp;
import java.util.Objects;
import java.util.regex.Matcher;
import t.C1697j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends c4.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f5503a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, Looper looper) {
        super(looper);
        this.f5503a = bVar;
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        b bVar = this.f5503a;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new f());
                if (intent.hasExtra(StubApp.getString2(4854))) {
                    Parcelable parcelableExtra = intent.getParcelableExtra(StubApp.getString2(4854));
                    if (parcelableExtra instanceof g) {
                        bVar.f5497g = (g) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        bVar.f5496f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, StubApp.getString2(4859))) {
                    if (Log.isLoggable(StubApp.getString2(3470), 3)) {
                        String valueOf = String.valueOf(action);
                        Log.d(StubApp.getString2(3470), StubApp.getString2(4860).concat(valueOf));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra(StubApp.getString2(965));
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra(StubApp.getString2(966));
                }
                if (stringExtra != null) {
                    Matcher matcher = b.j.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable(StubApp.getString2(3470), 3)) {
                            Log.d(StubApp.getString2(3470), StubApp.getString2(4864).concat(stringExtra));
                            return;
                        }
                        return;
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString(StubApp.getString2(965), group2);
                        bVar.b(group, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra(StubApp.getString2(435));
                if (stringExtra2 == null) {
                    String valueOf2 = String.valueOf(intent2.getExtras());
                    Log.w(StubApp.getString2(3470), StubApp.getString2(4861).concat(valueOf2));
                    return;
                }
                if (Log.isLoggable(StubApp.getString2(3470), 3)) {
                    Log.d(StubApp.getString2(3470), StubApp.getString2(4862).concat(stringExtra2));
                }
                if (!stringExtra2.startsWith(StubApp.getString2(4851))) {
                    synchronized (bVar.f5491a) {
                        int i3 = 0;
                        while (true) {
                            try {
                                C1697j c1697j = bVar.f5491a;
                                if (i3 < c1697j.f21040c) {
                                    bVar.b((String) c1697j.f(i3), intent2.getExtras());
                                    i3++;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] split = stringExtra2.split(StubApp.getString2(3048));
                if (split.length <= 2 || !Objects.equals(split[1], StubApp.getString2(4673))) {
                    Log.w(StubApp.getString2(3470), StubApp.getString2(4863).concat(stringExtra2));
                    return;
                }
                String str = split[2];
                String str2 = split[3];
                if (str2.startsWith(StubApp.getString2(478))) {
                    str2 = str2.substring(1);
                }
                bVar.b(str, intent2.putExtra(StubApp.getString2(435), str2).getExtras());
                return;
            }
        }
        Log.w(StubApp.getString2(3470), StubApp.getString2(4865));
    }
}
