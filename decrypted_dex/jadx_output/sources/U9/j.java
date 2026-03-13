package U9;

import D5.B;
import android.database.Cursor;
import android.util.Log;
import com.stub.StubApp;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7530a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MethodCall f7531b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f7532c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f7533d;

    public /* synthetic */ j(d dVar, MethodCall methodCall, MethodChannel.Result result) {
        this.f7530a = 6;
        this.f7533d = dVar;
        this.f7531b = methodCall;
        this.f7532c = result;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        char c10;
        final int i3 = 3;
        final int i10 = 2;
        final int i11 = 1;
        final int i12 = 0;
        MethodChannel.Result result = this.f7532c;
        MethodCall methodCall = this.f7531b;
        final d dVar = this.f7533d;
        switch (this.f7530a) {
            case 0:
                HashMap hashMap = n.f7549c;
                final V9.c cVar = new V9.c(methodCall, result);
                dVar.l(cVar, new Runnable() { // from class: U9.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                d dVar2 = dVar;
                                String string2 = StubApp.getString2(6383);
                                V9.c cVar2 = cVar;
                                MethodCall methodCall2 = cVar2.f7911d;
                                String string22 = StubApp.getString2(6384);
                                Integer num = (Integer) methodCall2.argument(string22);
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(methodCall2.argument(StubApp.getString2(6385)));
                                if (a.a(dVar2.f7503d)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(dVar2.h());
                                    sb2.append(StubApp.getString2(6386));
                                    sb2.append(intValue);
                                    sb2.append(equals ? StubApp.getString2(6387) : StubApp.getString2(6388));
                                    Log.d(StubApp.getString2(6389), sb2.toString());
                                }
                                HashMap hashMap2 = dVar2.f7506g;
                                i iVar = null;
                                if (equals) {
                                    i iVar2 = (i) hashMap2.get(num);
                                    if (iVar2 != null) {
                                        dVar2.b(iVar2);
                                    }
                                    cVar2.d(null);
                                    return;
                                }
                                i iVar3 = (i) hashMap2.get(num);
                                boolean z2 = false;
                                try {
                                    try {
                                        if (iVar3 == null) {
                                            throw new IllegalStateException(string2 + intValue + StubApp.getString2("6390"));
                                        }
                                        Cursor cursor = iVar3.f7529c;
                                        HashMap c11 = d.c(cursor, Integer.valueOf(iVar3.f7528b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z2 = true;
                                        }
                                        if (z2) {
                                            c11.put(string22, num);
                                        }
                                        cVar2.d(c11);
                                        if (z2) {
                                            return;
                                        }
                                        dVar2.b(iVar3);
                                        return;
                                    } catch (Exception e10) {
                                        dVar2.i(e10, cVar2);
                                        if (iVar3 != null) {
                                            dVar2.b(iVar3);
                                        } else {
                                            iVar = iVar3;
                                        }
                                        if (0 != 0 || iVar == null) {
                                            return;
                                        }
                                        dVar2.b(iVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && iVar3 != null) {
                                        dVar2.b(iVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                dVar.e(cVar);
                                return;
                            case 2:
                                dVar.f(cVar);
                                return;
                            case 3:
                                dVar.d(cVar);
                                return;
                            default:
                                d dVar3 = dVar;
                                hc.b bVar = cVar;
                                Object u2 = bVar.u(StubApp.getString2(6381));
                                Boolean bool = u2 instanceof Boolean ? (Boolean) u2 : null;
                                boolean equals2 = Boolean.TRUE.equals(bool);
                                String string23 = StubApp.getString2(6382);
                                boolean z10 = equals2 && bVar.J() && ((Integer) bVar.u(string23)) == null;
                                if (z10) {
                                    int i13 = dVar3.f7509k + 1;
                                    dVar3.f7509k = i13;
                                    dVar3.f7510l = Integer.valueOf(i13);
                                }
                                if (!dVar3.g(bVar)) {
                                    if (z10) {
                                        dVar3.f7510l = null;
                                        return;
                                    }
                                    return;
                                } else if (z10) {
                                    HashMap hashMap3 = new HashMap();
                                    hashMap3.put(string23, dVar3.f7510l);
                                    bVar.d(hashMap3);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        dVar3.f7510l = null;
                                    }
                                    bVar.d(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                HashMap hashMap2 = n.f7549c;
                final V9.c cVar2 = new V9.c(methodCall, result);
                dVar.l(cVar2, new Runnable() { // from class: U9.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                d dVar2 = dVar;
                                String string2 = StubApp.getString2(6383);
                                V9.c cVar22 = cVar2;
                                MethodCall methodCall2 = cVar22.f7911d;
                                String string22 = StubApp.getString2(6384);
                                Integer num = (Integer) methodCall2.argument(string22);
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(methodCall2.argument(StubApp.getString2(6385)));
                                if (a.a(dVar2.f7503d)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(dVar2.h());
                                    sb2.append(StubApp.getString2(6386));
                                    sb2.append(intValue);
                                    sb2.append(equals ? StubApp.getString2(6387) : StubApp.getString2(6388));
                                    Log.d(StubApp.getString2(6389), sb2.toString());
                                }
                                HashMap hashMap22 = dVar2.f7506g;
                                i iVar = null;
                                if (equals) {
                                    i iVar2 = (i) hashMap22.get(num);
                                    if (iVar2 != null) {
                                        dVar2.b(iVar2);
                                    }
                                    cVar22.d(null);
                                    return;
                                }
                                i iVar3 = (i) hashMap22.get(num);
                                boolean z2 = false;
                                try {
                                    try {
                                        if (iVar3 == null) {
                                            throw new IllegalStateException(string2 + intValue + StubApp.getString2("6390"));
                                        }
                                        Cursor cursor = iVar3.f7529c;
                                        HashMap c11 = d.c(cursor, Integer.valueOf(iVar3.f7528b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z2 = true;
                                        }
                                        if (z2) {
                                            c11.put(string22, num);
                                        }
                                        cVar22.d(c11);
                                        if (z2) {
                                            return;
                                        }
                                        dVar2.b(iVar3);
                                        return;
                                    } catch (Exception e10) {
                                        dVar2.i(e10, cVar22);
                                        if (iVar3 != null) {
                                            dVar2.b(iVar3);
                                        } else {
                                            iVar = iVar3;
                                        }
                                        if (0 != 0 || iVar == null) {
                                            return;
                                        }
                                        dVar2.b(iVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && iVar3 != null) {
                                        dVar2.b(iVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                dVar.e(cVar2);
                                return;
                            case 2:
                                dVar.f(cVar2);
                                return;
                            case 3:
                                dVar.d(cVar2);
                                return;
                            default:
                                d dVar3 = dVar;
                                hc.b bVar = cVar2;
                                Object u2 = bVar.u(StubApp.getString2(6381));
                                Boolean bool = u2 instanceof Boolean ? (Boolean) u2 : null;
                                boolean equals2 = Boolean.TRUE.equals(bool);
                                String string23 = StubApp.getString2(6382);
                                boolean z10 = equals2 && bVar.J() && ((Integer) bVar.u(string23)) == null;
                                if (z10) {
                                    int i13 = dVar3.f7509k + 1;
                                    dVar3.f7509k = i13;
                                    dVar3.f7510l = Integer.valueOf(i13);
                                }
                                if (!dVar3.g(bVar)) {
                                    if (z10) {
                                        dVar3.f7510l = null;
                                        return;
                                    }
                                    return;
                                } else if (z10) {
                                    HashMap hashMap3 = new HashMap();
                                    hashMap3.put(string23, dVar3.f7510l);
                                    bVar.d(hashMap3);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        dVar3.f7510l = null;
                                    }
                                    bVar.d(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 2:
                HashMap hashMap3 = n.f7549c;
                final V9.c cVar3 = new V9.c(methodCall, result);
                dVar.l(cVar3, new Runnable() { // from class: U9.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                d dVar2 = dVar;
                                String string2 = StubApp.getString2(6383);
                                V9.c cVar22 = cVar3;
                                MethodCall methodCall2 = cVar22.f7911d;
                                String string22 = StubApp.getString2(6384);
                                Integer num = (Integer) methodCall2.argument(string22);
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(methodCall2.argument(StubApp.getString2(6385)));
                                if (a.a(dVar2.f7503d)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(dVar2.h());
                                    sb2.append(StubApp.getString2(6386));
                                    sb2.append(intValue);
                                    sb2.append(equals ? StubApp.getString2(6387) : StubApp.getString2(6388));
                                    Log.d(StubApp.getString2(6389), sb2.toString());
                                }
                                HashMap hashMap22 = dVar2.f7506g;
                                i iVar = null;
                                if (equals) {
                                    i iVar2 = (i) hashMap22.get(num);
                                    if (iVar2 != null) {
                                        dVar2.b(iVar2);
                                    }
                                    cVar22.d(null);
                                    return;
                                }
                                i iVar3 = (i) hashMap22.get(num);
                                boolean z2 = false;
                                try {
                                    try {
                                        if (iVar3 == null) {
                                            throw new IllegalStateException(string2 + intValue + StubApp.getString2("6390"));
                                        }
                                        Cursor cursor = iVar3.f7529c;
                                        HashMap c11 = d.c(cursor, Integer.valueOf(iVar3.f7528b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z2 = true;
                                        }
                                        if (z2) {
                                            c11.put(string22, num);
                                        }
                                        cVar22.d(c11);
                                        if (z2) {
                                            return;
                                        }
                                        dVar2.b(iVar3);
                                        return;
                                    } catch (Exception e10) {
                                        dVar2.i(e10, cVar22);
                                        if (iVar3 != null) {
                                            dVar2.b(iVar3);
                                        } else {
                                            iVar = iVar3;
                                        }
                                        if (0 != 0 || iVar == null) {
                                            return;
                                        }
                                        dVar2.b(iVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && iVar3 != null) {
                                        dVar2.b(iVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                dVar.e(cVar3);
                                return;
                            case 2:
                                dVar.f(cVar3);
                                return;
                            case 3:
                                dVar.d(cVar3);
                                return;
                            default:
                                d dVar3 = dVar;
                                hc.b bVar = cVar3;
                                Object u2 = bVar.u(StubApp.getString2(6381));
                                Boolean bool = u2 instanceof Boolean ? (Boolean) u2 : null;
                                boolean equals2 = Boolean.TRUE.equals(bool);
                                String string23 = StubApp.getString2(6382);
                                boolean z10 = equals2 && bVar.J() && ((Integer) bVar.u(string23)) == null;
                                if (z10) {
                                    int i13 = dVar3.f7509k + 1;
                                    dVar3.f7509k = i13;
                                    dVar3.f7510l = Integer.valueOf(i13);
                                }
                                if (!dVar3.g(bVar)) {
                                    if (z10) {
                                        dVar3.f7510l = null;
                                        return;
                                    }
                                    return;
                                } else if (z10) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put(string23, dVar3.f7510l);
                                    bVar.d(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        dVar3.f7510l = null;
                                    }
                                    bVar.d(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 3:
                HashMap hashMap4 = n.f7549c;
                try {
                    dVar.f7508i.setLocale(Locale.forLanguageTag((String) methodCall.argument(StubApp.getString2(222))));
                    result.success(null);
                    break;
                } catch (Exception e10) {
                    result.error(StubApp.getString2(1340), StubApp.getString2(6420) + e10.getMessage(), null);
                    return;
                }
            case 4:
                HashMap hashMap5 = n.f7549c;
                final V9.c cVar4 = new V9.c(methodCall, result);
                final int i13 = 4;
                dVar.l(cVar4, new Runnable() { // from class: U9.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                d dVar2 = dVar;
                                String string2 = StubApp.getString2(6383);
                                V9.c cVar22 = cVar4;
                                MethodCall methodCall2 = cVar22.f7911d;
                                String string22 = StubApp.getString2(6384);
                                Integer num = (Integer) methodCall2.argument(string22);
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(methodCall2.argument(StubApp.getString2(6385)));
                                if (a.a(dVar2.f7503d)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(dVar2.h());
                                    sb2.append(StubApp.getString2(6386));
                                    sb2.append(intValue);
                                    sb2.append(equals ? StubApp.getString2(6387) : StubApp.getString2(6388));
                                    Log.d(StubApp.getString2(6389), sb2.toString());
                                }
                                HashMap hashMap22 = dVar2.f7506g;
                                i iVar = null;
                                if (equals) {
                                    i iVar2 = (i) hashMap22.get(num);
                                    if (iVar2 != null) {
                                        dVar2.b(iVar2);
                                    }
                                    cVar22.d(null);
                                    return;
                                }
                                i iVar3 = (i) hashMap22.get(num);
                                boolean z2 = false;
                                try {
                                    try {
                                        if (iVar3 == null) {
                                            throw new IllegalStateException(string2 + intValue + StubApp.getString2("6390"));
                                        }
                                        Cursor cursor = iVar3.f7529c;
                                        HashMap c11 = d.c(cursor, Integer.valueOf(iVar3.f7528b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z2 = true;
                                        }
                                        if (z2) {
                                            c11.put(string22, num);
                                        }
                                        cVar22.d(c11);
                                        if (z2) {
                                            return;
                                        }
                                        dVar2.b(iVar3);
                                        return;
                                    } catch (Exception e102) {
                                        dVar2.i(e102, cVar22);
                                        if (iVar3 != null) {
                                            dVar2.b(iVar3);
                                        } else {
                                            iVar = iVar3;
                                        }
                                        if (0 != 0 || iVar == null) {
                                            return;
                                        }
                                        dVar2.b(iVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && iVar3 != null) {
                                        dVar2.b(iVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                dVar.e(cVar4);
                                return;
                            case 2:
                                dVar.f(cVar4);
                                return;
                            case 3:
                                dVar.d(cVar4);
                                return;
                            default:
                                d dVar3 = dVar;
                                hc.b bVar = cVar4;
                                Object u2 = bVar.u(StubApp.getString2(6381));
                                Boolean bool = u2 instanceof Boolean ? (Boolean) u2 : null;
                                boolean equals2 = Boolean.TRUE.equals(bool);
                                String string23 = StubApp.getString2(6382);
                                boolean z10 = equals2 && bVar.J() && ((Integer) bVar.u(string23)) == null;
                                if (z10) {
                                    int i132 = dVar3.f7509k + 1;
                                    dVar3.f7509k = i132;
                                    dVar3.f7510l = Integer.valueOf(i132);
                                }
                                if (!dVar3.g(bVar)) {
                                    if (z10) {
                                        dVar3.f7510l = null;
                                        return;
                                    }
                                    return;
                                } else if (z10) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put(string23, dVar3.f7510l);
                                    bVar.d(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        dVar3.f7510l = null;
                                    }
                                    bVar.d(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 5:
                HashMap hashMap6 = n.f7549c;
                final V9.c cVar5 = new V9.c(methodCall, result);
                dVar.l(cVar5, new Runnable() { // from class: U9.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                d dVar2 = dVar;
                                String string2 = StubApp.getString2(6383);
                                V9.c cVar22 = cVar5;
                                MethodCall methodCall2 = cVar22.f7911d;
                                String string22 = StubApp.getString2(6384);
                                Integer num = (Integer) methodCall2.argument(string22);
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(methodCall2.argument(StubApp.getString2(6385)));
                                if (a.a(dVar2.f7503d)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(dVar2.h());
                                    sb2.append(StubApp.getString2(6386));
                                    sb2.append(intValue);
                                    sb2.append(equals ? StubApp.getString2(6387) : StubApp.getString2(6388));
                                    Log.d(StubApp.getString2(6389), sb2.toString());
                                }
                                HashMap hashMap22 = dVar2.f7506g;
                                i iVar = null;
                                if (equals) {
                                    i iVar2 = (i) hashMap22.get(num);
                                    if (iVar2 != null) {
                                        dVar2.b(iVar2);
                                    }
                                    cVar22.d(null);
                                    return;
                                }
                                i iVar3 = (i) hashMap22.get(num);
                                boolean z2 = false;
                                try {
                                    try {
                                        if (iVar3 == null) {
                                            throw new IllegalStateException(string2 + intValue + StubApp.getString2("6390"));
                                        }
                                        Cursor cursor = iVar3.f7529c;
                                        HashMap c11 = d.c(cursor, Integer.valueOf(iVar3.f7528b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z2 = true;
                                        }
                                        if (z2) {
                                            c11.put(string22, num);
                                        }
                                        cVar22.d(c11);
                                        if (z2) {
                                            return;
                                        }
                                        dVar2.b(iVar3);
                                        return;
                                    } catch (Exception e102) {
                                        dVar2.i(e102, cVar22);
                                        if (iVar3 != null) {
                                            dVar2.b(iVar3);
                                        } else {
                                            iVar = iVar3;
                                        }
                                        if (0 != 0 || iVar == null) {
                                            return;
                                        }
                                        dVar2.b(iVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && iVar3 != null) {
                                        dVar2.b(iVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                dVar.e(cVar5);
                                return;
                            case 2:
                                dVar.f(cVar5);
                                return;
                            case 3:
                                dVar.d(cVar5);
                                return;
                            default:
                                d dVar3 = dVar;
                                hc.b bVar = cVar5;
                                Object u2 = bVar.u(StubApp.getString2(6381));
                                Boolean bool = u2 instanceof Boolean ? (Boolean) u2 : null;
                                boolean equals2 = Boolean.TRUE.equals(bool);
                                String string23 = StubApp.getString2(6382);
                                boolean z10 = equals2 && bVar.J() && ((Integer) bVar.u(string23)) == null;
                                if (z10) {
                                    int i132 = dVar3.f7509k + 1;
                                    dVar3.f7509k = i132;
                                    dVar3.f7510l = Integer.valueOf(i132);
                                }
                                if (!dVar3.g(bVar)) {
                                    if (z10) {
                                        dVar3.f7510l = null;
                                        return;
                                    }
                                    return;
                                } else if (z10) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put(string23, dVar3.f7510l);
                                    bVar.d(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        dVar3.f7510l = null;
                                    }
                                    bVar.d(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                HashMap hashMap7 = n.f7549c;
                boolean equals = Boolean.TRUE.equals(methodCall.argument(StubApp.getString2(6411)));
                boolean equals2 = Boolean.TRUE.equals(methodCall.argument(StubApp.getString2(6412)));
                List list = (List) methodCall.argument(StubApp.getString2(6413));
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    V9.a aVar = new V9.a((Map) it.next(), equals);
                    String C10 = aVar.C();
                    C10.getClass();
                    B b2 = aVar.f7907d;
                    switch (C10.hashCode()) {
                        case -1319569547:
                            if (C10.equals(StubApp.getString2(6416))) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1183792455:
                            if (C10.equals(StubApp.getString2(6415))) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -838846263:
                            if (C10.equals(StubApp.getString2(6414))) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 107944136:
                            if (C10.equals(StubApp.getString2(2268))) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    switch (c10) {
                        case 0:
                            if (!dVar.g(aVar)) {
                                if (!equals2) {
                                    result.error((String) b2.f1340a, (String) b2.f1342c, (HashMap) b2.f1343d);
                                    break;
                                } else {
                                    aVar.Y(arrayList);
                                    break;
                                }
                            } else {
                                aVar.d(null);
                                aVar.Z(arrayList);
                                break;
                            }
                        case 1:
                            if (!dVar.d(aVar)) {
                                if (!equals2) {
                                    result.error((String) b2.f1340a, (String) b2.f1342c, (HashMap) b2.f1343d);
                                    break;
                                } else {
                                    aVar.Y(arrayList);
                                    break;
                                }
                            } else {
                                aVar.Z(arrayList);
                                break;
                            }
                        case 2:
                            if (!dVar.f(aVar)) {
                                if (!equals2) {
                                    result.error((String) b2.f1340a, (String) b2.f1342c, (HashMap) b2.f1343d);
                                    break;
                                } else {
                                    aVar.Y(arrayList);
                                    break;
                                }
                            } else {
                                aVar.Z(arrayList);
                                break;
                            }
                        case 3:
                            if (!dVar.e(aVar)) {
                                if (!equals2) {
                                    result.error((String) b2.f1340a, (String) b2.f1342c, (HashMap) b2.f1343d);
                                    break;
                                } else {
                                    aVar.Y(arrayList);
                                    break;
                                }
                            } else {
                                aVar.Z(arrayList);
                                break;
                            }
                        default:
                            result.error(StubApp.getString2(6419), E1.a.k(StubApp.getString2(6417), C10, StubApp.getString2(6418)), null);
                            break;
                    }
                }
                if (!equals) {
                    result.success(arrayList);
                    break;
                } else {
                    result.success(null);
                    break;
                }
        }
    }

    public /* synthetic */ j(MethodCall methodCall, d dVar, MethodChannel.Result result) {
        this.f7530a = 3;
        this.f7531b = methodCall;
        this.f7533d = dVar;
        this.f7532c = result;
    }

    public /* synthetic */ j(MethodCall methodCall, MethodChannel.Result result, d dVar, int i3) {
        this.f7530a = i3;
        this.f7531b = methodCall;
        this.f7532c = result;
        this.f7533d = dVar;
    }
}
