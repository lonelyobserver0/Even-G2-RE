package da;

import fa.AbstractC0936b;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class x extends H {

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f13545f;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f13546g;

    /* renamed from: h, reason: collision with root package name */
    public String f13547h;

    @Override // da.H
    public final void a(J j, F f10) {
        f10.G();
        int G4 = f10.G();
        f10.G();
        this.f13545f = new ArrayList(G4);
        for (int i3 = 0; i3 < G4; i3++) {
            w wVar = new w();
            wVar.f13538a = f10.G();
            wVar.f13539b = f10.G();
            wVar.f13540c = f10.G();
            wVar.f13541d = f10.G();
            wVar.f13542e = f10.G();
            wVar.f13543f = f10.G();
            this.f13545f.add(wVar);
        }
        Iterator it = this.f13545f.iterator();
        while (it.hasNext()) {
            w wVar2 = (w) it.next();
            long j3 = wVar2.f13543f;
            if (j3 > this.f13471c) {
                wVar2.f13544g = null;
            } else {
                f10.seek(this.f13470b + 6 + (G4 * 12) + j3);
                int i10 = wVar2.f13538a;
                int i11 = wVar2.f13539b;
                Charset charset = AbstractC0936b.f14188a;
                if (i10 == 3 && (i11 == 0 || i11 == 1)) {
                    charset = AbstractC0936b.f14189b;
                } else if (i10 == 0) {
                    charset = AbstractC0936b.f14189b;
                } else if (i10 == 2) {
                    if (i11 == 0) {
                        charset = AbstractC0936b.f14191d;
                    } else if (i11 == 1) {
                        charset = AbstractC0936b.f14192e;
                    }
                }
                wVar2.f13544g = f10.C(wVar2.f13542e, charset);
            }
        }
        this.f13546g = new HashMap(this.f13545f.size());
        Iterator it2 = this.f13545f.iterator();
        while (it2.hasNext()) {
            w wVar3 = (w) it2.next();
            Map map = (Map) this.f13546g.get(Integer.valueOf(wVar3.f13541d));
            if (map == null) {
                map = new HashMap();
                this.f13546g.put(Integer.valueOf(wVar3.f13541d), map);
            }
            Map map2 = (Map) map.get(Integer.valueOf(wVar3.f13538a));
            if (map2 == null) {
                map2 = new HashMap();
                map.put(Integer.valueOf(wVar3.f13538a), map2);
            }
            Map map3 = (Map) map2.get(Integer.valueOf(wVar3.f13539b));
            if (map3 == null) {
                map3 = new HashMap();
                map2.put(Integer.valueOf(wVar3.f13539b), map3);
            }
            map3.put(Integer.valueOf(wVar3.f13540c), wVar3.f13544g);
        }
        int i12 = 4;
        int i13 = 4;
        while (true) {
            if (i13 >= 0) {
                if (b(1, 0, i13, 0) != null) {
                    break;
                } else {
                    i13--;
                }
            } else if (b(1, 3, 1, 1033) == null) {
                b(1, 1, 0, 0);
            }
        }
        while (true) {
            if (i12 >= 0) {
                if (b(2, 0, i12, 0) != null) {
                    break;
                } else {
                    i12--;
                }
            } else if (b(2, 3, 1, 1033) == null) {
                b(2, 1, 0, 0);
            }
        }
        String b2 = b(6, 1, 0, 0);
        this.f13547h = b2;
        if (b2 == null) {
            this.f13547h = b(6, 3, 1, 1033);
        }
        String str = this.f13547h;
        if (str != null) {
            this.f13547h = str.trim();
        }
        this.f13472d = true;
    }

    public final String b(int i3, int i10, int i11, int i12) {
        Map map;
        Map map2;
        Map map3 = (Map) this.f13546g.get(Integer.valueOf(i3));
        if (map3 == null || (map = (Map) map3.get(Integer.valueOf(i10))) == null || (map2 = (Map) map.get(Integer.valueOf(i11))) == null) {
            return null;
        }
        return (String) map2.get(Integer.valueOf(i12));
    }
}
