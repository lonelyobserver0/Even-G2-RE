package I4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3194b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Matrix f3195c;

    public l(ArrayList arrayList, Matrix matrix) {
        this.f3194b = arrayList;
        this.f3195c = matrix;
    }

    @Override // I4.r
    public final void a(Matrix matrix, H4.a aVar, int i3, Canvas canvas) {
        Iterator it = this.f3194b.iterator();
        while (it.hasNext()) {
            ((r) it.next()).a(this.f3195c, aVar, i3, canvas);
        }
    }
}
