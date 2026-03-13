package n;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: n.d0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1332d0 {

    /* renamed from: a, reason: collision with root package name */
    public int f17509a = 0;

    /* renamed from: b, reason: collision with root package name */
    public float f17510b = -1.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f17511c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f17512d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public int[] f17513e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public boolean f17514f = false;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f17515g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f17516h;

    static {
        new RectF();
        new ConcurrentHashMap();
    }

    public C1332d0(TextView textView) {
        this.f17515g = textView;
        this.f17516h = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            new C1328b0();
        } else {
            new C1326a0();
        }
    }

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i3 : iArr) {
                if (i3 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i3)) < 0) {
                    arrayList.add(Integer.valueOf(i3));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i10 = 0; i10 < size; i10++) {
                    iArr2[i10] = ((Integer) arrayList.get(i10)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public final boolean b() {
        return !(this.f17515g instanceof C1369w);
    }
}
