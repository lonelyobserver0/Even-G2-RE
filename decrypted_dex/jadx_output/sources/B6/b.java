package B6;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f675a;

    /* renamed from: b, reason: collision with root package name */
    public final WindowManager f676b;

    /* renamed from: c, reason: collision with root package name */
    public final a f677c;

    /* renamed from: d, reason: collision with root package name */
    public MotionEvent f678d;

    /* renamed from: e, reason: collision with root package name */
    public MotionEvent f679e;

    /* renamed from: f, reason: collision with root package name */
    public long f680f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f681g = true;

    /* renamed from: h, reason: collision with root package name */
    public Object f682h;

    public b(Context context, a aVar) {
        this.f675a = context;
        this.f676b = (WindowManager) context.getSystemService(StubApp.getString2(526));
        this.f677c = aVar;
    }

    public abstract boolean a(MotionEvent motionEvent);

    public boolean b(int i3) {
        if (this.f682h == null || !this.f681g) {
            return false;
        }
        a aVar = this.f677c;
        Iterator it = ((ArrayList) aVar.f667a).iterator();
        while (it.hasNext()) {
            Set<Integer> set = (Set) it.next();
            if (set.contains(Integer.valueOf(i3))) {
                for (Integer num : set) {
                    num.getClass();
                    Iterator it2 = ((CopyOnWriteArrayList) aVar.f668b).iterator();
                    while (it2.hasNext()) {
                        b bVar = (b) it2.next();
                        if (bVar instanceof i) {
                            i iVar = (i) bVar;
                            if (iVar.f708p.contains(num) && iVar.f709q) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
