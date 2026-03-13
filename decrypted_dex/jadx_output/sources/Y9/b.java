package Y9;

import fa.C0935a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f8846a;

    /* renamed from: b, reason: collision with root package name */
    public String f8847b;

    /* renamed from: c, reason: collision with root package name */
    public C0935a f8848c;

    /* renamed from: d, reason: collision with root package name */
    public String f8849d;

    /* renamed from: e, reason: collision with root package name */
    public String f8850e;

    /* renamed from: f, reason: collision with root package name */
    public float f8851f;

    /* renamed from: g, reason: collision with root package name */
    public float f8852g;

    /* renamed from: h, reason: collision with root package name */
    public float f8853h;

    /* renamed from: i, reason: collision with root package name */
    public float f8854i;

    /* renamed from: k, reason: collision with root package name */
    public float f8855k;
    public final ArrayList j = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f8856l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public HashMap f8857m = new HashMap();

    public b() {
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
    }

    public final float a() {
        Iterator it = this.f8856l.iterator();
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (it.hasNext()) {
            float f12 = ((a) it.next()).f8843b;
            if (f12 > 0.0f) {
                f10 += f12;
                f11 += 1.0f;
            }
        }
        if (f10 > 0.0f) {
            return f10 / f11;
        }
        return 0.0f;
    }
}
