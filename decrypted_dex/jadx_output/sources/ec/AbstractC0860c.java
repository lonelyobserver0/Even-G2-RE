package ec;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import com.stub.StubApp;
import fc.AbstractC0937a;
import fc.AbstractC0938b;
import fc.AbstractC0939c;
import fc.AbstractC0941e;
import fc.C0940d;
import fc.C0943g;
import fc.C0944h;
import fc.C0945i;
import java.util.Iterator;
import java.util.LinkedList;
import me.leolin.shortcutbadger.impl.AdwHomeBadger;
import me.leolin.shortcutbadger.impl.ApexHomeBadger;
import me.leolin.shortcutbadger.impl.DefaultBadger;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import me.leolin.shortcutbadger.impl.NovaHomeBadger;
import me.leolin.shortcutbadger.impl.SonyHomeBadger;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: ec.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class AbstractC0860c {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedList f13682a;

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC0858a f13683b;

    /* renamed from: c, reason: collision with root package name */
    public static ComponentName f13684c;

    static {
        LinkedList linkedList = new LinkedList();
        f13682a = linkedList;
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(DefaultBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(AbstractC0937a.class);
        linkedList.add(AbstractC0939c.class);
        linkedList.add(C0940d.class);
        linkedList.add(AbstractC0941e.class);
        linkedList.add(C0945i.class);
        linkedList.add(C0943g.class);
        linkedList.add(C0944h.class);
        linkedList.add(AbstractC0938b.class);
    }

    public static void a(Context context, int i3) {
        InterfaceC0858a interfaceC0858a;
        if (f13683b == null) {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                Log.e(StubApp.getString2(23839), StubApp.getString2(26000) + context.getPackageName());
                throw new C0859b(StubApp.getString2(26001));
            }
            f13684c = launchIntentForPackage.getComponent();
            Intent intent = new Intent(StubApp.getString2(25994));
            intent.addCategory(StubApp.getString2(25995));
            Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, PKIFailureInfo.notAuthorized).iterator();
            while (it.hasNext()) {
                String str = it.next().activityInfo.packageName;
                Iterator it2 = f13682a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    try {
                        interfaceC0858a = (InterfaceC0858a) ((Class) it2.next()).newInstance();
                    } catch (Exception unused) {
                        interfaceC0858a = null;
                    }
                    if (interfaceC0858a != null && interfaceC0858a.a().contains(str)) {
                        f13683b = interfaceC0858a;
                        break;
                    }
                }
                if (f13683b != null) {
                    break;
                }
            }
            if (f13683b == null) {
                String str2 = Build.MANUFACTURER;
                if (str2.equalsIgnoreCase(StubApp.getString2(25996))) {
                    f13683b = new C0945i();
                } else if (str2.equalsIgnoreCase(StubApp.getString2(25997))) {
                    C0940d c0940d = new C0940d();
                    c0940d.f14193a = -1;
                    f13683b = c0940d;
                } else if (str2.equalsIgnoreCase(StubApp.getString2(25998))) {
                    f13683b = new C0943g();
                } else if (str2.equalsIgnoreCase(StubApp.getString2(25999))) {
                    f13683b = new C0944h();
                } else {
                    f13683b = new DefaultBadger();
                }
            }
        }
        try {
            f13683b.b(context, f13684c, i3);
        } catch (Exception e10) {
            throw new C0859b(StubApp.getString2(23838), e10);
        }
    }
}
