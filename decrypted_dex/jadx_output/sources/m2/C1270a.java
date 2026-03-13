package m2;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.stub.StubApp;
import i2.o;

/* renamed from: m2.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1270a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f17050b = o.g(StubApp.getString2(21056));

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f17051a;

    public C1270a(Context context) {
        this.f17051a = new ComponentName(StubApp.getOrigApplicationContext(context.getApplicationContext()), (Class<?>) SystemJobService.class);
    }
}
