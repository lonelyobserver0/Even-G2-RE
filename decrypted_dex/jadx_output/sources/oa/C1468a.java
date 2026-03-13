package oa;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: oa.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1468a extends AbstractC1469b implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18393a = new ArrayList();

    public final int F(int i3, int i10) {
        ArrayList arrayList = this.f18393a;
        if (i3 < arrayList.size()) {
            Object obj = arrayList.get(i3);
            if (obj instanceof l) {
                return ((l) obj).F();
            }
        }
        return i10;
    }

    public final AbstractC1469b G(int i3) {
        AbstractC1469b abstractC1469b = (AbstractC1469b) this.f18393a.get(i3);
        if (abstractC1469b instanceof m) {
            abstractC1469b = ((m) abstractC1469b).f18629a;
        }
        if (abstractC1469b instanceof k) {
            return null;
        }
        return abstractC1469b;
    }

    public final AbstractC1469b H(int i3) {
        return (AbstractC1469b) this.f18393a.remove(i3);
    }

    public final boolean I(AbstractC1469b abstractC1469b) {
        return this.f18393a.remove(abstractC1469b);
    }

    public final void J(int i3, AbstractC1469b abstractC1469b) {
        this.f18393a.set(i3, abstractC1469b);
    }

    public final float[] K() {
        int size = this.f18393a.size();
        float[] fArr = new float[size];
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC1469b G4 = G(i3);
            fArr[i3] = G4 instanceof l ? ((l) G4).a() : 0.0f;
        }
        return fArr;
    }

    public final void a(AbstractC1469b abstractC1469b) {
        this.f18393a.add(abstractC1469b);
    }

    public final AbstractC1469b d(int i3) {
        return (AbstractC1469b) this.f18393a.get(i3);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f18393a.iterator();
    }

    public final String toString() {
        return StubApp.getString2(21623) + this.f18393a + StubApp.getString2(265);
    }
}
