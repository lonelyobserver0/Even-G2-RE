package Ea;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import oa.AbstractC1469b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2118a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2119b;

    /* renamed from: c, reason: collision with root package name */
    public IdentityHashMap f2120c;

    /* renamed from: d, reason: collision with root package name */
    public Ia.b f2121d;

    /* renamed from: e, reason: collision with root package name */
    public d f2122e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC1469b f2123f;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        try {
            b bVar = (b) super.clone();
            bVar.f2122e = this.f2122e.clone();
            bVar.f2121d = this.f2121d.clone();
            bVar.f2119b = this.f2119b;
            bVar.f2120c = this.f2120c;
            bVar.f2118a = false;
            return bVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }
}
