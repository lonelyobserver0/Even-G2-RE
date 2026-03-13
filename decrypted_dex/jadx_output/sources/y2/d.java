package y2;

import android.location.Address;
import com.stub.StubApp;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d implements InterfaceC1967a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f23492a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23493b;

    public d(MethodChannel.Result result, String str) {
        this.f23492a = result;
        this.f23493b = str;
    }

    @Override // y2.InterfaceC1967a
    public final void onError(String str) {
        if (str == null) {
            str = StubApp.getString2(24624);
        }
        this.f23492a.error(StubApp.getString2(24625), str, null);
    }

    @Override // y2.InterfaceC1967a
    public final void onGeocode(List list) {
        MethodChannel.Result result = this.f23492a;
        if (list == null || list.size() <= 0) {
            result.error(StubApp.getString2(13272), AbstractC1482f.k(new StringBuilder(StubApp.getString2(24626)), this.f23493b, StubApp.getString2(620)), null);
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Address address = (Address) it.next();
            HashMap hashMap = new HashMap();
            hashMap.put(StubApp.getString2(2044), Double.valueOf(address.getLatitude()));
            hashMap.put(StubApp.getString2(2043), Double.valueOf(address.getLongitude()));
            hashMap.put(StubApp.getString2(1350), Long.valueOf(Calendar.getInstance(TimeZone.getTimeZone(StubApp.getString2(8779))).getTimeInMillis()));
            arrayList.add(hashMap);
        }
        result.success(arrayList);
    }
}
