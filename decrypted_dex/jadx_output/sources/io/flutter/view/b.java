package io.flutter.view;

import android.app.Activity;
import android.opengl.Matrix;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import com.stub.StubApp;
import i2.u;
import io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b implements Ya.i, Ya.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f15099a;

    public /* synthetic */ b(Object obj) {
        this.f15099a = obj;
    }

    public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        int i3;
        PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate;
        ArrayList arrayList;
        int i10;
        h hVar;
        int i11;
        int i12;
        h hVar2;
        String str;
        String str2;
        float f10;
        float f11;
        View platformViewById;
        Integer num;
        boolean z2;
        int i13;
        WindowInsets rootWindowInsets;
        l lVar;
        View platformViewById2;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        }
        l lVar2 = (l) this.f15099a;
        lVar2.getClass();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            boolean hasRemaining = byteBuffer.hasRemaining();
            i3 = 16;
            platformViewsAccessibilityDelegate = lVar2.f15192e;
            if (!hasRemaining) {
                break;
            }
            h c10 = lVar2.c(byteBuffer.getInt());
            c10.f15134C = true;
            c10.f15140I = c10.f15174r;
            c10.f15141J = c10.f15172p;
            c10.f15135D = c10.f15160c;
            c10.f15136E = c10.f15161d;
            c10.f15137F = c10.f15164g;
            c10.f15138G = c10.f15165h;
            c10.f15139H = c10.f15168l;
            c10.f15160c = byteBuffer.getInt();
            c10.f15161d = byteBuffer.getInt();
            c10.f15162e = byteBuffer.getInt();
            c10.f15163f = byteBuffer.getInt();
            c10.f15164g = byteBuffer.getInt();
            c10.f15165h = byteBuffer.getInt();
            c10.f15166i = byteBuffer.getInt();
            c10.j = byteBuffer.getInt();
            c10.f15167k = byteBuffer.getInt();
            c10.f15168l = byteBuffer.getFloat();
            c10.f15169m = byteBuffer.getFloat();
            c10.f15170n = byteBuffer.getFloat();
            int i14 = byteBuffer.getInt();
            c10.f15171o = i14 == -1 ? null : strArr[i14];
            int i15 = byteBuffer.getInt();
            c10.f15172p = i15 == -1 ? null : strArr[i15];
            c10.f15173q = h.g(byteBuffer, byteBufferArr);
            int i16 = byteBuffer.getInt();
            c10.f15174r = i16 == -1 ? null : strArr[i16];
            c10.f15175s = h.g(byteBuffer, byteBufferArr);
            int i17 = byteBuffer.getInt();
            c10.f15176t = i17 == -1 ? null : strArr[i17];
            c10.f15177u = h.g(byteBuffer, byteBufferArr);
            int i18 = byteBuffer.getInt();
            c10.f15178v = i18 == -1 ? null : strArr[i18];
            c10.f15179w = h.g(byteBuffer, byteBufferArr);
            int i19 = byteBuffer.getInt();
            c10.f15180x = i19 == -1 ? null : strArr[i19];
            c10.f15181y = h.g(byteBuffer, byteBufferArr);
            int i20 = byteBuffer.getInt();
            c10.f15182z = i20 == -1 ? null : strArr[i20];
            int i21 = byteBuffer.getInt();
            c10.f15132A = i21 == -1 ? null : strArr[i21];
            byteBuffer.getInt();
            c10.f15142K = byteBuffer.getFloat();
            c10.f15143L = byteBuffer.getFloat();
            c10.f15144M = byteBuffer.getFloat();
            c10.f15145N = byteBuffer.getFloat();
            if (c10.f15146O == null) {
                c10.f15146O = new float[16];
            }
            for (int i22 = 0; i22 < 16; i22++) {
                c10.f15146O[i22] = byteBuffer.getFloat();
            }
            c10.f15153V = true;
            c10.f15155X = true;
            int i23 = byteBuffer.getInt();
            ArrayList arrayList3 = c10.f15148Q;
            arrayList3.clear();
            ArrayList arrayList4 = c10.f15149R;
            arrayList4.clear();
            int i24 = 0;
            while (true) {
                lVar = c10.f15158a;
                if (i24 >= i23) {
                    break;
                }
                h c11 = lVar.c(byteBuffer.getInt());
                c11.f15147P = c10;
                arrayList3.add(c11);
                i24++;
            }
            for (int i25 = 0; i25 < i23; i25++) {
                h c12 = lVar.c(byteBuffer.getInt());
                c12.f15147P = c10;
                arrayList4.add(c12);
            }
            int i26 = byteBuffer.getInt();
            if (i26 == 0) {
                c10.f15150S = null;
            } else {
                ArrayList arrayList5 = c10.f15150S;
                if (arrayList5 == null) {
                    c10.f15150S = new ArrayList(i26);
                } else {
                    arrayList5.clear();
                }
                for (int i27 = 0; i27 < i26; i27++) {
                    f b2 = lVar.b(byteBuffer.getInt());
                    int i28 = b2.f15128c;
                    if (i28 == 1) {
                        c10.f15151T = b2;
                    } else if (i28 == 2) {
                        c10.f15152U = b2;
                    } else {
                        c10.f15150S.add(b2);
                    }
                    c10.f15150S.add(b2);
                }
            }
            if (!c10.h(14)) {
                if (c10.h(6)) {
                    lVar2.f15199m = c10;
                }
                if (c10.f15134C) {
                    arrayList2.add(c10);
                }
                int i29 = c10.f15166i;
                if (i29 != -1 && !platformViewsAccessibilityDelegate.usesVirtualDisplay(i29) && (platformViewById2 = platformViewsAccessibilityDelegate.getPlatformViewById(c10.f15166i)) != null) {
                    platformViewById2.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        HashMap hashMap = lVar2.f15194g;
        h hVar3 = (h) hashMap.get(0);
        ArrayList arrayList6 = new ArrayList();
        View view = lVar2.f15188a;
        if (hVar3 != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            Activity o5 = a4.f.o(view.getContext());
            if (o5 == null || o5.getWindow() == null || (!((i13 = o5.getWindow().getAttributes().layoutInDisplayCutoutMode) == 2 || i13 == 0) || (rootWindowInsets = view.getRootWindowInsets()) == null)) {
                z2 = false;
            } else {
                if (!lVar2.f15204r.equals(Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft()))) {
                    hVar3.f15155X = true;
                    hVar3.f15153V = true;
                }
                int systemWindowInsetLeft = rootWindowInsets.getSystemWindowInsetLeft();
                lVar2.f15204r = Integer.valueOf(systemWindowInsetLeft);
                z2 = false;
                Matrix.translateM(fArr, 0, systemWindowInsetLeft, 0.0f, 0.0f);
            }
            hVar3.l(fArr, hashSet, z2);
            hVar3.c(arrayList6);
        }
        Iterator it = arrayList6.iterator();
        h hVar4 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = lVar2.f15202p;
            if (!hasNext) {
                break;
            }
            h hVar5 = (h) it.next();
            if (!arrayList.contains(Integer.valueOf(hVar5.f15159b))) {
                hVar4 = hVar5;
            }
        }
        if (hVar4 == null && arrayList6.size() > 0) {
            hVar4 = (h) u.j(1, arrayList6);
        }
        if (hVar4 != null && (hVar4.f15159b != lVar2.f15203q || arrayList6.size() != arrayList.size())) {
            lVar2.f15203q = hVar4.f15159b;
            String f12 = hVar4.f();
            if (f12 == null) {
                f12 = StubApp.getString2(397);
            }
            view.setAccessibilityPaneTitle(f12);
        }
        arrayList.clear();
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((h) it2.next()).f15159b));
        }
        Iterator it3 = hashMap.entrySet().iterator();
        while (true) {
            i10 = 4;
            if (!it3.hasNext()) {
                break;
            }
            h hVar6 = (h) ((Map.Entry) it3.next()).getValue();
            if (!hashSet.contains(hVar6)) {
                hVar6.f15147P = null;
                if (hVar6.f15166i != -1 && (num = lVar2.j) != null && lVar2.f15191d.platformViewOfNode(num.intValue()) == platformViewsAccessibilityDelegate.getPlatformViewById(hVar6.f15166i)) {
                    lVar2.g(lVar2.j.intValue(), PKIFailureInfo.notAuthorized);
                    lVar2.j = null;
                }
                int i30 = hVar6.f15166i;
                if (i30 != -1 && (platformViewById = platformViewsAccessibilityDelegate.getPlatformViewById(i30)) != null) {
                    platformViewById.setImportantForAccessibility(4);
                }
                h hVar7 = lVar2.f15196i;
                if (hVar7 == hVar6) {
                    lVar2.g(hVar7.f15159b, PKIFailureInfo.notAuthorized);
                    lVar2.f15196i = null;
                }
                if (lVar2.f15199m == hVar6) {
                    lVar2.f15199m = null;
                }
                if (lVar2.f15201o == hVar6) {
                    lVar2.f15201o = null;
                }
                it3.remove();
            }
        }
        int i31 = 2048;
        AccessibilityEvent d8 = lVar2.d(0, 2048);
        d8.setContentChangeTypes(1);
        lVar2.h(d8);
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            h hVar8 = (h) it4.next();
            if (!Float.isNaN(hVar8.f15168l) && !Float.isNaN(hVar8.f15139H) && hVar8.f15139H != hVar8.f15168l) {
                AccessibilityEvent d10 = lVar2.d(hVar8.f15159b, 4096);
                float f13 = hVar8.f15168l;
                float f14 = hVar8.f15169m;
                if (Float.isInfinite(f14)) {
                    if (f13 > 70000.0f) {
                        f13 = 70000.0f;
                    }
                    f14 = 100000.0f;
                }
                if (Float.isInfinite(hVar8.f15170n)) {
                    f10 = f14 + 100000.0f;
                    if (f13 < -70000.0f) {
                        f13 = -70000.0f;
                    }
                    f11 = f13 + 100000.0f;
                } else {
                    float f15 = hVar8.f15170n;
                    f10 = f14 - f15;
                    f11 = f13 - f15;
                }
                int i32 = hVar8.f15136E;
                if ((i32 & 16) != 0 || (i32 & 32) != 0) {
                    d10.setScrollY((int) f11);
                    d10.setMaxScrollY((int) f10);
                } else if ((i32 & 4) != 0 || (i32 & 8) != 0) {
                    d10.setScrollX((int) f11);
                    d10.setMaxScrollX((int) f10);
                }
                int i33 = hVar8.j;
                if (i33 > 0) {
                    d10.setItemCount(i33);
                    d10.setFromIndex(hVar8.f15167k);
                    Iterator it5 = hVar8.f15149R.iterator();
                    int i34 = 0;
                    while (it5.hasNext()) {
                        if (!((h) it5.next()).h(14)) {
                            i34++;
                        }
                    }
                    d10.setToIndex((hVar8.f15167k + i34) - 1);
                }
                lVar2.h(d10);
            }
            if (hVar8.h(i3) && (((str = hVar8.f15172p) != null || hVar8.f15141J != null) && (str == null || (str2 = hVar8.f15141J) == null || !str.equals(str2)))) {
                AccessibilityEvent d11 = lVar2.d(hVar8.f15159b, i31);
                d11.setContentChangeTypes(1);
                lVar2.h(d11);
            }
            h hVar9 = lVar2.f15196i;
            if (hVar9 != null && hVar9.f15159b == hVar8.f15159b && (hVar8.f15135D & u.b(3)) == 0 && hVar8.h(3)) {
                AccessibilityEvent d12 = lVar2.d(hVar8.f15159b, i10);
                d12.getText().add(hVar8.f15172p);
                lVar2.h(d12);
            }
            h hVar10 = lVar2.f15199m;
            if (hVar10 != null && (i11 = hVar10.f15159b) == (i12 = hVar8.f15159b) && ((hVar2 = lVar2.f15200n) == null || hVar2.f15159b != i11)) {
                lVar2.f15200n = hVar10;
                lVar2.h(lVar2.d(i12, 8));
            } else if (hVar10 == null) {
                lVar2.f15200n = null;
            }
            h hVar11 = lVar2.f15199m;
            if (hVar11 != null && hVar11.f15159b == hVar8.f15159b && (hVar8.f15135D & u.b(5)) != 0 && hVar8.h(5) && ((hVar = lVar2.f15196i) == null || hVar.f15159b == lVar2.f15199m.f15159b)) {
                String str3 = hVar8.f15140I;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = hVar8.f15174r;
                String str5 = str4 != null ? str4 : "";
                AccessibilityEvent d13 = lVar2.d(hVar8.f15159b, i3);
                d13.setBeforeText(str3);
                d13.getText().add(str5);
                int i35 = 0;
                while (i35 < str3.length() && i35 < str5.length() && str3.charAt(i35) == str5.charAt(i35)) {
                    i35++;
                }
                if (i35 < str3.length() || i35 < str5.length()) {
                    d13.setFromIndex(i35);
                    int length = str3.length() - 1;
                    int length2 = str5.length() - 1;
                    while (length >= i35 && length2 >= i35 && str3.charAt(length) == str5.charAt(length2)) {
                        length--;
                        length2--;
                    }
                    d13.setRemovedCount((length - i35) + 1);
                    d13.setAddedCount((length2 - i35) + 1);
                } else {
                    d13 = null;
                }
                if (d13 != null) {
                    lVar2.h(d13);
                }
                if (hVar8.f15137F != hVar8.f15164g || hVar8.f15138G != hVar8.f15165h) {
                    AccessibilityEvent d14 = lVar2.d(hVar8.f15159b, 8192);
                    d14.getText().add(str5);
                    d14.setFromIndex(hVar8.f15164g);
                    d14.setToIndex(hVar8.f15165h);
                    d14.setItemCount(str5.length());
                    lVar2.h(d14);
                }
            }
            i31 = 2048;
            i10 = 4;
            i3 = 16;
        }
    }
}
