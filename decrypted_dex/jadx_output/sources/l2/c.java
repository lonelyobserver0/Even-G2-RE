package l2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import com.stub.StubApp;
import i2.o;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class c extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f15851a = o.g(StubApp.getString2(19340));

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        o.e().b(f15851a, String.format(StubApp.getString2(19341), intent), new Throwable[0]);
        String str = b.f15847d;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction(StubApp.getString2(19318));
        context.startService(intent2);
    }
}
